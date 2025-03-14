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
 **********************************************************************/
package org.idempiere.ui.zk.report;

import java.io.StringWriter;

import org.adempiere.base.Core;
import org.adempiere.webui.window.ZkReportViewer;
import org.compiere.print.ReportEngine;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.print.renderer.IReportRenderer;
import org.idempiere.print.renderer.IReportRendererConfiguration;
import org.idempiere.print.renderer.XMLReportRendererConfiguration;
import org.osgi.service.component.annotations.Component;
import org.zkoss.util.media.AMedia;

import com.google.common.net.MediaType;

/**
 * XML content rendering service for report viewer
 */
@Component(service =  IReportViewerRenderer.class, immediate = true)
public class XMLReportViewerRenderer implements IReportViewerRenderer {

	public XMLReportViewerRenderer() {
	}

	@Override
	public String getId() {
		return XMLReportRendererConfiguration.ID;
	}

	@Override
	public String getExportLabel() {
		return Msg.getMsg(Env.getCtx(), "FileXML");
	}

	@Override
	public String getContentType() {
		return MediaType.XML_UTF_8.toString();
	}

	@Override
	public String getFileExtension() {
		return XMLReportRendererConfiguration.FILE_EXTENSION;
	}

	@Override
	public boolean isExport() {
		return true;
	}

	@Override
	public boolean isPreview(boolean roleCanExport) {
		return false;
	}

	@Override
	public AMedia renderMedia(ZkReportViewer viewer, boolean export) {
		StringWriter sw = new StringWriter();
		ReportEngine reportEngine = viewer.getReportEngine();
		IReportRenderer<IReportRendererConfiguration> renderer = Core.getReportRenderer(getId());
		XMLReportRendererConfiguration config = new XMLReportRendererConfiguration().setOutputWriter(sw);
		renderer.renderReport(reportEngine, config);
		String data = sw.getBuffer().toString();
		return new AMedia(reportEngine.getName() + "."+getFileExtension(), getFileExtension(), getContentType(), data);
	}

}
