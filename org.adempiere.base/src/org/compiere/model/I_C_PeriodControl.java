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

/** Generated Interface for C_PeriodControl
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_C_PeriodControl 
{

    /** TableName=C_PeriodControl */
    public static final String Table_Name = "C_PeriodControl";

    /** AD_Table_ID=229 */
    public static final int Table_ID = 229;

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

    /** Column name C_PeriodControl_ID */
    public static final String COLUMNNAME_C_PeriodControl_ID = "C_PeriodControl_ID";

	/** Set Period Control	  */
	public void setC_PeriodControl_ID (int C_PeriodControl_ID);

	/** Get Period Control	  */
	public int getC_PeriodControl_ID();

    /** Column name C_PeriodControl_UU */
    public static final String COLUMNNAME_C_PeriodControl_UU = "C_PeriodControl_UU";

	/** Set C_PeriodControl_UU	  */
	public void setC_PeriodControl_UU (String C_PeriodControl_UU);

	/** Get C_PeriodControl_UU	  */
	public String getC_PeriodControl_UU();

    /** Column name C_Period_ID */
    public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

	/** Set Period.
	  * Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID);

	/** Get Period.
	  * Period of the Calendar
	  */
	public int getC_Period_ID();

	public org.compiere.model.I_C_Period getC_Period() throws RuntimeException;

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

    /** Column name DocBaseType */
    public static final String COLUMNNAME_DocBaseType = "DocBaseType";

	/** Set Document Base Type.
	  * Logical type of document
	  */
	public void setDocBaseType (String DocBaseType);

	/** Get Document Base Type.
	  * Logical type of document
	  */
	public String getDocBaseType();

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

    /** Column name PeriodAction */
    public static final String COLUMNNAME_PeriodAction = "PeriodAction";

	/** Set Period Action.
	  * Action taken for this period
	  */
	public void setPeriodAction (String PeriodAction);

	/** Get Period Action.
	  * Action taken for this period
	  */
	public String getPeriodAction();

    /** Column name PeriodStatus */
    public static final String COLUMNNAME_PeriodStatus = "PeriodStatus";

	/** Set Period Status.
	  * Current state of this period
	  */
	public void setPeriodStatus (String PeriodStatus);

	/** Get Period Status.
	  * Current state of this period
	  */
	public String getPeriodStatus();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

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
