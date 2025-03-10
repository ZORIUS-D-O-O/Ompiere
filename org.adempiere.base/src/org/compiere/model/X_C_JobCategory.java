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

/** Generated Model for C_JobCategory
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_JobCategory")
public class X_C_JobCategory extends PO implements I_C_JobCategory, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_JobCategory (Properties ctx, int C_JobCategory_ID, String trxName)
    {
      super (ctx, C_JobCategory_ID, trxName);
      /** if (C_JobCategory_ID == 0)
        {
			setC_JobCategory_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_C_JobCategory (Properties ctx, int C_JobCategory_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_JobCategory_ID, trxName, virtualColumns);
      /** if (C_JobCategory_ID == 0)
        {
			setC_JobCategory_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_C_JobCategory (Properties ctx, String C_JobCategory_UU, String trxName)
    {
      super (ctx, C_JobCategory_UU, trxName);
      /** if (C_JobCategory_UU == null)
        {
			setC_JobCategory_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_C_JobCategory (Properties ctx, String C_JobCategory_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_JobCategory_UU, trxName, virtualColumns);
      /** if (C_JobCategory_UU == null)
        {
			setC_JobCategory_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_C_JobCategory (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_JobCategory[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Position Category.
		@param C_JobCategory_ID Job Position Category
	*/
	public void setC_JobCategory_ID (int C_JobCategory_ID)
	{
		if (C_JobCategory_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_JobCategory_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_JobCategory_ID, Integer.valueOf(C_JobCategory_ID));
	}

	/** Get Position Category.
		@return Job Position Category
	  */
	public int getC_JobCategory_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_JobCategory_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_JobCategory_UU.
		@param C_JobCategory_UU C_JobCategory_UU
	*/
	public void setC_JobCategory_UU (String C_JobCategory_UU)
	{
		set_Value (COLUMNNAME_C_JobCategory_UU, C_JobCategory_UU);
	}

	/** Get C_JobCategory_UU.
		@return C_JobCategory_UU	  */
	public String getC_JobCategory_UU()
	{
		return (String)get_Value(COLUMNNAME_C_JobCategory_UU);
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
}