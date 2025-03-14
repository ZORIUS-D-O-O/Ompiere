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
 **********************************************************************/
package org.idempiere.print.renderer;

import java.io.File;

import org.compiere.util.Language;

/**
 * Configuration for excel open xml (xlsx) content renderer
 */
public class XLSXReportRendererConfiguration implements IReportRendererConfiguration {

	public static final String ID = "XLSX";
	public static final String FILE_EXTENSION = "xlsx";
	
	private File file;
	private Language language;
		
	public XLSXReportRendererConfiguration() {
	}

	@Override	
	public File getOutputFile() {
		return file;
	}

	/**
	 * Set output file
	 * @param file
	 */
	public XLSXReportRendererConfiguration setOutputFile(File file) {
		this.file = file;
		return this;
	}

	/**
	 * Set content language
	 * @param language
	 */
	public XLSXReportRendererConfiguration setLanguage(Language language) {
		this.language = language;
		return this;
	}

	/**
	 * Get content language
	 * @return content language
	 */
	public Language getLanguage() {
		return language;
	}
}
