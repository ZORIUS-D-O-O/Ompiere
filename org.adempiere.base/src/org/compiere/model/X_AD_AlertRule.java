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

/** Generated Model for AD_AlertRule
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_AlertRule")
public class X_AD_AlertRule extends PO implements I_AD_AlertRule, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_AlertRule (Properties ctx, int AD_AlertRule_ID, String trxName)
    {
      super (ctx, AD_AlertRule_ID, trxName);
      /** if (AD_AlertRule_ID == 0)
        {
			setAD_AlertRule_ID (0);
			setAD_Alert_ID (0);
			setFromClause (null);
			setIsValid (true);
// Y
			setName (null);
			setSelectClause (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_AlertRule (Properties ctx, int AD_AlertRule_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_AlertRule_ID, trxName, virtualColumns);
      /** if (AD_AlertRule_ID == 0)
        {
			setAD_AlertRule_ID (0);
			setAD_Alert_ID (0);
			setFromClause (null);
			setIsValid (true);
// Y
			setName (null);
			setSelectClause (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_AlertRule (Properties ctx, String AD_AlertRule_UU, String trxName)
    {
      super (ctx, AD_AlertRule_UU, trxName);
      /** if (AD_AlertRule_UU == null)
        {
			setAD_AlertRule_ID (0);
			setAD_Alert_ID (0);
			setFromClause (null);
			setIsValid (true);
// Y
			setName (null);
			setSelectClause (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_AlertRule (Properties ctx, String AD_AlertRule_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_AlertRule_UU, trxName, virtualColumns);
      /** if (AD_AlertRule_UU == null)
        {
			setAD_AlertRule_ID (0);
			setAD_Alert_ID (0);
			setFromClause (null);
			setIsValid (true);
// Y
			setName (null);
			setSelectClause (null);
        } */
    }

    /** Load Constructor */
    public X_AD_AlertRule (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_AlertRule[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Alert Rule.
		@param AD_AlertRule_ID Definition of the alert element
	*/
	public void setAD_AlertRule_ID (int AD_AlertRule_ID)
	{
		if (AD_AlertRule_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_AlertRule_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_AlertRule_ID, Integer.valueOf(AD_AlertRule_ID));
	}

	/** Get Alert Rule.
		@return Definition of the alert element
	  */
	public int getAD_AlertRule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_AlertRule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_AlertRule_UU.
		@param AD_AlertRule_UU AD_AlertRule_UU
	*/
	public void setAD_AlertRule_UU (String AD_AlertRule_UU)
	{
		set_Value (COLUMNNAME_AD_AlertRule_UU, AD_AlertRule_UU);
	}

	/** Get AD_AlertRule_UU.
		@return AD_AlertRule_UU	  */
	public String getAD_AlertRule_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_AlertRule_UU);
	}

	public org.compiere.model.I_AD_Alert getAD_Alert() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Alert)MTable.get(getCtx(), org.compiere.model.I_AD_Alert.Table_ID)
			.getPO(getAD_Alert_ID(), get_TrxName());
	}

	/** Set Alert.
		@param AD_Alert_ID Ompiere Alert
	*/
	public void setAD_Alert_ID (int AD_Alert_ID)
	{
		if (AD_Alert_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Alert_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Alert_ID, Integer.valueOf(AD_Alert_ID));
	}

	/** Get Alert.
		@return Ompiere Alert
	  */
	public int getAD_Alert_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Alert_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Error Msg.
		@param ErrorMsg Error Msg
	*/
	public void setErrorMsg (String ErrorMsg)
	{
		set_Value (COLUMNNAME_ErrorMsg, ErrorMsg);
	}

	/** Get Error Msg.
		@return Error Msg	  */
	public String getErrorMsg()
	{
		return (String)get_Value(COLUMNNAME_ErrorMsg);
	}

	/** Set Sql FROM.
		@param FromClause SQL FROM clause
	*/
	public void setFromClause (String FromClause)
	{
		set_Value (COLUMNNAME_FromClause, FromClause);
	}

	/** Get Sql FROM.
		@return SQL FROM clause
	  */
	public String getFromClause()
	{
		return (String)get_Value(COLUMNNAME_FromClause);
	}

	/** Set Valid.
		@param IsValid Element is valid
	*/
	public void setIsValid (boolean IsValid)
	{
		set_Value (COLUMNNAME_IsValid, Boolean.valueOf(IsValid));
	}

	/** Get Valid.
		@return Element is valid
	  */
	public boolean isValid()
	{
		Object oo = get_Value(COLUMNNAME_IsValid);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Other SQL Clause.
		@param OtherClause Other SQL Clause
	*/
	public void setOtherClause (String OtherClause)
	{
		set_Value (COLUMNNAME_OtherClause, OtherClause);
	}

	/** Get Other SQL Clause.
		@return Other SQL Clause
	  */
	public String getOtherClause()
	{
		return (String)get_Value(COLUMNNAME_OtherClause);
	}

	/** Set Post Processing.
		@param PostProcessing Process SQL after executing the query
	*/
	public void setPostProcessing (String PostProcessing)
	{
		set_Value (COLUMNNAME_PostProcessing, PostProcessing);
	}

	/** Get Post Processing.
		@return Process SQL after executing the query
	  */
	public String getPostProcessing()
	{
		return (String)get_Value(COLUMNNAME_PostProcessing);
	}

	/** Set Pre Processing.
		@param PreProcessing Process SQL before executing the query
	*/
	public void setPreProcessing (String PreProcessing)
	{
		set_Value (COLUMNNAME_PreProcessing, PreProcessing);
	}

	/** Get Pre Processing.
		@return Process SQL before executing the query
	  */
	public String getPreProcessing()
	{
		return (String)get_Value(COLUMNNAME_PreProcessing);
	}

	/** Set Sql SELECT.
		@param SelectClause SQL SELECT clause
	*/
	public void setSelectClause (String SelectClause)
	{
		set_Value (COLUMNNAME_SelectClause, SelectClause);
	}

	/** Get Sql SELECT.
		@return SQL SELECT clause
	  */
	public String getSelectClause()
	{
		return (String)get_Value(COLUMNNAME_SelectClause);
	}

	/** Set Sql WHERE.
		@param WhereClause Fully qualified SQL WHERE clause
	*/
	public void setWhereClause (String WhereClause)
	{
		set_Value (COLUMNNAME_WhereClause, WhereClause);
	}

	/** Get Sql WHERE.
		@return Fully qualified SQL WHERE clause
	  */
	public String getWhereClause()
	{
		return (String)get_Value(COLUMNNAME_WhereClause);
	}
}