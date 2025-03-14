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

/** Generated Model for C_Project_Acct
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_Project_Acct")
public class X_C_Project_Acct extends PO implements I_C_Project_Acct, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_Project_Acct (Properties ctx, int C_Project_Acct_ID, String trxName)
    {
      super (ctx, C_Project_Acct_ID, trxName);
      /** if (C_Project_Acct_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setC_Project_ID (0);
			setPJ_Asset_Acct (0);
			setPJ_WIP_Acct (0);
        } */
    }

    /** Standard Constructor */
    public X_C_Project_Acct (Properties ctx, int C_Project_Acct_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Project_Acct_ID, trxName, virtualColumns);
      /** if (C_Project_Acct_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setC_Project_ID (0);
			setPJ_Asset_Acct (0);
			setPJ_WIP_Acct (0);
        } */
    }

    /** Standard Constructor */
    public X_C_Project_Acct (Properties ctx, String C_Project_Acct_UU, String trxName)
    {
      super (ctx, C_Project_Acct_UU, trxName);
      /** if (C_Project_Acct_UU == null)
        {
			setC_AcctSchema_ID (0);
			setC_Project_ID (0);
			setPJ_Asset_Acct (0);
			setPJ_WIP_Acct (0);
        } */
    }

    /** Standard Constructor */
    public X_C_Project_Acct (Properties ctx, String C_Project_Acct_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Project_Acct_UU, trxName, virtualColumns);
      /** if (C_Project_Acct_UU == null)
        {
			setC_AcctSchema_ID (0);
			setC_Project_ID (0);
			setPJ_Asset_Acct (0);
			setPJ_WIP_Acct (0);
        } */
    }

    /** Load Constructor */
    public X_C_Project_Acct (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_Project_Acct[")
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

	/** Set C_Project_Acct_UU.
		@param C_Project_Acct_UU C_Project_Acct_UU
	*/
	public void setC_Project_Acct_UU (String C_Project_Acct_UU)
	{
		set_Value (COLUMNNAME_C_Project_Acct_UU, C_Project_Acct_UU);
	}

	/** Get C_Project_Acct_UU.
		@return C_Project_Acct_UU	  */
	public String getC_Project_Acct_UU()
	{
		return (String)get_Value(COLUMNNAME_C_Project_Acct_UU);
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

	public I_C_ValidCombination getPJ_Asset_A() throws RuntimeException
	{
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_ID)
			.getPO(getPJ_Asset_Acct(), get_TrxName());
	}

	/** Set Project Asset.
		@param PJ_Asset_Acct Project Asset Account
	*/
	public void setPJ_Asset_Acct (int PJ_Asset_Acct)
	{
		set_Value (COLUMNNAME_PJ_Asset_Acct, Integer.valueOf(PJ_Asset_Acct));
	}

	/** Get Project Asset.
		@return Project Asset Account
	  */
	public int getPJ_Asset_Acct()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PJ_Asset_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_ValidCombination getPJ_WIP_A() throws RuntimeException
	{
		return (I_C_ValidCombination)MTable.get(getCtx(), I_C_ValidCombination.Table_ID)
			.getPO(getPJ_WIP_Acct(), get_TrxName());
	}

	/** Set Work In Progress.
		@param PJ_WIP_Acct Account for Work in Progress
	*/
	public void setPJ_WIP_Acct (int PJ_WIP_Acct)
	{
		set_Value (COLUMNNAME_PJ_WIP_Acct, Integer.valueOf(PJ_WIP_Acct));
	}

	/** Get Work In Progress.
		@return Account for Work in Progress
	  */
	public int getPJ_WIP_Acct()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PJ_WIP_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}