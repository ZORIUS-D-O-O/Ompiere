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
import org.compiere.util.ValueNamePair;

/** Generated Model for M_Substitute
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_Substitute")
public class X_M_Substitute extends PO implements I_M_Substitute, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_Substitute (Properties ctx, int M_Substitute_ID, String trxName)
    {
      super (ctx, M_Substitute_ID, trxName);
      /** if (M_Substitute_ID == 0)
        {
			setM_Product_ID (0);
			setName (null);
			setSubstitute_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_Substitute (Properties ctx, int M_Substitute_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_Substitute_ID, trxName, virtualColumns);
      /** if (M_Substitute_ID == 0)
        {
			setM_Product_ID (0);
			setName (null);
			setSubstitute_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_Substitute (Properties ctx, String M_Substitute_UU, String trxName)
    {
      super (ctx, M_Substitute_UU, trxName);
      /** if (M_Substitute_UU == null)
        {
			setM_Product_ID (0);
			setName (null);
			setSubstitute_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_Substitute (Properties ctx, String M_Substitute_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_Substitute_UU, trxName, virtualColumns);
      /** if (M_Substitute_UU == null)
        {
			setM_Product_ID (0);
			setName (null);
			setSubstitute_ID (0);
        } */
    }

    /** Load Constructor */
    public X_M_Substitute (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_M_Substitute[")
        .append(get_UUID()).append(",Name=").append(getName()).append("]");
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

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_ID)
			.getPO(getM_Product_ID(), get_TrxName());
	}

	/** Set Product.
		@param M_Product_ID Product, Service, Item
	*/
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_Substitute_UU.
		@param M_Substitute_UU M_Substitute_UU
	*/
	public void setM_Substitute_UU (String M_Substitute_UU)
	{
		set_Value (COLUMNNAME_M_Substitute_UU, M_Substitute_UU);
	}

	/** Get M_Substitute_UU.
		@return M_Substitute_UU	  */
	public String getM_Substitute_UU()
	{
		return (String)get_Value(COLUMNNAME_M_Substitute_UU);
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

    /** Get Record UU/ColumnName
        @return UU/ColumnName pair
      */
    public ValueNamePair getValueNamePair()
    {
        return new ValueNamePair(get_UUID(), getName());
    }

	public org.compiere.model.I_M_Product getSubstitute() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_ID)
			.getPO(getSubstitute_ID(), get_TrxName());
	}

	/** Set Substitute.
		@param Substitute_ID Entity which can be used in place of this entity
	*/
	public void setSubstitute_ID (int Substitute_ID)
	{
		if (Substitute_ID < 1)
			set_ValueNoCheck (COLUMNNAME_Substitute_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_Substitute_ID, Integer.valueOf(Substitute_ID));
	}

	/** Get Substitute.
		@return Entity which can be used in place of this entity
	  */
	public int getSubstitute_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Substitute_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}