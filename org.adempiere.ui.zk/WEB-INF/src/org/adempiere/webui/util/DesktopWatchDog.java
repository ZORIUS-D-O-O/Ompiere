/***********************************************************************
 * This file is part of Ompiere ERP Open Source                      *
 * http://www.idempiere.org                                            *
 *                                                                     *
 * Copyright (C) Contributors                                          *
 *                                                                     *
 * This program is free software; you can redistribute it and/or       *
 * modify it under the terms of the GNU General Public License         *
 * as published by the Free Software Foundation; either version 2      *
 * of the License, or (at your option) any later version.              *
 *                                                                     *
 * This program is distributed in the hope that it will be useful,     *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of      *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
 * GNU General Public License for more details.                        *
 *                                                                     *
 * You should have received a copy of the GNU General Public License   *
 * along with this program; if not, write to the Free Software         *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
 * MA 02110-1301, USA.                                                 *
 *                                                                     *
 * Contributors:                                                       *
 * - hengsin                         								   *
 **********************************************************************/
package org.adempiere.webui.util;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

import org.compiere.Adempiere;
import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.sys.DesktopCache;
import org.zkoss.zk.ui.sys.DesktopCtrl;
import org.zkoss.zk.ui.sys.ServerPush;
import org.zkoss.zk.ui.sys.WebAppCtrl;

import fi.jawsy.jawwa.zk.atmosphere.AtmosphereServerPush;

/**
 * Watch for disconnected desktop and destroy it
 * @author hengsin
 */
public class DesktopWatchDog {

	/** singleton instance **/
	private final static DesktopWatchDog INSTANCE = new DesktopWatchDog();
	
	/** Desktops being watched **/
	private final ConcurrentLinkedDeque<DesktopEntry> desktops = new ConcurrentLinkedDeque<DesktopWatchDog.DesktopEntry>();
	
	/**
	 * default constructor
	 */
	private DesktopWatchDog() {
		//Check disconnected desktop every 40 seconds
		Adempiere.getThreadPoolExecutor().scheduleWithFixedDelay(() -> {
			doMonitoring();
		}, 60, 40, TimeUnit.SECONDS);
	}

	/**
	 * Check each entries in {@link #desktops}.
	 */
	private void doMonitoring() {
		Iterator<DesktopEntry> iterator = desktops.iterator();
		while (iterator.hasNext()) {
			DesktopEntry entry = iterator.next();
			//not active, remove from watch list
			if (!entry.desktop.isAlive()) {
				iterator.remove();
				continue;
			}
			if (entry.desktop.isServerPushEnabled() == false) {
				entry.noAtmosphereResourceCount++;
			}
			ServerPush spush = ((DesktopCtrl)entry.desktop).getServerPush();
			if (spush == null) {
				entry.noAtmosphereResourceCount++;
			} else if (spush instanceof AtmosphereServerPush) {
				AtmosphereServerPush asp = (AtmosphereServerPush) spush;
				if (!asp.hasAtmosphereResource())
					entry.noAtmosphereResourceCount++;
				else
					entry.noAtmosphereResourceCount=0;
			}			 
			if (entry.noAtmosphereResourceCount >= 5) {
				//no message from desktop for 5 consecutive run of doMonitoring.
				//remove desktop from DesktopCache.
				iterator.remove();
		        try {
		        	final WebApp wapp = entry.desktop.getWebApp();
		        	final Session session = entry.desktop.getSession();
		    	    final DesktopCache desktopCache = ((WebAppCtrl) wapp).getDesktopCache(session);
		    		desktopCache.removeDesktop(entry.desktop);
		    	} catch (Throwable t) {
		    		t.printStackTrace();
		    	}
			}
		}
	}

	private final static class DesktopEntry {		
		Desktop desktop;
		int noAtmosphereResourceCount = 0;
		
		private DesktopEntry(Desktop desktop) {
			this.desktop = desktop;
		}
	}
	
	/**
	 * Add desktop to watch list
	 * @param desktop
	 */
	public static void addDesktop(Desktop desktop) {
		INSTANCE.desktops.add(new DesktopEntry(desktop));
	}
	
	/**
	 * Remove desktop from watch list
	 * @param desktop
	 */
	public static void removeDesktop(Desktop desktop) {
		Iterator<DesktopEntry> iterator = INSTANCE.desktops.iterator();
		while (iterator.hasNext()) {
			DesktopEntry entry = iterator.next();
			if (entry.desktop == desktop) {
				iterator.remove();
				break;
			}
		}
	}
	
	/**
	 * Remove other desktops that share the same session with the pass in desktop parameter
	 * @param desktop
	 */
	public static void removeOtherDesktopsInSession(Desktop desktop) {
		Iterator<DesktopEntry> iterator = INSTANCE.desktops.iterator();
		while (iterator.hasNext()) {
			DesktopEntry entry = iterator.next();
			if (entry.desktop == desktop)
				continue;
			if (entry.desktop.getSession() != desktop.getSession())
				continue;
			
			iterator.remove();
	        try {
	        	final WebApp wapp = desktop.getWebApp();
	        	final Session session = desktop.getSession();
	    	    final DesktopCache desktopCache = ((WebAppCtrl) wapp).getDesktopCache(session);
	    		desktopCache.removeDesktop(entry.desktop);
	    	} catch (Throwable t) {
	    		t.printStackTrace();
	    	}
		}
	}
}
