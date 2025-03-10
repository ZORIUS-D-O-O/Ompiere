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

/** Generated Model for AD_ReplicationStrategy
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_ReplicationStrategy")
public class X_AD_ReplicationStrategy extends PO implements I_AD_ReplicationStrategy, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_ReplicationStrategy (Properties ctx, int AD_ReplicationStrategy_ID, String trxName)
    {
      super (ctx, AD_ReplicationStrategy_ID, trxName);
      /** if (AD_ReplicationStrategy_ID == 0)
        {
			setAD_ReplicationStrategy_ID (0);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_ReplicationStrategy (Properties ctx, int AD_ReplicationStrategy_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_ReplicationStrategy_ID, trxName, virtualColumns);
      /** if (AD_ReplicationStrategy_ID == 0)
        {
			setAD_ReplicationStrategy_ID (0);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_ReplicationStrategy (Properties ctx, String AD_ReplicationStrategy_UU, String trxName)
    {
      super (ctx, AD_ReplicationStrategy_UU, trxName);
      /** if (AD_ReplicationStrategy_UU == null)
        {
			setAD_ReplicationStrategy_ID (0);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_ReplicationStrategy (Properties ctx, String AD_ReplicationStrategy_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_ReplicationStrategy_UU, trxName, virtualColumns);
      /** if (AD_ReplicationStrategy_UU == null)
        {
			setAD_ReplicationStrategy_ID (0);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_AD_ReplicationStrategy (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_ReplicationStrategy[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Replication Strategy.
		@param AD_ReplicationStrategy_ID Data Replication Strategy
	*/
	public void setAD_ReplicationStrategy_ID (int AD_ReplicationStrategy_ID)
	{
		if (AD_ReplicationStrategy_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_ReplicationStrategy_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_ReplicationStrategy_ID, Integer.valueOf(AD_ReplicationStrategy_ID));
	}

	/** Get Replication Strategy.
		@return Data Replication Strategy
	  */
	public int getAD_ReplicationStrategy_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReplicationStrategy_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_ReplicationStrategy_UU.
		@param AD_ReplicationStrategy_UU AD_ReplicationStrategy_UU
	*/
	public void setAD_ReplicationStrategy_UU (String AD_ReplicationStrategy_UU)
	{
		set_Value (COLUMNNAME_AD_ReplicationStrategy_UU, AD_ReplicationStrategy_UU);
	}

	/** Get AD_ReplicationStrategy_UU.
		@return AD_ReplicationStrategy_UU	  */
	public String getAD_ReplicationStrategy_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_ReplicationStrategy_UU);
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

	public org.compiere.model.I_EXP_Processor getEXP_Processor() throws RuntimeException
	{
		return (org.compiere.model.I_EXP_Processor)MTable.get(getCtx(), org.compiere.model.I_EXP_Processor.Table_ID)
			.getPO(getEXP_Processor_ID(), get_TrxName());
	}

	/** Set Export Processor.
		@param EXP_Processor_ID Export Processor
	*/
	public void setEXP_Processor_ID (int EXP_Processor_ID)
	{
		if (EXP_Processor_ID < 1)
			set_Value (COLUMNNAME_EXP_Processor_ID, null);
		else
			set_Value (COLUMNNAME_EXP_Processor_ID, Integer.valueOf(EXP_Processor_ID));
	}

	/** Get Export Processor.
		@return Export Processor	  */
	public int getEXP_Processor_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXP_Processor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}