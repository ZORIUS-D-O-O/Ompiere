/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.install;

import java.util.ListResourceBundle;

/**
 *	Setup Resources
 *
 * 	@author 	Halim Englen (halim@rfid-indonesia.com)
 * 	@version 	$Id: SetupRes_in.java,v 1.2 2006/07/30 00:57:42 jjanke Exp $
 */
public class SetupRes_in extends ListResourceBundle
{
	/**	Translation Info	*/
	static final Object[][] contents = new String[][]{
	{ "AdempiereServerSetup", 	"Setup Ompiere Server" },
	{ "Ok", 					"Ok" },
	{ "File", 					"File" },
	{ "Exit", 					"Keluar" },
	{ "Help", 					"Bantuan" },
	{ "PleaseCheck", 			"Mohon diperiksa" },
	{ "UnableToConnect", 		"Koneksi gagal. Saat ini bantuan tidak bisa didapatkan dari situs web Ompiere" },
	//
	{ "AdempiereHomeInfo", 		"Ompiere Home adalah direktori utama" },
	{ "AdempiereHome", 			"Ompiere Home" },
	{ "WebPortInfo", 			"Port Web (HTML)" },
	{ "WebPort", 				"Port Web" },
	{ "AppsServerInfo", 		"Nama Server Aplikasi" },
	{ "AppsServer", 			"Server Aplikasi" },
	{ "DatabaseTypeInfo", 		"Tipe Database" },
	{ "DatabaseType", 			"Tipe Database" },
	{ "DatabaseNameInfo", 		"Nama Database (Service)" },
	{ "DatabaseName", 			"Nama Database" },
	{ "DatabasePortInfo", 		"Port Database Listener" },
	{ "DatabasePort", 			"Port Database" },
	{ "DatabaseUserInfo", 		"ID Pengguna untuk database Ompiere" },
	{ "DatabaseUser", 			"Pengguna Database" },
	{ "DatabasePasswordInfo", 	"Kata sandi pengguna untuk database Ompiere" },
	{ "DatabasePassword", 		"Kata Sandi Database" },
	{ "TNSNameInfo", 			"Database-database yang ditemukan" },
	{ "TNSName", 				"Pilih Database" },
	{ "SystemPasswordInfo", 	"Kata Sandi Pengguna Sistem" },
	{ "SystemPassword", 		"Kata Sandi Sistem" },
	{ "MailServerInfo", 		"Server Mail" },
	{ "MailServer", 			"Server Mail" },
	{ "AdminEMailInfo", 		"Email Ompiere Administrator" },
	{ "AdminEMail", 			"EMail Admin" },
	{ "DatabaseServerInfo", 	"Nama Database Server" },
	{ "DatabaseServer", 		"Server Database" },
	{ "JavaHomeInfo", 			"Java Home Folder" },
	{ "JavaHome", 				"Java Home" },
	{ "JNPPortInfo", 			"Port JNP untuk Server Aplikasi" },
	{ "JNPPort", 				"Port JNP" },
	{ "MailUserInfo", 			"Pengguna Ompiere Mail" },
	{ "MailUser", 				"Pengguna Mail" },
	{ "MailPasswordInfo", 		"Ompiere Mail User Password" },
	{ "MailPassword", 			"Kata Sandi Mail" },
	{ "KeyStorePassword",		"Kata Sandi KeyStore" },
	{ "KeyStorePasswordInfo",	"Kata Sandi untuk SSL Key Store" },
	//
	{ "JavaType",				"Java VM"},
	{ "JavaTypeInfo",			"Vendor Java VM"},
	{ "AppsType",				"Tipe Server"},
	{ "AppsTypeInfo",			"Tipe Server Aplikasi J2EE"},
	{ "DeployDir",				"Direktori"},
	{ "DeployDirInfo",			"Direktori sebar aplikasi J2EE"},
	{ "ErrorDeployDir",			"Error direktori sebar aplikasi J2EE"},
	//
	{ "TestInfo", 				"Uji Setup" },
	{ "Test", 					"Uji" },
	{ "SaveInfo", 				"Simpan Setup" },
	{ "Save", 					"Simpan" },
	{ "HelpInfo", 				"Cari Bantuan" },
	//
	{ "ServerError", 			"Error Setup Server" },
	{ "ErrorJavaHome", 			"Error Java Home" },
	{ "ErrorAdempiereHome", 		"Error Ompiere Home" },
	{ "ErrorAppsServer", 		"Error Server Aplikasi" },
	{ "ErrorWebPort", 			"Error Web Port" },
	{ "ErrorJNPPort", 			"Error JNP Port" },
	{ "ErrorDatabaseServer", 	"Error Database Server" },
	{ "ErrorDatabasePort", 		"Error Port Database" },
	{ "ErrorJDBC", 				"Error Koneksi JDBC" },
	{ "ErrorTNS", 				"Error Koneksi TNS" },
	{ "ErrorMailServer", 		"Error Mail Server" },
	{ "ErrorMail", 				"Error Mail" },
	{ "ErrorSave", 				"Error Simpan File" },

	{ "EnvironmentSaved", 		"File environment tersimpan .... Penyebaran dimulai\n"
		+ "Anda dapat me-restart Server Aplikasi setelah program selesai.\n"
		+ "Mohon periksa layar trace untuk error.\n" }

	};

	/**
	 * 	Get Contents
	 * 	@return contents
	 */
	public Object[][] getContents()
	{
		return contents;
	}	//	getContents

}	//	SerupRes
