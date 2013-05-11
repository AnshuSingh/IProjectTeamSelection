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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link availability}.
 * </p>
 *
 * @author    Shruthi
 * @see       availability
 * @generated
 */
public class availabilityWrapper implements availability,
	ModelWrapper<availability> {
	public availabilityWrapper(availability availability) {
		_availability = availability;
	}

	public Class<?> getModelClass() {
		return availability.class;
	}

	public String getModelClassName() {
		return availability.class.getName();
	}

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

	/**
	* Returns the primary key of this availability.
	*
	* @return the primary key of this availability
	*/
	public long getPrimaryKey() {
		return _availability.getPrimaryKey();
	}

	/**
	* Sets the primary key of this availability.
	*
	* @param primaryKey the primary key of this availability
	*/
	public void setPrimaryKey(long primaryKey) {
		_availability.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the studentid of this availability.
	*
	* @return the studentid of this availability
	*/
	public long getStudentid() {
		return _availability.getStudentid();
	}

	/**
	* Sets the studentid of this availability.
	*
	* @param studentid the studentid of this availability
	*/
	public void setStudentid(long studentid) {
		_availability.setStudentid(studentid);
	}

	/**
	* Returns the asuriteid of this availability.
	*
	* @return the asuriteid of this availability
	*/
	public java.lang.String getAsuriteid() {
		return _availability.getAsuriteid();
	}

	/**
	* Sets the asuriteid of this availability.
	*
	* @param asuriteid the asuriteid of this availability
	*/
	public void setAsuriteid(java.lang.String asuriteid) {
		_availability.setAsuriteid(asuriteid);
	}

	/**
	* Returns the mon8to9 of this availability.
	*
	* @return the mon8to9 of this availability
	*/
	public java.lang.String getMon8to9() {
		return _availability.getMon8to9();
	}

	/**
	* Sets the mon8to9 of this availability.
	*
	* @param mon8to9 the mon8to9 of this availability
	*/
	public void setMon8to9(java.lang.String mon8to9) {
		_availability.setMon8to9(mon8to9);
	}

	/**
	* Returns the mon9to10 of this availability.
	*
	* @return the mon9to10 of this availability
	*/
	public java.lang.String getMon9to10() {
		return _availability.getMon9to10();
	}

	/**
	* Sets the mon9to10 of this availability.
	*
	* @param mon9to10 the mon9to10 of this availability
	*/
	public void setMon9to10(java.lang.String mon9to10) {
		_availability.setMon9to10(mon9to10);
	}

	/**
	* Returns the mon10to11 of this availability.
	*
	* @return the mon10to11 of this availability
	*/
	public java.lang.String getMon10to11() {
		return _availability.getMon10to11();
	}

	/**
	* Sets the mon10to11 of this availability.
	*
	* @param mon10to11 the mon10to11 of this availability
	*/
	public void setMon10to11(java.lang.String mon10to11) {
		_availability.setMon10to11(mon10to11);
	}

	/**
	* Returns the mon11to12 of this availability.
	*
	* @return the mon11to12 of this availability
	*/
	public java.lang.String getMon11to12() {
		return _availability.getMon11to12();
	}

	/**
	* Sets the mon11to12 of this availability.
	*
	* @param mon11to12 the mon11to12 of this availability
	*/
	public void setMon11to12(java.lang.String mon11to12) {
		_availability.setMon11to12(mon11to12);
	}

	/**
	* Returns the mon12to1 of this availability.
	*
	* @return the mon12to1 of this availability
	*/
	public java.lang.String getMon12to1() {
		return _availability.getMon12to1();
	}

	/**
	* Sets the mon12to1 of this availability.
	*
	* @param mon12to1 the mon12to1 of this availability
	*/
	public void setMon12to1(java.lang.String mon12to1) {
		_availability.setMon12to1(mon12to1);
	}

	/**
	* Returns the mon1to2 of this availability.
	*
	* @return the mon1to2 of this availability
	*/
	public java.lang.String getMon1to2() {
		return _availability.getMon1to2();
	}

	/**
	* Sets the mon1to2 of this availability.
	*
	* @param mon1to2 the mon1to2 of this availability
	*/
	public void setMon1to2(java.lang.String mon1to2) {
		_availability.setMon1to2(mon1to2);
	}

	/**
	* Returns the mon2to3 of this availability.
	*
	* @return the mon2to3 of this availability
	*/
	public java.lang.String getMon2to3() {
		return _availability.getMon2to3();
	}

	/**
	* Sets the mon2to3 of this availability.
	*
	* @param mon2to3 the mon2to3 of this availability
	*/
	public void setMon2to3(java.lang.String mon2to3) {
		_availability.setMon2to3(mon2to3);
	}

	/**
	* Returns the mon3to4 of this availability.
	*
	* @return the mon3to4 of this availability
	*/
	public java.lang.String getMon3to4() {
		return _availability.getMon3to4();
	}

	/**
	* Sets the mon3to4 of this availability.
	*
	* @param mon3to4 the mon3to4 of this availability
	*/
	public void setMon3to4(java.lang.String mon3to4) {
		_availability.setMon3to4(mon3to4);
	}

	/**
	* Returns the mon4to5 of this availability.
	*
	* @return the mon4to5 of this availability
	*/
	public java.lang.String getMon4to5() {
		return _availability.getMon4to5();
	}

	/**
	* Sets the mon4to5 of this availability.
	*
	* @param mon4to5 the mon4to5 of this availability
	*/
	public void setMon4to5(java.lang.String mon4to5) {
		_availability.setMon4to5(mon4to5);
	}

	/**
	* Returns the tue8to9 of this availability.
	*
	* @return the tue8to9 of this availability
	*/
	public java.lang.String getTue8to9() {
		return _availability.getTue8to9();
	}

	/**
	* Sets the tue8to9 of this availability.
	*
	* @param tue8to9 the tue8to9 of this availability
	*/
	public void setTue8to9(java.lang.String tue8to9) {
		_availability.setTue8to9(tue8to9);
	}

	/**
	* Returns the tue9to10 of this availability.
	*
	* @return the tue9to10 of this availability
	*/
	public java.lang.String getTue9to10() {
		return _availability.getTue9to10();
	}

	/**
	* Sets the tue9to10 of this availability.
	*
	* @param tue9to10 the tue9to10 of this availability
	*/
	public void setTue9to10(java.lang.String tue9to10) {
		_availability.setTue9to10(tue9to10);
	}

	/**
	* Returns the tue10to11 of this availability.
	*
	* @return the tue10to11 of this availability
	*/
	public java.lang.String getTue10to11() {
		return _availability.getTue10to11();
	}

	/**
	* Sets the tue10to11 of this availability.
	*
	* @param tue10to11 the tue10to11 of this availability
	*/
	public void setTue10to11(java.lang.String tue10to11) {
		_availability.setTue10to11(tue10to11);
	}

	/**
	* Returns the tue11to12 of this availability.
	*
	* @return the tue11to12 of this availability
	*/
	public java.lang.String getTue11to12() {
		return _availability.getTue11to12();
	}

	/**
	* Sets the tue11to12 of this availability.
	*
	* @param tue11to12 the tue11to12 of this availability
	*/
	public void setTue11to12(java.lang.String tue11to12) {
		_availability.setTue11to12(tue11to12);
	}

	/**
	* Returns the tue12to1 of this availability.
	*
	* @return the tue12to1 of this availability
	*/
	public java.lang.String getTue12to1() {
		return _availability.getTue12to1();
	}

	/**
	* Sets the tue12to1 of this availability.
	*
	* @param tue12to1 the tue12to1 of this availability
	*/
	public void setTue12to1(java.lang.String tue12to1) {
		_availability.setTue12to1(tue12to1);
	}

	/**
	* Returns the tue1to2 of this availability.
	*
	* @return the tue1to2 of this availability
	*/
	public java.lang.String getTue1to2() {
		return _availability.getTue1to2();
	}

	/**
	* Sets the tue1to2 of this availability.
	*
	* @param tue1to2 the tue1to2 of this availability
	*/
	public void setTue1to2(java.lang.String tue1to2) {
		_availability.setTue1to2(tue1to2);
	}

	/**
	* Returns the tue2to3 of this availability.
	*
	* @return the tue2to3 of this availability
	*/
	public java.lang.String getTue2to3() {
		return _availability.getTue2to3();
	}

	/**
	* Sets the tue2to3 of this availability.
	*
	* @param tue2to3 the tue2to3 of this availability
	*/
	public void setTue2to3(java.lang.String tue2to3) {
		_availability.setTue2to3(tue2to3);
	}

	/**
	* Returns the tue3to4 of this availability.
	*
	* @return the tue3to4 of this availability
	*/
	public java.lang.String getTue3to4() {
		return _availability.getTue3to4();
	}

	/**
	* Sets the tue3to4 of this availability.
	*
	* @param tue3to4 the tue3to4 of this availability
	*/
	public void setTue3to4(java.lang.String tue3to4) {
		_availability.setTue3to4(tue3to4);
	}

	/**
	* Returns the tue4to5 of this availability.
	*
	* @return the tue4to5 of this availability
	*/
	public java.lang.String getTue4to5() {
		return _availability.getTue4to5();
	}

	/**
	* Sets the tue4to5 of this availability.
	*
	* @param tue4to5 the tue4to5 of this availability
	*/
	public void setTue4to5(java.lang.String tue4to5) {
		_availability.setTue4to5(tue4to5);
	}

	/**
	* Returns the wed8to9 of this availability.
	*
	* @return the wed8to9 of this availability
	*/
	public java.lang.String getWed8to9() {
		return _availability.getWed8to9();
	}

	/**
	* Sets the wed8to9 of this availability.
	*
	* @param wed8to9 the wed8to9 of this availability
	*/
	public void setWed8to9(java.lang.String wed8to9) {
		_availability.setWed8to9(wed8to9);
	}

	/**
	* Returns the wed9to10 of this availability.
	*
	* @return the wed9to10 of this availability
	*/
	public java.lang.String getWed9to10() {
		return _availability.getWed9to10();
	}

	/**
	* Sets the wed9to10 of this availability.
	*
	* @param wed9to10 the wed9to10 of this availability
	*/
	public void setWed9to10(java.lang.String wed9to10) {
		_availability.setWed9to10(wed9to10);
	}

	/**
	* Returns the wed10to11 of this availability.
	*
	* @return the wed10to11 of this availability
	*/
	public java.lang.String getWed10to11() {
		return _availability.getWed10to11();
	}

	/**
	* Sets the wed10to11 of this availability.
	*
	* @param wed10to11 the wed10to11 of this availability
	*/
	public void setWed10to11(java.lang.String wed10to11) {
		_availability.setWed10to11(wed10to11);
	}

	/**
	* Returns the wed11to12 of this availability.
	*
	* @return the wed11to12 of this availability
	*/
	public java.lang.String getWed11to12() {
		return _availability.getWed11to12();
	}

	/**
	* Sets the wed11to12 of this availability.
	*
	* @param wed11to12 the wed11to12 of this availability
	*/
	public void setWed11to12(java.lang.String wed11to12) {
		_availability.setWed11to12(wed11to12);
	}

	/**
	* Returns the wed12to1 of this availability.
	*
	* @return the wed12to1 of this availability
	*/
	public java.lang.String getWed12to1() {
		return _availability.getWed12to1();
	}

	/**
	* Sets the wed12to1 of this availability.
	*
	* @param wed12to1 the wed12to1 of this availability
	*/
	public void setWed12to1(java.lang.String wed12to1) {
		_availability.setWed12to1(wed12to1);
	}

	/**
	* Returns the wed1to2 of this availability.
	*
	* @return the wed1to2 of this availability
	*/
	public java.lang.String getWed1to2() {
		return _availability.getWed1to2();
	}

	/**
	* Sets the wed1to2 of this availability.
	*
	* @param wed1to2 the wed1to2 of this availability
	*/
	public void setWed1to2(java.lang.String wed1to2) {
		_availability.setWed1to2(wed1to2);
	}

	/**
	* Returns the wed2to3 of this availability.
	*
	* @return the wed2to3 of this availability
	*/
	public java.lang.String getWed2to3() {
		return _availability.getWed2to3();
	}

	/**
	* Sets the wed2to3 of this availability.
	*
	* @param wed2to3 the wed2to3 of this availability
	*/
	public void setWed2to3(java.lang.String wed2to3) {
		_availability.setWed2to3(wed2to3);
	}

	/**
	* Returns the wed3to4 of this availability.
	*
	* @return the wed3to4 of this availability
	*/
	public java.lang.String getWed3to4() {
		return _availability.getWed3to4();
	}

	/**
	* Sets the wed3to4 of this availability.
	*
	* @param wed3to4 the wed3to4 of this availability
	*/
	public void setWed3to4(java.lang.String wed3to4) {
		_availability.setWed3to4(wed3to4);
	}

	/**
	* Returns the wed4to5 of this availability.
	*
	* @return the wed4to5 of this availability
	*/
	public java.lang.String getWed4to5() {
		return _availability.getWed4to5();
	}

	/**
	* Sets the wed4to5 of this availability.
	*
	* @param wed4to5 the wed4to5 of this availability
	*/
	public void setWed4to5(java.lang.String wed4to5) {
		_availability.setWed4to5(wed4to5);
	}

	/**
	* Returns the thu8to9 of this availability.
	*
	* @return the thu8to9 of this availability
	*/
	public java.lang.String getThu8to9() {
		return _availability.getThu8to9();
	}

	/**
	* Sets the thu8to9 of this availability.
	*
	* @param thu8to9 the thu8to9 of this availability
	*/
	public void setThu8to9(java.lang.String thu8to9) {
		_availability.setThu8to9(thu8to9);
	}

	/**
	* Returns the thu9to10 of this availability.
	*
	* @return the thu9to10 of this availability
	*/
	public java.lang.String getThu9to10() {
		return _availability.getThu9to10();
	}

	/**
	* Sets the thu9to10 of this availability.
	*
	* @param thu9to10 the thu9to10 of this availability
	*/
	public void setThu9to10(java.lang.String thu9to10) {
		_availability.setThu9to10(thu9to10);
	}

	/**
	* Returns the thu10to11 of this availability.
	*
	* @return the thu10to11 of this availability
	*/
	public java.lang.String getThu10to11() {
		return _availability.getThu10to11();
	}

	/**
	* Sets the thu10to11 of this availability.
	*
	* @param thu10to11 the thu10to11 of this availability
	*/
	public void setThu10to11(java.lang.String thu10to11) {
		_availability.setThu10to11(thu10to11);
	}

	/**
	* Returns the thu11to12 of this availability.
	*
	* @return the thu11to12 of this availability
	*/
	public java.lang.String getThu11to12() {
		return _availability.getThu11to12();
	}

	/**
	* Sets the thu11to12 of this availability.
	*
	* @param thu11to12 the thu11to12 of this availability
	*/
	public void setThu11to12(java.lang.String thu11to12) {
		_availability.setThu11to12(thu11to12);
	}

	/**
	* Returns the thu12to1 of this availability.
	*
	* @return the thu12to1 of this availability
	*/
	public java.lang.String getThu12to1() {
		return _availability.getThu12to1();
	}

	/**
	* Sets the thu12to1 of this availability.
	*
	* @param thu12to1 the thu12to1 of this availability
	*/
	public void setThu12to1(java.lang.String thu12to1) {
		_availability.setThu12to1(thu12to1);
	}

	/**
	* Returns the thu1to2 of this availability.
	*
	* @return the thu1to2 of this availability
	*/
	public java.lang.String getThu1to2() {
		return _availability.getThu1to2();
	}

	/**
	* Sets the thu1to2 of this availability.
	*
	* @param thu1to2 the thu1to2 of this availability
	*/
	public void setThu1to2(java.lang.String thu1to2) {
		_availability.setThu1to2(thu1to2);
	}

	/**
	* Returns the thu2to3 of this availability.
	*
	* @return the thu2to3 of this availability
	*/
	public java.lang.String getThu2to3() {
		return _availability.getThu2to3();
	}

	/**
	* Sets the thu2to3 of this availability.
	*
	* @param thu2to3 the thu2to3 of this availability
	*/
	public void setThu2to3(java.lang.String thu2to3) {
		_availability.setThu2to3(thu2to3);
	}

	/**
	* Returns the thu3to4 of this availability.
	*
	* @return the thu3to4 of this availability
	*/
	public java.lang.String getThu3to4() {
		return _availability.getThu3to4();
	}

	/**
	* Sets the thu3to4 of this availability.
	*
	* @param thu3to4 the thu3to4 of this availability
	*/
	public void setThu3to4(java.lang.String thu3to4) {
		_availability.setThu3to4(thu3to4);
	}

	/**
	* Returns the thu4to5 of this availability.
	*
	* @return the thu4to5 of this availability
	*/
	public java.lang.String getThu4to5() {
		return _availability.getThu4to5();
	}

	/**
	* Sets the thu4to5 of this availability.
	*
	* @param thu4to5 the thu4to5 of this availability
	*/
	public void setThu4to5(java.lang.String thu4to5) {
		_availability.setThu4to5(thu4to5);
	}

	/**
	* Returns the fri8to9 of this availability.
	*
	* @return the fri8to9 of this availability
	*/
	public java.lang.String getFri8to9() {
		return _availability.getFri8to9();
	}

	/**
	* Sets the fri8to9 of this availability.
	*
	* @param fri8to9 the fri8to9 of this availability
	*/
	public void setFri8to9(java.lang.String fri8to9) {
		_availability.setFri8to9(fri8to9);
	}

	/**
	* Returns the fri9to10 of this availability.
	*
	* @return the fri9to10 of this availability
	*/
	public java.lang.String getFri9to10() {
		return _availability.getFri9to10();
	}

	/**
	* Sets the fri9to10 of this availability.
	*
	* @param fri9to10 the fri9to10 of this availability
	*/
	public void setFri9to10(java.lang.String fri9to10) {
		_availability.setFri9to10(fri9to10);
	}

	/**
	* Returns the fri10to11 of this availability.
	*
	* @return the fri10to11 of this availability
	*/
	public java.lang.String getFri10to11() {
		return _availability.getFri10to11();
	}

	/**
	* Sets the fri10to11 of this availability.
	*
	* @param fri10to11 the fri10to11 of this availability
	*/
	public void setFri10to11(java.lang.String fri10to11) {
		_availability.setFri10to11(fri10to11);
	}

	/**
	* Returns the fri11to12 of this availability.
	*
	* @return the fri11to12 of this availability
	*/
	public java.lang.String getFri11to12() {
		return _availability.getFri11to12();
	}

	/**
	* Sets the fri11to12 of this availability.
	*
	* @param fri11to12 the fri11to12 of this availability
	*/
	public void setFri11to12(java.lang.String fri11to12) {
		_availability.setFri11to12(fri11to12);
	}

	/**
	* Returns the fri12to1 of this availability.
	*
	* @return the fri12to1 of this availability
	*/
	public java.lang.String getFri12to1() {
		return _availability.getFri12to1();
	}

	/**
	* Sets the fri12to1 of this availability.
	*
	* @param fri12to1 the fri12to1 of this availability
	*/
	public void setFri12to1(java.lang.String fri12to1) {
		_availability.setFri12to1(fri12to1);
	}

	/**
	* Returns the fri1to2 of this availability.
	*
	* @return the fri1to2 of this availability
	*/
	public java.lang.String getFri1to2() {
		return _availability.getFri1to2();
	}

	/**
	* Sets the fri1to2 of this availability.
	*
	* @param fri1to2 the fri1to2 of this availability
	*/
	public void setFri1to2(java.lang.String fri1to2) {
		_availability.setFri1to2(fri1to2);
	}

	/**
	* Returns the fri2to3 of this availability.
	*
	* @return the fri2to3 of this availability
	*/
	public java.lang.String getFri2to3() {
		return _availability.getFri2to3();
	}

	/**
	* Sets the fri2to3 of this availability.
	*
	* @param fri2to3 the fri2to3 of this availability
	*/
	public void setFri2to3(java.lang.String fri2to3) {
		_availability.setFri2to3(fri2to3);
	}

	/**
	* Returns the fri3to4 of this availability.
	*
	* @return the fri3to4 of this availability
	*/
	public java.lang.String getFri3to4() {
		return _availability.getFri3to4();
	}

	/**
	* Sets the fri3to4 of this availability.
	*
	* @param fri3to4 the fri3to4 of this availability
	*/
	public void setFri3to4(java.lang.String fri3to4) {
		_availability.setFri3to4(fri3to4);
	}

	/**
	* Returns the fri4to5 of this availability.
	*
	* @return the fri4to5 of this availability
	*/
	public java.lang.String getFri4to5() {
		return _availability.getFri4to5();
	}

	/**
	* Sets the fri4to5 of this availability.
	*
	* @param fri4to5 the fri4to5 of this availability
	*/
	public void setFri4to5(java.lang.String fri4to5) {
		_availability.setFri4to5(fri4to5);
	}

	/**
	* Returns the sat8to9 of this availability.
	*
	* @return the sat8to9 of this availability
	*/
	public java.lang.String getSat8to9() {
		return _availability.getSat8to9();
	}

	/**
	* Sets the sat8to9 of this availability.
	*
	* @param sat8to9 the sat8to9 of this availability
	*/
	public void setSat8to9(java.lang.String sat8to9) {
		_availability.setSat8to9(sat8to9);
	}

	/**
	* Returns the sat9to10 of this availability.
	*
	* @return the sat9to10 of this availability
	*/
	public java.lang.String getSat9to10() {
		return _availability.getSat9to10();
	}

	/**
	* Sets the sat9to10 of this availability.
	*
	* @param sat9to10 the sat9to10 of this availability
	*/
	public void setSat9to10(java.lang.String sat9to10) {
		_availability.setSat9to10(sat9to10);
	}

	/**
	* Returns the sat10to11 of this availability.
	*
	* @return the sat10to11 of this availability
	*/
	public java.lang.String getSat10to11() {
		return _availability.getSat10to11();
	}

	/**
	* Sets the sat10to11 of this availability.
	*
	* @param sat10to11 the sat10to11 of this availability
	*/
	public void setSat10to11(java.lang.String sat10to11) {
		_availability.setSat10to11(sat10to11);
	}

	/**
	* Returns the sat11to12 of this availability.
	*
	* @return the sat11to12 of this availability
	*/
	public java.lang.String getSat11to12() {
		return _availability.getSat11to12();
	}

	/**
	* Sets the sat11to12 of this availability.
	*
	* @param sat11to12 the sat11to12 of this availability
	*/
	public void setSat11to12(java.lang.String sat11to12) {
		_availability.setSat11to12(sat11to12);
	}

	/**
	* Returns the sat12to1 of this availability.
	*
	* @return the sat12to1 of this availability
	*/
	public java.lang.String getSat12to1() {
		return _availability.getSat12to1();
	}

	/**
	* Sets the sat12to1 of this availability.
	*
	* @param sat12to1 the sat12to1 of this availability
	*/
	public void setSat12to1(java.lang.String sat12to1) {
		_availability.setSat12to1(sat12to1);
	}

	/**
	* Returns the sat1to2 of this availability.
	*
	* @return the sat1to2 of this availability
	*/
	public java.lang.String getSat1to2() {
		return _availability.getSat1to2();
	}

	/**
	* Sets the sat1to2 of this availability.
	*
	* @param sat1to2 the sat1to2 of this availability
	*/
	public void setSat1to2(java.lang.String sat1to2) {
		_availability.setSat1to2(sat1to2);
	}

	/**
	* Returns the sat2to3 of this availability.
	*
	* @return the sat2to3 of this availability
	*/
	public java.lang.String getSat2to3() {
		return _availability.getSat2to3();
	}

	/**
	* Sets the sat2to3 of this availability.
	*
	* @param sat2to3 the sat2to3 of this availability
	*/
	public void setSat2to3(java.lang.String sat2to3) {
		_availability.setSat2to3(sat2to3);
	}

	/**
	* Returns the sat3to4 of this availability.
	*
	* @return the sat3to4 of this availability
	*/
	public java.lang.String getSat3to4() {
		return _availability.getSat3to4();
	}

	/**
	* Sets the sat3to4 of this availability.
	*
	* @param sat3to4 the sat3to4 of this availability
	*/
	public void setSat3to4(java.lang.String sat3to4) {
		_availability.setSat3to4(sat3to4);
	}

	/**
	* Returns the sat4to5 of this availability.
	*
	* @return the sat4to5 of this availability
	*/
	public java.lang.String getSat4to5() {
		return _availability.getSat4to5();
	}

	/**
	* Sets the sat4to5 of this availability.
	*
	* @param sat4to5 the sat4to5 of this availability
	*/
	public void setSat4to5(java.lang.String sat4to5) {
		_availability.setSat4to5(sat4to5);
	}

	/**
	* Returns the sun8to9 of this availability.
	*
	* @return the sun8to9 of this availability
	*/
	public java.lang.String getSun8to9() {
		return _availability.getSun8to9();
	}

	/**
	* Sets the sun8to9 of this availability.
	*
	* @param sun8to9 the sun8to9 of this availability
	*/
	public void setSun8to9(java.lang.String sun8to9) {
		_availability.setSun8to9(sun8to9);
	}

	/**
	* Returns the sun9to10 of this availability.
	*
	* @return the sun9to10 of this availability
	*/
	public java.lang.String getSun9to10() {
		return _availability.getSun9to10();
	}

	/**
	* Sets the sun9to10 of this availability.
	*
	* @param sun9to10 the sun9to10 of this availability
	*/
	public void setSun9to10(java.lang.String sun9to10) {
		_availability.setSun9to10(sun9to10);
	}

	/**
	* Returns the sun10to11 of this availability.
	*
	* @return the sun10to11 of this availability
	*/
	public java.lang.String getSun10to11() {
		return _availability.getSun10to11();
	}

	/**
	* Sets the sun10to11 of this availability.
	*
	* @param sun10to11 the sun10to11 of this availability
	*/
	public void setSun10to11(java.lang.String sun10to11) {
		_availability.setSun10to11(sun10to11);
	}

	/**
	* Returns the sun11to12 of this availability.
	*
	* @return the sun11to12 of this availability
	*/
	public java.lang.String getSun11to12() {
		return _availability.getSun11to12();
	}

	/**
	* Sets the sun11to12 of this availability.
	*
	* @param sun11to12 the sun11to12 of this availability
	*/
	public void setSun11to12(java.lang.String sun11to12) {
		_availability.setSun11to12(sun11to12);
	}

	/**
	* Returns the sun12to1 of this availability.
	*
	* @return the sun12to1 of this availability
	*/
	public java.lang.String getSun12to1() {
		return _availability.getSun12to1();
	}

	/**
	* Sets the sun12to1 of this availability.
	*
	* @param sun12to1 the sun12to1 of this availability
	*/
	public void setSun12to1(java.lang.String sun12to1) {
		_availability.setSun12to1(sun12to1);
	}

	/**
	* Returns the sun1to2 of this availability.
	*
	* @return the sun1to2 of this availability
	*/
	public java.lang.String getSun1to2() {
		return _availability.getSun1to2();
	}

	/**
	* Sets the sun1to2 of this availability.
	*
	* @param sun1to2 the sun1to2 of this availability
	*/
	public void setSun1to2(java.lang.String sun1to2) {
		_availability.setSun1to2(sun1to2);
	}

	/**
	* Returns the sun2to3 of this availability.
	*
	* @return the sun2to3 of this availability
	*/
	public java.lang.String getSun2to3() {
		return _availability.getSun2to3();
	}

	/**
	* Sets the sun2to3 of this availability.
	*
	* @param sun2to3 the sun2to3 of this availability
	*/
	public void setSun2to3(java.lang.String sun2to3) {
		_availability.setSun2to3(sun2to3);
	}

	/**
	* Returns the sun3to4 of this availability.
	*
	* @return the sun3to4 of this availability
	*/
	public java.lang.String getSun3to4() {
		return _availability.getSun3to4();
	}

	/**
	* Sets the sun3to4 of this availability.
	*
	* @param sun3to4 the sun3to4 of this availability
	*/
	public void setSun3to4(java.lang.String sun3to4) {
		_availability.setSun3to4(sun3to4);
	}

	/**
	* Returns the sun4to5 of this availability.
	*
	* @return the sun4to5 of this availability
	*/
	public java.lang.String getSun4to5() {
		return _availability.getSun4to5();
	}

	/**
	* Sets the sun4to5 of this availability.
	*
	* @param sun4to5 the sun4to5 of this availability
	*/
	public void setSun4to5(java.lang.String sun4to5) {
		_availability.setSun4to5(sun4to5);
	}

	/**
	* Returns the create date of this availability.
	*
	* @return the create date of this availability
	*/
	public java.util.Date getCreateDate() {
		return _availability.getCreateDate();
	}

	/**
	* Sets the create date of this availability.
	*
	* @param createDate the create date of this availability
	*/
	public void setCreateDate(java.util.Date createDate) {
		_availability.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this availability.
	*
	* @return the modified date of this availability
	*/
	public java.util.Date getModifiedDate() {
		return _availability.getModifiedDate();
	}

	/**
	* Sets the modified date of this availability.
	*
	* @param modifiedDate the modified date of this availability
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_availability.setModifiedDate(modifiedDate);
	}

	public boolean isNew() {
		return _availability.isNew();
	}

	public void setNew(boolean n) {
		_availability.setNew(n);
	}

	public boolean isCachedModel() {
		return _availability.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_availability.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _availability.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _availability.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_availability.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _availability.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_availability.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new availabilityWrapper((availability)_availability.clone());
	}

	public int compareTo(
		com.asu.poly.iProjects.student.model.availability availability) {
		return _availability.compareTo(availability);
	}

	@Override
	public int hashCode() {
		return _availability.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.asu.poly.iProjects.student.model.availability> toCacheModel() {
		return _availability.toCacheModel();
	}

	public com.asu.poly.iProjects.student.model.availability toEscapedModel() {
		return new availabilityWrapper(_availability.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _availability.toString();
	}

	public java.lang.String toXmlString() {
		return _availability.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_availability.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public availability getWrappedavailability() {
		return _availability;
	}

	public availability getWrappedModel() {
		return _availability;
	}

	public void resetOriginalValues() {
		_availability.resetOriginalValues();
	}

	private availability _availability;
}