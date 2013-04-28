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

package com.StudentAvailability.slayer.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SASstudent}.
 * </p>
 *
 * @author    Purva
 * @see       SASstudent
 * @generated
 */
public class SASstudentWrapper implements SASstudent, ModelWrapper<SASstudent> {
	public SASstudentWrapper(SASstudent saSstudent) {
		_saSstudent = saSstudent;
	}

	public Class<?> getModelClass() {
		return SASstudent.class;
	}

	public String getModelClassName() {
		return SASstudent.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentid", getStudentid());
		attributes.put("ASUId", getASUId());
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
		attributes.put("author", getAuthor());
		attributes.put("dateAdded", getDateAdded());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentid = (Long)attributes.get("studentid");

		if (studentid != null) {
			setStudentid(studentid);
		}

		String ASUId = (String)attributes.get("ASUId");

		if (ASUId != null) {
			setASUId(ASUId);
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

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}
	}

	/**
	* Returns the primary key of this s a sstudent.
	*
	* @return the primary key of this s a sstudent
	*/
	public long getPrimaryKey() {
		return _saSstudent.getPrimaryKey();
	}

	/**
	* Sets the primary key of this s a sstudent.
	*
	* @param primaryKey the primary key of this s a sstudent
	*/
	public void setPrimaryKey(long primaryKey) {
		_saSstudent.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the studentid of this s a sstudent.
	*
	* @return the studentid of this s a sstudent
	*/
	public long getStudentid() {
		return _saSstudent.getStudentid();
	}

	/**
	* Sets the studentid of this s a sstudent.
	*
	* @param studentid the studentid of this s a sstudent
	*/
	public void setStudentid(long studentid) {
		_saSstudent.setStudentid(studentid);
	}

	/**
	* Returns the a s u ID of this s a sstudent.
	*
	* @return the a s u ID of this s a sstudent
	*/
	public java.lang.String getASUId() {
		return _saSstudent.getASUId();
	}

	/**
	* Sets the a s u ID of this s a sstudent.
	*
	* @param ASUId the a s u ID of this s a sstudent
	*/
	public void setASUId(java.lang.String ASUId) {
		_saSstudent.setASUId(ASUId);
	}

	/**
	* Returns the mon8to9 of this s a sstudent.
	*
	* @return the mon8to9 of this s a sstudent
	*/
	public java.lang.String getMon8to9() {
		return _saSstudent.getMon8to9();
	}

	/**
	* Sets the mon8to9 of this s a sstudent.
	*
	* @param mon8to9 the mon8to9 of this s a sstudent
	*/
	public void setMon8to9(java.lang.String mon8to9) {
		_saSstudent.setMon8to9(mon8to9);
	}

	/**
	* Returns the mon9to10 of this s a sstudent.
	*
	* @return the mon9to10 of this s a sstudent
	*/
	public java.lang.String getMon9to10() {
		return _saSstudent.getMon9to10();
	}

	/**
	* Sets the mon9to10 of this s a sstudent.
	*
	* @param mon9to10 the mon9to10 of this s a sstudent
	*/
	public void setMon9to10(java.lang.String mon9to10) {
		_saSstudent.setMon9to10(mon9to10);
	}

	/**
	* Returns the mon10to11 of this s a sstudent.
	*
	* @return the mon10to11 of this s a sstudent
	*/
	public java.lang.String getMon10to11() {
		return _saSstudent.getMon10to11();
	}

	/**
	* Sets the mon10to11 of this s a sstudent.
	*
	* @param mon10to11 the mon10to11 of this s a sstudent
	*/
	public void setMon10to11(java.lang.String mon10to11) {
		_saSstudent.setMon10to11(mon10to11);
	}

	/**
	* Returns the mon11to12 of this s a sstudent.
	*
	* @return the mon11to12 of this s a sstudent
	*/
	public java.lang.String getMon11to12() {
		return _saSstudent.getMon11to12();
	}

	/**
	* Sets the mon11to12 of this s a sstudent.
	*
	* @param mon11to12 the mon11to12 of this s a sstudent
	*/
	public void setMon11to12(java.lang.String mon11to12) {
		_saSstudent.setMon11to12(mon11to12);
	}

	/**
	* Returns the mon12to1 of this s a sstudent.
	*
	* @return the mon12to1 of this s a sstudent
	*/
	public java.lang.String getMon12to1() {
		return _saSstudent.getMon12to1();
	}

	/**
	* Sets the mon12to1 of this s a sstudent.
	*
	* @param mon12to1 the mon12to1 of this s a sstudent
	*/
	public void setMon12to1(java.lang.String mon12to1) {
		_saSstudent.setMon12to1(mon12to1);
	}

	/**
	* Returns the mon1to2 of this s a sstudent.
	*
	* @return the mon1to2 of this s a sstudent
	*/
	public java.lang.String getMon1to2() {
		return _saSstudent.getMon1to2();
	}

	/**
	* Sets the mon1to2 of this s a sstudent.
	*
	* @param mon1to2 the mon1to2 of this s a sstudent
	*/
	public void setMon1to2(java.lang.String mon1to2) {
		_saSstudent.setMon1to2(mon1to2);
	}

	/**
	* Returns the mon2to3 of this s a sstudent.
	*
	* @return the mon2to3 of this s a sstudent
	*/
	public java.lang.String getMon2to3() {
		return _saSstudent.getMon2to3();
	}

	/**
	* Sets the mon2to3 of this s a sstudent.
	*
	* @param mon2to3 the mon2to3 of this s a sstudent
	*/
	public void setMon2to3(java.lang.String mon2to3) {
		_saSstudent.setMon2to3(mon2to3);
	}

	/**
	* Returns the mon3to4 of this s a sstudent.
	*
	* @return the mon3to4 of this s a sstudent
	*/
	public java.lang.String getMon3to4() {
		return _saSstudent.getMon3to4();
	}

	/**
	* Sets the mon3to4 of this s a sstudent.
	*
	* @param mon3to4 the mon3to4 of this s a sstudent
	*/
	public void setMon3to4(java.lang.String mon3to4) {
		_saSstudent.setMon3to4(mon3to4);
	}

	/**
	* Returns the mon4to5 of this s a sstudent.
	*
	* @return the mon4to5 of this s a sstudent
	*/
	public java.lang.String getMon4to5() {
		return _saSstudent.getMon4to5();
	}

	/**
	* Sets the mon4to5 of this s a sstudent.
	*
	* @param mon4to5 the mon4to5 of this s a sstudent
	*/
	public void setMon4to5(java.lang.String mon4to5) {
		_saSstudent.setMon4to5(mon4to5);
	}

	/**
	* Returns the tue8to9 of this s a sstudent.
	*
	* @return the tue8to9 of this s a sstudent
	*/
	public java.lang.String getTue8to9() {
		return _saSstudent.getTue8to9();
	}

	/**
	* Sets the tue8to9 of this s a sstudent.
	*
	* @param tue8to9 the tue8to9 of this s a sstudent
	*/
	public void setTue8to9(java.lang.String tue8to9) {
		_saSstudent.setTue8to9(tue8to9);
	}

	/**
	* Returns the tue9to10 of this s a sstudent.
	*
	* @return the tue9to10 of this s a sstudent
	*/
	public java.lang.String getTue9to10() {
		return _saSstudent.getTue9to10();
	}

	/**
	* Sets the tue9to10 of this s a sstudent.
	*
	* @param tue9to10 the tue9to10 of this s a sstudent
	*/
	public void setTue9to10(java.lang.String tue9to10) {
		_saSstudent.setTue9to10(tue9to10);
	}

	/**
	* Returns the tue10to11 of this s a sstudent.
	*
	* @return the tue10to11 of this s a sstudent
	*/
	public java.lang.String getTue10to11() {
		return _saSstudent.getTue10to11();
	}

	/**
	* Sets the tue10to11 of this s a sstudent.
	*
	* @param tue10to11 the tue10to11 of this s a sstudent
	*/
	public void setTue10to11(java.lang.String tue10to11) {
		_saSstudent.setTue10to11(tue10to11);
	}

	/**
	* Returns the tue11to12 of this s a sstudent.
	*
	* @return the tue11to12 of this s a sstudent
	*/
	public java.lang.String getTue11to12() {
		return _saSstudent.getTue11to12();
	}

	/**
	* Sets the tue11to12 of this s a sstudent.
	*
	* @param tue11to12 the tue11to12 of this s a sstudent
	*/
	public void setTue11to12(java.lang.String tue11to12) {
		_saSstudent.setTue11to12(tue11to12);
	}

	/**
	* Returns the tue12to1 of this s a sstudent.
	*
	* @return the tue12to1 of this s a sstudent
	*/
	public java.lang.String getTue12to1() {
		return _saSstudent.getTue12to1();
	}

	/**
	* Sets the tue12to1 of this s a sstudent.
	*
	* @param tue12to1 the tue12to1 of this s a sstudent
	*/
	public void setTue12to1(java.lang.String tue12to1) {
		_saSstudent.setTue12to1(tue12to1);
	}

	/**
	* Returns the tue1to2 of this s a sstudent.
	*
	* @return the tue1to2 of this s a sstudent
	*/
	public java.lang.String getTue1to2() {
		return _saSstudent.getTue1to2();
	}

	/**
	* Sets the tue1to2 of this s a sstudent.
	*
	* @param tue1to2 the tue1to2 of this s a sstudent
	*/
	public void setTue1to2(java.lang.String tue1to2) {
		_saSstudent.setTue1to2(tue1to2);
	}

	/**
	* Returns the tue2to3 of this s a sstudent.
	*
	* @return the tue2to3 of this s a sstudent
	*/
	public java.lang.String getTue2to3() {
		return _saSstudent.getTue2to3();
	}

	/**
	* Sets the tue2to3 of this s a sstudent.
	*
	* @param tue2to3 the tue2to3 of this s a sstudent
	*/
	public void setTue2to3(java.lang.String tue2to3) {
		_saSstudent.setTue2to3(tue2to3);
	}

	/**
	* Returns the tue3to4 of this s a sstudent.
	*
	* @return the tue3to4 of this s a sstudent
	*/
	public java.lang.String getTue3to4() {
		return _saSstudent.getTue3to4();
	}

	/**
	* Sets the tue3to4 of this s a sstudent.
	*
	* @param tue3to4 the tue3to4 of this s a sstudent
	*/
	public void setTue3to4(java.lang.String tue3to4) {
		_saSstudent.setTue3to4(tue3to4);
	}

	/**
	* Returns the tue4to5 of this s a sstudent.
	*
	* @return the tue4to5 of this s a sstudent
	*/
	public java.lang.String getTue4to5() {
		return _saSstudent.getTue4to5();
	}

	/**
	* Sets the tue4to5 of this s a sstudent.
	*
	* @param tue4to5 the tue4to5 of this s a sstudent
	*/
	public void setTue4to5(java.lang.String tue4to5) {
		_saSstudent.setTue4to5(tue4to5);
	}

	/**
	* Returns the wed8to9 of this s a sstudent.
	*
	* @return the wed8to9 of this s a sstudent
	*/
	public java.lang.String getWed8to9() {
		return _saSstudent.getWed8to9();
	}

	/**
	* Sets the wed8to9 of this s a sstudent.
	*
	* @param wed8to9 the wed8to9 of this s a sstudent
	*/
	public void setWed8to9(java.lang.String wed8to9) {
		_saSstudent.setWed8to9(wed8to9);
	}

	/**
	* Returns the wed9to10 of this s a sstudent.
	*
	* @return the wed9to10 of this s a sstudent
	*/
	public java.lang.String getWed9to10() {
		return _saSstudent.getWed9to10();
	}

	/**
	* Sets the wed9to10 of this s a sstudent.
	*
	* @param wed9to10 the wed9to10 of this s a sstudent
	*/
	public void setWed9to10(java.lang.String wed9to10) {
		_saSstudent.setWed9to10(wed9to10);
	}

	/**
	* Returns the wed10to11 of this s a sstudent.
	*
	* @return the wed10to11 of this s a sstudent
	*/
	public java.lang.String getWed10to11() {
		return _saSstudent.getWed10to11();
	}

	/**
	* Sets the wed10to11 of this s a sstudent.
	*
	* @param wed10to11 the wed10to11 of this s a sstudent
	*/
	public void setWed10to11(java.lang.String wed10to11) {
		_saSstudent.setWed10to11(wed10to11);
	}

	/**
	* Returns the wed11to12 of this s a sstudent.
	*
	* @return the wed11to12 of this s a sstudent
	*/
	public java.lang.String getWed11to12() {
		return _saSstudent.getWed11to12();
	}

	/**
	* Sets the wed11to12 of this s a sstudent.
	*
	* @param wed11to12 the wed11to12 of this s a sstudent
	*/
	public void setWed11to12(java.lang.String wed11to12) {
		_saSstudent.setWed11to12(wed11to12);
	}

	/**
	* Returns the wed12to1 of this s a sstudent.
	*
	* @return the wed12to1 of this s a sstudent
	*/
	public java.lang.String getWed12to1() {
		return _saSstudent.getWed12to1();
	}

	/**
	* Sets the wed12to1 of this s a sstudent.
	*
	* @param wed12to1 the wed12to1 of this s a sstudent
	*/
	public void setWed12to1(java.lang.String wed12to1) {
		_saSstudent.setWed12to1(wed12to1);
	}

	/**
	* Returns the wed1to2 of this s a sstudent.
	*
	* @return the wed1to2 of this s a sstudent
	*/
	public java.lang.String getWed1to2() {
		return _saSstudent.getWed1to2();
	}

	/**
	* Sets the wed1to2 of this s a sstudent.
	*
	* @param wed1to2 the wed1to2 of this s a sstudent
	*/
	public void setWed1to2(java.lang.String wed1to2) {
		_saSstudent.setWed1to2(wed1to2);
	}

	/**
	* Returns the wed2to3 of this s a sstudent.
	*
	* @return the wed2to3 of this s a sstudent
	*/
	public java.lang.String getWed2to3() {
		return _saSstudent.getWed2to3();
	}

	/**
	* Sets the wed2to3 of this s a sstudent.
	*
	* @param wed2to3 the wed2to3 of this s a sstudent
	*/
	public void setWed2to3(java.lang.String wed2to3) {
		_saSstudent.setWed2to3(wed2to3);
	}

	/**
	* Returns the wed3to4 of this s a sstudent.
	*
	* @return the wed3to4 of this s a sstudent
	*/
	public java.lang.String getWed3to4() {
		return _saSstudent.getWed3to4();
	}

	/**
	* Sets the wed3to4 of this s a sstudent.
	*
	* @param wed3to4 the wed3to4 of this s a sstudent
	*/
	public void setWed3to4(java.lang.String wed3to4) {
		_saSstudent.setWed3to4(wed3to4);
	}

	/**
	* Returns the wed4to5 of this s a sstudent.
	*
	* @return the wed4to5 of this s a sstudent
	*/
	public java.lang.String getWed4to5() {
		return _saSstudent.getWed4to5();
	}

	/**
	* Sets the wed4to5 of this s a sstudent.
	*
	* @param wed4to5 the wed4to5 of this s a sstudent
	*/
	public void setWed4to5(java.lang.String wed4to5) {
		_saSstudent.setWed4to5(wed4to5);
	}

	/**
	* Returns the thu8to9 of this s a sstudent.
	*
	* @return the thu8to9 of this s a sstudent
	*/
	public java.lang.String getThu8to9() {
		return _saSstudent.getThu8to9();
	}

	/**
	* Sets the thu8to9 of this s a sstudent.
	*
	* @param thu8to9 the thu8to9 of this s a sstudent
	*/
	public void setThu8to9(java.lang.String thu8to9) {
		_saSstudent.setThu8to9(thu8to9);
	}

	/**
	* Returns the thu9to10 of this s a sstudent.
	*
	* @return the thu9to10 of this s a sstudent
	*/
	public java.lang.String getThu9to10() {
		return _saSstudent.getThu9to10();
	}

	/**
	* Sets the thu9to10 of this s a sstudent.
	*
	* @param thu9to10 the thu9to10 of this s a sstudent
	*/
	public void setThu9to10(java.lang.String thu9to10) {
		_saSstudent.setThu9to10(thu9to10);
	}

	/**
	* Returns the thu10to11 of this s a sstudent.
	*
	* @return the thu10to11 of this s a sstudent
	*/
	public java.lang.String getThu10to11() {
		return _saSstudent.getThu10to11();
	}

	/**
	* Sets the thu10to11 of this s a sstudent.
	*
	* @param thu10to11 the thu10to11 of this s a sstudent
	*/
	public void setThu10to11(java.lang.String thu10to11) {
		_saSstudent.setThu10to11(thu10to11);
	}

	/**
	* Returns the thu11to12 of this s a sstudent.
	*
	* @return the thu11to12 of this s a sstudent
	*/
	public java.lang.String getThu11to12() {
		return _saSstudent.getThu11to12();
	}

	/**
	* Sets the thu11to12 of this s a sstudent.
	*
	* @param thu11to12 the thu11to12 of this s a sstudent
	*/
	public void setThu11to12(java.lang.String thu11to12) {
		_saSstudent.setThu11to12(thu11to12);
	}

	/**
	* Returns the thu12to1 of this s a sstudent.
	*
	* @return the thu12to1 of this s a sstudent
	*/
	public java.lang.String getThu12to1() {
		return _saSstudent.getThu12to1();
	}

	/**
	* Sets the thu12to1 of this s a sstudent.
	*
	* @param thu12to1 the thu12to1 of this s a sstudent
	*/
	public void setThu12to1(java.lang.String thu12to1) {
		_saSstudent.setThu12to1(thu12to1);
	}

	/**
	* Returns the thu1to2 of this s a sstudent.
	*
	* @return the thu1to2 of this s a sstudent
	*/
	public java.lang.String getThu1to2() {
		return _saSstudent.getThu1to2();
	}

	/**
	* Sets the thu1to2 of this s a sstudent.
	*
	* @param thu1to2 the thu1to2 of this s a sstudent
	*/
	public void setThu1to2(java.lang.String thu1to2) {
		_saSstudent.setThu1to2(thu1to2);
	}

	/**
	* Returns the thu2to3 of this s a sstudent.
	*
	* @return the thu2to3 of this s a sstudent
	*/
	public java.lang.String getThu2to3() {
		return _saSstudent.getThu2to3();
	}

	/**
	* Sets the thu2to3 of this s a sstudent.
	*
	* @param thu2to3 the thu2to3 of this s a sstudent
	*/
	public void setThu2to3(java.lang.String thu2to3) {
		_saSstudent.setThu2to3(thu2to3);
	}

	/**
	* Returns the thu3to4 of this s a sstudent.
	*
	* @return the thu3to4 of this s a sstudent
	*/
	public java.lang.String getThu3to4() {
		return _saSstudent.getThu3to4();
	}

	/**
	* Sets the thu3to4 of this s a sstudent.
	*
	* @param thu3to4 the thu3to4 of this s a sstudent
	*/
	public void setThu3to4(java.lang.String thu3to4) {
		_saSstudent.setThu3to4(thu3to4);
	}

	/**
	* Returns the thu4to5 of this s a sstudent.
	*
	* @return the thu4to5 of this s a sstudent
	*/
	public java.lang.String getThu4to5() {
		return _saSstudent.getThu4to5();
	}

	/**
	* Sets the thu4to5 of this s a sstudent.
	*
	* @param thu4to5 the thu4to5 of this s a sstudent
	*/
	public void setThu4to5(java.lang.String thu4to5) {
		_saSstudent.setThu4to5(thu4to5);
	}

	/**
	* Returns the fri8to9 of this s a sstudent.
	*
	* @return the fri8to9 of this s a sstudent
	*/
	public java.lang.String getFri8to9() {
		return _saSstudent.getFri8to9();
	}

	/**
	* Sets the fri8to9 of this s a sstudent.
	*
	* @param fri8to9 the fri8to9 of this s a sstudent
	*/
	public void setFri8to9(java.lang.String fri8to9) {
		_saSstudent.setFri8to9(fri8to9);
	}

	/**
	* Returns the fri9to10 of this s a sstudent.
	*
	* @return the fri9to10 of this s a sstudent
	*/
	public java.lang.String getFri9to10() {
		return _saSstudent.getFri9to10();
	}

	/**
	* Sets the fri9to10 of this s a sstudent.
	*
	* @param fri9to10 the fri9to10 of this s a sstudent
	*/
	public void setFri9to10(java.lang.String fri9to10) {
		_saSstudent.setFri9to10(fri9to10);
	}

	/**
	* Returns the fri10to11 of this s a sstudent.
	*
	* @return the fri10to11 of this s a sstudent
	*/
	public java.lang.String getFri10to11() {
		return _saSstudent.getFri10to11();
	}

	/**
	* Sets the fri10to11 of this s a sstudent.
	*
	* @param fri10to11 the fri10to11 of this s a sstudent
	*/
	public void setFri10to11(java.lang.String fri10to11) {
		_saSstudent.setFri10to11(fri10to11);
	}

	/**
	* Returns the fri11to12 of this s a sstudent.
	*
	* @return the fri11to12 of this s a sstudent
	*/
	public java.lang.String getFri11to12() {
		return _saSstudent.getFri11to12();
	}

	/**
	* Sets the fri11to12 of this s a sstudent.
	*
	* @param fri11to12 the fri11to12 of this s a sstudent
	*/
	public void setFri11to12(java.lang.String fri11to12) {
		_saSstudent.setFri11to12(fri11to12);
	}

	/**
	* Returns the fri12to1 of this s a sstudent.
	*
	* @return the fri12to1 of this s a sstudent
	*/
	public java.lang.String getFri12to1() {
		return _saSstudent.getFri12to1();
	}

	/**
	* Sets the fri12to1 of this s a sstudent.
	*
	* @param fri12to1 the fri12to1 of this s a sstudent
	*/
	public void setFri12to1(java.lang.String fri12to1) {
		_saSstudent.setFri12to1(fri12to1);
	}

	/**
	* Returns the fri1to2 of this s a sstudent.
	*
	* @return the fri1to2 of this s a sstudent
	*/
	public java.lang.String getFri1to2() {
		return _saSstudent.getFri1to2();
	}

	/**
	* Sets the fri1to2 of this s a sstudent.
	*
	* @param fri1to2 the fri1to2 of this s a sstudent
	*/
	public void setFri1to2(java.lang.String fri1to2) {
		_saSstudent.setFri1to2(fri1to2);
	}

	/**
	* Returns the fri2to3 of this s a sstudent.
	*
	* @return the fri2to3 of this s a sstudent
	*/
	public java.lang.String getFri2to3() {
		return _saSstudent.getFri2to3();
	}

	/**
	* Sets the fri2to3 of this s a sstudent.
	*
	* @param fri2to3 the fri2to3 of this s a sstudent
	*/
	public void setFri2to3(java.lang.String fri2to3) {
		_saSstudent.setFri2to3(fri2to3);
	}

	/**
	* Returns the fri3to4 of this s a sstudent.
	*
	* @return the fri3to4 of this s a sstudent
	*/
	public java.lang.String getFri3to4() {
		return _saSstudent.getFri3to4();
	}

	/**
	* Sets the fri3to4 of this s a sstudent.
	*
	* @param fri3to4 the fri3to4 of this s a sstudent
	*/
	public void setFri3to4(java.lang.String fri3to4) {
		_saSstudent.setFri3to4(fri3to4);
	}

	/**
	* Returns the fri4to5 of this s a sstudent.
	*
	* @return the fri4to5 of this s a sstudent
	*/
	public java.lang.String getFri4to5() {
		return _saSstudent.getFri4to5();
	}

	/**
	* Sets the fri4to5 of this s a sstudent.
	*
	* @param fri4to5 the fri4to5 of this s a sstudent
	*/
	public void setFri4to5(java.lang.String fri4to5) {
		_saSstudent.setFri4to5(fri4to5);
	}

	/**
	* Returns the sat8to9 of this s a sstudent.
	*
	* @return the sat8to9 of this s a sstudent
	*/
	public java.lang.String getSat8to9() {
		return _saSstudent.getSat8to9();
	}

	/**
	* Sets the sat8to9 of this s a sstudent.
	*
	* @param sat8to9 the sat8to9 of this s a sstudent
	*/
	public void setSat8to9(java.lang.String sat8to9) {
		_saSstudent.setSat8to9(sat8to9);
	}

	/**
	* Returns the sat9to10 of this s a sstudent.
	*
	* @return the sat9to10 of this s a sstudent
	*/
	public java.lang.String getSat9to10() {
		return _saSstudent.getSat9to10();
	}

	/**
	* Sets the sat9to10 of this s a sstudent.
	*
	* @param sat9to10 the sat9to10 of this s a sstudent
	*/
	public void setSat9to10(java.lang.String sat9to10) {
		_saSstudent.setSat9to10(sat9to10);
	}

	/**
	* Returns the sat10to11 of this s a sstudent.
	*
	* @return the sat10to11 of this s a sstudent
	*/
	public java.lang.String getSat10to11() {
		return _saSstudent.getSat10to11();
	}

	/**
	* Sets the sat10to11 of this s a sstudent.
	*
	* @param sat10to11 the sat10to11 of this s a sstudent
	*/
	public void setSat10to11(java.lang.String sat10to11) {
		_saSstudent.setSat10to11(sat10to11);
	}

	/**
	* Returns the sat11to12 of this s a sstudent.
	*
	* @return the sat11to12 of this s a sstudent
	*/
	public java.lang.String getSat11to12() {
		return _saSstudent.getSat11to12();
	}

	/**
	* Sets the sat11to12 of this s a sstudent.
	*
	* @param sat11to12 the sat11to12 of this s a sstudent
	*/
	public void setSat11to12(java.lang.String sat11to12) {
		_saSstudent.setSat11to12(sat11to12);
	}

	/**
	* Returns the sat12to1 of this s a sstudent.
	*
	* @return the sat12to1 of this s a sstudent
	*/
	public java.lang.String getSat12to1() {
		return _saSstudent.getSat12to1();
	}

	/**
	* Sets the sat12to1 of this s a sstudent.
	*
	* @param sat12to1 the sat12to1 of this s a sstudent
	*/
	public void setSat12to1(java.lang.String sat12to1) {
		_saSstudent.setSat12to1(sat12to1);
	}

	/**
	* Returns the sat1to2 of this s a sstudent.
	*
	* @return the sat1to2 of this s a sstudent
	*/
	public java.lang.String getSat1to2() {
		return _saSstudent.getSat1to2();
	}

	/**
	* Sets the sat1to2 of this s a sstudent.
	*
	* @param sat1to2 the sat1to2 of this s a sstudent
	*/
	public void setSat1to2(java.lang.String sat1to2) {
		_saSstudent.setSat1to2(sat1to2);
	}

	/**
	* Returns the sat2to3 of this s a sstudent.
	*
	* @return the sat2to3 of this s a sstudent
	*/
	public java.lang.String getSat2to3() {
		return _saSstudent.getSat2to3();
	}

	/**
	* Sets the sat2to3 of this s a sstudent.
	*
	* @param sat2to3 the sat2to3 of this s a sstudent
	*/
	public void setSat2to3(java.lang.String sat2to3) {
		_saSstudent.setSat2to3(sat2to3);
	}

	/**
	* Returns the sat3to4 of this s a sstudent.
	*
	* @return the sat3to4 of this s a sstudent
	*/
	public java.lang.String getSat3to4() {
		return _saSstudent.getSat3to4();
	}

	/**
	* Sets the sat3to4 of this s a sstudent.
	*
	* @param sat3to4 the sat3to4 of this s a sstudent
	*/
	public void setSat3to4(java.lang.String sat3to4) {
		_saSstudent.setSat3to4(sat3to4);
	}

	/**
	* Returns the sat4to5 of this s a sstudent.
	*
	* @return the sat4to5 of this s a sstudent
	*/
	public java.lang.String getSat4to5() {
		return _saSstudent.getSat4to5();
	}

	/**
	* Sets the sat4to5 of this s a sstudent.
	*
	* @param sat4to5 the sat4to5 of this s a sstudent
	*/
	public void setSat4to5(java.lang.String sat4to5) {
		_saSstudent.setSat4to5(sat4to5);
	}

	/**
	* Returns the sun8to9 of this s a sstudent.
	*
	* @return the sun8to9 of this s a sstudent
	*/
	public java.lang.String getSun8to9() {
		return _saSstudent.getSun8to9();
	}

	/**
	* Sets the sun8to9 of this s a sstudent.
	*
	* @param sun8to9 the sun8to9 of this s a sstudent
	*/
	public void setSun8to9(java.lang.String sun8to9) {
		_saSstudent.setSun8to9(sun8to9);
	}

	/**
	* Returns the sun9to10 of this s a sstudent.
	*
	* @return the sun9to10 of this s a sstudent
	*/
	public java.lang.String getSun9to10() {
		return _saSstudent.getSun9to10();
	}

	/**
	* Sets the sun9to10 of this s a sstudent.
	*
	* @param sun9to10 the sun9to10 of this s a sstudent
	*/
	public void setSun9to10(java.lang.String sun9to10) {
		_saSstudent.setSun9to10(sun9to10);
	}

	/**
	* Returns the sun10to11 of this s a sstudent.
	*
	* @return the sun10to11 of this s a sstudent
	*/
	public java.lang.String getSun10to11() {
		return _saSstudent.getSun10to11();
	}

	/**
	* Sets the sun10to11 of this s a sstudent.
	*
	* @param sun10to11 the sun10to11 of this s a sstudent
	*/
	public void setSun10to11(java.lang.String sun10to11) {
		_saSstudent.setSun10to11(sun10to11);
	}

	/**
	* Returns the sun11to12 of this s a sstudent.
	*
	* @return the sun11to12 of this s a sstudent
	*/
	public java.lang.String getSun11to12() {
		return _saSstudent.getSun11to12();
	}

	/**
	* Sets the sun11to12 of this s a sstudent.
	*
	* @param sun11to12 the sun11to12 of this s a sstudent
	*/
	public void setSun11to12(java.lang.String sun11to12) {
		_saSstudent.setSun11to12(sun11to12);
	}

	/**
	* Returns the sun12to1 of this s a sstudent.
	*
	* @return the sun12to1 of this s a sstudent
	*/
	public java.lang.String getSun12to1() {
		return _saSstudent.getSun12to1();
	}

	/**
	* Sets the sun12to1 of this s a sstudent.
	*
	* @param sun12to1 the sun12to1 of this s a sstudent
	*/
	public void setSun12to1(java.lang.String sun12to1) {
		_saSstudent.setSun12to1(sun12to1);
	}

	/**
	* Returns the sun1to2 of this s a sstudent.
	*
	* @return the sun1to2 of this s a sstudent
	*/
	public java.lang.String getSun1to2() {
		return _saSstudent.getSun1to2();
	}

	/**
	* Sets the sun1to2 of this s a sstudent.
	*
	* @param sun1to2 the sun1to2 of this s a sstudent
	*/
	public void setSun1to2(java.lang.String sun1to2) {
		_saSstudent.setSun1to2(sun1to2);
	}

	/**
	* Returns the sun2to3 of this s a sstudent.
	*
	* @return the sun2to3 of this s a sstudent
	*/
	public java.lang.String getSun2to3() {
		return _saSstudent.getSun2to3();
	}

	/**
	* Sets the sun2to3 of this s a sstudent.
	*
	* @param sun2to3 the sun2to3 of this s a sstudent
	*/
	public void setSun2to3(java.lang.String sun2to3) {
		_saSstudent.setSun2to3(sun2to3);
	}

	/**
	* Returns the sun3to4 of this s a sstudent.
	*
	* @return the sun3to4 of this s a sstudent
	*/
	public java.lang.String getSun3to4() {
		return _saSstudent.getSun3to4();
	}

	/**
	* Sets the sun3to4 of this s a sstudent.
	*
	* @param sun3to4 the sun3to4 of this s a sstudent
	*/
	public void setSun3to4(java.lang.String sun3to4) {
		_saSstudent.setSun3to4(sun3to4);
	}

	/**
	* Returns the sun4to5 of this s a sstudent.
	*
	* @return the sun4to5 of this s a sstudent
	*/
	public java.lang.String getSun4to5() {
		return _saSstudent.getSun4to5();
	}

	/**
	* Sets the sun4to5 of this s a sstudent.
	*
	* @param sun4to5 the sun4to5 of this s a sstudent
	*/
	public void setSun4to5(java.lang.String sun4to5) {
		_saSstudent.setSun4to5(sun4to5);
	}

	/**
	* Returns the author of this s a sstudent.
	*
	* @return the author of this s a sstudent
	*/
	public java.lang.String getAuthor() {
		return _saSstudent.getAuthor();
	}

	/**
	* Sets the author of this s a sstudent.
	*
	* @param author the author of this s a sstudent
	*/
	public void setAuthor(java.lang.String author) {
		_saSstudent.setAuthor(author);
	}

	/**
	* Returns the date added of this s a sstudent.
	*
	* @return the date added of this s a sstudent
	*/
	public java.util.Date getDateAdded() {
		return _saSstudent.getDateAdded();
	}

	/**
	* Sets the date added of this s a sstudent.
	*
	* @param dateAdded the date added of this s a sstudent
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_saSstudent.setDateAdded(dateAdded);
	}

	public boolean isNew() {
		return _saSstudent.isNew();
	}

	public void setNew(boolean n) {
		_saSstudent.setNew(n);
	}

	public boolean isCachedModel() {
		return _saSstudent.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_saSstudent.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _saSstudent.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _saSstudent.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_saSstudent.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _saSstudent.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_saSstudent.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SASstudentWrapper((SASstudent)_saSstudent.clone());
	}

	public int compareTo(
		com.StudentAvailability.slayer.model.SASstudent saSstudent) {
		return _saSstudent.compareTo(saSstudent);
	}

	@Override
	public int hashCode() {
		return _saSstudent.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.StudentAvailability.slayer.model.SASstudent> toCacheModel() {
		return _saSstudent.toCacheModel();
	}

	public com.StudentAvailability.slayer.model.SASstudent toEscapedModel() {
		return new SASstudentWrapper(_saSstudent.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _saSstudent.toString();
	}

	public java.lang.String toXmlString() {
		return _saSstudent.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_saSstudent.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public SASstudent getWrappedSASstudent() {
		return _saSstudent;
	}

	public SASstudent getWrappedModel() {
		return _saSstudent;
	}

	public void resetOriginalValues() {
		_saSstudent.resetOriginalValues();
	}

	private SASstudent _saSstudent;
}