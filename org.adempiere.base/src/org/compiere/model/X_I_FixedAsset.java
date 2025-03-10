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
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for I_FixedAsset
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="I_FixedAsset")
public class X_I_FixedAsset extends PO implements I_I_FixedAsset, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_I_FixedAsset (Properties ctx, int I_FixedAsset_ID, String trxName)
    {
      super (ctx, I_FixedAsset_ID, trxName);
      /** if (I_FixedAsset_ID == 0)
        {
			setA_Asset_Cost (Env.ZERO);
// 0
			setA_Remaining_Period (0);
// 0
			setAssetAmtEntered (Env.ZERO);
// 0
			setAssetPeriodDepreciationAmt (Env.ZERO);
// 0
			setAssetSourceAmt (Env.ZERO);
// 0
			setDocAction (null);
// 'CO'
			setI_IsImported (false);
// 'N'
        } */
    }

    /** Standard Constructor */
    public X_I_FixedAsset (Properties ctx, int I_FixedAsset_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, I_FixedAsset_ID, trxName, virtualColumns);
      /** if (I_FixedAsset_ID == 0)
        {
			setA_Asset_Cost (Env.ZERO);
// 0
			setA_Remaining_Period (0);
// 0
			setAssetAmtEntered (Env.ZERO);
// 0
			setAssetPeriodDepreciationAmt (Env.ZERO);
// 0
			setAssetSourceAmt (Env.ZERO);
// 0
			setDocAction (null);
// 'CO'
			setI_IsImported (false);
// 'N'
        } */
    }

    /** Standard Constructor */
    public X_I_FixedAsset (Properties ctx, String I_FixedAsset_UU, String trxName)
    {
      super (ctx, I_FixedAsset_UU, trxName);
      /** if (I_FixedAsset_UU == null)
        {
			setA_Asset_Cost (Env.ZERO);
// 0
			setA_Remaining_Period (0);
// 0
			setAssetAmtEntered (Env.ZERO);
// 0
			setAssetPeriodDepreciationAmt (Env.ZERO);
// 0
			setAssetSourceAmt (Env.ZERO);
// 0
			setDocAction (null);
// 'CO'
			setI_IsImported (false);
// 'N'
        } */
    }

    /** Standard Constructor */
    public X_I_FixedAsset (Properties ctx, String I_FixedAsset_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, I_FixedAsset_UU, trxName, virtualColumns);
      /** if (I_FixedAsset_UU == null)
        {
			setA_Asset_Cost (Env.ZERO);
// 0
			setA_Remaining_Period (0);
// 0
			setAssetAmtEntered (Env.ZERO);
// 0
			setAssetPeriodDepreciationAmt (Env.ZERO);
// 0
			setAssetSourceAmt (Env.ZERO);
// 0
			setDocAction (null);
// 'CO'
			setI_IsImported (false);
// 'N'
        } */
    }

    /** Load Constructor */
    public X_I_FixedAsset (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_I_FixedAsset[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Accumulated Depreciation.
		@param A_Accumulated_Depr Accumulated Depreciation
	*/
	public void setA_Accumulated_Depr (BigDecimal A_Accumulated_Depr)
	{
		set_Value (COLUMNNAME_A_Accumulated_Depr, A_Accumulated_Depr);
	}

	/** Get Accumulated Depreciation.
		@return Accumulated Depreciation	  */
	public BigDecimal getA_Accumulated_Depr()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Accumulated_Depr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Accumulated Depreciation (fiscal).
		@param A_Accumulated_Depr_F Accumulated Depreciation (fiscal)
	*/
	public void setA_Accumulated_Depr_F (BigDecimal A_Accumulated_Depr_F)
	{
		set_Value (COLUMNNAME_A_Accumulated_Depr_F, A_Accumulated_Depr_F);
	}

	/** Get Accumulated Depreciation (fiscal).
		@return Accumulated Depreciation (fiscal)	  */
	public BigDecimal getA_Accumulated_Depr_F()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Accumulated_Depr_F);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_A_Asset_Class getA_Asset_Class() throws RuntimeException
	{
		return (org.compiere.model.I_A_Asset_Class)MTable.get(getCtx(), org.compiere.model.I_A_Asset_Class.Table_ID)
			.getPO(getA_Asset_Class_ID(), get_TrxName());
	}

	/** Set Asset class.
		@param A_Asset_Class_ID Asset class
	*/
	public void setA_Asset_Class_ID (int A_Asset_Class_ID)
	{
		if (A_Asset_Class_ID < 1)
			set_Value (COLUMNNAME_A_Asset_Class_ID, null);
		else
			set_Value (COLUMNNAME_A_Asset_Class_ID, Integer.valueOf(A_Asset_Class_ID));
	}

	/** Get Asset class.
		@return Asset class	  */
	public int getA_Asset_Class_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Class_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Asset Class Key.
		@param A_Asset_Class_Value Asset Class Key
	*/
	public void setA_Asset_Class_Value (String A_Asset_Class_Value)
	{
		set_Value (COLUMNNAME_A_Asset_Class_Value, A_Asset_Class_Value);
	}

	/** Get Asset Class Key.
		@return Asset Class Key	  */
	public String getA_Asset_Class_Value()
	{
		return (String)get_Value(COLUMNNAME_A_Asset_Class_Value);
	}

	/** Set Asset Cost.
		@param A_Asset_Cost Asset Cost
	*/
	public void setA_Asset_Cost (BigDecimal A_Asset_Cost)
	{
		set_Value (COLUMNNAME_A_Asset_Cost, A_Asset_Cost);
	}

	/** Get Asset Cost.
		@return Asset Cost	  */
	public BigDecimal getA_Asset_Cost()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Asset_Cost);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_A_Asset_Group getA_Asset_Group() throws RuntimeException
	{
		return (org.compiere.model.I_A_Asset_Group)MTable.get(getCtx(), org.compiere.model.I_A_Asset_Group.Table_ID)
			.getPO(getA_Asset_Group_ID(), get_TrxName());
	}

	/** Set Asset Group.
		@param A_Asset_Group_ID Group of Assets
	*/
	public void setA_Asset_Group_ID (int A_Asset_Group_ID)
	{
		if (A_Asset_Group_ID < 1)
			set_Value (COLUMNNAME_A_Asset_Group_ID, null);
		else
			set_Value (COLUMNNAME_A_Asset_Group_ID, Integer.valueOf(A_Asset_Group_ID));
	}

	/** Get Asset Group.
		@return Group of Assets
	  */
	public int getA_Asset_Group_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Group_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Asset Group Key.
		@param A_Asset_Group_Value Asset Group Key
	*/
	public void setA_Asset_Group_Value (String A_Asset_Group_Value)
	{
		set_Value (COLUMNNAME_A_Asset_Group_Value, A_Asset_Group_Value);
	}

	/** Get Asset Group Key.
		@return Asset Group Key	  */
	public String getA_Asset_Group_Value()
	{
		return (String)get_Value(COLUMNNAME_A_Asset_Group_Value);
	}

	public org.compiere.model.I_A_Asset getA_Asset() throws RuntimeException
	{
		return (org.compiere.model.I_A_Asset)MTable.get(getCtx(), org.compiere.model.I_A_Asset.Table_ID)
			.getPO(getA_Asset_ID(), get_TrxName());
	}

	/** Set Asset.
		@param A_Asset_ID Asset used internally or by customers
	*/
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1)
			set_Value (COLUMNNAME_A_Asset_ID, null);
		else
			set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_A_Asset_Type getA_Asset_Type() throws RuntimeException
	{
		return (org.compiere.model.I_A_Asset_Type)MTable.get(getCtx(), org.compiere.model.I_A_Asset_Type.Table_ID)
			.getPO(getA_Asset_Type_ID(), get_TrxName());
	}

	/** Set Asset Type.
		@param A_Asset_Type_ID Asset Type
	*/
	public void setA_Asset_Type_ID (int A_Asset_Type_ID)
	{
		if (A_Asset_Type_ID < 1)
			set_Value (COLUMNNAME_A_Asset_Type_ID, null);
		else
			set_Value (COLUMNNAME_A_Asset_Type_ID, Integer.valueOf(A_Asset_Type_ID));
	}

	/** Get Asset Type.
		@return Asset Type	  */
	public int getA_Asset_Type_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Type_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Asset Type Value.
		@param A_Asset_Type_Value Asset Type Value
	*/
	public void setA_Asset_Type_Value (String A_Asset_Type_Value)
	{
		set_Value (COLUMNNAME_A_Asset_Type_Value, A_Asset_Type_Value);
	}

	/** Get Asset Type Value.
		@return Asset Type Value	  */
	public String getA_Asset_Type_Value()
	{
		return (String)get_Value(COLUMNNAME_A_Asset_Type_Value);
	}

	/** Set Current Period.
		@param A_Current_Period Current Period
	*/
	public void setA_Current_Period (int A_Current_Period)
	{
		set_Value (COLUMNNAME_A_Current_Period, Integer.valueOf(A_Current_Period));
	}

	/** Get Current Period.
		@return Current Period	  */
	public int getA_Current_Period()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Current_Period);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Remaining Period.
		@param A_Remaining_Period Remaining Period
	*/
	public void setA_Remaining_Period (int A_Remaining_Period)
	{
		set_Value (COLUMNNAME_A_Remaining_Period, Integer.valueOf(A_Remaining_Period));
	}

	/** Get Remaining Period.
		@return Remaining Period	  */
	public int getA_Remaining_Period()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Remaining_Period);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Asset Salvage Value.
		@param A_Salvage_Value Asset Salvage Value
	*/
	public void setA_Salvage_Value (BigDecimal A_Salvage_Value)
	{
		set_Value (COLUMNNAME_A_Salvage_Value, A_Salvage_Value);
	}

	/** Get Asset Salvage Value.
		@return Asset Salvage Value	  */
	public BigDecimal getA_Salvage_Value()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_A_Salvage_Value);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Account Schema Name.
		@param AcctSchemaName Name of the Accounting Schema
	*/
	public void setAcctSchemaName (String AcctSchemaName)
	{
		set_Value (COLUMNNAME_AcctSchemaName, AcctSchemaName);
	}

	/** Get Account Schema Name.
		@return Name of the Accounting Schema
	  */
	public String getAcctSchemaName()
	{
		return (String)get_Value(COLUMNNAME_AcctSchemaName);
	}

	/** Set Entered Amount.
		@param AssetAmtEntered Entered Amount
	*/
	public void setAssetAmtEntered (BigDecimal AssetAmtEntered)
	{
		set_Value (COLUMNNAME_AssetAmtEntered, AssetAmtEntered);
	}

	/** Get Entered Amount.
		@return Entered Amount	  */
	public BigDecimal getAssetAmtEntered()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AssetAmtEntered);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Asset Depreciation Date.
		@param AssetDepreciationDate Date of last depreciation
	*/
	public void setAssetDepreciationDate (Timestamp AssetDepreciationDate)
	{
		set_Value (COLUMNNAME_AssetDepreciationDate, AssetDepreciationDate);
	}

	/** Get Asset Depreciation Date.
		@return Date of last depreciation
	  */
	public Timestamp getAssetDepreciationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_AssetDepreciationDate);
	}

	/** Set Depreciation Amount / Period.
		@param AssetPeriodDepreciationAmt Applies to Straight Line depreciation
	*/
	public void setAssetPeriodDepreciationAmt (BigDecimal AssetPeriodDepreciationAmt)
	{
		set_Value (COLUMNNAME_AssetPeriodDepreciationAmt, AssetPeriodDepreciationAmt);
	}

	/** Get Depreciation Amount / Period.
		@return Applies to Straight Line depreciation
	  */
	public BigDecimal getAssetPeriodDepreciationAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AssetPeriodDepreciationAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set In Service Date.
		@param AssetServiceDate Date when Asset was put into service
	*/
	public void setAssetServiceDate (Timestamp AssetServiceDate)
	{
		set_Value (COLUMNNAME_AssetServiceDate, AssetServiceDate);
	}

	/** Get In Service Date.
		@return Date when Asset was put into service
	  */
	public Timestamp getAssetServiceDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_AssetServiceDate);
	}

	/** Set Source Amount.
		@param AssetSourceAmt Source Amount
	*/
	public void setAssetSourceAmt (BigDecimal AssetSourceAmt)
	{
		set_Value (COLUMNNAME_AssetSourceAmt, AssetSourceAmt);
	}

	/** Get Source Amount.
		@return Source Amount	  */
	public BigDecimal getAssetSourceAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AssetSourceAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Business Partner Key.
		@param BPartner_Value The Key of the Business Partner
	*/
	public void setBPartner_Value (String BPartner_Value)
	{
		set_Value (COLUMNNAME_BPartner_Value, BPartner_Value);
	}

	/** Get Business Partner Key.
		@return The Key of the Business Partner
	  */
	public String getBPartner_Value()
	{
		return (String)get_Value(COLUMNNAME_BPartner_Value);
	}

	public org.compiere.model.I_C_AcctSchema getC_AcctSchema() throws RuntimeException
	{
		return (org.compiere.model.I_C_AcctSchema)MTable.get(getCtx(), org.compiere.model.I_C_AcctSchema.Table_ID)
			.getPO(getC_AcctSchema_ID(), get_TrxName());
	}

	/** Set Accounting Schema.
		@param C_AcctSchema_ID Rules for accounting
	*/
	public void setC_AcctSchema_ID (int C_AcctSchema_ID)
	{
		if (C_AcctSchema_ID < 1)
			set_Value (COLUMNNAME_C_AcctSchema_ID, null);
		else
			set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
	}

	/** Get Accounting Schema.
		@return Rules for accounting
	  */
	public int getC_AcctSchema_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartnerSR() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartnerSR_ID(), get_TrxName());
	}

	/** Set BPartner (Agent).
		@param C_BPartnerSR_ID Business Partner (Agent or Sales Rep)
	*/
	public void setC_BPartnerSR_ID (int C_BPartnerSR_ID)
	{
		if (C_BPartnerSR_ID < 1)
			set_Value (COLUMNNAME_C_BPartnerSR_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartnerSR_ID, Integer.valueOf(C_BPartnerSR_ID));
	}

	/** Get BPartner (Agent).
		@return Business Partner (Agent or Sales Rep)
	  */
	public int getC_BPartnerSR_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerSR_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_City getC_City() throws RuntimeException
	{
		return (org.compiere.model.I_C_City)MTable.get(getCtx(), org.compiere.model.I_C_City.Table_ID)
			.getPO(getC_City_ID(), get_TrxName());
	}

	/** Set City.
		@param C_City_ID City
	*/
	public void setC_City_ID (int C_City_ID)
	{
		if (C_City_ID < 1)
			set_Value (COLUMNNAME_C_City_ID, null);
		else
			set_Value (COLUMNNAME_C_City_ID, Integer.valueOf(C_City_ID));
	}

	/** Get City.
		@return City
	  */
	public int getC_City_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_City_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set City Value.
		@param C_City_Value City Value
	*/
	public void setC_City_Value (String C_City_Value)
	{
		set_Value (COLUMNNAME_C_City_Value, C_City_Value);
	}

	/** Get City Value.
		@return City Value	  */
	public String getC_City_Value()
	{
		return (String)get_Value(COLUMNNAME_C_City_Value);
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
	{
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_ID)
			.getPO(getC_Currency_ID(), get_TrxName());
	}

	/** Set Currency.
		@param C_Currency_ID The Currency for this record
	*/
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1)
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException
	{
		return (org.compiere.model.I_C_UOM)MTable.get(getCtx(), org.compiere.model.I_C_UOM.Table_ID)
			.getPO(getC_UOM_ID(), get_TrxName());
	}

	/** Set UOM.
		@param C_UOM_ID Unit of Measure
	*/
	public void setC_UOM_ID (int C_UOM_ID)
	{
		if (C_UOM_ID < 1)
			set_Value (COLUMNNAME_C_UOM_ID, null);
		else
			set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
	}

	/** Get UOM.
		@return Unit of Measure
	  */
	public int getC_UOM_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Date.
		@param DateAcct Accounting Date
	*/
	public void setDateAcct (Timestamp DateAcct)
	{
		set_Value (COLUMNNAME_DateAcct, DateAcct);
	}

	/** Get Account Date.
		@return Accounting Date
	  */
	public Timestamp getDateAcct()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateAcct);
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** DocAction AD_Reference_ID=135 */
	public static final int DOCACTION_AD_Reference_ID=135;
	/** &lt;None&gt; = -- */
	public static final String DOCACTION_None = "--";
	/** Approve = AP */
	public static final String DOCACTION_Approve = "AP";
	/** Close = CL */
	public static final String DOCACTION_Close = "CL";
	/** Complete = CO */
	public static final String DOCACTION_Complete = "CO";
	/** Invalidate = IN */
	public static final String DOCACTION_Invalidate = "IN";
	/** Post = PO */
	public static final String DOCACTION_Post = "PO";
	/** Prepare = PR */
	public static final String DOCACTION_Prepare = "PR";
	/** Reverse - Accrual = RA */
	public static final String DOCACTION_Reverse_Accrual = "RA";
	/** Reverse - Correct = RC */
	public static final String DOCACTION_Reverse_Correct = "RC";
	/** Re-activate = RE */
	public static final String DOCACTION_Re_Activate = "RE";
	/** Reject = RJ */
	public static final String DOCACTION_Reject = "RJ";
	/** Void = VO */
	public static final String DOCACTION_Void = "VO";
	/** Wait Complete = WC */
	public static final String DOCACTION_WaitComplete = "WC";
	/** Unlock = XL */
	public static final String DOCACTION_Unlock = "XL";
	/** Set Document Action.
		@param DocAction The targeted status of the document
	*/
	public void setDocAction (String DocAction)
	{

		set_Value (COLUMNNAME_DocAction, DocAction);
	}

	/** Get Document Action.
		@return The targeted status of the document
	  */
	public String getDocAction()
	{
		return (String)get_Value(COLUMNNAME_DocAction);
	}

	/** Set ISO Currency Code.
		@param ISO_Code Three letter ISO 4217 Code of the Currency
	*/
	public void setISO_Code (String ISO_Code)
	{
		set_Value (COLUMNNAME_ISO_Code, ISO_Code);
	}

	/** Get ISO Currency Code.
		@return Three letter ISO 4217 Code of the Currency
	  */
	public String getISO_Code()
	{
		return (String)get_Value(COLUMNNAME_ISO_Code);
	}

	/** Set Import Error Message.
		@param I_ErrorMsg Messages generated from import process
	*/
	public void setI_ErrorMsg (String I_ErrorMsg)
	{
		set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
	}

	/** Get Import Error Message.
		@return Messages generated from import process
	  */
	public String getI_ErrorMsg()
	{
		return (String)get_Value(COLUMNNAME_I_ErrorMsg);
	}

	/** Set Imported Fixed Asset.
		@param I_FixedAsset_ID Imported Fixed Asset
	*/
	public void setI_FixedAsset_ID (int I_FixedAsset_ID)
	{
		if (I_FixedAsset_ID < 1)
			set_ValueNoCheck (COLUMNNAME_I_FixedAsset_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_I_FixedAsset_ID, Integer.valueOf(I_FixedAsset_ID));
	}

	/** Get Imported Fixed Asset.
		@return Imported Fixed Asset	  */
	public int getI_FixedAsset_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_I_FixedAsset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set I_FixedAsset_UU.
		@param I_FixedAsset_UU I_FixedAsset_UU
	*/
	public void setI_FixedAsset_UU (String I_FixedAsset_UU)
	{
		set_Value (COLUMNNAME_I_FixedAsset_UU, I_FixedAsset_UU);
	}

	/** Get I_FixedAsset_UU.
		@return I_FixedAsset_UU	  */
	public String getI_FixedAsset_UU()
	{
		return (String)get_Value(COLUMNNAME_I_FixedAsset_UU);
	}

	/** Set Imported.
		@param I_IsImported Has this import been processed
	*/
	public void setI_IsImported (boolean I_IsImported)
	{
		set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
	}

	/** Get Imported.
		@return Has this import been processed
	  */
	public boolean isI_IsImported()
	{
		Object oo = get_Value(COLUMNNAME_I_IsImported);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Inventory No.
		@param InventoryNo Inventory No
	*/
	public void setInventoryNo (String InventoryNo)
	{
		set_Value (COLUMNNAME_InventoryNo, InventoryNo);
	}

	/** Get Inventory No.
		@return Inventory No	  */
	public String getInventoryNo()
	{
		return (String)get_Value(COLUMNNAME_InventoryNo);
	}

	/** Set Locator Key.
		@param LocatorValue Key of the Warehouse Locator
	*/
	public void setLocatorValue (String LocatorValue)
	{
		set_Value (COLUMNNAME_LocatorValue, LocatorValue);
	}

	/** Get Locator Key.
		@return Key of the Warehouse Locator
	  */
	public String getLocatorValue()
	{
		return (String)get_Value(COLUMNNAME_LocatorValue);
	}

	public org.compiere.model.I_M_Locator getM_Locator() throws RuntimeException
	{
		return (org.compiere.model.I_M_Locator)MTable.get(getCtx(), org.compiere.model.I_M_Locator.Table_ID)
			.getPO(getM_Locator_ID(), get_TrxName());
	}

	/** Set Locator.
		@param M_Locator_ID Warehouse Locator
	*/
	public void setM_Locator_ID (int M_Locator_ID)
	{
		if (M_Locator_ID < 1)
			set_Value (COLUMNNAME_M_Locator_ID, null);
		else
			set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
	}

	/** Get Locator.
		@return Warehouse Locator
	  */
	public int getM_Locator_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_ID)
			.getPO(getM_Product_ID(), get_TrxName());
	}

	/** Set Product.
		@param M_Product_ID Product, Service, Item
	*/
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1)
			set_Value (COLUMNNAME_M_Product_ID, null);
		else
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Processed.
		@param Processed The document has been processed
	*/
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed()
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now
	*/
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing()
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Product Key.
		@param ProductValue Key of the Product
	*/
	public void setProductValue (String ProductValue)
	{
		set_Value (COLUMNNAME_ProductValue, ProductValue);
	}

	/** Get Product Key.
		@return Key of the Product
	  */
	public String getProductValue()
	{
		return (String)get_Value(COLUMNNAME_ProductValue);
	}

	/** Set Quantity.
		@param Qty Quantity
	*/
	public void setQty (BigDecimal Qty)
	{
		set_Value (COLUMNNAME_Qty, Qty);
	}

	/** Get Quantity.
		@return Quantity
	  */
	public BigDecimal getQty()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Sequence.
		@param SeqNo Method of ordering records; lowest number comes first
	*/
	public void setSeqNo (int SeqNo)
	{
		set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
	}

	/** Get Sequence.
		@return Method of ordering records; lowest number comes first
	  */
	public int getSeqNo()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Symbol.
		@param UOMSymbol Symbol for a Unit of Measure
	*/
	public void setUOMSymbol (String UOMSymbol)
	{
		set_Value (COLUMNNAME_UOMSymbol, UOMSymbol);
	}

	/** Get Symbol.
		@return Symbol for a Unit of Measure
	  */
	public String getUOMSymbol()
	{
		return (String)get_Value(COLUMNNAME_UOMSymbol);
	}

	/** Set Usable Life - Months.
		@param UseLifeMonths Months of the usable life of the asset
	*/
	public void setUseLifeMonths (int UseLifeMonths)
	{
		set_Value (COLUMNNAME_UseLifeMonths, Integer.valueOf(UseLifeMonths));
	}

	/** Get Usable Life - Months.
		@return Months of the usable life of the asset
	  */
	public int getUseLifeMonths()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UseLifeMonths);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Use Life - Months (fiscal).
		@param UseLifeMonths_F Use Life - Months (fiscal)
	*/
	public void setUseLifeMonths_F (int UseLifeMonths_F)
	{
		set_Value (COLUMNNAME_UseLifeMonths_F, Integer.valueOf(UseLifeMonths_F));
	}

	/** Get Use Life - Months (fiscal).
		@return Use Life - Months (fiscal)	  */
	public int getUseLifeMonths_F()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UseLifeMonths_F);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}