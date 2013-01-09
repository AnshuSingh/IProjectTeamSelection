/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.asu.poly.teams.randomCreate.slayer.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Projectdetail service. Represents a row in the &quot;project_projectdetail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.asu.poly.teams.randomCreate.slayer.model.impl.ProjectdetailModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.asu.poly.teams.randomCreate.slayer.model.impl.ProjectdetailImpl}.
 * </p>
 *
 * @author asingh64
 * @see Projectdetail
 * @see com.asu.poly.teams.randomCreate.slayer.model.impl.ProjectdetailImpl
 * @see com.asu.poly.teams.randomCreate.slayer.model.impl.ProjectdetailModelImpl
 * @generated
 */
public interface ProjectdetailModel extends BaseModel<Projectdetail> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a projectdetail model instance should use the {@link Projectdetail} interface instead.
	 */

	/**
	 * Returns the primary key of this projectdetail.
	 *
	 * @return the primary key of this projectdetail
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this projectdetail.
	 *
	 * @param primaryKey the primary key of this projectdetail
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the project i d of this projectdetail.
	 *
	 * @return the project i d of this projectdetail
	 */
	public long getProjectID();

	/**
	 * Sets the project i d of this projectdetail.
	 *
	 * @param projectID the project i d of this projectdetail
	 */
	public void setProjectID(long projectID);

	/**
	 * Returns the project title of this projectdetail.
	 *
	 * @return the project title of this projectdetail
	 */
	@AutoEscape
	public String getProjectTitle();

	/**
	 * Sets the project title of this projectdetail.
	 *
	 * @param projectTitle the project title of this projectdetail
	 */
	public void setProjectTitle(String projectTitle);

	/**
	 * Returns the projectdescription of this projectdetail.
	 *
	 * @return the projectdescription of this projectdetail
	 */
	@AutoEscape
	public String getProjectdescription();

	/**
	 * Sets the projectdescription of this projectdetail.
	 *
	 * @param projectdescription the projectdescription of this projectdetail
	 */
	public void setProjectdescription(String projectdescription);

	/**
	 * Returns the projectrequiredskill of this projectdetail.
	 *
	 * @return the projectrequiredskill of this projectdetail
	 */
	@AutoEscape
	public String getProjectrequiredskill();

	/**
	 * Sets the projectrequiredskill of this projectdetail.
	 *
	 * @param projectrequiredskill the projectrequiredskill of this projectdetail
	 */
	public void setProjectrequiredskill(String projectrequiredskill);

	/**
	 * Returns the contact of this projectdetail.
	 *
	 * @return the contact of this projectdetail
	 */
	@AutoEscape
	public String getContact();

	/**
	 * Sets the contact of this projectdetail.
	 *
	 * @param contact the contact of this projectdetail
	 */
	public void setContact(String contact);

	/**
	 * Returns the date added of this projectdetail.
	 *
	 * @return the date added of this projectdetail
	 */
	public Date getDateAdded();

	/**
	 * Sets the date added of this projectdetail.
	 *
	 * @param dateAdded the date added of this projectdetail
	 */
	public void setDateAdded(Date dateAdded);

	/**
	 * Returns the date modified of this projectdetail.
	 *
	 * @return the date modified of this projectdetail
	 */
	public Date getDateModified();

	/**
	 * Sets the date modified of this projectdetail.
	 *
	 * @param dateModified the date modified of this projectdetail
	 */
	public void setDateModified(Date dateModified);

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

	public int compareTo(Projectdetail projectdetail);

	public int hashCode();

	public CacheModel<Projectdetail> toCacheModel();

	public Projectdetail toEscapedModel();

	public String toString();

	public String toXmlString();
}