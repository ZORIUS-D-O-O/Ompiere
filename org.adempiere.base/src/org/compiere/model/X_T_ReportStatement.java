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
import org.compiere.util.ValueNamePair;

/** Generated Model for T_ReportStatement
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="T_ReportStatement")
public class X_T_ReportStatement extends PO implements I_T_ReportStatement, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_T_ReportStatement (Properties ctx, String T_ReportStatement_UU, String trxName)
    {
      super (ctx, T_ReportStatement_UU, trxName);
      /** if (T_ReportStatement_UU == null)
        {
			setAD_PInstance_ID (0);
			setDateAcct (new Timestamp( System.currentTimeMillis() ));
			setFact_Acct_ID (0);
			setLevelNo (0);
        } */
    }

    /** Standard Constructor */
    public X_T_ReportStatement (Properties ctx, String T_ReportStatement_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, T_ReportStatement_UU, trxName, virtualColumns);
      /** if (T_ReportStatement_UU == null)
        {
			setAD_PInstance_ID (0);
			setDateAcct (new Timestamp( System.currentTimeMillis() ));
			setFact_Acct_ID (0);
			setLevelNo (0);
        } */
    }

    /** Load Constructor */
    public X_T_ReportStatement (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System
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
      StringBuilder sb = new StringBuilder ("X_T_ReportStatement[")
        .append(get_UUID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_PInstance getAD_PInstance() throws RuntimeException
	{
		return (org.compiere.model.I_AD_PInstance)MTable.get(getCtx(), org.compiere.model.I_AD_PInstance.Table_ID)
			.getPO(getAD_PInstance_ID(), get_TrxName());
	}

	/** Set Process Instance.
		@param AD_PInstance_ID Instance of the process
	*/
	public void setAD_PInstance_ID (int AD_PInstance_ID)
	{
		if (AD_PInstance_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
	}

	/** Get Process Instance.
		@return Instance of the process
	  */
	public int getAD_PInstance_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Accounted Credit.
		@param AmtAcctCr Accounted Credit Amount
	*/
	public void setAmtAcctCr (BigDecimal AmtAcctCr)
	{
		set_ValueNoCheck (COLUMNNAME_AmtAcctCr, AmtAcctCr);
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
		set_ValueNoCheck (COLUMNNAME_AmtAcctDr, AmtAcctDr);
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

	/** Set Balance.
		@param Balance Balance
	*/
	public void setBalance (BigDecimal Balance)
	{
		set_ValueNoCheck (COLUMNNAME_Balance, Balance);
	}

	/** Get Balance.
		@return Balance	  */
	public BigDecimal getBalance()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Balance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Account Date.
		@param DateAcct Accounting Date
	*/
	public void setDateAcct (Timestamp DateAcct)
	{
		set_ValueNoCheck (COLUMNNAME_DateAcct, DateAcct);
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
		set_ValueNoCheck (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	public org.compiere.model.I_Fact_Acct getFact_Acct() throws RuntimeException
	{
		return (org.compiere.model.I_Fact_Acct)MTable.get(getCtx(), org.compiere.model.I_Fact_Acct.Table_ID)
			.getPO(getFact_Acct_ID(), get_TrxName());
	}

	/** Set Accounting Fact.
		@param Fact_Acct_ID Accounting Fact
	*/
	public void setFact_Acct_ID (int Fact_Acct_ID)
	{
		if (Fact_Acct_ID < 1)
			set_ValueNoCheck (COLUMNNAME_Fact_Acct_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_Fact_Acct_ID, Integer.valueOf(Fact_Acct_ID));
	}

	/** Get Accounting Fact.
		@return Accounting Fact	  */
	public int getFact_Acct_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Fact_Acct_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Level no.
		@param LevelNo Level no
	*/
	public void setLevelNo (int LevelNo)
	{
		set_ValueNoCheck (COLUMNNAME_LevelNo, Integer.valueOf(LevelNo));
	}

	/** Get Level no.
		@return Level no	  */
	public int getLevelNo()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LevelNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_ValueNoCheck (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record UU/ColumnName
        @return UU/ColumnName pair
      */
    public ValueNamePair getValueNamePair()
    {
        return new ValueNamePair(get_UUID(), getName());
    }

	/** Set Quantity.
		@param Qty Quantity
	*/
	public void setQty (BigDecimal Qty)
	{
		set_ValueNoCheck (COLUMNNAME_Qty, Qty);
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

	/** Set T_ReportStatement_UU.
		@param T_ReportStatement_UU T_ReportStatement_UU
	*/
	public void setT_ReportStatement_UU (String T_ReportStatement_UU)
	{
		set_Value (COLUMNNAME_T_ReportStatement_UU, T_ReportStatement_UU);
	}

	/** Get T_ReportStatement_UU.
		@return T_ReportStatement_UU	  */
	public String getT_ReportStatement_UU()
	{
		return (String)get_Value(COLUMNNAME_T_ReportStatement_UU);
	}
}