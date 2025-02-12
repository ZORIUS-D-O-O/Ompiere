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
package org.adempiere.webui.desktop;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.adempiere.exceptions.AdempiereException;
import org.adempiere.util.Callback;
import org.adempiere.webui.component.FavoriteSimpleTreeModel;
import org.adempiere.webui.dashboard.DPFavourites;
import org.compiere.model.I_AD_Tree_Favorite;
import org.compiere.model.MMenu;
import org.compiere.model.MTable;
import org.compiere.model.MTreeFavorite;
import org.compiere.model.MTreeFavoriteNode;
import org.compiere.model.MTreeNode;
import org.compiere.model.MUser;
import org.compiere.model.PO;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.zkoss.zk.ui.Session;
import org.zkoss.zul.DefaultTreeNode;
import org.zkoss.zul.Tree;

/**
 * Controller for favourite menu nodes
 * @author hengsin
 * @author Logilite Technologies - IDEMPIERE-3340
 */
public class FavouriteController
{
	/** Session attribute to store FavouriteController reference */
	private static final String	DESKTOP_FAVOURITE_CONTROLLER	= "desktop.FavouriteController";
	/** Node_ID:MTreeNode */
	private Map<Integer, MTreeNode>		nodeMap;
	private int							m_AD_Tree_Favorite_ID;

	private MTreeNode					rootNode;
	private List<Callback<Integer>>		deletedCallbacks;
	private List<Callback<MTreeNode>>	insertedCallbacks;

	private Tree						tree;
	private FavoriteSimpleTreeModel		treeModel;

	/**
	 * Private constructor.<br/>
	 * Use {@link #getInstance(Session)} to get singleton instance for a Session.
	 */
	private FavouriteController()
	{
		init();
	}

