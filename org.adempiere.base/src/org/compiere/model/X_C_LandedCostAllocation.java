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
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for C_LandedCostAllocation
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_LandedCostAllocation")
public class X_C_LandedCostAllocation extends PO implements I_C_LandedCostAllocation, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_LandedCostAllocation (Properties ctx, int C_LandedCostAllocation_ID, String trxName)
    {
      super (ctx, C_LandedCostAllocation_ID, trxName);
      /** if (C_LandedCostAllocation_ID == 0)
        {
			setAmt (Env.ZERO);
			setBase (Env.ZERO);
			setC_InvoiceLine_ID (0);
			setC_LandedCostAllocation_ID (0);
			setM_CostElement_ID (0);
			setM_Product_ID (0);
			setQty (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_LandedCostAllocation (Properties ctx, int C_LandedCostAllocation_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_LandedCostAllocation_ID, trxName, virtualColumns);
      /** if (C_LandedCostAllocation_ID == 0)
        {
			setAmt (Env.ZERO);
			setBase (Env.ZERO);
			setC_InvoiceLine_ID (0);
			setC_LandedCostAllocation_ID (0);
			setM_CostElement_ID (0);
			setM_Product_ID (0);
			setQty (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_LandedCostAllocation (Properties ctx, String C_LandedCostAllocation_UU, String trxName)
    {
      super (ctx, C_LandedCostAllocation_UU, trxName);
      /** if (C_LandedCostAllocation_UU == null)
        {
			setAmt (Env.ZERO);
			setBase (Env.ZERO);
			setC_InvoiceLine_ID (0);
			setC_LandedCostAllocation_ID (0);
			setM_CostElement_ID (0);
			setM_Product_ID (0);
			setQty (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_LandedCostAllocation (Properties ctx, String C_LandedCostAllocation_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_LandedCostAllocation_UU, trxName, virtualColumns);
      /** if (C_LandedCostAllocation_UU == null)
        {
			setAmt (Env.ZERO);
			setBase (Env.ZERO);
			setC_InvoiceLine_ID (0);
			setC_LandedCostAllocation_ID (0);
			setM_CostElement_ID (0);
			setM_Product_ID (0);
			setQty (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_C_LandedCostAllocation (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 1 - Org
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
      StringBuilder sb = new StringBuilder ("X_C_LandedCostAllocation[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amt Amount
	*/
	public void setAmt (BigDecimal Amt)
	{
		set_Value (COLUMNNAME_Amt, Amt);
	}

	/** Get Amount.
		@return Amount
	  */
	public BigDecimal getAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Base.
		@param Base Calculation Base
	*/
	public void setBase (BigDecimal Base)
	{
		set_Value (COLUMNNAME_Base, Base);
	}

	/** Get Base.
		@return Calculation Base
	  */
	public BigDecimal getBase()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Base);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException
	{
		return (org.compiere.model.I_C_InvoiceLine)MTable.get(getCtx(), org.compiere.model.I_C_InvoiceLine.Table_ID)
			.getPO(getC_InvoiceLine_ID(), get_TrxName());
	}

	/** Set Invoice Line.
		@param C_InvoiceLine_ID Invoice Detail Line
	*/
	public void setC_InvoiceLine_ID (int C_InvoiceLine_ID)
	{
		if (C_InvoiceLine_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_InvoiceLine_ID, Integer.valueOf(C_InvoiceLine_ID));
	}

	/** Get Invoice Line.
		@return Invoice Detail Line
	  */
	public int getC_InvoiceLine_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getC_InvoiceLine_ID()));
    }

	/** Set Landed Cost Allocation.
		@param C_LandedCostAllocation_ID Allocation for Land Costs
	*/
	public void setC_LandedCostAllocation_ID (int C_LandedCostAllocation_ID)
	{
		if (C_LandedCostAllocation_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_LandedCostAllocation_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_LandedCostAllocation_ID, Integer.valueOf(C_LandedCostAllocation_ID));
	}

	/** Get Landed Cost Allocation.
		@return Allocation for Land Costs
	  */
	public int getC_LandedCostAllocation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LandedCostAllocation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_LandedCostAllocation_UU.
		@param C_LandedCostAllocation_UU C_LandedCostAllocation_UU
	*/
	public void setC_LandedCostAllocation_UU (String C_LandedCostAllocation_UU)
	{
		set_Value (COLUMNNAME_C_LandedCostAllocation_UU, C_LandedCostAllocation_UU);
	}

	/** Get C_LandedCostAllocation_UU.
		@return C_LandedCostAllocation_UU	  */
	public String getC_LandedCostAllocation_UU()
	{
		return (String)get_Value(COLUMNNAME_C_LandedCostAllocation_UU);
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

	public org.compiere.model.I_M_CostElement getM_CostElement() throws RuntimeException
	{
		return (org.compiere.model.I_M_CostElement)MTable.get(getCtx(), org.compiere.model.I_M_CostElement.Table_ID)
			.getPO(getM_CostElement_ID(), get_TrxName());
	}

	/** Set Cost Element.
		@param M_CostElement_ID Product Cost Element
	*/
	public void setM_CostElement_ID (int M_CostElement_ID)
	{
		if (M_CostElement_ID < 1)
			set_Value (COLUMNNAME_M_CostElement_ID, null);
		else
			set_Value (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
	}

	/** Get Cost Element.
		@return Product Cost Element
	  */
	public int getM_CostElement_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_CostElement_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_InOutLine getM_InOutLine() throws RuntimeException
	{
		return (org.compiere.model.I_M_InOutLine)MTable.get(getCtx(), org.compiere.model.I_M_InOutLine.Table_ID)
			.getPO(getM_InOutLine_ID(), get_TrxName());
	}

	/** Set Shipment/Receipt Line.
		@param M_InOutLine_ID Line on Shipment or Receipt document
	*/
	public void setM_InOutLine_ID (int M_InOutLine_ID)
	{
		if (M_InOutLine_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
	}

	/** Get Shipment/Receipt Line.
		@return Line on Shipment or Receipt document
	  */
	public int getM_InOutLine_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Quantity.
		@param Qty Quantity
	*/
	public void setQty (BigDecimal Qty)
	{
		set_Value (COLUMNNAME_Qty, Qty);
	}

	/** Get Quantity.
		@return Quantity
	  */
	public BigDecimal getQty()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}