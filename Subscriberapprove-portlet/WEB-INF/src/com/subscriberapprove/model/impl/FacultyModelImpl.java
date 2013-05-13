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

package com.subscriberapprove.model.impl;

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

import com.subscriberapprove.model.Faculty;
import com.subscriberapprove.model.FacultyModel;
import com.subscriberapprove.model.FacultySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Faculty service. Represents a row in the &quot;Sapprove_Faculty&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.subscriberapprove.model.FacultyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FacultyImpl}.
 * </p>
 *
 * @author Shruthi
 * @see FacultyImpl
 * @see com.subscriberapprove.model.Faculty
 * @see com.subscriberapprove.model.FacultyModel
 * @generated
 */
@JSON(strict = true)
public class FacultyModelImpl extends BaseModelImpl<Faculty>
	implements FacultyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a faculty model instance should use the {@link com.subscriberapprove.model.Faculty} interface instead.
	 */
	public static final String TABLE_NAME = "Sapprove_Faculty";
	public static final Object[][] TABLE_COLUMNS = {
			{ "facultyID", Types.BIGINT },
			{ "asuriteid", Types.VARCHAR },
			{ "facultyName", Types.VARCHAR },
			{ "facultyDept", Types.VARCHAR },
			{ "contact", Types.VARCHAR },
			{ "dateAdded", Types.TIMESTAMP },
			{ "dateModified", Types.TIMESTAMP },
			{ "assigned", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table Sapprove_Faculty (facultyID LONG not null primary key,asuriteid VARCHAR(75) null,facultyName VARCHAR(75) null,facultyDept VARCHAR(75) null,contact VARCHAR(75) null,dateAdded DATE null,dateModified DATE null,assigned BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table Sapprove_Faculty";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.subscriberapprove.model.Faculty"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.subscriberapprove.model.Faculty"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Faculty toModel(FacultySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Faculty model = new FacultyImpl();

		model.setFacultyID(soapModel.getFacultyID());
		model.setAsuriteid(soapModel.getAsuriteid());
		model.setFacultyName(soapModel.getFacultyName());
		model.setFacultyDept(soapModel.getFacultyDept());
		model.setContact(soapModel.getContact());
		model.setDateAdded(soapModel.getDateAdded());
		model.setDateModified(soapModel.getDateModified());
		model.setAssigned(soapModel.getAssigned());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Faculty> toModels(FacultySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Faculty> models = new ArrayList<Faculty>(soapModels.length);

		for (FacultySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.subscriberapprove.model.Faculty"));

	public FacultyModelImpl() {
	}

	public long getPrimaryKey() {
		return _facultyID;
	}

	public void setPrimaryKey(long primaryKey) {
		setFacultyID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_facultyID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return Faculty.class;
	}

	public String getModelClassName() {
		return Faculty.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("facultyID", getFacultyID());
		attributes.put("asuriteid", getAsuriteid());
		attributes.put("facultyName", getFacultyName());
		attributes.put("facultyDept", getFacultyDept());
		attributes.put("contact", getContact());
		attributes.put("dateAdded", getDateAdded());
		attributes.put("dateModified", getDateModified());
		attributes.put("assigned", getAssigned());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long facultyID = (Long)attributes.get("facultyID");

		if (facultyID != null) {
			setFacultyID(facultyID);
		}

		String asuriteid = (String)attributes.get("asuriteid");

		if (asuriteid != null) {
			setAsuriteid(asuriteid);
		}

		String facultyName = (String)attributes.get("facultyName");

		if (facultyName != null) {
			setFacultyName(facultyName);
		}

		String facultyDept = (String)attributes.get("facultyDept");

		if (facultyDept != null) {
			setFacultyDept(facultyDept);
		}

		String contact = (String)attributes.get("contact");

		if (contact != null) {
			setContact(contact);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}

		Date dateModified = (Date)attributes.get("dateModified");

		if (dateModified != null) {
			setDateModified(dateModified);
		}

		Boolean assigned = (Boolean)attributes.get("assigned");

		if (assigned != null) {
			setAssigned(assigned);
		}
	}

	@JSON
	public long getFacultyID() {
		return _facultyID;
	}

	public void setFacultyID(long facultyID) {
		_facultyID = facultyID;
	}

	@JSON
	public String getAsuriteid() {
		if (_asuriteid == null) {
			return StringPool.BLANK;
		}
		else {
			return _asuriteid;
		}
	}

	public void setAsuriteid(String asuriteid) {
		_asuriteid = asuriteid;
	}

	@JSON
	public String getFacultyName() {
		if (_facultyName == null) {
			return StringPool.BLANK;
		}
		else {
			return _facultyName;
		}
	}

	public void setFacultyName(String facultyName) {
		_facultyName = facultyName;
	}

	@JSON
	public String getFacultyDept() {
		if (_facultyDept == null) {
			return StringPool.BLANK;
		}
		else {
			return _facultyDept;
		}
	}

	public void setFacultyDept(String facultyDept) {
		_facultyDept = facultyDept;
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

	@JSON
	public boolean getAssigned() {
		return _assigned;
	}

	public boolean isAssigned() {
		return _assigned;
	}

	public void setAssigned(boolean assigned) {
		_assigned = assigned;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Faculty.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Faculty toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Faculty)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		FacultyImpl facultyImpl = new FacultyImpl();

		facultyImpl.setFacultyID(getFacultyID());
		facultyImpl.setAsuriteid(getAsuriteid());
		facultyImpl.setFacultyName(getFacultyName());
		facultyImpl.setFacultyDept(getFacultyDept());
		facultyImpl.setContact(getContact());
		facultyImpl.setDateAdded(getDateAdded());
		facultyImpl.setDateModified(getDateModified());
		facultyImpl.setAssigned(getAssigned());

		facultyImpl.resetOriginalValues();

		return facultyImpl;
	}

	public int compareTo(Faculty faculty) {
		long primaryKey = faculty.getPrimaryKey();

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

		Faculty faculty = null;

		try {
			faculty = (Faculty)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = faculty.getPrimaryKey();

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
	public CacheModel<Faculty> toCacheModel() {
		FacultyCacheModel facultyCacheModel = new FacultyCacheModel();

		facultyCacheModel.facultyID = getFacultyID();

		facultyCacheModel.asuriteid = getAsuriteid();

		String asuriteid = facultyCacheModel.asuriteid;

		if ((asuriteid != null) && (asuriteid.length() == 0)) {
			facultyCacheModel.asuriteid = null;
		}

		facultyCacheModel.facultyName = getFacultyName();

		String facultyName = facultyCacheModel.facultyName;

		if ((facultyName != null) && (facultyName.length() == 0)) {
			facultyCacheModel.facultyName = null;
		}

		facultyCacheModel.facultyDept = getFacultyDept();

		String facultyDept = facultyCacheModel.facultyDept;

		if ((facultyDept != null) && (facultyDept.length() == 0)) {
			facultyCacheModel.facultyDept = null;
		}

		facultyCacheModel.contact = getContact();

		String contact = facultyCacheModel.contact;

		if ((contact != null) && (contact.length() == 0)) {
			facultyCacheModel.contact = null;
		}

		Date dateAdded = getDateAdded();

		if (dateAdded != null) {
			facultyCacheModel.dateAdded = dateAdded.getTime();
		}
		else {
			facultyCacheModel.dateAdded = Long.MIN_VALUE;
		}

		Date dateModified = getDateModified();

		if (dateModified != null) {
			facultyCacheModel.dateModified = dateModified.getTime();
		}
		else {
			facultyCacheModel.dateModified = Long.MIN_VALUE;
		}

		facultyCacheModel.assigned = getAssigned();

		return facultyCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{facultyID=");
		sb.append(getFacultyID());
		sb.append(", asuriteid=");
		sb.append(getAsuriteid());
		sb.append(", facultyName=");
		sb.append(getFacultyName());
		sb.append(", facultyDept=");
		sb.append(getFacultyDept());
		sb.append(", contact=");
		sb.append(getContact());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append(", dateModified=");
		sb.append(getDateModified());
		sb.append(", assigned=");
		sb.append(getAssigned());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.subscriberapprove.model.Faculty");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>facultyID</column-name><column-value><![CDATA[");
		sb.append(getFacultyID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuriteid</column-name><column-value><![CDATA[");
		sb.append(getAsuriteid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facultyName</column-name><column-value><![CDATA[");
		sb.append(getFacultyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facultyDept</column-name><column-value><![CDATA[");
		sb.append(getFacultyDept());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contact</column-name><column-value><![CDATA[");
		sb.append(getContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateModified</column-name><column-value><![CDATA[");
		sb.append(getDateModified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigned</column-name><column-value><![CDATA[");
		sb.append(getAssigned());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Faculty.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Faculty.class
		};
	private long _facultyID;
	private String _asuriteid;
	private String _facultyName;
	private String _facultyDept;
	private String _contact;
	private Date _dateAdded;
	private Date _dateModified;
	private boolean _assigned;
	private Faculty _escapedModelProxy;
}