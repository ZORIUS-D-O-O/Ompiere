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

/** Generated Model for ASP_Tab
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ASP_Tab")
public class X_ASP_Tab extends PO implements I_ASP_Tab, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_ASP_Tab (Properties ctx, int ASP_Tab_ID, String trxName)
    {
      super (ctx, ASP_Tab_ID, trxName);
      /** if (ASP_Tab_ID == 0)
        {
			setAD_Tab_ID (0);
			setASP_Status (null);
// S
        } */
    }

    /** Standard Constructor */
    public X_ASP_Tab (Properties ctx, int ASP_Tab_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ASP_Tab_ID, trxName, virtualColumns);
      /** if (ASP_Tab_ID == 0)
        {
			setAD_Tab_ID (0);
			setASP_Status (null);
// S
        } */
    }

    /** Standard Constructor */
    public X_ASP_Tab (Properties ctx, String ASP_Tab_UU, String trxName)
    {
      super (ctx, ASP_Tab_UU, trxName);
      /** if (ASP_Tab_UU == null)
        {
			setAD_Tab_ID (0);
			setASP_Status (null);
// S
        } */
    }

    /** Standard Constructor */
    public X_ASP_Tab (Properties ctx, String ASP_Tab_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ASP_Tab_UU, trxName, virtualColumns);
      /** if (ASP_Tab_UU == null)
        {
			setAD_Tab_ID (0);
			setASP_Status (null);
// S
        } */
    }

    /** Load Constructor */
    public X_ASP_Tab (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ASP_Tab[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Tab getAD_Tab() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Tab)MTable.get(getCtx(), org.compiere.model.I_AD_Tab.Table_ID)
			.getPO(getAD_Tab_ID(), get_TrxName());
	}

	/** Set Tab.
		@param AD_Tab_ID Tab within a Window
	*/
	public void setAD_Tab_ID (int AD_Tab_ID)
	{
		if (AD_Tab_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Tab_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Tab_ID, Integer.valueOf(AD_Tab_ID));
	}

	/** Get Tab.
		@return Tab within a Window
	  */
	public int getAD_Tab_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tab_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ASP_Status AD_Reference_ID=53234 */
	public static final int ASP_STATUS_AD_Reference_ID=53234;
	/** Hide = H */
	public static final String ASP_STATUS_Hide = "H";
	/** Show = S */
	public static final String ASP_STATUS_Show = "S";
	/** Undefined = U */
	public static final String ASP_STATUS_Undefined = "U";
	/** Set ASP Status.
		@param ASP_Status ASP Status
	*/
	public void setASP_Status (String ASP_Status)
	{

		set_Value (COLUMNNAME_ASP_Status, ASP_Status);
	}

	/** Get ASP Status.
		@return ASP Status	  */
	public String getASP_Status()
	{
		return (String)get_Value(COLUMNNAME_ASP_Status);
	}

	/** Set ASP Tab.
		@param ASP_Tab_ID ASP Tab
	*/
	public void setASP_Tab_ID (int ASP_Tab_ID)
	{
		if (ASP_Tab_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ASP_Tab_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ASP_Tab_ID, Integer.valueOf(ASP_Tab_ID));
	}

	/** Get ASP Tab.
		@return ASP Tab	  */
	public int getASP_Tab_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Tab_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ASP_Tab_UU.
		@param ASP_Tab_UU ASP_Tab_UU
	*/
	public void setASP_Tab_UU (String ASP_Tab_UU)
	{
		set_Value (COLUMNNAME_ASP_Tab_UU, ASP_Tab_UU);
	}

	/** Get ASP_Tab_UU.
		@return ASP_Tab_UU	  */
	public String getASP_Tab_UU()
	{
		return (String)get_Value(COLUMNNAME_ASP_Tab_UU);
	}

	public org.compiere.model.I_ASP_Window getASP_Window() throws RuntimeException
	{
		return (org.compiere.model.I_ASP_Window)MTable.get(getCtx(), org.compiere.model.I_ASP_Window.Table_ID)
			.getPO(getASP_Window_ID(), get_TrxName());
	}

	/** Set ASP Window.
		@param ASP_Window_ID ASP Window
	*/
	public void setASP_Window_ID (int ASP_Window_ID)
	{
		if (ASP_Window_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ASP_Window_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ASP_Window_ID, Integer.valueOf(ASP_Window_ID));
	}

	/** Get ASP Window.
		@return ASP Window	  */
	public int getASP_Window_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Window_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getASP_Window_ID()));
    }

	/** Set All Fields.
		@param AllFields All Fields
	*/
	public void setAllFields (boolean AllFields)
	{
		set_Value (COLUMNNAME_AllFields, Boolean.valueOf(AllFields));
	}

	/** Get All Fields.
		@return All Fields	  */
	public boolean isAllFields()
	{
		Object oo = get_Value(COLUMNNAME_AllFields);
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
}