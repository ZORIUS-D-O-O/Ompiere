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

/** Generated Model for GL_Category
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="GL_Category")
public class X_GL_Category extends PO implements I_GL_Category, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_GL_Category (Properties ctx, int GL_Category_ID, String trxName)
    {
      super (ctx, GL_Category_ID, trxName);
      /** if (GL_Category_ID == 0)
        {
			setCategoryType (null);
// M
			setGL_Category_ID (0);
			setIsDefault (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_GL_Category (Properties ctx, int GL_Category_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, GL_Category_ID, trxName, virtualColumns);
      /** if (GL_Category_ID == 0)
        {
			setCategoryType (null);
// M
			setGL_Category_ID (0);
			setIsDefault (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_GL_Category (Properties ctx, String GL_Category_UU, String trxName)
    {
      super (ctx, GL_Category_UU, trxName);
      /** if (GL_Category_UU == null)
        {
			setCategoryType (null);
// M
			setGL_Category_ID (0);
			setIsDefault (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_GL_Category (Properties ctx, String GL_Category_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, GL_Category_UU, trxName, virtualColumns);
      /** if (GL_Category_UU == null)
        {
			setCategoryType (null);
// M
			setGL_Category_ID (0);
			setIsDefault (false);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_GL_Category (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client
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
      StringBuilder sb = new StringBuilder ("X_GL_Category[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** CategoryType AD_Reference_ID=207 */
	public static final int CATEGORYTYPE_AD_Reference_ID=207;
	/** Document = D */
	public static final String CATEGORYTYPE_Document = "D";
	/** Import = I */
	public static final String CATEGORYTYPE_Import = "I";
	/** Manual = M */
	public static final String CATEGORYTYPE_Manual = "M";
	/** System generated = S */
	public static final String CATEGORYTYPE_SystemGenerated = "S";
	/** Set Category Type.
		@param CategoryType Source of the Journal with this category
	*/
	public void setCategoryType (String CategoryType)
	{

		set_Value (COLUMNNAME_CategoryType, CategoryType);
	}

	/** Get Category Type.
		@return Source of the Journal with this category
	  */
	public String getCategoryType()
	{
		return (String)get_Value(COLUMNNAME_CategoryType);
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

	/** Set GL Category.
		@param GL_Category_ID General Ledger Category
	*/
	public void setGL_Category_ID (int GL_Category_ID)
	{
		if (GL_Category_ID < 1)
			set_ValueNoCheck (COLUMNNAME_GL_Category_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_GL_Category_ID, Integer.valueOf(GL_Category_ID));
	}

	/** Get GL Category.
		@return General Ledger Category
	  */
	public int getGL_Category_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_Category_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set GL_Category_UU.
		@param GL_Category_UU GL_Category_UU
	*/
	public void setGL_Category_UU (String GL_Category_UU)
	{
		set_Value (COLUMNNAME_GL_Category_UU, GL_Category_UU);
	}

	/** Get GL_Category_UU.
		@return GL_Category_UU	  */
	public String getGL_Category_UU()
	{
		return (String)get_Value(COLUMNNAME_GL_Category_UU);
	}

	/** Set Default.
		@param IsDefault Default value
	*/
	public void setIsDefault (boolean IsDefault)
	{
		set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Print Text.
		@param PrintName The label text to be printed on a document or correspondence.
	*/
	public void setPrintName (String PrintName)
	{
		set_Value (COLUMNNAME_PrintName, PrintName);
	}

	/** Get Print Text.
		@return The label text to be printed on a document or correspondence.
	  */
	public String getPrintName()
	{
		return (String)get_Value(COLUMNNAME_PrintName);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}