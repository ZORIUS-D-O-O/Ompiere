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
package org.adempiere.webui.apps.form;

import java.io.StringWriter;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.adempiere.webui.adwindow.ADWindow;
import org.adempiere.webui.component.Column;
import org.adempiere.webui.component.Columns;
import org.adempiere.webui.component.ConfirmPanel;
import org.adempiere.webui.component.Grid;
import org.adempiere.webui.component.Row;
import org.adempiere.webui.component.Rows;
import org.adempiere.webui.panel.ADForm;
import org.adempiere.webui.session.SessionManager;
import org.compiere.model.GridTab;
import org.compiere.model.X_AD_CtxHelpMsg;
import org.compiere.util.Env;
import org.outerj.daisy.diff.DaisyDiff;
import org.springframework.web.util.HtmlUtils;
import org.xml.sax.helpers.AttributesImpl;
import org.zkforge.ckez.CKeditor;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.InputEvent;
import org.zkoss.zul.Cell;
import org.zkoss.zul.Div;
import org.zkoss.zul.Html;
import org.zkoss.zul.Timer;
import org.zkoss.zul.Vlayout;

/**
 * Form to compare suggested text from AD_CtxHelpSuggestion with the original text from AD_CtxHelpMsg.
 * @author hengsin
 */
@org.idempiere.ui.zk.annotation.Form
public class CompareCtxHelpSuggestion extends ADForm {

	/** {@link #helpTimer} attribute to store text value from {@link #helpTextbox} onChanging event. */
	private static final String NEW_VALUE_ATTR = "newValue";
	
	/**
	 * generated serial id
	 */
	private static final long serialVersionUID = -100362034024824442L;
	/** Grid layout for content of form */
	private Grid grid;
	private ConfirmPanel confirmPanel;
	/** Cell to show diff between original and changed text */
	private Cell helpDiff;
	private CKeditor helpTextbox;
	private X_AD_CtxHelpMsg ctxHelpMsg;
	/** AD Language from calling GridTab */
	private String AD_Language;
	/** Timer to process onChanging text from {@link #helpTextbox} asynchronously */
	private Timer helpTimer;

	/**
	 * default constructor
	 */
	public CompareCtxHelpSuggestion() {
	}

	/* (non-Javadoc)
	 * @see org.adempiere.webui.panel.ADForm#initForm()
	 */
	@Override
	protected void initForm() {
		setWidth("90%");
		setHeight("700px");
		setSizable(true);
		Vlayout layout = new Vlayout();
		layout.setHflex("1");
		layout.setVflex("1");
		appendChild(layout);
		
		grid = new Grid();
		grid.setVflex(true);
		grid.setHflex("1");
		layout.appendChild(grid);
		
		Div div = new Div();
		div.setSclass("dialog-footer");
		confirmPanel = new ConfirmPanel(true);
		confirmPanel.setStyle("padding: 8px 16px;");
		confirmPanel.setHflex("1");
		confirmPanel.setVflex("min");
		div.appendChild(confirmPanel);
		layout.appendChild(div);
		confirmPanel.addActionListener(this);
		
		helpTimer = new Timer();
		helpTimer.setDelay(1000);
		helpTimer.setRepeats(false);		
		appendChild(helpTimer);
		helpTimer.stop();
		helpTimer.addEventListener(Events.ON_TIMER, this);
		
		renderGrid();
	}

	/**
	 * Render content grid.
	 */
	private void renderGrid() {
		Component c = SessionManager.getAppDesktop().getActiveWindow();
		ADWindow adwindow = ADWindow.findADWindow(c);
		GridTab gridTab = adwindow.getADWindowContent().getActiveGridTab();
		int AD_CtxHelpMsg_ID = (Integer) gridTab.getValue("AD_CtxHelpMsg_ID");
		ctxHelpMsg = new X_AD_CtxHelpMsg(Env.getCtx(), AD_CtxHelpMsg_ID, null);
		AD_Language = (String) gridTab.getValue("AD_Language");		
		
		Columns columns = new Columns();
		grid.appendChild(columns);
		
		Column column = new Column();
		column.setLabel("Original Text");
		column.setValign("top");
		columns.appendChild(column);
		
		column = new Column();
		column.setLabel("Changed Text");
		column.setValign("top");
		columns.appendChild(column);
		
		column = new Column();
		column.setLabel("Difference");
		column.setValign("top");
		columns.appendChild(column);
		
		Rows rows = grid.newRows();
		Row row = rows.newRow();
		
		String original = ctxHelpMsg.get_Translation("MsgText", AD_Language);
		if (original != null)
			original = removeHeaderTag(original);
		row.appendCellChild(new Html(original));
		//suggestion from AD_CtxHelpSuggestion 
		String changed = (String) gridTab.getValue("MsgText");
		if (changed != null)
			changed = removeHeaderTag(changed);
		helpTextbox = new CKeditor();
		helpTextbox.setCustomConfigurationsPath("/js/ckeditor/config-min.js");
		helpTextbox.setToolbar("MyToolbar");
		row.appendCellChild(helpTextbox);
		helpTextbox.addEventListener(Events.ON_CHANGE, this);
		helpTextbox.addEventListener(Events.ON_CHANGING, this);
		helpTextbox.setHeight("400px");
		helpTextbox.setHflex("1");
		helpTextbox.setValue(changed);
		
		Html html = diff(original, changed);
		helpDiff = new Cell();
		helpDiff.appendChild(html);
		row.appendChild(helpDiff);
		
		this.addEventListener(Events.ON_OK, this);
	}

