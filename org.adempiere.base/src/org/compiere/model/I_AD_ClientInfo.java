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

/** Generated Interface for AD_ClientInfo
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_AD_ClientInfo 
{

    /** TableName=AD_ClientInfo */
    public static final String Table_Name = "AD_ClientInfo";

    /** AD_Table_ID=227 */
    public static final int Table_ID = 227;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_ClientInfo_UU */
    public static final String COLUMNNAME_AD_ClientInfo_UU = "AD_ClientInfo_UU";

	/** Set AD_ClientInfo_UU	  */
	public void setAD_ClientInfo_UU (String AD_ClientInfo_UU);

	/** Get AD_ClientInfo_UU	  */
	public String getAD_ClientInfo_UU();

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

    /** Column name AD_StorageProvider_ID */
    public static final String COLUMNNAME_AD_StorageProvider_ID = "AD_StorageProvider_ID";

	/** Set Storage Provider	  */
	public void setAD_StorageProvider_ID (int AD_StorageProvider_ID);

	/** Get Storage Provider	  */
	public int getAD_StorageProvider_ID();

	public org.compiere.model.I_AD_StorageProvider getAD_StorageProvider() throws RuntimeException;

    /** Column name AD_Tree_Activity_ID */
    public static final String COLUMNNAME_AD_Tree_Activity_ID = "AD_Tree_Activity_ID";

	/** Set Activity Tree.
	  * Trees are used for (financial) reporting
	  */
	public void setAD_Tree_Activity_ID (int AD_Tree_Activity_ID);

	/** Get Activity Tree.
	  * Trees are used for (financial) reporting
	  */
	public int getAD_Tree_Activity_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_Activity() throws RuntimeException;

    /** Column name AD_Tree_BPartner_ID */
    public static final String COLUMNNAME_AD_Tree_BPartner_ID = "AD_Tree_BPartner_ID";

	/** Set BPartner Tree.
	  * Trees are used for (financial) reporting
	  */
	public void setAD_Tree_BPartner_ID (int AD_Tree_BPartner_ID);

	/** Get BPartner Tree.
	  * Trees are used for (financial) reporting
	  */
	public int getAD_Tree_BPartner_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_BPartner() throws RuntimeException;

    /** Column name AD_Tree_Campaign_ID */
    public static final String COLUMNNAME_AD_Tree_Campaign_ID = "AD_Tree_Campaign_ID";

	/** Set Campaign Tree.
	  * Trees are used for (financial) reporting
	  */
	public void setAD_Tree_Campaign_ID (int AD_Tree_Campaign_ID);

	/** Get Campaign Tree.
	  * Trees are used for (financial) reporting
	  */
	public int getAD_Tree_Campaign_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_Campaign() throws RuntimeException;

    /** Column name AD_Tree_Menu_ID */
    public static final String COLUMNNAME_AD_Tree_Menu_ID = "AD_Tree_Menu_ID";

	/** Set Menu Tree.
	  * Tree of the menu
	  */
	public void setAD_Tree_Menu_ID (int AD_Tree_Menu_ID);

	/** Get Menu Tree.
	  * Tree of the menu
	  */
	public int getAD_Tree_Menu_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_Menu() throws RuntimeException;

    /** Column name AD_Tree_Org_ID */
    public static final String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";

	/** Set Organization Tree.
	  * Trees are used for (financial) reporting and security access (via role)
	  */
	public void setAD_Tree_Org_ID (int AD_Tree_Org_ID);

	/** Get Organization Tree.
	  * Trees are used for (financial) reporting and security access (via role)
	  */
	public int getAD_Tree_Org_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_Org() throws RuntimeException;

    /** Column name AD_Tree_Product_ID */
    public static final String COLUMNNAME_AD_Tree_Product_ID = "AD_Tree_Product_ID";

	/** Set Product Tree.
	  * Trees are used for (financial) reporting
	  */
	public void setAD_Tree_Product_ID (int AD_Tree_Product_ID);

	/** Get Product Tree.
	  * Trees are used for (financial) reporting
	  */
	public int getAD_Tree_Product_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_Product() throws RuntimeException;

    /** Column name AD_Tree_Project_ID */
    public static final String COLUMNNAME_AD_Tree_Project_ID = "AD_Tree_Project_ID";

	/** Set Project Tree.
	  * Trees are used for (financial) reporting
	  */
	public void setAD_Tree_Project_ID (int AD_Tree_Project_ID);

	/** Get Project Tree.
	  * Trees are used for (financial) reporting
	  */
	public int getAD_Tree_Project_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_Project() throws RuntimeException;

    /** Column name AD_Tree_SalesRegion_ID */
    public static final String COLUMNNAME_AD_Tree_SalesRegion_ID = "AD_Tree_SalesRegion_ID";

	/** Set Sales Region Tree.
	  * Trees are used for (financial) reporting
	  */
	public void setAD_Tree_SalesRegion_ID (int AD_Tree_SalesRegion_ID);

	/** Get Sales Region Tree.
	  * Trees are used for (financial) reporting
	  */
	public int getAD_Tree_SalesRegion_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_SalesRegion() throws RuntimeException;

    /** Column name C_AcctSchema1_ID */
    public static final String COLUMNNAME_C_AcctSchema1_ID = "C_AcctSchema1_ID";

	/** Set Primary Accounting Schema.
	  * Primary rules for accounting
	  */
	public void setC_AcctSchema1_ID (int C_AcctSchema1_ID);

	/** Get Primary Accounting Schema.
	  * Primary rules for accounting
	  */
	public int getC_AcctSchema1_ID();

	public org.compiere.model.I_C_AcctSchema getC_AcctSchema1() throws RuntimeException;

    /** Column name C_BPartnerCashTrx_ID */
    public static final String COLUMNNAME_C_BPartnerCashTrx_ID = "C_BPartnerCashTrx_ID";

	/** Set Template B.Partner.
	  * Business Partner used for creating new Business Partners on the fly
	  */
	public void setC_BPartnerCashTrx_ID (int C_BPartnerCashTrx_ID);

	/** Get Template B.Partner.
	  * Business Partner used for creating new Business Partners on the fly
	  */
	public int getC_BPartnerCashTrx_ID();

	public org.compiere.model.I_C_BPartner getC_BPartnerCashTrx() throws RuntimeException;

    /** Column name C_Calendar_ID */
    public static final String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";

	/** Set Calendar.
	  * Accounting Calendar Name
	  */
	public void setC_Calendar_ID (int C_Calendar_ID);

	/** Get Calendar.
	  * Accounting Calendar Name
	  */
	public int getC_Calendar_ID();

	public org.compiere.model.I_C_Calendar getC_Calendar() throws RuntimeException;

    /** Column name C_ChargeFreight_ID */
    public static final String COLUMNNAME_C_ChargeFreight_ID = "C_ChargeFreight_ID";

	/** Set Charge for Freight	  */
	public void setC_ChargeFreight_ID (int C_ChargeFreight_ID);

	/** Get Charge for Freight	  */
	public int getC_ChargeFreight_ID();

	public org.compiere.model.I_C_Charge getC_ChargeFreight() throws RuntimeException;

    /** Column name C_UOM_Length_ID */
    public static final String COLUMNNAME_C_UOM_Length_ID = "C_UOM_Length_ID";

	/** Set UOM for Length.
	  * Standard Unit of Measure for Length
	  */
	public void setC_UOM_Length_ID (int C_UOM_Length_ID);

	/** Get UOM for Length.
	  * Standard Unit of Measure for Length
	  */
	public int getC_UOM_Length_ID();

	public org.compiere.model.I_C_UOM getC_UOM_Length() throws RuntimeException;

    /** Column name C_UOM_Time_ID */
    public static final String COLUMNNAME_C_UOM_Time_ID = "C_UOM_Time_ID";

	/** Set UOM for Time.
	  * Standard Unit of Measure for Time
	  */
	public void setC_UOM_Time_ID (int C_UOM_Time_ID);

	/** Get UOM for Time.
	  * Standard Unit of Measure for Time
	  */
	public int getC_UOM_Time_ID();

	public org.compiere.model.I_C_UOM getC_UOM_Time() throws RuntimeException;

    /** Column name C_UOM_Volume_ID */
    public static final String COLUMNNAME_C_UOM_Volume_ID = "C_UOM_Volume_ID";

	/** Set UOM for Volume.
	  * Standard Unit of Measure for Volume
	  */
	public void setC_UOM_Volume_ID (int C_UOM_Volume_ID);

	/** Get UOM for Volume.
	  * Standard Unit of Measure for Volume
	  */
	public int getC_UOM_Volume_ID();

	public org.compiere.model.I_C_UOM getC_UOM_Volume() throws RuntimeException;

    /** Column name C_UOM_Weight_ID */
    public static final String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";

	/** Set UOM for Weight.
	  * Standard Unit of Measure for Weight
	  */
	public void setC_UOM_Weight_ID (int C_UOM_Weight_ID);

	/** Get UOM for Weight.
	  * Standard Unit of Measure for Weight
	  */
	public int getC_UOM_Weight_ID();

	public org.compiere.model.I_C_UOM getC_UOM_Weight() throws RuntimeException;

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

    /** Column name FY_StartDate */
    public static final String COLUMNNAME_FY_StartDate = "FY_StartDate";

	/** Set Financial Year Start Date	  */
	public void setFY_StartDate (Timestamp FY_StartDate);

	/** Get Financial Year Start Date	  */
	public Timestamp getFY_StartDate();

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

    /** Column name IsConfirmOnDocClose */
    public static final String COLUMNNAME_IsConfirmOnDocClose = "IsConfirmOnDocClose";

	/** Set Show Confirmation On Document Action Close	  */
	public void setIsConfirmOnDocClose (boolean IsConfirmOnDocClose);

	/** Get Show Confirmation On Document Action Close	  */
	public boolean isConfirmOnDocClose();

    /** Column name IsConfirmOnDocVoid */
    public static final String COLUMNNAME_IsConfirmOnDocVoid = "IsConfirmOnDocVoid";

	/** Set Show Confirmation On Document Action Void	  */
	public void setIsConfirmOnDocVoid (boolean IsConfirmOnDocVoid);

	/** Get Show Confirmation On Document Action Void	  */
	public boolean isConfirmOnDocVoid();

    /** Column name IsDiscountLineAmt */
    public static final String COLUMNNAME_IsDiscountLineAmt = "IsDiscountLineAmt";

	/** Set Discount calculated from Line Amounts.
	  * Payment Discount calculation does not include Taxes and Charges
	  */
	public void setIsDiscountLineAmt (boolean IsDiscountLineAmt);

	/** Get Discount calculated from Line Amounts.
	  * Payment Discount calculation does not include Taxes and Charges
	  */
	public boolean isDiscountLineAmt();

    /** Column name KeepLogDays */
    public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";

	/** Set Days to keep Log.
	  * Number of days to keep the log entries
	  */
	public void setKeepLogDays (int KeepLogDays);

	/** Get Days to keep Log.
	  * Number of days to keep the log entries
	  */
	public int getKeepLogDays();

    /** Column name LogoReport_ID */
    public static final String COLUMNNAME_LogoReport_ID = "LogoReport_ID";

	/** Set Logo Report	  */
	public void setLogoReport_ID (int LogoReport_ID);

	/** Get Logo Report	  */
	public int getLogoReport_ID();

    /** Column name LogoWeb_ID */
    public static final String COLUMNNAME_LogoWeb_ID = "LogoWeb_ID";

	/** Set Logo Web	  */
	public void setLogoWeb_ID (int LogoWeb_ID);

	/** Get Logo Web	  */
	public int getLogoWeb_ID();

    /** Column name Logo_ID */
    public static final String COLUMNNAME_Logo_ID = "Logo_ID";

	/** Set Logo	  */
	public void setLogo_ID (int Logo_ID);

	/** Get Logo	  */
	public int getLogo_ID();

    /** Column name M_ProductFreight_ID */
    public static final String COLUMNNAME_M_ProductFreight_ID = "M_ProductFreight_ID";

	/** Set Product for Freight	  */
	public void setM_ProductFreight_ID (int M_ProductFreight_ID);

	/** Get Product for Freight	  */
	public int getM_ProductFreight_ID();

	public org.compiere.model.I_M_Product getM_ProductFreight() throws RuntimeException;

    /** Column name StorageArchive_ID */
    public static final String COLUMNNAME_StorageArchive_ID = "StorageArchive_ID";

	/** Set Archive Store	  */
	public void setStorageArchive_ID (int StorageArchive_ID);

	/** Get Archive Store	  */
	public int getStorageArchive_ID();

	public org.compiere.model.I_AD_StorageProvider getStorageArchive() throws RuntimeException;

    /** Column name StorageImage_ID */
    public static final String COLUMNNAME_StorageImage_ID = "StorageImage_ID";

	/** Set Image Store.
	  * Storage provider for Image
	  */
	public void setStorageImage_ID (int StorageImage_ID);

	/** Get Image Store.
	  * Storage provider for Image
	  */
	public int getStorageImage_ID();

	public org.compiere.model.I_AD_StorageProvider getStorageImage() throws RuntimeException;

    /** Column name TimeZone */
    public static final String COLUMNNAME_TimeZone = "TimeZone";

	/** Set Time Zone.
	  * Time zone name
	  */
	public void setTimeZone (String TimeZone);

	/** Get Time Zone.
	  * Time zone name
	  */
	public String getTimeZone();

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
