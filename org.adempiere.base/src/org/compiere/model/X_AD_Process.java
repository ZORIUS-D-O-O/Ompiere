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

/** Generated Model for AD_Process
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_Process")
public class X_AD_Process extends PO implements I_AD_Process, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_Process (Properties ctx, int AD_Process_ID, String trxName)
    {
      super (ctx, AD_Process_ID, trxName);
      /** if (AD_Process_ID == 0)
        {
			setAD_Process_ID (0);
			setAccessLevel (null);
			setAllowMultipleExecution (null);
// P
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsBetaFunctionality (false);
			setIsReport (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Process (Properties ctx, int AD_Process_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Process_ID, trxName, virtualColumns);
      /** if (AD_Process_ID == 0)
        {
			setAD_Process_ID (0);
			setAccessLevel (null);
			setAllowMultipleExecution (null);
// P
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsBetaFunctionality (false);
			setIsReport (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Process (Properties ctx, String AD_Process_UU, String trxName)
    {
      super (ctx, AD_Process_UU, trxName);
      /** if (AD_Process_UU == null)
        {
			setAD_Process_ID (0);
			setAccessLevel (null);
			setAllowMultipleExecution (null);
// P
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsBetaFunctionality (false);
			setIsReport (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Process (Properties ctx, String AD_Process_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Process_UU, trxName, virtualColumns);
      /** if (AD_Process_UU == null)
        {
			setAD_Process_ID (0);
			setAccessLevel (null);
			setAllowMultipleExecution (null);
// P
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsBetaFunctionality (false);
			setIsReport (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_AD_Process (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_Process[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException
	{
		return (org.compiere.model.I_AD_CtxHelp)MTable.get(getCtx(), org.compiere.model.I_AD_CtxHelp.Table_ID)
			.getPO(getAD_CtxHelp_ID(), get_TrxName());
	}

	/** Set Context Help.
		@param AD_CtxHelp_ID Context Help
	*/
	public void setAD_CtxHelp_ID (int AD_CtxHelp_ID)
	{
		if (AD_CtxHelp_ID < 1)
			set_Value (COLUMNNAME_AD_CtxHelp_ID, null);
		else
			set_Value (COLUMNNAME_AD_CtxHelp_ID, Integer.valueOf(AD_CtxHelp_ID));
	}

	/** Get Context Help.
		@return Context Help	  */
	public int getAD_CtxHelp_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_CtxHelp_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_Form getAD_Form() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Form)MTable.get(getCtx(), org.compiere.model.I_AD_Form.Table_ID)
			.getPO(getAD_Form_ID(), get_TrxName());
	}

	/** Set Special Form.
		@param AD_Form_ID Special Form
	*/
	public void setAD_Form_ID (int AD_Form_ID)
	{
		if (AD_Form_ID < 1)
			set_Value (COLUMNNAME_AD_Form_ID, null);
		else
			set_Value (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
	}

	/** Get Special Form.
		@return Special Form
	  */
	public int getAD_Form_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException
	{
		return (org.compiere.model.I_AD_PrintFormat)MTable.get(getCtx(), org.compiere.model.I_AD_PrintFormat.Table_ID)
			.getPO(getAD_PrintFormat_ID(), get_TrxName());
	}

	/** Set Print Format.
		@param AD_PrintFormat_ID Data Print Format
	*/
	public void setAD_PrintFormat_ID (int AD_PrintFormat_ID)
	{
		if (AD_PrintFormat_ID < 1)
			set_Value (COLUMNNAME_AD_PrintFormat_ID, null);
		else
			set_Value (COLUMNNAME_AD_PrintFormat_ID, Integer.valueOf(AD_PrintFormat_ID));
	}

	/** Get Print Format.
		@return Data Print Format
	  */
	public int getAD_PrintFormat_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Process.
		@param AD_Process_ID Process or Report
	*/
	public void setAD_Process_ID (int AD_Process_ID)
	{
		if (AD_Process_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Process_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
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

	/** Set AD_Process_UU.
		@param AD_Process_UU AD_Process_UU
	*/
	public void setAD_Process_UU (String AD_Process_UU)
	{
		set_Value (COLUMNNAME_AD_Process_UU, AD_Process_UU);
	}

	/** Get AD_Process_UU.
		@return AD_Process_UU	  */
	public String getAD_Process_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_Process_UU);
	}

	public org.compiere.model.I_AD_ReportView getAD_ReportView() throws RuntimeException
	{
		return (org.compiere.model.I_AD_ReportView)MTable.get(getCtx(), org.compiere.model.I_AD_ReportView.Table_ID)
			.getPO(getAD_ReportView_ID(), get_TrxName());
	}

	/** Set Report View.
		@param AD_ReportView_ID View used to generate this report
	*/
	public void setAD_ReportView_ID (int AD_ReportView_ID)
	{
		if (AD_ReportView_ID < 1)
			set_Value (COLUMNNAME_AD_ReportView_ID, null);
		else
			set_Value (COLUMNNAME_AD_ReportView_ID, Integer.valueOf(AD_ReportView_ID));
	}

	/** Get Report View.
		@return View used to generate this report
	  */
	public int getAD_ReportView_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReportView_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
			set_Value (COLUMNNAME_AD_Workflow_ID, null);
		else
			set_Value (COLUMNNAME_AD_Workflow_ID, Integer.valueOf(AD_Workflow_ID));
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

	/** AccessLevel AD_Reference_ID=5 */
	public static final int ACCESSLEVEL_AD_Reference_ID=5;
	/** Organization = 1 */
	public static final String ACCESSLEVEL_Organization = "1";
	/** Client only = 2 */
	public static final String ACCESSLEVEL_ClientOnly = "2";
	/** Client+Organization = 3 */
	public static final String ACCESSLEVEL_ClientPlusOrganization = "3";
	/** System only = 4 */
	public static final String ACCESSLEVEL_SystemOnly = "4";
	/** System+Client = 6 */
	public static final String ACCESSLEVEL_SystemPlusClient = "6";
	/** All = 7 */
	public static final String ACCESSLEVEL_All = "7";
	/** Set Data Access Level.
		@param AccessLevel Access Level required
	*/
	public void setAccessLevel (String AccessLevel)
	{

		set_Value (COLUMNNAME_AccessLevel, AccessLevel);
	}

	/** Get Data Access Level.
		@return Access Level required
	  */
	public String getAccessLevel()
	{
		return (String)get_Value(COLUMNNAME_AccessLevel);
	}

	/** AllowMultipleExecution AD_Reference_ID=200158 */
	public static final int ALLOWMULTIPLEEXECUTION_AD_Reference_ID=200158;
	/** Not from same user = N */
	public static final String ALLOWMULTIPLEEXECUTION_NotFromSameUser = "N";
	/** Not from any user = NA */
	public static final String ALLOWMULTIPLEEXECUTION_NotFromAnyUser = "NA";
	/** Not from same user and parameters = P */
	public static final String ALLOWMULTIPLEEXECUTION_NotFromSameUserAndParameters = "P";
	/** Not from any user and same parameters = PA */
	public static final String ALLOWMULTIPLEEXECUTION_NotFromAnyUserAndSameParameters = "PA";
	/** Yes = Y */
	public static final String ALLOWMULTIPLEEXECUTION_Yes = "Y";
	/** Set Allow Concurrent Execution.
		@param AllowMultipleExecution Allow or disallow executing a process/report multiple times concurrently
	*/
	public void setAllowMultipleExecution (String AllowMultipleExecution)
	{

		set_Value (COLUMNNAME_AllowMultipleExecution, AllowMultipleExecution);
	}

	/** Get Allow Concurrent Execution.
		@return Allow or disallow executing a process/report multiple times concurrently
	  */
	public String getAllowMultipleExecution()
	{
		return (String)get_Value(COLUMNNAME_AllowMultipleExecution);
	}

	/** Set Classname.
		@param Classname Java Classname
	*/
	public void setClassname (String Classname)
	{
		set_Value (COLUMNNAME_Classname, Classname);
	}

	/** Get Classname.
		@return Java Classname
	  */
	public String getClassname()
	{
		return (String)get_Value(COLUMNNAME_Classname);
	}

	/** Set Copy From Report and Process.
		@param CopyFromProcess Copy settings from one report and process to another.
	*/
	public void setCopyFromProcess (String CopyFromProcess)
	{
		set_Value (COLUMNNAME_CopyFromProcess, CopyFromProcess);
	}

	/** Get Copy From Report and Process.
		@return Copy settings from one report and process to another.
	  */
	public String getCopyFromProcess()
	{
		return (String)get_Value(COLUMNNAME_CopyFromProcess);
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

	/** ExecutionType AD_Reference_ID=200157 */
	public static final int EXECUTIONTYPE_AD_Reference_ID=200157;
	/** Force Background = B */
	public static final String EXECUTIONTYPE_ForceBackground = "B";
	/** Force Foreground = F */
	public static final String EXECUTIONTYPE_ForceForeground = "F";
	/** Set Execution Type.
		@param ExecutionType Execution Type defines whether the report/process will always run in background or foreground. 
	*/
	public void setExecutionType (String ExecutionType)
	{

		set_Value (COLUMNNAME_ExecutionType, ExecutionType);
	}

	/** Get Execution Type.
		@return Execution Type defines whether the report/process will always run in background or foreground. 
	  */
	public String getExecutionType()
	{
		return (String)get_Value(COLUMNNAME_ExecutionType);
	}

	/** Set File Name Pattern.
		@param FileNamePattern File Name Pattern
	*/
	public void setFileNamePattern (String FileNamePattern)
	{
		set_Value (COLUMNNAME_FileNamePattern, FileNamePattern);
	}

	/** Get File Name Pattern.
		@return File Name Pattern	  */
	public String getFileNamePattern()
	{
		return (String)get_Value(COLUMNNAME_FileNamePattern);
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

	/** Set Beta Functionality.
		@param IsBetaFunctionality This functionality is considered Beta
	*/
	public void setIsBetaFunctionality (boolean IsBetaFunctionality)
	{
		set_Value (COLUMNNAME_IsBetaFunctionality, Boolean.valueOf(IsBetaFunctionality));
	}

	/** Get Beta Functionality.
		@return This functionality is considered Beta
	  */
	public boolean isBetaFunctionality()
	{
		Object oo = get_Value(COLUMNNAME_IsBetaFunctionality);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Direct print.
		@param IsDirectPrint Print without dialog
	*/
	public void setIsDirectPrint (boolean IsDirectPrint)
	{
		set_Value (COLUMNNAME_IsDirectPrint, Boolean.valueOf(IsDirectPrint));
	}

	/** Get Direct print.
		@return Print without dialog
	  */
	public boolean isDirectPrint()
	{
		Object oo = get_Value(COLUMNNAME_IsDirectPrint);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Report.
		@param IsReport Indicates a Report record
	*/
	public void setIsReport (boolean IsReport)
	{
		set_Value (COLUMNNAME_IsReport, Boolean.valueOf(IsReport));
	}

	/** Get Report.
		@return Indicates a Report record
	  */
	public boolean isReport()
	{
		Object oo = get_Value(COLUMNNAME_IsReport);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Jasper Report.
		@param JasperReport Jasper Report
	*/
	public void setJasperReport (String JasperReport)
	{
		set_Value (COLUMNNAME_JasperReport, JasperReport);
	}

	/** Get Jasper Report.
		@return Jasper Report	  */
	public String getJasperReport()
	{
		return (String)get_Value(COLUMNNAME_JasperReport);
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

	/** Set Procedure.
		@param ProcedureName Name of the Database Procedure
	*/
	public void setProcedureName (String ProcedureName)
	{
		set_Value (COLUMNNAME_ProcedureName, ProcedureName);
	}

	/** Get Procedure.
		@return Name of the Database Procedure
	  */
	public String getProcedureName()
	{
		return (String)get_Value(COLUMNNAME_ProcedureName);
	}

	/** ShowHelp AD_Reference_ID=50007 */
	public static final int SHOWHELP_AD_Reference_ID=50007;
	/** Ask user (for future use) = A */
	public static final String SHOWHELP_AskUserForFutureUse = "A";
	/** Don&#039;t show help = N */
	public static final String SHOWHELP_DonTShowHelp = "N";
	/** Run silently - Take Defaults = S */
	public static final String SHOWHELP_RunSilently_TakeDefaults = "S";
	/** Show Help = Y */
	public static final String SHOWHELP_ShowHelp = "Y";
	/** Set Show Help.
		@param ShowHelp Show Help
	*/
	public void setShowHelp (String ShowHelp)
	{

		set_Value (COLUMNNAME_ShowHelp, ShowHelp);
	}

	/** Get Show Help.
		@return Show Help	  */
	public String getShowHelp()
	{
		return (String)get_Value(COLUMNNAME_ShowHelp);
	}

	/** Set Statistic Count.
		@param Statistic_Count Internal statistics how often the entity was used
	*/
	public void setStatistic_Count (int Statistic_Count)
	{
		set_Value (COLUMNNAME_Statistic_Count, Integer.valueOf(Statistic_Count));
	}

	/** Get Statistic Count.
		@return Internal statistics how often the entity was used
	  */
	public int getStatistic_Count()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Statistic_Count);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Statistic Seconds.
		@param Statistic_Seconds Internal statistics how many seconds a process took
	*/
	public void setStatistic_Seconds (int Statistic_Seconds)
	{
		set_Value (COLUMNNAME_Statistic_Seconds, Integer.valueOf(Statistic_Seconds));
	}

	/** Get Statistic Seconds.
		@return Internal statistics how many seconds a process took
	  */
	public int getStatistic_Seconds()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Statistic_Seconds);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Workflow Key.
		@param WorkflowValue Key of the Workflow to start
	*/
	public void setWorkflowValue (String WorkflowValue)
	{
		set_Value (COLUMNNAME_WorkflowValue, WorkflowValue);
	}

	/** Get Workflow Key.
		@return Key of the Workflow to start
	  */
	public String getWorkflowValue()
	{
		return (String)get_Value(COLUMNNAME_WorkflowValue);
	}
}