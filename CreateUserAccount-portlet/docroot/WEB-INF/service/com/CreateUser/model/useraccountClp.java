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

package com.CreateUser.model;

import com.CreateUser.service.useraccountLocalServiceUtil;

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
public class useraccountClp extends BaseModelImpl<useraccount>
	implements useraccount {
	public useraccountClp() {
	}

	public Class<?> getModelClass() {
		return useraccount.class;
	}

	public String getModelClassName() {
		return useraccount.class.getName();
	}

	public long getPrimaryKey() {
		return _useraccountId;
	}

	public void setPrimaryKey(long primaryKey) {
		setUseraccountId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_useraccountId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("useraccountId", getUseraccountId());
		attributes.put("companyId", getCompanyId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("eMail", getEMail());
		attributes.put("phoneNo", getPhoneNo());
		attributes.put("major", getMajor());
		attributes.put("cgpa", getCgpa());
		attributes.put("role", getRole());
		attributes.put("password", getPassword());
		attributes.put("asuriteId", getAsuriteId());
		attributes.put("level", getLevel());
		attributes.put("sex", getSex());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long useraccountId = (Long)attributes.get("useraccountId");

		if (useraccountId != null) {
			setUseraccountId(useraccountId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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

		String role = (String)attributes.get("role");

		if (role != null) {
			setRole(role);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String asuriteId = (String)attributes.get("asuriteId");

		if (asuriteId != null) {
			setAsuriteId(asuriteId);
		}

		String level = (String)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String sex = (String)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}
	}

	public long getUseraccountId() {
		return _useraccountId;
	}

	public void setUseraccountId(long useraccountId) {
		_useraccountId = useraccountId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
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

	public String getRole() {
		return _role;
	}

	public void setRole(String role) {
		_role = role;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public String getAsuriteId() {
		return _asuriteId;
	}

	public void setAsuriteId(String asuriteId) {
		_asuriteId = asuriteId;
	}

	public String getLevel() {
		return _level;
	}

	public void setLevel(String level) {
		_level = level;
	}

	public String getSex() {
		return _sex;
	}

	public void setSex(String sex) {
		_sex = sex;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	public BaseModel<?> getuseraccountRemoteModel() {
		return _useraccountRemoteModel;
	}

	public void setuseraccountRemoteModel(BaseModel<?> useraccountRemoteModel) {
		_useraccountRemoteModel = useraccountRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			useraccountLocalServiceUtil.adduseraccount(this);
		}
		else {
			useraccountLocalServiceUtil.updateuseraccount(this);
		}
	}

	@Override
	public useraccount toEscapedModel() {
		return (useraccount)Proxy.newProxyInstance(useraccount.class.getClassLoader(),
			new Class[] { useraccount.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		useraccountClp clone = new useraccountClp();

		clone.setUseraccountId(getUseraccountId());
		clone.setCompanyId(getCompanyId());
		clone.setFirstName(getFirstName());
		clone.setLastName(getLastName());
		clone.setEMail(getEMail());
		clone.setPhoneNo(getPhoneNo());
		clone.setMajor(getMajor());
		clone.setCgpa(getCgpa());
		clone.setRole(getRole());
		clone.setPassword(getPassword());
		clone.setAsuriteId(getAsuriteId());
		clone.setLevel(getLevel());
		clone.setSex(getSex());
		clone.setDateAdded(getDateAdded());

		return clone;
	}

	public int compareTo(useraccount useraccount) {
		long primaryKey = useraccount.getPrimaryKey();

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

		useraccountClp useraccount = null;

		try {
			useraccount = (useraccountClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = useraccount.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{useraccountId=");
		sb.append(getUseraccountId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
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
		sb.append(", role=");
		sb.append(getRole());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", asuriteId=");
		sb.append(getAsuriteId());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.CreateUser.model.useraccount");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>useraccountId</column-name><column-value><![CDATA[");
		sb.append(getUseraccountId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
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
		sb.append(
			"<column><column-name>role</column-name><column-value><![CDATA[");
		sb.append(getRole());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuriteId</column-name><column-value><![CDATA[");
		sb.append(getAsuriteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _useraccountId;
	private long _companyId;
	private String _firstName;
	private String _lastName;
	private String _eMail;
	private String _phoneNo;
	private String _major;
	private String _cgpa;
	private String _role;
	private String _password;
	private String _asuriteId;
	private String _level;
	private String _sex;
	private Date _dateAdded;
	private BaseModel<?> _useraccountRemoteModel;
}