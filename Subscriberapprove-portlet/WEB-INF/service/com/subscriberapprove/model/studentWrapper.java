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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link student}.
 * </p>
 *
 * @author    Shruthi
 * @see       student
 * @generated
 */
public class studentWrapper implements student, ModelWrapper<student> {
	public studentWrapper(student student) {
		_student = student;
	}

	public Class<?> getModelClass() {
		return student.class;
	}

	public String getModelClassName() {
		return student.class.getName();
	}

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

	/**
	* Returns the primary key of this student.
	*
	* @return the primary key of this student
	*/
	public long getPrimaryKey() {
		return _student.getPrimaryKey();
	}

	/**
	* Sets the primary key of this student.
	*
	* @param primaryKey the primary key of this student
	*/
	public void setPrimaryKey(long primaryKey) {
		_student.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the studentgeninfoid of this student.
	*
	* @return the studentgeninfoid of this student
	*/
	public long getStudentgeninfoid() {
		return _student.getStudentgeninfoid();
	}

	/**
	* Sets the studentgeninfoid of this student.
	*
	* @param studentgeninfoid the studentgeninfoid of this student
	*/
	public void setStudentgeninfoid(long studentgeninfoid) {
		_student.setStudentgeninfoid(studentgeninfoid);
	}

	/**
	* Returns the first name of this student.
	*
	* @return the first name of this student
	*/
	public java.lang.String getFirstName() {
		return _student.getFirstName();
	}

	/**
	* Sets the first name of this student.
	*
	* @param firstName the first name of this student
	*/
	public void setFirstName(java.lang.String firstName) {
		_student.setFirstName(firstName);
	}

	/**
	* Returns the last name of this student.
	*
	* @return the last name of this student
	*/
	public java.lang.String getLastName() {
		return _student.getLastName();
	}

	/**
	* Sets the last name of this student.
	*
	* @param lastName the last name of this student
	*/
	public void setLastName(java.lang.String lastName) {
		_student.setLastName(lastName);
	}

	/**
	* Returns the asuriteid of this student.
	*
	* @return the asuriteid of this student
	*/
	public java.lang.String getAsuriteid() {
		return _student.getAsuriteid();
	}

	/**
	* Sets the asuriteid of this student.
	*
	* @param asuriteid the asuriteid of this student
	*/
	public void setAsuriteid(java.lang.String asuriteid) {
		_student.setAsuriteid(asuriteid);
	}

	/**
	* Returns the department of this student.
	*
	* @return the department of this student
	*/
	public java.lang.String getDepartment() {
		return _student.getDepartment();
	}

	/**
	* Sets the department of this student.
	*
	* @param department the department of this student
	*/
	public void setDepartment(java.lang.String department) {
		_student.setDepartment(department);
	}

	/**
	* Returns the level of this student.
	*
	* @return the level of this student
	*/
	public java.lang.String getLevel() {
		return _student.getLevel();
	}

	/**
	* Sets the level of this student.
	*
	* @param level the level of this student
	*/
	public void setLevel(java.lang.String level) {
		_student.setLevel(level);
	}

	/**
	* Returns the cgpa of this student.
	*
	* @return the cgpa of this student
	*/
	public java.lang.String getCgpa() {
		return _student.getCgpa();
	}

	/**
	* Sets the cgpa of this student.
	*
	* @param cgpa the cgpa of this student
	*/
	public void setCgpa(java.lang.String cgpa) {
		_student.setCgpa(cgpa);
	}

	/**
	* Returns the sex of this student.
	*
	* @return the sex of this student
	*/
	public java.lang.String getSex() {
		return _student.getSex();
	}

	/**
	* Sets the sex of this student.
	*
	* @param sex the sex of this student
	*/
	public void setSex(java.lang.String sex) {
		_student.setSex(sex);
	}

	/**
	* Returns the phone of this student.
	*
	* @return the phone of this student
	*/
	public java.lang.String getPhone() {
		return _student.getPhone();
	}

	/**
	* Sets the phone of this student.
	*
	* @param phone the phone of this student
	*/
	public void setPhone(java.lang.String phone) {
		_student.setPhone(phone);
	}

	/**
	* Returns the create date of this student.
	*
	* @return the create date of this student
	*/
	public java.util.Date getCreateDate() {
		return _student.getCreateDate();
	}

	/**
	* Sets the create date of this student.
	*
	* @param createDate the create date of this student
	*/
	public void setCreateDate(java.util.Date createDate) {
		_student.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this student.
	*
	* @return the modified date of this student
	*/
	public java.util.Date getModifiedDate() {
		return _student.getModifiedDate();
	}

	/**
	* Sets the modified date of this student.
	*
	* @param modifiedDate the modified date of this student
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_student.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the assigned of this student.
	*
	* @return the assigned of this student
	*/
	public boolean getAssigned() {
		return _student.getAssigned();
	}

	/**
	* Returns <code>true</code> if this student is assigned.
	*
	* @return <code>true</code> if this student is assigned; <code>false</code> otherwise
	*/
	public boolean isAssigned() {
		return _student.isAssigned();
	}

	/**
	* Sets whether this student is assigned.
	*
	* @param assigned the assigned of this student
	*/
	public void setAssigned(boolean assigned) {
		_student.setAssigned(assigned);
	}

	public boolean isNew() {
		return _student.isNew();
	}

	public void setNew(boolean n) {
		_student.setNew(n);
	}

	public boolean isCachedModel() {
		return _student.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_student.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _student.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _student.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_student.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _student.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_student.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new studentWrapper((student)_student.clone());
	}

	public int compareTo(com.subscriberapprove.model.student student) {
		return _student.compareTo(student);
	}

	@Override
	public int hashCode() {
		return _student.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.subscriberapprove.model.student> toCacheModel() {
		return _student.toCacheModel();
	}

	public com.subscriberapprove.model.student toEscapedModel() {
		return new studentWrapper(_student.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _student.toString();
	}

	public java.lang.String toXmlString() {
		return _student.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_student.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public student getWrappedstudent() {
		return _student;
	}

	public student getWrappedModel() {
		return _student;
	}

	public void resetOriginalValues() {
		_student.resetOriginalValues();
	}

	private student _student;
}