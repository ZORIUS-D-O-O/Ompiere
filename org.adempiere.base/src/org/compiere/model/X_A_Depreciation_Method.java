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

/** Generated Model for A_Depreciation_Method
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="A_Depreciation_Method")
public class X_A_Depreciation_Method extends PO implements I_A_Depreciation_Method, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_A_Depreciation_Method (Properties ctx, int A_Depreciation_Method_ID, String trxName)
    {
      super (ctx, A_Depreciation_Method_ID, trxName);
      /** if (A_Depreciation_Method_ID == 0)
        {
			setA_Depreciation_Method_ID (0);
			setProcessed (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_A_Depreciation_Method (Properties ctx, int A_Depreciation_Method_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, A_Depreciation_Method_ID, trxName, virtualColumns);
      /** if (A_Depreciation_Method_ID == 0)
        {
			setA_Depreciation_Method_ID (0);
			setProcessed (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_A_Depreciation_Method (Properties ctx, String A_Depreciation_Method_UU, String trxName)
    {
      super (ctx, A_Depreciation_Method_UU, trxName);
      /** if (A_Depreciation_Method_UU == null)
        {
			setA_Depreciation_Method_ID (0);
			setProcessed (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_A_Depreciation_Method (Properties ctx, String A_Depreciation_Method_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, A_Depreciation_Method_UU, trxName, virtualColumns);
      /** if (A_Depreciation_Method_UU == null)
        {
			setA_Depreciation_Method_ID (0);
			setProcessed (false);
// N
        } */
    }

    /** Load Constructor */
    public X_A_Depreciation_Method (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org
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
      StringBuilder sb = new StringBuilder ("X_A_Depreciation_Method[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Depreciation Method.
		@param A_Depreciation_Method_ID Depreciation Method
	*/
	public void setA_Depreciation_Method_ID (int A_Depreciation_Method_ID)
	{
		if (A_Depreciation_Method_ID < 1)
			set_ValueNoCheck (COLUMNNAME_A_Depreciation_Method_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_A_Depreciation_Method_ID, Integer.valueOf(A_Depreciation_Method_ID));
	}

	/** Get Depreciation Method.
		@return Depreciation Method	  */
	public int getA_Depreciation_Method_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Depreciation_Method_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getA_Depreciation_Method_ID()));
    }

	/** Set A_Depreciation_Method_UU.
		@param A_Depreciation_Method_UU A_Depreciation_Method_UU
	*/
	public void setA_Depreciation_Method_UU (String A_Depreciation_Method_UU)
	{
		set_Value (COLUMNNAME_A_Depreciation_Method_UU, A_Depreciation_Method_UU);
	}

	/** Get A_Depreciation_Method_UU.
		@return A_Depreciation_Method_UU	  */
	public String getA_Depreciation_Method_UU()
	{
		return (String)get_Value(COLUMNNAME_A_Depreciation_Method_UU);
	}

	/** Set Depreciation Type.
		@param DepreciationType Depreciation Type
	*/
	public void setDepreciationType (String DepreciationType)
	{
		set_Value (COLUMNNAME_DepreciationType, DepreciationType);
	}

	/** Get Depreciation Type.
		@return Depreciation Type	  */
	public String getDepreciationType()
	{
		return (String)get_Value(COLUMNNAME_DepreciationType);
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

	/** Set Processed.
		@param Processed The document has been processed
	*/
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed()
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Description.
		@param Text Description
	*/
	public void setText (String Text)
	{
		set_Value (COLUMNNAME_Text, Text);
	}

	/** Get Description.
		@return Description	  */
	public String getText()
	{
		return (String)get_Value(COLUMNNAME_Text);
	}
}