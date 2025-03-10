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

/** Generated Interface for Test
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_Test 
{

    /** TableName=Test */
    public static final String Table_Name = "Test";

    /** AD_Table_ID=135 */
    public static final int Table_ID = 135;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

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

    /** Column name AD_Table_ID */
    public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

	/** Set Table.
	  * Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID);

	/** Get Table.
	  * Database Table information
	  */
	public int getAD_Table_ID();

	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException;

    /** Column name Account_Acct */
    public static final String COLUMNNAME_Account_Acct = "Account_Acct";

	/** Set Account_Acct	  */
	public void setAccount_Acct (int Account_Acct);

	/** Get Account_Acct	  */
	public int getAccount_Acct();

	public I_C_ValidCombination getAccount_A() throws RuntimeException;

    /** Column name BinaryData */
    public static final String COLUMNNAME_BinaryData = "BinaryData";

	/** Set Binary Data.
	  * Binary Data
	  */
	public void setBinaryData (byte[] BinaryData);

	/** Get Binary Data.
	  * Binary Data
	  */
	public byte[] getBinaryData();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner.
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner.
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

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

    /** Column name C_Location_ID */
    public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";

	/** Set Address.
	  * Location or Address
	  */
	public void setC_Location_ID (int C_Location_ID);

	/** Get Address.
	  * Location or Address
	  */
	public int getC_Location_ID();

	public I_C_Location getC_Location() throws RuntimeException;

    /** Column name C_Payment_ID */
    public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";

	/** Set Payment.
	  * Payment identifier
	  */
	public void setC_Payment_ID (int C_Payment_ID);

	/** Get Payment.
	  * Payment identifier
	  */
	public int getC_Payment_ID();

	public org.compiere.model.I_C_Payment getC_Payment() throws RuntimeException;

    /** Column name C_UOM_ID */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

	/** Set UOM.
	  * Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID);

	/** Get UOM.
	  * Unit of Measure
	  */
	public int getC_UOM_ID();

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException;

    /** Column name CharacterData */
    public static final String COLUMNNAME_CharacterData = "CharacterData";

	/** Set Character Data.
	  * Long Character Field
	  */
	public void setCharacterData (String CharacterData);

	/** Get Character Data.
	  * Long Character Field
	  */
	public String getCharacterData();

    /** Column name Color */
    public static final String COLUMNNAME_Color = "Color";

	/** Set Color	  */
	public void setColor (String Color);

	/** Get Color	  */
	public String getColor();

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

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

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

    /** Column name JsonData */
    public static final String COLUMNNAME_JsonData = "JsonData";

	/** Set JSON Data.
	  * The json field stores json data.
	  */
	public void setJsonData (String JsonData);

	/** Get JSON Data.
	  * The json field stores json data.
	  */
	public String getJsonData();

    /** Column name M_Locator_ID */
    public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

	/** Set Locator.
	  * Warehouse Locator
	  */
	public void setM_Locator_ID (int M_Locator_ID);

	/** Get Locator.
	  * Warehouse Locator
	  */
	public int getM_Locator_ID();

	public I_M_Locator getM_Locator() throws RuntimeException;

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

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

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name Record_ID */
    public static final String COLUMNNAME_Record_ID = "Record_ID";

	/** Set Record ID.
	  * Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID);

	/** Get Record ID.
	  * Direct internal record ID
	  */
	public int getRecord_ID();

    /** Column name Record_UU */
    public static final String COLUMNNAME_Record_UU = "Record_UU";

	/** Set Record UUID	  */
	public void setRecord_UU (String Record_UU);

	/** Get Record UUID	  */
	public String getRecord_UU();

    /** Column name T_Amount */
    public static final String COLUMNNAME_T_Amount = "T_Amount";

	/** Set Amount	  */
	public void setT_Amount (BigDecimal T_Amount);

	/** Get Amount	  */
	public BigDecimal getT_Amount();

    /** Column name T_Date */
    public static final String COLUMNNAME_T_Date = "T_Date";

	/** Set Date	  */
	public void setT_Date (Timestamp T_Date);

	/** Get Date	  */
	public Timestamp getT_Date();

    /** Column name T_DateTime */
    public static final String COLUMNNAME_T_DateTime = "T_DateTime";

	/** Set DateTime	  */
	public void setT_DateTime (Timestamp T_DateTime);

	/** Get DateTime	  */
	public Timestamp getT_DateTime();

    /** Column name T_Integer */
    public static final String COLUMNNAME_T_Integer = "T_Integer";

	/** Set Integer	  */
	public void setT_Integer (int T_Integer);

	/** Get Integer	  */
	public int getT_Integer();

    /** Column name T_Number */
    public static final String COLUMNNAME_T_Number = "T_Number";

	/** Set Number	  */
	public void setT_Number (BigDecimal T_Number);

	/** Get Number	  */
	public BigDecimal getT_Number();

    /** Column name T_Qty */
    public static final String COLUMNNAME_T_Qty = "T_Qty";

	/** Set Qty	  */
	public void setT_Qty (BigDecimal T_Qty);

	/** Get Qty	  */
	public BigDecimal getT_Qty();

    /** Column name T_Timestamp */
    public static final String COLUMNNAME_T_Timestamp = "T_Timestamp";

	/** Set Timestamp.
	  * Timestamp with time zone
	  */
	public void setT_Timestamp (Timestamp T_Timestamp);

	/** Get Timestamp.
	  * Timestamp with time zone
	  */
	public Timestamp getT_Timestamp();

    /** Column name TestVirtualQty */
    public static final String COLUMNNAME_TestVirtualQty = "TestVirtualQty";

	/** Set Virtual Quantity.
	  * Used only for testing purposes
	  */
	public void setTestVirtualQty (BigDecimal TestVirtualQty);

	/** Get Virtual Quantity.
	  * Used only for testing purposes
	  */
	public BigDecimal getTestVirtualQty();

    /** Column name Test_ID */
    public static final String COLUMNNAME_Test_ID = "Test_ID";

	/** Set Test ID	  */
	public void setTest_ID (int Test_ID);

	/** Get Test ID	  */
	public int getTest_ID();

    /** Column name Test_UU */
    public static final String COLUMNNAME_Test_UU = "Test_UU";

	/** Set Test_UU	  */
	public void setTest_UU (String Test_UU);

	/** Get Test_UU	  */
	public String getTest_UU();

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
