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

/** Generated Model for AD_PrintFont
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_PrintFont")
public class X_AD_PrintFont extends PO implements I_AD_PrintFont, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_PrintFont (Properties ctx, int AD_PrintFont_ID, String trxName)
    {
      super (ctx, AD_PrintFont_ID, trxName);
      /** if (AD_PrintFont_ID == 0)
        {
			setAD_PrintFont_ID (0);
			setCode (null);
			setIsDefault (false);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_PrintFont (Properties ctx, int AD_PrintFont_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_PrintFont_ID, trxName, virtualColumns);
      /** if (AD_PrintFont_ID == 0)
        {
			setAD_PrintFont_ID (0);
			setCode (null);
			setIsDefault (false);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_PrintFont (Properties ctx, String AD_PrintFont_UU, String trxName)
    {
      super (ctx, AD_PrintFont_UU, trxName);
      /** if (AD_PrintFont_UU == null)
        {
			setAD_PrintFont_ID (0);
			setCode (null);
			setIsDefault (false);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_PrintFont (Properties ctx, String AD_PrintFont_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_PrintFont_UU, trxName, virtualColumns);
      /** if (AD_PrintFont_UU == null)
        {
			setAD_PrintFont_ID (0);
			setCode (null);
			setIsDefault (false);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_AD_PrintFont (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client
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
      StringBuilder sb = new StringBuilder ("X_AD_PrintFont[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Print Font.
		@param AD_PrintFont_ID Maintain Print Font
	*/
	public void setAD_PrintFont_ID (int AD_PrintFont_ID)
	{
		if (AD_PrintFont_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_PrintFont_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_PrintFont_ID, Integer.valueOf(AD_PrintFont_ID));
	}

	/** Get Print Font.
		@return Maintain Print Font
	  */
	public int getAD_PrintFont_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFont_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_PrintFont_UU.
		@param AD_PrintFont_UU AD_PrintFont_UU
	*/
	public void setAD_PrintFont_UU (String AD_PrintFont_UU)
	{
		set_Value (COLUMNNAME_AD_PrintFont_UU, AD_PrintFont_UU);
	}

	/** Get AD_PrintFont_UU.
		@return AD_PrintFont_UU	  */
	public String getAD_PrintFont_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_PrintFont_UU);
	}

	/** Set Validation code.
		@param Code Validation Code
	*/
	public void setCode (String Code)
	{
		set_Value (COLUMNNAME_Code, Code);
	}

	/** Get Validation code.
		@return Validation Code
	  */
	public String getCode()
	{
		return (String)get_Value(COLUMNNAME_Code);
	}

	/** Set Default.
		@param IsDefault Default value
	*/
	public void setIsDefault (boolean IsDefault)
	{
		set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
	}

	/** Get Default.
		@return Default value
	  */
	public boolean isDefault()
	{
		Object oo = get_Value(COLUMNNAME_IsDefault);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
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
}