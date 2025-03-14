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

/** Generated Model for ASP_Level
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ASP_Level")
public class X_ASP_Level extends PO implements I_ASP_Level, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_ASP_Level (Properties ctx, int ASP_Level_ID, String trxName)
    {
      super (ctx, ASP_Level_ID, trxName);
      /** if (ASP_Level_ID == 0)
        {
			setASP_Level_ID (0);
			setASP_Module_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_ASP_Level (Properties ctx, int ASP_Level_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ASP_Level_ID, trxName, virtualColumns);
      /** if (ASP_Level_ID == 0)
        {
			setASP_Level_ID (0);
			setASP_Module_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_ASP_Level (Properties ctx, String ASP_Level_UU, String trxName)
    {
      super (ctx, ASP_Level_UU, trxName);
      /** if (ASP_Level_UU == null)
        {
			setASP_Level_ID (0);
			setASP_Module_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_ASP_Level (Properties ctx, String ASP_Level_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ASP_Level_UU, trxName, virtualColumns);
      /** if (ASP_Level_UU == null)
        {
			setASP_Level_ID (0);
			setASP_Module_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_ASP_Level (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ASP_Level[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set ASP Level.
		@param ASP_Level_ID ASP Level
	*/
	public void setASP_Level_ID (int ASP_Level_ID)
	{
		if (ASP_Level_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ASP_Level_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ASP_Level_ID, Integer.valueOf(ASP_Level_ID));
	}

	/** Get ASP Level.
		@return ASP Level	  */
	public int getASP_Level_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Level_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ASP_Level_UU.
		@param ASP_Level_UU ASP_Level_UU
	*/
	public void setASP_Level_UU (String ASP_Level_UU)
	{
		set_Value (COLUMNNAME_ASP_Level_UU, ASP_Level_UU);
	}

	/** Get ASP_Level_UU.
		@return ASP_Level_UU	  */
	public String getASP_Level_UU()
	{
		return (String)get_Value(COLUMNNAME_ASP_Level_UU);
	}

	public org.compiere.model.I_ASP_Module getASP_Module() throws RuntimeException
	{
		return (org.compiere.model.I_ASP_Module)MTable.get(getCtx(), org.compiere.model.I_ASP_Module.Table_ID)
			.getPO(getASP_Module_ID(), get_TrxName());
	}

	/** Set ASP Module.
		@param ASP_Module_ID ASP Module
	*/
	public void setASP_Module_ID (int ASP_Module_ID)
	{
		if (ASP_Module_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ASP_Module_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ASP_Module_ID, Integer.valueOf(ASP_Module_ID));
	}

	/** Get ASP Module.
		@return ASP Module	  */
	public int getASP_Module_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Module_ID);
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

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
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