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

/** Generated Model for M_DistributionRun
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_DistributionRun")
public class X_M_DistributionRun extends PO implements I_M_DistributionRun, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_DistributionRun (Properties ctx, int M_DistributionRun_ID, String trxName)
    {
      super (ctx, M_DistributionRun_ID, trxName);
      /** if (M_DistributionRun_ID == 0)
        {
			setIsCreateSingleOrder (false);
// N
			setM_DistributionRun_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_DistributionRun (Properties ctx, int M_DistributionRun_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_DistributionRun_ID, trxName, virtualColumns);
      /** if (M_DistributionRun_ID == 0)
        {
			setIsCreateSingleOrder (false);
// N
			setM_DistributionRun_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_DistributionRun (Properties ctx, String M_DistributionRun_UU, String trxName)
    {
      super (ctx, M_DistributionRun_UU, trxName);
      /** if (M_DistributionRun_UU == null)
        {
			setIsCreateSingleOrder (false);
// N
			setM_DistributionRun_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_M_DistributionRun (Properties ctx, String M_DistributionRun_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_DistributionRun_UU, trxName, virtualColumns);
      /** if (M_DistributionRun_UU == null)
        {
			setIsCreateSingleOrder (false);
// N
			setM_DistributionRun_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_M_DistributionRun (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_M_DistributionRun[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_ID)
			.getPO(getC_BPartner_Location_ID(), get_TrxName());
	}

	/** Set Partner Location.
		@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner
	*/
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		if (C_BPartner_Location_ID < 1)
			set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
	}

	/** Get Partner Location.
		@return Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
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

	/** Set Create Single Order.
		@param IsCreateSingleOrder For all shipments create one Order
	*/
	public void setIsCreateSingleOrder (boolean IsCreateSingleOrder)
	{
		set_Value (COLUMNNAME_IsCreateSingleOrder, Boolean.valueOf(IsCreateSingleOrder));
	}

	/** Get Create Single Order.
		@return For all shipments create one Order
	  */
	public boolean isCreateSingleOrder()
	{
		Object oo = get_Value(COLUMNNAME_IsCreateSingleOrder);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Distribution Run.
		@param M_DistributionRun_ID Distribution Run create Orders to distribute products to a selected list of partners
	*/
	public void setM_DistributionRun_ID (int M_DistributionRun_ID)
	{
		if (M_DistributionRun_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_DistributionRun_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_DistributionRun_ID, Integer.valueOf(M_DistributionRun_ID));
	}

	/** Get Distribution Run.
		@return Distribution Run create Orders to distribute products to a selected list of partners
	  */
	public int getM_DistributionRun_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionRun_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_DistributionRun_UU.
		@param M_DistributionRun_UU M_DistributionRun_UU
	*/
	public void setM_DistributionRun_UU (String M_DistributionRun_UU)
	{
		set_Value (COLUMNNAME_M_DistributionRun_UU, M_DistributionRun_UU);
	}

	/** Get M_DistributionRun_UU.
		@return M_DistributionRun_UU	  */
	public String getM_DistributionRun_UU()
	{
		return (String)get_Value(COLUMNNAME_M_DistributionRun_UU);
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