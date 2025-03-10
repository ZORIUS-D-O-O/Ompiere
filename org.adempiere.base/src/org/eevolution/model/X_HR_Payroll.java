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
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for HR_Payroll
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="HR_Payroll")
public class X_HR_Payroll extends PO implements I_HR_Payroll, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_HR_Payroll (Properties ctx, int HR_Payroll_ID, String trxName)
    {
      super (ctx, HR_Payroll_ID, trxName);
      /** if (HR_Payroll_ID == 0)
        {
			setHR_Contract_ID (0);
			setHR_Payroll_ID (0);
			setName (null);
			setPaymentRule (null);
        } */
    }

    /** Standard Constructor */
    public X_HR_Payroll (Properties ctx, int HR_Payroll_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, HR_Payroll_ID, trxName, virtualColumns);
      /** if (HR_Payroll_ID == 0)
        {
			setHR_Contract_ID (0);
			setHR_Payroll_ID (0);
			setName (null);
			setPaymentRule (null);
        } */
    }

    /** Standard Constructor */
    public X_HR_Payroll (Properties ctx, String HR_Payroll_UU, String trxName)
    {
      super (ctx, HR_Payroll_UU, trxName);
      /** if (HR_Payroll_UU == null)
        {
			setHR_Contract_ID (0);
			setHR_Payroll_ID (0);
			setName (null);
			setPaymentRule (null);
        } */
    }

    /** Standard Constructor */
    public X_HR_Payroll (Properties ctx, String HR_Payroll_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, HR_Payroll_UU, trxName, virtualColumns);
      /** if (HR_Payroll_UU == null)
        {
			setHR_Contract_ID (0);
			setHR_Payroll_ID (0);
			setName (null);
			setPaymentRule (null);
        } */
    }

    /** Load Constructor */
    public X_HR_Payroll (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_HR_Payroll[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException
	{
		return (org.compiere.model.I_AD_PrintFormat)MTable.get(getCtx(), org.compiere.model.I_AD_PrintFormat.Table_ID)
			.getPO(getAD_PrintFormat_ID(), get_TrxName());
	}

	/** Set Print Format.
		@param AD_PrintFormat_ID Data Print Format
	*/
	public void setAD_PrintFormat_ID (int AD_PrintFormat_ID)
	{
		if (AD_PrintFormat_ID < 1)
			set_Value (COLUMNNAME_AD_PrintFormat_ID, null);
		else
			set_Value (COLUMNNAME_AD_PrintFormat_ID, Integer.valueOf(AD_PrintFormat_ID));
	}

	/** Get Print Format.
		@return Data Print Format
	  */
	public int getAD_PrintFormat_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Charge getC_Charge() throws RuntimeException
	{
		return (org.compiere.model.I_C_Charge)MTable.get(getCtx(), org.compiere.model.I_C_Charge.Table_ID)
			.getPO(getC_Charge_ID(), get_TrxName());
	}

	/** Set Charge.
		@param C_Charge_ID Additional document charges
	*/
	public void setC_Charge_ID (int C_Charge_ID)
	{
		if (C_Charge_ID < 1)
			set_Value (COLUMNNAME_C_Charge_ID, null);
		else
			set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
	}

	/** Get Charge.
		@return Additional document charges
	  */
	public int getC_Charge_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.eevolution.model.I_HR_Contract getHR_Contract() throws RuntimeException
	{
		return (org.eevolution.model.I_HR_Contract)MTable.get(getCtx(), org.eevolution.model.I_HR_Contract.Table_ID)
			.getPO(getHR_Contract_ID(), get_TrxName());
	}

	/** Set Payroll Contract.
		@param HR_Contract_ID Payroll Contract
	*/
	public void setHR_Contract_ID (int HR_Contract_ID)
	{
		if (HR_Contract_ID < 1)
			set_Value (COLUMNNAME_HR_Contract_ID, null);
		else
			set_Value (COLUMNNAME_HR_Contract_ID, Integer.valueOf(HR_Contract_ID));
	}

	/** Get Payroll Contract.
		@return Payroll Contract	  */
	public int getHR_Contract_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_Contract_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Payroll.
		@param HR_Payroll_ID Payroll
	*/
	public void setHR_Payroll_ID (int HR_Payroll_ID)
	{
		if (HR_Payroll_ID < 1)
			set_ValueNoCheck (COLUMNNAME_HR_Payroll_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_HR_Payroll_ID, Integer.valueOf(HR_Payroll_ID));
	}

	/** Get Payroll.
		@return Payroll	  */
	public int getHR_Payroll_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_Payroll_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HR_Payroll_UU.
		@param HR_Payroll_UU HR_Payroll_UU
	*/
	public void setHR_Payroll_UU (String HR_Payroll_UU)
	{
		set_Value (COLUMNNAME_HR_Payroll_UU, HR_Payroll_UU);
	}

	/** Get HR_Payroll_UU.
		@return HR_Payroll_UU	  */
	public String getHR_Payroll_UU()
	{
		return (String)get_Value(COLUMNNAME_HR_Payroll_UU);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** PaymentRule AD_Reference_ID=214 */
	public static final int PAYMENTRULE_AD_Reference_ID=214;
	/** Direct Deposit = A */
	public static final String PAYMENTRULE_DirectDeposit = "A";
	/** Credit Card = C */
	public static final String PAYMENTRULE_CreditCard = "C";
	/** Direct Debit = D */
	public static final String PAYMENTRULE_DirectDebit = "D";
	/** Check = K */
	public static final String PAYMENTRULE_Check = "K";
	/** Account = T */
	public static final String PAYMENTRULE_Account = "T";
	/** Cash = X */
	public static final String PAYMENTRULE_Cash = "X";
	/** Set Payment Rule.
		@param PaymentRule How you pay the invoice
	*/
	public void setPaymentRule (String PaymentRule)
	{

		set_Value (COLUMNNAME_PaymentRule, PaymentRule);
	}

	/** Get Payment Rule.
		@return How you pay the invoice
	  */
	public String getPaymentRule()
	{
		return (String)get_Value(COLUMNNAME_PaymentRule);
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
}