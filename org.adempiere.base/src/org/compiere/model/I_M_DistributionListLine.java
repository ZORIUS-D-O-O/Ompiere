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

/** Generated Interface for M_DistributionListLine
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_M_DistributionListLine 
{

    /** TableName=M_DistributionListLine */
    public static final String Table_Name = "M_DistributionListLine";

    /** AD_Table_ID=665 */
    public static final int Table_ID = 665;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

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

    /** Column name C_BPartner_Location_ID */
    public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

	/** Set Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID);

	/** Get Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID();

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

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

    /** Column name M_DistributionListLine_ID */
    public static final String COLUMNNAME_M_DistributionListLine_ID = "M_DistributionListLine_ID";

	/** Set Distribution List Line.
	  * Distribution List Line with Business Partner and Quantity/Percentage
	  */
	public void setM_DistributionListLine_ID (int M_DistributionListLine_ID);

	/** Get Distribution List Line.
	  * Distribution List Line with Business Partner and Quantity/Percentage
	  */
	public int getM_DistributionListLine_ID();

    /** Column name M_DistributionListLine_UU */
    public static final String COLUMNNAME_M_DistributionListLine_UU = "M_DistributionListLine_UU";

	/** Set M_DistributionListLine_UU	  */
	public void setM_DistributionListLine_UU (String M_DistributionListLine_UU);

	/** Get M_DistributionListLine_UU	  */
	public String getM_DistributionListLine_UU();

    /** Column name M_DistributionList_ID */
    public static final String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";

	/** Set Distribution List.
	  * Distribution Lists allow to distribute products to a selected list of partners
	  */
	public void setM_DistributionList_ID (int M_DistributionList_ID);

	/** Get Distribution List.
	  * Distribution Lists allow to distribute products to a selected list of partners
	  */
	public int getM_DistributionList_ID();

	public org.compiere.model.I_M_DistributionList getM_DistributionList() throws RuntimeException;

    /** Column name MinQty */
    public static final String COLUMNNAME_MinQty = "MinQty";

	/** Set Minimum Quantity.
	  * Minimum quantity for the business partner
	  */
	public void setMinQty (BigDecimal MinQty);

	/** Get Minimum Quantity.
	  * Minimum quantity for the business partner
	  */
	public BigDecimal getMinQty();

    /** Column name Ratio */
    public static final String COLUMNNAME_Ratio = "Ratio";

	/** Set Ratio.
	  * Relative Ratio for Distributions
	  */
	public void setRatio (BigDecimal Ratio);

	/** Get Ratio.
	  * Relative Ratio for Distributions
	  */
	public BigDecimal getRatio();

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
