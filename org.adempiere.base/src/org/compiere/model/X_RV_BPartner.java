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

/** Generated Model for RV_BPartner
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="RV_BPartner")
public class X_RV_BPartner extends PO implements I_RV_BPartner, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_RV_BPartner (Properties ctx, int RV_BPartner_ID, String trxName)
    {
      super (ctx, RV_BPartner_ID, trxName);
      /** if (RV_BPartner_ID == 0)
        {
			setC_BP_Group_ID (0);
			setC_BPartner_ID (0);
			setC_BPartner_Location_ID (0);
			setC_Country_ID (0);
			setContactName (null);
			setCountryName (null);
			setIsCustomer (false);
			setIsEmployee (false);
			setIsOneTime (false);
			setIsProspect (false);
			setIsSalesRep (false);
			setIsSummary (false);
			setIsVendor (false);
			setLDAPUser (false);
			setName (null);
			setNotificationType (null);
			setSendEMail (false);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_RV_BPartner (Properties ctx, int RV_BPartner_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, RV_BPartner_ID, trxName, virtualColumns);
      /** if (RV_BPartner_ID == 0)
        {
			setC_BP_Group_ID (0);
			setC_BPartner_ID (0);
			setC_BPartner_Location_ID (0);
			setC_Country_ID (0);
			setContactName (null);
			setCountryName (null);
			setIsCustomer (false);
			setIsEmployee (false);
			setIsOneTime (false);
			setIsProspect (false);
			setIsSalesRep (false);
			setIsSummary (false);
			setIsVendor (false);
			setLDAPUser (false);
			setName (null);
			setNotificationType (null);
			setSendEMail (false);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_RV_BPartner (Properties ctx, String RV_BPartner_UU, String trxName)
    {
      super (ctx, RV_BPartner_UU, trxName);
      /** if (RV_BPartner_UU == null)
        {
			setC_BP_Group_ID (0);
			setC_BPartner_ID (0);
			setC_BPartner_Location_ID (0);
			setC_Country_ID (0);
			setContactName (null);
			setCountryName (null);
			setIsCustomer (false);
			setIsEmployee (false);
			setIsOneTime (false);
			setIsProspect (false);
			setIsSalesRep (false);
			setIsSummary (false);
			setIsVendor (false);
			setLDAPUser (false);
			setName (null);
			setNotificationType (null);
			setSendEMail (false);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_RV_BPartner (Properties ctx, String RV_BPartner_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, RV_BPartner_UU, trxName, virtualColumns);
      /** if (RV_BPartner_UU == null)
        {
			setC_BP_Group_ID (0);
			setC_BPartner_ID (0);
			setC_BPartner_Location_ID (0);
			setC_Country_ID (0);
			setContactName (null);
			setCountryName (null);
			setIsCustomer (false);
			setIsEmployee (false);
			setIsOneTime (false);
			setIsProspect (false);
			setIsSalesRep (false);
			setIsSummary (false);
			setIsVendor (false);
			setLDAPUser (false);
			setName (null);
			setNotificationType (null);
			setSendEMail (false);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_RV_BPartner (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_RV_BPartner[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** AD_Language AD_Reference_ID=106 */
	public static final int AD_LANGUAGE_AD_Reference_ID=106;
	/** Set Language.
		@param AD_Language Language for this entity
	*/
	public void setAD_Language (String AD_Language)
	{

		set_ValueNoCheck (COLUMNNAME_AD_Language, AD_Language);
	}

	/** Get Language.
		@return Language for this entity
	  */
	public String getAD_Language()
	{
		return (String)get_Value(COLUMNNAME_AD_Language);
	}

	/** Set Linked Organization.
		@param AD_OrgBP_ID The Business Partner is another Organization for explicit Inter-Org transactions
	*/
	public void setAD_OrgBP_ID (int AD_OrgBP_ID)
	{
		if (AD_OrgBP_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_OrgBP_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_OrgBP_ID, Integer.valueOf(AD_OrgBP_ID));
	}

	/** Get Linked Organization.
		@return The Business Partner is another Organization for explicit Inter-Org transactions
	  */
	public int getAD_OrgBP_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgBP_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Trx Organization.
		@param AD_OrgTrx_ID Performing or initiating organization
	*/
	public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
	{
		if (AD_OrgTrx_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_OrgTrx_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
	}

	/** Get Trx Organization.
		@return Performing or initiating organization
	  */
	public int getAD_OrgTrx_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_User_AD_Org_ID.
		@param AD_User_AD_Org_ID AD_User_AD_Org_ID
	*/
	public void setAD_User_AD_Org_ID (int AD_User_AD_Org_ID)
	{
		if (AD_User_AD_Org_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_User_AD_Org_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_User_AD_Org_ID, Integer.valueOf(AD_User_AD_Org_ID));
	}

	/** Get AD_User_AD_Org_ID.
		@return AD_User_AD_Org_ID	  */
	public int getAD_User_AD_Org_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_AD_Org_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getAD_User_C_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getAD_User_C_BPartner_ID(), get_TrxName());
	}

	/** Set AD_User_C_BPartner_ID.
		@param AD_User_C_BPartner_ID AD_User_C_BPartner_ID
	*/
	public void setAD_User_C_BPartner_ID (int AD_User_C_BPartner_ID)
	{
		if (AD_User_C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_User_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_User_C_BPartner_ID, Integer.valueOf(AD_User_C_BPartner_ID));
	}

	/** Get AD_User_C_BPartner_ID.
		@return AD_User_C_BPartner_ID	  */
	public int getAD_User_C_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner_Location getAD_User_C_BPartner_Location() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_ID)
			.getPO(getAD_User_C_BPartner_Location_ID(), get_TrxName());
	}

	/** Set AD_User_C_BPartner_Location_ID.
		@param AD_User_C_BPartner_Location_ID AD_User_C_BPartner_Location_ID
	*/
	public void setAD_User_C_BPartner_Location_ID (int AD_User_C_BPartner_Location_ID)
	{
		if (AD_User_C_BPartner_Location_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_User_C_BPartner_Location_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_User_C_BPartner_Location_ID, Integer.valueOf(AD_User_C_BPartner_Location_ID));
	}

	/** Get AD_User_C_BPartner_Location_ID.
		@return AD_User_C_BPartner_Location_ID	  */
	public int getAD_User_C_BPartner_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_C_BPartner_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getAD_User_Create() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_CreatedBy(), get_TrxName());
	}

	/** Set ad_user_createdby.
		@param AD_User_CreatedBy ad_user_createdby
	*/
	public void setAD_User_CreatedBy (int AD_User_CreatedBy)
	{
		set_ValueNoCheck (COLUMNNAME_AD_User_CreatedBy, Integer.valueOf(AD_User_CreatedBy));
	}

	/** Get ad_user_createdby.
		@return ad_user_createdby	  */
	public int getAD_User_CreatedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_CreatedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set User/Contact.
		@param AD_User_ID User within the system - Internal or Business Partner Contact
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getAD_User_Update() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_UpdatedBy(), get_TrxName());
	}

	/** Set ad_user_updatedby.
		@param AD_User_UpdatedBy ad_user_updatedby
	*/
	public void setAD_User_UpdatedBy (int AD_User_UpdatedBy)
	{
		set_ValueNoCheck (COLUMNNAME_AD_User_UpdatedBy, Integer.valueOf(AD_User_UpdatedBy));
	}

	/** Get ad_user_updatedby.
		@return ad_user_updatedby	  */
	public int getAD_User_UpdatedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_UpdatedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Acquisition Cost.
		@param AcqusitionCost The cost of gaining the prospect as a customer
	*/
	public void setAcqusitionCost (BigDecimal AcqusitionCost)
	{
		set_ValueNoCheck (COLUMNNAME_AcqusitionCost, AcqusitionCost);
	}

	/** Get Acquisition Cost.
		@return The cost of gaining the prospect as a customer
	  */
	public BigDecimal getAcqusitionCost()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AcqusitionCost);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Actual Life Time Value.
		@param ActualLifeTimeValue Actual Life Time Revenue
	*/
	public void setActualLifeTimeValue (BigDecimal ActualLifeTimeValue)
	{
		set_ValueNoCheck (COLUMNNAME_ActualLifeTimeValue, ActualLifeTimeValue);
	}

	/** Get Actual Life Time Value.
		@return Actual Life Time Revenue
	  */
	public BigDecimal getActualLifeTimeValue()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ActualLifeTimeValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Address 1.
		@param Address1 Address line 1 for this location
	*/
	public void setAddress1 (String Address1)
	{
		set_ValueNoCheck (COLUMNNAME_Address1, Address1);
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
		set_ValueNoCheck (COLUMNNAME_Address2, Address2);
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
		set_ValueNoCheck (COLUMNNAME_Address3, Address3);
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
		set_ValueNoCheck (COLUMNNAME_Address4, Address4);
	}

	/** Get Address 4.
		@return Address Line 4 for the location
	  */
	public String getAddress4()
	{
		return (String)get_Value(COLUMNNAME_Address4);
	}

	public org.compiere.model.I_C_Greeting getBPContactGreet() throws RuntimeException
	{
		return (org.compiere.model.I_C_Greeting)MTable.get(getCtx(), org.compiere.model.I_C_Greeting.Table_ID)
			.getPO(getBPContactGreeting(), get_TrxName());
	}

	/** Set BP Contact Greeting.
		@param BPContactGreeting Greeting for Business Partner Contact
	*/
	public void setBPContactGreeting (int BPContactGreeting)
	{
		set_ValueNoCheck (COLUMNNAME_BPContactGreeting, Integer.valueOf(BPContactGreeting));
	}

	/** Get BP Contact Greeting.
		@return Greeting for Business Partner Contact
	  */
	public int getBPContactGreeting()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_BPContactGreeting);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getBPartner_Parent() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getBPartner_Parent_ID(), get_TrxName());
	}

	/** Set Partner Parent.
		@param BPartner_Parent_ID Business Partner Parent
	*/
	public void setBPartner_Parent_ID (int BPartner_Parent_ID)
	{
		if (BPartner_Parent_ID < 1)
			set_ValueNoCheck (COLUMNNAME_BPartner_Parent_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_BPartner_Parent_ID, Integer.valueOf(BPartner_Parent_ID));
	}

	/** Get Partner Parent.
		@return Business Partner Parent
	  */
	public int getBPartner_Parent_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_BPartner_Parent_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Birthday.
		@param Birthday Birthday or Anniversary day
	*/
	public void setBirthday (Timestamp Birthday)
	{
		set_ValueNoCheck (COLUMNNAME_Birthday, Birthday);
	}

	/** Get Birthday.
		@return Birthday or Anniversary day
	  */
	public Timestamp getBirthday()
	{
		return (Timestamp)get_Value(COLUMNNAME_Birthday);
	}

	public org.eevolution.model.I_C_TaxGroup getC_BP_C_TaxGroup() throws RuntimeException
	{
		return (org.eevolution.model.I_C_TaxGroup)MTable.get(getCtx(), org.eevolution.model.I_C_TaxGroup.Table_ID)
			.getPO(getC_BP_C_TaxGroup_ID(), get_TrxName());
	}

	/** Set c_bp_c_taxgroup_id.
		@param C_BP_C_TaxGroup_ID c_bp_c_taxgroup_id
	*/
	public void setC_BP_C_TaxGroup_ID (int C_BP_C_TaxGroup_ID)
	{
		if (C_BP_C_TaxGroup_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BP_C_TaxGroup_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BP_C_TaxGroup_ID, Integer.valueOf(C_BP_C_TaxGroup_ID));
	}

	/** Get c_bp_c_taxgroup_id.
		@return c_bp_c_taxgroup_id	  */
	public int getC_BP_C_TaxGroup_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_C_TaxGroup_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BP_Group getC_BP_Group() throws RuntimeException
	{
		return (org.compiere.model.I_C_BP_Group)MTable.get(getCtx(), org.compiere.model.I_C_BP_Group.Table_ID)
			.getPO(getC_BP_Group_ID(), get_TrxName());
	}

	/** Set Business Partner Group.
		@param C_BP_Group_ID Business Partner Group
	*/
	public void setC_BP_Group_ID (int C_BP_Group_ID)
	{
		if (C_BP_Group_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BP_Group_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
	}

	/** Get Business Partner Group.
		@return Business Partner Group
	  */
	public int getC_BP_Group_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set c_bp_location_ad_org_id.
		@param C_BP_Location_AD_Org_ID c_bp_location_ad_org_id
	*/
	public void setC_BP_Location_AD_Org_ID (int C_BP_Location_AD_Org_ID)
	{
		if (C_BP_Location_AD_Org_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BP_Location_AD_Org_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BP_Location_AD_Org_ID, Integer.valueOf(C_BP_Location_AD_Org_ID));
	}

	/** Get c_bp_location_ad_org_id.
		@return c_bp_location_ad_org_id	  */
	public int getC_BP_Location_AD_Org_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Location_AD_Org_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BP_Location_C_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BP_Location_C_BPartner_ID(), get_TrxName());
	}

	/** Set c_bpartner_location_c_bpartner_id.
		@param C_BP_Location_C_BPartner_ID c_bpartner_location_c_bpartner_id
	*/
	public void setC_BP_Location_C_BPartner_ID (int C_BP_Location_C_BPartner_ID)
	{
		if (C_BP_Location_C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BP_Location_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BP_Location_C_BPartner_ID, Integer.valueOf(C_BP_Location_C_BPartner_ID));
	}

	/** Get c_bpartner_location_c_bpartner_id.
		@return c_bpartner_location_c_bpartner_id	  */
	public int getC_BP_Location_C_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Location_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Location getC_BP_Location_C_Location() throws RuntimeException
	{
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_ID)
			.getPO(getC_BP_Location_C_Location_ID(), get_TrxName());
	}

	/** Set c_bp_location_c_location_id.
		@param C_BP_Location_C_Location_ID c_bp_location_c_location_id
	*/
	public void setC_BP_Location_C_Location_ID (int C_BP_Location_C_Location_ID)
	{
		if (C_BP_Location_C_Location_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BP_Location_C_Location_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BP_Location_C_Location_ID, Integer.valueOf(C_BP_Location_C_Location_ID));
	}

	/** Get c_bp_location_c_location_id.
		@return c_bp_location_c_location_id	  */
	public int getC_BP_Location_C_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Location_C_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getC_BP_Location_Create() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getC_BP_Location_CreatedBy(), get_TrxName());
	}

	/** Set c_bp_location_createdby.
		@param C_BP_Location_CreatedBy c_bp_location_createdby
	*/
	public void setC_BP_Location_CreatedBy (int C_BP_Location_CreatedBy)
	{
		set_ValueNoCheck (COLUMNNAME_C_BP_Location_CreatedBy, Integer.valueOf(C_BP_Location_CreatedBy));
	}

	/** Get c_bp_location_createdby.
		@return c_bp_location_createdby	  */
	public int getC_BP_Location_CreatedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Location_CreatedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_SalesRegion getC_BP_Location_SalesRegion() throws RuntimeException
	{
		return (org.compiere.model.I_C_SalesRegion)MTable.get(getCtx(), org.compiere.model.I_C_SalesRegion.Table_ID)
			.getPO(getC_BP_Location_SalesRegion_ID(), get_TrxName());
	}

	/** Set c_bp_location_salesregion_id.
		@param C_BP_Location_SalesRegion_ID c_bp_location_salesregion_id
	*/
	public void setC_BP_Location_SalesRegion_ID (int C_BP_Location_SalesRegion_ID)
	{
		if (C_BP_Location_SalesRegion_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BP_Location_SalesRegion_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BP_Location_SalesRegion_ID, Integer.valueOf(C_BP_Location_SalesRegion_ID));
	}

	/** Get c_bp_location_salesregion_id.
		@return c_bp_location_salesregion_id	  */
	public int getC_BP_Location_SalesRegion_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Location_SalesRegion_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getC_BP_Location_Update() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getC_BP_Location_UpdatedBy(), get_TrxName());
	}

	/** Set c_bp_location_updatedby.
		@param C_BP_Location_UpdatedBy c_bp_location_updatedby
	*/
	public void setC_BP_Location_UpdatedBy (int C_BP_Location_UpdatedBy)
	{
		set_ValueNoCheck (COLUMNNAME_C_BP_Location_UpdatedBy, Integer.valueOf(C_BP_Location_UpdatedBy));
	}

	/** Get c_bp_location_updatedby.
		@return c_bp_location_updatedby	  */
	public int getC_BP_Location_UpdatedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Location_UpdatedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set c_bp_logo_id.
		@param C_BP_Logo_ID c_bp_logo_id
	*/
	public void setC_BP_Logo_ID (int C_BP_Logo_ID)
	{
		if (C_BP_Logo_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BP_Logo_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BP_Logo_ID, Integer.valueOf(C_BP_Logo_ID));
	}

	/** Get c_bp_logo_id.
		@return c_bp_logo_id	  */
	public int getC_BP_Logo_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Logo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_ID)
			.getPO(getC_BPartner_Location_ID(), get_TrxName());
	}

	/** Set Partner Location.
		@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner
	*/
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		if (C_BPartner_Location_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_Location_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
	}

	/** Get Partner Location.
		@return Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
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
			set_ValueNoCheck (COLUMNNAME_C_City_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_City_ID, Integer.valueOf(C_City_ID));
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

	public org.compiere.model.I_C_Currency getC_Country_C_Currency() throws RuntimeException
	{
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_ID)
			.getPO(getC_Country_C_Currency_ID(), get_TrxName());
	}

	/** Set c_country_c_currency_id.
		@param C_Country_C_Currency_ID c_country_c_currency_id
	*/
	public void setC_Country_C_Currency_ID (int C_Country_C_Currency_ID)
	{
		if (C_Country_C_Currency_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Country_C_Currency_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Country_C_Currency_ID, Integer.valueOf(C_Country_C_Currency_ID));
	}

	/** Get c_country_c_currency_id.
		@return c_country_c_currency_id	  */
	public int getC_Country_C_Currency_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_C_Currency_ID);
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
			set_ValueNoCheck (COLUMNNAME_C_Country_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
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

	public org.compiere.model.I_C_Dunning getC_Dunning() throws RuntimeException
	{
		return (org.compiere.model.I_C_Dunning)MTable.get(getCtx(), org.compiere.model.I_C_Dunning.Table_ID)
			.getPO(getC_Dunning_ID(), get_TrxName());
	}

	/** Set Dunning.
		@param C_Dunning_ID Dunning Rules for overdue invoices
	*/
	public void setC_Dunning_ID (int C_Dunning_ID)
	{
		if (C_Dunning_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Dunning_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Dunning_ID, Integer.valueOf(C_Dunning_ID));
	}

	/** Get Dunning.
		@return Dunning Rules for overdue invoices
	  */
	public int getC_Dunning_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Dunning_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Greeting getC_Greeting() throws RuntimeException
	{
		return (org.compiere.model.I_C_Greeting)MTable.get(getCtx(), org.compiere.model.I_C_Greeting.Table_ID)
			.getPO(getC_Greeting_ID(), get_TrxName());
	}

	/** Set Greeting.
		@param C_Greeting_ID Greeting to print on correspondence
	*/
	public void setC_Greeting_ID (int C_Greeting_ID)
	{
		if (C_Greeting_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Greeting_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Greeting_ID, Integer.valueOf(C_Greeting_ID));
	}

	/** Get Greeting.
		@return Greeting to print on correspondence
	  */
	public int getC_Greeting_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Greeting_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_InvoiceSchedule getC_InvoiceSchedule() throws RuntimeException
	{
		return (org.compiere.model.I_C_InvoiceSchedule)MTable.get(getCtx(), org.compiere.model.I_C_InvoiceSchedule.Table_ID)
			.getPO(getC_InvoiceSchedule_ID(), get_TrxName());
	}

	/** Set Invoice Schedule.
		@param C_InvoiceSchedule_ID Schedule for generating Invoices
	*/
	public void setC_InvoiceSchedule_ID (int C_InvoiceSchedule_ID)
	{
		if (C_InvoiceSchedule_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_InvoiceSchedule_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_InvoiceSchedule_ID, Integer.valueOf(C_InvoiceSchedule_ID));
	}

	/** Get Invoice Schedule.
		@return Schedule for generating Invoices
	  */
	public int getC_InvoiceSchedule_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_InvoiceSchedule_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set c_location_ad_org_id.
		@param C_Location_AD_Org_ID c_location_ad_org_id
	*/
	public void setC_Location_AD_Org_ID (int C_Location_AD_Org_ID)
	{
		if (C_Location_AD_Org_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Location_AD_Org_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Location_AD_Org_ID, Integer.valueOf(C_Location_AD_Org_ID));
	}

	/** Get c_location_ad_org_id.
		@return c_location_ad_org_id	  */
	public int getC_Location_AD_Org_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_AD_Org_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getC_Location_Create() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getC_Location_CreatedBy(), get_TrxName());
	}

	/** Set c_location_createdby.
		@param C_Location_CreatedBy c_location_createdby
	*/
	public void setC_Location_CreatedBy (int C_Location_CreatedBy)
	{
		set_ValueNoCheck (COLUMNNAME_C_Location_CreatedBy, Integer.valueOf(C_Location_CreatedBy));
	}

	/** Get c_location_createdby.
		@return c_location_createdby	  */
	public int getC_Location_CreatedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_CreatedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Location getC_Location() throws RuntimeException
	{
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_ID)
			.getPO(getC_Location_ID(), get_TrxName());
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

	public org.compiere.model.I_AD_User getC_Location_Update() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getC_Location_UpdatedBy(), get_TrxName());
	}

	/** Set c_location_updatedby.
		@param C_Location_UpdatedBy c_location_updatedby
	*/
	public void setC_Location_UpdatedBy (int C_Location_UpdatedBy)
	{
		set_ValueNoCheck (COLUMNNAME_C_Location_UpdatedBy, Integer.valueOf(C_Location_UpdatedBy));
	}

	/** Get c_location_updatedby.
		@return c_location_updatedby	  */
	public int getC_Location_UpdatedBy()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_UpdatedBy);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException
	{
		return (org.compiere.model.I_C_PaymentTerm)MTable.get(getCtx(), org.compiere.model.I_C_PaymentTerm.Table_ID)
			.getPO(getC_PaymentTerm_ID(), get_TrxName());
	}

	/** Set Payment Term.
		@param C_PaymentTerm_ID The terms of Payment (timing, discount)
	*/
	public void setC_PaymentTerm_ID (int C_PaymentTerm_ID)
	{
		if (C_PaymentTerm_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_PaymentTerm_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_PaymentTerm_ID, Integer.valueOf(C_PaymentTerm_ID));
	}

	/** Get Payment Term.
		@return The terms of Payment (timing, discount)
	  */
	public int getC_PaymentTerm_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_PaymentTerm_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set c_region_ad_org_id.
		@param C_Region_AD_Org_ID c_region_ad_org_id
	*/
	public void setC_Region_AD_Org_ID (int C_Region_AD_Org_ID)
	{
		if (C_Region_AD_Org_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Region_AD_Org_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Region_AD_Org_ID, Integer.valueOf(C_Region_AD_Org_ID));
	}

	/** Get c_region_ad_org_id.
		@return c_region_ad_org_id	  */
	public int getC_Region_AD_Org_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_AD_Org_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set c_region_c_country_id.
		@param C_Region_C_Country_ID c_region_c_country_id
	*/
	public void setC_Region_C_Country_ID (int C_Region_C_Country_ID)
	{
		if (C_Region_C_Country_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Region_C_Country_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Region_C_Country_ID, Integer.valueOf(C_Region_C_Country_ID));
	}

	/** Get c_region_c_country_id.
		@return c_region_c_country_id	  */
	public int getC_Region_C_Country_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_C_Country_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
			set_ValueNoCheck (COLUMNNAME_C_Region_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
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
		set_ValueNoCheck (COLUMNNAME_City, City);
	}

	/** Get City.
		@return Identifies a City
	  */
	public String getCity()
	{
		return (String)get_Value(COLUMNNAME_City);
	}

	/** Set Comments.
		@param Comments Comments or additional information
	*/
	public void setComments (String Comments)
	{
		set_ValueNoCheck (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments()
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** Set Contact Description.
		@param ContactDescription Description of Contact
	*/
	public void setContactDescription (String ContactDescription)
	{
		set_ValueNoCheck (COLUMNNAME_ContactDescription, ContactDescription);
	}

	/** Get Contact Description.
		@return Description of Contact
	  */
	public String getContactDescription()
	{
		return (String)get_Value(COLUMNNAME_ContactDescription);
	}

	/** Set Contact Name.
		@param ContactName Business Partner Contact Name
	*/
	public void setContactName (String ContactName)
	{
		set_ValueNoCheck (COLUMNNAME_ContactName, ContactName);
	}

	/** Get Contact Name.
		@return Business Partner Contact Name
	  */
	public String getContactName()
	{
		return (String)get_Value(COLUMNNAME_ContactName);
	}

	/** Set ISO Country Code.
		@param CountryCode Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
	*/
	public void setCountryCode (String CountryCode)
	{
		set_ValueNoCheck (COLUMNNAME_CountryCode, CountryCode);
	}

	/** Get ISO Country Code.
		@return Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
	  */
	public String getCountryCode()
	{
		return (String)get_Value(COLUMNNAME_CountryCode);
	}

	/** Set Country.
		@param CountryName Country Name
	*/
	public void setCountryName (String CountryName)
	{
		set_ValueNoCheck (COLUMNNAME_CountryName, CountryName);
	}

	/** Get Country.
		@return Country Name
	  */
	public String getCountryName()
	{
		return (String)get_Value(COLUMNNAME_CountryName);
	}

	/** Set D-U-N-S.
		@param DUNS Dun &amp; Bradstreet Number
	*/
	public void setDUNS (String DUNS)
	{
		set_ValueNoCheck (COLUMNNAME_DUNS, DUNS);
	}

	/** Get D-U-N-S.
		@return Dun &amp; Bradstreet Number
	  */
	public String getDUNS()
	{
		return (String)get_Value(COLUMNNAME_DUNS);
	}

	/** DeliveryRule AD_Reference_ID=151 */
	public static final int DELIVERYRULE_AD_Reference_ID=151;
	/** Availability = A */
	public static final String DELIVERYRULE_Availability = "A";
	/** Force = F */
	public static final String DELIVERYRULE_Force = "F";
	/** Complete Line = L */
	public static final String DELIVERYRULE_CompleteLine = "L";
	/** Manual = M */
	public static final String DELIVERYRULE_Manual = "M";
	/** Complete Order = O */
	public static final String DELIVERYRULE_CompleteOrder = "O";
	/** After Payment = R */
	public static final String DELIVERYRULE_AfterPayment = "R";
	/** Set Delivery Rule.
		@param DeliveryRule Defines the timing of Delivery
	*/
	public void setDeliveryRule (String DeliveryRule)
	{

		set_ValueNoCheck (COLUMNNAME_DeliveryRule, DeliveryRule);
	}

	/** Get Delivery Rule.
		@return Defines the timing of Delivery
	  */
	public String getDeliveryRule()
	{
		return (String)get_Value(COLUMNNAME_DeliveryRule);
	}

	/** DeliveryViaRule AD_Reference_ID=152 */
	public static final int DELIVERYVIARULE_AD_Reference_ID=152;
	/** Delivery = D */
	public static final String DELIVERYVIARULE_Delivery = "D";
	/** Pickup = P */
	public static final String DELIVERYVIARULE_Pickup = "P";
	/** Shipper = S */
	public static final String DELIVERYVIARULE_Shipper = "S";
	/** Set Delivery Via.
		@param DeliveryViaRule How the order will be delivered
	*/
	public void setDeliveryViaRule (String DeliveryViaRule)
	{

		set_ValueNoCheck (COLUMNNAME_DeliveryViaRule, DeliveryViaRule);
	}

	/** Get Delivery Via.
		@return How the order will be delivered
	  */
	public String getDeliveryViaRule()
	{
		return (String)get_Value(COLUMNNAME_DeliveryViaRule);
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_ValueNoCheck (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Document Copies.
		@param DocumentCopies Number of copies to be printed
	*/
	public void setDocumentCopies (int DocumentCopies)
	{
		set_ValueNoCheck (COLUMNNAME_DocumentCopies, Integer.valueOf(DocumentCopies));
	}

	/** Get Document Copies.
		@return Number of copies to be printed
	  */
	public int getDocumentCopies()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DocumentCopies);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set EMail Address.
		@param EMail Electronic Mail Address
	*/
	public void setEMail (String EMail)
	{
		set_ValueNoCheck (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail()
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set EMail User ID.
		@param EMailUser User Name (ID) in the Mail System
	*/
	public void setEMailUser (String EMailUser)
	{
		set_ValueNoCheck (COLUMNNAME_EMailUser, EMailUser);
	}

	/** Get EMail User ID.
		@return User Name (ID) in the Mail System
	  */
	public String getEMailUser()
	{
		return (String)get_Value(COLUMNNAME_EMailUser);
	}

	/** Set Verification Info.
		@param EMailVerify Verification information of EMail Address
	*/
	public void setEMailVerify (String EMailVerify)
	{
		set_ValueNoCheck (COLUMNNAME_EMailVerify, EMailVerify);
	}

	/** Get Verification Info.
		@return Verification information of EMail Address
	  */
	public String getEMailVerify()
	{
		return (String)get_Value(COLUMNNAME_EMailVerify);
	}

	/** Set EMail Verify.
		@param EMailVerifyDate Date Email was verified
	*/
	public void setEMailVerifyDate (Timestamp EMailVerifyDate)
	{
		set_ValueNoCheck (COLUMNNAME_EMailVerifyDate, EMailVerifyDate);
	}

	/** Get EMail Verify.
		@return Date Email was verified
	  */
	public Timestamp getEMailVerifyDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_EMailVerifyDate);
	}

	/** Set Fax.
		@param Fax Facsimile number
	*/
	public void setFax (String Fax)
	{
		set_ValueNoCheck (COLUMNNAME_Fax, Fax);
	}

	/** Get Fax.
		@return Facsimile number
	  */
	public String getFax()
	{
		return (String)get_Value(COLUMNNAME_Fax);
	}

	/** Set First Sale.
		@param FirstSale Date of First Sale
	*/
	public void setFirstSale (Timestamp FirstSale)
	{
		set_ValueNoCheck (COLUMNNAME_FirstSale, FirstSale);
	}

	/** Get First Sale.
		@return Date of First Sale
	  */
	public Timestamp getFirstSale()
	{
		return (Timestamp)get_Value(COLUMNNAME_FirstSale);
	}

	/** Set Flat Discount %.
		@param FlatDiscount Flat discount percentage 
	*/
	public void setFlatDiscount (BigDecimal FlatDiscount)
	{
		set_ValueNoCheck (COLUMNNAME_FlatDiscount, FlatDiscount);
	}

	/** Get Flat Discount %.
		@return Flat discount percentage 
	  */
	public BigDecimal getFlatDiscount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FlatDiscount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** FreightCostRule AD_Reference_ID=153 */
	public static final int FREIGHTCOSTRULE_AD_Reference_ID=153;
	/** Calculated = C */
	public static final String FREIGHTCOSTRULE_Calculated = "C";
	/** Fix price = F */
	public static final String FREIGHTCOSTRULE_FixPrice = "F";
	/** Freight included = I */
	public static final String FREIGHTCOSTRULE_FreightIncluded = "I";
	/** Line = L */
	public static final String FREIGHTCOSTRULE_Line = "L";
	/** Customer Account = U */
	public static final String FREIGHTCOSTRULE_CustomerAccount = "U";
	/** Set Freight Cost Rule.
		@param FreightCostRule Method for charging Freight
	*/
	public void setFreightCostRule (String FreightCostRule)
	{

		set_ValueNoCheck (COLUMNNAME_FreightCostRule, FreightCostRule);
	}

	/** Get Freight Cost Rule.
		@return Method for charging Freight
	  */
	public String getFreightCostRule()
	{
		return (String)get_Value(COLUMNNAME_FreightCostRule);
	}

	/** InvoiceRule AD_Reference_ID=150 */
	public static final int INVOICERULE_AD_Reference_ID=150;
	/** After Delivery = D */
	public static final String INVOICERULE_AfterDelivery = "D";
	/** Immediate = I */
	public static final String INVOICERULE_Immediate = "I";
	/** After Order delivered = O */
	public static final String INVOICERULE_AfterOrderDelivered = "O";
	/** Customer Schedule after Delivery = S */
	public static final String INVOICERULE_CustomerScheduleAfterDelivery = "S";
	/** Set Invoice Rule.
		@param InvoiceRule Frequency and method of invoicing 
	*/
	public void setInvoiceRule (String InvoiceRule)
	{

		set_ValueNoCheck (COLUMNNAME_InvoiceRule, InvoiceRule);
	}

	/** Get Invoice Rule.
		@return Frequency and method of invoicing 
	  */
	public String getInvoiceRule()
	{
		return (String)get_Value(COLUMNNAME_InvoiceRule);
	}

	public org.compiere.model.I_AD_PrintFormat getInvoice_PrintFormat() throws RuntimeException
	{
		return (org.compiere.model.I_AD_PrintFormat)MTable.get(getCtx(), org.compiere.model.I_AD_PrintFormat.Table_ID)
			.getPO(getInvoice_PrintFormat_ID(), get_TrxName());
	}

	/** Set Invoice Print Format.
		@param Invoice_PrintFormat_ID Print Format for printing Invoices
	*/
	public void setInvoice_PrintFormat_ID (int Invoice_PrintFormat_ID)
	{
		if (Invoice_PrintFormat_ID < 1)
			set_ValueNoCheck (COLUMNNAME_Invoice_PrintFormat_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_Invoice_PrintFormat_ID, Integer.valueOf(Invoice_PrintFormat_ID));
	}

	/** Get Invoice Print Format.
		@return Print Format for printing Invoices
	  */
	public int getInvoice_PrintFormat_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Invoice_PrintFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Customer.
		@param IsCustomer Indicates if this Business Partner is a Customer
	*/
	public void setIsCustomer (boolean IsCustomer)
	{
		set_ValueNoCheck (COLUMNNAME_IsCustomer, Boolean.valueOf(IsCustomer));
	}

	/** Get Customer.
		@return Indicates if this Business Partner is a Customer
	  */
	public boolean isCustomer()
	{
		Object oo = get_Value(COLUMNNAME_IsCustomer);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Default.
		@param IsDefault Default value
	*/
	public void setIsDefault (boolean IsDefault)
	{
		set_ValueNoCheck (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
	}

	/** Get Default.
		@return Default value
	  */
	public boolean isDefault()
	{
		Object oo = get_Value(COLUMNNAME_IsDefault);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Discount Printed.
		@param IsDiscountPrinted Print Discount on Invoice and Order
	*/
	public void setIsDiscountPrinted (boolean IsDiscountPrinted)
	{
		set_ValueNoCheck (COLUMNNAME_IsDiscountPrinted, Boolean.valueOf(IsDiscountPrinted));
	}

	/** Get Discount Printed.
		@return Print Discount on Invoice and Order
	  */
	public boolean isDiscountPrinted()
	{
		Object oo = get_Value(COLUMNNAME_IsDiscountPrinted);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Employee.
		@param IsEmployee Indicates if  this Business Partner is an employee
	*/
	public void setIsEmployee (boolean IsEmployee)
	{
		set_ValueNoCheck (COLUMNNAME_IsEmployee, Boolean.valueOf(IsEmployee));
	}

	/** Get Employee.
		@return Indicates if  this Business Partner is an employee
	  */
	public boolean isEmployee()
	{
		Object oo = get_Value(COLUMNNAME_IsEmployee);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set One time transaction.
		@param IsOneTime One time transaction
	*/
	public void setIsOneTime (boolean IsOneTime)
	{
		set_ValueNoCheck (COLUMNNAME_IsOneTime, Boolean.valueOf(IsOneTime));
	}

	/** Get One time transaction.
		@return One time transaction	  */
	public boolean isOneTime()
	{
		Object oo = get_Value(COLUMNNAME_IsOneTime);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Prospect.
		@param IsProspect Indicates this is a Prospect
	*/
	public void setIsProspect (boolean IsProspect)
	{
		set_ValueNoCheck (COLUMNNAME_IsProspect, Boolean.valueOf(IsProspect));
	}

	/** Get Prospect.
		@return Indicates this is a Prospect
	  */
	public boolean isProspect()
	{
		Object oo = get_Value(COLUMNNAME_IsProspect);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sales Representative.
		@param IsSalesRep Indicates if  the business partner is a sales representative or company agent
	*/
	public void setIsSalesRep (boolean IsSalesRep)
	{
		set_ValueNoCheck (COLUMNNAME_IsSalesRep, Boolean.valueOf(IsSalesRep));
	}

	/** Get Sales Representative.
		@return Indicates if  the business partner is a sales representative or company agent
	  */
	public boolean isSalesRep()
	{
		Object oo = get_Value(COLUMNNAME_IsSalesRep);
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
		set_ValueNoCheck (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
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

	/** Set SO Tax exempt.
		@param IsTaxExempt Business partner is exempt from tax on sales
	*/
	public void setIsTaxExempt (boolean IsTaxExempt)
	{
		set_ValueNoCheck (COLUMNNAME_IsTaxExempt, Boolean.valueOf(IsTaxExempt));
	}

	/** Get SO Tax exempt.
		@return Business partner is exempt from tax on sales
	  */
	public boolean isTaxExempt()
	{
		Object oo = get_Value(COLUMNNAME_IsTaxExempt);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Vendor.
		@param IsVendor Indicates if this Business Partner is a Vendor
	*/
	public void setIsVendor (boolean IsVendor)
	{
		set_ValueNoCheck (COLUMNNAME_IsVendor, Boolean.valueOf(IsVendor));
	}

	/** Get Vendor.
		@return Indicates if this Business Partner is a Vendor
	  */
	public boolean isVendor()
	{
		Object oo = get_Value(COLUMNNAME_IsVendor);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set LDAP User Name.
		@param LDAPUser User Name used for authorization via LDAP (directory) services
	*/
	public void setLDAPUser (boolean LDAPUser)
	{
		set_ValueNoCheck (COLUMNNAME_LDAPUser, Boolean.valueOf(LDAPUser));
	}

	/** Get LDAP User Name.
		@return User Name used for authorization via LDAP (directory) services
	  */
	public boolean isLDAPUser()
	{
		Object oo = get_Value(COLUMNNAME_LDAPUser);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Last Contact.
		@param LastContact Date this individual was last contacted
	*/
	public void setLastContact (Timestamp LastContact)
	{
		set_ValueNoCheck (COLUMNNAME_LastContact, LastContact);
	}

	/** Get Last Contact.
		@return Date this individual was last contacted
	  */
	public Timestamp getLastContact()
	{
		return (Timestamp)get_Value(COLUMNNAME_LastContact);
	}

	/** Set Last Result.
		@param LastResult Result of last contact
	*/
	public void setLastResult (String LastResult)
	{
		set_ValueNoCheck (COLUMNNAME_LastResult, LastResult);
	}

	/** Get Last Result.
		@return Result of last contact
	  */
	public String getLastResult()
	{
		return (String)get_Value(COLUMNNAME_LastResult);
	}

	public org.compiere.model.I_M_DiscountSchema getM_DiscountSchema() throws RuntimeException
	{
		return (org.compiere.model.I_M_DiscountSchema)MTable.get(getCtx(), org.compiere.model.I_M_DiscountSchema.Table_ID)
			.getPO(getM_DiscountSchema_ID(), get_TrxName());
	}

	/** Set Discount Schema.
		@param M_DiscountSchema_ID Schema to calculate the trade discount percentage
	*/
	public void setM_DiscountSchema_ID (int M_DiscountSchema_ID)
	{
		if (M_DiscountSchema_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_DiscountSchema_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_DiscountSchema_ID, Integer.valueOf(M_DiscountSchema_ID));
	}

	/** Get Discount Schema.
		@return Schema to calculate the trade discount percentage
	  */
	public int getM_DiscountSchema_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_DiscountSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_PriceList getM_PriceList() throws RuntimeException
	{
		return (org.compiere.model.I_M_PriceList)MTable.get(getCtx(), org.compiere.model.I_M_PriceList.Table_ID)
			.getPO(getM_PriceList_ID(), get_TrxName());
	}

	/** Set Price List.
		@param M_PriceList_ID Unique identifier of a Price List
	*/
	public void setM_PriceList_ID (int M_PriceList_ID)
	{
		if (M_PriceList_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_PriceList_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
	}

	/** Get Price List.
		@return Unique identifier of a Price List
	  */
	public int getM_PriceList_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NAICS/SIC.
		@param NAICS Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html
	*/
	public void setNAICS (String NAICS)
	{
		set_ValueNoCheck (COLUMNNAME_NAICS, NAICS);
	}

	/** Get NAICS/SIC.
		@return Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html
	  */
	public String getNAICS()
	{
		return (String)get_Value(COLUMNNAME_NAICS);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_ValueNoCheck (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Name 2.
		@param Name2 Additional Name
	*/
	public void setName2 (String Name2)
	{
		set_ValueNoCheck (COLUMNNAME_Name2, Name2);
	}

	/** Get Name 2.
		@return Additional Name
	  */
	public String getName2()
	{
		return (String)get_Value(COLUMNNAME_Name2);
	}

	/** NotificationType AD_Reference_ID=344 */
	public static final int NOTIFICATIONTYPE_AD_Reference_ID=344;
	/** EMail+Notice = B */
	public static final String NOTIFICATIONTYPE_EMailPlusNotice = "B";
	/** EMail = E */
	public static final String NOTIFICATIONTYPE_EMail = "E";
	/** Notice = N */
	public static final String NOTIFICATIONTYPE_Notice = "N";
	/** None = X */
	public static final String NOTIFICATIONTYPE_None = "X";
	/** Set Notification Type.
		@param NotificationType Type of Notifications
	*/
	public void setNotificationType (String NotificationType)
	{

		set_ValueNoCheck (COLUMNNAME_NotificationType, NotificationType);
	}

	/** Get Notification Type.
		@return Type of Notifications
	  */
	public String getNotificationType()
	{
		return (String)get_Value(COLUMNNAME_NotificationType);
	}

	/** Set Employees.
		@param NumberEmployees Number of employees
	*/
	public void setNumberEmployees (int NumberEmployees)
	{
		set_ValueNoCheck (COLUMNNAME_NumberEmployees, Integer.valueOf(NumberEmployees));
	}

	/** Get Employees.
		@return Number of employees
	  */
	public int getNumberEmployees()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NumberEmployees);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Order Reference.
		@param POReference Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	*/
	public void setPOReference (String POReference)
	{
		set_ValueNoCheck (COLUMNNAME_POReference, POReference);
	}

	/** Get Order Reference.
		@return Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	  */
	public String getPOReference()
	{
		return (String)get_Value(COLUMNNAME_POReference);
	}

	public org.compiere.model.I_M_DiscountSchema getPO_DiscountSchema() throws RuntimeException
	{
		return (org.compiere.model.I_M_DiscountSchema)MTable.get(getCtx(), org.compiere.model.I_M_DiscountSchema.Table_ID)
			.getPO(getPO_DiscountSchema_ID(), get_TrxName());
	}

	/** Set PO Discount Schema.
		@param PO_DiscountSchema_ID Schema to calculate the purchase trade discount percentage
	*/
	public void setPO_DiscountSchema_ID (int PO_DiscountSchema_ID)
	{
		if (PO_DiscountSchema_ID < 1)
			set_ValueNoCheck (COLUMNNAME_PO_DiscountSchema_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_PO_DiscountSchema_ID, Integer.valueOf(PO_DiscountSchema_ID));
	}

	/** Get PO Discount Schema.
		@return Schema to calculate the purchase trade discount percentage
	  */
	public int getPO_DiscountSchema_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PO_DiscountSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_PaymentTerm getPO_PaymentTerm() throws RuntimeException
	{
		return (org.compiere.model.I_C_PaymentTerm)MTable.get(getCtx(), org.compiere.model.I_C_PaymentTerm.Table_ID)
			.getPO(getPO_PaymentTerm_ID(), get_TrxName());
	}

	/** Set PO Payment Term.
		@param PO_PaymentTerm_ID Payment rules for a purchase order
	*/
	public void setPO_PaymentTerm_ID (int PO_PaymentTerm_ID)
	{
		if (PO_PaymentTerm_ID < 1)
			set_ValueNoCheck (COLUMNNAME_PO_PaymentTerm_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_PO_PaymentTerm_ID, Integer.valueOf(PO_PaymentTerm_ID));
	}

	/** Get PO Payment Term.
		@return Payment rules for a purchase order
	  */
	public int getPO_PaymentTerm_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PO_PaymentTerm_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_PriceList getPO_PriceList() throws RuntimeException
	{
		return (org.compiere.model.I_M_PriceList)MTable.get(getCtx(), org.compiere.model.I_M_PriceList.Table_ID)
			.getPO(getPO_PriceList_ID(), get_TrxName());
	}

	/** Set Purchase Price List.
		@param PO_PriceList_ID Price List used by this Business Partner
	*/
	public void setPO_PriceList_ID (int PO_PriceList_ID)
	{
		if (PO_PriceList_ID < 1)
			set_ValueNoCheck (COLUMNNAME_PO_PriceList_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_PO_PriceList_ID, Integer.valueOf(PO_PriceList_ID));
	}

	/** Get Purchase Price List.
		@return Price List used by this Business Partner
	  */
	public int getPO_PriceList_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PO_PriceList_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** PaymentRule AD_Reference_ID=195 */
	public static final int PAYMENTRULE_AD_Reference_ID=195;
	/** Cash = B */
	public static final String PAYMENTRULE_Cash = "B";
	/** Direct Debit = D */
	public static final String PAYMENTRULE_DirectDebit = "D";
	/** Credit Card = K */
	public static final String PAYMENTRULE_CreditCard = "K";
	/** Mixed POS Payment = M */
	public static final String PAYMENTRULE_MixedPOSPayment = "M";
	/** On Credit = P */
	public static final String PAYMENTRULE_OnCredit = "P";
	/** Check = S */
	public static final String PAYMENTRULE_Check = "S";
	/** Direct Deposit = T */
	public static final String PAYMENTRULE_DirectDeposit = "T";
	/** Set Payment Rule.
		@param PaymentRule How you pay the invoice
	*/
	public void setPaymentRule (String PaymentRule)
	{

		set_ValueNoCheck (COLUMNNAME_PaymentRule, PaymentRule);
	}

	/** Get Payment Rule.
		@return How you pay the invoice
	  */
	public String getPaymentRule()
	{
		return (String)get_Value(COLUMNNAME_PaymentRule);
	}

	/** PaymentRulePO AD_Reference_ID=195 */
	public static final int PAYMENTRULEPO_AD_Reference_ID=195;
	/** Cash = B */
	public static final String PAYMENTRULEPO_Cash = "B";
	/** Direct Debit = D */
	public static final String PAYMENTRULEPO_DirectDebit = "D";
	/** Credit Card = K */
	public static final String PAYMENTRULEPO_CreditCard = "K";
	/** Mixed POS Payment = M */
	public static final String PAYMENTRULEPO_MixedPOSPayment = "M";
	/** On Credit = P */
	public static final String PAYMENTRULEPO_OnCredit = "P";
	/** Check = S */
	public static final String PAYMENTRULEPO_Check = "S";
	/** Direct Deposit = T */
	public static final String PAYMENTRULEPO_DirectDeposit = "T";
	/** Set Payment Rule.
		@param PaymentRulePO Purchase payment option
	*/
	public void setPaymentRulePO (String PaymentRulePO)
	{

		set_ValueNoCheck (COLUMNNAME_PaymentRulePO, PaymentRulePO);
	}

	/** Get Payment Rule.
		@return Purchase payment option
	  */
	public String getPaymentRulePO()
	{
		return (String)get_Value(COLUMNNAME_PaymentRulePO);
	}

	/** Set Phone.
		@param Phone Identifies a telephone number
	*/
	public void setPhone (String Phone)
	{
		set_ValueNoCheck (COLUMNNAME_Phone, Phone);
	}

	/** Get Phone.
		@return Identifies a telephone number
	  */
	public String getPhone()
	{
		return (String)get_Value(COLUMNNAME_Phone);
	}

	/** Set 2nd Phone.
		@param Phone2 Identifies an alternate telephone number.
	*/
	public void setPhone2 (String Phone2)
	{
		set_ValueNoCheck (COLUMNNAME_Phone2, Phone2);
	}

	/** Get 2nd Phone.
		@return Identifies an alternate telephone number.
	  */
	public String getPhone2()
	{
		return (String)get_Value(COLUMNNAME_Phone2);
	}

	/** Set ZIP.
		@param Postal Postal code
	*/
	public void setPostal (String Postal)
	{
		set_ValueNoCheck (COLUMNNAME_Postal, Postal);
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
		set_ValueNoCheck (COLUMNNAME_Postal_Add, Postal_Add);
	}

	/** Get Additional Zip.
		@return Additional ZIP or Postal code
	  */
	public String getPostal_Add()
	{
		return (String)get_Value(COLUMNNAME_Postal_Add);
	}

	/** Set Potential Life Time Value.
		@param PotentialLifeTimeValue Total Revenue expected
	*/
	public void setPotentialLifeTimeValue (BigDecimal PotentialLifeTimeValue)
	{
		set_ValueNoCheck (COLUMNNAME_PotentialLifeTimeValue, PotentialLifeTimeValue);
	}

	/** Get Potential Life Time Value.
		@return Total Revenue expected
	  */
	public BigDecimal getPotentialLifeTimeValue()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PotentialLifeTimeValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Rating.
		@param Rating Classification or Importance
	*/
	public void setRating (String Rating)
	{
		set_ValueNoCheck (COLUMNNAME_Rating, Rating);
	}

	/** Get Rating.
		@return Classification or Importance
	  */
	public String getRating()
	{
		return (String)get_Value(COLUMNNAME_Rating);
	}

	/** Set Reference No.
		@param ReferenceNo Your customer or vendor number at the Business Partner&#039;s site
	*/
	public void setReferenceNo (String ReferenceNo)
	{
		set_ValueNoCheck (COLUMNNAME_ReferenceNo, ReferenceNo);
	}

	/** Get Reference No.
		@return Your customer or vendor number at the Business Partner&#039;s site
	  */
	public String getReferenceNo()
	{
		return (String)get_Value(COLUMNNAME_ReferenceNo);
	}

	/** Set Region.
		@param RegionName Name of the Region
	*/
	public void setRegionName (String RegionName)
	{
		set_ValueNoCheck (COLUMNNAME_RegionName, RegionName);
	}

	/** Get Region.
		@return Name of the Region
	  */
	public String getRegionName()
	{
		return (String)get_Value(COLUMNNAME_RegionName);
	}

	/** SOCreditStatus AD_Reference_ID=289 */
	public static final int SOCREDITSTATUS_AD_Reference_ID=289;
	/** Credit Hold = H */
	public static final String SOCREDITSTATUS_CreditHold = "H";
	/** Credit OK = O */
	public static final String SOCREDITSTATUS_CreditOK = "O";
	/** Credit Stop = S */
	public static final String SOCREDITSTATUS_CreditStop = "S";
	/** Credit Watch = W */
	public static final String SOCREDITSTATUS_CreditWatch = "W";
	/** No Credit Check = X */
	public static final String SOCREDITSTATUS_NoCreditCheck = "X";
	/** Set Credit Status.
		@param SOCreditStatus Business Partner Credit Status
	*/
	public void setSOCreditStatus (String SOCreditStatus)
	{

		set_ValueNoCheck (COLUMNNAME_SOCreditStatus, SOCreditStatus);
	}

	/** Get Credit Status.
		@return Business Partner Credit Status
	  */
	public String getSOCreditStatus()
	{
		return (String)get_Value(COLUMNNAME_SOCreditStatus);
	}

	/** Set Credit Available.
		@param SO_CreditAvailable Available Credit based on Credit Limit (not Total Open Balance) and Credit Used
	*/
	public void setSO_CreditAvailable (BigDecimal SO_CreditAvailable)
	{
		set_ValueNoCheck (COLUMNNAME_SO_CreditAvailable, SO_CreditAvailable);
	}

	/** Get Credit Available.
		@return Available Credit based on Credit Limit (not Total Open Balance) and Credit Used
	  */
	public BigDecimal getSO_CreditAvailable()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SO_CreditAvailable);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Credit Limit.
		@param SO_CreditLimit Total outstanding invoice amounts allowed
	*/
	public void setSO_CreditLimit (BigDecimal SO_CreditLimit)
	{
		set_ValueNoCheck (COLUMNNAME_SO_CreditLimit, SO_CreditLimit);
	}

	/** Get Credit Limit.
		@return Total outstanding invoice amounts allowed
	  */
	public BigDecimal getSO_CreditLimit()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SO_CreditLimit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Credit Used.
		@param SO_CreditUsed Current open balance
	*/
	public void setSO_CreditUsed (BigDecimal SO_CreditUsed)
	{
		set_ValueNoCheck (COLUMNNAME_SO_CreditUsed, SO_CreditUsed);
	}

	/** Get Credit Used.
		@return Current open balance
	  */
	public BigDecimal getSO_CreditUsed()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SO_CreditUsed);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Order Description.
		@param SO_Description Description to be used on orders
	*/
	public void setSO_Description (String SO_Description)
	{
		set_ValueNoCheck (COLUMNNAME_SO_Description, SO_Description);
	}

	/** Get Order Description.
		@return Description to be used on orders
	  */
	public String getSO_Description()
	{
		return (String)get_Value(COLUMNNAME_SO_Description);
	}

	public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getSalesRep_ID(), get_TrxName());
	}

	/** Set Sales Representative.
		@param SalesRep_ID Sales Representative or Company Agent
	*/
	public void setSalesRep_ID (int SalesRep_ID)
	{
		if (SalesRep_ID < 1)
			set_ValueNoCheck (COLUMNNAME_SalesRep_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
	}

	/** Get Sales Representative.
		@return Sales Representative or Company Agent
	  */
	public int getSalesRep_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Sales Volume in 1.000.
		@param SalesVolume Total Volume of Sales in Thousands of Currency
	*/
	public void setSalesVolume (BigDecimal SalesVolume)
	{
		set_ValueNoCheck (COLUMNNAME_SalesVolume, SalesVolume);
	}

	/** Get Sales Volume in 1.000.
		@return Total Volume of Sales in Thousands of Currency
	  */
	public BigDecimal getSalesVolume()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SalesVolume);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Send EMail.
		@param SendEMail Enable sending Document EMail
	*/
	public void setSendEMail (boolean SendEMail)
	{
		set_ValueNoCheck (COLUMNNAME_SendEMail, Boolean.valueOf(SendEMail));
	}

	/** Get Send EMail.
		@return Enable sending Document EMail
	  */
	public boolean isSendEMail()
	{
		Object oo = get_Value(COLUMNNAME_SendEMail);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Share.
		@param ShareOfCustomer Share of Customer&#039;s business as a percentage
	*/
	public void setShareOfCustomer (int ShareOfCustomer)
	{
		set_ValueNoCheck (COLUMNNAME_ShareOfCustomer, Integer.valueOf(ShareOfCustomer));
	}

	/** Get Share.
		@return Share of Customer&#039;s business as a percentage
	  */
	public int getShareOfCustomer()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ShareOfCustomer);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Min Shelf Life %.
		@param ShelfLifeMinPct Minimum Shelf Life in percent based on Product Instance Guarantee Date
	*/
	public void setShelfLifeMinPct (int ShelfLifeMinPct)
	{
		set_ValueNoCheck (COLUMNNAME_ShelfLifeMinPct, Integer.valueOf(ShelfLifeMinPct));
	}

	/** Get Min Shelf Life %.
		@return Minimum Shelf Life in percent based on Product Instance Guarantee Date
	  */
	public int getShelfLifeMinPct()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ShelfLifeMinPct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getSupervisor() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getSupervisor_ID(), get_TrxName());
	}

	/** Set Supervisor.
		@param Supervisor_ID Supervisor for this user/organization - used for escalation and approval
	*/
	public void setSupervisor_ID (int Supervisor_ID)
	{
		if (Supervisor_ID < 1)
			set_ValueNoCheck (COLUMNNAME_Supervisor_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_Supervisor_ID, Integer.valueOf(Supervisor_ID));
	}

	/** Get Supervisor.
		@return Supervisor for this user/organization - used for escalation and approval
	  */
	public int getSupervisor_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Supervisor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Tax ID.
		@param TaxID Tax Identification
	*/
	public void setTaxID (String TaxID)
	{
		set_ValueNoCheck (COLUMNNAME_TaxID, TaxID);
	}

	/** Get Tax ID.
		@return Tax Identification
	  */
	public String getTaxID()
	{
		return (String)get_Value(COLUMNNAME_TaxID);
	}

	/** Set Title.
		@param Title Name this entity is referred to as
	*/
	public void setTitle (String Title)
	{
		set_ValueNoCheck (COLUMNNAME_Title, Title);
	}

	/** Get Title.
		@return Name this entity is referred to as
	  */
	public String getTitle()
	{
		return (String)get_Value(COLUMNNAME_Title);
	}

	/** Set Open Balance.
		@param TotalOpenBalance Total Open Balance Amount in primary Accounting Currency
	*/
	public void setTotalOpenBalance (BigDecimal TotalOpenBalance)
	{
		set_ValueNoCheck (COLUMNNAME_TotalOpenBalance, TotalOpenBalance);
	}

	/** Get Open Balance.
		@return Total Open Balance Amount in primary Accounting Currency
	  */
	public BigDecimal getTotalOpenBalance()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalOpenBalance);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set URL.
		@param URL Full URL address - e.g. http://www.idempiere.org
	*/
	public void setURL (String URL)
	{
		set_ValueNoCheck (COLUMNNAME_URL, URL);
	}

	/** Get URL.
		@return Full URL address - e.g. http://www.idempiere.org
	  */
	public String getURL()
	{
		return (String)get_Value(COLUMNNAME_URL);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_ValueNoCheck (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set ad_user_created.
		@param ad_user_created ad_user_created
	*/
	public void setad_user_created (Timestamp ad_user_created)
	{
		set_ValueNoCheck (COLUMNNAME_ad_user_created, ad_user_created);
	}

	/** Get ad_user_created.
		@return ad_user_created	  */
	public Timestamp getad_user_created()
	{
		return (Timestamp)get_Value(COLUMNNAME_ad_user_created);
	}

	/** Set ad_user_isactive.
		@param ad_user_isactive ad_user_isactive
	*/
	public void setad_user_isactive (boolean ad_user_isactive)
	{
		set_ValueNoCheck (COLUMNNAME_ad_user_isactive, Boolean.valueOf(ad_user_isactive));
	}

	/** Get ad_user_isactive.
		@return ad_user_isactive	  */
	public boolean isad_user_isactive()
	{
		Object oo = get_Value(COLUMNNAME_ad_user_isactive);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set ad_user_updated.
		@param ad_user_updated ad_user_updated
	*/
	public void setad_user_updated (Timestamp ad_user_updated)
	{
		set_ValueNoCheck (COLUMNNAME_ad_user_updated, ad_user_updated);
	}

	/** Get ad_user_updated.
		@return ad_user_updated	  */
	public Timestamp getad_user_updated()
	{
		return (Timestamp)get_Value(COLUMNNAME_ad_user_updated);
	}

	/** Set ad_user_value.
		@param ad_user_value ad_user_value
	*/
	public void setad_user_value (String ad_user_value)
	{
		set_ValueNoCheck (COLUMNNAME_ad_user_value, ad_user_value);
	}

	/** Get ad_user_value.
		@return ad_user_value	  */
	public String getad_user_value()
	{
		return (String)get_Value(COLUMNNAME_ad_user_value);
	}

	/** Set c_bp_dunninggrace.
		@param c_bp_dunninggrace c_bp_dunninggrace
	*/
	public void setc_bp_dunninggrace (Timestamp c_bp_dunninggrace)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_dunninggrace, c_bp_dunninggrace);
	}

	/** Get c_bp_dunninggrace.
		@return c_bp_dunninggrace	  */
	public Timestamp getc_bp_dunninggrace()
	{
		return (Timestamp)get_Value(COLUMNNAME_c_bp_dunninggrace);
	}

	/** Set c_bp_ismanufacturer.
		@param c_bp_ismanufacturer c_bp_ismanufacturer
	*/
	public void setc_bp_ismanufacturer (boolean c_bp_ismanufacturer)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_ismanufacturer, Boolean.valueOf(c_bp_ismanufacturer));
	}

	/** Get c_bp_ismanufacturer.
		@return c_bp_ismanufacturer	  */
	public boolean isc_bp_ismanufacturer()
	{
		Object oo = get_Value(COLUMNNAME_c_bp_ismanufacturer);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set c_bp_ispotaxexempt.
		@param c_bp_ispotaxexempt c_bp_ispotaxexempt
	*/
	public void setc_bp_ispotaxexempt (boolean c_bp_ispotaxexempt)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_ispotaxexempt, Boolean.valueOf(c_bp_ispotaxexempt));
	}

	/** Get c_bp_ispotaxexempt.
		@return c_bp_ispotaxexempt	  */
	public boolean isc_bp_ispotaxexempt()
	{
		Object oo = get_Value(COLUMNNAME_c_bp_ispotaxexempt);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set c_bp_location_created.
		@param c_bp_location_created c_bp_location_created
	*/
	public void setc_bp_location_created (Timestamp c_bp_location_created)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_created, c_bp_location_created);
	}

	/** Get c_bp_location_created.
		@return c_bp_location_created	  */
	public Timestamp getc_bp_location_created()
	{
		return (Timestamp)get_Value(COLUMNNAME_c_bp_location_created);
	}

	/** Set c_bp_location_fax.
		@param c_bp_location_fax c_bp_location_fax
	*/
	public void setc_bp_location_fax (String c_bp_location_fax)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_fax, c_bp_location_fax);
	}

	/** Get c_bp_location_fax.
		@return c_bp_location_fax	  */
	public String getc_bp_location_fax()
	{
		return (String)get_Value(COLUMNNAME_c_bp_location_fax);
	}

	/** Set c_bp_location_isactive.
		@param c_bp_location_isactive c_bp_location_isactive
	*/
	public void setc_bp_location_isactive (boolean c_bp_location_isactive)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_isactive, Boolean.valueOf(c_bp_location_isactive));
	}

	/** Get c_bp_location_isactive.
		@return c_bp_location_isactive	  */
	public boolean isc_bp_location_isactive()
	{
		Object oo = get_Value(COLUMNNAME_c_bp_location_isactive);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set c_bp_location_isbillto.
		@param c_bp_location_isbillto c_bp_location_isbillto
	*/
	public void setc_bp_location_isbillto (boolean c_bp_location_isbillto)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_isbillto, Boolean.valueOf(c_bp_location_isbillto));
	}

	/** Get c_bp_location_isbillto.
		@return c_bp_location_isbillto	  */
	public boolean isc_bp_location_isbillto()
	{
		Object oo = get_Value(COLUMNNAME_c_bp_location_isbillto);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set c_bp_location_isdn.
		@param c_bp_location_isdn c_bp_location_isdn
	*/
	public void setc_bp_location_isdn (String c_bp_location_isdn)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_isdn, c_bp_location_isdn);
	}

	/** Get c_bp_location_isdn.
		@return c_bp_location_isdn	  */
	public String getc_bp_location_isdn()
	{
		return (String)get_Value(COLUMNNAME_c_bp_location_isdn);
	}

	/** Set c_bp_location_ispayfrom.
		@param c_bp_location_ispayfrom c_bp_location_ispayfrom
	*/
	public void setc_bp_location_ispayfrom (boolean c_bp_location_ispayfrom)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_ispayfrom, Boolean.valueOf(c_bp_location_ispayfrom));
	}

	/** Get c_bp_location_ispayfrom.
		@return c_bp_location_ispayfrom	  */
	public boolean isc_bp_location_ispayfrom()
	{
		Object oo = get_Value(COLUMNNAME_c_bp_location_ispayfrom);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set c_bp_location_isremitto.
		@param c_bp_location_isremitto c_bp_location_isremitto
	*/
	public void setc_bp_location_isremitto (boolean c_bp_location_isremitto)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_isremitto, Boolean.valueOf(c_bp_location_isremitto));
	}

	/** Get c_bp_location_isremitto.
		@return c_bp_location_isremitto	  */
	public boolean isc_bp_location_isremitto()
	{
		Object oo = get_Value(COLUMNNAME_c_bp_location_isremitto);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set c_bp_location_isshipto.
		@param c_bp_location_isshipto c_bp_location_isshipto
	*/
	public void setc_bp_location_isshipto (boolean c_bp_location_isshipto)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_isshipto, Boolean.valueOf(c_bp_location_isshipto));
	}

	/** Get c_bp_location_isshipto.
		@return c_bp_location_isshipto	  */
	public boolean isc_bp_location_isshipto()
	{
		Object oo = get_Value(COLUMNNAME_c_bp_location_isshipto);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set c_bp_location_name.
		@param c_bp_location_name c_bp_location_name
	*/
	public void setc_bp_location_name (String c_bp_location_name)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_name, c_bp_location_name);
	}

	/** Get c_bp_location_name.
		@return c_bp_location_name	  */
	public String getc_bp_location_name()
	{
		return (String)get_Value(COLUMNNAME_c_bp_location_name);
	}

	/** Set c_bp_location_phone.
		@param c_bp_location_phone c_bp_location_phone
	*/
	public void setc_bp_location_phone (String c_bp_location_phone)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_phone, c_bp_location_phone);
	}

	/** Get c_bp_location_phone.
		@return c_bp_location_phone	  */
	public String getc_bp_location_phone()
	{
		return (String)get_Value(COLUMNNAME_c_bp_location_phone);
	}

	/** Set c_bp_location_phone2.
		@param c_bp_location_phone2 c_bp_location_phone2
	*/
	public void setc_bp_location_phone2 (String c_bp_location_phone2)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_phone2, c_bp_location_phone2);
	}

	/** Get c_bp_location_phone2.
		@return c_bp_location_phone2	  */
	public String getc_bp_location_phone2()
	{
		return (String)get_Value(COLUMNNAME_c_bp_location_phone2);
	}

	/** Set c_bp_location_updated.
		@param c_bp_location_updated c_bp_location_updated
	*/
	public void setc_bp_location_updated (Timestamp c_bp_location_updated)
	{
		set_ValueNoCheck (COLUMNNAME_c_bp_location_updated, c_bp_location_updated);
	}

	/** Get c_bp_location_updated.
		@return c_bp_location_updated	  */
	public Timestamp getc_bp_location_updated()
	{
		return (Timestamp)get_Value(COLUMNNAME_c_bp_location_updated);
	}

	/** Set c_country_ad_language.
		@param c_country_ad_language c_country_ad_language
	*/
	public void setc_country_ad_language (String c_country_ad_language)
	{
		set_ValueNoCheck (COLUMNNAME_c_country_ad_language, c_country_ad_language);
	}

	/** Get c_country_ad_language.
		@return c_country_ad_language	  */
	public String getc_country_ad_language()
	{
		return (String)get_Value(COLUMNNAME_c_country_ad_language);
	}

	/** Set c_country_description.
		@param c_country_description c_country_description
	*/
	public void setc_country_description (String c_country_description)
	{
		set_ValueNoCheck (COLUMNNAME_c_country_description, c_country_description);
	}

	/** Get c_country_description.
		@return c_country_description	  */
	public String getc_country_description()
	{
		return (String)get_Value(COLUMNNAME_c_country_description);
	}

	/** Set c_country_isactive.
		@param c_country_isactive c_country_isactive
	*/
	public void setc_country_isactive (boolean c_country_isactive)
	{
		set_ValueNoCheck (COLUMNNAME_c_country_isactive, Boolean.valueOf(c_country_isactive));
	}

	/** Get c_country_isactive.
		@return c_country_isactive	  */
	public boolean isc_country_isactive()
	{
		Object oo = get_Value(COLUMNNAME_c_country_isactive);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set c_location_created.
		@param c_location_created c_location_created
	*/
	public void setc_location_created (Timestamp c_location_created)
	{
		set_ValueNoCheck (COLUMNNAME_c_location_created, c_location_created);
	}

	/** Get c_location_created.
		@return c_location_created	  */
	public Timestamp getc_location_created()
	{
		return (Timestamp)get_Value(COLUMNNAME_c_location_created);
	}

	/** Set c_location_isactive.
		@param c_location_isactive c_location_isactive
	*/
	public void setc_location_isactive (boolean c_location_isactive)
	{
		set_ValueNoCheck (COLUMNNAME_c_location_isactive, Boolean.valueOf(c_location_isactive));
	}

	/** Get c_location_isactive.
		@return c_location_isactive	  */
	public boolean isc_location_isactive()
	{
		Object oo = get_Value(COLUMNNAME_c_location_isactive);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set c_location_updated.
		@param c_location_updated c_location_updated
	*/
	public void setc_location_updated (Timestamp c_location_updated)
	{
		set_ValueNoCheck (COLUMNNAME_c_location_updated, c_location_updated);
	}

	/** Get c_location_updated.
		@return c_location_updated	  */
	public Timestamp getc_location_updated()
	{
		return (Timestamp)get_Value(COLUMNNAME_c_location_updated);
	}

	/** Set c_region_description.
		@param c_region_description c_region_description
	*/
	public void setc_region_description (String c_region_description)
	{
		set_ValueNoCheck (COLUMNNAME_c_region_description, c_region_description);
	}

	/** Get c_region_description.
		@return c_region_description	  */
	public String getc_region_description()
	{
		return (String)get_Value(COLUMNNAME_c_region_description);
	}

	/** Set c_region_isactive.
		@param c_region_isactive c_region_isactive
	*/
	public void setc_region_isactive (boolean c_region_isactive)
	{
		set_ValueNoCheck (COLUMNNAME_c_region_isactive, Boolean.valueOf(c_region_isactive));
	}

	/** Get c_region_isactive.
		@return c_region_isactive	  */
	public boolean isc_region_isactive()
	{
		Object oo = get_Value(COLUMNNAME_c_region_isactive);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}
}