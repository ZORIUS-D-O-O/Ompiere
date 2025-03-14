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

/** Generated Interface for C_Country
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_C_Country 
{

    /** TableName=C_Country */
    public static final String Table_Name = "C_Country";

    /** AD_Table_ID=170 */
    public static final int Table_ID = 170;

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

    /** Column name AD_Language */
    public static final String COLUMNNAME_AD_Language = "AD_Language";

	/** Set Language.
	  * Language for this entity
	  */
	public void setAD_Language (String AD_Language);

	/** Get Language.
	  * Language for this entity
	  */
	public String getAD_Language();

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

    /** Column name AllowCitiesOutOfList */
    public static final String COLUMNNAME_AllowCitiesOutOfList = "AllowCitiesOutOfList";

	/** Set Allow Cities out of List.
	  * A flag to allow cities, currently not in the list, to be entered
	  */
	public void setAllowCitiesOutOfList (boolean AllowCitiesOutOfList);

	/** Get Allow Cities out of List.
	  * A flag to allow cities, currently not in the list, to be entered
	  */
	public boolean isAllowCitiesOutOfList();

    /** Column name C_Country_ID */
    public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";

	/** Set Country.
	  * Country 
	  */
	public void setC_Country_ID (int C_Country_ID);

	/** Get Country.
	  * Country 
	  */
	public int getC_Country_ID();

    /** Column name C_Country_UU */
    public static final String COLUMNNAME_C_Country_UU = "C_Country_UU";

	/** Set C_Country_UU	  */
	public void setC_Country_UU (String C_Country_UU);

	/** Get C_Country_UU	  */
	public String getC_Country_UU();

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

    /** Column name CaptureSequence */
    public static final String COLUMNNAME_CaptureSequence = "CaptureSequence";

	/** Set Capture Sequence	  */
	public void setCaptureSequence (String CaptureSequence);

	/** Get Capture Sequence	  */
	public String getCaptureSequence();

    /** Column name CountryCode */
    public static final String COLUMNNAME_CountryCode = "CountryCode";

	/** Set ISO Country Code.
	  * Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1
	  */
	public void setCountryCode (String CountryCode);

	/** Get ISO Country Code.
	  * Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1
	  */
	public String getCountryCode();

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

    /** Column name DisplaySequence */
    public static final String COLUMNNAME_DisplaySequence = "DisplaySequence";

	/** Set Address Print Format.
	  * Format for printing this Address
	  */
	public void setDisplaySequence (String DisplaySequence);

	/** Get Address Print Format.
	  * Format for printing this Address
	  */
	public String getDisplaySequence();

    /** Column name DisplaySequenceLocal */
    public static final String COLUMNNAME_DisplaySequenceLocal = "DisplaySequenceLocal";

	/** Set Local Address Format.
	  * Format for printing this Address locally
	  */
	public void setDisplaySequenceLocal (String DisplaySequenceLocal);

	/** Get Local Address Format.
	  * Format for printing this Address locally
	  */
	public String getDisplaySequenceLocal();

    /** Column name ExpressionBankAccountNo */
    public static final String COLUMNNAME_ExpressionBankAccountNo = "ExpressionBankAccountNo";

	/** Set Bank Account No Format.
	  * Format of the Bank Account
	  */
	public void setExpressionBankAccountNo (String ExpressionBankAccountNo);

	/** Get Bank Account No Format.
	  * Format of the Bank Account
	  */
	public String getExpressionBankAccountNo();

    /** Column name ExpressionBankRoutingNo */
    public static final String COLUMNNAME_ExpressionBankRoutingNo = "ExpressionBankRoutingNo";

	/** Set Bank Routing No Format.
	  * Format of the Bank Routing Number
	  */
	public void setExpressionBankRoutingNo (String ExpressionBankRoutingNo);

	/** Get Bank Routing No Format.
	  * Format of the Bank Routing Number
	  */
	public String getExpressionBankRoutingNo();

    /** Column name ExpressionPhone */
    public static final String COLUMNNAME_ExpressionPhone = "ExpressionPhone";

	/** Set Phone Format.
	  * Format of the phone;
 Can contain fixed format elements, Variables: &quot;
_lLoOaAcCa09&quot;

	  */
	public void setExpressionPhone (String ExpressionPhone);

	/** Get Phone Format.
	  * Format of the phone;
 Can contain fixed format elements, Variables: &quot;
_lLoOaAcCa09&quot;

	  */
	public String getExpressionPhone();

    /** Column name ExpressionPostal */
    public static final String COLUMNNAME_ExpressionPostal = "ExpressionPostal";

	/** Set Postal Code Format.
	  * Format of the postal code;
 Can contain fixed format elements, Variables: &quot;
_lLoOaAcCa09&quot;

	  */
	public void setExpressionPostal (String ExpressionPostal);

	/** Get Postal Code Format.
	  * Format of the postal code;
 Can contain fixed format elements, Variables: &quot;
_lLoOaAcCa09&quot;

	  */
	public String getExpressionPostal();

    /** Column name ExpressionPostal_Add */
    public static final String COLUMNNAME_ExpressionPostal_Add = "ExpressionPostal_Add";

	/** Set Additional Postal Format.
	  * Format of the value;
 Can contain fixed format elements, Variables: &quot;
_lLoOaAcCa09&quot;

	  */
	public void setExpressionPostal_Add (String ExpressionPostal_Add);

	/** Get Additional Postal Format.
	  * Format of the value;
 Can contain fixed format elements, Variables: &quot;
_lLoOaAcCa09&quot;

	  */
	public String getExpressionPostal_Add();

    /** Column name HasPostal_Add */
    public static final String COLUMNNAME_HasPostal_Add = "HasPostal_Add";

	/** Set Additional Postal code.
	  * Has Additional Postal Code
	  */
	public void setHasPostal_Add (boolean HasPostal_Add);

	/** Get Additional Postal code.
	  * Has Additional Postal Code
	  */
	public boolean isHasPostal_Add();

    /** Column name HasRegion */
    public static final String COLUMNNAME_HasRegion = "HasRegion";

	/** Set Country has Region.
	  * Country contains Regions
	  */
	public void setHasRegion (boolean HasRegion);

	/** Get Country has Region.
	  * Country contains Regions
	  */
	public boolean isHasRegion();

    /** Column name ISOCountryCodeAlpha3 */
    public static final String COLUMNNAME_ISOCountryCodeAlpha3 = "ISOCountryCodeAlpha3";

	/** Set ISO Alpha-3 Code.
	  * ISO Alpha-3 country code - a three-letter code that represents a country name, which is usually more closely related to the country name
	  */
	public void setISOCountryCodeAlpha3 (String ISOCountryCodeAlpha3);

	/** Get ISO Alpha-3 Code.
	  * ISO Alpha-3 country code - a three-letter code that represents a country name, which is usually more closely related to the country name
	  */
	public String getISOCountryCodeAlpha3();

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

    /** Column name IsAddressLinesLocalReverse */
    public static final String COLUMNNAME_IsAddressLinesLocalReverse = "IsAddressLinesLocalReverse";

	/** Set Reverse Local Address Lines.
	  * Print Local Address in reverse Order
	  */
	public void setIsAddressLinesLocalReverse (boolean IsAddressLinesLocalReverse);

	/** Get Reverse Local Address Lines.
	  * Print Local Address in reverse Order
	  */
	public boolean isAddressLinesLocalReverse();

    /** Column name IsAddressLinesReverse */
    public static final String COLUMNNAME_IsAddressLinesReverse = "IsAddressLinesReverse";

	/** Set Reverse Address Lines.
	  * Print Address in reverse Order
	  */
	public void setIsAddressLinesReverse (boolean IsAddressLinesReverse);

	/** Get Reverse Address Lines.
	  * Print Address in reverse Order
	  */
	public boolean isAddressLinesReverse();

    /** Column name IsPostcodeLookup */
    public static final String COLUMNNAME_IsPostcodeLookup = "IsPostcodeLookup";

	/** Set Use Postcode Lookup.
	  * Does this country have a post code web service
	  */
	public void setIsPostcodeLookup (boolean IsPostcodeLookup);

	/** Get Use Postcode Lookup.
	  * Does this country have a post code web service
	  */
	public boolean isPostcodeLookup();

    /** Column name LookupClassName */
    public static final String COLUMNNAME_LookupClassName = "LookupClassName";

	/** Set Lookup ClassName.
	  * The class name of the postcode lookup plugin
	  */
	public void setLookupClassName (String LookupClassName);

	/** Get Lookup ClassName.
	  * The class name of the postcode lookup plugin
	  */
	public String getLookupClassName();

    /** Column name LookupClientID */
    public static final String COLUMNNAME_LookupClientID = "LookupClientID";

	/** Set Lookup Tenant ID.
	  * The Client ID or Login submitted to the Lookup URL
	  */
	public void setLookupClientID (String LookupClientID);

	/** Get Lookup Tenant ID.
	  * The Client ID or Login submitted to the Lookup URL
	  */
	public String getLookupClientID();

    /** Column name LookupPassword */
    public static final String COLUMNNAME_LookupPassword = "LookupPassword";

	/** Set Lookup Password.
	  * The password submitted to the Lookup URL
	  */
	public void setLookupPassword (String LookupPassword);

	/** Get Lookup Password.
	  * The password submitted to the Lookup URL
	  */
	public String getLookupPassword();

    /** Column name LookupUrl */
    public static final String COLUMNNAME_LookupUrl = "LookupUrl";

	/** Set Lookup URL.
	  * The URL of the web service that the plugin connects to in order to retrieve postcode data
	  */
	public void setLookupUrl (String LookupUrl);

	/** Get Lookup URL.
	  * The URL of the web service that the plugin connects to in order to retrieve postcode data
	  */
	public String getLookupUrl();

    /** Column name M49Code */
    public static final String COLUMNNAME_M49Code = "M49Code";

	/** Set M49 Code.
	  * Standard country codes for statistical use (M49) defined by the United Nations
	  */
	public void setM49Code (String M49Code);

	/** Get M49 Code.
	  * Standard country codes for statistical use (M49) defined by the United Nations
	  */
	public String getM49Code();

    /** Column name MediaSize */
    public static final String COLUMNNAME_MediaSize = "MediaSize";

	/** Set Media Size.
	  * Java Media Size
	  */
	public void setMediaSize (String MediaSize);

	/** Get Media Size.
	  * Java Media Size
	  */
	public String getMediaSize();

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

    /** Column name PlaceholderAddress1 */
    public static final String COLUMNNAME_PlaceholderAddress1 = "PlaceholderAddress1";

	/** Set Placeholder for Address 1	  */
	public void setPlaceholderAddress1 (String PlaceholderAddress1);

	/** Get Placeholder for Address 1	  */
	public String getPlaceholderAddress1();

    /** Column name PlaceholderAddress2 */
    public static final String COLUMNNAME_PlaceholderAddress2 = "PlaceholderAddress2";

	/** Set Placeholder for Address 2	  */
	public void setPlaceholderAddress2 (String PlaceholderAddress2);

	/** Get Placeholder for Address 2	  */
	public String getPlaceholderAddress2();

    /** Column name PlaceholderAddress3 */
    public static final String COLUMNNAME_PlaceholderAddress3 = "PlaceholderAddress3";

	/** Set Placeholder for Address 3	  */
	public void setPlaceholderAddress3 (String PlaceholderAddress3);

	/** Get Placeholder for Address 3	  */
	public String getPlaceholderAddress3();

    /** Column name PlaceholderAddress4 */
    public static final String COLUMNNAME_PlaceholderAddress4 = "PlaceholderAddress4";

	/** Set Placeholder for Address 4	  */
	public void setPlaceholderAddress4 (String PlaceholderAddress4);

	/** Get Placeholder for Address 4	  */
	public String getPlaceholderAddress4();

    /** Column name PlaceholderAddress5 */
    public static final String COLUMNNAME_PlaceholderAddress5 = "PlaceholderAddress5";

	/** Set Placeholder for Address 5	  */
	public void setPlaceholderAddress5 (String PlaceholderAddress5);

	/** Get Placeholder for Address 5	  */
	public String getPlaceholderAddress5();

    /** Column name PlaceholderCity */
    public static final String COLUMNNAME_PlaceholderCity = "PlaceholderCity";

	/** Set Placeholder for city	  */
	public void setPlaceholderCity (String PlaceholderCity);

	/** Get Placeholder for city	  */
	public String getPlaceholderCity();

    /** Column name PlaceholderComments */
    public static final String COLUMNNAME_PlaceholderComments = "PlaceholderComments";

	/** Set Placeholder for comments	  */
	public void setPlaceholderComments (String PlaceholderComments);

	/** Get Placeholder for comments	  */
	public String getPlaceholderComments();

    /** Column name PlaceholderPostal */
    public static final String COLUMNNAME_PlaceholderPostal = "PlaceholderPostal";

	/** Set Placeholder for postal	  */
	public void setPlaceholderPostal (String PlaceholderPostal);

	/** Get Placeholder for postal	  */
	public String getPlaceholderPostal();

    /** Column name PlaceholderPostal_Add */
    public static final String COLUMNNAME_PlaceholderPostal_Add = "PlaceholderPostal_Add";

	/** Set Placeholder for additional zip	  */
	public void setPlaceholderPostal_Add (String PlaceholderPostal_Add);

	/** Get Placeholder for additional zip	  */
	public String getPlaceholderPostal_Add();

    /** Column name RegionName */
    public static final String COLUMNNAME_RegionName = "RegionName";

	/** Set Region.
	  * Name of the Region
	  */
	public void setRegionName (String RegionName);

	/** Get Region.
	  * Name of the Region
	  */
	public String getRegionName();

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
