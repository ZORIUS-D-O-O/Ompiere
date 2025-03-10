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
import org.compiere.util.ValueNamePair;

/** Generated Model for C_ProjectIssueMA
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_ProjectIssueMA")
public class X_C_ProjectIssueMA extends PO implements I_C_ProjectIssueMA, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_ProjectIssueMA (Properties ctx, int C_ProjectIssueMA_ID, String trxName)
    {
      super (ctx, C_ProjectIssueMA_ID, trxName);
      /** if (C_ProjectIssueMA_ID == 0)
        {
			setC_ProjectIssue_ID (0);
			setM_AttributeSetInstance_ID (0);
			setMovementQty (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_ProjectIssueMA (Properties ctx, int C_ProjectIssueMA_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_ProjectIssueMA_ID, trxName, virtualColumns);
      /** if (C_ProjectIssueMA_ID == 0)
        {
			setC_ProjectIssue_ID (0);
			setM_AttributeSetInstance_ID (0);
			setMovementQty (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_ProjectIssueMA (Properties ctx, String C_ProjectIssueMA_UU, String trxName)
    {
      super (ctx, C_ProjectIssueMA_UU, trxName);
      /** if (C_ProjectIssueMA_UU == null)
        {
			setC_ProjectIssue_ID (0);
			setM_AttributeSetInstance_ID (0);
			setMovementQty (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_ProjectIssueMA (Properties ctx, String C_ProjectIssueMA_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_ProjectIssueMA_UU, trxName, virtualColumns);
      /** if (C_ProjectIssueMA_UU == null)
        {
			setC_ProjectIssue_ID (0);
			setM_AttributeSetInstance_ID (0);
			setMovementQty (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_C_ProjectIssueMA (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_ProjectIssueMA[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	/** Set C_ProjectIssueMA_UU.
		@param C_ProjectIssueMA_UU C_ProjectIssueMA_UU
	*/
	public void setC_ProjectIssueMA_UU (String C_ProjectIssueMA_UU)
	{
		set_Value (COLUMNNAME_C_ProjectIssueMA_UU, C_ProjectIssueMA_UU);
	}

	/** Get C_ProjectIssueMA_UU.
		@return C_ProjectIssueMA_UU	  */
	public String getC_ProjectIssueMA_UU()
	{
		return (String)get_Value(COLUMNNAME_C_ProjectIssueMA_UU);
	}

	public org.compiere.model.I_C_ProjectIssue getC_ProjectIssue() throws RuntimeException
	{
		return (org.compiere.model.I_C_ProjectIssue)MTable.get(getCtx(), org.compiere.model.I_C_ProjectIssue.Table_ID)
			.getPO(getC_ProjectIssue_ID(), get_TrxName());
	}

	/** Set Project Issue.
		@param C_ProjectIssue_ID Project Issues (Material, Labor)
	*/
	public void setC_ProjectIssue_ID (int C_ProjectIssue_ID)
	{
		if (C_ProjectIssue_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_ProjectIssue_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_ProjectIssue_ID, Integer.valueOf(C_ProjectIssue_ID));
	}

	/** Get Project Issue.
		@return Project Issues (Material, Labor)
	  */
	public int getC_ProjectIssue_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectIssue_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record UU/ColumnName
        @return UU/ColumnName pair
      */
    public ValueNamePair getValueNamePair()
    {
        return new ValueNamePair(get_UUID(), String.valueOf(getC_ProjectIssue_ID()));
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

	/** Set Movement Quantity.
		@param MovementQty Quantity of a product moved.
	*/
	public void setMovementQty (BigDecimal MovementQty)
	{
		set_Value (COLUMNNAME_MovementQty, MovementQty);
	}

	/** Get Movement Quantity.
		@return Quantity of a product moved.
	  */
	public BigDecimal getMovementQty()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}