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

package com.StudentAvailability.slayer.model.impl;

import com.StudentAvailability.slayer.model.SASstudent;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing SASstudent in entity cache.
 *
 * @author Purva
 * @see SASstudent
 * @generated
 */
public class SASstudentCacheModel implements CacheModel<SASstudent>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(135);

		sb.append("{studentid=");
		sb.append(studentid);
		sb.append(", ASUId=");
		sb.append(ASUId);
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
		sb.append(", author=");
		sb.append(author);
		sb.append(", dateAdded=");
		sb.append(dateAdded);
		sb.append("}");

		return sb.toString();
	}

	public SASstudent toEntityModel() {
		SASstudentImpl saSstudentImpl = new SASstudentImpl();

		saSstudentImpl.setStudentid(studentid);

		if (ASUId == null) {
			saSstudentImpl.setASUId(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setASUId(ASUId);
		}

		if (mon8to9 == null) {
			saSstudentImpl.setMon8to9(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setMon8to9(mon8to9);
		}

		if (mon9to10 == null) {
			saSstudentImpl.setMon9to10(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setMon9to10(mon9to10);
		}

		if (mon10to11 == null) {
			saSstudentImpl.setMon10to11(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setMon10to11(mon10to11);
		}

		if (mon11to12 == null) {
			saSstudentImpl.setMon11to12(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setMon11to12(mon11to12);
		}

		if (mon12to1 == null) {
			saSstudentImpl.setMon12to1(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setMon12to1(mon12to1);
		}

		if (mon1to2 == null) {
			saSstudentImpl.setMon1to2(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setMon1to2(mon1to2);
		}

		if (mon2to3 == null) {
			saSstudentImpl.setMon2to3(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setMon2to3(mon2to3);
		}

		if (mon3to4 == null) {
			saSstudentImpl.setMon3to4(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setMon3to4(mon3to4);
		}

		if (mon4to5 == null) {
			saSstudentImpl.setMon4to5(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setMon4to5(mon4to5);
		}

		if (tue8to9 == null) {
			saSstudentImpl.setTue8to9(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setTue8to9(tue8to9);
		}

		if (tue9to10 == null) {
			saSstudentImpl.setTue9to10(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setTue9to10(tue9to10);
		}

		if (tue10to11 == null) {
			saSstudentImpl.setTue10to11(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setTue10to11(tue10to11);
		}

		if (tue11to12 == null) {
			saSstudentImpl.setTue11to12(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setTue11to12(tue11to12);
		}

		if (tue12to1 == null) {
			saSstudentImpl.setTue12to1(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setTue12to1(tue12to1);
		}

		if (tue1to2 == null) {
			saSstudentImpl.setTue1to2(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setTue1to2(tue1to2);
		}

		if (tue2to3 == null) {
			saSstudentImpl.setTue2to3(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setTue2to3(tue2to3);
		}

		if (tue3to4 == null) {
			saSstudentImpl.setTue3to4(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setTue3to4(tue3to4);
		}

		if (tue4to5 == null) {
			saSstudentImpl.setTue4to5(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setTue4to5(tue4to5);
		}

		if (wed8to9 == null) {
			saSstudentImpl.setWed8to9(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setWed8to9(wed8to9);
		}

		if (wed9to10 == null) {
			saSstudentImpl.setWed9to10(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setWed9to10(wed9to10);
		}

		if (wed10to11 == null) {
			saSstudentImpl.setWed10to11(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setWed10to11(wed10to11);
		}

		if (wed11to12 == null) {
			saSstudentImpl.setWed11to12(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setWed11to12(wed11to12);
		}

		if (wed12to1 == null) {
			saSstudentImpl.setWed12to1(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setWed12to1(wed12to1);
		}

		if (wed1to2 == null) {
			saSstudentImpl.setWed1to2(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setWed1to2(wed1to2);
		}

		if (wed2to3 == null) {
			saSstudentImpl.setWed2to3(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setWed2to3(wed2to3);
		}

		if (wed3to4 == null) {
			saSstudentImpl.setWed3to4(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setWed3to4(wed3to4);
		}

		if (wed4to5 == null) {
			saSstudentImpl.setWed4to5(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setWed4to5(wed4to5);
		}

		if (thu8to9 == null) {
			saSstudentImpl.setThu8to9(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setThu8to9(thu8to9);
		}

		if (thu9to10 == null) {
			saSstudentImpl.setThu9to10(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setThu9to10(thu9to10);
		}

		if (thu10to11 == null) {
			saSstudentImpl.setThu10to11(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setThu10to11(thu10to11);
		}

		if (thu11to12 == null) {
			saSstudentImpl.setThu11to12(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setThu11to12(thu11to12);
		}

		if (thu12to1 == null) {
			saSstudentImpl.setThu12to1(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setThu12to1(thu12to1);
		}

		if (thu1to2 == null) {
			saSstudentImpl.setThu1to2(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setThu1to2(thu1to2);
		}

		if (thu2to3 == null) {
			saSstudentImpl.setThu2to3(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setThu2to3(thu2to3);
		}

		if (thu3to4 == null) {
			saSstudentImpl.setThu3to4(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setThu3to4(thu3to4);
		}

		if (thu4to5 == null) {
			saSstudentImpl.setThu4to5(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setThu4to5(thu4to5);
		}

		if (fri8to9 == null) {
			saSstudentImpl.setFri8to9(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setFri8to9(fri8to9);
		}

		if (fri9to10 == null) {
			saSstudentImpl.setFri9to10(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setFri9to10(fri9to10);
		}

		if (fri10to11 == null) {
			saSstudentImpl.setFri10to11(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setFri10to11(fri10to11);
		}

		if (fri11to12 == null) {
			saSstudentImpl.setFri11to12(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setFri11to12(fri11to12);
		}

		if (fri12to1 == null) {
			saSstudentImpl.setFri12to1(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setFri12to1(fri12to1);
		}

		if (fri1to2 == null) {
			saSstudentImpl.setFri1to2(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setFri1to2(fri1to2);
		}

		if (fri2to3 == null) {
			saSstudentImpl.setFri2to3(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setFri2to3(fri2to3);
		}

		if (fri3to4 == null) {
			saSstudentImpl.setFri3to4(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setFri3to4(fri3to4);
		}

		if (fri4to5 == null) {
			saSstudentImpl.setFri4to5(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setFri4to5(fri4to5);
		}

		if (sat8to9 == null) {
			saSstudentImpl.setSat8to9(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSat8to9(sat8to9);
		}

		if (sat9to10 == null) {
			saSstudentImpl.setSat9to10(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSat9to10(sat9to10);
		}

		if (sat10to11 == null) {
			saSstudentImpl.setSat10to11(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSat10to11(sat10to11);
		}

		if (sat11to12 == null) {
			saSstudentImpl.setSat11to12(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSat11to12(sat11to12);
		}

		if (sat12to1 == null) {
			saSstudentImpl.setSat12to1(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSat12to1(sat12to1);
		}

		if (sat1to2 == null) {
			saSstudentImpl.setSat1to2(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSat1to2(sat1to2);
		}

		if (sat2to3 == null) {
			saSstudentImpl.setSat2to3(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSat2to3(sat2to3);
		}

		if (sat3to4 == null) {
			saSstudentImpl.setSat3to4(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSat3to4(sat3to4);
		}

		if (sat4to5 == null) {
			saSstudentImpl.setSat4to5(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSat4to5(sat4to5);
		}

		if (sun8to9 == null) {
			saSstudentImpl.setSun8to9(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSun8to9(sun8to9);
		}

		if (sun9to10 == null) {
			saSstudentImpl.setSun9to10(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSun9to10(sun9to10);
		}

		if (sun10to11 == null) {
			saSstudentImpl.setSun10to11(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSun10to11(sun10to11);
		}

		if (sun11to12 == null) {
			saSstudentImpl.setSun11to12(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSun11to12(sun11to12);
		}

		if (sun12to1 == null) {
			saSstudentImpl.setSun12to1(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSun12to1(sun12to1);
		}

		if (sun1to2 == null) {
			saSstudentImpl.setSun1to2(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSun1to2(sun1to2);
		}

		if (sun2to3 == null) {
			saSstudentImpl.setSun2to3(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSun2to3(sun2to3);
		}

		if (sun3to4 == null) {
			saSstudentImpl.setSun3to4(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSun3to4(sun3to4);
		}

		if (sun4to5 == null) {
			saSstudentImpl.setSun4to5(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setSun4to5(sun4to5);
		}

		if (author == null) {
			saSstudentImpl.setAuthor(StringPool.BLANK);
		}
		else {
			saSstudentImpl.setAuthor(author);
		}

		if (dateAdded == Long.MIN_VALUE) {
			saSstudentImpl.setDateAdded(null);
		}
		else {
			saSstudentImpl.setDateAdded(new Date(dateAdded));
		}

		saSstudentImpl.resetOriginalValues();

		return saSstudentImpl;
	}

	public long studentid;
	public String ASUId;
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
	public String author;
	public long dateAdded;
}