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

/** Generated Model for AD_Workflow_Access
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_Workflow_Access")
public class X_AD_Workflow_Access extends PO implements I_AD_Workflow_Access, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_Workflow_Access (Properties ctx, int AD_Workflow_Access_ID, String trxName)
    {
      super (ctx, AD_Workflow_Access_ID, trxName);
      /** if (AD_Workflow_Access_ID == 0)
        {
			setAD_Role_ID (0);
			setAD_Workflow_ID (0);
			setIsReadWrite (false);
        } */
    }

    /** Standard Constructor */
    public X_AD_Workflow_Access (Properties ctx, int AD_Workflow_Access_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Workflow_Access_ID, trxName, virtualColumns);
      /** if (AD_Workflow_Access_ID == 0)
        {
			setAD_Role_ID (0);
			setAD_Workflow_ID (0);
			setIsReadWrite (false);
        } */
    }

    /** Standard Constructor */
    public X_AD_Workflow_Access (Properties ctx, String AD_Workflow_Access_UU, String trxName)
    {
      super (ctx, AD_Workflow_Access_UU, trxName);
      /** if (AD_Workflow_Access_UU == null)
        {
			setAD_Role_ID (0);
			setAD_Workflow_ID (0);
			setIsReadWrite (false);
        } */
    }

    /** Standard Constructor */
    public X_AD_Workflow_Access (Properties ctx, String AD_Workflow_Access_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Workflow_Access_UU, trxName, virtualColumns);
      /** if (AD_Workflow_Access_UU == null)
        {
			setAD_Role_ID (0);
			setAD_Workflow_ID (0);
			setIsReadWrite (false);
        } */
    }

    /** Load Constructor */
    public X_AD_Workflow_Access (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_Workflow_Access[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Role getAD_Role() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Role)MTable.get(getCtx(), org.compiere.model.I_AD_Role.Table_ID)
			.getPO(getAD_Role_ID(), get_TrxName());
	}

	/** Set Role.
		@param AD_Role_ID Responsibility Role
	*/
	public void setAD_Role_ID (int AD_Role_ID)
	{
		if (AD_Role_ID < 0)
			set_ValueNoCheck (COLUMNNAME_AD_Role_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
	}

	/** Get Role.
		@return Responsibility Role
	  */
	public int getAD_Role_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Workflow_Access_UU.
		@param AD_Workflow_Access_UU AD_Workflow_Access_UU
	*/
	public void setAD_Workflow_Access_UU (String AD_Workflow_Access_UU)
	{
		set_Value (COLUMNNAME_AD_Workflow_Access_UU, AD_Workflow_Access_UU);
	}

	/** Get AD_Workflow_Access_UU.
		@return AD_Workflow_Access_UU	  */
	public String getAD_Workflow_Access_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_Workflow_Access_UU);
	}

	public org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Workflow)MTable.get(getCtx(), org.compiere.model.I_AD_Workflow.Table_ID)
			.getPO(getAD_Workflow_ID(), get_TrxName());
	}

	/** Set Workflow.
		@param AD_Workflow_ID Workflow or combination of tasks
	*/
	public void setAD_Workflow_ID (int AD_Workflow_ID)
	{
		if (AD_Workflow_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Workflow_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Workflow_ID, Integer.valueOf(AD_Workflow_ID));
	}

	/** Get Workflow.
		@return Workflow or combination of tasks
	  */
	public int getAD_Workflow_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Workflow_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Read Write.
		@param IsReadWrite Field is read / write
	*/
	public void setIsReadWrite (boolean IsReadWrite)
	{
		set_Value (COLUMNNAME_IsReadWrite, Boolean.valueOf(IsReadWrite));
	}

	/** Get Read Write.
		@return Field is read / write
	  */
	public boolean isReadWrite()
	{
		Object oo = get_Value(COLUMNNAME_IsReadWrite);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}
}