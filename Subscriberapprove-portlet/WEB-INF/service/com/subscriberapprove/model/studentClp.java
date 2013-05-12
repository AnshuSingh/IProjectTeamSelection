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

package com.subscriberapprove.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.subscriberapprove.service.studentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Shruthi
 */
public class studentClp extends BaseModelImpl<student> implements student {
	public studentClp() {
	}

	public Class<?> getModelClass() {
		return student.class;
	}

	public String getModelClassName() {
		return student.class.getName();
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
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("assigned", getAssigned());

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

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Boolean assigned = (Boolean)attributes.get("assigned");

		if (assigned != null) {
			setAssigned(assigned);
		}
	}

	public long getStudentgeninfoid() {
		return _studentgeninfoid;
	}

	public void setStudentgeninfoid(long studentgeninfoid) {
		_studentgeninfoid = studentgeninfoid;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getAsuriteid() {
		return _asuriteid;
	}

	public void setAsuriteid(String asuriteid) {
		_asuriteid = asuriteid;
	}

	public String getDepartment() {
		return _department;
	}

	public void setDepartment(String department) {
		_department = department;
	}

	public String getLevel() {
		return _level;
	}

	public void setLevel(String level) {
		_level = level;
	}

	public String getCgpa() {
		return _cgpa;
	}

	public void setCgpa(String cgpa) {
		_cgpa = cgpa;
	}

	public String getSex() {
		return _sex;
	}

	public void setSex(String sex) {
		_sex = sex;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public boolean getAssigned() {
		return _assigned;
	}

	public boolean isAssigned() {
		return _assigned;
	}

	public void setAssigned(boolean assigned) {
		_assigned = assigned;
	}

	public BaseModel<?> getstudentRemoteModel() {
		return _studentRemoteModel;
	}

	public void setstudentRemoteModel(BaseModel<?> studentRemoteModel) {
		_studentRemoteModel = studentRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			studentLocalServiceUtil.addstudent(this);
		}
		else {
			studentLocalServiceUtil.updatestudent(this);
		}
	}

	@Override
	public student toEscapedModel() {
		return (student)Proxy.newProxyInstance(student.class.getClassLoader(),
			new Class[] { student.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		studentClp clone = new studentClp();

		clone.setStudentgeninfoid(getStudentgeninfoid());
		clone.setFirstName(getFirstName());
		clone.setLastName(getLastName());
		clone.setAsuriteid(getAsuriteid());
		clone.setDepartment(getDepartment());
		clone.setLevel(getLevel());
		clone.setCgpa(getCgpa());
		clone.setSex(getSex());
		clone.setPhone(getPhone());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setAssigned(getAssigned());

		return clone;
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

		studentClp student = null;

		try {
			student = (studentClp)obj;
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
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", assigned=");
		sb.append(getAssigned());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.subscriberapprove.model.student");
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assigned</column-name><column-value><![CDATA[");
		sb.append(getAssigned());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studentgeninfoid;
	private String _firstName;
	private String _lastName;
	private String _asuriteid;
	private String _department;
	private String _level;
	private String _cgpa;
	private String _sex;
	private String _phone;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _assigned;
	private BaseModel<?> _studentRemoteModel;
}