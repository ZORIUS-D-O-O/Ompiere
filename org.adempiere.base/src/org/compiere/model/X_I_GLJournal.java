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
import org.compiere.util.KeyNamePair;

/** Generated Model for I_GLJournal
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="I_GLJournal")
public class X_I_GLJournal extends PO implements I_I_GLJournal, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_I_GLJournal (Properties ctx, int I_GLJournal_ID, String trxName)
    {
      super (ctx, I_GLJournal_ID, trxName);
      /** if (I_GLJournal_ID == 0)
        {
			setI_GLJournal_ID (0);
			setI_IsImported (false);
        } */
    }

    /** Standard Constructor */
    public X_I_GLJournal (Properties ctx, int I_GLJournal_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, I_GLJournal_ID, trxName, virtualColumns);
      /** if (I_GLJournal_ID == 0)
        {
			setI_GLJournal_ID (0);
			setI_IsImported (false);
        } */
    }

    /** Standard Constructor */
    public X_I_GLJournal (Properties ctx, String I_GLJournal_UU, String trxName)
    {
      super (ctx, I_GLJournal_UU, trxName);
      /** if (I_GLJournal_UU == null)
        {
			setI_GLJournal_ID (0);
			setI_IsImported (false);
        } */
    }

    /** Standard Constructor */
    public X_I_GLJournal (Properties ctx, String I_GLJournal_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, I_GLJournal_UU, trxName, virtualColumns);
      /** if (I_GLJournal_UU == null)
        {
			setI_GLJournal_ID (0);
			setI_IsImported (false);
        } */
    }

    /** Load Constructor */
    public X_I_GLJournal (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client
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
      StringBuilder sb = new StringBuilder ("X_I_GLJournal[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Document Org.
		@param AD_OrgDoc_ID Document Organization (independent from account organization)
	*/
	public void setAD_OrgDoc_ID (int AD_OrgDoc_ID)
	{
		if (AD_OrgDoc_ID < 1)
			set_Value (COLUMNNAME_AD_OrgDoc_ID, null);
		else
			set_Value (COLUMNNAME_AD_OrgDoc_ID, Integer.valueOf(AD_OrgDoc_ID));
	}

	/** Get Document Org.
		@return Document Organization (independent from account organization)
	  */
	public int getAD_OrgDoc_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgDoc_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Trx Organization.
		@param AD_OrgTrx_ID Performing or initiating organization
	*/
	public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
	{
		if (AD_OrgTrx_ID < 1)
			set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
		else
			set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
	}

	/** Get Trx Organization.
		@return Performing or initiating organization
	  */
	public int getAD_OrgTrx_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Key.
		@param AccountValue Key of Account Element
	*/
	public void setAccountValue (String AccountValue)
	{
		set_Value (COLUMNNAME_AccountValue, AccountValue);
	}

	/** Get Account Key.
		@return Key of Account Element
	  */
	public String getAccountValue()
	{
		return (String)get_Value(COLUMNNAME_AccountValue);
	}

	public org.compiere.model.I_C_ElementValue getAccount() throws RuntimeException
	{
		return (org.compiere.model.I_C_ElementValue)MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_ID)
			.getPO(getAccount_ID(), get_TrxName());
	}

	/** Set Account.
		@param Account_ID Account used
	*/
	public void setAccount_ID (int Account_ID)
	{
		if (Account_ID < 1)
			set_Value (COLUMNNAME_Account_ID, null);
		else
			set_Value (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
	}

	/** Get Account.
		@return Account used
	  */
	public int getAccount_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Activity Key.
		@param ActivityValue Text key for Activity
	*/
	public void setActivityValue (String ActivityValue)
	{
		set_Value (COLUMNNAME_ActivityValue, ActivityValue);
	}

	/** Get Activity Key.
		@return Text key for Activity
	  */
	public String getActivityValue()
	{
		return (String)get_Value(COLUMNNAME_ActivityValue);
	}

	/** Set Accounted Credit.
		@param AmtAcctCr Accounted Credit Amount
	*/
	public void setAmtAcctCr (BigDecimal AmtAcctCr)
	{
		set_Value (COLUMNNAME_AmtAcctCr, AmtAcctCr);
	}

	/** Get Accounted Credit.
		@return Accounted Credit Amount
	  */
	public BigDecimal getAmtAcctCr()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctCr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Accounted Debit.
		@param AmtAcctDr Accounted Debit Amount
	*/
	public void setAmtAcctDr (BigDecimal AmtAcctDr)
	{
		set_Value (COLUMNNAME_AmtAcctDr, AmtAcctDr);
	}

	/** Get Accounted Debit.
		@return Accounted Debit Amount
	  */
	public BigDecimal getAmtAcctDr()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctDr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Source Credit.
		@param AmtSourceCr Source Credit Amount
	*/
	public void setAmtSourceCr (BigDecimal AmtSourceCr)
	{
		set_Value (COLUMNNAME_AmtSourceCr, AmtSourceCr);
	}

	/** Get Source Credit.
		@return Source Credit Amount
	  */
	public BigDecimal getAmtSourceCr()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceCr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Source Debit.
		@param AmtSourceDr Source Debit Amount
	*/
	public void setAmtSourceDr (BigDecimal AmtSourceDr)
	{
		set_Value (COLUMNNAME_AmtSourceDr, AmtSourceDr);
	}

	/** Get Source Debit.
		@return Source Debit Amount
	  */
	public BigDecimal getAmtSourceDr()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceDr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Business Partner Key.
		@param BPartnerValue Key of the Business Partner
	*/
	public void setBPartnerValue (String BPartnerValue)
	{
		set_Value (COLUMNNAME_BPartnerValue, BPartnerValue);
	}

	/** Get Business Partner Key.
		@return Key of the Business Partner
	  */
	public String getBPartnerValue()
	{
		return (String)get_Value(COLUMNNAME_BPartnerValue);
	}

	/** Set Batch Description.
		@param BatchDescription Description of the Batch
	*/
	public void setBatchDescription (String BatchDescription)
	{
		set_Value (COLUMNNAME_BatchDescription, BatchDescription);
	}

	/** Get Batch Description.
		@return Description of the Batch
	  */
	public String getBatchDescription()
	{
		return (String)get_Value(COLUMNNAME_BatchDescription);
	}

	/** Set Batch Document No.
		@param BatchDocumentNo Document Number of the Batch
	*/
	public void setBatchDocumentNo (String BatchDocumentNo)
	{
		set_Value (COLUMNNAME_BatchDocumentNo, BatchDocumentNo);
	}

	/** Get Batch Document No.
		@return Document Number of the Batch
	  */
	public String getBatchDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_BatchDocumentNo);
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

	public org.compiere.model.I_C_Activity getC_Activity() throws RuntimeException
	{
		return (org.compiere.model.I_C_Activity)MTable.get(getCtx(), org.compiere.model.I_C_Activity.Table_ID)
			.getPO(getC_Activity_ID(), get_TrxName());
	}

	/** Set Activity.
		@param C_Activity_ID Business Activity
	*/
	public void setC_Activity_ID (int C_Activity_ID)
	{
		if (C_Activity_ID < 1)
			set_Value (COLUMNNAME_C_Activity_ID, null);
		else
			set_Value (COLUMNNAME_C_Activity_ID, Integer.valueOf(C_Activity_ID));
	}

	/** Get Activity.
		@return Business Activity
	  */
	public int getC_Activity_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Activity_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Campaign getC_Campaign() throws RuntimeException
	{
		return (org.compiere.model.I_C_Campaign)MTable.get(getCtx(), org.compiere.model.I_C_Campaign.Table_ID)
			.getPO(getC_Campaign_ID(), get_TrxName());
	}

	/** Set Campaign.
		@param C_Campaign_ID Marketing Campaign
	*/
	public void setC_Campaign_ID (int C_Campaign_ID)
	{
		if (C_Campaign_ID < 1)
			set_Value (COLUMNNAME_C_Campaign_ID, null);
		else
			set_Value (COLUMNNAME_C_Campaign_ID, Integer.valueOf(C_Campaign_ID));
	}

	/** Get Campaign.
		@return Marketing Campaign
	  */
	public int getC_Campaign_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Campaign_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_ConversionType getC_ConversionType() throws RuntimeException
	{
		return (org.compiere.model.I_C_ConversionType)MTable.get(getCtx(), org.compiere.model.I_C_ConversionType.Table_ID)
			.getPO(getC_ConversionType_ID(), get_TrxName());
	}

	/** Set Currency Type.
		@param C_ConversionType_ID Currency Conversion Rate Type
	*/
	public void setC_ConversionType_ID (int C_ConversionType_ID)
	{
		if (C_ConversionType_ID < 1)
			set_Value (COLUMNNAME_C_ConversionType_ID, null);
		else
			set_Value (COLUMNNAME_C_ConversionType_ID, Integer.valueOf(C_ConversionType_ID));
	}

	/** Get Currency Type.
		@return Currency Conversion Rate Type
	  */
	public int getC_ConversionType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ConversionType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
	{
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_ID)
			.getPO(getC_DocType_ID(), get_TrxName());
	}

	/** Set Document Type.
		@param C_DocType_ID Document type or rules
	*/
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0)
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Location getC_LocFrom() throws RuntimeException
	{
		return (org.compiere.model.I_C_Location)MTable.get(getCtx(), org.compiere.model.I_C_Location.Table_ID)
			.getPO(getC_LocFrom_ID(), get_TrxName());
	}

	/** Set Location From.
		@param C_LocFrom_ID Location that inventory was moved from
	*/
	public void setC_LocFrom_ID (int C_LocFrom_ID)
	{
		if (C_LocFrom_ID < 1)
			set_Value (COLUMNNAME_C_LocFrom_ID, null);
		else
			set_Value (COLUMNNAME_C_LocFrom_ID, Integer.valueOf(C_LocFrom_ID));
	}

	/** Get Location From.
		@return Location that inventory was moved from
	  */
	public int getC_LocFrom_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LocFrom_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Location getC_LocTo() throws RuntimeException
	{
		return (org.compiere.model.I_C_Location)MTable.get(getCtx(), org.compiere.model.I_C_Location.Table_ID)
			.getPO(getC_LocTo_ID(), get_TrxName());
	}

	/** Set Location To.
		@param C_LocTo_ID Location that inventory was moved to
	*/
	public void setC_LocTo_ID (int C_LocTo_ID)
	{
		if (C_LocTo_ID < 1)
			set_Value (COLUMNNAME_C_LocTo_ID, null);
		else
			set_Value (COLUMNNAME_C_LocTo_ID, Integer.valueOf(C_LocTo_ID));
	}

	/** Get Location To.
		@return Location that inventory was moved to
	  */
	public int getC_LocTo_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LocTo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Period getC_Period() throws RuntimeException
	{
		return (org.compiere.model.I_C_Period)MTable.get(getCtx(), org.compiere.model.I_C_Period.Table_ID)
			.getPO(getC_Period_ID(), get_TrxName());
	}

	/** Set Period.
		@param C_Period_ID Period of the Calendar
	*/
	public void setC_Period_ID (int C_Period_ID)
	{
		if (C_Period_ID < 1)
			set_Value (COLUMNNAME_C_Period_ID, null);
		else
			set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
	}

	/** Get Period.
		@return Period of the Calendar
	  */
	public int getC_Period_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Project getC_Project() throws RuntimeException
	{
		return (org.compiere.model.I_C_Project)MTable.get(getCtx(), org.compiere.model.I_C_Project.Table_ID)
			.getPO(getC_Project_ID(), get_TrxName());
	}

	/** Set Project.
		@param C_Project_ID Financial Project
	*/
	public void setC_Project_ID (int C_Project_ID)
	{
		if (C_Project_ID < 1)
			set_Value (COLUMNNAME_C_Project_ID, null);
		else
			set_Value (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
	}

	/** Get Project.
		@return Financial Project
	  */
	public int getC_Project_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_SalesRegion getC_SalesRegion() throws RuntimeException
	{
		return (org.compiere.model.I_C_SalesRegion)MTable.get(getCtx(), org.compiere.model.I_C_SalesRegion.Table_ID)
			.getPO(getC_SalesRegion_ID(), get_TrxName());
	}

	/** Set Sales Region.
		@param C_SalesRegion_ID Sales coverage region
	*/
	public void setC_SalesRegion_ID (int C_SalesRegion_ID)
	{
		if (C_SalesRegion_ID < 1)
			set_Value (COLUMNNAME_C_SalesRegion_ID, null);
		else
			set_Value (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
	}

	/** Get Sales Region.
		@return Sales coverage region
	  */
	public int getC_SalesRegion_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
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

	public org.compiere.model.I_C_ValidCombination getC_ValidCombination() throws RuntimeException
	{
		return (org.compiere.model.I_C_ValidCombination)MTable.get(getCtx(), org.compiere.model.I_C_ValidCombination.Table_ID)
			.getPO(getC_ValidCombination_ID(), get_TrxName());
	}

	/** Set Combination.
		@param C_ValidCombination_ID Valid Account Combination
	*/
	public void setC_ValidCombination_ID (int C_ValidCombination_ID)
	{
		if (C_ValidCombination_ID < 1)
			set_Value (COLUMNNAME_C_ValidCombination_ID, null);
		else
			set_Value (COLUMNNAME_C_ValidCombination_ID, Integer.valueOf(C_ValidCombination_ID));
	}

	/** Get Combination.
		@return Valid Account Combination
	  */
	public int getC_ValidCombination_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ValidCombination_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Campaign Key.
		@param CampaignValue Text key of the Campaign
	*/
	public void setCampaignValue (String CampaignValue)
	{
		set_Value (COLUMNNAME_CampaignValue, CampaignValue);
	}

	/** Get Campaign Key.
		@return Text key of the Campaign
	  */
	public String getCampaignValue()
	{
		return (String)get_Value(COLUMNNAME_CampaignValue);
	}

	/** Set Category Name.
		@param CategoryName Name of the Category
	*/
	public void setCategoryName (String CategoryName)
	{
		set_Value (COLUMNNAME_CategoryName, CategoryName);
	}

	/** Get Category Name.
		@return Name of the Category
	  */
	public String getCategoryName()
	{
		return (String)get_Value(COLUMNNAME_CategoryName);
	}

	/** Set Tenant Key.
		@param ClientValue Key of the Tenant
	*/
	public void setClientValue (String ClientValue)
	{
		set_Value (COLUMNNAME_ClientValue, ClientValue);
	}

	/** Get Tenant Key.
		@return Key of the Tenant
	  */
	public String getClientValue()
	{
		return (String)get_Value(COLUMNNAME_ClientValue);
	}

	/** Set Currency Type Key.
		@param ConversionTypeValue Key value for the Currency Conversion Rate Type
	*/
	public void setConversionTypeValue (String ConversionTypeValue)
	{
		set_Value (COLUMNNAME_ConversionTypeValue, ConversionTypeValue);
	}

	/** Get Currency Type Key.
		@return Key value for the Currency Conversion Rate Type
	  */
	public String getConversionTypeValue()
	{
		return (String)get_Value(COLUMNNAME_ConversionTypeValue);
	}

	/** Set Rate.
		@param CurrencyRate Currency Conversion Rate
	*/
	public void setCurrencyRate (BigDecimal CurrencyRate)
	{
		set_Value (COLUMNNAME_CurrencyRate, CurrencyRate);
	}

	/** Get Rate.
		@return Currency Conversion Rate
	  */
	public BigDecimal getCurrencyRate()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrencyRate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Document Type Name.
		@param DocTypeName Name of the Document Type
	*/
	public void setDocTypeName (String DocTypeName)
	{
		set_Value (COLUMNNAME_DocTypeName, DocTypeName);
	}

	/** Get Document Type Name.
		@return Name of the Document Type
	  */
	public String getDocTypeName()
	{
		return (String)get_Value(COLUMNNAME_DocTypeName);
	}

	public org.compiere.model.I_GL_Budget getGL_Budget() throws RuntimeException
	{
		return (org.compiere.model.I_GL_Budget)MTable.get(getCtx(), org.compiere.model.I_GL_Budget.Table_ID)
			.getPO(getGL_Budget_ID(), get_TrxName());
	}

	/** Set Budget.
		@param GL_Budget_ID General Ledger Budget
	*/
	public void setGL_Budget_ID (int GL_Budget_ID)
	{
		if (GL_Budget_ID < 1)
			set_Value (COLUMNNAME_GL_Budget_ID, null);
		else
			set_Value (COLUMNNAME_GL_Budget_ID, Integer.valueOf(GL_Budget_ID));
	}

	/** Get Budget.
		@return General Ledger Budget
	  */
	public int getGL_Budget_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_Budget_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_GL_Category getGL_Category() throws RuntimeException
	{
		return (org.compiere.model.I_GL_Category)MTable.get(getCtx(), org.compiere.model.I_GL_Category.Table_ID)
			.getPO(getGL_Category_ID(), get_TrxName());
	}

	/** Set GL Category.
		@param GL_Category_ID General Ledger Category
	*/
	public void setGL_Category_ID (int GL_Category_ID)
	{
		if (GL_Category_ID < 1)
			set_Value (COLUMNNAME_GL_Category_ID, null);
		else
			set_Value (COLUMNNAME_GL_Category_ID, Integer.valueOf(GL_Category_ID));
	}

	/** Get GL Category.
		@return General Ledger Category
	  */
	public int getGL_Category_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_Category_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_GL_JournalBatch getGL_JournalBatch() throws RuntimeException
	{
		return (org.compiere.model.I_GL_JournalBatch)MTable.get(getCtx(), org.compiere.model.I_GL_JournalBatch.Table_ID)
			.getPO(getGL_JournalBatch_ID(), get_TrxName());
	}

	/** Set Journal Batch.
		@param GL_JournalBatch_ID General Ledger Journal Batch
	*/
	public void setGL_JournalBatch_ID (int GL_JournalBatch_ID)
	{
		if (GL_JournalBatch_ID < 1)
			set_Value (COLUMNNAME_GL_JournalBatch_ID, null);
		else
			set_Value (COLUMNNAME_GL_JournalBatch_ID, Integer.valueOf(GL_JournalBatch_ID));
	}

	/** Get Journal Batch.
		@return General Ledger Journal Batch
	  */
	public int getGL_JournalBatch_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalBatch_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_GL_JournalLine getGL_JournalLine() throws RuntimeException
	{
		return (org.compiere.model.I_GL_JournalLine)MTable.get(getCtx(), org.compiere.model.I_GL_JournalLine.Table_ID)
			.getPO(getGL_JournalLine_ID(), get_TrxName());
	}

	/** Set Journal Line.
		@param GL_JournalLine_ID General Ledger Journal Line
	*/
	public void setGL_JournalLine_ID (int GL_JournalLine_ID)
	{
		if (GL_JournalLine_ID < 1)
			set_Value (COLUMNNAME_GL_JournalLine_ID, null);
		else
			set_Value (COLUMNNAME_GL_JournalLine_ID, Integer.valueOf(GL_JournalLine_ID));
	}

	/** Get Journal Line.
		@return General Ledger Journal Line
	  */
	public int getGL_JournalLine_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_GL_Journal getGL_Journal() throws RuntimeException
	{
		return (org.compiere.model.I_GL_Journal)MTable.get(getCtx(), org.compiere.model.I_GL_Journal.Table_ID)
			.getPO(getGL_Journal_ID(), get_TrxName());
	}

	/** Set Journal.
		@param GL_Journal_ID General Ledger Journal
	*/
	public void setGL_Journal_ID (int GL_Journal_ID)
	{
		if (GL_Journal_ID < 1)
			set_Value (COLUMNNAME_GL_Journal_ID, null);
		else
			set_Value (COLUMNNAME_GL_Journal_ID, Integer.valueOf(GL_Journal_ID));
	}

	/** Get Journal.
		@return General Ledger Journal
	  */
	public int getGL_Journal_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_Journal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Import GL Journal.
		@param I_GLJournal_ID Import General Ledger Journal
	*/
	public void setI_GLJournal_ID (int I_GLJournal_ID)
	{
		if (I_GLJournal_ID < 1)
			set_ValueNoCheck (COLUMNNAME_I_GLJournal_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_I_GLJournal_ID, Integer.valueOf(I_GLJournal_ID));
	}

	/** Get Import GL Journal.
		@return Import General Ledger Journal
	  */
	public int getI_GLJournal_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_I_GLJournal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getI_GLJournal_ID()));
    }

	/** Set I_GLJournal_UU.
		@param I_GLJournal_UU I_GLJournal_UU
	*/
	public void setI_GLJournal_UU (String I_GLJournal_UU)
	{
		set_Value (COLUMNNAME_I_GLJournal_UU, I_GLJournal_UU);
	}

	/** Get I_GLJournal_UU.
		@return I_GLJournal_UU	  */
	public String getI_GLJournal_UU()
	{
		return (String)get_Value(COLUMNNAME_I_GLJournal_UU);
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

	/** Set Create New Batch.
		@param IsCreateNewBatch If selected a new batch is created
	*/
	public void setIsCreateNewBatch (boolean IsCreateNewBatch)
	{
		set_Value (COLUMNNAME_IsCreateNewBatch, Boolean.valueOf(IsCreateNewBatch));
	}

	/** Get Create New Batch.
		@return If selected a new batch is created
	  */
	public boolean isCreateNewBatch()
	{
		Object oo = get_Value(COLUMNNAME_IsCreateNewBatch);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Create New Journal.
		@param IsCreateNewJournal If selected a new journal within the batch is created
	*/
	public void setIsCreateNewJournal (boolean IsCreateNewJournal)
	{
		set_Value (COLUMNNAME_IsCreateNewJournal, Boolean.valueOf(IsCreateNewJournal));
	}

	/** Get Create New Journal.
		@return If selected a new journal within the batch is created
	  */
	public boolean isCreateNewJournal()
	{
		Object oo = get_Value(COLUMNNAME_IsCreateNewJournal);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Journal Document No.
		@param JournalDocumentNo Document number of the Journal
	*/
	public void setJournalDocumentNo (String JournalDocumentNo)
	{
		set_Value (COLUMNNAME_JournalDocumentNo, JournalDocumentNo);
	}

	/** Get Journal Document No.
		@return Document number of the Journal
	  */
	public String getJournalDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_JournalDocumentNo);
	}

	/** Set Line No.
		@param Line Unique line for this document
	*/
	public void setLine (int Line)
	{
		set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
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

	/** Set Trx Org Key.
		@param OrgTrxValue Key of the Transaction Organization
	*/
	public void setOrgTrxValue (String OrgTrxValue)
	{
		set_Value (COLUMNNAME_OrgTrxValue, OrgTrxValue);
	}

	/** Get Trx Org Key.
		@return Key of the Transaction Organization
	  */
	public String getOrgTrxValue()
	{
		return (String)get_Value(COLUMNNAME_OrgTrxValue);
	}

	/** Set Org Key.
		@param OrgValue Key of the Organization
	*/
	public void setOrgValue (String OrgValue)
	{
		set_Value (COLUMNNAME_OrgValue, OrgValue);
	}

	/** Get Org Key.
		@return Key of the Organization
	  */
	public String getOrgValue()
	{
		return (String)get_Value(COLUMNNAME_OrgValue);
	}

	/** PostingType AD_Reference_ID=125 */
	public static final int POSTINGTYPE_AD_Reference_ID=125;
	/** Actual = A */
	public static final String POSTINGTYPE_Actual = "A";
	/** Budget = B */
	public static final String POSTINGTYPE_Budget = "B";
	/** Commitment = E */
	public static final String POSTINGTYPE_Commitment = "E";
	/** Reservation = R */
	public static final String POSTINGTYPE_Reservation = "R";
	/** Statistical = S */
	public static final String POSTINGTYPE_Statistical = "S";
	/** Set Posting Type.
		@param PostingType The type of posted amount for the transaction
	*/
	public void setPostingType (String PostingType)
	{

		set_Value (COLUMNNAME_PostingType, PostingType);
	}

	/** Get Posting Type.
		@return The type of posted amount for the transaction
	  */
	public String getPostingType()
	{
		return (String)get_Value(COLUMNNAME_PostingType);
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

	/** Set Project Key.
		@param ProjectValue Key of the Project
	*/
	public void setProjectValue (String ProjectValue)
	{
		set_Value (COLUMNNAME_ProjectValue, ProjectValue);
	}

	/** Get Project Key.
		@return Key of the Project
	  */
	public String getProjectValue()
	{
		return (String)get_Value(COLUMNNAME_ProjectValue);
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

	/** Set SKU.
		@param SKU Stock Keeping Unit
	*/
	public void setSKU (String SKU)
	{
		set_Value (COLUMNNAME_SKU, SKU);
	}

	/** Get SKU.
		@return Stock Keeping Unit
	  */
	public String getSKU()
	{
		return (String)get_Value(COLUMNNAME_SKU);
	}

	/** Set Sales Region Key.
		@param SalesRegionValue Text key of the Sales Region
	*/
	public void setSalesRegionValue (String SalesRegionValue)
	{
		set_Value (COLUMNNAME_SalesRegionValue, SalesRegionValue);
	}

	/** Get Sales Region Key.
		@return Text key of the Sales Region
	  */
	public String getSalesRegionValue()
	{
		return (String)get_Value(COLUMNNAME_SalesRegionValue);
	}

	/** Set UPC/EAN.
		@param UPC Bar Code (Universal Product Code or its superset European Article Number)
	*/
	public void setUPC (String UPC)
	{
		set_Value (COLUMNNAME_UPC, UPC);
	}

	/** Get UPC/EAN.
		@return Bar Code (Universal Product Code or its superset European Article Number)
	  */
	public String getUPC()
	{
		return (String)get_Value(COLUMNNAME_UPC);
	}

	public org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException
	{
		return (org.compiere.model.I_C_ElementValue)MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_ID)
			.getPO(getUser1_ID(), get_TrxName());
	}

	/** Set User Element List 1.
		@param User1_ID User defined list element #1
	*/
	public void setUser1_ID (int User1_ID)
	{
		if (User1_ID < 1)
			set_Value (COLUMNNAME_User1_ID, null);
		else
			set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
	}

	/** Get User Element List 1.
		@return User defined list element #1
	  */
	public int getUser1_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException
	{
		return (org.compiere.model.I_C_ElementValue)MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_ID)
			.getPO(getUser2_ID(), get_TrxName());
	}

	/** Set User Element List 2.
		@param User2_ID User defined list element #2
	*/
	public void setUser2_ID (int User2_ID)
	{
		if (User2_ID < 1)
			set_Value (COLUMNNAME_User2_ID, null);
		else
			set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
	}

	/** Get User Element List 2.
		@return User defined list element #2
	  */
	public int getUser2_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}