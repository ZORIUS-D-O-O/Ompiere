/******************************************************************************
 * Copyright (C) 2012 Trek Global                                             *
 * Product: Ompiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.adempiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.PO;
import org.compiere.model.X_AD_BroadcastMessage;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.idempiere.cache.ImmutableIntPOCache;
import org.idempiere.cache.ImmutablePOSupport;

/**
 * Extended model class for AD_BroadcastMessage
 * @author Vivek
 * @author Deepak Pansheriya
 */
public class MBroadcastMessage extends X_AD_BroadcastMessage implements ImmutablePOSupport
{
	/**
	 * generated serial id
	 */
	private static final long serialVersionUID = 3733943472482553977L;
	public final static String CLIENTINFO_BROADCAST_COMPONENT_ID = "#clientInfo_BroadcastComponentId";
	static private ImmutableIntPOCache<Integer,MBroadcastMessage> s_cache = new ImmutableIntPOCache<Integer,MBroadcastMessage>("AD_BroadcastMessage", 30, 60);

    /**
     * UUID based Constructor
     * @param ctx  Context
     * @param AD_BroadcastMessage_UU  UUID key
     * @param trxName Transaction
     */
    public MBroadcastMessage(Properties ctx, String AD_BroadcastMessage_UU, String trxName) {
        super(ctx, AD_BroadcastMessage_UU, trxName);
    }

    /**
     * @param ctx
     * @param AD_BroadcastMessage_ID
     * @param trxName
     */
    public MBroadcastMessage(Properties ctx, int AD_BroadcastMessage_ID, String trxName)
    {
		super(ctx, AD_BroadcastMessage_ID, trxName);
	}
    
    /**
     * @param ctx
     * @param rs
     * @param trxName
     */
    public MBroadcastMessage(Properties ctx, ResultSet rs, String trxName)
    {
    	super(ctx, rs, trxName);
    }
    
    /**
     * Copy constructor
     * @param copy
     */
    public MBroadcastMessage(MBroadcastMessage copy)
    {
    	this(Env.getCtx(), copy);
    }
    
    /**
     * Copy constructor
     * @param ctx
     * @param copy
     */
    public MBroadcastMessage(Properties ctx, MBroadcastMessage copy)
    {
    	this(ctx, copy, (String)null);
    }
    
    /**
     * Copy constructor
     * @param ctx
     * @param copy
     * @param trxName
     */
    public MBroadcastMessage(Properties ctx, MBroadcastMessage copy, String trxName)
    {
    	this(ctx, 0, trxName);
    	copyPO(copy);
    }
    
    /**
     * Get MBroadcastMessage from cache (immutable)
     * @param AD_BroadcastMessage_ID
     * @return MBroadcastMessage or null
     */
	public static MBroadcastMessage get (int AD_BroadcastMessage_ID)
	{
		return get(Env.getCtx(), AD_BroadcastMessage_ID);
	}
	
    /**
     * Get MBroadcastMessage from cache (immutable)
     * @param ctx
     * @param AD_BroadcastMessage_ID
     * @return MBroadcastMessage or null
     */
	public static MBroadcastMessage get (Properties ctx, int AD_BroadcastMessage_ID)
	{
		Integer key = Integer.valueOf(AD_BroadcastMessage_ID);
		MBroadcastMessage retValue = s_cache.get(ctx, key, e -> new MBroadcastMessage(ctx, e));
		if (retValue == null)
		{
			try {
	            PO.setCrossTenantSafe();
	            // Here we can receive messages from another tenant and discard them
				retValue = new MBroadcastMessage (ctx, AD_BroadcastMessage_ID, (String)null);
	        } finally {
	            PO.clearCrossTenantSafe();
	        }
			if (retValue.get_ID() != AD_BroadcastMessage_ID)
				return null;
			s_cache.put(key, retValue, e -> new MBroadcastMessage(Env.getCtx(), e));
		}
		if (retValue != null
			&& retValue.getAD_Client_ID() != 0
			&& retValue.getAD_Client_ID() != Env.getAD_Client_ID(ctx))
			return null;
		return retValue;
	}	//	get
    
	
	/**
	 * Is broadcast message applicable to current login user
	 * @return true if applicable, false otherwise
	 */
    public boolean isValidUserforMessage()
    {
    	Properties ctx = Env.getCtx();
		
    	if(getBroadcastType()!=null && getBroadcastType().equals(BROADCASTTYPE_Immediate) && getTarget()!=null){
			if (getTarget().equals(TARGET_Role) ) {
				String sql = "SELECT COUNT(*) FROM AD_User_Roles WHERE AD_Role_ID = ? AND AD_User_ID=? AND IsActive='Y'";
				int roleSubs = DB.getSQLValue(null, sql, getAD_Role_ID(),Env.getAD_User_ID(ctx));
				if(roleSubs>0)
					return true;
			} else if (getTarget().equals(TARGET_User) && getAD_User_ID() == Env.getAD_User_ID(ctx)) {
				return true;
			} else if (getTarget().equals(TARGET_Client) && getAD_Client_ID() == Env.getAD_Client_ID(ctx)) {
				return true;
			}else if (getTarget().equals(TARGET_Everybody)){
				return true;
			}
		}
    	else {
    		
			int AD_User_ID = Env.getAD_User_ID(ctx);
			String sql = "SELECT AD_User_ID from AD_Note WHERE AD_BroadcastMessage_ID = ?  AND AD_User_ID = ? ";
			int result = DB.getSQLValue(null, sql,getAD_BroadcastMessage_ID(),AD_User_ID);
			if (result <= 0) {
				return false;
			}
			else{
				return true;
			}
		}
    	return false;
    }
    
    @Override
	protected boolean beforeSave (boolean newRecord)
	{
		if (BROADCASTTYPE_Immediate.equals(getBroadcastType())) {
			setBroadcastFrequency(BROADCASTFREQUENCY_JustOnce);
		}
		boolean logack =
			(   BROADCASTFREQUENCY_UntilAcknowledge.equals(getBroadcastFrequency())
			 || BROADCASTFREQUENCY_UntilExpirationOrAcknowledge.equals(getBroadcastFrequency()));
		setLogAcknowledge(logack);
		return true;
	}
    
	@Override
	public MBroadcastMessage markImmutable() {
		if (is_Immutable())
			return this;

		makeImmutable();
		return this;
	}

	@Override
	public String get_Translation (String columnName) {
		String translation = super.get_Translation(columnName);
		if (!Util.isEmpty(translation) && translation.indexOf('@') > 0)
			return Env.parseContext(getCtx(), 0, translation, false, false);

		return translation;
	}

	/** 
	 * Returns a link to be used in broadcast messages to open a record
	 * @param po PO
	 * @param windowUUID of the window
	 * @param text of the link
	 * @return the URL link to set in the broadcast message
	 */
	public String getUrlZoom(PO po, String windowUUID, String text) {
		StringBuilder url = new StringBuilder("");
		url.append("<a href=\"javascript:void(0)\" class=\"rp-href\" onclick=\"window.idempiere.zoomWindow(@" + CLIENTINFO_BROADCAST_COMPONENT_ID + "@, '");
		url.append(po.get_KeyColumns()[0]);
		url.append("', '").append(po.get_ID()).append("','").append(windowUUID).append("')\">");
		url.append(text);
		url.append("</a>");

		return url.toString();
	}
}
