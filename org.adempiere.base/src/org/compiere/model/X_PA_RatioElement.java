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

/** Generated Model for PA_RatioElement
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="PA_RatioElement")
public class X_PA_RatioElement extends PO implements I_PA_RatioElement, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_PA_RatioElement (Properties ctx, int PA_RatioElement_ID, String trxName)
    {
      super (ctx, PA_RatioElement_ID, trxName);
      /** if (PA_RatioElement_ID == 0)
        {
			setName (null);
			setPA_RatioElement_ID (0);
			setPA_Ratio_ID (0);
			setRatioElementType (null);
			setRatioOperand (null);
// P
			setSeqNo (0);
        } */
    }

    /** Standard Constructor */
    public X_PA_RatioElement (Properties ctx, int PA_RatioElement_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, PA_RatioElement_ID, trxName, virtualColumns);
      /** if (PA_RatioElement_ID == 0)
        {
			setName (null);
			setPA_RatioElement_ID (0);
			setPA_Ratio_ID (0);
			setRatioElementType (null);
			setRatioOperand (null);
// P
			setSeqNo (0);
        } */
    }

    /** Standard Constructor */
    public X_PA_RatioElement (Properties ctx, String PA_RatioElement_UU, String trxName)
    {
      super (ctx, PA_RatioElement_UU, trxName);
      /** if (PA_RatioElement_UU == null)
        {
			setName (null);
			setPA_RatioElement_ID (0);
			setPA_Ratio_ID (0);
			setRatioElementType (null);
			setRatioOperand (null);
// P
			setSeqNo (0);
        } */
    }

    /** Standard Constructor */
    public X_PA_RatioElement (Properties ctx, String PA_RatioElement_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, PA_RatioElement_UU, trxName, virtualColumns);
      /** if (PA_RatioElement_UU == null)
        {
			setName (null);
			setPA_RatioElement_ID (0);
			setPA_Ratio_ID (0);
			setRatioElementType (null);
			setRatioOperand (null);
// P
			setSeqNo (0);
        } */
    }

    /** Load Constructor */
    public X_PA_RatioElement (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_PA_RatioElement[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_ElementValue getAccount() throws RuntimeException
	{
		return (org.compiere.model.I_C_ElementValue)MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_ID)
			.getPO(getAccount_ID(), get_TrxName());
	}

	/** Set Account.
		@param Account_ID Account used
	*/
	public void setAccount_ID (int Account_ID)
	{
		if (Account_ID < 1)
			set_Value (COLUMNNAME_Account_ID, null);
		else
			set_Value (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
	}

	/** Get Account.
		@return Account used
	  */
	public int getAccount_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Constant Value.
		@param ConstantValue Constant value
	*/
	public void setConstantValue (BigDecimal ConstantValue)
	{
		set_Value (COLUMNNAME_ConstantValue, ConstantValue);
	}

	/** Get Constant Value.
		@return Constant value
	  */
	public BigDecimal getConstantValue()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ConstantValue);
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

	public org.compiere.model.I_PA_MeasureCalc getPA_MeasureCalc() throws RuntimeException
	{
		return (org.compiere.model.I_PA_MeasureCalc)MTable.get(getCtx(), org.compiere.model.I_PA_MeasureCalc.Table_ID)
			.getPO(getPA_MeasureCalc_ID(), get_TrxName());
	}

	/** Set Measure Calculation.
		@param PA_MeasureCalc_ID Calculation method for measuring performance
	*/
	public void setPA_MeasureCalc_ID (int PA_MeasureCalc_ID)
	{
		if (PA_MeasureCalc_ID < 1)
			set_Value (COLUMNNAME_PA_MeasureCalc_ID, null);
		else
			set_Value (COLUMNNAME_PA_MeasureCalc_ID, Integer.valueOf(PA_MeasureCalc_ID));
	}

	/** Get Measure Calculation.
		@return Calculation method for measuring performance
	  */
	public int getPA_MeasureCalc_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_MeasureCalc_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Ratio Element.
		@param PA_RatioElement_ID Performance Ratio Element
	*/
	public void setPA_RatioElement_ID (int PA_RatioElement_ID)
	{
		if (PA_RatioElement_ID < 1)
			set_ValueNoCheck (COLUMNNAME_PA_RatioElement_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_PA_RatioElement_ID, Integer.valueOf(PA_RatioElement_ID));
	}

	/** Get Ratio Element.
		@return Performance Ratio Element
	  */
	public int getPA_RatioElement_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_RatioElement_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PA_RatioElement_UU.
		@param PA_RatioElement_UU PA_RatioElement_UU
	*/
	public void setPA_RatioElement_UU (String PA_RatioElement_UU)
	{
		set_Value (COLUMNNAME_PA_RatioElement_UU, PA_RatioElement_UU);
	}

	/** Get PA_RatioElement_UU.
		@return PA_RatioElement_UU	  */
	public String getPA_RatioElement_UU()
	{
		return (String)get_Value(COLUMNNAME_PA_RatioElement_UU);
	}

	public org.compiere.model.I_PA_Ratio getPA_RatioUsed() throws RuntimeException
	{
		return (org.compiere.model.I_PA_Ratio)MTable.get(getCtx(), org.compiere.model.I_PA_Ratio.Table_ID)
			.getPO(getPA_RatioUsed_ID(), get_TrxName());
	}

	/** Set Ratio Used.
		@param PA_RatioUsed_ID Performance Ratio Used
	*/
	public void setPA_RatioUsed_ID (int PA_RatioUsed_ID)
	{
		if (PA_RatioUsed_ID < 1)
			set_Value (COLUMNNAME_PA_RatioUsed_ID, null);
		else
			set_Value (COLUMNNAME_PA_RatioUsed_ID, Integer.valueOf(PA_RatioUsed_ID));
	}

	/** Get Ratio Used.
		@return Performance Ratio Used
	  */
	public int getPA_RatioUsed_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_RatioUsed_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_PA_Ratio getPA_Ratio() throws RuntimeException
	{
		return (org.compiere.model.I_PA_Ratio)MTable.get(getCtx(), org.compiere.model.I_PA_Ratio.Table_ID)
			.getPO(getPA_Ratio_ID(), get_TrxName());
	}

	/** Set Ratio.
		@param PA_Ratio_ID Performance Ratio
	*/
	public void setPA_Ratio_ID (int PA_Ratio_ID)
	{
		if (PA_Ratio_ID < 1)
			set_ValueNoCheck (COLUMNNAME_PA_Ratio_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_PA_Ratio_ID, Integer.valueOf(PA_Ratio_ID));
	}

	/** Get Ratio.
		@return Performance Ratio
	  */
	public int getPA_Ratio_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_Ratio_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** PostingType AD_Reference_ID=125 */
	public static final int POSTINGTYPE_AD_Reference_ID=125;
	/** Actual = A */
	public static final String POSTINGTYPE_Actual = "A";
	/** Budget = B */
	public static final String POSTINGTYPE_Budget = "B";
	/** Commitment = E */
	public static final String POSTINGTYPE_Commitment = "E";
	/** Reservation = R */
	public static final String POSTINGTYPE_Reservation = "R";
	/** Statistical = S */
	public static final String POSTINGTYPE_Statistical = "S";
	/** Set Posting Type.
		@param PostingType The type of posted amount for the transaction
	*/
	public void setPostingType (String PostingType)
	{

		set_Value (COLUMNNAME_PostingType, PostingType);
	}

	/** Get Posting Type.
		@return The type of posted amount for the transaction
	  */
	public String getPostingType()
	{
		return (String)get_Value(COLUMNNAME_PostingType);
	}

	/** RatioElementType AD_Reference_ID=372 */
	public static final int RATIOELEMENTTYPE_AD_Reference_ID=372;
	/** Account Value = A */
	public static final String RATIOELEMENTTYPE_AccountValue = "A";
	/** Constant = C */
	public static final String RATIOELEMENTTYPE_Constant = "C";
	/** Ratio = R */
	public static final String RATIOELEMENTTYPE_Ratio = "R";
	/** Calculation = X */
	public static final String RATIOELEMENTTYPE_Calculation = "X";
	/** Set Element Type.
		@param RatioElementType Ratio Element Type
	*/
	public void setRatioElementType (String RatioElementType)
	{

		set_Value (COLUMNNAME_RatioElementType, RatioElementType);
	}

	/** Get Element Type.
		@return Ratio Element Type
	  */
	public String getRatioElementType()
	{
		return (String)get_Value(COLUMNNAME_RatioElementType);
	}

	/** RatioOperand AD_Reference_ID=373 */
	public static final int RATIOOPERAND_AD_Reference_ID=373;
	/** Divide = D */
	public static final String RATIOOPERAND_Divide = "D";
	/** Multiply = M */
	public static final String RATIOOPERAND_Multiply = "M";
	/** Minus = N */
	public static final String RATIOOPERAND_Minus = "N";
	/** Plus = P */
	public static final String RATIOOPERAND_Plus = "P";
	/** Set Operand.
		@param RatioOperand Ratio Operand
	*/
	public void setRatioOperand (String RatioOperand)
	{

		set_Value (COLUMNNAME_RatioOperand, RatioOperand);
	}

	/** Get Operand.
		@return Ratio Operand
	  */
	public String getRatioOperand()
	{
		return (String)get_Value(COLUMNNAME_RatioOperand);
	}

	/** Set Sequence.
		@param SeqNo Method of ordering records; lowest number comes first
	*/
	public void setSeqNo (int SeqNo)
	{
		set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
	}

	/** Get Sequence.
		@return Method of ordering records; lowest number comes first
	  */
	public int getSeqNo()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getSeqNo()));
    }
}