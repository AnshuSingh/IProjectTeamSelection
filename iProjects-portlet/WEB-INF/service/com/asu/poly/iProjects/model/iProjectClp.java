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

import com.asu.poly.iProjects.service.iProjectLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Shruthi
 */
public class iProjectClp extends BaseModelImpl<iProject> implements iProject {
	public iProjectClp() {
	}

	public Class<?> getModelClass() {
		return iProject.class;
	}

	public String getModelClassName() {
		return iProject.class.getName();
	}

	public long getPrimaryKey() {
		return _projectID;
	}

	public void setPrimaryKey(long primaryKey) {
		setProjectID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_projectID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getProjectID() {
		return _projectID;
	}

	public void setProjectID(long projectID) {
		_projectID = projectID;
	}

	public String getProjectTitle() {
		return _projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		_projectTitle = projectTitle;
	}

	public String getProjectdescription() {
		return _projectdescription;
	}

	public void setProjectdescription(String projectdescription) {
		_projectdescription = projectdescription;
	}

	public String getSponsor() {
		return _sponsor;
	}

	public void setSponsor(String sponsor) {
		_sponsor = sponsor;
	}

	public String getRequiredSkills() {
		return _requiredSkills;
	}

	public void setRequiredSkills(String requiredSkills) {
		_requiredSkills = requiredSkills;
	}

	public String getContact() {
		return _contact;
	}

	public void setContact(String contact) {
		_contact = contact;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getLink() {
		return _link;
	}

	public void setLink(String link) {
		_link = link;
	}

	public String getDepartments() {
		return _departments;
	}

	public void setDepartments(String departments) {
		_departments = departments;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	public Date getDateModified() {
		return _dateModified;
	}

	public void setDateModified(Date dateModified) {
		_dateModified = dateModified;
	}

	public BaseModel<?> getiProjectRemoteModel() {
		return _iProjectRemoteModel;
	}

	public void setiProjectRemoteModel(BaseModel<?> iProjectRemoteModel) {
		_iProjectRemoteModel = iProjectRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			iProjectLocalServiceUtil.addiProject(this);
		}
		else {
			iProjectLocalServiceUtil.updateiProject(this);
		}
	}

	@Override
	public iProject toEscapedModel() {
		return (iProject)Proxy.newProxyInstance(iProject.class.getClassLoader(),
			new Class[] { iProject.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		iProjectClp clone = new iProjectClp();

		clone.setProjectID(getProjectID());
		clone.setProjectTitle(getProjectTitle());
		clone.setProjectdescription(getProjectdescription());
		clone.setSponsor(getSponsor());
		clone.setRequiredSkills(getRequiredSkills());
		clone.setContact(getContact());
		clone.setStatus(getStatus());
		clone.setLink(getLink());
		clone.setDepartments(getDepartments());
		clone.setDateAdded(getDateAdded());
		clone.setDateModified(getDateModified());

		return clone;
	}

	public int compareTo(iProject iProject) {
		long primaryKey = iProject.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		iProjectClp iProject = null;

		try {
			iProject = (iProjectClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = iProject.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{projectID=");
		sb.append(getProjectID());
		sb.append(", projectTitle=");
		sb.append(getProjectTitle());
		sb.append(", projectdescription=");
		sb.append(getProjectdescription());
		sb.append(", sponsor=");
		sb.append(getSponsor());
		sb.append(", requiredSkills=");
		sb.append(getRequiredSkills());
		sb.append(", contact=");
		sb.append(getContact());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", link=");
		sb.append(getLink());
		sb.append(", departments=");
		sb.append(getDepartments());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append(", dateModified=");
		sb.append(getDateModified());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.asu.poly.iProjects.model.iProject");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>projectID</column-name><column-value><![CDATA[");
		sb.append(getProjectID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectTitle</column-name><column-value><![CDATA[");
		sb.append(getProjectTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectdescription</column-name><column-value><![CDATA[");
		sb.append(getProjectdescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sponsor</column-name><column-value><![CDATA[");
		sb.append(getSponsor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requiredSkills</column-name><column-value><![CDATA[");
		sb.append(getRequiredSkills());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contact</column-name><column-value><![CDATA[");
		sb.append(getContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>link</column-name><column-value><![CDATA[");
		sb.append(getLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departments</column-name><column-value><![CDATA[");
		sb.append(getDepartments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateModified</column-name><column-value><![CDATA[");
		sb.append(getDateModified());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _projectID;
	private String _projectTitle;
	private String _projectdescription;
	private String _sponsor;
	private String _requiredSkills;
	private String _contact;
	private String _status;
	private String _link;
	private String _departments;
	private Date _dateAdded;
	private Date _dateModified;
	private BaseModel<?> _iProjectRemoteModel;
}