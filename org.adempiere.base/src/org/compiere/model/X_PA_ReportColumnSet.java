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

/** Generated Model for PA_ReportColumnSet
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="PA_ReportColumnSet")
public class X_PA_ReportColumnSet extends PO implements I_PA_ReportColumnSet, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_PA_ReportColumnSet (Properties ctx, int PA_ReportColumnSet_ID, String trxName)
    {
      super (ctx, PA_ReportColumnSet_ID, trxName);
      /** if (PA_ReportColumnSet_ID == 0)
        {
			setName (null);
			setPA_ReportColumnSet_ID (0);
			setProcessing (false);
        } */
    }

    /** Standard Constructor */
    public X_PA_ReportColumnSet (Properties ctx, int PA_ReportColumnSet_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, PA_ReportColumnSet_ID, trxName, virtualColumns);
      /** if (PA_ReportColumnSet_ID == 0)
        {
			setName (null);
			setPA_ReportColumnSet_ID (0);
			setProcessing (false);
        } */
    }

    /** Standard Constructor */
    public X_PA_ReportColumnSet (Properties ctx, String PA_ReportColumnSet_UU, String trxName)
    {
      super (ctx, PA_ReportColumnSet_UU, trxName);
      /** if (PA_ReportColumnSet_UU == null)
        {
			setName (null);
			setPA_ReportColumnSet_ID (0);
			setProcessing (false);
        } */
    }

    /** Standard Constructor */
    public X_PA_ReportColumnSet (Properties ctx, String PA_ReportColumnSet_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, PA_ReportColumnSet_UU, trxName, virtualColumns);
      /** if (PA_ReportColumnSet_UU == null)
        {
			setName (null);
			setPA_ReportColumnSet_ID (0);
			setProcessing (false);
        } */
    }

    /** Load Constructor */
    public X_PA_ReportColumnSet (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_PA_ReportColumnSet[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Report Column Set.
		@param PA_ReportColumnSet_ID Collection of Columns for Report
	*/
	public void setPA_ReportColumnSet_ID (int PA_ReportColumnSet_ID)
	{
		if (PA_ReportColumnSet_ID < 1)
			set_ValueNoCheck (COLUMNNAME_PA_ReportColumnSet_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_PA_ReportColumnSet_ID, Integer.valueOf(PA_ReportColumnSet_ID));
	}

	/** Get Report Column Set.
		@return Collection of Columns for Report
	  */
	public int getPA_ReportColumnSet_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportColumnSet_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PA_ReportColumnSet_UU.
		@param PA_ReportColumnSet_UU PA_ReportColumnSet_UU
	*/
	public void setPA_ReportColumnSet_UU (String PA_ReportColumnSet_UU)
	{
		set_Value (COLUMNNAME_PA_ReportColumnSet_UU, PA_ReportColumnSet_UU);
	}

	/** Get PA_ReportColumnSet_UU.
		@return PA_ReportColumnSet_UU	  */
	public String getPA_ReportColumnSet_UU()
	{
		return (String)get_Value(COLUMNNAME_PA_ReportColumnSet_UU);
	}

	/** Set Process Now.
		@param Processing Process Now
	*/
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing()
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}
}