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

/** Generated Model for C_Dunning
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_Dunning")
public class X_C_Dunning extends PO implements I_C_Dunning, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_Dunning (Properties ctx, int C_Dunning_ID, String trxName)
    {
      super (ctx, C_Dunning_ID, trxName);
      /** if (C_Dunning_ID == 0)
        {
			setC_Dunning_ID (0);
			setCreateLevelsSequentially (false);
			setIsDefault (false);
			setName (null);
			setSendDunningLetter (false);
        } */
    }

    /** Standard Constructor */
    public X_C_Dunning (Properties ctx, int C_Dunning_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Dunning_ID, trxName, virtualColumns);
      /** if (C_Dunning_ID == 0)
        {
			setC_Dunning_ID (0);
			setCreateLevelsSequentially (false);
			setIsDefault (false);
			setName (null);
			setSendDunningLetter (false);
        } */
    }

    /** Standard Constructor */
    public X_C_Dunning (Properties ctx, String C_Dunning_UU, String trxName)
    {
      super (ctx, C_Dunning_UU, trxName);
      /** if (C_Dunning_UU == null)
        {
			setC_Dunning_ID (0);
			setCreateLevelsSequentially (false);
			setIsDefault (false);
			setName (null);
			setSendDunningLetter (false);
        } */
    }

    /** Standard Constructor */
    public X_C_Dunning (Properties ctx, String C_Dunning_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Dunning_UU, trxName, virtualColumns);
      /** if (C_Dunning_UU == null)
        {
			setC_Dunning_ID (0);
			setCreateLevelsSequentially (false);
			setIsDefault (false);
			setName (null);
			setSendDunningLetter (false);
        } */
    }

    /** Load Constructor */
    public X_C_Dunning (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_Dunning[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Dunning.
		@param C_Dunning_ID Dunning Rules for overdue invoices
	*/
	public void setC_Dunning_ID (int C_Dunning_ID)
	{
		if (C_Dunning_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Dunning_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Dunning_ID, Integer.valueOf(C_Dunning_ID));
	}

	/** Get Dunning.
		@return Dunning Rules for overdue invoices
	  */
	public int getC_Dunning_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Dunning_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_Dunning_UU.
		@param C_Dunning_UU C_Dunning_UU
	*/
	public void setC_Dunning_UU (String C_Dunning_UU)
	{
		set_Value (COLUMNNAME_C_Dunning_UU, C_Dunning_UU);
	}

	/** Get C_Dunning_UU.
		@return C_Dunning_UU	  */
	public String getC_Dunning_UU()
	{
		return (String)get_Value(COLUMNNAME_C_Dunning_UU);
	}

	/** Set Create levels sequentially.
		@param CreateLevelsSequentially Create Dunning Letter by level sequentially
	*/
	public void setCreateLevelsSequentially (boolean CreateLevelsSequentially)
	{
		set_Value (COLUMNNAME_CreateLevelsSequentially, Boolean.valueOf(CreateLevelsSequentially));
	}

	/** Get Create levels sequentially.
		@return Create Dunning Letter by level sequentially
	  */
	public boolean isCreateLevelsSequentially()
	{
		Object oo = get_Value(COLUMNNAME_CreateLevelsSequentially);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Send dunning letters.
		@param SendDunningLetter Indicates if dunning letters will be sent
	*/
	public void setSendDunningLetter (boolean SendDunningLetter)
	{
		set_Value (COLUMNNAME_SendDunningLetter, Boolean.valueOf(SendDunningLetter));
	}

	/** Get Send dunning letters.
		@return Indicates if dunning letters will be sent
	  */
	public boolean isSendDunningLetter()
	{
		Object oo = get_Value(COLUMNNAME_SendDunningLetter);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}
}