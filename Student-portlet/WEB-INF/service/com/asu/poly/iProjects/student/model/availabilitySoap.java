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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.asu.poly.iProjects.student.service.http.availabilityServiceSoap}.
 *
 * @author    Shruthi
 * @see       com.asu.poly.iProjects.student.service.http.availabilityServiceSoap
 * @generated
 */
public class availabilitySoap implements Serializable {
	public static availabilitySoap toSoapModel(availability model) {
		availabilitySoap soapModel = new availabilitySoap();

		soapModel.setStudentid(model.getStudentid());
		soapModel.setAsuriteid(model.getAsuriteid());
		soapModel.setMon8to9(model.getMon8to9());
		soapModel.setMon9to10(model.getMon9to10());
		soapModel.setMon10to11(model.getMon10to11());
		soapModel.setMon11to12(model.getMon11to12());
		soapModel.setMon12to1(model.getMon12to1());
		soapModel.setMon1to2(model.getMon1to2());
		soapModel.setMon2to3(model.getMon2to3());
		soapModel.setMon3to4(model.getMon3to4());
		soapModel.setMon4to5(model.getMon4to5());
		soapModel.setTue8to9(model.getTue8to9());
		soapModel.setTue9to10(model.getTue9to10());
		soapModel.setTue10to11(model.getTue10to11());
		soapModel.setTue11to12(model.getTue11to12());
		soapModel.setTue12to1(model.getTue12to1());
		soapModel.setTue1to2(model.getTue1to2());
		soapModel.setTue2to3(model.getTue2to3());
		soapModel.setTue3to4(model.getTue3to4());
		soapModel.setTue4to5(model.getTue4to5());
		soapModel.setWed8to9(model.getWed8to9());
		soapModel.setWed9to10(model.getWed9to10());
		soapModel.setWed10to11(model.getWed10to11());
		soapModel.setWed11to12(model.getWed11to12());
		soapModel.setWed12to1(model.getWed12to1());
		soapModel.setWed1to2(model.getWed1to2());
		soapModel.setWed2to3(model.getWed2to3());
		soapModel.setWed3to4(model.getWed3to4());
		soapModel.setWed4to5(model.getWed4to5());
		soapModel.setThu8to9(model.getThu8to9());
		soapModel.setThu9to10(model.getThu9to10());
		soapModel.setThu10to11(model.getThu10to11());
		soapModel.setThu11to12(model.getThu11to12());
		soapModel.setThu12to1(model.getThu12to1());
		soapModel.setThu1to2(model.getThu1to2());
		soapModel.setThu2to3(model.getThu2to3());
		soapModel.setThu3to4(model.getThu3to4());
		soapModel.setThu4to5(model.getThu4to5());
		soapModel.setFri8to9(model.getFri8to9());
		soapModel.setFri9to10(model.getFri9to10());
		soapModel.setFri10to11(model.getFri10to11());
		soapModel.setFri11to12(model.getFri11to12());
		soapModel.setFri12to1(model.getFri12to1());
		soapModel.setFri1to2(model.getFri1to2());
		soapModel.setFri2to3(model.getFri2to3());
		soapModel.setFri3to4(model.getFri3to4());
		soapModel.setFri4to5(model.getFri4to5());
		soapModel.setSat8to9(model.getSat8to9());
		soapModel.setSat9to10(model.getSat9to10());
		soapModel.setSat10to11(model.getSat10to11());
		soapModel.setSat11to12(model.getSat11to12());
		soapModel.setSat12to1(model.getSat12to1());
		soapModel.setSat1to2(model.getSat1to2());
		soapModel.setSat2to3(model.getSat2to3());
		soapModel.setSat3to4(model.getSat3to4());
		soapModel.setSat4to5(model.getSat4to5());
		soapModel.setSun8to9(model.getSun8to9());
		soapModel.setSun9to10(model.getSun9to10());
		soapModel.setSun10to11(model.getSun10to11());
		soapModel.setSun11to12(model.getSun11to12());
		soapModel.setSun12to1(model.getSun12to1());
		soapModel.setSun1to2(model.getSun1to2());
		soapModel.setSun2to3(model.getSun2to3());
		soapModel.setSun3to4(model.getSun3to4());
		soapModel.setSun4to5(model.getSun4to5());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static availabilitySoap[] toSoapModels(availability[] models) {
		availabilitySoap[] soapModels = new availabilitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static availabilitySoap[][] toSoapModels(availability[][] models) {
		availabilitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new availabilitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new availabilitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static availabilitySoap[] toSoapModels(List<availability> models) {
		List<availabilitySoap> soapModels = new ArrayList<availabilitySoap>(models.size());

		for (availability model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new availabilitySoap[soapModels.size()]);
	}

	public availabilitySoap() {
	}

	public long getPrimaryKey() {
		return _studentid;
	}

	public void setPrimaryKey(long pk) {
		setStudentid(pk);
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
}