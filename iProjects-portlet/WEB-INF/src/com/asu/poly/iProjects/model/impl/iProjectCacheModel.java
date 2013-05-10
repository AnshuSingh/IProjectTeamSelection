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

package com.asu.poly.iProjects.model.impl;

import com.asu.poly.iProjects.model.iProject;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing iProject in entity cache.
 *
 * @author Shruthi
 * @see iProject
 * @generated
 */
public class iProjectCacheModel implements CacheModel<iProject>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{projectID=");
		sb.append(projectID);
		sb.append(", projectTitle=");
		sb.append(projectTitle);
		sb.append(", projectdescription=");
		sb.append(projectdescription);
		sb.append(", sponsor=");
		sb.append(sponsor);
		sb.append(", requiredSkills=");
		sb.append(requiredSkills);
		sb.append(", contact=");
		sb.append(contact);
		sb.append(", status=");
		sb.append(status);
		sb.append(", link=");
		sb.append(link);
		sb.append(", departments=");
		sb.append(departments);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append(", dateModified=");
		sb.append(dateModified);
		sb.append("}");

		return sb.toString();
	}

	public iProject toEntityModel() {
		iProjectImpl iProjectImpl = new iProjectImpl();

		iProjectImpl.setProjectID(projectID);

		if (projectTitle == null) {
			iProjectImpl.setProjectTitle(StringPool.BLANK);
		}
		else {
			iProjectImpl.setProjectTitle(projectTitle);
		}

		if (projectdescription == null) {
			iProjectImpl.setProjectdescription(StringPool.BLANK);
		}
		else {
			iProjectImpl.setProjectdescription(projectdescription);
		}

		if (sponsor == null) {
			iProjectImpl.setSponsor(StringPool.BLANK);
		}
		else {
			iProjectImpl.setSponsor(sponsor);
		}

		if (requiredSkills == null) {
			iProjectImpl.setRequiredSkills(StringPool.BLANK);
		}
		else {
			iProjectImpl.setRequiredSkills(requiredSkills);
		}

		if (contact == null) {
			iProjectImpl.setContact(StringPool.BLANK);
		}
		else {
			iProjectImpl.setContact(contact);
		}

		if (status == null) {
			iProjectImpl.setStatus(StringPool.BLANK);
		}
		else {
			iProjectImpl.setStatus(status);
		}

		if (link == null) {
			iProjectImpl.setLink(StringPool.BLANK);
		}
		else {
			iProjectImpl.setLink(link);
		}

		if (departments == null) {
			iProjectImpl.setDepartments(StringPool.BLANK);
		}
		else {
			iProjectImpl.setDepartments(departments);
		}

		if (dateAdded == Long.MIN_VALUE) {
			iProjectImpl.setDateAdded(null);
		}
		else {
			iProjectImpl.setDateAdded(new Date(dateAdded));
		}

		if (dateModified == Long.MIN_VALUE) {
			iProjectImpl.setDateModified(null);
		}
		else {
			iProjectImpl.setDateModified(new Date(dateModified));
		}

		iProjectImpl.resetOriginalValues();

		return iProjectImpl;
	}

	public long projectID;
	public String projectTitle;
	public String projectdescription;
	public String sponsor;
	public String requiredSkills;
	public String contact;
	public String status;
	public String link;
	public String departments;
	public long dateAdded;
	public long dateModified;
}