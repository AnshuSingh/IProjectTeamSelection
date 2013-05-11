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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing student in entity cache.
 *
 * @author Shruthi
 * @see student
 * @generated
 */
public class studentCacheModel implements CacheModel<student>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{studentgeninfoid=");
		sb.append(studentgeninfoid);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", asuriteid=");
		sb.append(asuriteid);
		sb.append(", department=");
		sb.append(department);
		sb.append(", level=");
		sb.append(level);
		sb.append(", cgpa=");
		sb.append(cgpa);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", loggedinuserId=");
		sb.append(loggedinuserId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	public student toEntityModel() {
		studentImpl studentImpl = new studentImpl();

		studentImpl.setStudentgeninfoid(studentgeninfoid);

		if (firstName == null) {
			studentImpl.setFirstName(StringPool.BLANK);
		}
		else {
			studentImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			studentImpl.setLastName(StringPool.BLANK);
		}
		else {
			studentImpl.setLastName(lastName);
		}

		if (asuriteid == null) {
			studentImpl.setAsuriteid(StringPool.BLANK);
		}
		else {
			studentImpl.setAsuriteid(asuriteid);
		}

		if (department == null) {
			studentImpl.setDepartment(StringPool.BLANK);
		}
		else {
			studentImpl.setDepartment(department);
		}

		if (level == null) {
			studentImpl.setLevel(StringPool.BLANK);
		}
		else {
			studentImpl.setLevel(level);
		}

		if (cgpa == null) {
			studentImpl.setCgpa(StringPool.BLANK);
		}
		else {
			studentImpl.setCgpa(cgpa);
		}

		if (sex == null) {
			studentImpl.setSex(StringPool.BLANK);
		}
		else {
			studentImpl.setSex(sex);
		}

		if (phone == null) {
			studentImpl.setPhone(StringPool.BLANK);
		}
		else {
			studentImpl.setPhone(phone);
		}

		studentImpl.setLoggedinuserId(loggedinuserId);

		if (createDate == Long.MIN_VALUE) {
			studentImpl.setCreateDate(null);
		}
		else {
			studentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			studentImpl.setModifiedDate(null);
		}
		else {
			studentImpl.setModifiedDate(new Date(modifiedDate));
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	public long studentgeninfoid;
	public String firstName;
	public String lastName;
	public String asuriteid;
	public String department;
	public String level;
	public String cgpa;
	public String sex;
	public String phone;
	public long loggedinuserId;
	public long createDate;
	public long modifiedDate;
}