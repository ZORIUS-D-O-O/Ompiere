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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for A_Asset_Use
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="A_Asset_Use")
public class X_A_Asset_Use extends PO implements I_A_Asset_Use, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_A_Asset_Use (Properties ctx, int A_Asset_Use_ID, String trxName)
    {
      super (ctx, A_Asset_Use_ID, trxName);
      /** if (A_Asset_Use_ID == 0)
        {
			setA_Asset_ID (0);
// @A_Asset_ID@
			setA_Asset_Use_ID (0);
			setUseDate (new Timestamp( System.currentTimeMillis() ));
			setUseUnits (0);
        } */
    }

    /** Standard Constructor */
    public X_A_Asset_Use (Properties ctx, int A_Asset_Use_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, A_Asset_Use_ID, trxName, virtualColumns);
      /** if (A_Asset_Use_ID == 0)
        {
			setA_Asset_ID (0);
// @A_Asset_ID@
			setA_Asset_Use_ID (0);
			setUseDate (new Timestamp( System.currentTimeMillis() ));
			setUseUnits (0);
        } */
    }

    /** Standard Constructor */
    public X_A_Asset_Use (Properties ctx, String A_Asset_Use_UU, String trxName)
    {
      super (ctx, A_Asset_Use_UU, trxName);
      /** if (A_Asset_Use_UU == null)
        {
			setA_Asset_ID (0);
// @A_Asset_ID@
			setA_Asset_Use_ID (0);
			setUseDate (new Timestamp( System.currentTimeMillis() ));
			setUseUnits (0);
        } */
    }

    /** Standard Constructor */
    public X_A_Asset_Use (Properties ctx, String A_Asset_Use_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, A_Asset_Use_UU, trxName, virtualColumns);
      /** if (A_Asset_Use_UU == null)
        {
			setA_Asset_ID (0);
// @A_Asset_ID@
			setA_Asset_Use_ID (0);
			setUseDate (new Timestamp( System.currentTimeMillis() ));
			setUseUnits (0);
        } */
    }

    /** Load Constructor */
    public X_A_Asset_Use (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_A_Asset_Use[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_A_Asset getA_Asset() throws RuntimeException
	{
		return (org.compiere.model.I_A_Asset)MTable.get(getCtx(), org.compiere.model.I_A_Asset.Table_ID)
			.getPO(getA_Asset_ID(), get_TrxName());
	}

	/** Set Asset.
		@param A_Asset_ID Asset used internally or by customers
	*/
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1)
			set_ValueNoCheck (COLUMNNAME_A_Asset_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Asset_Use_ID.
		@param A_Asset_Use_ID A_Asset_Use_ID
	*/
	public void setA_Asset_Use_ID (int A_Asset_Use_ID)
	{
		if (A_Asset_Use_ID < 1)
			set_ValueNoCheck (COLUMNNAME_A_Asset_Use_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_A_Asset_Use_ID, Integer.valueOf(A_Asset_Use_ID));
	}

	/** Get A_Asset_Use_ID.
		@return A_Asset_Use_ID	  */
	public int getA_Asset_Use_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Use_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getA_Asset_Use_ID()));
    }

	/** Set A_Asset_Use_UU.
		@param A_Asset_Use_UU A_Asset_Use_UU
	*/
	public void setA_Asset_Use_UU (String A_Asset_Use_UU)
	{
		set_Value (COLUMNNAME_A_Asset_Use_UU, A_Asset_Use_UU);
	}

	/** Get A_Asset_Use_UU.
		@return A_Asset_Use_UU	  */
	public String getA_Asset_Use_UU()
	{
		return (String)get_Value(COLUMNNAME_A_Asset_Use_UU);
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

	/** Set Use Date.
		@param UseDate Use Date
	*/
	public void setUseDate (Timestamp UseDate)
	{
		set_Value (COLUMNNAME_UseDate, UseDate);
	}

	/** Get Use Date.
		@return Use Date	  */
	public Timestamp getUseDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_UseDate);
	}

	/** Set Use units.
		@param UseUnits Currently used units of the assets
	*/
	public void setUseUnits (int UseUnits)
	{
		set_Value (COLUMNNAME_UseUnits, Integer.valueOf(UseUnits));
	}

	/** Get Use units.
		@return Currently used units of the assets
	  */
	public int getUseUnits()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UseUnits);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}