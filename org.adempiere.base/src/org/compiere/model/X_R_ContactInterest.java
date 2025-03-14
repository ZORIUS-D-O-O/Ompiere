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
import org.compiere.util.ValueNamePair;

/** Generated Model for R_ContactInterest
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="R_ContactInterest")
public class X_R_ContactInterest extends PO implements I_R_ContactInterest, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_R_ContactInterest (Properties ctx, int R_ContactInterest_ID, String trxName)
    {
      super (ctx, R_ContactInterest_ID, trxName);
      /** if (R_ContactInterest_ID == 0)
        {
			setAD_User_ID (0);
// @AD_User_ID@
			setR_InterestArea_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_R_ContactInterest (Properties ctx, int R_ContactInterest_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, R_ContactInterest_ID, trxName, virtualColumns);
      /** if (R_ContactInterest_ID == 0)
        {
			setAD_User_ID (0);
// @AD_User_ID@
			setR_InterestArea_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_R_ContactInterest (Properties ctx, String R_ContactInterest_UU, String trxName)
    {
      super (ctx, R_ContactInterest_UU, trxName);
      /** if (R_ContactInterest_UU == null)
        {
			setAD_User_ID (0);
// @AD_User_ID@
			setR_InterestArea_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_R_ContactInterest (Properties ctx, String R_ContactInterest_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, R_ContactInterest_UU, trxName, virtualColumns);
      /** if (R_ContactInterest_UU == null)
        {
			setAD_User_ID (0);
// @AD_User_ID@
			setR_InterestArea_ID (0);
        } */
    }

    /** Load Constructor */
    public X_R_ContactInterest (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_R_ContactInterest[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set User/Contact.
		@param AD_User_ID User within the system - Internal or Business Partner Contact
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record UU/ColumnName
        @return UU/ColumnName pair
      */
    public ValueNamePair getValueNamePair()
    {
        return new ValueNamePair(get_UUID(), String.valueOf(getAD_User_ID()));
    }

	/** Set Opt-out Date.
		@param OptOutDate Date the contact opted out
	*/
	public void setOptOutDate (Timestamp OptOutDate)
	{
		set_Value (COLUMNNAME_OptOutDate, OptOutDate);
	}

	/** Get Opt-out Date.
		@return Date the contact opted out
	  */
	public Timestamp getOptOutDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_OptOutDate);
	}

	/** Set R_ContactInterest_UU.
		@param R_ContactInterest_UU R_ContactInterest_UU
	*/
	public void setR_ContactInterest_UU (String R_ContactInterest_UU)
	{
		set_Value (COLUMNNAME_R_ContactInterest_UU, R_ContactInterest_UU);
	}

	/** Get R_ContactInterest_UU.
		@return R_ContactInterest_UU	  */
	public String getR_ContactInterest_UU()
	{
		return (String)get_Value(COLUMNNAME_R_ContactInterest_UU);
	}

	public org.compiere.model.I_R_InterestArea getR_InterestArea() throws RuntimeException
	{
		return (org.compiere.model.I_R_InterestArea)MTable.get(getCtx(), org.compiere.model.I_R_InterestArea.Table_ID)
			.getPO(getR_InterestArea_ID(), get_TrxName());
	}

	/** Set Interest Area.
		@param R_InterestArea_ID Interest Area or Topic
	*/
	public void setR_InterestArea_ID (int R_InterestArea_ID)
	{
		if (R_InterestArea_ID < 1)
			set_ValueNoCheck (COLUMNNAME_R_InterestArea_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_R_InterestArea_ID, Integer.valueOf(R_InterestArea_ID));
	}

	/** Get Interest Area.
		@return Interest Area or Topic
	  */
	public int getR_InterestArea_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_InterestArea_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Subscribe Date.
		@param SubscribeDate Date the contact actively subscribed
	*/
	public void setSubscribeDate (Timestamp SubscribeDate)
	{
		set_Value (COLUMNNAME_SubscribeDate, SubscribeDate);
	}

	/** Get Subscribe Date.
		@return Date the contact actively subscribed
	  */
	public Timestamp getSubscribeDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_SubscribeDate);
	}
}