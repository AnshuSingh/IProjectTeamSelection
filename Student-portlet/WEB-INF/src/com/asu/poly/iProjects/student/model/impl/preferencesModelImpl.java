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

package com.asu.poly.iProjects.student.model.impl;

import com.asu.poly.iProjects.student.model.preferences;
import com.asu.poly.iProjects.student.model.preferencesModel;
import com.asu.poly.iProjects.student.model.preferencesSoap;

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
 * The base model implementation for the preferences service. Represents a row in the &quot;poly_preferences&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.asu.poly.iProjects.student.model.preferencesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link preferencesImpl}.
 * </p>
 *
 * @author Shruthi
 * @see preferencesImpl
 * @see com.asu.poly.iProjects.student.model.preferences
 * @see com.asu.poly.iProjects.student.model.preferencesModel
 * @generated
 */
@JSON(strict = true)
public class preferencesModelImpl extends BaseModelImpl<preferences>
	implements preferencesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a preferences model instance should use the {@link com.asu.poly.iProjects.student.model.preferences} interface instead.
	 */
	public static final String TABLE_NAME = "poly_preferences";
	public static final Object[][] TABLE_COLUMNS = {
			{ "studentID", Types.BIGINT },
			{ "asuriteid", Types.VARCHAR },
			{ "preference1", Types.VARCHAR },
			{ "preference2", Types.VARCHAR },
			{ "preference3", Types.VARCHAR },
			{ "preference4", Types.VARCHAR },
			{ "preference5", Types.VARCHAR },
			{ "studentasuid", Types.BIGINT },
			{ "focusarea", Types.VARCHAR },
			{ "reasons", Types.VARCHAR },
			{ "dateAdded", Types.TIMESTAMP },
			{ "dateModified", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table poly_preferences (studentID LONG not null primary key,asuriteid VARCHAR(75) null,preference1 VARCHAR(75) null,preference2 VARCHAR(75) null,preference3 VARCHAR(75) null,preference4 VARCHAR(75) null,preference5 VARCHAR(75) null,studentasuid LONG,focusarea VARCHAR(75) null,reasons VARCHAR(75) null,dateAdded DATE null,dateModified DATE null)";
	public static final String TABLE_SQL_DROP = "drop table poly_preferences";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.asu.poly.iProjects.student.model.preferences"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.asu.poly.iProjects.student.model.preferences"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static preferences toModel(preferencesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		preferences model = new preferencesImpl();

		model.setStudentID(soapModel.getStudentID());
		model.setAsuriteid(soapModel.getAsuriteid());
		model.setPreference1(soapModel.getPreference1());
		model.setPreference2(soapModel.getPreference2());
		model.setPreference3(soapModel.getPreference3());
		model.setPreference4(soapModel.getPreference4());
		model.setPreference5(soapModel.getPreference5());
		model.setStudentasuid(soapModel.getStudentasuid());
		model.setFocusarea(soapModel.getFocusarea());
		model.setReasons(soapModel.getReasons());
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
	public static List<preferences> toModels(preferencesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<preferences> models = new ArrayList<preferences>(soapModels.length);

		for (preferencesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.asu.poly.iProjects.student.model.preferences"));

	public preferencesModelImpl() {
	}

	public long getPrimaryKey() {
		return _studentID;
	}

	public void setPrimaryKey(long primaryKey) {
		setStudentID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_studentID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return preferences.class;
	}

	public String getModelClassName() {
		return preferences.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentID", getStudentID());
		attributes.put("asuriteid", getAsuriteid());
		attributes.put("preference1", getPreference1());
		attributes.put("preference2", getPreference2());
		attributes.put("preference3", getPreference3());
		attributes.put("preference4", getPreference4());
		attributes.put("preference5", getPreference5());
		attributes.put("studentasuid", getStudentasuid());
		attributes.put("focusarea", getFocusarea());
		attributes.put("reasons", getReasons());
		attributes.put("dateAdded", getDateAdded());
		attributes.put("dateModified", getDateModified());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentID = (Long)attributes.get("studentID");

		if (studentID != null) {
			setStudentID(studentID);
		}

		String asuriteid = (String)attributes.get("asuriteid");

		if (asuriteid != null) {
			setAsuriteid(asuriteid);
		}

		String preference1 = (String)attributes.get("preference1");

		if (preference1 != null) {
			setPreference1(preference1);
		}

		String preference2 = (String)attributes.get("preference2");

		if (preference2 != null) {
			setPreference2(preference2);
		}

		String preference3 = (String)attributes.get("preference3");

		if (preference3 != null) {
			setPreference3(preference3);
		}

		String preference4 = (String)attributes.get("preference4");

		if (preference4 != null) {
			setPreference4(preference4);
		}

		String preference5 = (String)attributes.get("preference5");

		if (preference5 != null) {
			setPreference5(preference5);
		}

		Long studentasuid = (Long)attributes.get("studentasuid");

		if (studentasuid != null) {
			setStudentasuid(studentasuid);
		}

		String focusarea = (String)attributes.get("focusarea");

		if (focusarea != null) {
			setFocusarea(focusarea);
		}

		String reasons = (String)attributes.get("reasons");

		if (reasons != null) {
			setReasons(reasons);
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
	public long getStudentID() {
		return _studentID;
	}

	public void setStudentID(long studentID) {
		_studentID = studentID;
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
	public String getPreference1() {
		if (_preference1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _preference1;
		}
	}

	public void setPreference1(String preference1) {
		_preference1 = preference1;
	}

	@JSON
	public String getPreference2() {
		if (_preference2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _preference2;
		}
	}

	public void setPreference2(String preference2) {
		_preference2 = preference2;
	}

	@JSON
	public String getPreference3() {
		if (_preference3 == null) {
			return StringPool.BLANK;
		}
		else {
			return _preference3;
		}
	}

	public void setPreference3(String preference3) {
		_preference3 = preference3;
	}

	@JSON
	public String getPreference4() {
		if (_preference4 == null) {
			return StringPool.BLANK;
		}
		else {
			return _preference4;
		}
	}

	public void setPreference4(String preference4) {
		_preference4 = preference4;
	}

	@JSON
	public String getPreference5() {
		if (_preference5 == null) {
			return StringPool.BLANK;
		}
		else {
			return _preference5;
		}
	}

	public void setPreference5(String preference5) {
		_preference5 = preference5;
	}

	@JSON
	public long getStudentasuid() {
		return _studentasuid;
	}

	public void setStudentasuid(long studentasuid) {
		_studentasuid = studentasuid;
	}

	@JSON
	public String getFocusarea() {
		if (_focusarea == null) {
			return StringPool.BLANK;
		}
		else {
			return _focusarea;
		}
	}

	public void setFocusarea(String focusarea) {
		_focusarea = focusarea;
	}

	@JSON
	public String getReasons() {
		if (_reasons == null) {
			return StringPool.BLANK;
		}
		else {
			return _reasons;
		}
	}

	public void setReasons(String reasons) {
		_reasons = reasons;
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
			preferences.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public preferences toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (preferences)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		preferencesImpl preferencesImpl = new preferencesImpl();

		preferencesImpl.setStudentID(getStudentID());
		preferencesImpl.setAsuriteid(getAsuriteid());
		preferencesImpl.setPreference1(getPreference1());
		preferencesImpl.setPreference2(getPreference2());
		preferencesImpl.setPreference3(getPreference3());
		preferencesImpl.setPreference4(getPreference4());
		preferencesImpl.setPreference5(getPreference5());
		preferencesImpl.setStudentasuid(getStudentasuid());
		preferencesImpl.setFocusarea(getFocusarea());
		preferencesImpl.setReasons(getReasons());
		preferencesImpl.setDateAdded(getDateAdded());
		preferencesImpl.setDateModified(getDateModified());

		preferencesImpl.resetOriginalValues();

		return preferencesImpl;
	}

	public int compareTo(preferences preferences) {
		long primaryKey = preferences.getPrimaryKey();

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

		preferences preferences = null;

		try {
			preferences = (preferences)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = preferences.getPrimaryKey();

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
	public CacheModel<preferences> toCacheModel() {
		preferencesCacheModel preferencesCacheModel = new preferencesCacheModel();

		preferencesCacheModel.studentID = getStudentID();

		preferencesCacheModel.asuriteid = getAsuriteid();

		String asuriteid = preferencesCacheModel.asuriteid;

		if ((asuriteid != null) && (asuriteid.length() == 0)) {
			preferencesCacheModel.asuriteid = null;
		}

		preferencesCacheModel.preference1 = getPreference1();

		String preference1 = preferencesCacheModel.preference1;

		if ((preference1 != null) && (preference1.length() == 0)) {
			preferencesCacheModel.preference1 = null;
		}

		preferencesCacheModel.preference2 = getPreference2();

		String preference2 = preferencesCacheModel.preference2;

		if ((preference2 != null) && (preference2.length() == 0)) {
			preferencesCacheModel.preference2 = null;
		}

		preferencesCacheModel.preference3 = getPreference3();

		String preference3 = preferencesCacheModel.preference3;

		if ((preference3 != null) && (preference3.length() == 0)) {
			preferencesCacheModel.preference3 = null;
		}

		preferencesCacheModel.preference4 = getPreference4();

		String preference4 = preferencesCacheModel.preference4;

		if ((preference4 != null) && (preference4.length() == 0)) {
			preferencesCacheModel.preference4 = null;
		}

		preferencesCacheModel.preference5 = getPreference5();

		String preference5 = preferencesCacheModel.preference5;

		if ((preference5 != null) && (preference5.length() == 0)) {
			preferencesCacheModel.preference5 = null;
		}

		preferencesCacheModel.studentasuid = getStudentasuid();

		preferencesCacheModel.focusarea = getFocusarea();

		String focusarea = preferencesCacheModel.focusarea;

		if ((focusarea != null) && (focusarea.length() == 0)) {
			preferencesCacheModel.focusarea = null;
		}

		preferencesCacheModel.reasons = getReasons();

		String reasons = preferencesCacheModel.reasons;

		if ((reasons != null) && (reasons.length() == 0)) {
			preferencesCacheModel.reasons = null;
		}

		Date dateAdded = getDateAdded();

		if (dateAdded != null) {
			preferencesCacheModel.dateAdded = dateAdded.getTime();
		}
		else {
			preferencesCacheModel.dateAdded = Long.MIN_VALUE;
		}

		Date dateModified = getDateModified();

		if (dateModified != null) {
			preferencesCacheModel.dateModified = dateModified.getTime();
		}
		else {
			preferencesCacheModel.dateModified = Long.MIN_VALUE;
		}

		return preferencesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{studentID=");
		sb.append(getStudentID());
		sb.append(", asuriteid=");
		sb.append(getAsuriteid());
		sb.append(", preference1=");
		sb.append(getPreference1());
		sb.append(", preference2=");
		sb.append(getPreference2());
		sb.append(", preference3=");
		sb.append(getPreference3());
		sb.append(", preference4=");
		sb.append(getPreference4());
		sb.append(", preference5=");
		sb.append(getPreference5());
		sb.append(", studentasuid=");
		sb.append(getStudentasuid());
		sb.append(", focusarea=");
		sb.append(getFocusarea());
		sb.append(", reasons=");
		sb.append(getReasons());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append(", dateModified=");
		sb.append(getDateModified());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.asu.poly.iProjects.student.model.preferences");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentID</column-name><column-value><![CDATA[");
		sb.append(getStudentID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuriteid</column-name><column-value><![CDATA[");
		sb.append(getAsuriteid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference1</column-name><column-value><![CDATA[");
		sb.append(getPreference1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference2</column-name><column-value><![CDATA[");
		sb.append(getPreference2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference3</column-name><column-value><![CDATA[");
		sb.append(getPreference3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference4</column-name><column-value><![CDATA[");
		sb.append(getPreference4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preference5</column-name><column-value><![CDATA[");
		sb.append(getPreference5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentasuid</column-name><column-value><![CDATA[");
		sb.append(getStudentasuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>focusarea</column-name><column-value><![CDATA[");
		sb.append(getFocusarea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reasons</column-name><column-value><![CDATA[");
		sb.append(getReasons());
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

	private static ClassLoader _classLoader = preferences.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			preferences.class
		};
	private long _studentID;
	private String _asuriteid;
	private String _preference1;
	private String _preference2;
	private String _preference3;
	private String _preference4;
	private String _preference5;
	private long _studentasuid;
	private String _focusarea;
	private String _reasons;
	private Date _dateAdded;
	private Date _dateModified;
	private preferences _escapedModelProxy;
}