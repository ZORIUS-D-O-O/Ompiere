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

/** Generated Model for AD_Chart
 *  @author Ompiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="AD_Chart")
public class X_AD_Chart extends PO implements I_AD_Chart, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_AD_Chart (Properties ctx, int AD_Chart_ID, String trxName)
    {
      super (ctx, AD_Chart_ID, trxName);
      /** if (AD_Chart_ID == 0)
        {
			setAD_Chart_ID (0);
			setChartOrientation (null);
// V
			setChartType (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsDisplayLegend (true);
// 'Y'
			setIsTimeSeries (false);
// N
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Chart (Properties ctx, int AD_Chart_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Chart_ID, trxName, virtualColumns);
      /** if (AD_Chart_ID == 0)
        {
			setAD_Chart_ID (0);
			setChartOrientation (null);
// V
			setChartType (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsDisplayLegend (true);
// 'Y'
			setIsTimeSeries (false);
// N
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Chart (Properties ctx, String AD_Chart_UU, String trxName)
    {
      super (ctx, AD_Chart_UU, trxName);
      /** if (AD_Chart_UU == null)
        {
			setAD_Chart_ID (0);
			setChartOrientation (null);
// V
			setChartType (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsDisplayLegend (true);
// 'Y'
			setIsTimeSeries (false);
// N
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_AD_Chart (Properties ctx, String AD_Chart_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, AD_Chart_UU, trxName, virtualColumns);
      /** if (AD_Chart_UU == null)
        {
			setAD_Chart_ID (0);
			setChartOrientation (null);
// V
			setChartType (null);
			setEntityType (null);
// @SQL=SELECT CASE WHEN '@P|AdempiereSys:N@'='Y' THEN 'D' ELSE get_sysconfig('DEFAULT_ENTITYTYPE','U',0,0) END FROM Dual
			setIsDisplayLegend (true);
// 'Y'
			setIsTimeSeries (false);
// N
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_AD_Chart (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client
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
      StringBuilder sb = new StringBuilder ("X_AD_Chart[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Chart.
		@param AD_Chart_ID Chart
	*/
	public void setAD_Chart_ID (int AD_Chart_ID)
	{
		if (AD_Chart_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_Chart_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_Chart_ID, Integer.valueOf(AD_Chart_ID));
	}

	/** Get Chart.
		@return Chart	  */
	public int getAD_Chart_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Chart_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Chart_UU.
		@param AD_Chart_UU AD_Chart_UU
	*/
	public void setAD_Chart_UU (String AD_Chart_UU)
	{
		set_ValueNoCheck (COLUMNNAME_AD_Chart_UU, AD_Chart_UU);
	}

	/** Get AD_Chart_UU.
		@return AD_Chart_UU	  */
	public String getAD_Chart_UU()
	{
		return (String)get_Value(COLUMNNAME_AD_Chart_UU);
	}

	/** ChartOrientation AD_Reference_ID=53375 */
	public static final int CHARTORIENTATION_AD_Reference_ID=53375;
	/** Horizontal = H */
	public static final String CHARTORIENTATION_Horizontal = "H";
	/** Vertical = V */
	public static final String CHARTORIENTATION_Vertical = "V";
	/** Set Orientation.
		@param ChartOrientation The orientation of the chart.
	*/
	public void setChartOrientation (String ChartOrientation)
	{

		set_Value (COLUMNNAME_ChartOrientation, ChartOrientation);
	}

	/** Get Orientation.
		@return The orientation of the chart.
	  */
	public String getChartOrientation()
	{
		return (String)get_Value(COLUMNNAME_ChartOrientation);
	}

	/** ChartType AD_Reference_ID=53377 */
	public static final int CHARTTYPE_AD_Reference_ID=53377;
	/** Area Chart = AC */
	public static final String CHARTTYPE_AreaChart = "AC";
	/** Stacked Area Chart = AS */
	public static final String CHARTTYPE_StackedAreaChart = "AS";
	/** 3D Bar Chart = B3 */
	public static final String CHARTTYPE_3DBarChart = "B3";
	/** 3D Stacked Bar Chart = B4 */
	public static final String CHARTTYPE_3DStackedBarChart = "B4";
	/** Bar Chart = BC */
	public static final String CHARTTYPE_BarChart = "BC";
	/** Stacked Bar Chart = BS */
	public static final String CHARTTYPE_StackedBarChart = "BS";
	/** 3D Line Chart = L3 */
	public static final String CHARTTYPE_3DLineChart = "L3";
	/** Line Chart = LC */
	public static final String CHARTTYPE_LineChart = "LC";
	/** 3D Pie Chart = P3 */
	public static final String CHARTTYPE_3DPieChart = "P3";
	/** Pie Chart = PC */
	public static final String CHARTTYPE_PieChart = "PC";
	/** Ring Chart = RC */
	public static final String CHARTTYPE_RingChart = "RC";
	/** Waterfall Chart = WC */
	public static final String CHARTTYPE_WaterfallChart = "WC";
	/** Set Chart Type.
		@param ChartType Type of chart to render
	*/
	public void setChartType (String ChartType)
	{

		set_Value (COLUMNNAME_ChartType, ChartType);
	}

	/** Get Chart Type.
		@return Type of chart to render
	  */
	public String getChartType()
	{
		return (String)get_Value(COLUMNNAME_ChartType);
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

	/** Set Domain Label.
		@param DomainLabel Label for the domain axis.
	*/
	public void setDomainLabel (String DomainLabel)
	{
		set_Value (COLUMNNAME_DomainLabel, DomainLabel);
	}

	/** Get Domain Label.
		@return Label for the domain axis.
	  */
	public String getDomainLabel()
	{
		return (String)get_Value(COLUMNNAME_DomainLabel);
	}

	/** EntityType AD_Reference_ID=389 */
	public static final int ENTITYTYPE_AD_Reference_ID=389;
	/** Set Entity Type.
		@param EntityType Dictionary Entity Type; Determines ownership and synchronization
	*/
	public void setEntityType (String EntityType)
	{

		set_Value (COLUMNNAME_EntityType, EntityType);
	}

	/** Get Entity Type.
		@return Dictionary Entity Type; Determines ownership and synchronization
	  */
	public String getEntityType()
	{
		return (String)get_Value(COLUMNNAME_EntityType);
	}

	/** Set Display Legend.
		@param IsDisplayLegend Display chart legend
	*/
	public void setIsDisplayLegend (boolean IsDisplayLegend)
	{
		set_Value (COLUMNNAME_IsDisplayLegend, Boolean.valueOf(IsDisplayLegend));
	}

	/** Get Display Legend.
		@return Display chart legend
	  */
	public boolean isDisplayLegend()
	{
		Object oo = get_Value(COLUMNNAME_IsDisplayLegend);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Time Series.
		@param IsTimeSeries The domain data for the chart is organised by time.
	*/
	public void setIsTimeSeries (boolean IsTimeSeries)
	{
		set_Value (COLUMNNAME_IsTimeSeries, Boolean.valueOf(IsTimeSeries));
	}

	/** Get Time Series.
		@return The domain data for the chart is organised by time.
	  */
	public boolean isTimeSeries()
	{
		Object oo = get_Value(COLUMNNAME_IsTimeSeries);
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

	/** Set Range Label.
		@param RangeLabel Label for the range axis.
	*/
	public void setRangeLabel (String RangeLabel)
	{
		set_Value (COLUMNNAME_RangeLabel, RangeLabel);
	}

	/** Get Range Label.
		@return Label for the range axis.
	  */
	public String getRangeLabel()
	{
		return (String)get_Value(COLUMNNAME_RangeLabel);
	}

	/** Set Time Scope.
		@param TimeScope The number of time units to include the chart result.
	*/
	public void setTimeScope (int TimeScope)
	{
		set_Value (COLUMNNAME_TimeScope, Integer.valueOf(TimeScope));
	}

	/** Get Time Scope.
		@return The number of time units to include the chart result.
	  */
	public int getTimeScope()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TimeScope);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** TimeUnit AD_Reference_ID=53376 */
	public static final int TIMEUNIT_AD_Reference_ID=53376;
	/** Day = D */
	public static final String TIMEUNIT_Day = "D";
	/** Month = M */
	public static final String TIMEUNIT_Month = "M";
	/** Quarter = Q */
	public static final String TIMEUNIT_Quarter = "Q";
	/** Week = W */
	public static final String TIMEUNIT_Week = "W";
	/** Year = Y */
	public static final String TIMEUNIT_Year = "Y";
	/** Set Time Unit.
		@param TimeUnit The unit of time for grouping chart data.
	*/
	public void setTimeUnit (String TimeUnit)
	{

		set_Value (COLUMNNAME_TimeUnit, TimeUnit);
	}

	/** Get Time Unit.
		@return The unit of time for grouping chart data.
	  */
	public String getTimeUnit()
	{
		return (String)get_Value(COLUMNNAME_TimeUnit);
	}

	/** Set Window Height.
		@param WinHeight Window Height
	*/
	public void setWinHeight (int WinHeight)
	{
		set_Value (COLUMNNAME_WinHeight, Integer.valueOf(WinHeight));
	}

	/** Get Window Height.
		@return Window Height	  */
	public int getWinHeight()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_WinHeight);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}