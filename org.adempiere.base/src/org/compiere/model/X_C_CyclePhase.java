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

/** Generated Model for C_CyclePhase
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_CyclePhase")
public class X_C_CyclePhase extends PO implements I_C_CyclePhase, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_CyclePhase (Properties ctx, int C_CyclePhase_ID, String trxName)
    {
      super (ctx, C_CyclePhase_ID, trxName);
      /** if (C_CyclePhase_ID == 0)
        {
			setC_CycleStep_ID (0);
			setC_Phase_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_C_CyclePhase (Properties ctx, int C_CyclePhase_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_CyclePhase_ID, trxName, virtualColumns);
      /** if (C_CyclePhase_ID == 0)
        {
			setC_CycleStep_ID (0);
			setC_Phase_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_C_CyclePhase (Properties ctx, String C_CyclePhase_UU, String trxName)
    {
      super (ctx, C_CyclePhase_UU, trxName);
      /** if (C_CyclePhase_UU == null)
        {
			setC_CycleStep_ID (0);
			setC_Phase_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_C_CyclePhase (Properties ctx, String C_CyclePhase_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_CyclePhase_UU, trxName, virtualColumns);
      /** if (C_CyclePhase_UU == null)
        {
			setC_CycleStep_ID (0);
			setC_Phase_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_CyclePhase (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_CyclePhase[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	/** Set C_CyclePhase_UU.
		@param C_CyclePhase_UU C_CyclePhase_UU
	*/
	public void setC_CyclePhase_UU (String C_CyclePhase_UU)
	{
		set_Value (COLUMNNAME_C_CyclePhase_UU, C_CyclePhase_UU);
	}

	/** Get C_CyclePhase_UU.
		@return C_CyclePhase_UU	  */
	public String getC_CyclePhase_UU()
	{
		return (String)get_Value(COLUMNNAME_C_CyclePhase_UU);
	}

	public org.compiere.model.I_C_CycleStep getC_CycleStep() throws RuntimeException
	{
		return (org.compiere.model.I_C_CycleStep)MTable.get(getCtx(), org.compiere.model.I_C_CycleStep.Table_ID)
			.getPO(getC_CycleStep_ID(), get_TrxName());
	}

	/** Set Cycle Step.
		@param C_CycleStep_ID The step for this Cycle
	*/
	public void setC_CycleStep_ID (int C_CycleStep_ID)
	{
		if (C_CycleStep_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_CycleStep_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_CycleStep_ID, Integer.valueOf(C_CycleStep_ID));
	}

	/** Get Cycle Step.
		@return The step for this Cycle
	  */
	public int getC_CycleStep_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_CycleStep_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Phase getC_Phase() throws RuntimeException
	{
		return (org.compiere.model.I_C_Phase)MTable.get(getCtx(), org.compiere.model.I_C_Phase.Table_ID)
			.getPO(getC_Phase_ID(), get_TrxName());
	}

	/** Set Standard Phase.
		@param C_Phase_ID Standard Phase of the Project Type
	*/
	public void setC_Phase_ID (int C_Phase_ID)
	{
		if (C_Phase_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Phase_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Phase_ID, Integer.valueOf(C_Phase_ID));
	}

	/** Get Standard Phase.
		@return Standard Phase of the Project Type
	  */
	public int getC_Phase_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Phase_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}