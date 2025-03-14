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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for C_BankStatement
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_BankStatement")
public class X_C_BankStatement extends PO implements I_C_BankStatement, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_BankStatement (Properties ctx, int C_BankStatement_ID, String trxName)
    {
      super (ctx, C_BankStatement_ID, trxName);
      /** if (C_BankStatement_ID == 0)
        {
			setC_BankAccount_ID (0);
			setC_BankStatement_ID (0);
			setC_DocType_ID (0);
			setDateAcct (new Timestamp( System.currentTimeMillis() ));
			setDocAction (null);
// CO
			setDocStatus (null);
// DR
			setDocumentNo (null);
			setEndingBalance (Env.ZERO);
			setIsApproved (false);
// N
			setIsManual (true);
// Y
			setName (null);
// @#Date@
			setPosted (false);
// N
			setProcessed (false);
			setStatementDate (new Timestamp( System.currentTimeMillis() ));
// @Date@
        } */
    }

    /** Standard Constructor */
    public X_C_BankStatement (Properties ctx, int C_BankStatement_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_BankStatement_ID, trxName, virtualColumns);
      /** if (C_BankStatement_ID == 0)
        {
			setC_BankAccount_ID (0);
			setC_BankStatement_ID (0);
			setC_DocType_ID (0);
			setDateAcct (new Timestamp( System.currentTimeMillis() ));
			setDocAction (null);
// CO
			setDocStatus (null);
// DR
			setDocumentNo (null);
			setEndingBalance (Env.ZERO);
			setIsApproved (false);
// N
			setIsManual (true);
// Y
			setName (null);
// @#Date@
			setPosted (false);
// N
			setProcessed (false);
			setStatementDate (new Timestamp( System.currentTimeMillis() ));
// @Date@
        } */
    }

    /** Standard Constructor */
    public X_C_BankStatement (Properties ctx, String C_BankStatement_UU, String trxName)
    {
      super (ctx, C_BankStatement_UU, trxName);
      /** if (C_BankStatement_UU == null)
        {
			setC_BankAccount_ID (0);
			setC_BankStatement_ID (0);
			setC_DocType_ID (0);
			setDateAcct (new Timestamp( System.currentTimeMillis() ));
			setDocAction (null);
// CO
			setDocStatus (null);
// DR
			setDocumentNo (null);
			setEndingBalance (Env.ZERO);
			setIsApproved (false);
// N
			setIsManual (true);
// Y
			setName (null);
// @#Date@
			setPosted (false);
// N
			setProcessed (false);
			setStatementDate (new Timestamp( System.currentTimeMillis() ));
// @Date@
        } */
    }

    /** Standard Constructor */
    public X_C_BankStatement (Properties ctx, String C_BankStatement_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_BankStatement_UU, trxName, virtualColumns);
      /** if (C_BankStatement_UU == null)
        {
			setC_BankAccount_ID (0);
			setC_BankStatement_ID (0);
			setC_DocType_ID (0);
			setDateAcct (new Timestamp( System.currentTimeMillis() ));
			setDocAction (null);
// CO
			setDocStatus (null);
// DR
			setDocumentNo (null);
			setEndingBalance (Env.ZERO);
			setIsApproved (false);
// N
			setIsManual (true);
// Y
			setName (null);
// @#Date@
			setPosted (false);
// N
			setProcessed (false);
			setStatementDate (new Timestamp( System.currentTimeMillis() ));
// @Date@
        } */
    }

    /** Load Constructor */
    public X_C_BankStatement (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_BankStatement[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Beginning Balance.
		@param BeginningBalance Balance prior to any transactions
	*/
	public void setBeginningBalance (BigDecimal BeginningBalance)
	{
		set_Value (COLUMNNAME_BeginningBalance, BeginningBalance);
	}

	/** Get Beginning Balance.
		@return Balance prior to any transactions
	  */
	public BigDecimal getBeginningBalance()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_BeginningBalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_BankAccount getC_BankAccount() throws RuntimeException
	{
		return (org.compiere.model.I_C_BankAccount)MTable.get(getCtx(), org.compiere.model.I_C_BankAccount.Table_ID)
			.getPO(getC_BankAccount_ID(), get_TrxName());
	}

	/** Set Bank Account.
		@param C_BankAccount_ID Account at the Bank
	*/
	public void setC_BankAccount_ID (int C_BankAccount_ID)
	{
		if (C_BankAccount_ID < 1)
			set_Value (COLUMNNAME_C_BankAccount_ID, null);
		else
			set_Value (COLUMNNAME_C_BankAccount_ID, Integer.valueOf(C_BankAccount_ID));
	}

	/** Get Bank Account.
		@return Account at the Bank
	  */
	public int getC_BankAccount_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BankAccount_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Bank Statement.
		@param C_BankStatement_ID Bank Statement of account
	*/
	public void setC_BankStatement_ID (int C_BankStatement_ID)
	{
		if (C_BankStatement_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BankStatement_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BankStatement_ID, Integer.valueOf(C_BankStatement_ID));
	}

	/** Get Bank Statement.
		@return Bank Statement of account
	  */
	public int getC_BankStatement_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BankStatement_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_BankStatement_UU.
		@param C_BankStatement_UU C_BankStatement_UU
	*/
	public void setC_BankStatement_UU (String C_BankStatement_UU)
	{
		set_Value (COLUMNNAME_C_BankStatement_UU, C_BankStatement_UU);
	}

	/** Get C_BankStatement_UU.
		@return C_BankStatement_UU	  */
	public String getC_BankStatement_UU()
	{
		return (String)get_Value(COLUMNNAME_C_BankStatement_UU);
	}

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
	{
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_ID)
			.getPO(getC_DocType_ID(), get_TrxName());
	}

	/** Set Document Type.
		@param C_DocType_ID Document type or rules
	*/
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0)
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Copy From.
		@param CopyFrom Copy From Record
	*/
	public void setCopyFrom (String CopyFrom)
	{
		set_Value (COLUMNNAME_CopyFrom, CopyFrom);
	}

	/** Get Copy From.
		@return Copy From Record
	  */
	public String getCopyFrom()
	{
		return (String)get_Value(COLUMNNAME_CopyFrom);
	}

	/** Set Create lines from.
		@param CreateFrom Process which will generate a new document lines based on an existing document
	*/
	public void setCreateFrom (String CreateFrom)
	{
		set_Value (COLUMNNAME_CreateFrom, CreateFrom);
	}

	/** Get Create lines from.
		@return Process which will generate a new document lines based on an existing document
	  */
	public String getCreateFrom()
	{
		return (String)get_Value(COLUMNNAME_CreateFrom);
	}

	/** Set Create From Batch.
		@param CreateFromBatch Create From Batch
	*/
	public void setCreateFromBatch (String CreateFromBatch)
	{
		set_Value (COLUMNNAME_CreateFromBatch, CreateFromBatch);
	}

	/** Get Create From Batch.
		@return Create From Batch	  */
	public String getCreateFromBatch()
	{
		return (String)get_Value(COLUMNNAME_CreateFromBatch);
	}

	/** Set Account Date.
		@param DateAcct Accounting Date
	*/
	public void setDateAcct (Timestamp DateAcct)
	{
		set_Value (COLUMNNAME_DateAcct, DateAcct);
	}

	/** Get Account Date.
		@return Accounting Date
	  */
	public Timestamp getDateAcct()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateAcct);
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

	/** DocAction AD_Reference_ID=135 */
	public static final int DOCACTION_AD_Reference_ID=135;
	/** &lt;None&gt; = -- */
	public static final String DOCACTION_None = "--";
	/** Approve = AP */
	public static final String DOCACTION_Approve = "AP";
	/** Close = CL */
	public static final String DOCACTION_Close = "CL";
	/** Complete = CO */
	public static final String DOCACTION_Complete = "CO";
	/** Invalidate = IN */
	public static final String DOCACTION_Invalidate = "IN";
	/** Post = PO */
	public static final String DOCACTION_Post = "PO";
	/** Prepare = PR */
	public static final String DOCACTION_Prepare = "PR";
	/** Reverse - Accrual = RA */
	public static final String DOCACTION_Reverse_Accrual = "RA";
	/** Reverse - Correct = RC */
	public static final String DOCACTION_Reverse_Correct = "RC";
	/** Re-activate = RE */
	public static final String DOCACTION_Re_Activate = "RE";
	/** Reject = RJ */
	public static final String DOCACTION_Reject = "RJ";
	/** Void = VO */
	public static final String DOCACTION_Void = "VO";
	/** Wait Complete = WC */
	public static final String DOCACTION_WaitComplete = "WC";
	/** Unlock = XL */
	public static final String DOCACTION_Unlock = "XL";
	/** Set Document Action.
		@param DocAction The targeted status of the document
	*/
	public void setDocAction (String DocAction)
	{

		set_Value (COLUMNNAME_DocAction, DocAction);
	}

	/** Get Document Action.
		@return The targeted status of the document
	  */
	public String getDocAction()
	{
		return (String)get_Value(COLUMNNAME_DocAction);
	}

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Set Document Status.
		@param DocStatus The current status of the document
	*/
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus()
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set Document No.
		@param DocumentNo Document sequence number of the document
	*/
	public void setDocumentNo (String DocumentNo)
	{
		set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set EFT Statement Date.
		@param EftStatementDate Electronic Funds Transfer Statement Date
	*/
	public void setEftStatementDate (Timestamp EftStatementDate)
	{
		set_Value (COLUMNNAME_EftStatementDate, EftStatementDate);
	}

	/** Get EFT Statement Date.
		@return Electronic Funds Transfer Statement Date
	  */
	public Timestamp getEftStatementDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_EftStatementDate);
	}

	/** Set EFT Statement Reference.
		@param EftStatementReference Electronic Funds Transfer Statement Reference
	*/
	public void setEftStatementReference (String EftStatementReference)
	{
		set_Value (COLUMNNAME_EftStatementReference, EftStatementReference);
	}

	/** Get EFT Statement Reference.
		@return Electronic Funds Transfer Statement Reference
	  */
	public String getEftStatementReference()
	{
		return (String)get_Value(COLUMNNAME_EftStatementReference);
	}

	/** Set Ending balance.
		@param EndingBalance Ending  or closing balance
	*/
	public void setEndingBalance (BigDecimal EndingBalance)
	{
		set_Value (COLUMNNAME_EndingBalance, EndingBalance);
	}

	/** Get Ending balance.
		@return Ending  or closing balance
	  */
	public BigDecimal getEndingBalance()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EndingBalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Approved.
		@param IsApproved Indicates if this document requires approval
	*/
	public void setIsApproved (boolean IsApproved)
	{
		set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
	}

	/** Get Approved.
		@return Indicates if this document requires approval
	  */
	public boolean isApproved()
	{
		Object oo = get_Value(COLUMNNAME_IsApproved);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Manual.
		@param IsManual This is a manual process
	*/
	public void setIsManual (boolean IsManual)
	{
		set_Value (COLUMNNAME_IsManual, Boolean.valueOf(IsManual));
	}

	/** Get Manual.
		@return This is a manual process
	  */
	public boolean isManual()
	{
		Object oo = get_Value(COLUMNNAME_IsManual);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Match Statement.
		@param MatchStatement Match Statement
	*/
	public void setMatchStatement (String MatchStatement)
	{
		set_Value (COLUMNNAME_MatchStatement, MatchStatement);
	}

	/** Get Match Statement.
		@return Match Statement	  */
	public String getMatchStatement()
	{
		return (String)get_Value(COLUMNNAME_MatchStatement);
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

	/** Set Posted.
		@param Posted Posting status
	*/
	public void setPosted (boolean Posted)
	{
		set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
	}

	/** Get Posted.
		@return Posting status
	  */
	public boolean isPosted()
	{
		Object oo = get_Value(COLUMNNAME_Posted);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Processed.
		@param Processed The document has been processed
	*/
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed()
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Processed On.
		@param ProcessedOn The date+time (expressed in decimal format) when the document has been processed
	*/
	public void setProcessedOn (BigDecimal ProcessedOn)
	{
		set_Value (COLUMNNAME_ProcessedOn, ProcessedOn);
	}

	/** Get Processed On.
		@return The date+time (expressed in decimal format) when the document has been processed
	  */
	public BigDecimal getProcessedOn()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ProcessedOn);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Statement date.
		@param StatementDate Date of the statement
	*/
	public void setStatementDate (Timestamp StatementDate)
	{
		set_Value (COLUMNNAME_StatementDate, StatementDate);
	}

	/** Get Statement date.
		@return Date of the statement
	  */
	public Timestamp getStatementDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_StatementDate);
	}

	/** Set Statement difference.
		@param StatementDifference Difference between statement ending balance and actual ending balance
	*/
	public void setStatementDifference (BigDecimal StatementDifference)
	{
		set_Value (COLUMNNAME_StatementDifference, StatementDifference);
	}

	/** Get Statement difference.
		@return Difference between statement ending balance and actual ending balance
	  */
	public BigDecimal getStatementDifference()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_StatementDifference);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}