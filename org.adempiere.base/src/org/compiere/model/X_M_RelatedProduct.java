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

/** Generated Model for M_RelatedProduct
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="M_RelatedProduct")
public class X_M_RelatedProduct extends PO implements I_M_RelatedProduct, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_M_RelatedProduct (Properties ctx, int M_RelatedProduct_ID, String trxName)
    {
      super (ctx, M_RelatedProduct_ID, trxName);
      /** if (M_RelatedProduct_ID == 0)
        {
			setM_Product_ID (0);
			setName (null);
			setRelatedProductType (null);
			setRelatedProduct_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_RelatedProduct (Properties ctx, int M_RelatedProduct_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, M_RelatedProduct_ID, trxName, virtualColumns);
      /** if (M_RelatedProduct_ID == 0)
        {
			setM_Product_ID (0);
			setName (null);
			setRelatedProductType (null);
			setRelatedProduct_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_RelatedProduct (Properties ctx, String M_RelatedProduct_UU, String trxName)
    {
      super (ctx, M_RelatedProduct_UU, trxName);
      /** if (M_RelatedProduct_UU == null)
        {
			setM_Product_ID (0);
			setName (null);
			setRelatedProductType (null);
			setRelatedProduct_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_M_RelatedProduct (Properties ctx, String M_RelatedProduct_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, M_RelatedProduct_UU, trxName, virtualColumns);
      /** if (M_RelatedProduct_UU == null)
        {
			setM_Product_ID (0);
			setName (null);
			setRelatedProductType (null);
			setRelatedProduct_ID (0);
        } */
    }

    /** Load Constructor */
    public X_M_RelatedProduct (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_M_RelatedProduct[")
        .append(get_UUID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_ID)
			.getPO(getM_Product_ID(), get_TrxName());
	}

	/** Set Product.
		@param M_Product_ID Product, Service, Item
	*/
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set M_RelatedProduct_UU.
		@param M_RelatedProduct_UU M_RelatedProduct_UU
	*/
	public void setM_RelatedProduct_UU (String M_RelatedProduct_UU)
	{
		set_Value (COLUMNNAME_M_RelatedProduct_UU, M_RelatedProduct_UU);
	}

	/** Get M_RelatedProduct_UU.
		@return M_RelatedProduct_UU	  */
	public String getM_RelatedProduct_UU()
	{
		return (String)get_Value(COLUMNNAME_M_RelatedProduct_UU);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** RelatedProductType AD_Reference_ID=313 */
	public static final int RELATEDPRODUCTTYPE_AD_Reference_ID=313;
	/** Alternative = A */
	public static final String RELATEDPRODUCTTYPE_Alternative = "A";
	/** Web Promotion = P */
	public static final String RELATEDPRODUCTTYPE_WebPromotion = "P";
	/** Supplemental = S */
	public static final String RELATEDPRODUCTTYPE_Supplemental = "S";
	/** Set Related Product Type.
		@param RelatedProductType Related Product Type
	*/
	public void setRelatedProductType (String RelatedProductType)
	{

		set_ValueNoCheck (COLUMNNAME_RelatedProductType, RelatedProductType);
	}

	/** Get Related Product Type.
		@return Related Product Type	  */
	public String getRelatedProductType()
	{
		return (String)get_Value(COLUMNNAME_RelatedProductType);
	}

	public org.compiere.model.I_M_Product getRelatedProduct() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_ID)
			.getPO(getRelatedProduct_ID(), get_TrxName());
	}

	/** Set Related Product.
		@param RelatedProduct_ID Related Product
	*/
	public void setRelatedProduct_ID (int RelatedProduct_ID)
	{
		if (RelatedProduct_ID < 1)
			set_ValueNoCheck (COLUMNNAME_RelatedProduct_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_RelatedProduct_ID, Integer.valueOf(RelatedProduct_ID));
	}

	/** Get Related Product.
		@return Related Product
	  */
	public int getRelatedProduct_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RelatedProduct_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}