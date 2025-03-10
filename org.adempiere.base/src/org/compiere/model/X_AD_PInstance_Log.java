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

/** Generated Model for AD_PInstance_Log
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_PInstance_Log")
public class X_AD_PInstance_Log extends PO implements I_AD_PInstance_Log, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_PInstance_Log (Properties ctx, int AD_PInstance_Log_ID, String trxName)
    {
      super (ctx, AD_PInstance_Log_ID, trxName);
      /** if (AD_PInstance_Log_ID == 0)
        {
			setAD_PInstance_ID (0);
			setLog_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_AD_PInstance_Log (Properties ctx, int AD_PInstance_Log_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_PInstance_Log_ID, trxName, virtualColumns);
      /** if (AD_PInstance_Log_ID == 0)
        {
			setAD_PInstance_ID (0);
			setLog_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_AD_PInstance_Log (Properties ctx, String AD_PInstance_Log_UU, String trxName)
    {
      super (ctx, AD_PInstance_Log_UU, trxName);
      /** if (AD_PInstance_Log_UU == null)
        {
			setAD_PInstance_ID (0);
			setLog_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_AD_PInstance_Log (Properties ctx, String AD_PInstance_Log_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_PInstance_Log_UU, trxName, virtualColumns);
      /** if (AD_PInstance_Log_UU == null)
        {
			setAD_PInstance_ID (0);
			setLog_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_PInstance_Log (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client
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
      StringBuilder sb = new StringBuilder ("X_AD_PInstance_Log[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_PInstance getAD_PInstance() throws RuntimeException
	{
		return (org.compiere.model.I_AD_PInstance)MTable.get(getCtx(), org.compiere.model.I_AD_PInstance.Table_ID)
			.getPO(getAD_PInstance_ID(), get_TrxName());
	}

	/** Set Process Instance.
		@param AD_PInstance_ID Instance of the process
	*/
	public void setAD_PInstance_ID (int AD_PInstance_ID)
	{
		if (AD_PInstance_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
	}

	/** Get Process Instance.
		@return Instance of the process
	  */
	public int getAD_PInstance_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_PInstance_Log_UU.
		@param AD_PInstance_Log_UU AD_PInstance_Log_UU
	*/
	public void setAD_PInstance_Log_UU (String AD_PInstance_Log_UU)
	{
		set_Value (COLUMNNAME_AD_PInstance_Log_UU, AD_PInstance_Log_UU);
	}

	/** Get AD_PInstance_Log_UU.
		@return AD_PInstance_Log_UU	  */
	public String getAD_PInstance_Log_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_PInstance_Log_UU);
	}

	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Table)MTable.get(getCtx(), org.compiere.model.I_AD_Table.Table_ID)
			.getPO(getAD_Table_ID(), get_TrxName());
	}

	/** Set Table.
		@param AD_Table_ID Database Table information
	*/
	public void setAD_Table_ID (int AD_Table_ID)
	{
		if (AD_Table_ID < 1)
			set_Value (COLUMNNAME_AD_Table_ID, null);
		else
			set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
	}

	/** Get Table.
		@return Database Table information
	  */
	public int getAD_Table_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set JSON Data.
		@param JsonData The json field stores json data.
	*/
	public void setJsonData (String JsonData)
	{
		set_Value (COLUMNNAME_JsonData, JsonData);
	}

	/** Get JSON Data.
		@return The json field stores json data.
	  */
	public String getJsonData()
	{
		return (String)get_Value(COLUMNNAME_JsonData);
	}

	/** Set Log.
		@param Log_ID Log
	*/
	public void setLog_ID (int Log_ID)
	{
		if (Log_ID < 1)
			set_ValueNoCheck (COLUMNNAME_Log_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_Log_ID, Integer.valueOf(Log_ID));
	}

	/** Get Log.
		@return Log	  */
	public int getLog_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Log_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** PInstanceLogType AD_Reference_ID=200242 */
	public static final int PINSTANCELOGTYPE_AD_Reference_ID=200242;
	/** Progress = P */
	public static final String PINSTANCELOGTYPE_Progress = "P";
	/** Result = R */
	public static final String PINSTANCELOGTYPE_Result = "R";
	/** Status = S */
	public static final String PINSTANCELOGTYPE_Status = "S";
	/** Set Log Type.
		@param PInstanceLogType Process Audit Log Type
	*/
	public void setPInstanceLogType (String PInstanceLogType)
	{

		set_Value (COLUMNNAME_PInstanceLogType, PInstanceLogType);
	}

	/** Get Log Type.
		@return Process Audit Log Type
	  */
	public String getPInstanceLogType()
	{
		return (String)get_Value(COLUMNNAME_PInstanceLogType);
	}

	/** Set Process Date.
		@param P_Date Process Parameter
	*/
	public void setP_Date (Timestamp P_Date)
	{
		set_ValueNoCheck (COLUMNNAME_P_Date, P_Date);
	}

	/** Get Process Date.
		@return Process Parameter
	  */
	public Timestamp getP_Date()
	{
		return (Timestamp)get_Value(COLUMNNAME_P_Date);
	}

	/** Set Process ID.
		@param P_ID Process ID
	*/
	public void setP_ID (int P_ID)
	{
		if (P_ID < 1)
			set_ValueNoCheck (COLUMNNAME_P_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_P_ID, Integer.valueOf(P_ID));
	}

	/** Get Process ID.
		@return Process ID	  */
	public int getP_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_P_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Process Message.
		@param P_Msg Process Message
	*/
	public void setP_Msg (String P_Msg)
	{
		set_ValueNoCheck (COLUMNNAME_P_Msg, P_Msg);
	}

	/** Get Process Message.
		@return Process Message	  */
	public String getP_Msg()
	{
		return (String)get_Value(COLUMNNAME_P_Msg);
	}

	/** Set Process Number.
		@param P_Number Process Parameter
	*/
	public void setP_Number (BigDecimal P_Number)
	{
		set_ValueNoCheck (COLUMNNAME_P_Number, P_Number);
	}

	/** Get Process Number.
		@return Process Parameter
	  */
	public BigDecimal getP_Number()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_P_Number);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Record ID.
		@param Record_ID Direct internal record ID
	*/
	public void setRecord_ID (int Record_ID)
	{
		if (Record_ID < 0)
			set_Value (COLUMNNAME_Record_ID, null);
		else
			set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
	}

	/** Get Record ID.
		@return Direct internal record ID
	  */
	public int getRecord_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}