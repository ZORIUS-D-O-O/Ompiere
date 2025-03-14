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

/** Generated Model for AD_Attachment
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_Attachment")
public class X_AD_Attachment extends PO implements I_AD_Attachment, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_Attachment (Properties ctx, int AD_Attachment_ID, String trxName)
    {
      super (ctx, AD_Attachment_ID, trxName);
      /** if (AD_Attachment_ID == 0)
        {
			setAD_Attachment_ID (0);
			setAD_Table_ID (0);
			setTitle (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Attachment (Properties ctx, int AD_Attachment_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Attachment_ID, trxName, virtualColumns);
      /** if (AD_Attachment_ID == 0)
        {
			setAD_Attachment_ID (0);
			setAD_Table_ID (0);
			setTitle (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Attachment (Properties ctx, String AD_Attachment_UU, String trxName)
    {
      super (ctx, AD_Attachment_UU, trxName);
      /** if (AD_Attachment_UU == null)
        {
			setAD_Attachment_ID (0);
			setAD_Table_ID (0);
			setTitle (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Attachment (Properties ctx, String AD_Attachment_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Attachment_UU, trxName, virtualColumns);
      /** if (AD_Attachment_UU == null)
        {
			setAD_Attachment_ID (0);
			setAD_Table_ID (0);
			setTitle (null);
        } */
    }

    /** Load Constructor */
    public X_AD_Attachment (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_Attachment[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Attachment.
		@param AD_Attachment_ID Attachment for the document
	*/
	public void setAD_Attachment_ID (int AD_Attachment_ID)
	{
		if (AD_Attachment_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Attachment_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Attachment_ID, Integer.valueOf(AD_Attachment_ID));
	}

	/** Get Attachment.
		@return Attachment for the document
	  */
	public int getAD_Attachment_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Attachment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Attachment_UU.
		@param AD_Attachment_UU AD_Attachment_UU
	*/
	public void setAD_Attachment_UU (String AD_Attachment_UU)
	{
		set_Value (COLUMNNAME_AD_Attachment_UU, AD_Attachment_UU);
	}

	/** Get AD_Attachment_UU.
		@return AD_Attachment_UU	  */
	public String getAD_Attachment_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_Attachment_UU);
	}

	public org.compiere.model.I_AD_StorageProvider getAD_StorageProvider() throws RuntimeException
	{
		return (org.compiere.model.I_AD_StorageProvider)MTable.get(getCtx(), org.compiere.model.I_AD_StorageProvider.Table_ID)
			.getPO(getAD_StorageProvider_ID(), get_TrxName());
	}

	/** Set Storage Provider.
		@param AD_StorageProvider_ID Storage Provider
	*/
	public void setAD_StorageProvider_ID (int AD_StorageProvider_ID)
	{
		if (AD_StorageProvider_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_StorageProvider_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_StorageProvider_ID, Integer.valueOf(AD_StorageProvider_ID));
	}

	/** Get Storage Provider.
		@return Storage Provider	  */
	public int getAD_StorageProvider_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_StorageProvider_ID);
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
			set_ValueNoCheck (COLUMNNAME_AD_Table_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
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

	/** Set Binary Data.
		@param BinaryData Binary Data
	*/
	public void setBinaryData (byte[] BinaryData)
	{
		set_ValueNoCheck (COLUMNNAME_BinaryData, BinaryData);
	}

	/** Get Binary Data.
		@return Binary Data
	  */
	public byte[] getBinaryData()
	{
		return (byte[])get_Value(COLUMNNAME_BinaryData);
	}

	/** Set Record ID.
		@param Record_ID Direct internal record ID
	*/
	public void setRecord_ID (int Record_ID)
	{
		if (Record_ID < 0)
			set_ValueNoCheck (COLUMNNAME_Record_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
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

	/** Set Record UUID.
		@param Record_UU Record UUID
	*/
	public void setRecord_UU (String Record_UU)
	{
		set_ValueNoCheck (COLUMNNAME_Record_UU, Record_UU);
	}

	/** Get Record UUID.
		@return Record UUID	  */
	public String getRecord_UU()
	{
		return (String)get_Value(COLUMNNAME_Record_UU);
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

	/** Set Title.
		@param Title Name this entity is referred to as
	*/
	public void setTitle (String Title)
	{
		set_Value (COLUMNNAME_Title, Title);
	}

	/** Get Title.
		@return Name this entity is referred to as
	  */
	public String getTitle()
	{
		return (String)get_Value(COLUMNNAME_Title);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getTitle());
    }
}