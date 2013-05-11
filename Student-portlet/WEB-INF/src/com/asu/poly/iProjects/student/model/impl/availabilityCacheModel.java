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

import com.asu.poly.iProjects.student.model.availability;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing availability in entity cache.
 *
 * @author Shruthi
 * @see availability
 * @generated
 */
public class availabilityCacheModel implements CacheModel<availability>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(135);

		sb.append("{studentid=");
		sb.append(studentid);
		sb.append(", asuriteid=");
		sb.append(asuriteid);
		sb.append(", mon8to9=");
		sb.append(mon8to9);
		sb.append(", mon9to10=");
		sb.append(mon9to10);
		sb.append(", mon10to11=");
		sb.append(mon10to11);
		sb.append(", mon11to12=");
		sb.append(mon11to12);
		sb.append(", mon12to1=");
		sb.append(mon12to1);
		sb.append(", mon1to2=");
		sb.append(mon1to2);
		sb.append(", mon2to3=");
		sb.append(mon2to3);
		sb.append(", mon3to4=");
		sb.append(mon3to4);
		sb.append(", mon4to5=");
		sb.append(mon4to5);
		sb.append(", tue8to9=");
		sb.append(tue8to9);
		sb.append(", tue9to10=");
		sb.append(tue9to10);
		sb.append(", tue10to11=");
		sb.append(tue10to11);
		sb.append(", tue11to12=");
		sb.append(tue11to12);
		sb.append(", tue12to1=");
		sb.append(tue12to1);
		sb.append(", tue1to2=");
		sb.append(tue1to2);
		sb.append(", tue2to3=");
		sb.append(tue2to3);
		sb.append(", tue3to4=");
		sb.append(tue3to4);
		sb.append(", tue4to5=");
		sb.append(tue4to5);
		sb.append(", wed8to9=");
		sb.append(wed8to9);
		sb.append(", wed9to10=");
		sb.append(wed9to10);
		sb.append(", wed10to11=");
		sb.append(wed10to11);
		sb.append(", wed11to12=");
		sb.append(wed11to12);
		sb.append(", wed12to1=");
		sb.append(wed12to1);
		sb.append(", wed1to2=");
		sb.append(wed1to2);
		sb.append(", wed2to3=");
		sb.append(wed2to3);
		sb.append(", wed3to4=");
		sb.append(wed3to4);
		sb.append(", wed4to5=");
		sb.append(wed4to5);
		sb.append(", thu8to9=");
		sb.append(thu8to9);
		sb.append(", thu9to10=");
		sb.append(thu9to10);
		sb.append(", thu10to11=");
		sb.append(thu10to11);
		sb.append(", thu11to12=");
		sb.append(thu11to12);
		sb.append(", thu12to1=");
		sb.append(thu12to1);
		sb.append(", thu1to2=");
		sb.append(thu1to2);
		sb.append(", thu2to3=");
		sb.append(thu2to3);
		sb.append(", thu3to4=");
		sb.append(thu3to4);
		sb.append(", thu4to5=");
		sb.append(thu4to5);
		sb.append(", fri8to9=");
		sb.append(fri8to9);
		sb.append(", fri9to10=");
		sb.append(fri9to10);
		sb.append(", fri10to11=");
		sb.append(fri10to11);
		sb.append(", fri11to12=");
		sb.append(fri11to12);
		sb.append(", fri12to1=");
		sb.append(fri12to1);
		sb.append(", fri1to2=");
		sb.append(fri1to2);
		sb.append(", fri2to3=");
		sb.append(fri2to3);
		sb.append(", fri3to4=");
		sb.append(fri3to4);
		sb.append(", fri4to5=");
		sb.append(fri4to5);
		sb.append(", sat8to9=");
		sb.append(sat8to9);
		sb.append(", sat9to10=");
		sb.append(sat9to10);
		sb.append(", sat10to11=");
		sb.append(sat10to11);
		sb.append(", sat11to12=");
		sb.append(sat11to12);
		sb.append(", sat12to1=");
		sb.append(sat12to1);
		sb.append(", sat1to2=");
		sb.append(sat1to2);
		sb.append(", sat2to3=");
		sb.append(sat2to3);
		sb.append(", sat3to4=");
		sb.append(sat3to4);
		sb.append(", sat4to5=");
		sb.append(sat4to5);
		sb.append(", sun8to9=");
		sb.append(sun8to9);
		sb.append(", sun9to10=");
		sb.append(sun9to10);
		sb.append(", sun10to11=");
		sb.append(sun10to11);
		sb.append(", sun11to12=");
		sb.append(sun11to12);
		sb.append(", sun12to1=");
		sb.append(sun12to1);
		sb.append(", sun1to2=");
		sb.append(sun1to2);
		sb.append(", sun2to3=");
		sb.append(sun2to3);
		sb.append(", sun3to4=");
		sb.append(sun3to4);
		sb.append(", sun4to5=");
		sb.append(sun4to5);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	public availability toEntityModel() {
		availabilityImpl availabilityImpl = new availabilityImpl();

		availabilityImpl.setStudentid(studentid);

		if (asuriteid == null) {
			availabilityImpl.setAsuriteid(StringPool.BLANK);
		}
		else {
			availabilityImpl.setAsuriteid(asuriteid);
		}

		if (mon8to9 == null) {
			availabilityImpl.setMon8to9(StringPool.BLANK);
		}
		else {
			availabilityImpl.setMon8to9(mon8to9);
		}

		if (mon9to10 == null) {
			availabilityImpl.setMon9to10(StringPool.BLANK);
		}
		else {
			availabilityImpl.setMon9to10(mon9to10);
		}

		if (mon10to11 == null) {
			availabilityImpl.setMon10to11(StringPool.BLANK);
		}
		else {
			availabilityImpl.setMon10to11(mon10to11);
		}

		if (mon11to12 == null) {
			availabilityImpl.setMon11to12(StringPool.BLANK);
		}
		else {
			availabilityImpl.setMon11to12(mon11to12);
		}

		if (mon12to1 == null) {
			availabilityImpl.setMon12to1(StringPool.BLANK);
		}
		else {
			availabilityImpl.setMon12to1(mon12to1);
		}

		if (mon1to2 == null) {
			availabilityImpl.setMon1to2(StringPool.BLANK);
		}
		else {
			availabilityImpl.setMon1to2(mon1to2);
		}

		if (mon2to3 == null) {
			availabilityImpl.setMon2to3(StringPool.BLANK);
		}
		else {
			availabilityImpl.setMon2to3(mon2to3);
		}

		if (mon3to4 == null) {
			availabilityImpl.setMon3to4(StringPool.BLANK);
		}
		else {
			availabilityImpl.setMon3to4(mon3to4);
		}

		if (mon4to5 == null) {
			availabilityImpl.setMon4to5(StringPool.BLANK);
		}
		else {
			availabilityImpl.setMon4to5(mon4to5);
		}

		if (tue8to9 == null) {
			availabilityImpl.setTue8to9(StringPool.BLANK);
		}
		else {
			availabilityImpl.setTue8to9(tue8to9);
		}

		if (tue9to10 == null) {
			availabilityImpl.setTue9to10(StringPool.BLANK);
		}
		else {
			availabilityImpl.setTue9to10(tue9to10);
		}

		if (tue10to11 == null) {
			availabilityImpl.setTue10to11(StringPool.BLANK);
		}
		else {
			availabilityImpl.setTue10to11(tue10to11);
		}

		if (tue11to12 == null) {
			availabilityImpl.setTue11to12(StringPool.BLANK);
		}
		else {
			availabilityImpl.setTue11to12(tue11to12);
		}

		if (tue12to1 == null) {
			availabilityImpl.setTue12to1(StringPool.BLANK);
		}
		else {
			availabilityImpl.setTue12to1(tue12to1);
		}

		if (tue1to2 == null) {
			availabilityImpl.setTue1to2(StringPool.BLANK);
		}
		else {
			availabilityImpl.setTue1to2(tue1to2);
		}

		if (tue2to3 == null) {
			availabilityImpl.setTue2to3(StringPool.BLANK);
		}
		else {
			availabilityImpl.setTue2to3(tue2to3);
		}

		if (tue3to4 == null) {
			availabilityImpl.setTue3to4(StringPool.BLANK);
		}
		else {
			availabilityImpl.setTue3to4(tue3to4);
		}

		if (tue4to5 == null) {
			availabilityImpl.setTue4to5(StringPool.BLANK);
		}
		else {
			availabilityImpl.setTue4to5(tue4to5);
		}

		if (wed8to9 == null) {
			availabilityImpl.setWed8to9(StringPool.BLANK);
		}
		else {
			availabilityImpl.setWed8to9(wed8to9);
		}

		if (wed9to10 == null) {
			availabilityImpl.setWed9to10(StringPool.BLANK);
		}
		else {
			availabilityImpl.setWed9to10(wed9to10);
		}

		if (wed10to11 == null) {
			availabilityImpl.setWed10to11(StringPool.BLANK);
		}
		else {
			availabilityImpl.setWed10to11(wed10to11);
		}

		if (wed11to12 == null) {
			availabilityImpl.setWed11to12(StringPool.BLANK);
		}
		else {
			availabilityImpl.setWed11to12(wed11to12);
		}

		if (wed12to1 == null) {
			availabilityImpl.setWed12to1(StringPool.BLANK);
		}
		else {
			availabilityImpl.setWed12to1(wed12to1);
		}

		if (wed1to2 == null) {
			availabilityImpl.setWed1to2(StringPool.BLANK);
		}
		else {
			availabilityImpl.setWed1to2(wed1to2);
		}

		if (wed2to3 == null) {
			availabilityImpl.setWed2to3(StringPool.BLANK);
		}
		else {
			availabilityImpl.setWed2to3(wed2to3);
		}

		if (wed3to4 == null) {
			availabilityImpl.setWed3to4(StringPool.BLANK);
		}
		else {
			availabilityImpl.setWed3to4(wed3to4);
		}

		if (wed4to5 == null) {
			availabilityImpl.setWed4to5(StringPool.BLANK);
		}
		else {
			availabilityImpl.setWed4to5(wed4to5);
		}

		if (thu8to9 == null) {
			availabilityImpl.setThu8to9(StringPool.BLANK);
		}
		else {
			availabilityImpl.setThu8to9(thu8to9);
		}

		if (thu9to10 == null) {
			availabilityImpl.setThu9to10(StringPool.BLANK);
		}
		else {
			availabilityImpl.setThu9to10(thu9to10);
		}

		if (thu10to11 == null) {
			availabilityImpl.setThu10to11(StringPool.BLANK);
		}
		else {
			availabilityImpl.setThu10to11(thu10to11);
		}

		if (thu11to12 == null) {
			availabilityImpl.setThu11to12(StringPool.BLANK);
		}
		else {
			availabilityImpl.setThu11to12(thu11to12);
		}

		if (thu12to1 == null) {
			availabilityImpl.setThu12to1(StringPool.BLANK);
		}
		else {
			availabilityImpl.setThu12to1(thu12to1);
		}

		if (thu1to2 == null) {
			availabilityImpl.setThu1to2(StringPool.BLANK);
		}
		else {
			availabilityImpl.setThu1to2(thu1to2);
		}

		if (thu2to3 == null) {
			availabilityImpl.setThu2to3(StringPool.BLANK);
		}
		else {
			availabilityImpl.setThu2to3(thu2to3);
		}

		if (thu3to4 == null) {
			availabilityImpl.setThu3to4(StringPool.BLANK);
		}
		else {
			availabilityImpl.setThu3to4(thu3to4);
		}

		if (thu4to5 == null) {
			availabilityImpl.setThu4to5(StringPool.BLANK);
		}
		else {
			availabilityImpl.setThu4to5(thu4to5);
		}

		if (fri8to9 == null) {
			availabilityImpl.setFri8to9(StringPool.BLANK);
		}
		else {
			availabilityImpl.setFri8to9(fri8to9);
		}

		if (fri9to10 == null) {
			availabilityImpl.setFri9to10(StringPool.BLANK);
		}
		else {
			availabilityImpl.setFri9to10(fri9to10);
		}

		if (fri10to11 == null) {
			availabilityImpl.setFri10to11(StringPool.BLANK);
		}
		else {
			availabilityImpl.setFri10to11(fri10to11);
		}

		if (fri11to12 == null) {
			availabilityImpl.setFri11to12(StringPool.BLANK);
		}
		else {
			availabilityImpl.setFri11to12(fri11to12);
		}

		if (fri12to1 == null) {
			availabilityImpl.setFri12to1(StringPool.BLANK);
		}
		else {
			availabilityImpl.setFri12to1(fri12to1);
		}

		if (fri1to2 == null) {
			availabilityImpl.setFri1to2(StringPool.BLANK);
		}
		else {
			availabilityImpl.setFri1to2(fri1to2);
		}

		if (fri2to3 == null) {
			availabilityImpl.setFri2to3(StringPool.BLANK);
		}
		else {
			availabilityImpl.setFri2to3(fri2to3);
		}

		if (fri3to4 == null) {
			availabilityImpl.setFri3to4(StringPool.BLANK);
		}
		else {
			availabilityImpl.setFri3to4(fri3to4);
		}

		if (fri4to5 == null) {
			availabilityImpl.setFri4to5(StringPool.BLANK);
		}
		else {
			availabilityImpl.setFri4to5(fri4to5);
		}

		if (sat8to9 == null) {
			availabilityImpl.setSat8to9(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSat8to9(sat8to9);
		}

		if (sat9to10 == null) {
			availabilityImpl.setSat9to10(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSat9to10(sat9to10);
		}

		if (sat10to11 == null) {
			availabilityImpl.setSat10to11(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSat10to11(sat10to11);
		}

		if (sat11to12 == null) {
			availabilityImpl.setSat11to12(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSat11to12(sat11to12);
		}

		if (sat12to1 == null) {
			availabilityImpl.setSat12to1(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSat12to1(sat12to1);
		}

		if (sat1to2 == null) {
			availabilityImpl.setSat1to2(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSat1to2(sat1to2);
		}

		if (sat2to3 == null) {
			availabilityImpl.setSat2to3(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSat2to3(sat2to3);
		}

		if (sat3to4 == null) {
			availabilityImpl.setSat3to4(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSat3to4(sat3to4);
		}

		if (sat4to5 == null) {
			availabilityImpl.setSat4to5(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSat4to5(sat4to5);
		}

		if (sun8to9 == null) {
			availabilityImpl.setSun8to9(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSun8to9(sun8to9);
		}

		if (sun9to10 == null) {
			availabilityImpl.setSun9to10(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSun9to10(sun9to10);
		}

		if (sun10to11 == null) {
			availabilityImpl.setSun10to11(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSun10to11(sun10to11);
		}

		if (sun11to12 == null) {
			availabilityImpl.setSun11to12(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSun11to12(sun11to12);
		}

		if (sun12to1 == null) {
			availabilityImpl.setSun12to1(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSun12to1(sun12to1);
		}

		if (sun1to2 == null) {
			availabilityImpl.setSun1to2(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSun1to2(sun1to2);
		}

		if (sun2to3 == null) {
			availabilityImpl.setSun2to3(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSun2to3(sun2to3);
		}

		if (sun3to4 == null) {
			availabilityImpl.setSun3to4(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSun3to4(sun3to4);
		}

		if (sun4to5 == null) {
			availabilityImpl.setSun4to5(StringPool.BLANK);
		}
		else {
			availabilityImpl.setSun4to5(sun4to5);
		}

		if (createDate == Long.MIN_VALUE) {
			availabilityImpl.setCreateDate(null);
		}
		else {
			availabilityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			availabilityImpl.setModifiedDate(null);
		}
		else {
			availabilityImpl.setModifiedDate(new Date(modifiedDate));
		}

		availabilityImpl.resetOriginalValues();

		return availabilityImpl;
	}

	public long studentid;
	public String asuriteid;
	public String mon8to9;
	public String mon9to10;
	public String mon10to11;
	public String mon11to12;
	public String mon12to1;
	public String mon1to2;
	public String mon2to3;
	public String mon3to4;
	public String mon4to5;
	public String tue8to9;
	public String tue9to10;
	public String tue10to11;
	public String tue11to12;
	public String tue12to1;
	public String tue1to2;
	public String tue2to3;
	public String tue3to4;
	public String tue4to5;
	public String wed8to9;
	public String wed9to10;
	public String wed10to11;
	public String wed11to12;
	public String wed12to1;
	public String wed1to2;
	public String wed2to3;
	public String wed3to4;
	public String wed4to5;
	public String thu8to9;
	public String thu9to10;
	public String thu10to11;
	public String thu11to12;
	public String thu12to1;
	public String thu1to2;
	public String thu2to3;
	public String thu3to4;
	public String thu4to5;
	public String fri8to9;
	public String fri9to10;
	public String fri10to11;
	public String fri11to12;
	public String fri12to1;
	public String fri1to2;
	public String fri2to3;
	public String fri3to4;
	public String fri4to5;
	public String sat8to9;
	public String sat9to10;
	public String sat10to11;
	public String sat11to12;
	public String sat12to1;
	public String sat1to2;
	public String sat2to3;
	public String sat3to4;
	public String sat4to5;
	public String sun8to9;
	public String sun9to10;
	public String sun10to11;
	public String sun11to12;
	public String sun12to1;
	public String sun1to2;
	public String sun2to3;
	public String sun3to4;
	public String sun4to5;
	public long createDate;
	public long modifiedDate;
}