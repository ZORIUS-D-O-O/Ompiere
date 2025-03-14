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

/** Generated Interface for C_Remuneration
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_C_Remuneration 
{

    /** TableName=C_Remuneration */
    public static final String Table_Name = "C_Remuneration";

    /** AD_Table_ID=792 */
    public static final int Table_ID = 792;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 2 - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

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

    /** Column name C_Remuneration_ID */
    public static final String COLUMNNAME_C_Remuneration_ID = "C_Remuneration_ID";

	/** Set Remuneration.
	  * Wage or Salary
	  */
	public void setC_Remuneration_ID (int C_Remuneration_ID);

	/** Get Remuneration.
	  * Wage or Salary
	  */
	public int getC_Remuneration_ID();

    /** Column name C_Remuneration_UU */
    public static final String COLUMNNAME_C_Remuneration_UU = "C_Remuneration_UU";

	/** Set C_Remuneration_UU	  */
	public void setC_Remuneration_UU (String C_Remuneration_UU);

	/** Get C_Remuneration_UU	  */
	public String getC_Remuneration_UU();

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

    /** Column name GrossRAmt */
    public static final String COLUMNNAME_GrossRAmt = "GrossRAmt";

	/** Set Gross Amount.
	  * Gross Remuneration Amount
	  */
	public void setGrossRAmt (BigDecimal GrossRAmt);

	/** Get Gross Amount.
	  * Gross Remuneration Amount
	  */
	public BigDecimal getGrossRAmt();

    /** Column name GrossRCost */
    public static final String COLUMNNAME_GrossRCost = "GrossRCost";

	/** Set Gross Cost.
	  * Gross Remuneration Costs
	  */
	public void setGrossRCost (BigDecimal GrossRCost);

	/** Get Gross Cost.
	  * Gross Remuneration Costs
	  */
	public BigDecimal getGrossRCost();

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

    /** Column name OvertimeAmt */
    public static final String COLUMNNAME_OvertimeAmt = "OvertimeAmt";

	/** Set Overtime Amount.
	  * Hourly Overtime Rate
	  */
	public void setOvertimeAmt (BigDecimal OvertimeAmt);

	/** Get Overtime Amount.
	  * Hourly Overtime Rate
	  */
	public BigDecimal getOvertimeAmt();

    /** Column name OvertimeCost */
    public static final String COLUMNNAME_OvertimeCost = "OvertimeCost";

	/** Set Overtime Cost.
	  * Hourly Overtime Cost
	  */
	public void setOvertimeCost (BigDecimal OvertimeCost);

	/** Get Overtime Cost.
	  * Hourly Overtime Cost
	  */
	public BigDecimal getOvertimeCost();

    /** Column name RemunerationType */
    public static final String COLUMNNAME_RemunerationType = "RemunerationType";

	/** Set Remuneration Type.
	  * Type of Remuneration
	  */
	public void setRemunerationType (String RemunerationType);

	/** Get Remuneration Type.
	  * Type of Remuneration
	  */
	public String getRemunerationType();

    /** Column name StandardHours */
    public static final String COLUMNNAME_StandardHours = "StandardHours";

	/** Set Standard Hours.
	  * Standard Work Hours based on Remuneration Type
	  */
	public void setStandardHours (int StandardHours);

	/** Get Standard Hours.
	  * Standard Work Hours based on Remuneration Type
	  */
	public int getStandardHours();

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
