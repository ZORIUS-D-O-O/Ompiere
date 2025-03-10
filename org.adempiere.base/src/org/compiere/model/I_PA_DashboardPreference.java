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

/** Generated Interface for PA_DashboardPreference
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_PA_DashboardPreference 
{

    /** TableName=PA_DashboardPreference */
    public static final String Table_Name = "PA_DashboardPreference";

    /** AD_Table_ID=200013 */
    public static final int Table_ID = 200013;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

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

    /** Column name FlexGrow */
    public static final String COLUMNNAME_FlexGrow = "FlexGrow";

	/** Set Flex Grow.
	  * This defines the ability for a flex item to grow if necessary. It accepts a unitless value that serves as a proportion. It dictates what amount of the available space inside the flex container the item should take up.
	  */
	public void setFlexGrow (int FlexGrow);

	/** Get Flex Grow.
	  * This defines the ability for a flex item to grow if necessary. It accepts a unitless value that serves as a proportion. It dictates what amount of the available space inside the flex container the item should take up.
	  */
	public int getFlexGrow();

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

    /** Column name PA_DashboardContent_ID */
    public static final String COLUMNNAME_PA_DashboardContent_ID = "PA_DashboardContent_ID";

	/** Set Dashboard Content	  */
	public void setPA_DashboardContent_ID (int PA_DashboardContent_ID);

	/** Get Dashboard Content	  */
	public int getPA_DashboardContent_ID();

	public org.compiere.model.I_PA_DashboardContent getPA_DashboardContent() throws RuntimeException;

    /** Column name PA_DashboardPreference_ID */
    public static final String COLUMNNAME_PA_DashboardPreference_ID = "PA_DashboardPreference_ID";

	/** Set Dashboard Preference	  */
	public void setPA_DashboardPreference_ID (int PA_DashboardPreference_ID);

	/** Get Dashboard Preference	  */
	public int getPA_DashboardPreference_ID();

    /** Column name PA_DashboardPreference_UU */
    public static final String COLUMNNAME_PA_DashboardPreference_UU = "PA_DashboardPreference_UU";

	/** Set PA_DashboardPreference_UU	  */
	public void setPA_DashboardPreference_UU (String PA_DashboardPreference_UU);

	/** Get PA_DashboardPreference_UU	  */
	public String getPA_DashboardPreference_UU();

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
}
