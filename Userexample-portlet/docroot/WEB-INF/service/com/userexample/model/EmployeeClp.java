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

package com.userexample.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.userexample.service.EmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shruthi
 */
public class EmployeeClp extends BaseModelImpl<Employee> implements Employee {
	public EmployeeClp() {
	}

	public Class<?> getModelClass() {
		return Employee.class;
	}

	public String getModelClassName() {
		return Employee.class.getName();
	}

	public long getPrimaryKey() {
		return _employeeId;
	}

	public void setPrimaryKey(long primaryKey) {
		setEmployeeId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_employeeId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("eMail", getEMail());
		attributes.put("phoneNo", getPhoneNo());
		attributes.put("major", getMajor());
		attributes.put("cgpa", getCgpa());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String eMail = (String)attributes.get("eMail");

		if (eMail != null) {
			setEMail(eMail);
		}

		String phoneNo = (String)attributes.get("phoneNo");

		if (phoneNo != null) {
			setPhoneNo(phoneNo);
		}

		String major = (String)attributes.get("major");

		if (major != null) {
			setMajor(major);
		}

		String cgpa = (String)attributes.get("cgpa");

		if (cgpa != null) {
			setCgpa(cgpa);
		}
	}

	public long getEmployeeId() {
		return _employeeId;
	}

	public void setEmployeeId(long employeeId) {
		_employeeId = employeeId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
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

	public String getEMail() {
		return _eMail;
	}

	public void setEMail(String eMail) {
		_eMail = eMail;
	}

	public String getPhoneNo() {
		return _phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		_phoneNo = phoneNo;
	}

	public String getMajor() {
		return _major;
	}

	public void setMajor(String major) {
		_major = major;
	}

	public String getCgpa() {
		return _cgpa;
	}

	public void setCgpa(String cgpa) {
		_cgpa = cgpa;
	}

	public BaseModel<?> getEmployeeRemoteModel() {
		return _employeeRemoteModel;
	}

	public void setEmployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
		_employeeRemoteModel = employeeRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeLocalServiceUtil.addEmployee(this);
		}
		else {
			EmployeeLocalServiceUtil.updateEmployee(this);
		}
	}

	@Override
	public Employee toEscapedModel() {
		return (Employee)Proxy.newProxyInstance(Employee.class.getClassLoader(),
			new Class[] { Employee.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmployeeClp clone = new EmployeeClp();

		clone.setEmployeeId(getEmployeeId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setFirstName(getFirstName());
		clone.setLastName(getLastName());
		clone.setEMail(getEMail());
		clone.setPhoneNo(getPhoneNo());
		clone.setMajor(getMajor());
		clone.setCgpa(getCgpa());

		return clone;
	}

	public int compareTo(Employee employee) {
		int value = 0;

		value = getFirstName().compareTo(employee.getFirstName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		EmployeeClp employee = null;

		try {
			employee = (EmployeeClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = employee.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{employeeId=");
		sb.append(getEmployeeId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", eMail=");
		sb.append(getEMail());
		sb.append(", phoneNo=");
		sb.append(getPhoneNo());
		sb.append(", major=");
		sb.append(getMajor());
		sb.append(", cgpa=");
		sb.append(getCgpa());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.userexample.model.Employee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
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
			"<column><column-name>eMail</column-name><column-value><![CDATA[");
		sb.append(getEMail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phoneNo</column-name><column-value><![CDATA[");
		sb.append(getPhoneNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>major</column-name><column-value><![CDATA[");
		sb.append(getMajor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cgpa</column-name><column-value><![CDATA[");
		sb.append(getCgpa());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _employeeId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _firstName;
	private String _lastName;
	private String _eMail;
	private String _phoneNo;
	private String _major;
	private String _cgpa;
	private BaseModel<?> _employeeRemoteModel;
}