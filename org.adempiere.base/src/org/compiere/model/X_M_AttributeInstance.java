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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.ValueNamePair;

/** Generated Model for M_AttributeInstance
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_AttributeInstance")
public class X_M_AttributeInstance extends PO implements I_M_AttributeInstance, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_AttributeInstance (Properties ctx, int M_AttributeInstance_ID, String trxName)
    {
      super (ctx, M_AttributeInstance_ID, trxName);
      /** if (M_AttributeInstance_ID == 0)
        {
			setM_AttributeSetInstance_ID (0);
			setM_Attribute_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_AttributeInstance (Properties ctx, int M_AttributeInstance_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_AttributeInstance_ID, trxName, virtualColumns);
      /** if (M_AttributeInstance_ID == 0)
        {
			setM_AttributeSetInstance_ID (0);
			setM_Attribute_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_AttributeInstance (Properties ctx, String M_AttributeInstance_UU, String trxName)
    {
      super (ctx, M_AttributeInstance_UU, trxName);
      /** if (M_AttributeInstance_UU == null)
        {
			setM_AttributeSetInstance_ID (0);
			setM_Attribute_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_AttributeInstance (Properties ctx, String M_AttributeInstance_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_AttributeInstance_UU, trxName, virtualColumns);
      /** if (M_AttributeInstance_UU == null)
        {
			setM_AttributeSetInstance_ID (0);
			setM_Attribute_ID (0);
        } */
    }

    /** Load Constructor */
    public X_M_AttributeInstance (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_M_AttributeInstance[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	/** Set M_AttributeInstance_UU.
		@param M_AttributeInstance_UU M_AttributeInstance_UU
	*/
	public void setM_AttributeInstance_UU (String M_AttributeInstance_UU)
	{
		set_Value (COLUMNNAME_M_AttributeInstance_UU, M_AttributeInstance_UU);
	}

	/** Get M_AttributeInstance_UU.
		@return M_AttributeInstance_UU	  */
	public String getM_AttributeInstance_UU()
	{
		return (String)get_Value(COLUMNNAME_M_AttributeInstance_UU);
	}

	public I_M_AttributeSetInstance getM_AttributeSetInstance() throws RuntimeException
	{
		return (I_M_AttributeSetInstance)MTable.get(getCtx(), I_M_AttributeSetInstance.Table_ID)
			.getPO(getM_AttributeSetInstance_ID(), get_TrxName());
	}

	/** Set Attribute Set Instance.
		@param M_AttributeSetInstance_ID Product Attribute Set Instance
	*/
	public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
	{
		if (M_AttributeSetInstance_ID < 0)
			set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
	}

	/** Get Attribute Set Instance.
		@return Product Attribute Set Instance
	  */
	public int getM_AttributeSetInstance_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_AttributeValue getM_AttributeValue() throws RuntimeException
	{
		return (org.compiere.model.I_M_AttributeValue)MTable.get(getCtx(), org.compiere.model.I_M_AttributeValue.Table_ID)
			.getPO(getM_AttributeValue_ID(), get_TrxName());
	}

	/** Set Attribute Value.
		@param M_AttributeValue_ID Product Attribute Value
	*/
	public void setM_AttributeValue_ID (int M_AttributeValue_ID)
	{
		if (M_AttributeValue_ID < 1)
			set_Value (COLUMNNAME_M_AttributeValue_ID, null);
		else
			set_Value (COLUMNNAME_M_AttributeValue_ID, Integer.valueOf(M_AttributeValue_ID));
	}

	/** Get Attribute Value.
		@return Product Attribute Value
	  */
	public int getM_AttributeValue_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeValue_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record UU/ColumnName
        @return UU/ColumnName pair
      */
    public ValueNamePair getValueNamePair()
    {
        return new ValueNamePair(get_UUID(), String.valueOf(getM_AttributeValue_ID()));
    }

	public org.compiere.model.I_M_Attribute getM_Attribute() throws RuntimeException
	{
		return (org.compiere.model.I_M_Attribute)MTable.get(getCtx(), org.compiere.model.I_M_Attribute.Table_ID)
			.getPO(getM_Attribute_ID(), get_TrxName());
	}

	/** Set Attribute.
		@param M_Attribute_ID Product Attribute
	*/
	public void setM_Attribute_ID (int M_Attribute_ID)
	{
		if (M_Attribute_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_Attribute_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Attribute_ID, Integer.valueOf(M_Attribute_ID));
	}

	/** Get Attribute.
		@return Product Attribute
	  */
	public int getM_Attribute_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Attribute_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Value Date.
		@param ValueDate Value Date
	*/
	public void setValueDate (Timestamp ValueDate)
	{
		set_Value (COLUMNNAME_ValueDate, ValueDate);
	}

	/** Get Value Date.
		@return Value Date	  */
	public Timestamp getValueDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_ValueDate);
	}

	/** Set Value Multiple Selection.
		@param ValueMultipleSelection Comma separated values.
	*/
	public void setValueMultipleSelection (String ValueMultipleSelection)
	{
		set_Value (COLUMNNAME_ValueMultipleSelection, ValueMultipleSelection);
	}

	/** Get Value Multiple Selection.
		@return Comma separated values.
	  */
	public String getValueMultipleSelection()
	{
		return (String)get_Value(COLUMNNAME_ValueMultipleSelection);
	}

	/** Set Value.
		@param ValueNumber Numeric Value
	*/
	public void setValueNumber (BigDecimal ValueNumber)
	{
		set_Value (COLUMNNAME_ValueNumber, ValueNumber);
	}

	/** Get Value.
		@return Numeric Value
	  */
	public BigDecimal getValueNumber()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ValueNumber);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}