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

/** Generated Interface for AD_WF_ProcessData
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_AD_WF_ProcessData 
{

    /** TableName=AD_WF_ProcessData */
    public static final String Table_Name = "AD_WF_ProcessData";

    /** AD_Table_ID=648 */
    public static final int Table_ID = 648;

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

    /** Column name AD_WF_ProcessData_ID */
    public static final String COLUMNNAME_AD_WF_ProcessData_ID = "AD_WF_ProcessData_ID";

	/** Set Workflow Process Data.
	  * Workflow Process Context
	  */
	public void setAD_WF_ProcessData_ID (int AD_WF_ProcessData_ID);

	/** Get Workflow Process Data.
	  * Workflow Process Context
	  */
	public int getAD_WF_ProcessData_ID();

    /** Column name AD_WF_ProcessData_UU */
    public static final String COLUMNNAME_AD_WF_ProcessData_UU = "AD_WF_ProcessData_UU";

	/** Set AD_WF_ProcessData_UU	  */
	public void setAD_WF_ProcessData_UU (String AD_WF_ProcessData_UU);

	/** Get AD_WF_ProcessData_UU	  */
	public String getAD_WF_ProcessData_UU();

    /** Column name AD_WF_Process_ID */
    public static final String COLUMNNAME_AD_WF_Process_ID = "AD_WF_Process_ID";

	/** Set Workflow Process.
	  * Actual Workflow Process Instance
	  */
	public void setAD_WF_Process_ID (int AD_WF_Process_ID);

	/** Get Workflow Process.
	  * Actual Workflow Process Instance
	  */
	public int getAD_WF_Process_ID();

	public org.compiere.model.I_AD_WF_Process getAD_WF_Process() throws RuntimeException;

    /** Column name AttributeName */
    public static final String COLUMNNAME_AttributeName = "AttributeName";

	/** Set Attribute Name.
	  * Name of the Attribute
	  */
	public void setAttributeName (String AttributeName);

	/** Get Attribute Name.
	  * Name of the Attribute
	  */
	public String getAttributeName();

    /** Column name AttributeValue */
    public static final String COLUMNNAME_AttributeValue = "AttributeValue";

	/** Set Attribute Value.
	  * Value of the Attribute
	  */
	public void setAttributeValue (String AttributeValue);

	/** Get Attribute Value.
	  * Value of the Attribute
	  */
	public String getAttributeValue();

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
