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

package com.asu.poly.teams.manualSelect.slayer.model.impl;

import com.asu.poly.teams.manualSelect.slayer.model.Student;
import com.asu.poly.teams.manualSelect.slayer.model.StudentModel;
import com.asu.poly.teams.manualSelect.slayer.model.StudentSoap;

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
 * The base model implementation for the Student service. Represents a row in the &quot;student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.asu.poly.teams.manualSelect.slayer.model.StudentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StudentImpl}.
 * </p>
 *
 * @author Eshwari
 * @see StudentImpl
 * @see com.asu.poly.teams.manualSelect.slayer.model.Student
 * @see com.asu.poly.teams.manualSelect.slayer.model.StudentModel
 * @generated
 */
@JSON(strict = true)
public class StudentModelImpl extends BaseModelImpl<Student>
	implements StudentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a student model instance should use the {@link com.asu.poly.teams.manualSelect.slayer.model.Student} interface instead.
	 */
	public static final String TABLE_NAME = "student";
	public static final Object[][] TABLE_COLUMNS = {
			{ "studentID", Types.BIGINT },
			{ "asuid", Types.VARCHAR },
			{ "studentName", Types.VARCHAR },
			{ "level", Types.VARCHAR },
			{ "course", Types.VARCHAR },
			{ "gpa", Types.VARCHAR },
			{ "sex", Types.VARCHAR },
			{ "dateAdded", Types.TIMESTAMP },
			{ "dateModified", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table student (studentID LONG not null primary key,asuid VARCHAR(75) null,studentName VARCHAR(75) null,level VARCHAR(75) null,course VARCHAR(75) null,gpa VARCHAR(75) null,sex VARCHAR(75) null,dateAdded DATE null,dateModified DATE null)";
	public static final String TABLE_SQL_DROP = "drop table student";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.asu.poly.teams.manualSelect.slayer.model.Student"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.asu.poly.teams.manualSelect.slayer.model.Student"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Student toModel(StudentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Student model = new StudentImpl();

		model.setStudentID(soapModel.getStudentID());
		model.setAsuid(soapModel.getAsuid());
		model.setStudentName(soapModel.getStudentName());
		model.setLevel(soapModel.getLevel());
		model.setCourse(soapModel.getCourse());
		model.setGpa(soapModel.getGpa());
		model.setSex(soapModel.getSex());
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
	public static List<Student> toModels(StudentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Student> models = new ArrayList<Student>(soapModels.length);

		for (StudentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.asu.poly.teams.manualSelect.slayer.model.Student"));

	public StudentModelImpl() {
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
		return Student.class;
	}

	public String getModelClassName() {
		return Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentID", getStudentID());
		attributes.put("asuid", getAsuid());
		attributes.put("studentName", getStudentName());
		attributes.put("level", getLevel());
		attributes.put("course", getCourse());
		attributes.put("gpa", getGpa());
		attributes.put("sex", getSex());
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

		String asuid = (String)attributes.get("asuid");

		if (asuid != null) {
			setAsuid(asuid);
		}

		String studentName = (String)attributes.get("studentName");

		if (studentName != null) {
			setStudentName(studentName);
		}

		String level = (String)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String course = (String)attributes.get("course");

		if (course != null) {
			setCourse(course);
		}

		String gpa = (String)attributes.get("gpa");

		if (gpa != null) {
			setGpa(gpa);
		}

		String sex = (String)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
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
	public String getAsuid() {
		if (_asuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _asuid;
		}
	}

	public void setAsuid(String asuid) {
		_asuid = asuid;
	}

	@JSON
	public String getStudentName() {
		if (_studentName == null) {
			return StringPool.BLANK;
		}
		else {
			return _studentName;
		}
	}

	public void setStudentName(String studentName) {
		_studentName = studentName;
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
	public String getCourse() {
		if (_course == null) {
			return StringPool.BLANK;
		}
		else {
			return _course;
		}
	}

	public void setCourse(String course) {
		_course = course;
	}

	@JSON
	public String getGpa() {
		if (_gpa == null) {
			return StringPool.BLANK;
		}
		else {
			return _gpa;
		}
	}

	public void setGpa(String gpa) {
		_gpa = gpa;
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
			Student.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Student toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Student)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		StudentImpl studentImpl = new StudentImpl();

		studentImpl.setStudentID(getStudentID());
		studentImpl.setAsuid(getAsuid());
		studentImpl.setStudentName(getStudentName());
		studentImpl.setLevel(getLevel());
		studentImpl.setCourse(getCourse());
		studentImpl.setGpa(getGpa());
		studentImpl.setSex(getSex());
		studentImpl.setDateAdded(getDateAdded());
		studentImpl.setDateModified(getDateModified());

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	public int compareTo(Student student) {
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

		Student student = null;

		try {
			student = (Student)obj;
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
	public CacheModel<Student> toCacheModel() {
		StudentCacheModel studentCacheModel = new StudentCacheModel();

		studentCacheModel.studentID = getStudentID();

		studentCacheModel.asuid = getAsuid();

		String asuid = studentCacheModel.asuid;

		if ((asuid != null) && (asuid.length() == 0)) {
			studentCacheModel.asuid = null;
		}

		studentCacheModel.studentName = getStudentName();

		String studentName = studentCacheModel.studentName;

		if ((studentName != null) && (studentName.length() == 0)) {
			studentCacheModel.studentName = null;
		}

		studentCacheModel.level = getLevel();

		String level = studentCacheModel.level;

		if ((level != null) && (level.length() == 0)) {
			studentCacheModel.level = null;
		}

		studentCacheModel.course = getCourse();

		String course = studentCacheModel.course;

		if ((course != null) && (course.length() == 0)) {
			studentCacheModel.course = null;
		}

		studentCacheModel.gpa = getGpa();

		String gpa = studentCacheModel.gpa;

		if ((gpa != null) && (gpa.length() == 0)) {
			studentCacheModel.gpa = null;
		}

		studentCacheModel.sex = getSex();

		String sex = studentCacheModel.sex;

		if ((sex != null) && (sex.length() == 0)) {
			studentCacheModel.sex = null;
		}

		Date dateAdded = getDateAdded();

		if (dateAdded != null) {
			studentCacheModel.dateAdded = dateAdded.getTime();
		}
		else {
			studentCacheModel.dateAdded = Long.MIN_VALUE;
		}

		Date dateModified = getDateModified();

		if (dateModified != null) {
			studentCacheModel.dateModified = dateModified.getTime();
		}
		else {
			studentCacheModel.dateModified = Long.MIN_VALUE;
		}

		return studentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{studentID=");
		sb.append(getStudentID());
		sb.append(", asuid=");
		sb.append(getAsuid());
		sb.append(", studentName=");
		sb.append(getStudentName());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", course=");
		sb.append(getCourse());
		sb.append(", gpa=");
		sb.append(getGpa());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append(", dateModified=");
		sb.append(getDateModified());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.asu.poly.teams.manualSelect.slayer.model.Student");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentID</column-name><column-value><![CDATA[");
		sb.append(getStudentID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuid</column-name><column-value><![CDATA[");
		sb.append(getAsuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentName</column-name><column-value><![CDATA[");
		sb.append(getStudentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>course</column-name><column-value><![CDATA[");
		sb.append(getCourse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gpa</column-name><column-value><![CDATA[");
		sb.append(getGpa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
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

	private static ClassLoader _classLoader = Student.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Student.class
		};
	private long _studentID;
	private String _asuid;
	private String _studentName;
	private String _level;
	private String _course;
	private String _gpa;
	private String _sex;
	private Date _dateAdded;
	private Date _dateModified;
	private Student _escapedModelProxy;
}