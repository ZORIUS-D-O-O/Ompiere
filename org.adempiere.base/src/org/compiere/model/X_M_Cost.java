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

/** Generated Model for M_Cost
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_Cost")
public class X_M_Cost extends PO implements I_M_Cost, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_Cost (Properties ctx, int M_Cost_ID, String trxName)
    {
      super (ctx, M_Cost_ID, trxName);
      /** if (M_Cost_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setCurrentCostPrice (Env.ZERO);
			setCurrentCostPriceLL (Env.ZERO);
			setCurrentQty (Env.ZERO);
			setFutureCostPrice (Env.ZERO);
			setM_AttributeSetInstance_ID (0);
			setM_CostElement_ID (0);
			setM_CostType_ID (0);
			setM_Product_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_Cost (Properties ctx, int M_Cost_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_Cost_ID, trxName, virtualColumns);
      /** if (M_Cost_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setCurrentCostPrice (Env.ZERO);
			setCurrentCostPriceLL (Env.ZERO);
			setCurrentQty (Env.ZERO);
			setFutureCostPrice (Env.ZERO);
			setM_AttributeSetInstance_ID (0);
			setM_CostElement_ID (0);
			setM_CostType_ID (0);
			setM_Product_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_Cost (Properties ctx, String M_Cost_UU, String trxName)
    {
      super (ctx, M_Cost_UU, trxName);
      /** if (M_Cost_UU == null)
        {
			setC_AcctSchema_ID (0);
			setCurrentCostPrice (Env.ZERO);
			setCurrentCostPriceLL (Env.ZERO);
			setCurrentQty (Env.ZERO);
			setFutureCostPrice (Env.ZERO);
			setM_AttributeSetInstance_ID (0);
			setM_CostElement_ID (0);
			setM_CostType_ID (0);
			setM_Product_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_Cost (Properties ctx, String M_Cost_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_Cost_UU, trxName, virtualColumns);
      /** if (M_Cost_UU == null)
        {
			setC_AcctSchema_ID (0);
			setCurrentCostPrice (Env.ZERO);
			setCurrentCostPriceLL (Env.ZERO);
			setCurrentQty (Env.ZERO);
			setFutureCostPrice (Env.ZERO);
			setM_AttributeSetInstance_ID (0);
			setM_CostElement_ID (0);
			setM_CostType_ID (0);
			setM_Product_ID (0);
        } */
    }

    /** Load Constructor */
    public X_M_Cost (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_M_Cost[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_AcctSchema getC_AcctSchema() throws RuntimeException
	{
		return (org.compiere.model.I_C_AcctSchema)MTable.get(getCtx(), org.compiere.model.I_C_AcctSchema.Table_ID)
			.getPO(getC_AcctSchema_ID(), get_TrxName());
	}

	/** Set Accounting Schema.
		@param C_AcctSchema_ID Rules for accounting
	*/
	public void setC_AcctSchema_ID (int C_AcctSchema_ID)
	{
		if (C_AcctSchema_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
	}

	/** Get Accounting Schema.
		@return Rules for accounting
	  */
	public int getC_AcctSchema_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** CostingMethod AD_Reference_ID=122 */
	public static final int COSTINGMETHOD_AD_Reference_ID=122;
	/** Average PO = A */
	public static final String COSTINGMETHOD_AveragePO = "A";
	/** Fifo = F */
	public static final String COSTINGMETHOD_Fifo = "F";
	/** Average Invoice = I */
	public static final String COSTINGMETHOD_AverageInvoice = "I";
	/** Lifo = L */
	public static final String COSTINGMETHOD_Lifo = "L";
	/** Standard Costing = S */
	public static final String COSTINGMETHOD_StandardCosting = "S";
	/** User Defined = U */
	public static final String COSTINGMETHOD_UserDefined = "U";
	/** Last Invoice = i */
	public static final String COSTINGMETHOD_LastInvoice = "i";
	/** Last PO Price = p */
	public static final String COSTINGMETHOD_LastPOPrice = "p";
	/** _ = x */
	public static final String COSTINGMETHOD__ = "x";
	/** Set Costing Method.
		@param CostingMethod Indicates how Costs will be calculated
	*/
	public void setCostingMethod (String CostingMethod)
	{

		throw new IllegalArgumentException ("CostingMethod is virtual column");	}

	/** Get Costing Method.
		@return Indicates how Costs will be calculated
	  */
	public String getCostingMethod()
	{
		return (String)get_Value(COLUMNNAME_CostingMethod);
	}

	/** Set Accumulated Amt.
		@param CumulatedAmt Total Amount
	*/
	public void setCumulatedAmt (BigDecimal CumulatedAmt)
	{
		set_ValueNoCheck (COLUMNNAME_CumulatedAmt, CumulatedAmt);
	}

	/** Get Accumulated Amt.
		@return Total Amount
	  */
	public BigDecimal getCumulatedAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CumulatedAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Accumulated Qty.
		@param CumulatedQty Total Quantity
	*/
	public void setCumulatedQty (BigDecimal CumulatedQty)
	{
		set_ValueNoCheck (COLUMNNAME_CumulatedQty, CumulatedQty);
	}

	/** Get Accumulated Qty.
		@return Total Quantity
	  */
	public BigDecimal getCumulatedQty()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CumulatedQty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Current Cost Price.
		@param CurrentCostPrice The currently used cost price
	*/
	public void setCurrentCostPrice (BigDecimal CurrentCostPrice)
	{
		set_Value (COLUMNNAME_CurrentCostPrice, CurrentCostPrice);
	}

	/** Get Current Cost Price.
		@return The currently used cost price
	  */
	public BigDecimal getCurrentCostPrice()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrentCostPrice);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Current Cost Price Lower Level.
		@param CurrentCostPriceLL Current Price Lower Level Is the sum of the costs of the components of this product manufactured for this level.
	*/
	public void setCurrentCostPriceLL (BigDecimal CurrentCostPriceLL)
	{
		set_Value (COLUMNNAME_CurrentCostPriceLL, CurrentCostPriceLL);
	}

	/** Get Current Cost Price Lower Level.
		@return Current Price Lower Level Is the sum of the costs of the components of this product manufactured for this level.
	  */
	public BigDecimal getCurrentCostPriceLL()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrentCostPriceLL);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Current Quantity.
		@param CurrentQty Current Quantity
	*/
	public void setCurrentQty (BigDecimal CurrentQty)
	{
		set_Value (COLUMNNAME_CurrentQty, CurrentQty);
	}

	/** Get Current Quantity.
		@return Current Quantity
	  */
	public BigDecimal getCurrentQty()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CurrentQty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Future Cost Price.
		@param FutureCostPrice Future Cost Price
	*/
	public void setFutureCostPrice (BigDecimal FutureCostPrice)
	{
		set_Value (COLUMNNAME_FutureCostPrice, FutureCostPrice);
	}

	/** Get Future Cost Price.
		@return Future Cost Price	  */
	public BigDecimal getFutureCostPrice()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FutureCostPrice);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Future Cost Price Lower Level.
		@param FutureCostPriceLL Future Cost Price Lower Level
	*/
	public void setFutureCostPriceLL (BigDecimal FutureCostPriceLL)
	{
		set_Value (COLUMNNAME_FutureCostPriceLL, FutureCostPriceLL);
	}

	/** Get Future Cost Price Lower Level.
		@return Future Cost Price Lower Level	  */
	public BigDecimal getFutureCostPriceLL()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FutureCostPriceLL);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Cost Frozen.
		@param IsCostFrozen Indicated that the Standard Cost is frozen
	*/
	public void setIsCostFrozen (boolean IsCostFrozen)
	{
		set_Value (COLUMNNAME_IsCostFrozen, Boolean.valueOf(IsCostFrozen));
	}

	/** Get Cost Frozen.
		@return Indicated that the Standard Cost is frozen
	  */
	public boolean isCostFrozen()
	{
		Object oo = get_Value(COLUMNNAME_IsCostFrozen);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
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
			set_ValueNoCheck (COLUMNNAME_M_CostElement_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_CostElement_ID, Integer.valueOf(M_CostElement_ID));
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

	public org.compiere.model.I_M_CostType getM_CostType() throws RuntimeException
	{
		return (org.compiere.model.I_M_CostType)MTable.get(getCtx(), org.compiere.model.I_M_CostType.Table_ID)
			.getPO(getM_CostType_ID(), get_TrxName());
	}

	/** Set Cost Type.
		@param M_CostType_ID Type of Cost (e.g. Current, Plan, Future)
	*/
	public void setM_CostType_ID (int M_CostType_ID)
	{
		if (M_CostType_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_CostType_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_CostType_ID, Integer.valueOf(M_CostType_ID));
	}

	/** Get Cost Type.
		@return Type of Cost (e.g. Current, Plan, Future)
	  */
	public int getM_CostType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_CostType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_Cost_UU.
		@param M_Cost_UU M_Cost_UU
	*/
	public void setM_Cost_UU (String M_Cost_UU)
	{
		set_Value (COLUMNNAME_M_Cost_UU, M_Cost_UU);
	}

	/** Get M_Cost_UU.
		@return M_Cost_UU	  */
	public String getM_Cost_UU()
	{
		return (String)get_Value(COLUMNNAME_M_Cost_UU);
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

	/** Set Percent.
		@param Percent Percentage
	*/
	public void setPercent (int Percent)
	{
		set_Value (COLUMNNAME_Percent, Integer.valueOf(Percent));
	}

	/** Get Percent.
		@return Percentage
	  */
	public int getPercent()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Percent);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Processed.
		@param Processed The document has been processed
	*/
	public void setProcessed (boolean Processed)
	{
		throw new IllegalArgumentException ("Processed is virtual column");	}

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
}