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

/** Generated Interface for M_DistributionRunLine
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_M_DistributionRunLine 
{

    /** TableName=M_DistributionRunLine */
    public static final String Table_Name = "M_DistributionRunLine";

    /** AD_Table_ID=713 */
    public static final int Table_ID = 713;

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

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

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

    /** Column name M_DistributionRunLine_ID */
    public static final String COLUMNNAME_M_DistributionRunLine_ID = "M_DistributionRunLine_ID";

	/** Set Distribution Run Line.
	  * Distribution Run Lines define Distribution List, the Product and Quantities
	  */
	public void setM_DistributionRunLine_ID (int M_DistributionRunLine_ID);

	/** Get Distribution Run Line.
	  * Distribution Run Lines define Distribution List, the Product and Quantities
	  */
	public int getM_DistributionRunLine_ID();

    /** Column name M_DistributionRunLine_UU */
    public static final String COLUMNNAME_M_DistributionRunLine_UU = "M_DistributionRunLine_UU";

	/** Set M_DistributionRunLine_UU	  */
	public void setM_DistributionRunLine_UU (String M_DistributionRunLine_UU);

	/** Get M_DistributionRunLine_UU	  */
	public String getM_DistributionRunLine_UU();

    /** Column name M_DistributionRun_ID */
    public static final String COLUMNNAME_M_DistributionRun_ID = "M_DistributionRun_ID";

	/** Set Distribution Run.
	  * Distribution Run create Orders to distribute products to a selected list of partners
	  */
	public void setM_DistributionRun_ID (int M_DistributionRun_ID);

	/** Get Distribution Run.
	  * Distribution Run create Orders to distribute products to a selected list of partners
	  */
	public int getM_DistributionRun_ID();

	public org.compiere.model.I_M_DistributionRun getM_DistributionRun() throws RuntimeException;

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

    /** Column name TotalQty */
    public static final String COLUMNNAME_TotalQty = "TotalQty";

	/** Set Total Quantity.
	  * Total Quantity
	  */
	public void setTotalQty (BigDecimal TotalQty);

	/** Get Total Quantity.
	  * Total Quantity
	  */
	public BigDecimal getTotalQty();

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
