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

/** Generated Model for AD_TaskInstance
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_TaskInstance")
public class X_AD_TaskInstance extends PO implements I_AD_TaskInstance, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_TaskInstance (Properties ctx, int AD_TaskInstance_ID, String trxName)
    {
      super (ctx, AD_TaskInstance_ID, trxName);
      /** if (AD_TaskInstance_ID == 0)
        {
			setAD_TaskInstance_ID (0);
			setAD_Task_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_AD_TaskInstance (Properties ctx, int AD_TaskInstance_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_TaskInstance_ID, trxName, virtualColumns);
      /** if (AD_TaskInstance_ID == 0)
        {
			setAD_TaskInstance_ID (0);
			setAD_Task_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_AD_TaskInstance (Properties ctx, String AD_TaskInstance_UU, String trxName)
    {
      super (ctx, AD_TaskInstance_UU, trxName);
      /** if (AD_TaskInstance_UU == null)
        {
			setAD_TaskInstance_ID (0);
			setAD_Task_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_AD_TaskInstance (Properties ctx, String AD_TaskInstance_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_TaskInstance_UU, trxName, virtualColumns);
      /** if (AD_TaskInstance_UU == null)
        {
			setAD_TaskInstance_ID (0);
			setAD_Task_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_TaskInstance (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_TaskInstance[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Task Instance.
		@param AD_TaskInstance_ID Task Instance
	*/
	public void setAD_TaskInstance_ID (int AD_TaskInstance_ID)
	{
		if (AD_TaskInstance_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_TaskInstance_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_TaskInstance_ID, Integer.valueOf(AD_TaskInstance_ID));
	}

	/** Get Task Instance.
		@return Task Instance	  */
	public int getAD_TaskInstance_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_TaskInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_TaskInstance_ID()));
    }

	/** Set AD_TaskInstance_UU.
		@param AD_TaskInstance_UU AD_TaskInstance_UU
	*/
	public void setAD_TaskInstance_UU (String AD_TaskInstance_UU)
	{
		set_Value (COLUMNNAME_AD_TaskInstance_UU, AD_TaskInstance_UU);
	}

	/** Get AD_TaskInstance_UU.
		@return AD_TaskInstance_UU	  */
	public String getAD_TaskInstance_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_TaskInstance_UU);
	}

	/** Set OS Task.
		@param AD_Task_ID Operation System Task
	*/
	public void setAD_Task_ID (int AD_Task_ID)
	{
		if (AD_Task_ID < 1)
			set_Value (COLUMNNAME_AD_Task_ID, null);
		else
			set_Value (COLUMNNAME_AD_Task_ID, Integer.valueOf(AD_Task_ID));
	}

	/** Get OS Task.
		@return Operation System Task
	  */
	public int getAD_Task_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Task_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}