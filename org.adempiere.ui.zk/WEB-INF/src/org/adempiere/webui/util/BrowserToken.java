/******************************************************************************
 * Copyright (C) 2009 Low Heng Sin                                            *
 * Copyright (C) 2009 Idalica Corporation                                     *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.adempiere.webui.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;

import org.apache.commons.codec.binary.Base64;
import org.compiere.Adempiere;
import org.compiere.model.MSession;
import org.compiere.model.MSystem;
import org.compiere.model.MUser;
import org.compiere.util.CLogger;
import org.zkoss.zk.au.out.AuScript;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.Clients;

/**
 * Class to manage browser token (store using local storage) for authentication
 * @author hengsin
 *
 */
public final class BrowserToken {

	private final static CLogger log = CLogger.getCLogger(BrowserToken.class);

	private BrowserToken() {}

	/**
	 * save session and user as client side token for future auto login
	 * @param session
	 * @param user
	 */
	public static void save(MSession session, MUser user) {
		try
		{
			String home = getHomeToken();
			String hash = getPasswordHash(session, user);
		    String script = "adempiere.saveUserToken('" + home + "', '" + hash + "', '" + session.getAD_Session_ID() + "');";
			AuScript aus = new AuScript(null, script);
			Clients.response("saveUserToken", aus);
		}
		catch (Exception e)
		{
			log.log(Level.WARNING, e.getLocalizedMessage(), e);
		}
	}

	/**
	 * remove client side token for login
	 */
	public static void remove() {
		try {
			String home = getHomeToken();
			String script = "adempiere.removeUserToken('" + home + "');";
			AuScript aus = new AuScript(null, script);
			Clients.response("removeUserToken", aus);
		} catch (Exception e) {
			log.log(Level.WARNING, e.getLocalizedMessage(), e);
		}
	}

	/**
	 * load stored client side token for login
	 * @param component
	 */
	public static void load(Component component) {
		//remember me
        try
        {
	        String home = getHomeToken();
			String script = "adempiere.findUserToken('" + component.getUuid() + "', '" + home + "');";
			AuScript aus = new AuScript(component, script);
			Clients.response("findUserToken", aus);
        }
        catch (Exception e)
        {
        	log.log(Level.WARNING, e.getLocalizedMessage(), e);
        }
	}

	/**
	 * validate a stored client side token is valid
	 * @param session
	 * @param user
	 * @param token
	 * @return true if token is valid
	 */
	public static boolean validateToken(MSession session, MUser user, String token) {
		try
		{
			String hash = getPasswordHash(session, user);
			return hash.equals(token);
		}
		catch (Exception e)
		{
			log.log(Level.WARNING, e.getLocalizedMessage(), e);
		}
		return false;
	}

	/**
	 * @return Base 64 encoded Ompiere home path
	 * @throws UnsupportedEncodingException
	 */
	private static String getHomeToken() throws UnsupportedEncodingException {
		String home = Adempiere.getAdempiereHome();
		Base64 encoder = new Base64();
		home = new String(encoder.encode(home.getBytes("UTF-8")), "UTF-8");
		home = URLEncoder.encode(home, "UTF-8");
		return home;
	}

	/**
	 * @param session
	 * @param user
	 * @return hashed user password (base 64 encoded)
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchAlgorithmException
	 */
	private static String getPasswordHash(MSession session, MUser user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-512");
		Base64 encoder = new Base64();
	    digest.reset();
	    if (session.getWebSession() != null)
	    	digest.update(session.getWebSession().getBytes("UTF-8"));
	    String password = null;
	    if (MSystem.isZKRememberPasswordAllowed())
	    	password = user.getPassword();
	    else
	    	password = new String("");
	    byte[] input = digest.digest(password.getBytes("UTF-8"));
	    String hash = new String(encoder.encode(input), "UTF-8");
	    hash = URLEncoder.encode(hash, "UTF-8");

	    return hash;
	}
}