	/**
	 * @param original
	 * @param changed
	 * @return difference between original and changed
	 */
	private Html diff(String original, String changed) {
		if (original == null) 
			original = "";
		if (changed == null) 
			changed = "";
		String diff = htmlDiff(original, changed);
		StringBuilder builder = new StringBuilder();
		int i = 0;
		int length = diff.length();
		while (i < length) {
			int start = diff.indexOf("<span class=\"diff-tag-html\">", i);
			if (start >= 0) {
				if (start > i) {
					String s = diff.substring(i, start);
					s = HtmlUtils.htmlUnescape(s);
					builder.append(s);
				}
				i = start + "<span class=\"diff-tag-html\">".length();
				int end = diff.indexOf("</span>", i);
				if (end > i) {
					String s = diff.substring(i, end);
					s = HtmlUtils.htmlUnescape(s);
					builder.append(s);
					i = end + "</span>".length();
				} else {
					throw new RuntimeException("Missing </span> tag");
				}
			} else {
				break;
			}			
		}
		if (i < length) {
			String s = diff.substring(i, length);
			s = HtmlUtils.htmlUnescape(s);
			builder.append(s);
		}
		String s = builder.toString();
		s = s.replace("class=\"diff-tag-removed\"", "style=\"font-size: 100%;text-decoration: line-through;background-color: #fdc6c6;\"");
		s = s.replace("class=\"diff-tag-added\"", "style=\"font-size: 100%;background-color: #ccffcc;\"");
		Html html = new Html(s);
		return html;
	}
	
	/* (non-Javadoc)
	 * @see org.adempiere.webui.panel.ADForm#onEvent(org.zkoss.zk.ui.event.Event)
	 */
	@Override
	public void onEvent(Event event) throws Exception {
		if (event.getTarget() == confirmPanel.getButton(ConfirmPanel.A_CANCEL)) {
			this.detach();
		} else if (event.getTarget() == confirmPanel.getButton(ConfirmPanel.A_OK)) {
			applyChanges();
			this.detach();
		} else if (event.getTarget() == helpTextbox) {
			if (event.getName().equals(Events.ON_CHANGING)) {
				InputEvent inputEvent = (InputEvent) event;
				helpTimer.setAttribute(NEW_VALUE_ATTR, inputEvent.getValue());
				if (helpTimer.isRunning()) {
					return;
				} else {
					helpTimer.start();
				}
			} else {
				onHelpChanged(helpTextbox.getValue());
				if (helpTimer.isRunning())
					helpTimer.stop();
			}
		} else if (event.getTarget() == helpTimer) {
			onHelpChanged((String) helpTimer.removeAttribute(NEW_VALUE_ATTR));
		} else {
			super.onEvent(event);
		}
	}

	/**
	 * Handle changes from {@link #helpTextbox}.
	 * @param text
	 */
	private void onHelpChanged(String text) {
		helpDiff.getChildren().clear();
		Html html = diff(ctxHelpMsg.get_Translation("MsgText", AD_Language), text);
		helpDiff.appendChild(html);
	}
	
	/**
	 * Apply changes to calling GridTab (AD_CtxHelpSuggestion).
	 */
	private void applyChanges() {
		Component c = SessionManager.getAppDesktop().getActiveWindow();
		ADWindow adwindow = ADWindow.findADWindow(c);
		GridTab gridTab = adwindow.getADWindowContent().getActiveGridTab();
		String help = helpTextbox.getValue();
		gridTab.setValue("MsgText", help);
		gridTab.dataSave(false);
	}

	/* (non-Javadoc)
	 * @see org.adempiere.webui.panel.ADForm#getWindowMode()
	 */
	@Override
	public Mode getWindowMode() {
		return Mode.HIGHLIGHTED;
	}
	
	/**
	 * @param htmlString
	 * @return htmlString after removal of html header tag
	 */
	private String removeHeaderTag(String htmlString) {
		htmlString = htmlString
				.replace("<html>", "")
				.replace("</html>", "")
				.replace("<body>", "")
				.replace("</body>", "")
				.replace("<head>", "")
				.replace("</head>", "");
		return htmlString;
	}
	
	/**
	 * @param s1
	 * @param s2
	 * @return difference between s1 and s2
	 */
	private String htmlDiff(String s1, String s2) {

		try {
			SAXTransformerFactory tf = (SAXTransformerFactory) TransformerFactory.newInstance();

			TransformerHandler result = tf.newTransformerHandler();
			StringWriter resultWriter = new StringWriter();
			result.setResult(new StreamResult(resultWriter));

			result.startDocument();
			String tag = Long.toString(System.currentTimeMillis(), 3);
			result.startElement("", tag, tag, new AttributesImpl());
			DaisyDiff.diffTag(s1, s2, result);

			result.endDocument();
			result.endElement("", tag, tag);
			String string = resultWriter.toString();
			return string.substring(string.indexOf("<"+tag+">")+tag.length()+2, string.indexOf("</"+tag+">"));
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
}
