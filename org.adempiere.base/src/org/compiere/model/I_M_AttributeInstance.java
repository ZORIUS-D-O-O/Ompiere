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

/** Generated Interface for M_AttributeInstance
 *  @author Ompiere (generated) 
 *  @version Release 12
 */
public interface I_M_AttributeInstance 
{

    /** TableName=M_AttributeInstance */
    public static final String Table_Name = "M_AttributeInstance";

    /** AD_Table_ID=561 */
    public static final int Table_ID = 561;

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

    /** Column name M_AttributeInstance_UU */
    public static final String COLUMNNAME_M_AttributeInstance_UU = "M_AttributeInstance_UU";

	/** Set M_AttributeInstance_UU	  */
	public void setM_AttributeInstance_UU (String M_AttributeInstance_UU);

	/** Get M_AttributeInstance_UU	  */
	public String getM_AttributeInstance_UU();

    /** Column name M_AttributeSetInstance_ID */
    public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

	/** Set Attribute Set Instance.
	  * Product Attribute Set Instance
	  */
	public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID);

	/** Get Attribute Set Instance.
	  * Product Attribute Set Instance
	  */
	public int getM_AttributeSetInstance_ID();

	public I_M_AttributeSetInstance getM_AttributeSetInstance() throws RuntimeException;

    /** Column name M_AttributeValue_ID */
    public static final String COLUMNNAME_M_AttributeValue_ID = "M_AttributeValue_ID";

	/** Set Attribute Value.
	  * Product Attribute Value
	  */
	public void setM_AttributeValue_ID (int M_AttributeValue_ID);

	/** Get Attribute Value.
	  * Product Attribute Value
	  */
	public int getM_AttributeValue_ID();

	public org.compiere.model.I_M_AttributeValue getM_AttributeValue() throws RuntimeException;

    /** Column name M_Attribute_ID */
    public static final String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";

	/** Set Attribute.
	  * Product Attribute
	  */
	public void setM_Attribute_ID (int M_Attribute_ID);

	/** Get Attribute.
	  * Product Attribute
	  */
	public int getM_Attribute_ID();

	public org.compiere.model.I_M_Attribute getM_Attribute() throws RuntimeException;

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

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name ValueDate */
    public static final String COLUMNNAME_ValueDate = "ValueDate";

	/** Set Value Date	  */
	public void setValueDate (Timestamp ValueDate);

	/** Get Value Date	  */
	public Timestamp getValueDate();

    /** Column name ValueMultipleSelection */
    public static final String COLUMNNAME_ValueMultipleSelection = "ValueMultipleSelection";

	/** Set Value Multiple Selection.
	  * Comma separated values.
	  */
	public void setValueMultipleSelection (String ValueMultipleSelection);

	/** Get Value Multiple Selection.
	  * Comma separated values.
	  */
	public String getValueMultipleSelection();

    /** Column name ValueNumber */
    public static final String COLUMNNAME_ValueNumber = "ValueNumber";

	/** Set Value.
	  * Numeric Value
	  */
	public void setValueNumber (BigDecimal ValueNumber);

	/** Get Value.
	  * Numeric Value
	  */
	public BigDecimal getValueNumber();
}
