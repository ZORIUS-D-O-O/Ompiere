/***********************************************************************
 * This file is part of Ompiere ERP Open Source                      *
 * http://www.idempiere.org                                            *
 *                                                                     *
 * Copyright (C) Contributors                                          *
 *                                                                     *
 * This program is free software; you can redistribute it and/or       *
 * modify it under the terms of the GNU General Public License         *
 * as published by the Free Software Foundation; either version 2      *
 * of the License, or (at your option) any later version.              *
 *                                                                     *
 * This program is distributed in the hope that it will be useful,     *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of      *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
 * GNU General Public License for more details.                        *
 *                                                                     *
 * You should have received a copy of the GNU General Public License   *
 * along with this program; if not, write to the Free Software         *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
 * MA 02110-1301, USA.                                                 *
 *                                                                     *
 * Contributors:                                                       *
 * - hengsin                         								   *
 **********************************************************************/
package org.idempiere.model;

import java.sql.ResultSet;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import org.compiere.model.PO;
import org.osgi.framework.BundleContext;

/**
 * 
 * @author hengsin
 *
 */
public interface IMappedModelFactory {

	/**
	 * add table name to class mapping
	 * @param tableName
	 * @param classSupplier
	 * @param recordIdFunction
	 * @param resultSetFunction
	 */
	default void addMapping(String tableName, Supplier<Class<?>> classSupplier,
			BiFunction<Integer, String, ? extends PO> recordIdFunction,
			BiFunction<ResultSet, String, ? extends PO> resultSetFunction) {
		addMapping(tableName, classSupplier, recordIdFunction, null, resultSetFunction);
	}

	/**
	 * add table name to class mapping
	 * @param tableName
	 * @param classSupplier
	 * @param recordIdFunction
	 * @param recordUUIDFunction
	 * @param resultSetFunction
	 */
	void addMapping(String tableName, Supplier<Class<?>> classSupplier,
			BiFunction<Integer, String, ? extends PO> recordIdFunction,
			BiFunction<String, String, ? extends PO> recordUUIDFunction,
			BiFunction<ResultSet, String, ? extends PO> resultSetFunction);

	/**
	 * remove table name to class mapping
	 * @param tableName
	 */
	void removeMapping(String tableName);

	/**
	 * Scan packages for class with {@link org.adempiere.base.Model} annotation and add mapping for it
	 * @param context
	 * @param packages
	 */
	public void scan(BundleContext context, String... packages);
}