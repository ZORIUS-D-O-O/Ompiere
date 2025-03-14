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

/** Generated Model for AD_Val_Rule
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_Val_Rule")
public class X_AD_Val_Rule extends PO implements I_AD_Val_Rule, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_Val_Rule (Properties ctx, int AD_Val_Rule_ID, String trxName)
    {
      super (ctx, AD_Val_Rule_ID, trxName);
      /** if (AD_Val_Rule_ID == 0)
        {
			setAD_Val_Rule_ID (0);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setName (null);
			setType (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Val_Rule (Properties ctx, int AD_Val_Rule_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Val_Rule_ID, trxName, virtualColumns);
      /** if (AD_Val_Rule_ID == 0)
        {
			setAD_Val_Rule_ID (0);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setName (null);
			setType (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Val_Rule (Properties ctx, String AD_Val_Rule_UU, String trxName)
    {
      super (ctx, AD_Val_Rule_UU, trxName);
      /** if (AD_Val_Rule_UU == null)
        {
			setAD_Val_Rule_ID (0);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setName (null);
			setType (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Val_Rule (Properties ctx, String AD_Val_Rule_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Val_Rule_UU, trxName, virtualColumns);
      /** if (AD_Val_Rule_UU == null)
        {
			setAD_Val_Rule_ID (0);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setName (null);
			setType (null);
        } */
    }

    /** Load Constructor */
    public X_AD_Val_Rule (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_Val_Rule[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Dynamic Validation.
		@param AD_Val_Rule_ID Dynamic Validation Rule
	*/
	public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
	{
		if (AD_Val_Rule_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Val_Rule_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
	}

	/** Get Dynamic Validation.
		@return Dynamic Validation Rule
	  */
	public int getAD_Val_Rule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Val_Rule_UU.
		@param AD_Val_Rule_UU AD_Val_Rule_UU
	*/
	public void setAD_Val_Rule_UU (String AD_Val_Rule_UU)
	{
		set_Value (COLUMNNAME_AD_Val_Rule_UU, AD_Val_Rule_UU);
	}

	/** Get AD_Val_Rule_UU.
		@return AD_Val_Rule_UU	  */
	public String getAD_Val_Rule_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_Val_Rule_UU);
	}

	/** Set Validation code.
		@param Code Validation Code
	*/
	public void setCode (String Code)
	{
		set_Value (COLUMNNAME_Code, Code);
	}

	/** Get Validation code.
		@return Validation Code
	  */
	public String getCode()
	{
		return (String)get_Value(COLUMNNAME_Code);
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

	/** EntityType AD_Reference_ID=389 */
	public static final int ENTITYTYPE_AD_Reference_ID=389;
	/** Set Entity Type.
		@param EntityType Dictionary Entity Type; Determines ownership and synchronization
	*/
	public void setEntityType (String EntityType)
	{

		set_Value (COLUMNNAME_EntityType, EntityType);
	}

	/** Get Entity Type.
		@return Dictionary Entity Type; Determines ownership and synchronization
	  */
	public String getEntityType()
	{
		return (String)get_Value(COLUMNNAME_EntityType);
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

	/** Type AD_Reference_ID=101 */
	public static final int TYPE_AD_Reference_ID=101;
	/** Java Script = E */
	public static final String TYPE_JavaScript = "E";
	/** Java Language = J */
	public static final String TYPE_JavaLanguage = "J";
	/** SQL = S */
	public static final String TYPE_SQL = "S";
	/** Set Type.
		@param Type Type of Validation (SQL, Java Script, Java Language)
	*/
	public void setType (String Type)
	{

		set_Value (COLUMNNAME_Type, Type);
	}

	/** Get Type.
		@return Type of Validation (SQL, Java Script, Java Language)
	  */
	public String getType()
	{
		return (String)get_Value(COLUMNNAME_Type);
	}
}