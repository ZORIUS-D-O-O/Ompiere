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

/** Generated Model for C_ElementValue
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_ElementValue")
public class X_C_ElementValue extends PO implements I_C_ElementValue, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_ElementValue (Properties ctx, int C_ElementValue_ID, String trxName)
    {
      super (ctx, C_ElementValue_ID, trxName);
      /** if (C_ElementValue_ID == 0)
        {
			setAccountSign (null);
// N
			setAccountType (null);
// E
			setC_ElementValue_ID (0);
			setC_Element_ID (0);
			setIsDetailBPartner (false);
// N
			setIsDetailProduct (false);
// N
			setIsSummary (false);
			setName (null);
			setPostActual (true);
// Y
			setPostBudget (true);
// Y
			setPostEncumbrance (true);
// Y
			setPostStatistical (true);
// Y
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_C_ElementValue (Properties ctx, int C_ElementValue_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_ElementValue_ID, trxName, virtualColumns);
      /** if (C_ElementValue_ID == 0)
        {
			setAccountSign (null);
// N
			setAccountType (null);
// E
			setC_ElementValue_ID (0);
			setC_Element_ID (0);
			setIsDetailBPartner (false);
// N
			setIsDetailProduct (false);
// N
			setIsSummary (false);
			setName (null);
			setPostActual (true);
// Y
			setPostBudget (true);
// Y
			setPostEncumbrance (true);
// Y
			setPostStatistical (true);
// Y
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_C_ElementValue (Properties ctx, String C_ElementValue_UU, String trxName)
    {
      super (ctx, C_ElementValue_UU, trxName);
      /** if (C_ElementValue_UU == null)
        {
			setAccountSign (null);
// N
			setAccountType (null);
// E
			setC_ElementValue_ID (0);
			setC_Element_ID (0);
			setIsDetailBPartner (false);
// N
			setIsDetailProduct (false);
// N
			setIsSummary (false);
			setName (null);
			setPostActual (true);
// Y
			setPostBudget (true);
// Y
			setPostEncumbrance (true);
// Y
			setPostStatistical (true);
// Y
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_C_ElementValue (Properties ctx, String C_ElementValue_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_ElementValue_UU, trxName, virtualColumns);
      /** if (C_ElementValue_UU == null)
        {
			setAccountSign (null);
// N
			setAccountType (null);
// E
			setC_ElementValue_ID (0);
			setC_Element_ID (0);
			setIsDetailBPartner (false);
// N
			setIsDetailProduct (false);
// N
			setIsSummary (false);
			setName (null);
			setPostActual (true);
// Y
			setPostBudget (true);
// Y
			setPostEncumbrance (true);
// Y
			setPostStatistical (true);
// Y
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_C_ElementValue (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_ElementValue[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** AccountSign AD_Reference_ID=118 */
	public static final int ACCOUNTSIGN_AD_Reference_ID=118;
	/** Credit = C */
	public static final String ACCOUNTSIGN_Credit = "C";
	/** Debit = D */
	public static final String ACCOUNTSIGN_Debit = "D";
	/** Natural = N */
	public static final String ACCOUNTSIGN_Natural = "N";
	/** Set Account Sign.
		@param AccountSign Indicates the Natural Sign of the Account as a Debit or Credit
	*/
	public void setAccountSign (String AccountSign)
	{

		set_Value (COLUMNNAME_AccountSign, AccountSign);
	}

	/** Get Account Sign.
		@return Indicates the Natural Sign of the Account as a Debit or Credit
	  */
	public String getAccountSign()
	{
		return (String)get_Value(COLUMNNAME_AccountSign);
	}

	/** AccountType AD_Reference_ID=117 */
	public static final int ACCOUNTTYPE_AD_Reference_ID=117;
	/** Asset = A */
	public static final String ACCOUNTTYPE_Asset = "A";
	/** Expense = E */
	public static final String ACCOUNTTYPE_Expense = "E";
	/** Liability = L */
	public static final String ACCOUNTTYPE_Liability = "L";
	/** Memo = M */
	public static final String ACCOUNTTYPE_Memo = "M";
	/** Owner&#039;s Equity = O */
	public static final String ACCOUNTTYPE_OwnerSEquity = "O";
	/** Revenue = R */
	public static final String ACCOUNTTYPE_Revenue = "R";
	/** Set Account Type.
		@param AccountType Indicates the type of account
	*/
	public void setAccountType (String AccountType)
	{

		set_Value (COLUMNNAME_AccountType, AccountType);
	}

	/** Get Account Type.
		@return Indicates the type of account
	  */
	public String getAccountType()
	{
		return (String)get_Value(COLUMNNAME_AccountType);
	}

	/** BPartnerType AD_Reference_ID=200076 */
	public static final int BPARTNERTYPE_AD_Reference_ID=200076;
	/** Customer = C */
	public static final String BPARTNERTYPE_Customer = "C";
	/** Employee = E */
	public static final String BPARTNERTYPE_Employee = "E";
	/** Vendor = V */
	public static final String BPARTNERTYPE_Vendor = "V";
	/** Set Business Partner Type.
		@param BPartnerType Business Partner Type
	*/
	public void setBPartnerType (String BPartnerType)
	{

		set_Value (COLUMNNAME_BPartnerType, BPartnerType);
	}

	/** Get Business Partner Type.
		@return Business Partner Type	  */
	public String getBPartnerType()
	{
		return (String)get_Value(COLUMNNAME_BPartnerType);
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

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
	{
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_ID)
			.getPO(getC_Currency_ID(), get_TrxName());
	}

	/** Set Currency.
		@param C_Currency_ID The Currency for this record
	*/
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1)
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Element.
		@param C_ElementValue_ID Account Element
	*/
	public void setC_ElementValue_ID (int C_ElementValue_ID)
	{
		if (C_ElementValue_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_ElementValue_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
	}

	/** Get Account Element.
		@return Account Element
	  */
	public int getC_ElementValue_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_ElementValue_UU.
		@param C_ElementValue_UU C_ElementValue_UU
	*/
	public void setC_ElementValue_UU (String C_ElementValue_UU)
	{
		set_Value (COLUMNNAME_C_ElementValue_UU, C_ElementValue_UU);
	}

	/** Get C_ElementValue_UU.
		@return C_ElementValue_UU	  */
	public String getC_ElementValue_UU()
	{
		return (String)get_Value(COLUMNNAME_C_ElementValue_UU);
	}

	public org.compiere.model.I_C_Element getC_Element() throws RuntimeException
	{
		return (org.compiere.model.I_C_Element)MTable.get(getCtx(), org.compiere.model.I_C_Element.Table_ID)
			.getPO(getC_Element_ID(), get_TrxName());
	}

	/** Set Element.
		@param C_Element_ID Accounting Element
	*/
	public void setC_Element_ID (int C_Element_ID)
	{
		if (C_Element_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Element_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Element_ID, Integer.valueOf(C_Element_ID));
	}

	/** Get Element.
		@return Accounting Element
	  */
	public int getC_Element_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Element_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Bank Account.
		@param IsBankAccount Indicates if this is the Bank Account
	*/
	public void setIsBankAccount (boolean IsBankAccount)
	{
		set_Value (COLUMNNAME_IsBankAccount, Boolean.valueOf(IsBankAccount));
	}

	/** Get Bank Account.
		@return Indicates if this is the Bank Account
	  */
	public boolean isBankAccount()
	{
		Object oo = get_Value(COLUMNNAME_IsBankAccount);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Manage Business Partners.
		@param IsDetailBPartner Manage Business Partners
	*/
	public void setIsDetailBPartner (boolean IsDetailBPartner)
	{
		set_Value (COLUMNNAME_IsDetailBPartner, Boolean.valueOf(IsDetailBPartner));
	}

	/** Get Manage Business Partners.
		@return Manage Business Partners	  */
	public boolean isDetailBPartner()
	{
		Object oo = get_Value(COLUMNNAME_IsDetailBPartner);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Manage Products.
		@param IsDetailProduct Manage Products
	*/
	public void setIsDetailProduct (boolean IsDetailProduct)
	{
		set_Value (COLUMNNAME_IsDetailProduct, Boolean.valueOf(IsDetailProduct));
	}

	/** Get Manage Products.
		@return Manage Products	  */
	public boolean isDetailProduct()
	{
		Object oo = get_Value(COLUMNNAME_IsDetailProduct);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Document Controlled.
		@param IsDocControlled Control account - If an account is controlled by a document, you cannot post manually to it
	*/
	public void setIsDocControlled (boolean IsDocControlled)
	{
		set_Value (COLUMNNAME_IsDocControlled, Boolean.valueOf(IsDocControlled));
	}

	/** Get Document Controlled.
		@return Control account - If an account is controlled by a document, you cannot post manually to it
	  */
	public boolean isDocControlled()
	{
		Object oo = get_Value(COLUMNNAME_IsDocControlled);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Foreign Currency Account.
		@param IsForeignCurrency Balances in foreign currency accounts are held in the nominated currency
	*/
	public void setIsForeignCurrency (boolean IsForeignCurrency)
	{
		set_Value (COLUMNNAME_IsForeignCurrency, Boolean.valueOf(IsForeignCurrency));
	}

	/** Get Foreign Currency Account.
		@return Balances in foreign currency accounts are held in the nominated currency
	  */
	public boolean isForeignCurrency()
	{
		Object oo = get_Value(COLUMNNAME_IsForeignCurrency);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Summary Level.
		@param IsSummary This is a summary entity
	*/
	public void setIsSummary (boolean IsSummary)
	{
		set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
	}

	/** Get Summary Level.
		@return This is a summary entity
	  */
	public boolean isSummary()
	{
		Object oo = get_Value(COLUMNNAME_IsSummary);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Post Actual.
		@param PostActual Actual Values can be posted
	*/
	public void setPostActual (boolean PostActual)
	{
		set_Value (COLUMNNAME_PostActual, Boolean.valueOf(PostActual));
	}

	/** Get Post Actual.
		@return Actual Values can be posted
	  */
	public boolean isPostActual()
	{
		Object oo = get_Value(COLUMNNAME_PostActual);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Post Budget.
		@param PostBudget Budget values can be posted
	*/
	public void setPostBudget (boolean PostBudget)
	{
		set_Value (COLUMNNAME_PostBudget, Boolean.valueOf(PostBudget));
	}

	/** Get Post Budget.
		@return Budget values can be posted
	  */
	public boolean isPostBudget()
	{
		Object oo = get_Value(COLUMNNAME_PostBudget);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Post Encumbrance.
		@param PostEncumbrance Post commitments to this account
	*/
	public void setPostEncumbrance (boolean PostEncumbrance)
	{
		set_Value (COLUMNNAME_PostEncumbrance, Boolean.valueOf(PostEncumbrance));
	}

	/** Get Post Encumbrance.
		@return Post commitments to this account
	  */
	public boolean isPostEncumbrance()
	{
		Object oo = get_Value(COLUMNNAME_PostEncumbrance);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Post Statistical.
		@param PostStatistical Post statistical quantities to this account?
	*/
	public void setPostStatistical (boolean PostStatistical)
	{
		set_Value (COLUMNNAME_PostStatistical, Boolean.valueOf(PostStatistical));
	}

	/** Get Post Statistical.
		@return Post statistical quantities to this account?
	  */
	public boolean isPostStatistical()
	{
		Object oo = get_Value(COLUMNNAME_PostStatistical);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getValue());
    }
}