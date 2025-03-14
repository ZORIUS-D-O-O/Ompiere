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
import org.compiere.util.KeyNamePair;

/** Generated Model for C_Year
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_Year")
public class X_C_Year extends PO implements I_C_Year, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_Year (Properties ctx, int C_Year_ID, String trxName)
    {
      super (ctx, C_Year_ID, trxName);
      /** if (C_Year_ID == 0)
        {
			setC_Calendar_ID (0);
			setC_Year_ID (0);
			setFiscalYear (null);
        } */
    }

    /** Standard Constructor */
    public X_C_Year (Properties ctx, int C_Year_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Year_ID, trxName, virtualColumns);
      /** if (C_Year_ID == 0)
        {
			setC_Calendar_ID (0);
			setC_Year_ID (0);
			setFiscalYear (null);
        } */
    }

    /** Standard Constructor */
    public X_C_Year (Properties ctx, String C_Year_UU, String trxName)
    {
      super (ctx, C_Year_UU, trxName);
      /** if (C_Year_UU == null)
        {
			setC_Calendar_ID (0);
			setC_Year_ID (0);
			setFiscalYear (null);
        } */
    }

    /** Standard Constructor */
    public X_C_Year (Properties ctx, String C_Year_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Year_UU, trxName, virtualColumns);
      /** if (C_Year_UU == null)
        {
			setC_Calendar_ID (0);
			setC_Year_ID (0);
			setFiscalYear (null);
        } */
    }

    /** Load Constructor */
    public X_C_Year (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_Year[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Calendar getC_Calendar() throws RuntimeException
	{
		return (org.compiere.model.I_C_Calendar)MTable.get(getCtx(), org.compiere.model.I_C_Calendar.Table_ID)
			.getPO(getC_Calendar_ID(), get_TrxName());
	}

	/** Set Calendar.
		@param C_Calendar_ID Accounting Calendar Name
	*/
	public void setC_Calendar_ID (int C_Calendar_ID)
	{
		if (C_Calendar_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Calendar_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Calendar_ID, Integer.valueOf(C_Calendar_ID));
	}

	/** Get Calendar.
		@return Accounting Calendar Name
	  */
	public int getC_Calendar_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Calendar_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Year.
		@param C_Year_ID Calendar Year
	*/
	public void setC_Year_ID (int C_Year_ID)
	{
		if (C_Year_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Year_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
	}

	/** Get Year.
		@return Calendar Year
	  */
	public int getC_Year_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_Year_UU.
		@param C_Year_UU C_Year_UU
	*/
	public void setC_Year_UU (String C_Year_UU)
	{
		set_Value (COLUMNNAME_C_Year_UU, C_Year_UU);
	}

	/** Get C_Year_UU.
		@return C_Year_UU	  */
	public String getC_Year_UU()
	{
		return (String)get_Value(COLUMNNAME_C_Year_UU);
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

	/** Set Year.
		@param FiscalYear The Fiscal Year
	*/
	public void setFiscalYear (String FiscalYear)
	{
		set_Value (COLUMNNAME_FiscalYear, FiscalYear);
	}

	/** Get Year.
		@return The Fiscal Year
	  */
	public String getFiscalYear()
	{
		return (String)get_Value(COLUMNNAME_FiscalYear);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getFiscalYear());
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
}