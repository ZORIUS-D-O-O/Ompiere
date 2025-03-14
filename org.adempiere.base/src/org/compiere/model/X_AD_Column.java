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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for AD_Column
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_Column")
public class X_AD_Column extends PO implements I_AD_Column, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_Column (Properties ctx, int AD_Column_ID, String trxName)
    {
      super (ctx, AD_Column_ID, trxName);
      /** if (AD_Column_ID == 0)
        {
			setAD_Column_ID (0);
			setAD_Element_ID (0);
			setAD_Reference_ID (0);
			setAD_Table_ID (0);
			setColumnName (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsAllowCopy (true);
// Y
			setIsAlwaysUpdateable (false);
// N
			setIsAutocomplete (false);
// N
			setIsEncrypted (null);
// N
			setIsIdentifier (false);
			setIsKey (false);
			setIsMandatory (false);
			setIsParent (false);
			setIsPartitionKey (false);
// 'N'
			setIsSecure (false);
// N
			setIsSelectionColumn (false);
			setIsToolbarButton (null);
// Y
			setIsTranslated (false);
			setIsUpdateable (true);
// Y
			setName (null);
			setVersion (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_AD_Column (Properties ctx, int AD_Column_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Column_ID, trxName, virtualColumns);
      /** if (AD_Column_ID == 0)
        {
			setAD_Column_ID (0);
			setAD_Element_ID (0);
			setAD_Reference_ID (0);
			setAD_Table_ID (0);
			setColumnName (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsAllowCopy (true);
// Y
			setIsAlwaysUpdateable (false);
// N
			setIsAutocomplete (false);
// N
			setIsEncrypted (null);
// N
			setIsIdentifier (false);
			setIsKey (false);
			setIsMandatory (false);
			setIsParent (false);
			setIsPartitionKey (false);
// 'N'
			setIsSecure (false);
// N
			setIsSelectionColumn (false);
			setIsToolbarButton (null);
// Y
			setIsTranslated (false);
			setIsUpdateable (true);
// Y
			setName (null);
			setVersion (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_AD_Column (Properties ctx, String AD_Column_UU, String trxName)
    {
      super (ctx, AD_Column_UU, trxName);
      /** if (AD_Column_UU == null)
        {
			setAD_Column_ID (0);
			setAD_Element_ID (0);
			setAD_Reference_ID (0);
			setAD_Table_ID (0);
			setColumnName (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsAllowCopy (true);
// Y
			setIsAlwaysUpdateable (false);
// N
			setIsAutocomplete (false);
// N
			setIsEncrypted (null);
// N
			setIsIdentifier (false);
			setIsKey (false);
			setIsMandatory (false);
			setIsParent (false);
			setIsPartitionKey (false);
// 'N'
			setIsSecure (false);
// N
			setIsSelectionColumn (false);
			setIsToolbarButton (null);
// Y
			setIsTranslated (false);
			setIsUpdateable (true);
// Y
			setName (null);
			setVersion (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_AD_Column (Properties ctx, String AD_Column_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Column_UU, trxName, virtualColumns);
      /** if (AD_Column_UU == null)
        {
			setAD_Column_ID (0);
			setAD_Element_ID (0);
			setAD_Reference_ID (0);
			setAD_Table_ID (0);
			setColumnName (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsAllowCopy (true);
// Y
			setIsAlwaysUpdateable (false);
// N
			setIsAutocomplete (false);
// N
			setIsEncrypted (null);
// N
			setIsIdentifier (false);
			setIsKey (false);
			setIsMandatory (false);
			setIsParent (false);
			setIsPartitionKey (false);
// 'N'
			setIsSecure (false);
// N
			setIsSelectionColumn (false);
			setIsToolbarButton (null);
// Y
			setIsTranslated (false);
			setIsUpdateable (true);
// Y
			setName (null);
			setVersion (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_AD_Column (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System
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
      StringBuilder sb = new StringBuilder ("X_AD_Column[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Chart getAD_Chart() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Chart)MTable.get(getCtx(), org.compiere.model.I_AD_Chart.Table_ID)
			.getPO(getAD_Chart_ID(), get_TrxName());
	}

	/** Set Chart.
		@param AD_Chart_ID Chart
	*/
	public void setAD_Chart_ID (int AD_Chart_ID)
	{
		if (AD_Chart_ID < 1)
			set_Value (COLUMNNAME_AD_Chart_ID, null);
		else
			set_Value (COLUMNNAME_AD_Chart_ID, Integer.valueOf(AD_Chart_ID));
	}

	/** Get Chart.
		@return Chart	  */
	public int getAD_Chart_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Chart_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Column.
		@param AD_Column_ID Column in the table
	*/
	public void setAD_Column_ID (int AD_Column_ID)
	{
		if (AD_Column_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Column_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
	}

	/** Get Column.
		@return Column in the table
	  */
	public int getAD_Column_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Column_UU.
		@param AD_Column_UU AD_Column_UU
	*/
	public void setAD_Column_UU (String AD_Column_UU)
	{
		set_Value (COLUMNNAME_AD_Column_UU, AD_Column_UU);
	}

	/** Get AD_Column_UU.
		@return AD_Column_UU	  */
	public String getAD_Column_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_Column_UU);
	}

	public org.compiere.model.I_AD_Element getAD_Element() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Element)MTable.get(getCtx(), org.compiere.model.I_AD_Element.Table_ID)
			.getPO(getAD_Element_ID(), get_TrxName());
	}

	/** Set System Element.
		@param AD_Element_ID System Element enables the central maintenance of column description and help.
	*/
	public void setAD_Element_ID (int AD_Element_ID)
	{
		if (AD_Element_ID < 1)
			set_Value (COLUMNNAME_AD_Element_ID, null);
		else
			set_Value (COLUMNNAME_AD_Element_ID, Integer.valueOf(AD_Element_ID));
	}

	/** Get System Element.
		@return System Element enables the central maintenance of column description and help.
	  */
	public int getAD_Element_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Element_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException
	{
		return (org.compiere.model.I_AD_InfoWindow)MTable.get(getCtx(), org.compiere.model.I_AD_InfoWindow.Table_ID)
			.getPO(getAD_InfoWindow_ID(), get_TrxName());
	}

	/** Set Info Window.
		@param AD_InfoWindow_ID Info and search/select Window
	*/
	public void setAD_InfoWindow_ID (int AD_InfoWindow_ID)
	{
		if (AD_InfoWindow_ID < 1)
			set_Value (COLUMNNAME_AD_InfoWindow_ID, null);
		else
			set_Value (COLUMNNAME_AD_InfoWindow_ID, Integer.valueOf(AD_InfoWindow_ID));
	}

	/** Get Info Window.
		@return Info and search/select Window
	  */
	public int getAD_InfoWindow_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_InfoWindow_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Process getAD_Process() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Process)MTable.get(getCtx(), org.compiere.model.I_AD_Process.Table_ID)
			.getPO(getAD_Process_ID(), get_TrxName());
	}

	/** Set Process.
		@param AD_Process_ID Process or Report
	*/
	public void setAD_Process_ID (int AD_Process_ID)
	{
		if (AD_Process_ID < 1)
			set_Value (COLUMNNAME_AD_Process_ID, null);
		else
			set_Value (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
	}

	/** Get Process.
		@return Process or Report
	  */
	public int getAD_Process_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Reference getAD_Reference() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Reference)MTable.get(getCtx(), org.compiere.model.I_AD_Reference.Table_ID)
			.getPO(getAD_Reference_ID(), get_TrxName());
	}

	/** Set Reference.
		@param AD_Reference_ID System Reference and Validation
	*/
	public void setAD_Reference_ID (int AD_Reference_ID)
	{
		if (AD_Reference_ID < 1)
			set_Value (COLUMNNAME_AD_Reference_ID, null);
		else
			set_Value (COLUMNNAME_AD_Reference_ID, Integer.valueOf(AD_Reference_ID));
	}

	/** Get Reference.
		@return System Reference and Validation
	  */
	public int getAD_Reference_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Reference getAD_Reference_Value() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Reference)MTable.get(getCtx(), org.compiere.model.I_AD_Reference.Table_ID)
			.getPO(getAD_Reference_Value_ID(), get_TrxName());
	}

	/** Set Reference Key.
		@param AD_Reference_Value_ID Required to specify, if data type is Table or List
	*/
	public void setAD_Reference_Value_ID (int AD_Reference_Value_ID)
	{
		if (AD_Reference_Value_ID < 1)
			set_Value (COLUMNNAME_AD_Reference_Value_ID, null);
		else
			set_Value (COLUMNNAME_AD_Reference_Value_ID, Integer.valueOf(AD_Reference_Value_ID));
	}

	/** Get Reference Key.
		@return Required to specify, if data type is Table or List
	  */
	public int getAD_Reference_Value_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Reference_Value_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.compiere.model.I_AD_Val_Rule getAD_Val_Rule() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Val_Rule)MTable.get(getCtx(), org.compiere.model.I_AD_Val_Rule.Table_ID)
			.getPO(getAD_Val_Rule_ID(), get_TrxName());
	}

	/** Set Dynamic Validation.
		@param AD_Val_Rule_ID Dynamic Validation Rule
	*/
	public void setAD_Val_Rule_ID (int AD_Val_Rule_ID)
	{
		if (AD_Val_Rule_ID < 1)
			set_Value (COLUMNNAME_AD_Val_Rule_ID, null);
		else
			set_Value (COLUMNNAME_AD_Val_Rule_ID, Integer.valueOf(AD_Val_Rule_ID));
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

	public org.compiere.model.I_AD_Val_Rule getAD_Val_Rule_Lookup() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Val_Rule)MTable.get(getCtx(), org.compiere.model.I_AD_Val_Rule.Table_ID)
			.getPO(getAD_Val_Rule_Lookup_ID(), get_TrxName());
	}

	/** Set Dynamic Validation (Lookup).
		@param AD_Val_Rule_Lookup_ID Override Dynamic Validation Rule for Lookup Window
	*/
	public void setAD_Val_Rule_Lookup_ID (int AD_Val_Rule_Lookup_ID)
	{
		if (AD_Val_Rule_Lookup_ID < 1)
			set_Value (COLUMNNAME_AD_Val_Rule_Lookup_ID, null);
		else
			set_Value (COLUMNNAME_AD_Val_Rule_Lookup_ID, Integer.valueOf(AD_Val_Rule_Lookup_ID));
	}

	/** Get Dynamic Validation (Lookup).
		@return Override Dynamic Validation Rule for Lookup Window
	  */
	public int getAD_Val_Rule_Lookup_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Val_Rule_Lookup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Always Updatable Logic.
		@param AlwaysUpdatableLogic Logic to determine if field is Updatable irrespective if record&#039;s active status or processed status. This logic Applicable only if Always Updatable is N.
	*/
	public void setAlwaysUpdatableLogic (String AlwaysUpdatableLogic)
	{
		set_Value (COLUMNNAME_AlwaysUpdatableLogic, AlwaysUpdatableLogic);
	}

	/** Get Always Updatable Logic.
		@return Logic to determine if field is Updatable irrespective if record&#039;s active status or processed status. This logic Applicable only if Always Updatable is N.
	  */
	public String getAlwaysUpdatableLogic()
	{
		return (String)get_Value(COLUMNNAME_AlwaysUpdatableLogic);
	}

	/** Set Callout.
		@param Callout Fully qualified class names and method - separated by semicolons
	*/
	public void setCallout (String Callout)
	{
		set_Value (COLUMNNAME_Callout, Callout);
	}

	/** Get Callout.
		@return Fully qualified class names and method - separated by semicolons
	  */
	public String getCallout()
	{
		return (String)get_Value(COLUMNNAME_Callout);
	}

	/** Set DB Column Name.
		@param ColumnName Name of the column in the database
	*/
	public void setColumnName (String ColumnName)
	{
		set_Value (COLUMNNAME_ColumnName, ColumnName);
	}

	/** Get DB Column Name.
		@return Name of the column in the database
	  */
	public String getColumnName()
	{
		return (String)get_Value(COLUMNNAME_ColumnName);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getColumnName());
    }

	/** Set Column SQL.
		@param ColumnSQL Virtual Column (r/o)
	*/
	public void setColumnSQL (String ColumnSQL)
	{
		set_Value (COLUMNNAME_ColumnSQL, ColumnSQL);
	}

	/** Get Column SQL.
		@return Virtual Column (r/o)
	  */
	public String getColumnSQL()
	{
		return (String)get_Value(COLUMNNAME_ColumnSQL);
	}

	/** Set Default Logic.
		@param DefaultValue Default value hierarchy, separated by ;
	*/
	public void setDefaultValue (String DefaultValue)
	{
		set_Value (COLUMNNAME_DefaultValue, DefaultValue);
	}

	/** Get Default Logic.
		@return Default value hierarchy, separated by ;
	  */
	public String getDefaultValue()
	{
		return (String)get_Value(COLUMNNAME_DefaultValue);
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

	public org.compiere.model.I_AD_Message getFKConstraintMsg() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Message)MTable.get(getCtx(), org.compiere.model.I_AD_Message.Table_ID)
			.getPO(getFKConstraintMsg_ID(), get_TrxName());
	}

	/** Set Constraint Message.
		@param FKConstraintMsg_ID Constraint Message
	*/
	public void setFKConstraintMsg_ID (int FKConstraintMsg_ID)
	{
		if (FKConstraintMsg_ID < 1)
			set_Value (COLUMNNAME_FKConstraintMsg_ID, null);
		else
			set_Value (COLUMNNAME_FKConstraintMsg_ID, Integer.valueOf(FKConstraintMsg_ID));
	}

	/** Get Constraint Message.
		@return Constraint Message	  */
	public int getFKConstraintMsg_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_FKConstraintMsg_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Constraint Name.
		@param FKConstraintName Constraint Name
	*/
	public void setFKConstraintName (String FKConstraintName)
	{
		set_Value (COLUMNNAME_FKConstraintName, FKConstraintName);
	}

	/** Get Constraint Name.
		@return Constraint Name	  */
	public String getFKConstraintName()
	{
		return (String)get_Value(COLUMNNAME_FKConstraintName);
	}

	/** FKConstraintType AD_Reference_ID=200075 */
	public static final int FKCONSTRAINTTYPE_AD_Reference_ID=200075;
	/** Cascade = C */
	public static final String FKCONSTRAINTTYPE_Cascade = "C";
	/** Do Not Create - Ignore = D */
	public static final String FKCONSTRAINTTYPE_DoNotCreate_Ignore = "D";
	/** Model Cascade = M */
	public static final String FKCONSTRAINTTYPE_ModelCascade = "M";
	/** No Action - Forbid Deletion = N */
	public static final String FKCONSTRAINTTYPE_NoAction_ForbidDeletion = "N";
	/** Model No Action - Forbid Deletion = O */
	public static final String FKCONSTRAINTTYPE_ModelNoAction_ForbidDeletion = "O";
	/** Set Null = S */
	public static final String FKCONSTRAINTTYPE_SetNull = "S";
	/** Model Set Null = T */
	public static final String FKCONSTRAINTTYPE_ModelSetNull = "T";
	/** Set Constraint Type.
		@param FKConstraintType Constraint Type
	*/
	public void setFKConstraintType (String FKConstraintType)
	{

		set_Value (COLUMNNAME_FKConstraintType, FKConstraintType);
	}

	/** Get Constraint Type.
		@return Constraint Type	  */
	public String getFKConstraintType()
	{
		return (String)get_Value(COLUMNNAME_FKConstraintType);
	}

	/** Set Length.
		@param FieldLength Length of the column in the database
	*/
	public void setFieldLength (int FieldLength)
	{
		set_Value (COLUMNNAME_FieldLength, Integer.valueOf(FieldLength));
	}

	/** Get Length.
		@return Length of the column in the database
	  */
	public int getFieldLength()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_FieldLength);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Format Pattern.
		@param FormatPattern The pattern used to format a number or date.
	*/
	public void setFormatPattern (String FormatPattern)
	{
		set_Value (COLUMNNAME_FormatPattern, FormatPattern);
	}

	/** Get Format Pattern.
		@return The pattern used to format a number or date.
	  */
	public String getFormatPattern()
	{
		return (String)get_Value(COLUMNNAME_FormatPattern);
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

	/** Set Allow Copy.
		@param IsAllowCopy Determine if a column must be copied when pushing the button to copy record
	*/
	public void setIsAllowCopy (boolean IsAllowCopy)
	{
		set_Value (COLUMNNAME_IsAllowCopy, Boolean.valueOf(IsAllowCopy));
	}

	/** Get Allow Copy.
		@return Determine if a column must be copied when pushing the button to copy record
	  */
	public boolean isAllowCopy()
	{
		Object oo = get_Value(COLUMNNAME_IsAllowCopy);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Allow Logging.
		@param IsAllowLogging Determine if a column must be recorded into the change log
	*/
	public void setIsAllowLogging (boolean IsAllowLogging)
	{
		set_Value (COLUMNNAME_IsAllowLogging, Boolean.valueOf(IsAllowLogging));
	}

	/** Get Allow Logging.
		@return Determine if a column must be recorded into the change log
	  */
	public boolean isAllowLogging()
	{
		Object oo = get_Value(COLUMNNAME_IsAllowLogging);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Always Updatable.
		@param IsAlwaysUpdateable The column is always updateable, even if the record is not active or processed
	*/
	public void setIsAlwaysUpdateable (boolean IsAlwaysUpdateable)
	{
		set_Value (COLUMNNAME_IsAlwaysUpdateable, Boolean.valueOf(IsAlwaysUpdateable));
	}

	/** Get Always Updatable.
		@return The column is always updateable, even if the record is not active or processed
	  */
	public boolean isAlwaysUpdateable()
	{
		Object oo = get_Value(COLUMNNAME_IsAlwaysUpdateable);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Auto complete.
		@param IsAutocomplete Automatic completion for text fields
	*/
	public void setIsAutocomplete (boolean IsAutocomplete)
	{
		set_Value (COLUMNNAME_IsAutocomplete, Boolean.valueOf(IsAutocomplete));
	}

	/** Get Auto complete.
		@return Automatic completion for text fields
	  */
	public boolean isAutocomplete()
	{
		Object oo = get_Value(COLUMNNAME_IsAutocomplete);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** IsEncrypted AD_Reference_ID=354 */
	public static final int ISENCRYPTED_AD_Reference_ID=354;
	/** Not Encrypted = N */
	public static final String ISENCRYPTED_NotEncrypted = "N";
	/** Encrypted = Y */
	public static final String ISENCRYPTED_Encrypted = "Y";
	/** Set Encrypted.
		@param IsEncrypted Display or Storage is encrypted
	*/
	public void setIsEncrypted (String IsEncrypted)
	{

		set_Value (COLUMNNAME_IsEncrypted, IsEncrypted);
	}

	/** Get Encrypted.
		@return Display or Storage is encrypted
	  */
	public String getIsEncrypted()
	{
		return (String)get_Value(COLUMNNAME_IsEncrypted);
	}

	/** Set HTML.
		@param IsHtml Text has HTML tags
	*/
	public void setIsHtml (boolean IsHtml)
	{
		set_Value (COLUMNNAME_IsHtml, Boolean.valueOf(IsHtml));
	}

	/** Get HTML.
		@return Text has HTML tags
	  */
	public boolean isHtml()
	{
		Object oo = get_Value(COLUMNNAME_IsHtml);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Identifier.
		@param IsIdentifier This column is part of the record identifier
	*/
	public void setIsIdentifier (boolean IsIdentifier)
	{
		set_Value (COLUMNNAME_IsIdentifier, Boolean.valueOf(IsIdentifier));
	}

	/** Get Identifier.
		@return This column is part of the record identifier
	  */
	public boolean isIdentifier()
	{
		Object oo = get_Value(COLUMNNAME_IsIdentifier);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Key column.
		@param IsKey This column is the key in this table
	*/
	public void setIsKey (boolean IsKey)
	{
		set_Value (COLUMNNAME_IsKey, Boolean.valueOf(IsKey));
	}

	/** Get Key column.
		@return This column is the key in this table
	  */
	public boolean isKey()
	{
		Object oo = get_Value(COLUMNNAME_IsKey);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Mandatory.
		@param IsMandatory Data entry is required in this column
	*/
	public void setIsMandatory (boolean IsMandatory)
	{
		set_Value (COLUMNNAME_IsMandatory, Boolean.valueOf(IsMandatory));
	}

	/** Get Mandatory.
		@return Data entry is required in this column
	  */
	public boolean isMandatory()
	{
		Object oo = get_Value(COLUMNNAME_IsMandatory);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Parent link column.
		@param IsParent This column is a link to the parent table (e.g. header from lines) - incl. Association key columns
	*/
	public void setIsParent (boolean IsParent)
	{
		set_Value (COLUMNNAME_IsParent, Boolean.valueOf(IsParent));
	}

	/** Get Parent link column.
		@return This column is a link to the parent table (e.g. header from lines) - incl. Association key columns
	  */
	public boolean isParent()
	{
		Object oo = get_Value(COLUMNNAME_IsParent);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Partition Key.
		@param IsPartitionKey This is a partition key
	*/
	public void setIsPartitionKey (boolean IsPartitionKey)
	{
		set_Value (COLUMNNAME_IsPartitionKey, Boolean.valueOf(IsPartitionKey));
	}

	/** Get Partition Key.
		@return This is a partition key
	  */
	public boolean isPartitionKey()
	{
		Object oo = get_Value(COLUMNNAME_IsPartitionKey);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Secure content.
		@param IsSecure Defines whether content must be treated as secure
	*/
	public void setIsSecure (boolean IsSecure)
	{
		set_Value (COLUMNNAME_IsSecure, Boolean.valueOf(IsSecure));
	}

	/** Get Secure content.
		@return Defines whether content must be treated as secure
	  */
	public boolean isSecure()
	{
		Object oo = get_Value(COLUMNNAME_IsSecure);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Selection Column.
		@param IsSelectionColumn Is this column used for finding rows in windows
	*/
	public void setIsSelectionColumn (boolean IsSelectionColumn)
	{
		set_Value (COLUMNNAME_IsSelectionColumn, Boolean.valueOf(IsSelectionColumn));
	}

	/** Get Selection Column.
		@return Is this column used for finding rows in windows
	  */
	public boolean isSelectionColumn()
	{
		Object oo = get_Value(COLUMNNAME_IsSelectionColumn);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Synchronize Database.
		@param IsSyncDatabase Change database table definition when changing dictionary definition
	*/
	public void setIsSyncDatabase (String IsSyncDatabase)
	{
		set_Value (COLUMNNAME_IsSyncDatabase, IsSyncDatabase);
	}

	/** Get Synchronize Database.
		@return Change database table definition when changing dictionary definition
	  */
	public String getIsSyncDatabase()
	{
		return (String)get_Value(COLUMNNAME_IsSyncDatabase);
	}

	/** IsToolbarButton AD_Reference_ID=200099 */
	public static final int ISTOOLBARBUTTON_AD_Reference_ID=200099;
	/** Both = B */
	public static final String ISTOOLBARBUTTON_Both = "B";
	/** Window = N */
	public static final String ISTOOLBARBUTTON_Window = "N";
	/** Toolbar = Y */
	public static final String ISTOOLBARBUTTON_Toolbar = "Y";
	/** Set Toolbar Button.
		@param IsToolbarButton Show the button on the toolbar, the window, or both
	*/
	public void setIsToolbarButton (String IsToolbarButton)
	{

		set_Value (COLUMNNAME_IsToolbarButton, IsToolbarButton);
	}

	/** Get Toolbar Button.
		@return Show the button on the toolbar, the window, or both
	  */
	public String getIsToolbarButton()
	{
		return (String)get_Value(COLUMNNAME_IsToolbarButton);
	}

	/** Set Translated.
		@param IsTranslated This column is translated
	*/
	public void setIsTranslated (boolean IsTranslated)
	{
		set_Value (COLUMNNAME_IsTranslated, Boolean.valueOf(IsTranslated));
	}

	/** Get Translated.
		@return This column is translated
	  */
	public boolean isTranslated()
	{
		Object oo = get_Value(COLUMNNAME_IsTranslated);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Updatable.
		@param IsUpdateable Determines, if the field can be updated
	*/
	public void setIsUpdateable (boolean IsUpdateable)
	{
		set_Value (COLUMNNAME_IsUpdateable, Boolean.valueOf(IsUpdateable));
	}

	/** Get Updatable.
		@return Determines, if the field can be updated
	  */
	public boolean isUpdateable()
	{
		Object oo = get_Value(COLUMNNAME_IsUpdateable);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Mandatory Logic.
		@param MandatoryLogic Mandatory Logic
	*/
	public void setMandatoryLogic (String MandatoryLogic)
	{
		set_Value (COLUMNNAME_MandatoryLogic, MandatoryLogic);
	}

	/** Get Mandatory Logic.
		@return Mandatory Logic	  */
	public String getMandatoryLogic()
	{
		return (String)get_Value(COLUMNNAME_MandatoryLogic);
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

	public org.compiere.model.I_PA_DashboardContent getPA_DashboardContent() throws RuntimeException
	{
		return (org.compiere.model.I_PA_DashboardContent)MTable.get(getCtx(), org.compiere.model.I_PA_DashboardContent.Table_ID)
			.getPO(getPA_DashboardContent_ID(), get_TrxName());
	}

	/** Set Dashboard Content.
		@param PA_DashboardContent_ID Dashboard Content
	*/
	public void setPA_DashboardContent_ID (int PA_DashboardContent_ID)
	{
		if (PA_DashboardContent_ID < 1)
			set_Value (COLUMNNAME_PA_DashboardContent_ID, null);
		else
			set_Value (COLUMNNAME_PA_DashboardContent_ID, Integer.valueOf(PA_DashboardContent_ID));
	}

	/** Get Dashboard Content.
		@return Dashboard Content	  */
	public int getPA_DashboardContent_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_DashboardContent_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** PartitioningMethod AD_Reference_ID=200261 */
	public static final int PARTITIONINGMETHOD_AD_Reference_ID=200261;
	/** List = L */
	public static final String PARTITIONINGMETHOD_List = "L";
	/** Range = R */
	public static final String PARTITIONINGMETHOD_Range = "R";
	/** Set Partitioning Method.
		@param PartitioningMethod Indicates how the Table is partitioned
	*/
	public void setPartitioningMethod (String PartitioningMethod)
	{

		set_Value (COLUMNNAME_PartitioningMethod, PartitioningMethod);
	}

	/** Get Partitioning Method.
		@return Indicates how the Table is partitioned
	  */
	public String getPartitioningMethod()
	{
		return (String)get_Value(COLUMNNAME_PartitioningMethod);
	}

	/** Set Placeholder.
		@param Placeholder Placeholder
	*/
	public void setPlaceholder (String Placeholder)
	{
		set_Value (COLUMNNAME_Placeholder, Placeholder);
	}

	/** Get Placeholder.
		@return Placeholder	  */
	public String getPlaceholder()
	{
		return (String)get_Value(COLUMNNAME_Placeholder);
	}

	/** Set Range Partition Interval.
		@param RangePartitionInterval Indicates the interval used in a range partitioning
	*/
	public void setRangePartitionInterval (String RangePartitionInterval)
	{
		set_Value (COLUMNNAME_RangePartitionInterval, RangePartitionInterval);
	}

	/** Get Range Partition Interval.
		@return Indicates the interval used in a range partitioning
	  */
	public String getRangePartitionInterval()
	{
		return (String)get_Value(COLUMNNAME_RangePartitionInterval);
	}

	/** Set Read Only Logic.
		@param ReadOnlyLogic Logic to determine if field is read only (applies only when field is read-write)
	*/
	public void setReadOnlyLogic (String ReadOnlyLogic)
	{
		set_Value (COLUMNNAME_ReadOnlyLogic, ReadOnlyLogic);
	}

	/** Get Read Only Logic.
		@return Logic to determine if field is read only (applies only when field is read-write)
	  */
	public String getReadOnlyLogic()
	{
		return (String)get_Value(COLUMNNAME_ReadOnlyLogic);
	}

	/** Set Sequence.
		@param SeqNo Method of ordering records; lowest number comes first
	*/
	public void setSeqNo (int SeqNo)
	{
		set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
	}

	/** Get Sequence.
		@return Method of ordering records; lowest number comes first
	  */
	public int getSeqNo()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Partition Key Sequence.
		@param SeqNoPartition Indicates the order of partition keys
	*/
	public void setSeqNoPartition (int SeqNoPartition)
	{
		set_Value (COLUMNNAME_SeqNoPartition, Integer.valueOf(SeqNoPartition));
	}

	/** Get Partition Key Sequence.
		@return Indicates the order of partition keys
	  */
	public int getSeqNoPartition()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNoPartition);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Selection Column Sequence.
		@param SeqNoSelection Selection Column Sequence
	*/
	public void setSeqNoSelection (int SeqNoSelection)
	{
		set_Value (COLUMNNAME_SeqNoSelection, Integer.valueOf(SeqNoSelection));
	}

	/** Get Selection Column Sequence.
		@return Selection Column Sequence
	  */
	public int getSeqNoSelection()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNoSelection);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Value Format.
		@param VFormat Format of the value; Can contain fixed format elements, Variables: &quot;_lLoOaAcCa09&quot;, or ~regex
	*/
	public void setVFormat (String VFormat)
	{
		set_Value (COLUMNNAME_VFormat, VFormat);
	}

	/** Get Value Format.
		@return Format of the value; Can contain fixed format elements, Variables: &quot;_lLoOaAcCa09&quot;, or ~regex
	  */
	public String getVFormat()
	{
		return (String)get_Value(COLUMNNAME_VFormat);
	}

	/** Set Max. Value.
		@param ValueMax Maximum Value for a field
	*/
	public void setValueMax (String ValueMax)
	{
		set_Value (COLUMNNAME_ValueMax, ValueMax);
	}

	/** Get Max. Value.
		@return Maximum Value for a field
	  */
	public String getValueMax()
	{
		return (String)get_Value(COLUMNNAME_ValueMax);
	}

	/** Set Min. Value.
		@param ValueMin Minimum Value for a field
	*/
	public void setValueMin (String ValueMin)
	{
		set_Value (COLUMNNAME_ValueMin, ValueMin);
	}

	/** Get Min. Value.
		@return Minimum Value for a field
	  */
	public String getValueMin()
	{
		return (String)get_Value(COLUMNNAME_ValueMin);
	}

	/** Set Version.
		@param Version Version of the table definition
	*/
	public void setVersion (BigDecimal Version)
	{
		set_Value (COLUMNNAME_Version, Version);
	}

	/** Get Version.
		@return Version of the table definition
	  */
	public BigDecimal getVersion()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Version);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}