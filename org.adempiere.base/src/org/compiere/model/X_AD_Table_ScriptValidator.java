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

/** Generated Model for AD_Table_ScriptValidator
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_Table_ScriptValidator")
public class X_AD_Table_ScriptValidator extends PO implements I_AD_Table_ScriptValidator, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_Table_ScriptValidator (Properties ctx, int AD_Table_ScriptValidator_ID, String trxName)
    {
      super (ctx, AD_Table_ScriptValidator_ID, trxName);
      /** if (AD_Table_ScriptValidator_ID == 0)
        {
			setAD_Rule_ID (0);
			setAD_Table_ID (0);
			setAD_Table_ScriptValidator_ID (0);
			setEventModelValidator (null);
			setSeqNo (0);
// 0
        } */
    }

    /** Standard Constructor */
    public X_AD_Table_ScriptValidator (Properties ctx, int AD_Table_ScriptValidator_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Table_ScriptValidator_ID, trxName, virtualColumns);
      /** if (AD_Table_ScriptValidator_ID == 0)
        {
			setAD_Rule_ID (0);
			setAD_Table_ID (0);
			setAD_Table_ScriptValidator_ID (0);
			setEventModelValidator (null);
			setSeqNo (0);
// 0
        } */
    }

    /** Standard Constructor */
    public X_AD_Table_ScriptValidator (Properties ctx, String AD_Table_ScriptValidator_UU, String trxName)
    {
      super (ctx, AD_Table_ScriptValidator_UU, trxName);
      /** if (AD_Table_ScriptValidator_UU == null)
        {
			setAD_Rule_ID (0);
			setAD_Table_ID (0);
			setAD_Table_ScriptValidator_ID (0);
			setEventModelValidator (null);
			setSeqNo (0);
// 0
        } */
    }

    /** Standard Constructor */
    public X_AD_Table_ScriptValidator (Properties ctx, String AD_Table_ScriptValidator_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Table_ScriptValidator_UU, trxName, virtualColumns);
      /** if (AD_Table_ScriptValidator_UU == null)
        {
			setAD_Rule_ID (0);
			setAD_Table_ID (0);
			setAD_Table_ScriptValidator_ID (0);
			setEventModelValidator (null);
			setSeqNo (0);
// 0
        } */
    }

    /** Load Constructor */
    public X_AD_Table_ScriptValidator (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_Table_ScriptValidator[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Rule getAD_Rule() throws RuntimeException
	{
		return (org.compiere.model.I_AD_Rule)MTable.get(getCtx(), org.compiere.model.I_AD_Rule.Table_ID)
			.getPO(getAD_Rule_ID(), get_TrxName());
	}

	/** Set Rule.
		@param AD_Rule_ID Rule
	*/
	public void setAD_Rule_ID (int AD_Rule_ID)
	{
		if (AD_Rule_ID < 1)
			set_Value (COLUMNNAME_AD_Rule_ID, null);
		else
			set_Value (COLUMNNAME_AD_Rule_ID, Integer.valueOf(AD_Rule_ID));
	}

	/** Get Rule.
		@return Rule	  */
	public int getAD_Rule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Rule_ID);
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

	/** Set Table Script Validator.
		@param AD_Table_ScriptValidator_ID Table Script Validator
	*/
	public void setAD_Table_ScriptValidator_ID (int AD_Table_ScriptValidator_ID)
	{
		if (AD_Table_ScriptValidator_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Table_ScriptValidator_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Table_ScriptValidator_ID, Integer.valueOf(AD_Table_ScriptValidator_ID));
	}

	/** Get Table Script Validator.
		@return Table Script Validator	  */
	public int getAD_Table_ScriptValidator_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ScriptValidator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Table_ScriptValidator_UU.
		@param AD_Table_ScriptValidator_UU AD_Table_ScriptValidator_UU
	*/
	public void setAD_Table_ScriptValidator_UU (String AD_Table_ScriptValidator_UU)
	{
		set_Value (COLUMNNAME_AD_Table_ScriptValidator_UU, AD_Table_ScriptValidator_UU);
	}

	/** Get AD_Table_ScriptValidator_UU.
		@return AD_Table_ScriptValidator_UU	  */
	public String getAD_Table_ScriptValidator_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_Table_ScriptValidator_UU);
	}

	/** EventModelValidator AD_Reference_ID=53237 */
	public static final int EVENTMODELVALIDATOR_AD_Reference_ID=53237;
	/** Document After Reactivate = DAAC */
	public static final String EVENTMODELVALIDATOR_DocumentAfterReactivate = "DAAC";
	/** Document After Close = DACL */
	public static final String EVENTMODELVALIDATOR_DocumentAfterClose = "DACL";
	/** Document After Complete = DACO */
	public static final String EVENTMODELVALIDATOR_DocumentAfterComplete = "DACO";
	/** Document After Post = DAPO */
	public static final String EVENTMODELVALIDATOR_DocumentAfterPost = "DAPO";
	/** Document After Prepare = DAPR */
	public static final String EVENTMODELVALIDATOR_DocumentAfterPrepare = "DAPR";
	/** Document After Reverse Accrual = DARA */
	public static final String EVENTMODELVALIDATOR_DocumentAfterReverseAccrual = "DARA";
	/** Document After Reverse Correct = DARC */
	public static final String EVENTMODELVALIDATOR_DocumentAfterReverseCorrect = "DARC";
	/** Document After Void = DAVO */
	public static final String EVENTMODELVALIDATOR_DocumentAfterVoid = "DAVO";
	/** Document Before Reactivate = DBAC */
	public static final String EVENTMODELVALIDATOR_DocumentBeforeReactivate = "DBAC";
	/** Document Before Close = DBCL */
	public static final String EVENTMODELVALIDATOR_DocumentBeforeClose = "DBCL";
	/** Document Before Complete = DBCO */
	public static final String EVENTMODELVALIDATOR_DocumentBeforeComplete = "DBCO";
	/** Document Before Post = DBPO */
	public static final String EVENTMODELVALIDATOR_DocumentBeforePost = "DBPO";
	/** Document Before Prepare = DBPR */
	public static final String EVENTMODELVALIDATOR_DocumentBeforePrepare = "DBPR";
	/** Document Before Reverse Accrual = DBRA */
	public static final String EVENTMODELVALIDATOR_DocumentBeforeReverseAccrual = "DBRA";
	/** Document Before Reverse Correct = DBRC */
	public static final String EVENTMODELVALIDATOR_DocumentBeforeReverseCorrect = "DBRC";
	/** Document Before Void = DBVO */
	public static final String EVENTMODELVALIDATOR_DocumentBeforeVoid = "DBVO";
	/** Table After Change = TAC */
	public static final String EVENTMODELVALIDATOR_TableAfterChange = "TAC";
	/** Table After Change Replication = TACR */
	public static final String EVENTMODELVALIDATOR_TableAfterChangeReplication = "TACR";
	/** Table After Delete = TAD */
	public static final String EVENTMODELVALIDATOR_TableAfterDelete = "TAD";
	/** Table After New = TAN */
	public static final String EVENTMODELVALIDATOR_TableAfterNew = "TAN";
	/** Table After New Replication = TANR */
	public static final String EVENTMODELVALIDATOR_TableAfterNewReplication = "TANR";
	/** Table Before Change = TBC */
	public static final String EVENTMODELVALIDATOR_TableBeforeChange = "TBC";
	/** Table Before Delete = TBD */
	public static final String EVENTMODELVALIDATOR_TableBeforeDelete = "TBD";
	/** Table Before Delete Replication = TBDR */
	public static final String EVENTMODELVALIDATOR_TableBeforeDeleteReplication = "TBDR";
	/** Table Before New = TBN */
	public static final String EVENTMODELVALIDATOR_TableBeforeNew = "TBN";
	/** Set Event Model Validator.
		@param EventModelValidator Event Model Validator
	*/
	public void setEventModelValidator (String EventModelValidator)
	{

		set_Value (COLUMNNAME_EventModelValidator, EventModelValidator);
	}

	/** Get Event Model Validator.
		@return Event Model Validator	  */
	public String getEventModelValidator()
	{
		return (String)get_Value(COLUMNNAME_EventModelValidator);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getEventModelValidator()));
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
}