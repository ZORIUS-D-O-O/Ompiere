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

/** Generated Model for C_JobAssignment
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_JobAssignment")
public class X_C_JobAssignment extends PO implements I_C_JobAssignment, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_JobAssignment (Properties ctx, int C_JobAssignment_ID, String trxName)
    {
      super (ctx, C_JobAssignment_ID, trxName);
      /** if (C_JobAssignment_ID == 0)
        {
			setAD_User_ID (0);
			setC_JobAssignment_ID (0);
			setC_Job_ID (0);
			setValidFrom (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Standard Constructor */
    public X_C_JobAssignment (Properties ctx, int C_JobAssignment_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_JobAssignment_ID, trxName, virtualColumns);
      /** if (C_JobAssignment_ID == 0)
        {
			setAD_User_ID (0);
			setC_JobAssignment_ID (0);
			setC_Job_ID (0);
			setValidFrom (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Standard Constructor */
    public X_C_JobAssignment (Properties ctx, String C_JobAssignment_UU, String trxName)
    {
      super (ctx, C_JobAssignment_UU, trxName);
      /** if (C_JobAssignment_UU == null)
        {
			setAD_User_ID (0);
			setC_JobAssignment_ID (0);
			setC_Job_ID (0);
			setValidFrom (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Standard Constructor */
    public X_C_JobAssignment (Properties ctx, String C_JobAssignment_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_JobAssignment_UU, trxName, virtualColumns);
      /** if (C_JobAssignment_UU == null)
        {
			setAD_User_ID (0);
			setC_JobAssignment_ID (0);
			setC_Job_ID (0);
			setValidFrom (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_C_JobAssignment (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client
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
      StringBuilder sb = new StringBuilder ("X_C_JobAssignment[")
        .append(get_ID()).append("]");
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

	/** Set Position Assignment.
		@param C_JobAssignment_ID Assignment of Employee (User) to Job Position
	*/
	public void setC_JobAssignment_ID (int C_JobAssignment_ID)
	{
		if (C_JobAssignment_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_JobAssignment_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_JobAssignment_ID, Integer.valueOf(C_JobAssignment_ID));
	}

	/** Get Position Assignment.
		@return Assignment of Employee (User) to Job Position
	  */
	public int getC_JobAssignment_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_JobAssignment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_JobAssignment_UU.
		@param C_JobAssignment_UU C_JobAssignment_UU
	*/
	public void setC_JobAssignment_UU (String C_JobAssignment_UU)
	{
		set_Value (COLUMNNAME_C_JobAssignment_UU, C_JobAssignment_UU);
	}

	/** Get C_JobAssignment_UU.
		@return C_JobAssignment_UU	  */
	public String getC_JobAssignment_UU()
	{
		return (String)get_Value(COLUMNNAME_C_JobAssignment_UU);
	}

	public org.compiere.model.I_C_Job getC_Job() throws RuntimeException
	{
		return (org.compiere.model.I_C_Job)MTable.get(getCtx(), org.compiere.model.I_C_Job.Table_ID)
			.getPO(getC_Job_ID(), get_TrxName());
	}

	/** Set Position.
		@param C_Job_ID Job Position
	*/
	public void setC_Job_ID (int C_Job_ID)
	{
		if (C_Job_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Job_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Job_ID, Integer.valueOf(C_Job_ID));
	}

	/** Get Position.
		@return Job Position
	  */
	public int getC_Job_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Job_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getC_Job_ID()));
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

	/** Set Valid from.
		@param ValidFrom Valid from including this date (first day)
	*/
	public void setValidFrom (Timestamp ValidFrom)
	{
		set_Value (COLUMNNAME_ValidFrom, ValidFrom);
	}

	/** Get Valid from.
		@return Valid from including this date (first day)
	  */
	public Timestamp getValidFrom()
	{
		return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
	}

	/** Set Valid to.
		@param ValidTo Valid to including this date (last day)
	*/
	public void setValidTo (Timestamp ValidTo)
	{
		set_Value (COLUMNNAME_ValidTo, ValidTo);
	}

	/** Get Valid to.
		@return Valid to including this date (last day)
	  */
	public Timestamp getValidTo()
	{
		return (Timestamp)get_Value(COLUMNNAME_ValidTo);
	}
}