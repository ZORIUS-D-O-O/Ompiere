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

/** Generated Model for M_AttributeSearch
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_AttributeSearch")
public class X_M_AttributeSearch extends PO implements I_M_AttributeSearch, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_AttributeSearch (Properties ctx, int M_AttributeSearch_ID, String trxName)
    {
      super (ctx, M_AttributeSearch_ID, trxName);
      /** if (M_AttributeSearch_ID == 0)
        {
			setM_AttributeSearch_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_AttributeSearch (Properties ctx, int M_AttributeSearch_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_AttributeSearch_ID, trxName, virtualColumns);
      /** if (M_AttributeSearch_ID == 0)
        {
			setM_AttributeSearch_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_AttributeSearch (Properties ctx, String M_AttributeSearch_UU, String trxName)
    {
      super (ctx, M_AttributeSearch_UU, trxName);
      /** if (M_AttributeSearch_UU == null)
        {
			setM_AttributeSearch_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_AttributeSearch (Properties ctx, String M_AttributeSearch_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_AttributeSearch_UU, trxName, virtualColumns);
      /** if (M_AttributeSearch_UU == null)
        {
			setM_AttributeSearch_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_M_AttributeSearch (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_M_AttributeSearch[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** Set Attribute Search.
		@param M_AttributeSearch_ID Common Search Attribute 
	*/
	public void setM_AttributeSearch_ID (int M_AttributeSearch_ID)
	{
		if (M_AttributeSearch_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_AttributeSearch_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_AttributeSearch_ID, Integer.valueOf(M_AttributeSearch_ID));
	}

	/** Get Attribute Search.
		@return Common Search Attribute 
	  */
	public int getM_AttributeSearch_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSearch_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_AttributeSearch_UU.
		@param M_AttributeSearch_UU M_AttributeSearch_UU
	*/
	public void setM_AttributeSearch_UU (String M_AttributeSearch_UU)
	{
		set_Value (COLUMNNAME_M_AttributeSearch_UU, M_AttributeSearch_UU);
	}

	/** Get M_AttributeSearch_UU.
		@return M_AttributeSearch_UU	  */
	public String getM_AttributeSearch_UU()
	{
		return (String)get_Value(COLUMNNAME_M_AttributeSearch_UU);
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