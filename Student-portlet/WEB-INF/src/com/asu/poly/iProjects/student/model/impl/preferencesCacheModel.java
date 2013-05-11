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

import com.asu.poly.iProjects.student.model.preferences;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing preferences in entity cache.
 *
 * @author Shruthi
 * @see preferences
 * @generated
 */
public class preferencesCacheModel implements CacheModel<preferences>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{studentID=");
		sb.append(studentID);
		sb.append(", asuriteid=");
		sb.append(asuriteid);
		sb.append(", preference1=");
		sb.append(preference1);
		sb.append(", preference2=");
		sb.append(preference2);
		sb.append(", preference3=");
		sb.append(preference3);
		sb.append(", preference4=");
		sb.append(preference4);
		sb.append(", preference5=");
		sb.append(preference5);
		sb.append(", studentasuid=");
		sb.append(studentasuid);
		sb.append(", focusarea=");
		sb.append(focusarea);
		sb.append(", reasons=");
		sb.append(reasons);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append(", dateModified=");
		sb.append(dateModified);
		sb.append("}");

		return sb.toString();
	}

	public preferences toEntityModel() {
		preferencesImpl preferencesImpl = new preferencesImpl();

		preferencesImpl.setStudentID(studentID);

		if (asuriteid == null) {
			preferencesImpl.setAsuriteid(StringPool.BLANK);
		}
		else {
			preferencesImpl.setAsuriteid(asuriteid);
		}

		if (preference1 == null) {
			preferencesImpl.setPreference1(StringPool.BLANK);
		}
		else {
			preferencesImpl.setPreference1(preference1);
		}

		if (preference2 == null) {
			preferencesImpl.setPreference2(StringPool.BLANK);
		}
		else {
			preferencesImpl.setPreference2(preference2);
		}

		if (preference3 == null) {
			preferencesImpl.setPreference3(StringPool.BLANK);
		}
		else {
			preferencesImpl.setPreference3(preference3);
		}

		if (preference4 == null) {
			preferencesImpl.setPreference4(StringPool.BLANK);
		}
		else {
			preferencesImpl.setPreference4(preference4);
		}

		if (preference5 == null) {
			preferencesImpl.setPreference5(StringPool.BLANK);
		}
		else {
			preferencesImpl.setPreference5(preference5);
		}

		preferencesImpl.setStudentasuid(studentasuid);

		if (focusarea == null) {
			preferencesImpl.setFocusarea(StringPool.BLANK);
		}
		else {
			preferencesImpl.setFocusarea(focusarea);
		}

		if (reasons == null) {
			preferencesImpl.setReasons(StringPool.BLANK);
		}
		else {
			preferencesImpl.setReasons(reasons);
		}

		if (dateAdded == Long.MIN_VALUE) {
			preferencesImpl.setDateAdded(null);
		}
		else {
			preferencesImpl.setDateAdded(new Date(dateAdded));
		}

		if (dateModified == Long.MIN_VALUE) {
			preferencesImpl.setDateModified(null);
		}
		else {
			preferencesImpl.setDateModified(new Date(dateModified));
		}

		preferencesImpl.resetOriginalValues();

		return preferencesImpl;
	}

	public long studentID;
	public String asuriteid;
	public String preference1;
	public String preference2;
	public String preference3;
	public String preference4;
	public String preference5;
	public long studentasuid;
	public String focusarea;
	public String reasons;
	public long dateAdded;
	public long dateModified;
}