/******************************************************************************
 * Product: Ompiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for PA_DashboardContent
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_PA_DashboardContent 
{

    /** TableName=PA_DashboardContent */
    public static final String Table_Name = "PA_DashboardContent";

    /** AD_Table_ID=50010 */
    public static final int Table_ID = 50010;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Chart_ID */
    public static final String COLUMNNAME_AD_Chart_ID = "AD_Chart_ID";

	/** Set Chart	  */
	public void setAD_Chart_ID (int AD_Chart_ID);

	/** Get Chart	  */
	public int getAD_Chart_ID();

	public org.compiere.model.I_AD_Chart getAD_Chart() throws RuntimeException;

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name AD_PrintFormat_ID */
    public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";

	/** Set Print Format.
	  * Data Print Format
	  */
	public void setAD_PrintFormat_ID (int AD_PrintFormat_ID);

	/** Get Print Format.
	  * Data Print Format
	  */
	public int getAD_PrintFormat_ID();

	public org.compiere.model.I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException;

    /** Column name AD_Process_ID */
    public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";

	/** Set Process.
	  * Process or Report
	  */
	public void setAD_Process_ID (int AD_Process_ID);

	/** Get Process.
	  * Process or Report
	  */
	public int getAD_Process_ID();

	public org.compiere.model.I_AD_Process getAD_Process() throws RuntimeException;

    /** Column name AD_Role_ID */
    public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";

	/** Set Role.
	  * Responsibility Role
	  */
	public void setAD_Role_ID (int AD_Role_ID);

	/** Get Role.
	  * Responsibility Role
	  */
	public int getAD_Role_ID();

	public org.compiere.model.I_AD_Role getAD_Role() throws RuntimeException;

    /** Column name AD_StatusLine_ID */
    public static final String COLUMNNAME_AD_StatusLine_ID = "AD_StatusLine_ID";

	/** Set Status Line	  */
	public void setAD_StatusLine_ID (int AD_StatusLine_ID);

	/** Get Status Line	  */
	public int getAD_StatusLine_ID();

	public org.compiere.model.I_AD_StatusLine getAD_StatusLine() throws RuntimeException;

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name AD_Window_ID */
    public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";

	/** Set Window.
	  * Data entry or display window
	  */
	public void setAD_Window_ID (int AD_Window_ID);

	/** Get Window.
	  * Data entry or display window
	  */
	public int getAD_Window_ID();

	public org.compiere.model.I_AD_Window getAD_Window() throws RuntimeException;

    /** Column name ColumnNo */
    public static final String COLUMNNAME_ColumnNo = "ColumnNo";

	/** Set Column No.
	  * Dashboard content column number
	  */
	public void setColumnNo (int ColumnNo);

	/** Get Column No.
	  * Dashboard content column number
	  */
	public int getColumnNo();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name GoalDisplay */
    public static final String COLUMNNAME_GoalDisplay = "GoalDisplay";

	/** Set Goal Display.
	  * Type of goal display on dashboard
	  */
	public void setGoalDisplay (String GoalDisplay);

	/** Get Goal Display.
	  * Type of goal display on dashboard
	  */
	public String getGoalDisplay();

    /** Column name HTML */
    public static final String COLUMNNAME_HTML = "HTML";

	/** Set HTML	  */
	public void setHTML (String HTML);

	/** Get HTML	  */
	public String getHTML();

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsCollapsedByDefault */
    public static final String COLUMNNAME_IsCollapsedByDefault = "IsCollapsedByDefault";

	/** Set Collapsed By Default.
	  * Flag to set the initial state of collapsible field group.
	  */
	public void setIsCollapsedByDefault (boolean IsCollapsedByDefault);

	/** Get Collapsed By Default.
	  * Flag to set the initial state of collapsible field group.
	  */
	public boolean isCollapsedByDefault();

    /** Column name IsCollapsible */
    public static final String COLUMNNAME_IsCollapsible = "IsCollapsible";

	/** Set Collapsible.
	  * Flag to indicate the state of the dashboard panel
	  */
	public void setIsCollapsible (boolean IsCollapsible);

	/** Get Collapsible.
	  * Flag to indicate the state of the dashboard panel
	  */
	public boolean isCollapsible();

    /** Column name IsEmbedReportContent */
    public static final String COLUMNNAME_IsEmbedReportContent = "IsEmbedReportContent";

	/** Set Embed Report Content.
	  * Embed report content into dashboard
	  */
	public void setIsEmbedReportContent (boolean IsEmbedReportContent);

	/** Get Embed Report Content.
	  * Embed report content into dashboard
	  */
	public boolean isEmbedReportContent();

    /** Column name IsMaximizable */
    public static final String COLUMNNAME_IsMaximizable = "IsMaximizable";

	/** Set Maximizable	  */
	public void setIsMaximizable (boolean IsMaximizable);

	/** Get Maximizable	  */
	public boolean isMaximizable();

    /** Column name IsShowInDashboard */
    public static final String COLUMNNAME_IsShowInDashboard = "IsShowInDashboard";

	/** Set Show in Dashboard.
	  * Show the dashlet in the dashboard
	  */
	public void setIsShowInDashboard (boolean IsShowInDashboard);

	/** Get Show in Dashboard.
	  * Show the dashlet in the dashboard
	  */
	public boolean isShowInDashboard();

    /** Column name IsShowTitle */
    public static final String COLUMNNAME_IsShowTitle = "IsShowTitle";

	/** Set Show Title	  */
	public void setIsShowTitle (boolean IsShowTitle);

	/** Get Show Title	  */
	public boolean isShowTitle();

    /** Column name IsShowinLogin */
    public static final String COLUMNNAME_IsShowinLogin = "IsShowinLogin";

	/** Set Show on Login	  */
	public void setIsShowinLogin (boolean IsShowinLogin);

	/** Get Show on Login	  */
	public boolean isShowinLogin();

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (BigDecimal Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public BigDecimal getLine();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name PA_DashboardContent_ID */
    public static final String COLUMNNAME_PA_DashboardContent_ID = "PA_DashboardContent_ID";

	/** Set Dashboard Content	  */
	public void setPA_DashboardContent_ID (int PA_DashboardContent_ID);

	/** Get Dashboard Content	  */
	public int getPA_DashboardContent_ID();

    /** Column name PA_DashboardContent_UU */
    public static final String COLUMNNAME_PA_DashboardContent_UU = "PA_DashboardContent_UU";

	/** Set PA_DashboardContent_UU	  */
	public void setPA_DashboardContent_UU (String PA_DashboardContent_UU);

	/** Get PA_DashboardContent_UU	  */
	public String getPA_DashboardContent_UU();

    /** Column name PA_Goal_ID */
    public static final String COLUMNNAME_PA_Goal_ID = "PA_Goal_ID";

	/** Set Goal.
	  * Performance Goal
	  */
	public void setPA_Goal_ID (int PA_Goal_ID);

	/** Get Goal.
	  * Performance Goal
	  */
	public int getPA_Goal_ID();

	public org.compiere.model.I_PA_Goal getPA_Goal() throws RuntimeException;

    /** Column name ProcessParameters */
    public static final String COLUMNNAME_ProcessParameters = "ProcessParameters";

	/** Set Process Parameters.
	  * Comma separated process parameter list
	  */
	public void setProcessParameters (String ProcessParameters);

	/** Get Process Parameters.
	  * Comma separated process parameter list
	  */
	public String getProcessParameters();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name ZulFilePath */
    public static final String COLUMNNAME_ZulFilePath = "ZulFilePath";

	/** Set Gadget URI.
	  * URI for Dashboard Gadget
	  */
	public void setZulFilePath (String ZulFilePath);

	/** Get Gadget URI.
	  * URI for Dashboard Gadget
	  */
	public String getZulFilePath();
}
