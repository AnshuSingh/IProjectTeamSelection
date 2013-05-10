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

package com.asu.poly.iProjects.model.impl;

import com.asu.poly.iProjects.model.iProject;
import com.asu.poly.iProjects.model.iProjectModel;
import com.asu.poly.iProjects.model.iProjectSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the iProject service. Represents a row in the &quot;poly_iProject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.asu.poly.iProjects.model.iProjectModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link iProjectImpl}.
 * </p>
 *
 * @author Shruthi
 * @see iProjectImpl
 * @see com.asu.poly.iProjects.model.iProject
 * @see com.asu.poly.iProjects.model.iProjectModel
 * @generated
 */
@JSON(strict = true)
public class iProjectModelImpl extends BaseModelImpl<iProject>
	implements iProjectModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a i project model instance should use the {@link com.asu.poly.iProjects.model.iProject} interface instead.
	 */
	public static final String TABLE_NAME = "poly_iProject";
	public static final Object[][] TABLE_COLUMNS = {
			{ "projectID", Types.BIGINT },
			{ "projectTitle", Types.VARCHAR },
			{ "projectdescription", Types.VARCHAR },
			{ "sponsor", Types.VARCHAR },
			{ "requiredSkills", Types.VARCHAR },
			{ "contact", Types.VARCHAR },
			{ "status", Types.VARCHAR },
			{ "link", Types.VARCHAR },
			{ "departments", Types.VARCHAR },
			{ "dateAdded", Types.TIMESTAMP },
			{ "dateModified", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table poly_iProject (projectID LONG not null primary key,projectTitle VARCHAR(75) null,projectdescription VARCHAR(75) null,sponsor VARCHAR(75) null,requiredSkills VARCHAR(75) null,contact VARCHAR(75) null,status VARCHAR(75) null,link VARCHAR(75) null,departments VARCHAR(75) null,dateAdded DATE null,dateModified DATE null)";
	public static final String TABLE_SQL_DROP = "drop table poly_iProject";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.asu.poly.iProjects.model.iProject"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.asu.poly.iProjects.model.iProject"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static iProject toModel(iProjectSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		iProject model = new iProjectImpl();

		model.setProjectID(soapModel.getProjectID());
		model.setProjectTitle(soapModel.getProjectTitle());
		model.setProjectdescription(soapModel.getProjectdescription());
		model.setSponsor(soapModel.getSponsor());
		model.setRequiredSkills(soapModel.getRequiredSkills());
		model.setContact(soapModel.getContact());
		model.setStatus(soapModel.getStatus());
		model.setLink(soapModel.getLink());
		model.setDepartments(soapModel.getDepartments());
		model.setDateAdded(soapModel.getDateAdded());
		model.setDateModified(soapModel.getDateModified());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<iProject> toModels(iProjectSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<iProject> models = new ArrayList<iProject>(soapModels.length);

		for (iProjectSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.asu.poly.iProjects.model.iProject"));

	public iProjectModelImpl() {
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

	public Class<?> getModelClass() {
		return iProject.class;
	}

	public String getModelClassName() {
		return iProject.class.getName();
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

	@JSON
	public long getProjectID() {
		return _projectID;
	}

	public void setProjectID(long projectID) {
		_projectID = projectID;
	}

	@JSON
	public String getProjectTitle() {
		if (_projectTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _projectTitle;
		}
	}

	public void setProjectTitle(String projectTitle) {
		_projectTitle = projectTitle;
	}

	@JSON
	public String getProjectdescription() {
		if (_projectdescription == null) {
			return StringPool.BLANK;
		}
		else {
			return _projectdescription;
		}
	}

	public void setProjectdescription(String projectdescription) {
		_projectdescription = projectdescription;
	}

	@JSON
	public String getSponsor() {
		if (_sponsor == null) {
			return StringPool.BLANK;
		}
		else {
			return _sponsor;
		}
	}

	public void setSponsor(String sponsor) {
		_sponsor = sponsor;
	}

	@JSON
	public String getRequiredSkills() {
		if (_requiredSkills == null) {
			return StringPool.BLANK;
		}
		else {
			return _requiredSkills;
		}
	}

	public void setRequiredSkills(String requiredSkills) {
		_requiredSkills = requiredSkills;
	}

	@JSON
	public String getContact() {
		if (_contact == null) {
			return StringPool.BLANK;
		}
		else {
			return _contact;
		}
	}

	public void setContact(String contact) {
		_contact = contact;
	}

	@JSON
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	public void setStatus(String status) {
		_status = status;
	}

	@JSON
	public String getLink() {
		if (_link == null) {
			return StringPool.BLANK;
		}
		else {
			return _link;
		}
	}

	public void setLink(String link) {
		_link = link;
	}

	@JSON
	public String getDepartments() {
		if (_departments == null) {
			return StringPool.BLANK;
		}
		else {
			return _departments;
		}
	}

	public void setDepartments(String departments) {
		_departments = departments;
	}

	@JSON
	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	@JSON
	public Date getDateModified() {
		return _dateModified;
	}

	public void setDateModified(Date dateModified) {
		_dateModified = dateModified;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			iProject.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public iProject toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (iProject)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		iProjectImpl iProjectImpl = new iProjectImpl();

		iProjectImpl.setProjectID(getProjectID());
		iProjectImpl.setProjectTitle(getProjectTitle());
		iProjectImpl.setProjectdescription(getProjectdescription());
		iProjectImpl.setSponsor(getSponsor());
		iProjectImpl.setRequiredSkills(getRequiredSkills());
		iProjectImpl.setContact(getContact());
		iProjectImpl.setStatus(getStatus());
		iProjectImpl.setLink(getLink());
		iProjectImpl.setDepartments(getDepartments());
		iProjectImpl.setDateAdded(getDateAdded());
		iProjectImpl.setDateModified(getDateModified());

		iProjectImpl.resetOriginalValues();

		return iProjectImpl;
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

		iProject iProject = null;

		try {
			iProject = (iProject)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<iProject> toCacheModel() {
		iProjectCacheModel iProjectCacheModel = new iProjectCacheModel();

		iProjectCacheModel.projectID = getProjectID();

		iProjectCacheModel.projectTitle = getProjectTitle();

		String projectTitle = iProjectCacheModel.projectTitle;

		if ((projectTitle != null) && (projectTitle.length() == 0)) {
			iProjectCacheModel.projectTitle = null;
		}

		iProjectCacheModel.projectdescription = getProjectdescription();

		String projectdescription = iProjectCacheModel.projectdescription;

		if ((projectdescription != null) && (projectdescription.length() == 0)) {
			iProjectCacheModel.projectdescription = null;
		}

		iProjectCacheModel.sponsor = getSponsor();

		String sponsor = iProjectCacheModel.sponsor;

		if ((sponsor != null) && (sponsor.length() == 0)) {
			iProjectCacheModel.sponsor = null;
		}

		iProjectCacheModel.requiredSkills = getRequiredSkills();

		String requiredSkills = iProjectCacheModel.requiredSkills;

		if ((requiredSkills != null) && (requiredSkills.length() == 0)) {
			iProjectCacheModel.requiredSkills = null;
		}

		iProjectCacheModel.contact = getContact();

		String contact = iProjectCacheModel.contact;

		if ((contact != null) && (contact.length() == 0)) {
			iProjectCacheModel.contact = null;
		}

		iProjectCacheModel.status = getStatus();

		String status = iProjectCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			iProjectCacheModel.status = null;
		}

		iProjectCacheModel.link = getLink();

		String link = iProjectCacheModel.link;

		if ((link != null) && (link.length() == 0)) {
			iProjectCacheModel.link = null;
		}

		iProjectCacheModel.departments = getDepartments();

		String departments = iProjectCacheModel.departments;

		if ((departments != null) && (departments.length() == 0)) {
			iProjectCacheModel.departments = null;
		}

		Date dateAdded = getDateAdded();

		if (dateAdded != null) {
			iProjectCacheModel.dateAdded = dateAdded.getTime();
		}
		else {
			iProjectCacheModel.dateAdded = Long.MIN_VALUE;
		}

		Date dateModified = getDateModified();

		if (dateModified != null) {
			iProjectCacheModel.dateModified = dateModified.getTime();
		}
		else {
			iProjectCacheModel.dateModified = Long.MIN_VALUE;
		}

		return iProjectCacheModel;
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

	private static ClassLoader _classLoader = iProject.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			iProject.class
		};
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
	private iProject _escapedModelProxy;
}