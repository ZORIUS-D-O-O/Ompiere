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

/** Generated Model for C_Project
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_Project")
public class X_C_Project extends PO implements I_C_Project, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_Project (Properties ctx, int C_Project_ID, String trxName)
    {
      super (ctx, C_Project_ID, trxName);
      /** if (C_Project_ID == 0)
        {
			setC_Currency_ID (0);
			setC_Project_ID (0);
			setCommittedAmt (Env.ZERO);
			setCommittedQty (Env.ZERO);
			setInvoicedAmt (Env.ZERO);
			setInvoicedQty (Env.ZERO);
			setIsCommitCeiling (false);
			setIsCommitment (false);
			setIsSummary (false);
			setName (null);
			setPlannedAmt (Env.ZERO);
			setPlannedMarginAmt (Env.ZERO);
			setPlannedQty (Env.ZERO);
			setProcessed (false);
			setProjInvoiceRule (null);
// -
			setProjectBalanceAmt (Env.ZERO);
			setProjectLineLevel (null);
// P
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_C_Project (Properties ctx, int C_Project_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Project_ID, trxName, virtualColumns);
      /** if (C_Project_ID == 0)
        {
			setC_Currency_ID (0);
			setC_Project_ID (0);
			setCommittedAmt (Env.ZERO);
			setCommittedQty (Env.ZERO);
			setInvoicedAmt (Env.ZERO);
			setInvoicedQty (Env.ZERO);
			setIsCommitCeiling (false);
			setIsCommitment (false);
			setIsSummary (false);
			setName (null);
			setPlannedAmt (Env.ZERO);
			setPlannedMarginAmt (Env.ZERO);
			setPlannedQty (Env.ZERO);
			setProcessed (false);
			setProjInvoiceRule (null);
// -
			setProjectBalanceAmt (Env.ZERO);
			setProjectLineLevel (null);
// P
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_C_Project (Properties ctx, String C_Project_UU, String trxName)
    {
      super (ctx, C_Project_UU, trxName);
      /** if (C_Project_UU == null)
        {
			setC_Currency_ID (0);
			setC_Project_ID (0);
			setCommittedAmt (Env.ZERO);
			setCommittedQty (Env.ZERO);
			setInvoicedAmt (Env.ZERO);
			setInvoicedQty (Env.ZERO);
			setIsCommitCeiling (false);
			setIsCommitment (false);
			setIsSummary (false);
			setName (null);
			setPlannedAmt (Env.ZERO);
			setPlannedMarginAmt (Env.ZERO);
			setPlannedQty (Env.ZERO);
			setProcessed (false);
			setProjInvoiceRule (null);
// -
			setProjectBalanceAmt (Env.ZERO);
			setProjectLineLevel (null);
// P
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_C_Project (Properties ctx, String C_Project_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Project_UU, trxName, virtualColumns);
      /** if (C_Project_UU == null)
        {
			setC_Currency_ID (0);
			setC_Project_ID (0);
			setCommittedAmt (Env.ZERO);
			setCommittedQty (Env.ZERO);
			setInvoicedAmt (Env.ZERO);
			setInvoicedQty (Env.ZERO);
			setIsCommitCeiling (false);
			setIsCommitment (false);
			setIsSummary (false);
			setName (null);
			setPlannedAmt (Env.ZERO);
			setPlannedMarginAmt (Env.ZERO);
			setPlannedQty (Env.ZERO);
			setProcessed (false);
			setProjInvoiceRule (null);
// -
			setProjectBalanceAmt (Env.ZERO);
			setProjectLineLevel (null);
// P
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_C_Project (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_Project[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set User/Contact.
		@param AD_User_ID User within the system - Internal or Business Partner Contact
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_Value (COLUMNNAME_AD_User_ID, null);
		else
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
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

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_ID)
			.getPO(getC_BPartner_Location_ID(), get_TrxName());
	}

	/** Set Partner Location.
		@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner
	*/
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		if (C_BPartner_Location_ID < 1)
			set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
	}

	/** Get Partner Location.
		@return Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
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

	public org.compiere.model.I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException
	{
		return (org.compiere.model.I_C_PaymentTerm)MTable.get(getCtx(), org.compiere.model.I_C_PaymentTerm.Table_ID)
			.getPO(getC_PaymentTerm_ID(), get_TrxName());
	}

	/** Set Payment Term.
		@param C_PaymentTerm_ID The terms of Payment (timing, discount)
	*/
	public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
	{
		if (C_PaymentTerm_ID < 1)
			set_Value (COLUMNNAME_C_PaymentTerm_ID, null);
		else
			set_Value (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
	}

	/** Get Payment Term.
		@return The terms of Payment (timing, discount)
	  */
	public int getC_PaymentTerm_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Phase getC_Phase() throws RuntimeException
	{
		return (org.compiere.model.I_C_Phase)MTable.get(getCtx(), org.compiere.model.I_C_Phase.Table_ID)
			.getPO(getC_Phase_ID(), get_TrxName());
	}

	/** Set Standard Phase.
		@param C_Phase_ID Standard Phase of the Project Type
	*/
	public void setC_Phase_ID (int C_Phase_ID)
	{
		if (C_Phase_ID < 1)
			set_Value (COLUMNNAME_C_Phase_ID, null);
		else
			set_Value (COLUMNNAME_C_Phase_ID, Integer.valueOf(C_Phase_ID));
	}

	/** Get Standard Phase.
		@return Standard Phase of the Project Type
	  */
	public int getC_Phase_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Phase_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Project Type.
		@param C_ProjectType_ID Type of the project
	*/
	public void setC_ProjectType_ID (int C_ProjectType_ID)
	{
		if (C_ProjectType_ID < 1)
			set_Value (COLUMNNAME_C_ProjectType_ID, null);
		else
			set_Value (COLUMNNAME_C_ProjectType_ID, Integer.valueOf(C_ProjectType_ID));
	}

	/** Get Project Type.
		@return Type of the project
	  */
	public int getC_ProjectType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Project.
		@param C_Project_ID Financial Project
	*/
	public void setC_Project_ID (int C_Project_ID)
	{
		if (C_Project_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Project_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
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

	/** Set C_Project_UU.
		@param C_Project_UU C_Project_UU
	*/
	public void setC_Project_UU (String C_Project_UU)
	{
		set_Value (COLUMNNAME_C_Project_UU, C_Project_UU);
	}

	/** Get C_Project_UU.
		@return C_Project_UU	  */
	public String getC_Project_UU()
	{
		return (String)get_Value(COLUMNNAME_C_Project_UU);
	}

	/** Set Committed Amount.
		@param CommittedAmt The (legal) commitment amount
	*/
	public void setCommittedAmt (BigDecimal CommittedAmt)
	{
		set_Value (COLUMNNAME_CommittedAmt, CommittedAmt);
	}

	/** Get Committed Amount.
		@return The (legal) commitment amount
	  */
	public BigDecimal getCommittedAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CommittedAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Committed Quantity.
		@param CommittedQty The (legal) commitment Quantity
	*/
	public void setCommittedQty (BigDecimal CommittedQty)
	{
		set_Value (COLUMNNAME_CommittedQty, CommittedQty);
	}

	/** Get Committed Quantity.
		@return The (legal) commitment Quantity
	  */
	public BigDecimal getCommittedQty()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CommittedQty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Copy From.
		@param CopyFrom Copy From Record
	*/
	public void setCopyFrom (String CopyFrom)
	{
		set_Value (COLUMNNAME_CopyFrom, CopyFrom);
	}

	/** Get Copy From.
		@return Copy From Record
	  */
	public String getCopyFrom()
	{
		return (String)get_Value(COLUMNNAME_CopyFrom);
	}

	/** Set Contract Date.
		@param DateContract The (planned) effective date of this document.
	*/
	public void setDateContract (Timestamp DateContract)
	{
		set_Value (COLUMNNAME_DateContract, DateContract);
	}

	/** Get Contract Date.
		@return The (planned) effective date of this document.
	  */
	public Timestamp getDateContract()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateContract);
	}

	/** Set Finish Date.
		@param DateFinish Finish or (planned) completion date
	*/
	public void setDateFinish (Timestamp DateFinish)
	{
		set_Value (COLUMNNAME_DateFinish, DateFinish);
	}

	/** Get Finish Date.
		@return Finish or (planned) completion date
	  */
	public Timestamp getDateFinish()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateFinish);
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

	/** Set Generate To.
		@param GenerateTo Generate To
	*/
	public void setGenerateTo (String GenerateTo)
	{
		set_Value (COLUMNNAME_GenerateTo, GenerateTo);
	}

	/** Get Generate To.
		@return Generate To
	  */
	public String getGenerateTo()
	{
		return (String)get_Value(COLUMNNAME_GenerateTo);
	}

	/** Set Invoiced Amount.
		@param InvoicedAmt The amount invoiced
	*/
	public void setInvoicedAmt (BigDecimal InvoicedAmt)
	{
		set_ValueNoCheck (COLUMNNAME_InvoicedAmt, InvoicedAmt);
	}

	/** Get Invoiced Amount.
		@return The amount invoiced
	  */
	public BigDecimal getInvoicedAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InvoicedAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Quantity Invoiced.
		@param InvoicedQty The quantity invoiced
	*/
	public void setInvoicedQty (BigDecimal InvoicedQty)
	{
		set_ValueNoCheck (COLUMNNAME_InvoicedQty, InvoicedQty);
	}

	/** Get Quantity Invoiced.
		@return The quantity invoiced
	  */
	public BigDecimal getInvoicedQty()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InvoicedQty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Commitment is Ceiling.
		@param IsCommitCeiling The commitment amount/quantity is the chargeable ceiling 
	*/
	public void setIsCommitCeiling (boolean IsCommitCeiling)
	{
		set_Value (COLUMNNAME_IsCommitCeiling, Boolean.valueOf(IsCommitCeiling));
	}

	/** Get Commitment is Ceiling.
		@return The commitment amount/quantity is the chargeable ceiling 
	  */
	public boolean isCommitCeiling()
	{
		Object oo = get_Value(COLUMNNAME_IsCommitCeiling);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Commitment.
		@param IsCommitment Is this document a (legal) commitment?
	*/
	public void setIsCommitment (boolean IsCommitment)
	{
		set_Value (COLUMNNAME_IsCommitment, Boolean.valueOf(IsCommitment));
	}

	/** Get Commitment.
		@return Is this document a (legal) commitment?
	  */
	public boolean isCommitment()
	{
		Object oo = get_Value(COLUMNNAME_IsCommitment);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Summary Level.
		@param IsSummary This is a summary entity
	*/
	public void setIsSummary (boolean IsSummary)
	{
		set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
	}

	/** Get Summary Level.
		@return This is a summary entity
	  */
	public boolean isSummary()
	{
		Object oo = get_Value(COLUMNNAME_IsSummary);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	public org.compiere.model.I_M_PriceList_Version getM_PriceList_Version() throws RuntimeException
	{
		return (org.compiere.model.I_M_PriceList_Version)MTable.get(getCtx(), org.compiere.model.I_M_PriceList_Version.Table_ID)
			.getPO(getM_PriceList_Version_ID(), get_TrxName());
	}

	/** Set Price List Version.
		@param M_PriceList_Version_ID Identifies a unique instance of a Price List
	*/
	public void setM_PriceList_Version_ID (int M_PriceList_Version_ID)
	{
		if (M_PriceList_Version_ID < 1)
			set_Value (COLUMNNAME_M_PriceList_Version_ID, null);
		else
			set_Value (COLUMNNAME_M_PriceList_Version_ID, Integer.valueOf(M_PriceList_Version_ID));
	}

	/** Get Price List Version.
		@return Identifies a unique instance of a Price List
	  */
	public int getM_PriceList_Version_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_Version_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException
	{
		return (org.compiere.model.I_M_Warehouse)MTable.get(getCtx(), org.compiere.model.I_M_Warehouse.Table_ID)
			.getPO(getM_Warehouse_ID(), get_TrxName());
	}

	/** Set Warehouse.
		@param M_Warehouse_ID Storage Warehouse and Service Point
	*/
	public void setM_Warehouse_ID (int M_Warehouse_ID)
	{
		if (M_Warehouse_ID < 1)
			set_Value (COLUMNNAME_M_Warehouse_ID, null);
		else
			set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
	}

	/** Get Warehouse.
		@return Storage Warehouse and Service Point
	  */
	public int getM_Warehouse_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
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

	/** Set Note.
		@param Note Optional additional user defined information
	*/
	public void setNote (String Note)
	{
		set_Value (COLUMNNAME_Note, Note);
	}

	/** Get Note.
		@return Optional additional user defined information
	  */
	public String getNote()
	{
		return (String)get_Value(COLUMNNAME_Note);
	}

	/** Set Order Reference.
		@param POReference Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	*/
	public void setPOReference (String POReference)
	{
		set_Value (COLUMNNAME_POReference, POReference);
	}

	/** Get Order Reference.
		@return Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	  */
	public String getPOReference()
	{
		return (String)get_Value(COLUMNNAME_POReference);
	}

	/** Set Planned Amount.
		@param PlannedAmt Planned amount for this project
	*/
	public void setPlannedAmt (BigDecimal PlannedAmt)
	{
		set_Value (COLUMNNAME_PlannedAmt, PlannedAmt);
	}

	/** Get Planned Amount.
		@return Planned amount for this project
	  */
	public BigDecimal getPlannedAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Planned Margin.
		@param PlannedMarginAmt Project&#039;s planned margin amount
	*/
	public void setPlannedMarginAmt (BigDecimal PlannedMarginAmt)
	{
		set_Value (COLUMNNAME_PlannedMarginAmt, PlannedMarginAmt);
	}

	/** Get Planned Margin.
		@return Project&#039;s planned margin amount
	  */
	public BigDecimal getPlannedMarginAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedMarginAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Planned Quantity.
		@param PlannedQty Planned quantity for this project
	*/
	public void setPlannedQty (BigDecimal PlannedQty)
	{
		set_Value (COLUMNNAME_PlannedQty, PlannedQty);
	}

	/** Get Planned Quantity.
		@return Planned quantity for this project
	  */
	public BigDecimal getPlannedQty()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PlannedQty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** ProjInvoiceRule AD_Reference_ID=383 */
	public static final int PROJINVOICERULE_AD_Reference_ID=383;
	/** None = - */
	public static final String PROJINVOICERULE_None = "-";
	/** Committed Amount = C */
	public static final String PROJINVOICERULE_CommittedAmount = "C";
	/** Product  Quantity = P */
	public static final String PROJINVOICERULE_ProductQuantity = "P";
	/** Time&amp;Material = T */
	public static final String PROJINVOICERULE_TimeMaterial = "T";
	/** Time&amp;Material max Committed = c */
	public static final String PROJINVOICERULE_TimeMaterialMaxCommitted = "c";
	/** Set Invoice Rule.
		@param ProjInvoiceRule Invoice Rule for the project
	*/
	public void setProjInvoiceRule (String ProjInvoiceRule)
	{

		set_Value (COLUMNNAME_ProjInvoiceRule, ProjInvoiceRule);
	}

	/** Get Invoice Rule.
		@return Invoice Rule for the project
	  */
	public String getProjInvoiceRule()
	{
		return (String)get_Value(COLUMNNAME_ProjInvoiceRule);
	}

	/** Set Project Balance.
		@param ProjectBalanceAmt Total Project Balance
	*/
	public void setProjectBalanceAmt (BigDecimal ProjectBalanceAmt)
	{
		set_Value (COLUMNNAME_ProjectBalanceAmt, ProjectBalanceAmt);
	}

	/** Get Project Balance.
		@return Total Project Balance
	  */
	public BigDecimal getProjectBalanceAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ProjectBalanceAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** ProjectCategory AD_Reference_ID=288 */
	public static final int PROJECTCATEGORY_AD_Reference_ID=288;
	/** Asset Project = A */
	public static final String PROJECTCATEGORY_AssetProject = "A";
	/** General = N */
	public static final String PROJECTCATEGORY_General = "N";
	/** Service (Charge) Project = S */
	public static final String PROJECTCATEGORY_ServiceChargeProject = "S";
	/** Work Order (Job) = W */
	public static final String PROJECTCATEGORY_WorkOrderJob = "W";
	/** Set Project Category.
		@param ProjectCategory Project Category
	*/
	public void setProjectCategory (String ProjectCategory)
	{

		set_Value (COLUMNNAME_ProjectCategory, ProjectCategory);
	}

	/** Get Project Category.
		@return Project Category
	  */
	public String getProjectCategory()
	{
		return (String)get_Value(COLUMNNAME_ProjectCategory);
	}

	/** ProjectLineLevel AD_Reference_ID=384 */
	public static final int PROJECTLINELEVEL_AD_Reference_ID=384;
	/** Phase = A */
	public static final String PROJECTLINELEVEL_Phase = "A";
	/** Project = P */
	public static final String PROJECTLINELEVEL_Project = "P";
	/** Task = T */
	public static final String PROJECTLINELEVEL_Task = "T";
	/** Set Line Level.
		@param ProjectLineLevel Project Line Level
	*/
	public void setProjectLineLevel (String ProjectLineLevel)
	{

		set_Value (COLUMNNAME_ProjectLineLevel, ProjectLineLevel);
	}

	/** Get Line Level.
		@return Project Line Level
	  */
	public String getProjectLineLevel()
	{
		return (String)get_Value(COLUMNNAME_ProjectLineLevel);
	}

	public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getSalesRep_ID(), get_TrxName());
	}

	/** Set Sales Representative.
		@param SalesRep_ID Sales Representative or Company Agent
	*/
	public void setSalesRep_ID (int SalesRep_ID)
	{
		if (SalesRep_ID < 1)
			set_Value (COLUMNNAME_SalesRep_ID, null);
		else
			set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
	}

	/** Get Sales Representative.
		@return Sales Representative or Company Agent
	  */
	public int getSalesRep_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getValue());
    }
}