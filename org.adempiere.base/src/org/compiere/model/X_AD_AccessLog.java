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

/** Generated Model for AD_AccessLog
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_AccessLog")
public class X_AD_AccessLog extends PO implements I_AD_AccessLog, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_AccessLog (Properties ctx, int AD_AccessLog_ID, String trxName)
    {
      super (ctx, AD_AccessLog_ID, trxName);
      /** if (AD_AccessLog_ID == 0)
        {
			setAD_AccessLog_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_AD_AccessLog (Properties ctx, int AD_AccessLog_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_AccessLog_ID, trxName, virtualColumns);
      /** if (AD_AccessLog_ID == 0)
        {
			setAD_AccessLog_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_AD_AccessLog (Properties ctx, String AD_AccessLog_UU, String trxName)
    {
      super (ctx, AD_AccessLog_UU, trxName);
      /** if (AD_AccessLog_UU == null)
        {
			setAD_AccessLog_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_AD_AccessLog (Properties ctx, String AD_AccessLog_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_AccessLog_UU, trxName, virtualColumns);
      /** if (AD_AccessLog_UU == null)
        {
			setAD_AccessLog_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_AccessLog (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_AccessLog[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Access Log.
		@param AD_AccessLog_ID Log of Access to the System
	*/
	public void setAD_AccessLog_ID (int AD_AccessLog_ID)
	{
		if (AD_AccessLog_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_AccessLog_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_AccessLog_ID, Integer.valueOf(AD_AccessLog_ID));
	}

	/** Get Access Log.
		@return Log of Access to the System
	  */
	public int getAD_AccessLog_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_AccessLog_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_AccessLog_ID()));
    }

	/** Set AD_AccessLog_UU.
		@param AD_AccessLog_UU AD_AccessLog_UU
	*/
	public void setAD_AccessLog_UU (String AD_AccessLog_UU)
	{
		set_Value (COLUMNNAME_AD_AccessLog_UU, AD_AccessLog_UU);
	}

	/** Get AD_AccessLog_UU.
		@return AD_AccessLog_UU	  */
	public String getAD_AccessLog_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_AccessLog_UU);
	}

	public org.compiere.model.I_AD_Column getAD_Column() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Column)MTable.get(getCtx(), org.compiere.model.I_AD_Column.Table_ID)
			.getPO(getAD_Column_ID(), get_TrxName());
	}

	/** Set Column.
		@param AD_Column_ID Column in the table
	*/
	public void setAD_Column_ID (int AD_Column_ID)
	{
		if (AD_Column_ID < 1)
			set_Value (COLUMNNAME_AD_Column_ID, null);
		else
			set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
	}

	/** Get Column.
		@return Column in the table
	  */
	public int getAD_Column_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
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

	/** Set Remote Addr.
		@param Remote_Addr Remote Address
	*/
	public void setRemote_Addr (String Remote_Addr)
	{
		set_Value (COLUMNNAME_Remote_Addr, Remote_Addr);
	}

	/** Get Remote Addr.
		@return Remote Address
	  */
	public String getRemote_Addr()
	{
		return (String)get_Value(COLUMNNAME_Remote_Addr);
	}

	/** Set Remote Host.
		@param Remote_Host Remote host Info
	*/
	public void setRemote_Host (String Remote_Host)
	{
		set_Value (COLUMNNAME_Remote_Host, Remote_Host);
	}

	/** Get Remote Host.
		@return Remote host Info
	  */
	public String getRemote_Host()
	{
		return (String)get_Value(COLUMNNAME_Remote_Host);
	}

	/** Set Reply.
		@param Reply Reply or Answer
	*/
	public void setReply (String Reply)
	{
		set_Value (COLUMNNAME_Reply, Reply);
	}

	/** Get Reply.
		@return Reply or Answer
	  */
	public String getReply()
	{
		return (String)get_Value(COLUMNNAME_Reply);
	}

	/** Set Text Message.
		@param TextMsg Text Message
	*/
	public void setTextMsg (String TextMsg)
	{
		set_Value (COLUMNNAME_TextMsg, TextMsg);
	}

	/** Get Text Message.
		@return Text Message
	  */
	public String getTextMsg()
	{
		return (String)get_Value(COLUMNNAME_TextMsg);
	}
}