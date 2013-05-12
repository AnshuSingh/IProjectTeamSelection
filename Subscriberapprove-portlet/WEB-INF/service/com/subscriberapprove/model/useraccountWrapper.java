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
 * This class is a wrapper for {@link useraccount}.
 * </p>
 *
 * @author    Shruthi
 * @see       useraccount
 * @generated
 */
public class useraccountWrapper implements useraccount,
	ModelWrapper<useraccount> {
	public useraccountWrapper(useraccount useraccount) {
		_useraccount = useraccount;
	}

	public Class<?> getModelClass() {
		return useraccount.class;
	}

	public String getModelClassName() {
		return useraccount.class.getName();
	}

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

	/**
	* Returns the primary key of this useraccount.
	*
	* @return the primary key of this useraccount
	*/
	public long getPrimaryKey() {
		return _useraccount.getPrimaryKey();
	}

	/**
	* Sets the primary key of this useraccount.
	*
	* @param primaryKey the primary key of this useraccount
	*/
	public void setPrimaryKey(long primaryKey) {
		_useraccount.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the useraccount ID of this useraccount.
	*
	* @return the useraccount ID of this useraccount
	*/
	public long getUseraccountId() {
		return _useraccount.getUseraccountId();
	}

	/**
	* Sets the useraccount ID of this useraccount.
	*
	* @param useraccountId the useraccount ID of this useraccount
	*/
	public void setUseraccountId(long useraccountId) {
		_useraccount.setUseraccountId(useraccountId);
	}

	/**
	* Returns the company ID of this useraccount.
	*
	* @return the company ID of this useraccount
	*/
	public long getCompanyId() {
		return _useraccount.getCompanyId();
	}

	/**
	* Sets the company ID of this useraccount.
	*
	* @param companyId the company ID of this useraccount
	*/
	public void setCompanyId(long companyId) {
		_useraccount.setCompanyId(companyId);
	}

	/**
	* Returns the first name of this useraccount.
	*
	* @return the first name of this useraccount
	*/
	public java.lang.String getFirstName() {
		return _useraccount.getFirstName();
	}

	/**
	* Sets the first name of this useraccount.
	*
	* @param firstName the first name of this useraccount
	*/
	public void setFirstName(java.lang.String firstName) {
		_useraccount.setFirstName(firstName);
	}

	/**
	* Returns the last name of this useraccount.
	*
	* @return the last name of this useraccount
	*/
	public java.lang.String getLastName() {
		return _useraccount.getLastName();
	}

	/**
	* Sets the last name of this useraccount.
	*
	* @param lastName the last name of this useraccount
	*/
	public void setLastName(java.lang.String lastName) {
		_useraccount.setLastName(lastName);
	}

	/**
	* Returns the e mail of this useraccount.
	*
	* @return the e mail of this useraccount
	*/
	public java.lang.String getEMail() {
		return _useraccount.getEMail();
	}

	/**
	* Sets the e mail of this useraccount.
	*
	* @param eMail the e mail of this useraccount
	*/
	public void setEMail(java.lang.String eMail) {
		_useraccount.setEMail(eMail);
	}

	/**
	* Returns the phone no of this useraccount.
	*
	* @return the phone no of this useraccount
	*/
	public java.lang.String getPhoneNo() {
		return _useraccount.getPhoneNo();
	}

	/**
	* Sets the phone no of this useraccount.
	*
	* @param phoneNo the phone no of this useraccount
	*/
	public void setPhoneNo(java.lang.String phoneNo) {
		_useraccount.setPhoneNo(phoneNo);
	}

	/**
	* Returns the major of this useraccount.
	*
	* @return the major of this useraccount
	*/
	public java.lang.String getMajor() {
		return _useraccount.getMajor();
	}

	/**
	* Sets the major of this useraccount.
	*
	* @param major the major of this useraccount
	*/
	public void setMajor(java.lang.String major) {
		_useraccount.setMajor(major);
	}

	/**
	* Returns the cgpa of this useraccount.
	*
	* @return the cgpa of this useraccount
	*/
	public java.lang.String getCgpa() {
		return _useraccount.getCgpa();
	}

	/**
	* Sets the cgpa of this useraccount.
	*
	* @param cgpa the cgpa of this useraccount
	*/
	public void setCgpa(java.lang.String cgpa) {
		_useraccount.setCgpa(cgpa);
	}

	/**
	* Returns the role of this useraccount.
	*
	* @return the role of this useraccount
	*/
	public java.lang.String getRole() {
		return _useraccount.getRole();
	}

	/**
	* Sets the role of this useraccount.
	*
	* @param role the role of this useraccount
	*/
	public void setRole(java.lang.String role) {
		_useraccount.setRole(role);
	}

	/**
	* Returns the password of this useraccount.
	*
	* @return the password of this useraccount
	*/
	public java.lang.String getPassword() {
		return _useraccount.getPassword();
	}

	/**
	* Sets the password of this useraccount.
	*
	* @param password the password of this useraccount
	*/
	public void setPassword(java.lang.String password) {
		_useraccount.setPassword(password);
	}

	/**
	* Returns the asurite ID of this useraccount.
	*
	* @return the asurite ID of this useraccount
	*/
	public java.lang.String getAsuriteId() {
		return _useraccount.getAsuriteId();
	}

	/**
	* Sets the asurite ID of this useraccount.
	*
	* @param asuriteId the asurite ID of this useraccount
	*/
	public void setAsuriteId(java.lang.String asuriteId) {
		_useraccount.setAsuriteId(asuriteId);
	}

	/**
	* Returns the level of this useraccount.
	*
	* @return the level of this useraccount
	*/
	public java.lang.String getLevel() {
		return _useraccount.getLevel();
	}

	/**
	* Sets the level of this useraccount.
	*
	* @param level the level of this useraccount
	*/
	public void setLevel(java.lang.String level) {
		_useraccount.setLevel(level);
	}

	/**
	* Returns the sex of this useraccount.
	*
	* @return the sex of this useraccount
	*/
	public java.lang.String getSex() {
		return _useraccount.getSex();
	}

	/**
	* Sets the sex of this useraccount.
	*
	* @param sex the sex of this useraccount
	*/
	public void setSex(java.lang.String sex) {
		_useraccount.setSex(sex);
	}

	/**
	* Returns the date added of this useraccount.
	*
	* @return the date added of this useraccount
	*/
	public java.util.Date getDateAdded() {
		return _useraccount.getDateAdded();
	}

	/**
	* Sets the date added of this useraccount.
	*
	* @param dateAdded the date added of this useraccount
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_useraccount.setDateAdded(dateAdded);
	}

	public boolean isNew() {
		return _useraccount.isNew();
	}

	public void setNew(boolean n) {
		_useraccount.setNew(n);
	}

	public boolean isCachedModel() {
		return _useraccount.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_useraccount.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _useraccount.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _useraccount.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_useraccount.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _useraccount.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_useraccount.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new useraccountWrapper((useraccount)_useraccount.clone());
	}

	public int compareTo(com.subscriberapprove.model.useraccount useraccount) {
		return _useraccount.compareTo(useraccount);
	}

	@Override
	public int hashCode() {
		return _useraccount.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.subscriberapprove.model.useraccount> toCacheModel() {
		return _useraccount.toCacheModel();
	}

	public com.subscriberapprove.model.useraccount toEscapedModel() {
		return new useraccountWrapper(_useraccount.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _useraccount.toString();
	}

	public java.lang.String toXmlString() {
		return _useraccount.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_useraccount.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public useraccount getWrappeduseraccount() {
		return _useraccount;
	}

	public useraccount getWrappedModel() {
		return _useraccount;
	}

	public void resetOriginalValues() {
		_useraccount.resetOriginalValues();
	}

	private useraccount _useraccount;
}