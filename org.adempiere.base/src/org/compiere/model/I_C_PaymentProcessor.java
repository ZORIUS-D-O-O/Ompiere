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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_PaymentProcessor
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_C_PaymentProcessor 
{

    /** TableName=C_PaymentProcessor */
    public static final String Table_Name = "C_PaymentProcessor";

    /** AD_Table_ID=398 */
    public static final int Table_ID = 398;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name AD_Sequence_ID */
    public static final String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";

	/** Set Sequence.
	  * Document Sequence
	  */
	public void setAD_Sequence_ID (int AD_Sequence_ID);

	/** Get Sequence.
	  * Document Sequence
	  */
	public int getAD_Sequence_ID();

	public org.compiere.model.I_AD_Sequence getAD_Sequence() throws RuntimeException;

    /** Column name AcceptAMEX */
    public static final String COLUMNNAME_AcceptAMEX = "AcceptAMEX";

	/** Set Accept AMEX.
	  * Accept American Express Card
	  */
	public void setAcceptAMEX (boolean AcceptAMEX);

	/** Get Accept AMEX.
	  * Accept American Express Card
	  */
	public boolean isAcceptAMEX();

    /** Column name AcceptATM */
    public static final String COLUMNNAME_AcceptATM = "AcceptATM";

	/** Set Accept ATM.
	  * Accept Bank ATM Card
	  */
	public void setAcceptATM (boolean AcceptATM);

	/** Get Accept ATM.
	  * Accept Bank ATM Card
	  */
	public boolean isAcceptATM();

    /** Column name AcceptCheck */
    public static final String COLUMNNAME_AcceptCheck = "AcceptCheck";

	/** Set Accept Electronic Check.
	  * Accept ECheck (Electronic Checks)
	  */
	public void setAcceptCheck (boolean AcceptCheck);

	/** Get Accept Electronic Check.
	  * Accept ECheck (Electronic Checks)
	  */
	public boolean isAcceptCheck();

    /** Column name AcceptCorporate */
    public static final String COLUMNNAME_AcceptCorporate = "AcceptCorporate";

	/** Set Accept Corporate.
	  * Accept Corporate Purchase Cards
	  */
	public void setAcceptCorporate (boolean AcceptCorporate);

	/** Get Accept Corporate.
	  * Accept Corporate Purchase Cards
	  */
	public boolean isAcceptCorporate();

    /** Column name AcceptDiners */
    public static final String COLUMNNAME_AcceptDiners = "AcceptDiners";

	/** Set Accept Diners.
	  * Accept Diner&#039;
s Club
	  */
	public void setAcceptDiners (boolean AcceptDiners);

	/** Get Accept Diners.
	  * Accept Diner&#039;
s Club
	  */
	public boolean isAcceptDiners();

    /** Column name AcceptDirectDebit */
    public static final String COLUMNNAME_AcceptDirectDebit = "AcceptDirectDebit";

	/** Set Accept Direct Debit.
	  * Accept Direct Debits (vendor initiated)
	  */
	public void setAcceptDirectDebit (boolean AcceptDirectDebit);

	/** Get Accept Direct Debit.
	  * Accept Direct Debits (vendor initiated)
	  */
	public boolean isAcceptDirectDebit();

    /** Column name AcceptDirectDeposit */
    public static final String COLUMNNAME_AcceptDirectDeposit = "AcceptDirectDeposit";

	/** Set Accept Direct Deposit.
	  * Accept Direct Deposit (payee initiated)
	  */
	public void setAcceptDirectDeposit (boolean AcceptDirectDeposit);

	/** Get Accept Direct Deposit.
	  * Accept Direct Deposit (payee initiated)
	  */
	public boolean isAcceptDirectDeposit();

    /** Column name AcceptDiscover */
    public static final String COLUMNNAME_AcceptDiscover = "AcceptDiscover";

	/** Set Accept Discover.
	  * Accept Discover Card
	  */
	public void setAcceptDiscover (boolean AcceptDiscover);

	/** Get Accept Discover.
	  * Accept Discover Card
	  */
	public boolean isAcceptDiscover();

    /** Column name AcceptMC */
    public static final String COLUMNNAME_AcceptMC = "AcceptMC";

	/** Set Accept MasterCard.
	  * Accept Master Card
	  */
	public void setAcceptMC (boolean AcceptMC);

	/** Get Accept MasterCard.
	  * Accept Master Card
	  */
	public boolean isAcceptMC();

    /** Column name AcceptVisa */
    public static final String COLUMNNAME_AcceptVisa = "AcceptVisa";

	/** Set Accept Visa.
	  * Accept Visa Cards
	  */
	public void setAcceptVisa (boolean AcceptVisa);

	/** Get Accept Visa.
	  * Accept Visa Cards
	  */
	public boolean isAcceptVisa();

    /** Column name C_BankAccount_ID */
    public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";

	/** Set Bank Account.
	  * Account at the Bank
	  */
	public void setC_BankAccount_ID (int C_BankAccount_ID);

	/** Get Bank Account.
	  * Account at the Bank
	  */
	public int getC_BankAccount_ID();

	public org.compiere.model.I_C_BankAccount getC_BankAccount() throws RuntimeException;

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name C_PaymentProcessor_ID */
    public static final String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";

	/** Set Payment Processor.
	  * Payment processor for electronic payments
	  */
	public void setC_PaymentProcessor_ID (int C_PaymentProcessor_ID);

	/** Get Payment Processor.
	  * Payment processor for electronic payments
	  */
	public int getC_PaymentProcessor_ID();

    /** Column name C_PaymentProcessor_UU */
    public static final String COLUMNNAME_C_PaymentProcessor_UU = "C_PaymentProcessor_UU";

	/** Set C_PaymentProcessor_UU	  */
	public void setC_PaymentProcessor_UU (String C_PaymentProcessor_UU);

	/** Get C_PaymentProcessor_UU	  */
	public String getC_PaymentProcessor_UU();

    /** Column name Commission */
    public static final String COLUMNNAME_Commission = "Commission";

	/** Set Commission %.
	  * Commission stated as a percentage
	  */
	public void setCommission (BigDecimal Commission);

	/** Get Commission %.
	  * Commission stated as a percentage
	  */
	public BigDecimal getCommission();

    /** Column name CostPerTrx */
    public static final String COLUMNNAME_CostPerTrx = "CostPerTrx";

	/** Set Cost per transaction.
	  * Fixed cost per transaction
	  */
	public void setCostPerTrx (BigDecimal CostPerTrx);

	/** Get Cost per transaction.
	  * Fixed cost per transaction
	  */
	public BigDecimal getCostPerTrx();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name HostAddress */
    public static final String COLUMNNAME_HostAddress = "HostAddress";

	/** Set Host Address.
	  * Host Address URL or DNS
	  */
	public void setHostAddress (String HostAddress);

	/** Get Host Address.
	  * Host Address URL or DNS
	  */
	public String getHostAddress();

    /** Column name HostPort */
    public static final String COLUMNNAME_HostPort = "HostPort";

	/** Set Host port.
	  * Host Communication Port
	  */
	public void setHostPort (int HostPort);

	/** Get Host port.
	  * Host Communication Port
	  */
	public int getHostPort();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name MinimumAmt */
    public static final String COLUMNNAME_MinimumAmt = "MinimumAmt";

	/** Set Minimum Amt.
	  * Minimum Amount in Document Currency
	  */
	public void setMinimumAmt (BigDecimal MinimumAmt);

	/** Get Minimum Amt.
	  * Minimum Amount in Document Currency
	  */
	public BigDecimal getMinimumAmt();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name PayProcessorClass */
    public static final String COLUMNNAME_PayProcessorClass = "PayProcessorClass";

	/** Set Payment Processor Class.
	  * Payment Processor Java Class
	  */
	public void setPayProcessorClass (String PayProcessorClass);

	/** Get Payment Processor Class.
	  * Payment Processor Java Class
	  */
	public String getPayProcessorClass();

    /** Column name ProxyAddress */
    public static final String COLUMNNAME_ProxyAddress = "ProxyAddress";

	/** Set Proxy address.
	  *  Address of your proxy server
	  */
	public void setProxyAddress (String ProxyAddress);

	/** Get Proxy address.
	  *  Address of your proxy server
	  */
	public String getProxyAddress();

    /** Column name ProxyLogon */
    public static final String COLUMNNAME_ProxyLogon = "ProxyLogon";

	/** Set Proxy logon.
	  * Logon of your proxy server
	  */
	public void setProxyLogon (String ProxyLogon);

	/** Get Proxy logon.
	  * Logon of your proxy server
	  */
	public String getProxyLogon();

    /** Column name ProxyPassword */
    public static final String COLUMNNAME_ProxyPassword = "ProxyPassword";

	/** Set Proxy password.
	  * Password of your proxy server
	  */
	public void setProxyPassword (String ProxyPassword);

	/** Get Proxy password.
	  * Password of your proxy server
	  */
	public String getProxyPassword();

    /** Column name ProxyPort */
    public static final String COLUMNNAME_ProxyPort = "ProxyPort";

	/** Set Proxy port.
	  * Port of your proxy server
	  */
	public void setProxyPort (int ProxyPort);

	/** Get Proxy port.
	  * Port of your proxy server
	  */
	public int getProxyPort();

    /** Column name RequireVV */
    public static final String COLUMNNAME_RequireVV = "RequireVV";

	/** Set Require Credit Card Verification Code.
	  * Require 3/4 digit Credit Verification Code
	  */
	public void setRequireVV (boolean RequireVV);

	/** Get Require Credit Card Verification Code.
	  * Require 3/4 digit Credit Verification Code
	  */
	public boolean isRequireVV();

    /** Column name TrxType */
    public static final String COLUMNNAME_TrxType = "TrxType";

	/** Set Transaction Type.
	  * Type of credit card transaction
	  */
	public void setTrxType (String TrxType);

	/** Get Transaction Type.
	  * Type of credit card transaction
	  */
	public String getTrxType();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
