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
package org.adempiere.webui.factory;

import org.osgi.service.component.annotations.Component;

/**
 * Default implementation of {@link AnnotationBasedFormFactory}
 * @author hengsin
 *
 */
@Component(immediate = true, service = IFormFactory.class, property = {"service.ranking:Integer=0"})
public final class DefaultAnnotationBasedFormFactory extends AnnotationBasedFormFactory {

	/**
	 * Default constructor
	 */
	public DefaultAnnotationBasedFormFactory() {
	}

	@Override
	protected String[] getPackages() {
		return new String[] {"org.adempiere.webui.apps.form", "org.adempiere.webui.apps.graph", "org.adempiere.webui.apps.wf",
							 "org.adempiere.webui.panel"};
	}

}
