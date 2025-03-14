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

/** Generated Model for ASP_ClientLevel
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="ASP_ClientLevel")
public class X_ASP_ClientLevel extends PO implements I_ASP_ClientLevel, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_ASP_ClientLevel (Properties ctx, int ASP_ClientLevel_ID, String trxName)
    {
      super (ctx, ASP_ClientLevel_ID, trxName);
      /** if (ASP_ClientLevel_ID == 0)
        {
			setASP_ClientLevel_ID (0);
			setASP_Level_ID (0);
			setASP_Module_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ASP_ClientLevel (Properties ctx, int ASP_ClientLevel_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, ASP_ClientLevel_ID, trxName, virtualColumns);
      /** if (ASP_ClientLevel_ID == 0)
        {
			setASP_ClientLevel_ID (0);
			setASP_Level_ID (0);
			setASP_Module_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ASP_ClientLevel (Properties ctx, String ASP_ClientLevel_UU, String trxName)
    {
      super (ctx, ASP_ClientLevel_UU, trxName);
      /** if (ASP_ClientLevel_UU == null)
        {
			setASP_ClientLevel_ID (0);
			setASP_Level_ID (0);
			setASP_Module_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_ASP_ClientLevel (Properties ctx, String ASP_ClientLevel_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, ASP_ClientLevel_UU, trxName, virtualColumns);
      /** if (ASP_ClientLevel_UU == null)
        {
			setASP_ClientLevel_ID (0);
			setASP_Level_ID (0);
			setASP_Module_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ASP_ClientLevel (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_ASP_ClientLevel[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Tenant Level.
		@param ASP_ClientLevel_ID Tenant Level
	*/
	public void setASP_ClientLevel_ID (int ASP_ClientLevel_ID)
	{
		if (ASP_ClientLevel_ID < 1)
			set_ValueNoCheck (COLUMNNAME_ASP_ClientLevel_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_ASP_ClientLevel_ID, Integer.valueOf(ASP_ClientLevel_ID));
	}

	/** Get Tenant Level.
		@return Tenant Level	  */
	public int getASP_ClientLevel_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_ClientLevel_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ASP_ClientLevel_UU.
		@param ASP_ClientLevel_UU ASP_ClientLevel_UU
	*/
	public void setASP_ClientLevel_UU (String ASP_ClientLevel_UU)
	{
		set_Value (COLUMNNAME_ASP_ClientLevel_UU, ASP_ClientLevel_UU);
	}

	/** Get ASP_ClientLevel_UU.
		@return ASP_ClientLevel_UU	  */
	public String getASP_ClientLevel_UU()
	{
		return (String)get_Value(COLUMNNAME_ASP_ClientLevel_UU);
	}

	public org.compiere.model.I_ASP_Level getASP_Level() throws RuntimeException
	{
		return (org.compiere.model.I_ASP_Level)MTable.get(getCtx(), org.compiere.model.I_ASP_Level.Table_ID)
			.getPO(getASP_Level_ID(), get_TrxName());
	}

	/** Set ASP Level.
		@param ASP_Level_ID ASP Level
	*/
	public void setASP_Level_ID (int ASP_Level_ID)
	{
		if (ASP_Level_ID < 1)
			set_Value (COLUMNNAME_ASP_Level_ID, null);
		else
			set_Value (COLUMNNAME_ASP_Level_ID, Integer.valueOf(ASP_Level_ID));
	}

	/** Get ASP Level.
		@return ASP Level	  */
	public int getASP_Level_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Level_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_ASP_Module getASP_Module() throws RuntimeException
	{
		return (org.compiere.model.I_ASP_Module)MTable.get(getCtx(), org.compiere.model.I_ASP_Module.Table_ID)
			.getPO(getASP_Module_ID(), get_TrxName());
	}

	/** Set ASP Module.
		@param ASP_Module_ID ASP Module
	*/
	public void setASP_Module_ID (int ASP_Module_ID)
	{
		if (ASP_Module_ID < 1)
			set_Value (COLUMNNAME_ASP_Module_ID, null);
		else
			set_Value (COLUMNNAME_ASP_Module_ID, Integer.valueOf(ASP_Module_ID));
	}

	/** Get ASP Module.
		@return ASP Module	  */
	public int getASP_Module_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Module_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
	}
}