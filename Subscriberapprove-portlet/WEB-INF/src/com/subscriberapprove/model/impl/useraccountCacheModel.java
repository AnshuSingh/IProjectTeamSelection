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

package com.subscriberapprove.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.subscriberapprove.model.useraccount;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing useraccount in entity cache.
 *
 * @author Shruthi
 * @see useraccount
 * @generated
 */
public class useraccountCacheModel implements CacheModel<useraccount>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{useraccountId=");
		sb.append(useraccountId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", eMail=");
		sb.append(eMail);
		sb.append(", phoneNo=");
		sb.append(phoneNo);
		sb.append(", major=");
		sb.append(major);
		sb.append(", cgpa=");
		sb.append(cgpa);
		sb.append(", role=");
		sb.append(role);
		sb.append(", password=");
		sb.append(password);
		sb.append(", asuriteId=");
		sb.append(asuriteId);
		sb.append(", level=");
		sb.append(level);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append("}");

		return sb.toString();
	}

	public useraccount toEntityModel() {
		useraccountImpl useraccountImpl = new useraccountImpl();

		useraccountImpl.setUseraccountId(useraccountId);
		useraccountImpl.setCompanyId(companyId);

		if (firstName == null) {
			useraccountImpl.setFirstName(StringPool.BLANK);
		}
		else {
			useraccountImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			useraccountImpl.setLastName(StringPool.BLANK);
		}
		else {
			useraccountImpl.setLastName(lastName);
		}

		if (eMail == null) {
			useraccountImpl.setEMail(StringPool.BLANK);
		}
		else {
			useraccountImpl.setEMail(eMail);
		}

		if (phoneNo == null) {
			useraccountImpl.setPhoneNo(StringPool.BLANK);
		}
		else {
			useraccountImpl.setPhoneNo(phoneNo);
		}

		if (major == null) {
			useraccountImpl.setMajor(StringPool.BLANK);
		}
		else {
			useraccountImpl.setMajor(major);
		}

		if (cgpa == null) {
			useraccountImpl.setCgpa(StringPool.BLANK);
		}
		else {
			useraccountImpl.setCgpa(cgpa);
		}

		if (role == null) {
			useraccountImpl.setRole(StringPool.BLANK);
		}
		else {
			useraccountImpl.setRole(role);
		}

		if (password == null) {
			useraccountImpl.setPassword(StringPool.BLANK);
		}
		else {
			useraccountImpl.setPassword(password);
		}

		if (asuriteId == null) {
			useraccountImpl.setAsuriteId(StringPool.BLANK);
		}
		else {
			useraccountImpl.setAsuriteId(asuriteId);
		}

		if (level == null) {
			useraccountImpl.setLevel(StringPool.BLANK);
		}
		else {
			useraccountImpl.setLevel(level);
		}

		if (sex == null) {
			useraccountImpl.setSex(StringPool.BLANK);
		}
		else {
			useraccountImpl.setSex(sex);
		}

		if (dateAdded == Long.MIN_VALUE) {
			useraccountImpl.setDateAdded(null);
		}
		else {
			useraccountImpl.setDateAdded(new Date(dateAdded));
		}

		useraccountImpl.resetOriginalValues();

		return useraccountImpl;
	}

	public long useraccountId;
	public long companyId;
	public String firstName;
	public String lastName;
	public String eMail;
	public String phoneNo;
	public String major;
	public String cgpa;
	public String role;
	public String password;
	public String asuriteId;
	public String level;
	public String sex;
	public long dateAdded;
}