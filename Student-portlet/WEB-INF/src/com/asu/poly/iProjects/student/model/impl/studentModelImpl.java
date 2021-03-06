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

import com.asu.poly.iProjects.student.model.student;
import com.asu.poly.iProjects.student.model.studentModel;
import com.asu.poly.iProjects.student.model.studentSoap;

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
 * The base model implementation for the student service. Represents a row in the &quot;poly_student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.asu.poly.iProjects.student.model.studentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link studentImpl}.
 * </p>
 *
 * @author Shruthi
 * @see studentImpl
 * @see com.asu.poly.iProjects.student.model.student
 * @see com.asu.poly.iProjects.student.model.studentModel
 * @generated
 */
@JSON(strict = true)
public class studentModelImpl extends BaseModelImpl<student>
	implements studentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a student model instance should use the {@link com.asu.poly.iProjects.student.model.student} interface instead.
	 */
	public static final String TABLE_NAME = "poly_student";
	public static final Object[][] TABLE_COLUMNS = {
			{ "studentgeninfoid", Types.BIGINT },
			{ "firstName", Types.VARCHAR },
			{ "lastName", Types.VARCHAR },
			{ "asuriteid", Types.VARCHAR },
			{ "department", Types.VARCHAR },
			{ "level", Types.VARCHAR },
			{ "cgpa", Types.VARCHAR },
			{ "sex", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "loggedinuserId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table poly_student (studentgeninfoid LONG not null primary key,firstName VARCHAR(75) null,lastName VARCHAR(75) null,asuriteid VARCHAR(75) null,department VARCHAR(75) null,level VARCHAR(75) null,cgpa VARCHAR(75) null,sex VARCHAR(75) null,phone VARCHAR(75) null,loggedinuserId LONG,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table poly_student";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.asu.poly.iProjects.student.model.student"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.asu.poly.iProjects.student.model.student"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static student toModel(studentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		student model = new studentImpl();

		model.setStudentgeninfoid(soapModel.getStudentgeninfoid());
		model.setFirstName(soapModel.getFirstName());
		model.setLastName(soapModel.getLastName());
		model.setAsuriteid(soapModel.getAsuriteid());
		model.setDepartment(soapModel.getDepartment());
		model.setLevel(soapModel.getLevel());
		model.setCgpa(soapModel.getCgpa());
		model.setSex(soapModel.getSex());
		model.setPhone(soapModel.getPhone());
		model.setLoggedinuserId(soapModel.getLoggedinuserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<student> toModels(studentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<student> models = new ArrayList<student>(soapModels.length);

		for (studentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.asu.poly.iProjects.student.model.student"));

	public studentModelImpl() {
	}

	public long getPrimaryKey() {
		return _studentgeninfoid;
	}

	public void setPrimaryKey(long primaryKey) {
		setStudentgeninfoid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_studentgeninfoid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return student.class;
	}

	public String getModelClassName() {
		return student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentgeninfoid", getStudentgeninfoid());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("asuriteid", getAsuriteid());
		attributes.put("department", getDepartment());
		attributes.put("level", getLevel());
		attributes.put("cgpa", getCgpa());
		attributes.put("sex", getSex());
		attributes.put("phone", getPhone());
		attributes.put("loggedinuserId", getLoggedinuserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentgeninfoid = (Long)attributes.get("studentgeninfoid");

		if (studentgeninfoid != null) {
			setStudentgeninfoid(studentgeninfoid);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String asuriteid = (String)attributes.get("asuriteid");

		if (asuriteid != null) {
			setAsuriteid(asuriteid);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String level = (String)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String cgpa = (String)attributes.get("cgpa");

		if (cgpa != null) {
			setCgpa(cgpa);
		}

		String sex = (String)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		Long loggedinuserId = (Long)attributes.get("loggedinuserId");

		if (loggedinuserId != null) {
			setLoggedinuserId(loggedinuserId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@JSON
	public long getStudentgeninfoid() {
		return _studentgeninfoid;
	}

	public void setStudentgeninfoid(long studentgeninfoid) {
		_studentgeninfoid = studentgeninfoid;
	}

	@JSON
	public String getFirstName() {
		if (_firstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _firstName;
		}
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	@JSON
	public String getLastName() {
		if (_lastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastName;
		}
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
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
	public String getDepartment() {
		if (_department == null) {
			return StringPool.BLANK;
		}
		else {
			return _department;
		}
	}

	public void setDepartment(String department) {
		_department = department;
	}

	@JSON
	public String getLevel() {
		if (_level == null) {
			return StringPool.BLANK;
		}
		else {
			return _level;
		}
	}

	public void setLevel(String level) {
		_level = level;
	}

	@JSON
	public String getCgpa() {
		if (_cgpa == null) {
			return StringPool.BLANK;
		}
		else {
			return _cgpa;
		}
	}

	public void setCgpa(String cgpa) {
		_cgpa = cgpa;
	}

	@JSON
	public String getSex() {
		if (_sex == null) {
			return StringPool.BLANK;
		}
		else {
			return _sex;
		}
	}

	public void setSex(String sex) {
		_sex = sex;
	}

	@JSON
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	@JSON
	public long getLoggedinuserId() {
		return _loggedinuserId;
	}

	public void setLoggedinuserId(long loggedinuserId) {
		_loggedinuserId = loggedinuserId;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			student.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public student toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (student)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		studentImpl studentImpl = new studentImpl();

		studentImpl.setStudentgeninfoid(getStudentgeninfoid());
		studentImpl.setFirstName(getFirstName());
		studentImpl.setLastName(getLastName());
		studentImpl.setAsuriteid(getAsuriteid());
		studentImpl.setDepartment(getDepartment());
		studentImpl.setLevel(getLevel());
		studentImpl.setCgpa(getCgpa());
		studentImpl.setSex(getSex());
		studentImpl.setPhone(getPhone());
		studentImpl.setLoggedinuserId(getLoggedinuserId());
		studentImpl.setCreateDate(getCreateDate());
		studentImpl.setModifiedDate(getModifiedDate());

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	public int compareTo(student student) {
		long primaryKey = student.getPrimaryKey();

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

		student student = null;

		try {
			student = (student)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = student.getPrimaryKey();

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
	public CacheModel<student> toCacheModel() {
		studentCacheModel studentCacheModel = new studentCacheModel();

		studentCacheModel.studentgeninfoid = getStudentgeninfoid();

		studentCacheModel.firstName = getFirstName();

		String firstName = studentCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			studentCacheModel.firstName = null;
		}

		studentCacheModel.lastName = getLastName();

		String lastName = studentCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			studentCacheModel.lastName = null;
		}

		studentCacheModel.asuriteid = getAsuriteid();

		String asuriteid = studentCacheModel.asuriteid;

		if ((asuriteid != null) && (asuriteid.length() == 0)) {
			studentCacheModel.asuriteid = null;
		}

		studentCacheModel.department = getDepartment();

		String department = studentCacheModel.department;

		if ((department != null) && (department.length() == 0)) {
			studentCacheModel.department = null;
		}

		studentCacheModel.level = getLevel();

		String level = studentCacheModel.level;

		if ((level != null) && (level.length() == 0)) {
			studentCacheModel.level = null;
		}

		studentCacheModel.cgpa = getCgpa();

		String cgpa = studentCacheModel.cgpa;

		if ((cgpa != null) && (cgpa.length() == 0)) {
			studentCacheModel.cgpa = null;
		}

		studentCacheModel.sex = getSex();

		String sex = studentCacheModel.sex;

		if ((sex != null) && (sex.length() == 0)) {
			studentCacheModel.sex = null;
		}

		studentCacheModel.phone = getPhone();

		String phone = studentCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			studentCacheModel.phone = null;
		}

		studentCacheModel.loggedinuserId = getLoggedinuserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			studentCacheModel.createDate = createDate.getTime();
		}
		else {
			studentCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			studentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			studentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return studentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{studentgeninfoid=");
		sb.append(getStudentgeninfoid());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", asuriteid=");
		sb.append(getAsuriteid());
		sb.append(", department=");
		sb.append(getDepartment());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", cgpa=");
		sb.append(getCgpa());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", loggedinuserId=");
		sb.append(getLoggedinuserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.asu.poly.iProjects.student.model.student");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentgeninfoid</column-name><column-value><![CDATA[");
		sb.append(getStudentgeninfoid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuriteid</column-name><column-value><![CDATA[");
		sb.append(getAsuriteid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>department</column-name><column-value><![CDATA[");
		sb.append(getDepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cgpa</column-name><column-value><![CDATA[");
		sb.append(getCgpa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loggedinuserId</column-name><column-value><![CDATA[");
		sb.append(getLoggedinuserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = student.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			student.class
		};
	private long _studentgeninfoid;
	private String _firstName;
	private String _lastName;
	private String _asuriteid;
	private String _department;
	private String _level;
	private String _cgpa;
	private String _sex;
	private String _phone;
	private long _loggedinuserId;
	private Date _createDate;
	private Date _modifiedDate;
	private student _escapedModelProxy;
}