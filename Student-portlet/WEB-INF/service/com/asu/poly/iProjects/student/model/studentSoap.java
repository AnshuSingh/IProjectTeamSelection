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

package com.asu.poly.iProjects.student.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.asu.poly.iProjects.student.service.http.studentServiceSoap}.
 *
 * @author    Shruthi
 * @see       com.asu.poly.iProjects.student.service.http.studentServiceSoap
 * @generated
 */
public class studentSoap implements Serializable {
	public static studentSoap toSoapModel(student model) {
		studentSoap soapModel = new studentSoap();

		soapModel.setStudentgeninfoid(model.getStudentgeninfoid());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setAsuriteid(model.getAsuriteid());
		soapModel.setDepartment(model.getDepartment());
		soapModel.setLevel(model.getLevel());
		soapModel.setCgpa(model.getCgpa());
		soapModel.setSex(model.getSex());
		soapModel.setPhone(model.getPhone());
		soapModel.setLoggedinuserId(model.getLoggedinuserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static studentSoap[] toSoapModels(student[] models) {
		studentSoap[] soapModels = new studentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static studentSoap[][] toSoapModels(student[][] models) {
		studentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new studentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new studentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static studentSoap[] toSoapModels(List<student> models) {
		List<studentSoap> soapModels = new ArrayList<studentSoap>(models.size());

		for (student model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new studentSoap[soapModels.size()]);
	}

	public studentSoap() {
	}

	public long getPrimaryKey() {
		return _studentgeninfoid;
	}

	public void setPrimaryKey(long pk) {
		setStudentgeninfoid(pk);
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

	public long getLoggedinuserId() {
		return _loggedinuserId;
	}

	public void setLoggedinuserId(long loggedinuserId) {
		_loggedinuserId = loggedinuserId;
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
}