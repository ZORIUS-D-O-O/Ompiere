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

/** Generated Model for IMP_Processor
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="IMP_Processor")
public class X_IMP_Processor extends PO implements I_IMP_Processor, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_IMP_Processor (Properties ctx, int IMP_Processor_ID, String trxName)
    {
      super (ctx, IMP_Processor_ID, trxName);
      /** if (IMP_Processor_ID == 0)
        {
			setFrequency (0);
			setFrequencyType (null);
			setIMP_Processor_ID (0);
			setIMP_Processor_Type_ID (0);
			setKeepLogDays (0);
// 7
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_IMP_Processor (Properties ctx, int IMP_Processor_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, IMP_Processor_ID, trxName, virtualColumns);
      /** if (IMP_Processor_ID == 0)
        {
			setFrequency (0);
			setFrequencyType (null);
			setIMP_Processor_ID (0);
			setIMP_Processor_Type_ID (0);
			setKeepLogDays (0);
// 7
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_IMP_Processor (Properties ctx, String IMP_Processor_UU, String trxName)
    {
      super (ctx, IMP_Processor_UU, trxName);
      /** if (IMP_Processor_UU == null)
        {
			setFrequency (0);
			setFrequencyType (null);
			setIMP_Processor_ID (0);
			setIMP_Processor_Type_ID (0);
			setKeepLogDays (0);
// 7
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_IMP_Processor (Properties ctx, String IMP_Processor_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, IMP_Processor_UU, trxName, virtualColumns);
      /** if (IMP_Processor_UU == null)
        {
			setFrequency (0);
			setFrequencyType (null);
			setIMP_Processor_ID (0);
			setIMP_Processor_Type_ID (0);
			setKeepLogDays (0);
// 7
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_IMP_Processor (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_IMP_Processor[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Account.
		@param Account Account
	*/
	public void setAccount (String Account)
	{
		set_Value (COLUMNNAME_Account, Account);
	}

	/** Get Account.
		@return Account	  */
	public String getAccount()
	{
		return (String)get_Value(COLUMNNAME_Account);
	}

	/** Set Date Last Run.
		@param DateLastRun Date the process was last run.
	*/
	public void setDateLastRun (Timestamp DateLastRun)
	{
		set_Value (COLUMNNAME_DateLastRun, DateLastRun);
	}

	/** Get Date Last Run.
		@return Date the process was last run.
	  */
	public Timestamp getDateLastRun()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateLastRun);
	}

	/** Set Date Next Run.
		@param DateNextRun Date the process will run next
	*/
	public void setDateNextRun (Timestamp DateNextRun)
	{
		set_Value (COLUMNNAME_DateNextRun, DateNextRun);
	}

	/** Get Date Next Run.
		@return Date the process will run next
	  */
	public Timestamp getDateNextRun()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateNextRun);
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

	/** Set Frequency.
		@param Frequency Frequency of events
	*/
	public void setFrequency (int Frequency)
	{
		set_Value (COLUMNNAME_Frequency, Integer.valueOf(Frequency));
	}

	/** Get Frequency.
		@return Frequency of events
	  */
	public int getFrequency()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Frequency);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** FrequencyType AD_Reference_ID=221 */
	public static final int FREQUENCYTYPE_AD_Reference_ID=221;
	/** Day = D */
	public static final String FREQUENCYTYPE_Day = "D";
	/** Hour = H */
	public static final String FREQUENCYTYPE_Hour = "H";
	/** Minute = M */
	public static final String FREQUENCYTYPE_Minute = "M";
	/** Set Frequency Type.
		@param FrequencyType Frequency of event
	*/
	public void setFrequencyType (String FrequencyType)
	{

		set_Value (COLUMNNAME_FrequencyType, FrequencyType);
	}

	/** Get Frequency Type.
		@return Frequency of event
	  */
	public String getFrequencyType()
	{
		return (String)get_Value(COLUMNNAME_FrequencyType);
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

	/** Set Host.
		@param Host Host
	*/
	public void setHost (String Host)
	{
		set_Value (COLUMNNAME_Host, Host);
	}

	/** Get Host.
		@return Host	  */
	public String getHost()
	{
		return (String)get_Value(COLUMNNAME_Host);
	}

	/** Set Import Processor.
		@param IMP_Processor_ID Import Processor
	*/
	public void setIMP_Processor_ID (int IMP_Processor_ID)
	{
		if (IMP_Processor_ID < 1)
			set_ValueNoCheck (COLUMNNAME_IMP_Processor_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_IMP_Processor_ID, Integer.valueOf(IMP_Processor_ID));
	}

	/** Get Import Processor.
		@return Import Processor	  */
	public int getIMP_Processor_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_IMP_Processor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_IMP_Processor_Type getIMP_Processor_Type() throws RuntimeException
	{
		return (org.compiere.model.I_IMP_Processor_Type)MTable.get(getCtx(), org.compiere.model.I_IMP_Processor_Type.Table_ID)
			.getPO(getIMP_Processor_Type_ID(), get_TrxName());
	}

	/** Set Import Processor Type.
		@param IMP_Processor_Type_ID Import Processor Type
	*/
	public void setIMP_Processor_Type_ID (int IMP_Processor_Type_ID)
	{
		if (IMP_Processor_Type_ID < 1)
			set_Value (COLUMNNAME_IMP_Processor_Type_ID, null);
		else
			set_Value (COLUMNNAME_IMP_Processor_Type_ID, Integer.valueOf(IMP_Processor_Type_ID));
	}

	/** Get Import Processor Type.
		@return Import Processor Type	  */
	public int getIMP_Processor_Type_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_IMP_Processor_Type_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set IMP_Processor_UU.
		@param IMP_Processor_UU IMP_Processor_UU
	*/
	public void setIMP_Processor_UU (String IMP_Processor_UU)
	{
		set_Value (COLUMNNAME_IMP_Processor_UU, IMP_Processor_UU);
	}

	/** Get IMP_Processor_UU.
		@return IMP_Processor_UU	  */
	public String getIMP_Processor_UU()
	{
		return (String)get_Value(COLUMNNAME_IMP_Processor_UU);
	}

	/** Set Days to keep Log.
		@param KeepLogDays Number of days to keep the log entries
	*/
	public void setKeepLogDays (int KeepLogDays)
	{
		set_Value (COLUMNNAME_KeepLogDays, Integer.valueOf(KeepLogDays));
	}

	/** Get Days to keep Log.
		@return Number of days to keep the log entries
	  */
	public int getKeepLogDays()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_KeepLogDays);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Password Info.
		@param PasswordInfo Password Info
	*/
	public void setPasswordInfo (String PasswordInfo)
	{
		set_Value (COLUMNNAME_PasswordInfo, PasswordInfo);
	}

	/** Get Password Info.
		@return Password Info	  */
	public String getPasswordInfo()
	{
		return (String)get_Value(COLUMNNAME_PasswordInfo);
	}

	/** Set Port.
		@param Port Port
	*/
	public void setPort (int Port)
	{
		set_Value (COLUMNNAME_Port, Integer.valueOf(Port));
	}

	/** Get Port.
		@return Port	  */
	public int getPort()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Port);
		if (ii == null)
			 return 0;
		return ii.intValue();
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