	/**
	 * Load user favourites
	 */
	private void init()
	{
		nodeMap = new LinkedHashMap<>();
		deletedCallbacks = new ArrayList<>();
		insertedCallbacks = new ArrayList<>();

		int AD_User_ID = Env.getAD_User_ID(Env.getCtx());

		MTreeFavorite vTree = null;
		m_AD_Tree_Favorite_ID = MTreeFavorite.getFavoriteTreeID(AD_User_ID);
		if (m_AD_Tree_Favorite_ID <= 0)
		{
			vTree = (MTreeFavorite) MTable.get(Env.getCtx(), MTreeFavorite.Table_ID).getPO(0, null);
			MUser user = MUser.get(AD_User_ID);
			vTree.set_ValueOfColumn(I_AD_Tree_Favorite.COLUMNNAME_AD_Client_ID, user.getAD_Client_ID());
			vTree.setAD_Org_ID(user.getAD_Org_ID());
			// Support for System user
			vTree.set_ValueNoCheck(MTreeFavorite.COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
			if (!vTree.saveCrossTenantSafe())
				throw new AdempiereException(Msg.getMsg(Env.getCtx(), "FavTreeNotCreate"));

			m_AD_Tree_Favorite_ID = vTree.getAD_Tree_Favorite_ID();
		}

		vTree = (MTreeFavorite) MTable.get(Env.getCtx(), MTreeFavorite.Table_ID).getPO(m_AD_Tree_Favorite_ID, null);

		rootNode = vTree.getRoot();
		Enumeration<?> enTop = rootNode.children();
		while (enTop.hasMoreElements())
		{
			MTreeNode ndTop = (MTreeNode) enTop.nextElement();
			Enumeration<?> en = ndTop.preorderEnumeration();
			while (en.hasMoreElements())
			{
				MTreeNode nd = (MTreeNode) en.nextElement();
				if (nd.isOnBar() && nd.getMenu_ID() > 0)
				{
					nodeMap.put(nd.getMenu_ID(), nd);
				}
			}
		}
	} // init

	/**
	 * Get favourites controller instance for current session
	 * 
	 * @param  currSess
	 * @return FavouriteController session instance
	 */
	public static synchronized FavouriteController getInstance(Session currSess)
	{
		FavouriteController controller = (FavouriteController) currSess.getAttribute(DESKTOP_FAVOURITE_CONTROLLER);

		if (controller == null)
		{
			controller = new FavouriteController();
			currSess.setAttribute(DESKTOP_FAVOURITE_CONTROLLER, controller);
		}
		return controller;
	} // getInstance

	/**
	 * Update favorite node record
	 * @param add true for add, false for delete
	 * @param Menu_ID
	 * @return true if add/delete is successful
	 */
	private boolean barUpdate(boolean add, int Menu_ID)
	{
		if (add)
		{
			MTreeFavoriteNode.create(	Env.getAD_Client_ID(Env.getCtx()), Env.getContextAsInt(Env.getCtx(), Env.AD_ORG_ID), m_AD_Tree_Favorite_ID, Menu_ID, 0, 0,
										null, false, true, true);
			return true;
		}
		else
		{
			MTreeFavoriteNode favNode = MTreeFavoriteNode.getFavouriteTreeNodeFromMenuID(m_AD_Tree_Favorite_ID, Menu_ID);
			if (favNode != null) {
				try {
					//For service users, needs to persist data in system tenant
					PO.setCrossTenantSafe();
					return favNode.delete(true);
				}finally {
					PO.clearCrossTenantSafe();
				}
			}
		}
		return false;
	} // barUpdate

	/**
	 * Add node (by node id) to favourties
	 * 
	 * @param  nodeId
	 * @return true if successfully added
	 */
	public boolean addNode(int nodeId)
	{
		MTreeNode node = rootNode.findNode(nodeId);
		if (node != null)
		{
			return addNode(node);
		}
		return false;
	} // addNode

	/**
	 * Add tree node to favourites
	 * 
	 * @param  node
	 * @return true if successfully added
	 */
	public boolean addNode(MTreeNode node)
	{
		if (barUpdate(true, node.getNode_ID()))
		{
			nodeMap.put(node.getNode_ID(), node);
			if (tree != null && treeModel != null)
			{
				MMenu menu = (MMenu) MTable.get(Env.getCtx(), MMenu.Table_ID).getPO(node.getNode_ID(), null);
				MTreeFavoriteNode favNode = MTreeFavoriteNode.getFavouriteTreeNodeFromMenuID(m_AD_Tree_Favorite_ID, menu.getAD_Menu_ID());

				DPFavourites.addNodeInTree(treeModel, tree, treeModel.getRoot(), favNode);
			}

			for (Callback<MTreeNode> callback : insertedCallbacks)
			{
				callback.onCallback(node);
			}
			return true;
		}
		return false;
	} // addNode

	/**
	 * Remove node (by node id) from favourites
	 * 
	 * @param  nodeId
	 * @return true if found and remove
	 */
	public boolean removeNode(int nodeId)
	{
		MTreeFavoriteNode favNode = MTreeFavoriteNode.getFavouriteTreeNodeFromMenuID(m_AD_Tree_Favorite_ID, nodeId);
		if (favNode != null && barUpdate(false, nodeId))
		{
			if (treeModel != null)
			{
				DefaultTreeNode<Object> treeNode = treeModel.find(treeModel.getRoot(), favNode.getAD_Tree_Favorite_Node_ID());
				if(treeNode != null)
					treeModel.removeNode(treeNode);
			}

			nodeMap.remove(nodeId);
			for (Callback<Integer> callback : deletedCallbacks)
			{
				callback.onCallback(nodeId);
			}
			return true;
		}
		return false;
	} // removeNode

	/**
	 * @param  nodeId
	 * @return true if node id is in the current favourites list
	 */
	public boolean hasNode(int nodeId)
	{
		return nodeMap.keySet().contains(nodeId);
	} // hasNode

	/**
	 * @return List of favourites node
	 */
	public List<MTreeNode> getFavourites()
	{
		List<MTreeNode> list = new ArrayList<>();
		for (int key : nodeMap.keySet())
		{
			list.add(nodeMap.get(key));
		}
		return list;
	} // getFavourites

	/**
	 * Add callback for after add node to favourites
	 * 
	 * @param callback
	 */
	public void addInsertedCallback(Callback<MTreeNode> callback)
	{
		insertedCallbacks.add(callback);
	}

	/**
	 * Add callback for after remove node from favourites
	 * 
	 * @param callback
	 */
	public void addDeletedCallback(Callback<Integer> callback)
	{
		deletedCallbacks.add(callback);
	}

	/**
	 * @return AD_Tree_Favorite_ID
	 */
	public int getAD_Tree_Favorite_ID()
	{
		return m_AD_Tree_Favorite_ID;
	}

	/**
	 * @return root MTreeNode
	 */
	public MTreeNode getRootNode()
	{
		return rootNode;
	}

	/**
	 * @param treeModel FavoriteSimpleTreeModel
	 * @param tree Tree
	 */
	public void setTreeAndModel(FavoriteSimpleTreeModel treeModel, Tree tree)
	{
		this.tree = tree;
		this.treeModel = treeModel;
	}
}
