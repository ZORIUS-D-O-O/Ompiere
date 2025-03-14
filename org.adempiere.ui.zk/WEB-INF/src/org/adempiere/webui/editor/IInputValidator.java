/**********************************************************************
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
* - Peter Takacs, Cloudempiere                                        *
**********************************************************************/
package org.adempiere.webui.editor;

/**
 * Interface to validate the input of editors
 * @author Peter Takacs, Cloudempiere
 *
 */
public interface IInputValidator {
	
	/**
	 * Get text for input validation
	 * @return Expected input string from user
	 */
	public String getValidInput();
	
	/**
	 * Set string to validate against user input
	 * @param validInput
	 */
	public void setValidInput(String validInput);
	
	/**
	 * Is Input Valid 
	 * @param input
	 * @return true if input validate against {@link #getValidInput()}
	 */
	public boolean isValid(String input);
}
