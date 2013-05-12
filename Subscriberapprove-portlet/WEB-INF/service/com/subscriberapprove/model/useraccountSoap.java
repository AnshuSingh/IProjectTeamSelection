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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.subscriberapprove.service.http.useraccountServiceSoap}.
 *
 * @author    Shruthi
 * @see       com.subscriberapprove.service.http.useraccountServiceSoap
 * @generated
 */
public class useraccountSoap implements Serializable {
	public static useraccountSoap toSoapModel(useraccount model) {
		useraccountSoap soapModel = new useraccountSoap();

		soapModel.setUseraccountId(model.getUseraccountId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setEMail(model.getEMail());
		soapModel.setPhoneNo(model.getPhoneNo());
		soapModel.setMajor(model.getMajor());
		soapModel.setCgpa(model.getCgpa());
		soapModel.setRole(model.getRole());
		soapModel.setPassword(model.getPassword());
		soapModel.setAsuriteId(model.getAsuriteId());
		soapModel.setLevel(model.getLevel());
		soapModel.setSex(model.getSex());
		soapModel.setDateAdded(model.getDateAdded());

		return soapModel;
	}

	public static useraccountSoap[] toSoapModels(useraccount[] models) {
		useraccountSoap[] soapModels = new useraccountSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static useraccountSoap[][] toSoapModels(useraccount[][] models) {
		useraccountSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new useraccountSoap[models.length][models[0].length];
		}
		else {
			soapModels = new useraccountSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static useraccountSoap[] toSoapModels(List<useraccount> models) {
		List<useraccountSoap> soapModels = new ArrayList<useraccountSoap>(models.size());

		for (useraccount model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new useraccountSoap[soapModels.size()]);
	}

	public useraccountSoap() {
	}

	public long getPrimaryKey() {
		return _useraccountId;
	}

	public void setPrimaryKey(long pk) {
		setUseraccountId(pk);
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
}