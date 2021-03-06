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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the student service. Represents a row in the &quot;Sapprove_student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.subscriberapprove.model.impl.studentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.subscriberapprove.model.impl.studentImpl}.
 * </p>
 *
 * @author Shruthi
 * @see student
 * @see com.subscriberapprove.model.impl.studentImpl
 * @see com.subscriberapprove.model.impl.studentModelImpl
 * @generated
 */
public interface studentModel extends BaseModel<student> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a student model instance should use the {@link student} interface instead.
	 */

	/**
	 * Returns the primary key of this student.
	 *
	 * @return the primary key of this student
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this student.
	 *
	 * @param primaryKey the primary key of this student
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the studentgeninfoid of this student.
	 *
	 * @return the studentgeninfoid of this student
	 */
	public long getStudentgeninfoid();

	/**
	 * Sets the studentgeninfoid of this student.
	 *
	 * @param studentgeninfoid the studentgeninfoid of this student
	 */
	public void setStudentgeninfoid(long studentgeninfoid);

	/**
	 * Returns the first name of this student.
	 *
	 * @return the first name of this student
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this student.
	 *
	 * @param firstName the first name of this student
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this student.
	 *
	 * @return the last name of this student
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this student.
	 *
	 * @param lastName the last name of this student
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the asuriteid of this student.
	 *
	 * @return the asuriteid of this student
	 */
	@AutoEscape
	public String getAsuriteid();

	/**
	 * Sets the asuriteid of this student.
	 *
	 * @param asuriteid the asuriteid of this student
	 */
	public void setAsuriteid(String asuriteid);

	/**
	 * Returns the department of this student.
	 *
	 * @return the department of this student
	 */
	@AutoEscape
	public String getDepartment();

	/**
	 * Sets the department of this student.
	 *
	 * @param department the department of this student
	 */
	public void setDepartment(String department);

	/**
	 * Returns the level of this student.
	 *
	 * @return the level of this student
	 */
	@AutoEscape
	public String getLevel();

	/**
	 * Sets the level of this student.
	 *
	 * @param level the level of this student
	 */
	public void setLevel(String level);

	/**
	 * Returns the cgpa of this student.
	 *
	 * @return the cgpa of this student
	 */
	@AutoEscape
	public String getCgpa();

	/**
	 * Sets the cgpa of this student.
	 *
	 * @param cgpa the cgpa of this student
	 */
	public void setCgpa(String cgpa);

	/**
	 * Returns the sex of this student.
	 *
	 * @return the sex of this student
	 */
	@AutoEscape
	public String getSex();

	/**
	 * Sets the sex of this student.
	 *
	 * @param sex the sex of this student
	 */
	public void setSex(String sex);

	/**
	 * Returns the phone of this student.
	 *
	 * @return the phone of this student
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this student.
	 *
	 * @param phone the phone of this student
	 */
	public void setPhone(String phone);

	/**
	 * Returns the create date of this student.
	 *
	 * @return the create date of this student
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this student.
	 *
	 * @param createDate the create date of this student
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this student.
	 *
	 * @return the modified date of this student
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this student.
	 *
	 * @param modifiedDate the modified date of this student
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the assigned of this student.
	 *
	 * @return the assigned of this student
	 */
	public boolean getAssigned();

	/**
	 * Returns <code>true</code> if this student is assigned.
	 *
	 * @return <code>true</code> if this student is assigned; <code>false</code> otherwise
	 */
	public boolean isAssigned();

	/**
	 * Sets whether this student is assigned.
	 *
	 * @param assigned the assigned of this student
	 */
	public void setAssigned(boolean assigned);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(student student);

	public int hashCode();

	public CacheModel<student> toCacheModel();

	public student toEscapedModel();

	public String toString();

	public String toXmlString();
}