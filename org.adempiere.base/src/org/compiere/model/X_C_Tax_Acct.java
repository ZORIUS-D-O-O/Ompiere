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

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for C_Tax_Acct
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_Tax_Acct")
public class X_C_Tax_Acct extends PO implements I_C_Tax_Acct, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_Tax_Acct (Properties ctx, int C_Tax_Acct_ID, String trxName)
    {
      super (ctx, C_Tax_Acct_ID, trxName);
      /** if (C_Tax_Acct_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setC_Tax_ID (0);
			setT_Credit_Acct (0);
			setT_Due_Acct (0);
			setT_Expense_Acct (0);
        } */
    }

    /** Standard Constructor */
    public X_C_Tax_Acct (Properties ctx, int C_Tax_Acct_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Tax_Acct_ID, trxName, virtualColumns);
      /** if (C_Tax_Acct_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setC_Tax_ID (0);
			setT_Credit_Acct (0);
			setT_Due_Acct (0);
			setT_Expense_Acct (0);
        } */
    }

    /** Standard Constructor */
    public X_C_Tax_Acct (Properties ctx, String C_Tax_Acct_UU, String trxName)
    {
      super (ctx, C_Tax_Acct_UU, trxName);
      /** if (C_Tax_Acct_UU == null)
        {
			setC_AcctSchema_ID (0);
			setC_Tax_ID (0);
			setT_Credit_Acct (0);
			setT_Due_Acct (0);
			setT_Expense_Acct (0);
        } */
    }

    /** Standard Constructor */
    public X_C_Tax_Acct (Properties ctx, String C_Tax_Acct_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Tax_Acct_UU, trxName, virtualColumns);
      /** if (C_Tax_Acct_UU == null)
        {
			setC_AcctSchema_ID (0);
			setC_Tax_ID (0);
			setT_Credit_Acct (0);
			setT_Due_Acct (0);
			setT_Expense_Acct (0);
        } */
    }

    /** Load Constructor */
    public X_C_Tax_Acct (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_Tax_Acct[")
        .append(get_UUID()).append("]");
      return sb.toString();
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
			set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
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

	/** Set C_Tax_Acct_UU.
		@param C_Tax_Acct_UU C_Tax_Acct_UU
	*/
	public void setC_Tax_Acct_UU (String C_Tax_Acct_UU)
	{
		set_Value (COLUMNNAME_C_Tax_Acct_UU, C_Tax_Acct_UU);
	}

	/** Get C_Tax_Acct_UU.
		@return C_Tax_Acct_UU	  */
	public String getC_Tax_Acct_UU()
	{
		return (String)get_Value(COLUMNNAME_C_Tax_Acct_UU);
	}

	public org.compiere.model.I_C_Tax getC_Tax() throws RuntimeException
	{
		return (org.compiere.model.I_C_Tax)MTable.get(getCtx(), org.compiere.model.I_C_Tax.Table_ID)
			.getPO(getC_Tax_ID(), get_TrxName());
	}

	/** Set Tax.
		@param C_Tax_ID Tax identifier
	*/
	public void setC_Tax_ID (int C_Tax_ID)
	{
		if (C_Tax_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Tax_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
	}

	/** Get Tax.
		@return Tax identifier
	  */
	public int getC_Tax_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getT_Credit_A() throws RuntimeException
	{
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_ID)
			.getPO(getT_Credit_Acct(), get_TrxName());
	}

	/** Set Tax Credit.
		@param T_Credit_Acct Account for Tax you can reclaim
	*/
	public void setT_Credit_Acct (int T_Credit_Acct)
	{
		set_Value (COLUMNNAME_T_Credit_Acct, Integer.valueOf(T_Credit_Acct));
	}

	/** Get Tax Credit.
		@return Account for Tax you can reclaim
	  */
	public int getT_Credit_Acct()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_T_Credit_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getT_Due_A() throws RuntimeException
	{
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_ID)
			.getPO(getT_Due_Acct(), get_TrxName());
	}

	/** Set Tax Due.
		@param T_Due_Acct Account for Tax you have to pay
	*/
	public void setT_Due_Acct (int T_Due_Acct)
	{
		set_Value (COLUMNNAME_T_Due_Acct, Integer.valueOf(T_Due_Acct));
	}

	/** Get Tax Due.
		@return Account for Tax you have to pay
	  */
	public int getT_Due_Acct()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_T_Due_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getT_Expense_A() throws RuntimeException
	{
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_ID)
			.getPO(getT_Expense_Acct(), get_TrxName());
	}

	/** Set Tax Expense.
		@param T_Expense_Acct Account for paid tax you cannot reclaim
	*/
	public void setT_Expense_Acct (int T_Expense_Acct)
	{
		set_Value (COLUMNNAME_T_Expense_Acct, Integer.valueOf(T_Expense_Acct));
	}

	/** Get Tax Expense.
		@return Account for paid tax you cannot reclaim
	  */
	public int getT_Expense_Acct()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_T_Expense_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}