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

/** Generated Model for CM_Chat
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="CM_Chat")
public class X_CM_Chat extends PO implements I_CM_Chat, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_CM_Chat (Properties ctx, int CM_Chat_ID, String trxName)
    {
      super (ctx, CM_Chat_ID, trxName);
      /** if (CM_Chat_ID == 0)
        {
			setAD_Table_ID (0);
			setCM_Chat_ID (0);
			setConfidentialType (null);
			setDescription (null);
        } */
    }

    /** Standard Constructor */
    public X_CM_Chat (Properties ctx, int CM_Chat_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, CM_Chat_ID, trxName, virtualColumns);
      /** if (CM_Chat_ID == 0)
        {
			setAD_Table_ID (0);
			setCM_Chat_ID (0);
			setConfidentialType (null);
			setDescription (null);
        } */
    }

    /** Standard Constructor */
    public X_CM_Chat (Properties ctx, String CM_Chat_UU, String trxName)
    {
      super (ctx, CM_Chat_UU, trxName);
      /** if (CM_Chat_UU == null)
        {
			setAD_Table_ID (0);
			setCM_Chat_ID (0);
			setConfidentialType (null);
			setDescription (null);
        } */
    }

    /** Standard Constructor */
    public X_CM_Chat (Properties ctx, String CM_Chat_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, CM_Chat_UU, trxName, virtualColumns);
      /** if (CM_Chat_UU == null)
        {
			setAD_Table_ID (0);
			setCM_Chat_ID (0);
			setConfidentialType (null);
			setDescription (null);
        } */
    }

    /** Load Constructor */
    public X_CM_Chat (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org
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
      StringBuilder sb = new StringBuilder ("X_CM_Chat[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	public org.compiere.model.I_CM_ChatType getCM_ChatType() throws RuntimeException
	{
		return (org.compiere.model.I_CM_ChatType)MTable.get(getCtx(), org.compiere.model.I_CM_ChatType.Table_ID)
			.getPO(getCM_ChatType_ID(), get_TrxName());
	}

	/** Set Chat Type.
		@param CM_ChatType_ID Type of discussion / chat
	*/
	public void setCM_ChatType_ID (int CM_ChatType_ID)
	{
		if (CM_ChatType_ID < 1)
			set_Value (COLUMNNAME_CM_ChatType_ID, null);
		else
			set_Value (COLUMNNAME_CM_ChatType_ID, Integer.valueOf(CM_ChatType_ID));
	}

	/** Get Chat Type.
		@return Type of discussion / chat
	  */
	public int getCM_ChatType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_ChatType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Chat.
		@param CM_Chat_ID Chat or discussion thread
	*/
	public void setCM_Chat_ID (int CM_Chat_ID)
	{
		if (CM_Chat_ID < 1)
			set_ValueNoCheck (COLUMNNAME_CM_Chat_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_CM_Chat_ID, Integer.valueOf(CM_Chat_ID));
	}

	/** Get Chat.
		@return Chat or discussion thread
	  */
	public int getCM_Chat_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_Chat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CM_Chat_UU.
		@param CM_Chat_UU CM_Chat_UU
	*/
	public void setCM_Chat_UU (String CM_Chat_UU)
	{
		set_Value (COLUMNNAME_CM_Chat_UU, CM_Chat_UU);
	}

	/** Get CM_Chat_UU.
		@return CM_Chat_UU	  */
	public String getCM_Chat_UU()
	{
		return (String)get_Value(COLUMNNAME_CM_Chat_UU);
	}

	/** ConfidentialType AD_Reference_ID=340 */
	public static final int CONFIDENTIALTYPE_AD_Reference_ID=340;
	/** Public Information = A */
	public static final String CONFIDENTIALTYPE_PublicInformation = "A";
	/** Partner Confidential = C */
	public static final String CONFIDENTIALTYPE_PartnerConfidential = "C";
	/** Internal = I */
	public static final String CONFIDENTIALTYPE_Internal = "I";
	/** Private Information = P */
	public static final String CONFIDENTIALTYPE_PrivateInformation = "P";
	/** Set Confidentiality.
		@param ConfidentialType Type of Confidentiality
	*/
	public void setConfidentialType (String ConfidentialType)
	{

		set_Value (COLUMNNAME_ConfidentialType, ConfidentialType);
	}

	/** Get Confidentiality.
		@return Type of Confidentiality
	  */
	public String getConfidentialType()
	{
		return (String)get_Value(COLUMNNAME_ConfidentialType);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getDescription());
    }

	/** ModerationType AD_Reference_ID=395 */
	public static final int MODERATIONTYPE_AD_Reference_ID=395;
	/** After Publishing = A */
	public static final String MODERATIONTYPE_AfterPublishing = "A";
	/** Before Publishing = B */
	public static final String MODERATIONTYPE_BeforePublishing = "B";
	/** Not moderated = N */
	public static final String MODERATIONTYPE_NotModerated = "N";
	/** Set Moderation Type.
		@param ModerationType Type of moderation
	*/
	public void setModerationType (String ModerationType)
	{

		set_Value (COLUMNNAME_ModerationType, ModerationType);
	}

	/** Get Moderation Type.
		@return Type of moderation
	  */
	public String getModerationType()
	{
		return (String)get_Value(COLUMNNAME_ModerationType);
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
}