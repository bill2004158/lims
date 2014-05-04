/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.marcelmika.lims.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Panel service. Represents a row in the &quot;LiferayLIMS_Panel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.marcelmika.lims.model.impl.PanelModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.marcelmika.lims.model.impl.PanelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Panel
 * @see com.marcelmika.lims.model.impl.PanelImpl
 * @see com.marcelmika.lims.model.impl.PanelModelImpl
 * @generated
 */
public interface PanelModel extends BaseModel<Panel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a panel model instance should use the {@link Panel} interface instead.
	 */

	/**
	 * Returns the primary key of this panel.
	 *
	 * @return the primary key of this panel
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this panel.
	 *
	 * @param primaryKey the primary key of this panel
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the pid of this panel.
	 *
	 * @return the pid of this panel
	 */
	public long getPid();

	/**
	 * Sets the pid of this panel.
	 *
	 * @param pid the pid of this panel
	 */
	public void setPid(long pid);

	/**
	 * Returns the user ID of this panel.
	 *
	 * @return the user ID of this panel
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this panel.
	 *
	 * @param userId the user ID of this panel
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this panel.
	 *
	 * @return the user uuid of this panel
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this panel.
	 *
	 * @param userUuid the user uuid of this panel
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the active panel ID of this panel.
	 *
	 * @return the active panel ID of this panel
	 */
	@AutoEscape
	public String getActivePanelId();

	/**
	 * Sets the active panel ID of this panel.
	 *
	 * @param activePanelId the active panel ID of this panel
	 */
	public void setActivePanelId(String activePanelId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Panel panel);

	public int hashCode();

	public CacheModel<Panel> toCacheModel();

	public Panel toEscapedModel();

	public Panel toUnescapedModel();

	public String toString();

	public String toXmlString();
}