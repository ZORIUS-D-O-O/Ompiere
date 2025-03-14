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
import org.compiere.util.KeyNamePair;

/** Generated Model for M_BP_Price
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_BP_Price")
public class X_M_BP_Price extends PO implements I_M_BP_Price, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_BP_Price (Properties ctx, int M_BP_Price_ID, String trxName)
    {
      super (ctx, M_BP_Price_ID, trxName);
      /** if (M_BP_Price_ID == 0)
        {
			setBreakValue (Env.ZERO);
			setC_BPartner_ID (0);
			setC_Currency_ID (0);
			setM_BP_Price_ID (0);
			setM_Product_ID (0);
			setPriceLimit (Env.ZERO);
			setPriceList (Env.ZERO);
			setPriceStd (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_M_BP_Price (Properties ctx, int M_BP_Price_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_BP_Price_ID, trxName, virtualColumns);
      /** if (M_BP_Price_ID == 0)
        {
			setBreakValue (Env.ZERO);
			setC_BPartner_ID (0);
			setC_Currency_ID (0);
			setM_BP_Price_ID (0);
			setM_Product_ID (0);
			setPriceLimit (Env.ZERO);
			setPriceList (Env.ZERO);
			setPriceStd (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_M_BP_Price (Properties ctx, String M_BP_Price_UU, String trxName)
    {
      super (ctx, M_BP_Price_UU, trxName);
      /** if (M_BP_Price_UU == null)
        {
			setBreakValue (Env.ZERO);
			setC_BPartner_ID (0);
			setC_Currency_ID (0);
			setM_BP_Price_ID (0);
			setM_Product_ID (0);
			setPriceLimit (Env.ZERO);
			setPriceList (Env.ZERO);
			setPriceStd (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_M_BP_Price (Properties ctx, String M_BP_Price_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_BP_Price_UU, trxName, virtualColumns);
      /** if (M_BP_Price_UU == null)
        {
			setBreakValue (Env.ZERO);
			setC_BPartner_ID (0);
			setC_Currency_ID (0);
			setM_BP_Price_ID (0);
			setM_Product_ID (0);
			setPriceLimit (Env.ZERO);
			setPriceList (Env.ZERO);
			setPriceStd (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_M_BP_Price (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_M_BP_Price[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Break Value.
		@param BreakValue Low Value of trade discount break level
	*/
	public void setBreakValue (BigDecimal BreakValue)
	{
		set_ValueNoCheck (COLUMNNAME_BreakValue, BreakValue);
	}

	/** Get Break Value.
		@return Low Value of trade discount break level
	  */
	public BigDecimal getBreakValue()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BreakValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
	{
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_ID)
			.getPO(getC_Currency_ID(), get_TrxName());
	}

	/** Set Currency.
		@param C_Currency_ID The Currency for this record
	*/
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1)
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comments.
		@param Comments Comments or additional information
	*/
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments()
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** Set Discount %.
		@param Discount Discount in percent
	*/
	public void setDiscount (BigDecimal Discount)
	{
		set_Value (COLUMNNAME_Discount, Discount);
	}

	/** Get Discount %.
		@return Discount in percent
	  */
	public BigDecimal getDiscount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Discount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Net Price.
		@param IsNetPrice Net Price including all discounts
	*/
	public void setIsNetPrice (boolean IsNetPrice)
	{
		set_Value (COLUMNNAME_IsNetPrice, Boolean.valueOf(IsNetPrice));
	}

	/** Get Net Price.
		@return Net Price including all discounts
	  */
	public boolean isNetPrice()
	{
		Object oo = get_Value(COLUMNNAME_IsNetPrice);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Business Partner Price.
		@param M_BP_Price_ID Business Partner Price
	*/
	public void setM_BP_Price_ID (int M_BP_Price_ID)
	{
		if (M_BP_Price_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_BP_Price_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_BP_Price_ID, Integer.valueOf(M_BP_Price_ID));
	}

	/** Get Business Partner Price.
		@return Business Partner Price	  */
	public int getM_BP_Price_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_BP_Price_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_BP_Price_UU.
		@param M_BP_Price_UU M_BP_Price_UU
	*/
	public void setM_BP_Price_UU (String M_BP_Price_UU)
	{
		set_Value (COLUMNNAME_M_BP_Price_UU, M_BP_Price_UU);
	}

	/** Get M_BP_Price_UU.
		@return M_BP_Price_UU	  */
	public String getM_BP_Price_UU()
	{
		return (String)get_Value(COLUMNNAME_M_BP_Price_UU);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getM_Product_ID()));
    }

	/** Set Limit Price.
		@param PriceLimit Lowest price for a product
	*/
	public void setPriceLimit (BigDecimal PriceLimit)
	{
		set_Value (COLUMNNAME_PriceLimit, PriceLimit);
	}

	/** Get Limit Price.
		@return Lowest price for a product
	  */
	public BigDecimal getPriceLimit()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLimit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set List Price.
		@param PriceList List Price
	*/
	public void setPriceList (BigDecimal PriceList)
	{
		set_Value (COLUMNNAME_PriceList, PriceList);
	}

	/** Get List Price.
		@return List Price
	  */
	public BigDecimal getPriceList()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceList);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** PriceOverrideType AD_Reference_ID=53410 */
	public static final int PRICEOVERRIDETYPE_AD_Reference_ID=53410;
	/** Discount = D */
	public static final String PRICEOVERRIDETYPE_Discount = "D";
	/** Fixed Price = P */
	public static final String PRICEOVERRIDETYPE_FixedPrice = "P";
	/** Set Price Override Type.
		@param PriceOverrideType Type of price override, fixed price or discount off list
	*/
	public void setPriceOverrideType (String PriceOverrideType)
	{

		set_Value (COLUMNNAME_PriceOverrideType, PriceOverrideType);
	}

	/** Get Price Override Type.
		@return Type of price override, fixed price or discount off list
	  */
	public String getPriceOverrideType()
	{
		return (String)get_Value(COLUMNNAME_PriceOverrideType);
	}

	/** Set Standard Price.
		@param PriceStd Standard Price
	*/
	public void setPriceStd (BigDecimal PriceStd)
	{
		set_Value (COLUMNNAME_PriceStd, PriceStd);
	}

	/** Get Standard Price.
		@return Standard Price
	  */
	public BigDecimal getPriceStd()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceStd);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Valid from.
		@param ValidFrom Valid from including this date (first day)
	*/
	public void setValidFrom (Timestamp ValidFrom)
	{
		set_Value (COLUMNNAME_ValidFrom, ValidFrom);
	}

	/** Get Valid from.
		@return Valid from including this date (first day)
	  */
	public Timestamp getValidFrom()
	{
		return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
	}

	/** Set Valid to.
		@param ValidTo Valid to including this date (last day)
	*/
	public void setValidTo (Timestamp ValidTo)
	{
		set_Value (COLUMNNAME_ValidTo, ValidTo);
	}

	/** Get Valid to.
		@return Valid to including this date (last day)
	  */
	public Timestamp getValidTo()
	{
		return (Timestamp)get_Value(COLUMNNAME_ValidTo);
	}
}