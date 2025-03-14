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

/** Generated Model for C_Location
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="C_Location")
public class X_C_Location extends PO implements I_C_Location, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_C_Location (Properties ctx, int C_Location_ID, String trxName)
    {
      super (ctx, C_Location_ID, trxName);
      /** if (C_Location_ID == 0)
        {
			setC_Country_ID (0);
			setC_Location_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_C_Location (Properties ctx, int C_Location_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Location_ID, trxName, virtualColumns);
      /** if (C_Location_ID == 0)
        {
			setC_Country_ID (0);
			setC_Location_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_C_Location (Properties ctx, String C_Location_UU, String trxName)
    {
      super (ctx, C_Location_UU, trxName);
      /** if (C_Location_UU == null)
        {
			setC_Country_ID (0);
			setC_Location_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_C_Location (Properties ctx, String C_Location_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_Location_UU, trxName, virtualColumns);
      /** if (C_Location_UU == null)
        {
			setC_Country_ID (0);
			setC_Location_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_Location (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org
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
      StringBuilder sb = new StringBuilder ("X_C_Location[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Address 1.
		@param Address1 Address line 1 for this location
	*/
	public void setAddress1 (String Address1)
	{
		set_Value (COLUMNNAME_Address1, Address1);
	}

	/** Get Address 1.
		@return Address line 1 for this location
	  */
	public String getAddress1()
	{
		return (String)get_Value(COLUMNNAME_Address1);
	}

	/** Set Address 2.
		@param Address2 Address line 2 for this location
	*/
	public void setAddress2 (String Address2)
	{
		set_Value (COLUMNNAME_Address2, Address2);
	}

	/** Get Address 2.
		@return Address line 2 for this location
	  */
	public String getAddress2()
	{
		return (String)get_Value(COLUMNNAME_Address2);
	}

	/** Set Address 3.
		@param Address3 Address Line 3 for the location
	*/
	public void setAddress3 (String Address3)
	{
		set_Value (COLUMNNAME_Address3, Address3);
	}

	/** Get Address 3.
		@return Address Line 3 for the location
	  */
	public String getAddress3()
	{
		return (String)get_Value(COLUMNNAME_Address3);
	}

	/** Set Address 4.
		@param Address4 Address Line 4 for the location
	*/
	public void setAddress4 (String Address4)
	{
		set_Value (COLUMNNAME_Address4, Address4);
	}

	/** Get Address 4.
		@return Address Line 4 for the location
	  */
	public String getAddress4()
	{
		return (String)get_Value(COLUMNNAME_Address4);
	}

	/** Set Address 5.
		@param Address5 Address Line 5 for the location
	*/
	public void setAddress5 (String Address5)
	{
		set_Value (COLUMNNAME_Address5, Address5);
	}

	/** Get Address 5.
		@return Address Line 5 for the location
	  */
	public String getAddress5()
	{
		return (String)get_Value(COLUMNNAME_Address5);
	}

	public org.compiere.model.I_C_AddressValidation getC_AddressValidation() throws RuntimeException
	{
		return (org.compiere.model.I_C_AddressValidation)MTable.get(getCtx(), org.compiere.model.I_C_AddressValidation.Table_ID)
			.getPO(getC_AddressValidation_ID(), get_TrxName());
	}

	/** Set Address Validation.
		@param C_AddressValidation_ID Address Validation
	*/
	public void setC_AddressValidation_ID (int C_AddressValidation_ID)
	{
		if (C_AddressValidation_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_AddressValidation_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_AddressValidation_ID, Integer.valueOf(C_AddressValidation_ID));
	}

	/** Get Address Validation.
		@return Address Validation	  */
	public int getC_AddressValidation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AddressValidation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_City getC_City() throws RuntimeException
	{
		return (org.compiere.model.I_C_City)MTable.get(getCtx(), org.compiere.model.I_C_City.Table_ID)
			.getPO(getC_City_ID(), get_TrxName());
	}

	/** Set City.
		@param C_City_ID City
	*/
	public void setC_City_ID (int C_City_ID)
	{
		if (C_City_ID < 1)
			set_Value (COLUMNNAME_C_City_ID, null);
		else
			set_Value (COLUMNNAME_C_City_ID, Integer.valueOf(C_City_ID));
	}

	/** Get City.
		@return City
	  */
	public int getC_City_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_City_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Country getC_Country() throws RuntimeException
	{
		return (org.compiere.model.I_C_Country)MTable.get(getCtx(), org.compiere.model.I_C_Country.Table_ID)
			.getPO(getC_Country_ID(), get_TrxName());
	}

	/** Set Country.
		@param C_Country_ID Country 
	*/
	public void setC_Country_ID (int C_Country_ID)
	{
		if (C_Country_ID < 1)
			set_Value (COLUMNNAME_C_Country_ID, null);
		else
			set_Value (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
	}

	/** Get Country.
		@return Country 
	  */
	public int getC_Country_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Address.
		@param C_Location_ID Location or Address
	*/
	public void setC_Location_ID (int C_Location_ID)
	{
		if (C_Location_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Location_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
	}

	/** Get Address.
		@return Location or Address
	  */
	public int getC_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_Location_UU.
		@param C_Location_UU C_Location_UU
	*/
	public void setC_Location_UU (String C_Location_UU)
	{
		set_Value (COLUMNNAME_C_Location_UU, C_Location_UU);
	}

	/** Get C_Location_UU.
		@return C_Location_UU	  */
	public String getC_Location_UU()
	{
		return (String)get_Value(COLUMNNAME_C_Location_UU);
	}

	public org.compiere.model.I_C_Region getC_Region() throws RuntimeException
	{
		return (org.compiere.model.I_C_Region)MTable.get(getCtx(), org.compiere.model.I_C_Region.Table_ID)
			.getPO(getC_Region_ID(), get_TrxName());
	}

	/** Set Region.
		@param C_Region_ID Identifies a geographical Region
	*/
	public void setC_Region_ID (int C_Region_ID)
	{
		if (C_Region_ID < 1)
			set_Value (COLUMNNAME_C_Region_ID, null);
		else
			set_Value (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
	}

	/** Get Region.
		@return Identifies a geographical Region
	  */
	public int getC_Region_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set City.
		@param City Identifies a City
	*/
	public void setCity (String City)
	{
		set_Value (COLUMNNAME_City, City);
	}

	/** Get City.
		@return Identifies a City
	  */
	public String getCity()
	{
		return (String)get_Value(COLUMNNAME_City);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getCity());
    }

	/** Set Comments.
		@param Comments Comments or additional information
	*/
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments()
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** Set Valid.
		@param IsValid Element is valid
	*/
	public void setIsValid (boolean IsValid)
	{
		set_ValueNoCheck (COLUMNNAME_IsValid, Boolean.valueOf(IsValid));
	}

	/** Get Valid.
		@return Element is valid
	  */
	public boolean isValid()
	{
		Object oo = get_Value(COLUMNNAME_IsValid);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set ZIP.
		@param Postal Postal code
	*/
	public void setPostal (String Postal)
	{
		set_Value (COLUMNNAME_Postal, Postal);
	}

	/** Get ZIP.
		@return Postal code
	  */
	public String getPostal()
	{
		return (String)get_Value(COLUMNNAME_Postal);
	}

	/** Set Additional Zip.
		@param Postal_Add Additional ZIP or Postal code
	*/
	public void setPostal_Add (String Postal_Add)
	{
		set_Value (COLUMNNAME_Postal_Add, Postal_Add);
	}

	/** Get Additional Zip.
		@return Additional ZIP or Postal code
	  */
	public String getPostal_Add()
	{
		return (String)get_Value(COLUMNNAME_Postal_Add);
	}

	/** Set Region.
		@param RegionName Name of the Region
	*/
	public void setRegionName (String RegionName)
	{
		set_Value (COLUMNNAME_RegionName, RegionName);
	}

	/** Get Region.
		@return Name of the Region
	  */
	public String getRegionName()
	{
		return (String)get_Value(COLUMNNAME_RegionName);
	}

	/** Set Result.
		@param Result Result of the action taken
	*/
	public void setResult (String Result)
	{
		set_ValueNoCheck (COLUMNNAME_Result, Result);
	}

	/** Get Result.
		@return Result of the action taken
	  */
	public String getResult()
	{
		return (String)get_Value(COLUMNNAME_Result);
	}

	/** Set Validate Address.
		@param ValidateAddress Validate Address
	*/
	public void setValidateAddress (String ValidateAddress)
	{
		set_Value (COLUMNNAME_ValidateAddress, ValidateAddress);
	}

	/** Get Validate Address.
		@return Validate Address	  */
	public String getValidateAddress()
	{
		return (String)get_Value(COLUMNNAME_ValidateAddress);
	}
}