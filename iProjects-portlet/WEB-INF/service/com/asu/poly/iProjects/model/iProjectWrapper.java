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

package com.asu.poly.iProjects.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link iProject}.
 * </p>
 *
 * @author    Shruthi
 * @see       iProject
 * @generated
 */
public class iProjectWrapper implements iProject, ModelWrapper<iProject> {
	public iProjectWrapper(iProject iProject) {
		_iProject = iProject;
	}

	public Class<?> getModelClass() {
		return iProject.class;
	}

	public String getModelClassName() {
		return iProject.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("projectID", getProjectID());
		attributes.put("projectTitle", getProjectTitle());
		attributes.put("projectdescription", getProjectdescription());
		attributes.put("sponsor", getSponsor());
		attributes.put("requiredSkills", getRequiredSkills());
		attributes.put("contact", getContact());
		attributes.put("status", getStatus());
		attributes.put("link", getLink());
		attributes.put("departments", getDepartments());
		attributes.put("dateAdded", getDateAdded());
		attributes.put("dateModified", getDateModified());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long projectID = (Long)attributes.get("projectID");

		if (projectID != null) {
			setProjectID(projectID);
		}

		String projectTitle = (String)attributes.get("projectTitle");

		if (projectTitle != null) {
			setProjectTitle(projectTitle);
		}

		String projectdescription = (String)attributes.get("projectdescription");

		if (projectdescription != null) {
			setProjectdescription(projectdescription);
		}

		String sponsor = (String)attributes.get("sponsor");

		if (sponsor != null) {
			setSponsor(sponsor);
		}

		String requiredSkills = (String)attributes.get("requiredSkills");

		if (requiredSkills != null) {
			setRequiredSkills(requiredSkills);
		}

		String contact = (String)attributes.get("contact");

		if (contact != null) {
			setContact(contact);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String link = (String)attributes.get("link");

		if (link != null) {
			setLink(link);
		}

		String departments = (String)attributes.get("departments");

		if (departments != null) {
			setDepartments(departments);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}

		Date dateModified = (Date)attributes.get("dateModified");

		if (dateModified != null) {
			setDateModified(dateModified);
		}
	}

	/**
	* Returns the primary key of this i project.
	*
	* @return the primary key of this i project
	*/
	public long getPrimaryKey() {
		return _iProject.getPrimaryKey();
	}

	/**
	* Sets the primary key of this i project.
	*
	* @param primaryKey the primary key of this i project
	*/
	public void setPrimaryKey(long primaryKey) {
		_iProject.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the project i d of this i project.
	*
	* @return the project i d of this i project
	*/
	public long getProjectID() {
		return _iProject.getProjectID();
	}

	/**
	* Sets the project i d of this i project.
	*
	* @param projectID the project i d of this i project
	*/
	public void setProjectID(long projectID) {
		_iProject.setProjectID(projectID);
	}

	/**
	* Returns the project title of this i project.
	*
	* @return the project title of this i project
	*/
	public java.lang.String getProjectTitle() {
		return _iProject.getProjectTitle();
	}

	/**
	* Sets the project title of this i project.
	*
	* @param projectTitle the project title of this i project
	*/
	public void setProjectTitle(java.lang.String projectTitle) {
		_iProject.setProjectTitle(projectTitle);
	}

	/**
	* Returns the projectdescription of this i project.
	*
	* @return the projectdescription of this i project
	*/
	public java.lang.String getProjectdescription() {
		return _iProject.getProjectdescription();
	}

	/**
	* Sets the projectdescription of this i project.
	*
	* @param projectdescription the projectdescription of this i project
	*/
	public void setProjectdescription(java.lang.String projectdescription) {
		_iProject.setProjectdescription(projectdescription);
	}

	/**
	* Returns the sponsor of this i project.
	*
	* @return the sponsor of this i project
	*/
	public java.lang.String getSponsor() {
		return _iProject.getSponsor();
	}

	/**
	* Sets the sponsor of this i project.
	*
	* @param sponsor the sponsor of this i project
	*/
	public void setSponsor(java.lang.String sponsor) {
		_iProject.setSponsor(sponsor);
	}

	/**
	* Returns the required skills of this i project.
	*
	* @return the required skills of this i project
	*/
	public java.lang.String getRequiredSkills() {
		return _iProject.getRequiredSkills();
	}

	/**
	* Sets the required skills of this i project.
	*
	* @param requiredSkills the required skills of this i project
	*/
	public void setRequiredSkills(java.lang.String requiredSkills) {
		_iProject.setRequiredSkills(requiredSkills);
	}

	/**
	* Returns the contact of this i project.
	*
	* @return the contact of this i project
	*/
	public java.lang.String getContact() {
		return _iProject.getContact();
	}

	/**
	* Sets the contact of this i project.
	*
	* @param contact the contact of this i project
	*/
	public void setContact(java.lang.String contact) {
		_iProject.setContact(contact);
	}

	/**
	* Returns the status of this i project.
	*
	* @return the status of this i project
	*/
	public java.lang.String getStatus() {
		return _iProject.getStatus();
	}

	/**
	* Sets the status of this i project.
	*
	* @param status the status of this i project
	*/
	public void setStatus(java.lang.String status) {
		_iProject.setStatus(status);
	}

	/**
	* Returns the link of this i project.
	*
	* @return the link of this i project
	*/
	public java.lang.String getLink() {
		return _iProject.getLink();
	}

	/**
	* Sets the link of this i project.
	*
	* @param link the link of this i project
	*/
	public void setLink(java.lang.String link) {
		_iProject.setLink(link);
	}

	/**
	* Returns the departments of this i project.
	*
	* @return the departments of this i project
	*/
	public java.lang.String getDepartments() {
		return _iProject.getDepartments();
	}

	/**
	* Sets the departments of this i project.
	*
	* @param departments the departments of this i project
	*/
	public void setDepartments(java.lang.String departments) {
		_iProject.setDepartments(departments);
	}

	/**
	* Returns the date added of this i project.
	*
	* @return the date added of this i project
	*/
	public java.util.Date getDateAdded() {
		return _iProject.getDateAdded();
	}

	/**
	* Sets the date added of this i project.
	*
	* @param dateAdded the date added of this i project
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_iProject.setDateAdded(dateAdded);
	}

	/**
	* Returns the date modified of this i project.
	*
	* @return the date modified of this i project
	*/
	public java.util.Date getDateModified() {
		return _iProject.getDateModified();
	}

	/**
	* Sets the date modified of this i project.
	*
	* @param dateModified the date modified of this i project
	*/
	public void setDateModified(java.util.Date dateModified) {
		_iProject.setDateModified(dateModified);
	}

	public boolean isNew() {
		return _iProject.isNew();
	}

	public void setNew(boolean n) {
		_iProject.setNew(n);
	}

	public boolean isCachedModel() {
		return _iProject.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_iProject.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _iProject.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _iProject.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_iProject.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _iProject.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_iProject.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new iProjectWrapper((iProject)_iProject.clone());
	}

	public int compareTo(com.asu.poly.iProjects.model.iProject iProject) {
		return _iProject.compareTo(iProject);
	}

	@Override
	public int hashCode() {
		return _iProject.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.asu.poly.iProjects.model.iProject> toCacheModel() {
		return _iProject.toCacheModel();
	}

	public com.asu.poly.iProjects.model.iProject toEscapedModel() {
		return new iProjectWrapper(_iProject.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _iProject.toString();
	}

	public java.lang.String toXmlString() {
		return _iProject.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_iProject.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public iProject getWrappediProject() {
		return _iProject;
	}

	public iProject getWrappedModel() {
		return _iProject;
	}

	public void resetOriginalValues() {
		_iProject.resetOriginalValues();
	}

	private iProject _iProject;
}