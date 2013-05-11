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

import com.asu.poly.iProjects.student.service.availabilityLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Shruthi
 */
public class availabilityClp extends BaseModelImpl<availability>
	implements availability {
	public availabilityClp() {
	}

	public Class<?> getModelClass() {
		return availability.class;
	}

	public String getModelClassName() {
		return availability.class.getName();
	}

	public long getPrimaryKey() {
		return _studentid;
	}

	public void setPrimaryKey(long primaryKey) {
		setStudentid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_studentid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentid", getStudentid());
		attributes.put("asuriteid", getAsuriteid());
		attributes.put("mon8to9", getMon8to9());
		attributes.put("mon9to10", getMon9to10());
		attributes.put("mon10to11", getMon10to11());
		attributes.put("mon11to12", getMon11to12());
		attributes.put("mon12to1", getMon12to1());
		attributes.put("mon1to2", getMon1to2());
		attributes.put("mon2to3", getMon2to3());
		attributes.put("mon3to4", getMon3to4());
		attributes.put("mon4to5", getMon4to5());
		attributes.put("tue8to9", getTue8to9());
		attributes.put("tue9to10", getTue9to10());
		attributes.put("tue10to11", getTue10to11());
		attributes.put("tue11to12", getTue11to12());
		attributes.put("tue12to1", getTue12to1());
		attributes.put("tue1to2", getTue1to2());
		attributes.put("tue2to3", getTue2to3());
		attributes.put("tue3to4", getTue3to4());
		attributes.put("tue4to5", getTue4to5());
		attributes.put("wed8to9", getWed8to9());
		attributes.put("wed9to10", getWed9to10());
		attributes.put("wed10to11", getWed10to11());
		attributes.put("wed11to12", getWed11to12());
		attributes.put("wed12to1", getWed12to1());
		attributes.put("wed1to2", getWed1to2());
		attributes.put("wed2to3", getWed2to3());
		attributes.put("wed3to4", getWed3to4());
		attributes.put("wed4to5", getWed4to5());
		attributes.put("thu8to9", getThu8to9());
		attributes.put("thu9to10", getThu9to10());
		attributes.put("thu10to11", getThu10to11());
		attributes.put("thu11to12", getThu11to12());
		attributes.put("thu12to1", getThu12to1());
		attributes.put("thu1to2", getThu1to2());
		attributes.put("thu2to3", getThu2to3());
		attributes.put("thu3to4", getThu3to4());
		attributes.put("thu4to5", getThu4to5());
		attributes.put("fri8to9", getFri8to9());
		attributes.put("fri9to10", getFri9to10());
		attributes.put("fri10to11", getFri10to11());
		attributes.put("fri11to12", getFri11to12());
		attributes.put("fri12to1", getFri12to1());
		attributes.put("fri1to2", getFri1to2());
		attributes.put("fri2to3", getFri2to3());
		attributes.put("fri3to4", getFri3to4());
		attributes.put("fri4to5", getFri4to5());
		attributes.put("sat8to9", getSat8to9());
		attributes.put("sat9to10", getSat9to10());
		attributes.put("sat10to11", getSat10to11());
		attributes.put("sat11to12", getSat11to12());
		attributes.put("sat12to1", getSat12to1());
		attributes.put("sat1to2", getSat1to2());
		attributes.put("sat2to3", getSat2to3());
		attributes.put("sat3to4", getSat3to4());
		attributes.put("sat4to5", getSat4to5());
		attributes.put("sun8to9", getSun8to9());
		attributes.put("sun9to10", getSun9to10());
		attributes.put("sun10to11", getSun10to11());
		attributes.put("sun11to12", getSun11to12());
		attributes.put("sun12to1", getSun12to1());
		attributes.put("sun1to2", getSun1to2());
		attributes.put("sun2to3", getSun2to3());
		attributes.put("sun3to4", getSun3to4());
		attributes.put("sun4to5", getSun4to5());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentid = (Long)attributes.get("studentid");

		if (studentid != null) {
			setStudentid(studentid);
		}

		String asuriteid = (String)attributes.get("asuriteid");

		if (asuriteid != null) {
			setAsuriteid(asuriteid);
		}

		String mon8to9 = (String)attributes.get("mon8to9");

		if (mon8to9 != null) {
			setMon8to9(mon8to9);
		}

		String mon9to10 = (String)attributes.get("mon9to10");

		if (mon9to10 != null) {
			setMon9to10(mon9to10);
		}

		String mon10to11 = (String)attributes.get("mon10to11");

		if (mon10to11 != null) {
			setMon10to11(mon10to11);
		}

		String mon11to12 = (String)attributes.get("mon11to12");

		if (mon11to12 != null) {
			setMon11to12(mon11to12);
		}

		String mon12to1 = (String)attributes.get("mon12to1");

		if (mon12to1 != null) {
			setMon12to1(mon12to1);
		}

		String mon1to2 = (String)attributes.get("mon1to2");

		if (mon1to2 != null) {
			setMon1to2(mon1to2);
		}

		String mon2to3 = (String)attributes.get("mon2to3");

		if (mon2to3 != null) {
			setMon2to3(mon2to3);
		}

		String mon3to4 = (String)attributes.get("mon3to4");

		if (mon3to4 != null) {
			setMon3to4(mon3to4);
		}

		String mon4to5 = (String)attributes.get("mon4to5");

		if (mon4to5 != null) {
			setMon4to5(mon4to5);
		}

		String tue8to9 = (String)attributes.get("tue8to9");

		if (tue8to9 != null) {
			setTue8to9(tue8to9);
		}

		String tue9to10 = (String)attributes.get("tue9to10");

		if (tue9to10 != null) {
			setTue9to10(tue9to10);
		}

		String tue10to11 = (String)attributes.get("tue10to11");

		if (tue10to11 != null) {
			setTue10to11(tue10to11);
		}

		String tue11to12 = (String)attributes.get("tue11to12");

		if (tue11to12 != null) {
			setTue11to12(tue11to12);
		}

		String tue12to1 = (String)attributes.get("tue12to1");

		if (tue12to1 != null) {
			setTue12to1(tue12to1);
		}

		String tue1to2 = (String)attributes.get("tue1to2");

		if (tue1to2 != null) {
			setTue1to2(tue1to2);
		}

		String tue2to3 = (String)attributes.get("tue2to3");

		if (tue2to3 != null) {
			setTue2to3(tue2to3);
		}

		String tue3to4 = (String)attributes.get("tue3to4");

		if (tue3to4 != null) {
			setTue3to4(tue3to4);
		}

		String tue4to5 = (String)attributes.get("tue4to5");

		if (tue4to5 != null) {
			setTue4to5(tue4to5);
		}

		String wed8to9 = (String)attributes.get("wed8to9");

		if (wed8to9 != null) {
			setWed8to9(wed8to9);
		}

		String wed9to10 = (String)attributes.get("wed9to10");

		if (wed9to10 != null) {
			setWed9to10(wed9to10);
		}

		String wed10to11 = (String)attributes.get("wed10to11");

		if (wed10to11 != null) {
			setWed10to11(wed10to11);
		}

		String wed11to12 = (String)attributes.get("wed11to12");

		if (wed11to12 != null) {
			setWed11to12(wed11to12);
		}

		String wed12to1 = (String)attributes.get("wed12to1");

		if (wed12to1 != null) {
			setWed12to1(wed12to1);
		}

		String wed1to2 = (String)attributes.get("wed1to2");

		if (wed1to2 != null) {
			setWed1to2(wed1to2);
		}

		String wed2to3 = (String)attributes.get("wed2to3");

		if (wed2to3 != null) {
			setWed2to3(wed2to3);
		}

		String wed3to4 = (String)attributes.get("wed3to4");

		if (wed3to4 != null) {
			setWed3to4(wed3to4);
		}

		String wed4to5 = (String)attributes.get("wed4to5");

		if (wed4to5 != null) {
			setWed4to5(wed4to5);
		}

		String thu8to9 = (String)attributes.get("thu8to9");

		if (thu8to9 != null) {
			setThu8to9(thu8to9);
		}

		String thu9to10 = (String)attributes.get("thu9to10");

		if (thu9to10 != null) {
			setThu9to10(thu9to10);
		}

		String thu10to11 = (String)attributes.get("thu10to11");

		if (thu10to11 != null) {
			setThu10to11(thu10to11);
		}

		String thu11to12 = (String)attributes.get("thu11to12");

		if (thu11to12 != null) {
			setThu11to12(thu11to12);
		}

		String thu12to1 = (String)attributes.get("thu12to1");

		if (thu12to1 != null) {
			setThu12to1(thu12to1);
		}

		String thu1to2 = (String)attributes.get("thu1to2");

		if (thu1to2 != null) {
			setThu1to2(thu1to2);
		}

		String thu2to3 = (String)attributes.get("thu2to3");

		if (thu2to3 != null) {
			setThu2to3(thu2to3);
		}

		String thu3to4 = (String)attributes.get("thu3to4");

		if (thu3to4 != null) {
			setThu3to4(thu3to4);
		}

		String thu4to5 = (String)attributes.get("thu4to5");

		if (thu4to5 != null) {
			setThu4to5(thu4to5);
		}

		String fri8to9 = (String)attributes.get("fri8to9");

		if (fri8to9 != null) {
			setFri8to9(fri8to9);
		}

		String fri9to10 = (String)attributes.get("fri9to10");

		if (fri9to10 != null) {
			setFri9to10(fri9to10);
		}

		String fri10to11 = (String)attributes.get("fri10to11");

		if (fri10to11 != null) {
			setFri10to11(fri10to11);
		}

		String fri11to12 = (String)attributes.get("fri11to12");

		if (fri11to12 != null) {
			setFri11to12(fri11to12);
		}

		String fri12to1 = (String)attributes.get("fri12to1");

		if (fri12to1 != null) {
			setFri12to1(fri12to1);
		}

		String fri1to2 = (String)attributes.get("fri1to2");

		if (fri1to2 != null) {
			setFri1to2(fri1to2);
		}

		String fri2to3 = (String)attributes.get("fri2to3");

		if (fri2to3 != null) {
			setFri2to3(fri2to3);
		}

		String fri3to4 = (String)attributes.get("fri3to4");

		if (fri3to4 != null) {
			setFri3to4(fri3to4);
		}

		String fri4to5 = (String)attributes.get("fri4to5");

		if (fri4to5 != null) {
			setFri4to5(fri4to5);
		}

		String sat8to9 = (String)attributes.get("sat8to9");

		if (sat8to9 != null) {
			setSat8to9(sat8to9);
		}

		String sat9to10 = (String)attributes.get("sat9to10");

		if (sat9to10 != null) {
			setSat9to10(sat9to10);
		}

		String sat10to11 = (String)attributes.get("sat10to11");

		if (sat10to11 != null) {
			setSat10to11(sat10to11);
		}

		String sat11to12 = (String)attributes.get("sat11to12");

		if (sat11to12 != null) {
			setSat11to12(sat11to12);
		}

		String sat12to1 = (String)attributes.get("sat12to1");

		if (sat12to1 != null) {
			setSat12to1(sat12to1);
		}

		String sat1to2 = (String)attributes.get("sat1to2");

		if (sat1to2 != null) {
			setSat1to2(sat1to2);
		}

		String sat2to3 = (String)attributes.get("sat2to3");

		if (sat2to3 != null) {
			setSat2to3(sat2to3);
		}

		String sat3to4 = (String)attributes.get("sat3to4");

		if (sat3to4 != null) {
			setSat3to4(sat3to4);
		}

		String sat4to5 = (String)attributes.get("sat4to5");

		if (sat4to5 != null) {
			setSat4to5(sat4to5);
		}

		String sun8to9 = (String)attributes.get("sun8to9");

		if (sun8to9 != null) {
			setSun8to9(sun8to9);
		}

		String sun9to10 = (String)attributes.get("sun9to10");

		if (sun9to10 != null) {
			setSun9to10(sun9to10);
		}

		String sun10to11 = (String)attributes.get("sun10to11");

		if (sun10to11 != null) {
			setSun10to11(sun10to11);
		}

		String sun11to12 = (String)attributes.get("sun11to12");

		if (sun11to12 != null) {
			setSun11to12(sun11to12);
		}

		String sun12to1 = (String)attributes.get("sun12to1");

		if (sun12to1 != null) {
			setSun12to1(sun12to1);
		}

		String sun1to2 = (String)attributes.get("sun1to2");

		if (sun1to2 != null) {
			setSun1to2(sun1to2);
		}

		String sun2to3 = (String)attributes.get("sun2to3");

		if (sun2to3 != null) {
			setSun2to3(sun2to3);
		}

		String sun3to4 = (String)attributes.get("sun3to4");

		if (sun3to4 != null) {
			setSun3to4(sun3to4);
		}

		String sun4to5 = (String)attributes.get("sun4to5");

		if (sun4to5 != null) {
			setSun4to5(sun4to5);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	public long getStudentid() {
		return _studentid;
	}

	public void setStudentid(long studentid) {
		_studentid = studentid;
	}

	public String getAsuriteid() {
		return _asuriteid;
	}

	public void setAsuriteid(String asuriteid) {
		_asuriteid = asuriteid;
	}

	public String getMon8to9() {
		return _mon8to9;
	}

	public void setMon8to9(String mon8to9) {
		_mon8to9 = mon8to9;
	}

	public String getMon9to10() {
		return _mon9to10;
	}

	public void setMon9to10(String mon9to10) {
		_mon9to10 = mon9to10;
	}

	public String getMon10to11() {
		return _mon10to11;
	}

	public void setMon10to11(String mon10to11) {
		_mon10to11 = mon10to11;
	}

	public String getMon11to12() {
		return _mon11to12;
	}

	public void setMon11to12(String mon11to12) {
		_mon11to12 = mon11to12;
	}

	public String getMon12to1() {
		return _mon12to1;
	}

	public void setMon12to1(String mon12to1) {
		_mon12to1 = mon12to1;
	}

	public String getMon1to2() {
		return _mon1to2;
	}

	public void setMon1to2(String mon1to2) {
		_mon1to2 = mon1to2;
	}

	public String getMon2to3() {
		return _mon2to3;
	}

	public void setMon2to3(String mon2to3) {
		_mon2to3 = mon2to3;
	}

	public String getMon3to4() {
		return _mon3to4;
	}

	public void setMon3to4(String mon3to4) {
		_mon3to4 = mon3to4;
	}

	public String getMon4to5() {
		return _mon4to5;
	}

	public void setMon4to5(String mon4to5) {
		_mon4to5 = mon4to5;
	}

	public String getTue8to9() {
		return _tue8to9;
	}

	public void setTue8to9(String tue8to9) {
		_tue8to9 = tue8to9;
	}

	public String getTue9to10() {
		return _tue9to10;
	}

	public void setTue9to10(String tue9to10) {
		_tue9to10 = tue9to10;
	}

	public String getTue10to11() {
		return _tue10to11;
	}

	public void setTue10to11(String tue10to11) {
		_tue10to11 = tue10to11;
	}

	public String getTue11to12() {
		return _tue11to12;
	}

	public void setTue11to12(String tue11to12) {
		_tue11to12 = tue11to12;
	}

	public String getTue12to1() {
		return _tue12to1;
	}

	public void setTue12to1(String tue12to1) {
		_tue12to1 = tue12to1;
	}

	public String getTue1to2() {
		return _tue1to2;
	}

	public void setTue1to2(String tue1to2) {
		_tue1to2 = tue1to2;
	}

	public String getTue2to3() {
		return _tue2to3;
	}

	public void setTue2to3(String tue2to3) {
		_tue2to3 = tue2to3;
	}

	public String getTue3to4() {
		return _tue3to4;
	}

	public void setTue3to4(String tue3to4) {
		_tue3to4 = tue3to4;
	}

	public String getTue4to5() {
		return _tue4to5;
	}

	public void setTue4to5(String tue4to5) {
		_tue4to5 = tue4to5;
	}

	public String getWed8to9() {
		return _wed8to9;
	}

	public void setWed8to9(String wed8to9) {
		_wed8to9 = wed8to9;
	}

	public String getWed9to10() {
		return _wed9to10;
	}

	public void setWed9to10(String wed9to10) {
		_wed9to10 = wed9to10;
	}

	public String getWed10to11() {
		return _wed10to11;
	}

	public void setWed10to11(String wed10to11) {
		_wed10to11 = wed10to11;
	}

	public String getWed11to12() {
		return _wed11to12;
	}

	public void setWed11to12(String wed11to12) {
		_wed11to12 = wed11to12;
	}

	public String getWed12to1() {
		return _wed12to1;
	}

	public void setWed12to1(String wed12to1) {
		_wed12to1 = wed12to1;
	}

	public String getWed1to2() {
		return _wed1to2;
	}

	public void setWed1to2(String wed1to2) {
		_wed1to2 = wed1to2;
	}

	public String getWed2to3() {
		return _wed2to3;
	}

	public void setWed2to3(String wed2to3) {
		_wed2to3 = wed2to3;
	}

	public String getWed3to4() {
		return _wed3to4;
	}

	public void setWed3to4(String wed3to4) {
		_wed3to4 = wed3to4;
	}

	public String getWed4to5() {
		return _wed4to5;
	}

	public void setWed4to5(String wed4to5) {
		_wed4to5 = wed4to5;
	}

	public String getThu8to9() {
		return _thu8to9;
	}

	public void setThu8to9(String thu8to9) {
		_thu8to9 = thu8to9;
	}

	public String getThu9to10() {
		return _thu9to10;
	}

	public void setThu9to10(String thu9to10) {
		_thu9to10 = thu9to10;
	}

	public String getThu10to11() {
		return _thu10to11;
	}

	public void setThu10to11(String thu10to11) {
		_thu10to11 = thu10to11;
	}

	public String getThu11to12() {
		return _thu11to12;
	}

	public void setThu11to12(String thu11to12) {
		_thu11to12 = thu11to12;
	}

	public String getThu12to1() {
		return _thu12to1;
	}

	public void setThu12to1(String thu12to1) {
		_thu12to1 = thu12to1;
	}

	public String getThu1to2() {
		return _thu1to2;
	}

	public void setThu1to2(String thu1to2) {
		_thu1to2 = thu1to2;
	}

	public String getThu2to3() {
		return _thu2to3;
	}

	public void setThu2to3(String thu2to3) {
		_thu2to3 = thu2to3;
	}

	public String getThu3to4() {
		return _thu3to4;
	}

	public void setThu3to4(String thu3to4) {
		_thu3to4 = thu3to4;
	}

	public String getThu4to5() {
		return _thu4to5;
	}

	public void setThu4to5(String thu4to5) {
		_thu4to5 = thu4to5;
	}

	public String getFri8to9() {
		return _fri8to9;
	}

	public void setFri8to9(String fri8to9) {
		_fri8to9 = fri8to9;
	}

	public String getFri9to10() {
		return _fri9to10;
	}

	public void setFri9to10(String fri9to10) {
		_fri9to10 = fri9to10;
	}

	public String getFri10to11() {
		return _fri10to11;
	}

	public void setFri10to11(String fri10to11) {
		_fri10to11 = fri10to11;
	}

	public String getFri11to12() {
		return _fri11to12;
	}

	public void setFri11to12(String fri11to12) {
		_fri11to12 = fri11to12;
	}

	public String getFri12to1() {
		return _fri12to1;
	}

	public void setFri12to1(String fri12to1) {
		_fri12to1 = fri12to1;
	}

	public String getFri1to2() {
		return _fri1to2;
	}

	public void setFri1to2(String fri1to2) {
		_fri1to2 = fri1to2;
	}

	public String getFri2to3() {
		return _fri2to3;
	}

	public void setFri2to3(String fri2to3) {
		_fri2to3 = fri2to3;
	}

	public String getFri3to4() {
		return _fri3to4;
	}

	public void setFri3to4(String fri3to4) {
		_fri3to4 = fri3to4;
	}

	public String getFri4to5() {
		return _fri4to5;
	}

	public void setFri4to5(String fri4to5) {
		_fri4to5 = fri4to5;
	}

	public String getSat8to9() {
		return _sat8to9;
	}

	public void setSat8to9(String sat8to9) {
		_sat8to9 = sat8to9;
	}

	public String getSat9to10() {
		return _sat9to10;
	}

	public void setSat9to10(String sat9to10) {
		_sat9to10 = sat9to10;
	}

	public String getSat10to11() {
		return _sat10to11;
	}

	public void setSat10to11(String sat10to11) {
		_sat10to11 = sat10to11;
	}

	public String getSat11to12() {
		return _sat11to12;
	}

	public void setSat11to12(String sat11to12) {
		_sat11to12 = sat11to12;
	}

	public String getSat12to1() {
		return _sat12to1;
	}

	public void setSat12to1(String sat12to1) {
		_sat12to1 = sat12to1;
	}

	public String getSat1to2() {
		return _sat1to2;
	}

	public void setSat1to2(String sat1to2) {
		_sat1to2 = sat1to2;
	}

	public String getSat2to3() {
		return _sat2to3;
	}

	public void setSat2to3(String sat2to3) {
		_sat2to3 = sat2to3;
	}

	public String getSat3to4() {
		return _sat3to4;
	}

	public void setSat3to4(String sat3to4) {
		_sat3to4 = sat3to4;
	}

	public String getSat4to5() {
		return _sat4to5;
	}

	public void setSat4to5(String sat4to5) {
		_sat4to5 = sat4to5;
	}

	public String getSun8to9() {
		return _sun8to9;
	}

	public void setSun8to9(String sun8to9) {
		_sun8to9 = sun8to9;
	}

	public String getSun9to10() {
		return _sun9to10;
	}

	public void setSun9to10(String sun9to10) {
		_sun9to10 = sun9to10;
	}

	public String getSun10to11() {
		return _sun10to11;
	}

	public void setSun10to11(String sun10to11) {
		_sun10to11 = sun10to11;
	}

	public String getSun11to12() {
		return _sun11to12;
	}

	public void setSun11to12(String sun11to12) {
		_sun11to12 = sun11to12;
	}

	public String getSun12to1() {
		return _sun12to1;
	}

	public void setSun12to1(String sun12to1) {
		_sun12to1 = sun12to1;
	}

	public String getSun1to2() {
		return _sun1to2;
	}

	public void setSun1to2(String sun1to2) {
		_sun1to2 = sun1to2;
	}

	public String getSun2to3() {
		return _sun2to3;
	}

	public void setSun2to3(String sun2to3) {
		_sun2to3 = sun2to3;
	}

	public String getSun3to4() {
		return _sun3to4;
	}

	public void setSun3to4(String sun3to4) {
		_sun3to4 = sun3to4;
	}

	public String getSun4to5() {
		return _sun4to5;
	}

	public void setSun4to5(String sun4to5) {
		_sun4to5 = sun4to5;
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

	public BaseModel<?> getavailabilityRemoteModel() {
		return _availabilityRemoteModel;
	}

	public void setavailabilityRemoteModel(BaseModel<?> availabilityRemoteModel) {
		_availabilityRemoteModel = availabilityRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			availabilityLocalServiceUtil.addavailability(this);
		}
		else {
			availabilityLocalServiceUtil.updateavailability(this);
		}
	}

	@Override
	public availability toEscapedModel() {
		return (availability)Proxy.newProxyInstance(availability.class.getClassLoader(),
			new Class[] { availability.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		availabilityClp clone = new availabilityClp();

		clone.setStudentid(getStudentid());
		clone.setAsuriteid(getAsuriteid());
		clone.setMon8to9(getMon8to9());
		clone.setMon9to10(getMon9to10());
		clone.setMon10to11(getMon10to11());
		clone.setMon11to12(getMon11to12());
		clone.setMon12to1(getMon12to1());
		clone.setMon1to2(getMon1to2());
		clone.setMon2to3(getMon2to3());
		clone.setMon3to4(getMon3to4());
		clone.setMon4to5(getMon4to5());
		clone.setTue8to9(getTue8to9());
		clone.setTue9to10(getTue9to10());
		clone.setTue10to11(getTue10to11());
		clone.setTue11to12(getTue11to12());
		clone.setTue12to1(getTue12to1());
		clone.setTue1to2(getTue1to2());
		clone.setTue2to3(getTue2to3());
		clone.setTue3to4(getTue3to4());
		clone.setTue4to5(getTue4to5());
		clone.setWed8to9(getWed8to9());
		clone.setWed9to10(getWed9to10());
		clone.setWed10to11(getWed10to11());
		clone.setWed11to12(getWed11to12());
		clone.setWed12to1(getWed12to1());
		clone.setWed1to2(getWed1to2());
		clone.setWed2to3(getWed2to3());
		clone.setWed3to4(getWed3to4());
		clone.setWed4to5(getWed4to5());
		clone.setThu8to9(getThu8to9());
		clone.setThu9to10(getThu9to10());
		clone.setThu10to11(getThu10to11());
		clone.setThu11to12(getThu11to12());
		clone.setThu12to1(getThu12to1());
		clone.setThu1to2(getThu1to2());
		clone.setThu2to3(getThu2to3());
		clone.setThu3to4(getThu3to4());
		clone.setThu4to5(getThu4to5());
		clone.setFri8to9(getFri8to9());
		clone.setFri9to10(getFri9to10());
		clone.setFri10to11(getFri10to11());
		clone.setFri11to12(getFri11to12());
		clone.setFri12to1(getFri12to1());
		clone.setFri1to2(getFri1to2());
		clone.setFri2to3(getFri2to3());
		clone.setFri3to4(getFri3to4());
		clone.setFri4to5(getFri4to5());
		clone.setSat8to9(getSat8to9());
		clone.setSat9to10(getSat9to10());
		clone.setSat10to11(getSat10to11());
		clone.setSat11to12(getSat11to12());
		clone.setSat12to1(getSat12to1());
		clone.setSat1to2(getSat1to2());
		clone.setSat2to3(getSat2to3());
		clone.setSat3to4(getSat3to4());
		clone.setSat4to5(getSat4to5());
		clone.setSun8to9(getSun8to9());
		clone.setSun9to10(getSun9to10());
		clone.setSun10to11(getSun10to11());
		clone.setSun11to12(getSun11to12());
		clone.setSun12to1(getSun12to1());
		clone.setSun1to2(getSun1to2());
		clone.setSun2to3(getSun2to3());
		clone.setSun3to4(getSun3to4());
		clone.setSun4to5(getSun4to5());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	public int compareTo(availability availability) {
		long primaryKey = availability.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		availabilityClp availability = null;

		try {
			availability = (availabilityClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = availability.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(135);

		sb.append("{studentid=");
		sb.append(getStudentid());
		sb.append(", asuriteid=");
		sb.append(getAsuriteid());
		sb.append(", mon8to9=");
		sb.append(getMon8to9());
		sb.append(", mon9to10=");
		sb.append(getMon9to10());
		sb.append(", mon10to11=");
		sb.append(getMon10to11());
		sb.append(", mon11to12=");
		sb.append(getMon11to12());
		sb.append(", mon12to1=");
		sb.append(getMon12to1());
		sb.append(", mon1to2=");
		sb.append(getMon1to2());
		sb.append(", mon2to3=");
		sb.append(getMon2to3());
		sb.append(", mon3to4=");
		sb.append(getMon3to4());
		sb.append(", mon4to5=");
		sb.append(getMon4to5());
		sb.append(", tue8to9=");
		sb.append(getTue8to9());
		sb.append(", tue9to10=");
		sb.append(getTue9to10());
		sb.append(", tue10to11=");
		sb.append(getTue10to11());
		sb.append(", tue11to12=");
		sb.append(getTue11to12());
		sb.append(", tue12to1=");
		sb.append(getTue12to1());
		sb.append(", tue1to2=");
		sb.append(getTue1to2());
		sb.append(", tue2to3=");
		sb.append(getTue2to3());
		sb.append(", tue3to4=");
		sb.append(getTue3to4());
		sb.append(", tue4to5=");
		sb.append(getTue4to5());
		sb.append(", wed8to9=");
		sb.append(getWed8to9());
		sb.append(", wed9to10=");
		sb.append(getWed9to10());
		sb.append(", wed10to11=");
		sb.append(getWed10to11());
		sb.append(", wed11to12=");
		sb.append(getWed11to12());
		sb.append(", wed12to1=");
		sb.append(getWed12to1());
		sb.append(", wed1to2=");
		sb.append(getWed1to2());
		sb.append(", wed2to3=");
		sb.append(getWed2to3());
		sb.append(", wed3to4=");
		sb.append(getWed3to4());
		sb.append(", wed4to5=");
		sb.append(getWed4to5());
		sb.append(", thu8to9=");
		sb.append(getThu8to9());
		sb.append(", thu9to10=");
		sb.append(getThu9to10());
		sb.append(", thu10to11=");
		sb.append(getThu10to11());
		sb.append(", thu11to12=");
		sb.append(getThu11to12());
		sb.append(", thu12to1=");
		sb.append(getThu12to1());
		sb.append(", thu1to2=");
		sb.append(getThu1to2());
		sb.append(", thu2to3=");
		sb.append(getThu2to3());
		sb.append(", thu3to4=");
		sb.append(getThu3to4());
		sb.append(", thu4to5=");
		sb.append(getThu4to5());
		sb.append(", fri8to9=");
		sb.append(getFri8to9());
		sb.append(", fri9to10=");
		sb.append(getFri9to10());
		sb.append(", fri10to11=");
		sb.append(getFri10to11());
		sb.append(", fri11to12=");
		sb.append(getFri11to12());
		sb.append(", fri12to1=");
		sb.append(getFri12to1());
		sb.append(", fri1to2=");
		sb.append(getFri1to2());
		sb.append(", fri2to3=");
		sb.append(getFri2to3());
		sb.append(", fri3to4=");
		sb.append(getFri3to4());
		sb.append(", fri4to5=");
		sb.append(getFri4to5());
		sb.append(", sat8to9=");
		sb.append(getSat8to9());
		sb.append(", sat9to10=");
		sb.append(getSat9to10());
		sb.append(", sat10to11=");
		sb.append(getSat10to11());
		sb.append(", sat11to12=");
		sb.append(getSat11to12());
		sb.append(", sat12to1=");
		sb.append(getSat12to1());
		sb.append(", sat1to2=");
		sb.append(getSat1to2());
		sb.append(", sat2to3=");
		sb.append(getSat2to3());
		sb.append(", sat3to4=");
		sb.append(getSat3to4());
		sb.append(", sat4to5=");
		sb.append(getSat4to5());
		sb.append(", sun8to9=");
		sb.append(getSun8to9());
		sb.append(", sun9to10=");
		sb.append(getSun9to10());
		sb.append(", sun10to11=");
		sb.append(getSun10to11());
		sb.append(", sun11to12=");
		sb.append(getSun11to12());
		sb.append(", sun12to1=");
		sb.append(getSun12to1());
		sb.append(", sun1to2=");
		sb.append(getSun1to2());
		sb.append(", sun2to3=");
		sb.append(getSun2to3());
		sb.append(", sun3to4=");
		sb.append(getSun3to4());
		sb.append(", sun4to5=");
		sb.append(getSun4to5());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(205);

		sb.append("<model><model-name>");
		sb.append("com.asu.poly.iProjects.student.model.availability");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentid</column-name><column-value><![CDATA[");
		sb.append(getStudentid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asuriteid</column-name><column-value><![CDATA[");
		sb.append(getAsuriteid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mon8to9</column-name><column-value><![CDATA[");
		sb.append(getMon8to9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mon9to10</column-name><column-value><![CDATA[");
		sb.append(getMon9to10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mon10to11</column-name><column-value><![CDATA[");
		sb.append(getMon10to11());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mon11to12</column-name><column-value><![CDATA[");
		sb.append(getMon11to12());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mon12to1</column-name><column-value><![CDATA[");
		sb.append(getMon12to1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mon1to2</column-name><column-value><![CDATA[");
		sb.append(getMon1to2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mon2to3</column-name><column-value><![CDATA[");
		sb.append(getMon2to3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mon3to4</column-name><column-value><![CDATA[");
		sb.append(getMon3to4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mon4to5</column-name><column-value><![CDATA[");
		sb.append(getMon4to5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tue8to9</column-name><column-value><![CDATA[");
		sb.append(getTue8to9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tue9to10</column-name><column-value><![CDATA[");
		sb.append(getTue9to10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tue10to11</column-name><column-value><![CDATA[");
		sb.append(getTue10to11());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tue11to12</column-name><column-value><![CDATA[");
		sb.append(getTue11to12());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tue12to1</column-name><column-value><![CDATA[");
		sb.append(getTue12to1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tue1to2</column-name><column-value><![CDATA[");
		sb.append(getTue1to2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tue2to3</column-name><column-value><![CDATA[");
		sb.append(getTue2to3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tue3to4</column-name><column-value><![CDATA[");
		sb.append(getTue3to4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tue4to5</column-name><column-value><![CDATA[");
		sb.append(getTue4to5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wed8to9</column-name><column-value><![CDATA[");
		sb.append(getWed8to9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wed9to10</column-name><column-value><![CDATA[");
		sb.append(getWed9to10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wed10to11</column-name><column-value><![CDATA[");
		sb.append(getWed10to11());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wed11to12</column-name><column-value><![CDATA[");
		sb.append(getWed11to12());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wed12to1</column-name><column-value><![CDATA[");
		sb.append(getWed12to1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wed1to2</column-name><column-value><![CDATA[");
		sb.append(getWed1to2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wed2to3</column-name><column-value><![CDATA[");
		sb.append(getWed2to3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wed3to4</column-name><column-value><![CDATA[");
		sb.append(getWed3to4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wed4to5</column-name><column-value><![CDATA[");
		sb.append(getWed4to5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu8to9</column-name><column-value><![CDATA[");
		sb.append(getThu8to9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu9to10</column-name><column-value><![CDATA[");
		sb.append(getThu9to10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu10to11</column-name><column-value><![CDATA[");
		sb.append(getThu10to11());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu11to12</column-name><column-value><![CDATA[");
		sb.append(getThu11to12());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu12to1</column-name><column-value><![CDATA[");
		sb.append(getThu12to1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu1to2</column-name><column-value><![CDATA[");
		sb.append(getThu1to2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu2to3</column-name><column-value><![CDATA[");
		sb.append(getThu2to3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu3to4</column-name><column-value><![CDATA[");
		sb.append(getThu3to4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu4to5</column-name><column-value><![CDATA[");
		sb.append(getThu4to5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fri8to9</column-name><column-value><![CDATA[");
		sb.append(getFri8to9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fri9to10</column-name><column-value><![CDATA[");
		sb.append(getFri9to10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fri10to11</column-name><column-value><![CDATA[");
		sb.append(getFri10to11());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fri11to12</column-name><column-value><![CDATA[");
		sb.append(getFri11to12());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fri12to1</column-name><column-value><![CDATA[");
		sb.append(getFri12to1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fri1to2</column-name><column-value><![CDATA[");
		sb.append(getFri1to2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fri2to3</column-name><column-value><![CDATA[");
		sb.append(getFri2to3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fri3to4</column-name><column-value><![CDATA[");
		sb.append(getFri3to4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fri4to5</column-name><column-value><![CDATA[");
		sb.append(getFri4to5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sat8to9</column-name><column-value><![CDATA[");
		sb.append(getSat8to9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sat9to10</column-name><column-value><![CDATA[");
		sb.append(getSat9to10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sat10to11</column-name><column-value><![CDATA[");
		sb.append(getSat10to11());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sat11to12</column-name><column-value><![CDATA[");
		sb.append(getSat11to12());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sat12to1</column-name><column-value><![CDATA[");
		sb.append(getSat12to1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sat1to2</column-name><column-value><![CDATA[");
		sb.append(getSat1to2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sat2to3</column-name><column-value><![CDATA[");
		sb.append(getSat2to3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sat3to4</column-name><column-value><![CDATA[");
		sb.append(getSat3to4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sat4to5</column-name><column-value><![CDATA[");
		sb.append(getSat4to5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sun8to9</column-name><column-value><![CDATA[");
		sb.append(getSun8to9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sun9to10</column-name><column-value><![CDATA[");
		sb.append(getSun9to10());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sun10to11</column-name><column-value><![CDATA[");
		sb.append(getSun10to11());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sun11to12</column-name><column-value><![CDATA[");
		sb.append(getSun11to12());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sun12to1</column-name><column-value><![CDATA[");
		sb.append(getSun12to1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sun1to2</column-name><column-value><![CDATA[");
		sb.append(getSun1to2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sun2to3</column-name><column-value><![CDATA[");
		sb.append(getSun2to3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sun3to4</column-name><column-value><![CDATA[");
		sb.append(getSun3to4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sun4to5</column-name><column-value><![CDATA[");
		sb.append(getSun4to5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studentid;
	private String _asuriteid;
	private String _mon8to9;
	private String _mon9to10;
	private String _mon10to11;
	private String _mon11to12;
	private String _mon12to1;
	private String _mon1to2;
	private String _mon2to3;
	private String _mon3to4;
	private String _mon4to5;
	private String _tue8to9;
	private String _tue9to10;
	private String _tue10to11;
	private String _tue11to12;
	private String _tue12to1;
	private String _tue1to2;
	private String _tue2to3;
	private String _tue3to4;
	private String _tue4to5;
	private String _wed8to9;
	private String _wed9to10;
	private String _wed10to11;
	private String _wed11to12;
	private String _wed12to1;
	private String _wed1to2;
	private String _wed2to3;
	private String _wed3to4;
	private String _wed4to5;
	private String _thu8to9;
	private String _thu9to10;
	private String _thu10to11;
	private String _thu11to12;
	private String _thu12to1;
	private String _thu1to2;
	private String _thu2to3;
	private String _thu3to4;
	private String _thu4to5;
	private String _fri8to9;
	private String _fri9to10;
	private String _fri10to11;
	private String _fri11to12;
	private String _fri12to1;
	private String _fri1to2;
	private String _fri2to3;
	private String _fri3to4;
	private String _fri4to5;
	private String _sat8to9;
	private String _sat9to10;
	private String _sat10to11;
	private String _sat11to12;
	private String _sat12to1;
	private String _sat1to2;
	private String _sat2to3;
	private String _sat3to4;
	private String _sat4to5;
	private String _sun8to9;
	private String _sun9to10;
	private String _sun10to11;
	private String _sun11to12;
	private String _sun12to1;
	private String _sun1to2;
	private String _sun2to3;
	private String _sun3to4;
	private String _sun4to5;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _availabilityRemoteModel;
}