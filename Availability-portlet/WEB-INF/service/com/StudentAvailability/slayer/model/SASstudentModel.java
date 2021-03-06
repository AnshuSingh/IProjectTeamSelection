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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SASstudent service. Represents a row in the &quot;SAS_SASstudent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.StudentAvailability.slayer.model.impl.SASstudentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.StudentAvailability.slayer.model.impl.SASstudentImpl}.
 * </p>
 *
 * @author Purva
 * @see SASstudent
 * @see com.StudentAvailability.slayer.model.impl.SASstudentImpl
 * @see com.StudentAvailability.slayer.model.impl.SASstudentModelImpl
 * @generated
 */
public interface SASstudentModel extends BaseModel<SASstudent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a s a sstudent model instance should use the {@link SASstudent} interface instead.
	 */

	/**
	 * Returns the primary key of this s a sstudent.
	 *
	 * @return the primary key of this s a sstudent
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this s a sstudent.
	 *
	 * @param primaryKey the primary key of this s a sstudent
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the studentid of this s a sstudent.
	 *
	 * @return the studentid of this s a sstudent
	 */
	public long getStudentid();

	/**
	 * Sets the studentid of this s a sstudent.
	 *
	 * @param studentid the studentid of this s a sstudent
	 */
	public void setStudentid(long studentid);

	/**
	 * Returns the a s u ID of this s a sstudent.
	 *
	 * @return the a s u ID of this s a sstudent
	 */
	@AutoEscape
	public String getASUId();

	/**
	 * Sets the a s u ID of this s a sstudent.
	 *
	 * @param ASUId the a s u ID of this s a sstudent
	 */
	public void setASUId(String ASUId);

	/**
	 * Returns the mon8to9 of this s a sstudent.
	 *
	 * @return the mon8to9 of this s a sstudent
	 */
	@AutoEscape
	public String getMon8to9();

	/**
	 * Sets the mon8to9 of this s a sstudent.
	 *
	 * @param mon8to9 the mon8to9 of this s a sstudent
	 */
	public void setMon8to9(String mon8to9);

	/**
	 * Returns the mon9to10 of this s a sstudent.
	 *
	 * @return the mon9to10 of this s a sstudent
	 */
	@AutoEscape
	public String getMon9to10();

	/**
	 * Sets the mon9to10 of this s a sstudent.
	 *
	 * @param mon9to10 the mon9to10 of this s a sstudent
	 */
	public void setMon9to10(String mon9to10);

	/**
	 * Returns the mon10to11 of this s a sstudent.
	 *
	 * @return the mon10to11 of this s a sstudent
	 */
	@AutoEscape
	public String getMon10to11();

	/**
	 * Sets the mon10to11 of this s a sstudent.
	 *
	 * @param mon10to11 the mon10to11 of this s a sstudent
	 */
	public void setMon10to11(String mon10to11);

	/**
	 * Returns the mon11to12 of this s a sstudent.
	 *
	 * @return the mon11to12 of this s a sstudent
	 */
	@AutoEscape
	public String getMon11to12();

	/**
	 * Sets the mon11to12 of this s a sstudent.
	 *
	 * @param mon11to12 the mon11to12 of this s a sstudent
	 */
	public void setMon11to12(String mon11to12);

	/**
	 * Returns the mon12to1 of this s a sstudent.
	 *
	 * @return the mon12to1 of this s a sstudent
	 */
	@AutoEscape
	public String getMon12to1();

	/**
	 * Sets the mon12to1 of this s a sstudent.
	 *
	 * @param mon12to1 the mon12to1 of this s a sstudent
	 */
	public void setMon12to1(String mon12to1);

	/**
	 * Returns the mon1to2 of this s a sstudent.
	 *
	 * @return the mon1to2 of this s a sstudent
	 */
	@AutoEscape
	public String getMon1to2();

	/**
	 * Sets the mon1to2 of this s a sstudent.
	 *
	 * @param mon1to2 the mon1to2 of this s a sstudent
	 */
	public void setMon1to2(String mon1to2);

	/**
	 * Returns the mon2to3 of this s a sstudent.
	 *
	 * @return the mon2to3 of this s a sstudent
	 */
	@AutoEscape
	public String getMon2to3();

	/**
	 * Sets the mon2to3 of this s a sstudent.
	 *
	 * @param mon2to3 the mon2to3 of this s a sstudent
	 */
	public void setMon2to3(String mon2to3);

	/**
	 * Returns the mon3to4 of this s a sstudent.
	 *
	 * @return the mon3to4 of this s a sstudent
	 */
	@AutoEscape
	public String getMon3to4();

	/**
	 * Sets the mon3to4 of this s a sstudent.
	 *
	 * @param mon3to4 the mon3to4 of this s a sstudent
	 */
	public void setMon3to4(String mon3to4);

	/**
	 * Returns the mon4to5 of this s a sstudent.
	 *
	 * @return the mon4to5 of this s a sstudent
	 */
	@AutoEscape
	public String getMon4to5();

	/**
	 * Sets the mon4to5 of this s a sstudent.
	 *
	 * @param mon4to5 the mon4to5 of this s a sstudent
	 */
	public void setMon4to5(String mon4to5);

	/**
	 * Returns the tue8to9 of this s a sstudent.
	 *
	 * @return the tue8to9 of this s a sstudent
	 */
	@AutoEscape
	public String getTue8to9();

	/**
	 * Sets the tue8to9 of this s a sstudent.
	 *
	 * @param tue8to9 the tue8to9 of this s a sstudent
	 */
	public void setTue8to9(String tue8to9);

	/**
	 * Returns the tue9to10 of this s a sstudent.
	 *
	 * @return the tue9to10 of this s a sstudent
	 */
	@AutoEscape
	public String getTue9to10();

	/**
	 * Sets the tue9to10 of this s a sstudent.
	 *
	 * @param tue9to10 the tue9to10 of this s a sstudent
	 */
	public void setTue9to10(String tue9to10);

	/**
	 * Returns the tue10to11 of this s a sstudent.
	 *
	 * @return the tue10to11 of this s a sstudent
	 */
	@AutoEscape
	public String getTue10to11();

	/**
	 * Sets the tue10to11 of this s a sstudent.
	 *
	 * @param tue10to11 the tue10to11 of this s a sstudent
	 */
	public void setTue10to11(String tue10to11);

	/**
	 * Returns the tue11to12 of this s a sstudent.
	 *
	 * @return the tue11to12 of this s a sstudent
	 */
	@AutoEscape
	public String getTue11to12();

	/**
	 * Sets the tue11to12 of this s a sstudent.
	 *
	 * @param tue11to12 the tue11to12 of this s a sstudent
	 */
	public void setTue11to12(String tue11to12);

	/**
	 * Returns the tue12to1 of this s a sstudent.
	 *
	 * @return the tue12to1 of this s a sstudent
	 */
	@AutoEscape
	public String getTue12to1();

	/**
	 * Sets the tue12to1 of this s a sstudent.
	 *
	 * @param tue12to1 the tue12to1 of this s a sstudent
	 */
	public void setTue12to1(String tue12to1);

	/**
	 * Returns the tue1to2 of this s a sstudent.
	 *
	 * @return the tue1to2 of this s a sstudent
	 */
	@AutoEscape
	public String getTue1to2();

	/**
	 * Sets the tue1to2 of this s a sstudent.
	 *
	 * @param tue1to2 the tue1to2 of this s a sstudent
	 */
	public void setTue1to2(String tue1to2);

	/**
	 * Returns the tue2to3 of this s a sstudent.
	 *
	 * @return the tue2to3 of this s a sstudent
	 */
	@AutoEscape
	public String getTue2to3();

	/**
	 * Sets the tue2to3 of this s a sstudent.
	 *
	 * @param tue2to3 the tue2to3 of this s a sstudent
	 */
	public void setTue2to3(String tue2to3);

	/**
	 * Returns the tue3to4 of this s a sstudent.
	 *
	 * @return the tue3to4 of this s a sstudent
	 */
	@AutoEscape
	public String getTue3to4();

	/**
	 * Sets the tue3to4 of this s a sstudent.
	 *
	 * @param tue3to4 the tue3to4 of this s a sstudent
	 */
	public void setTue3to4(String tue3to4);

	/**
	 * Returns the tue4to5 of this s a sstudent.
	 *
	 * @return the tue4to5 of this s a sstudent
	 */
	@AutoEscape
	public String getTue4to5();

	/**
	 * Sets the tue4to5 of this s a sstudent.
	 *
	 * @param tue4to5 the tue4to5 of this s a sstudent
	 */
	public void setTue4to5(String tue4to5);

	/**
	 * Returns the wed8to9 of this s a sstudent.
	 *
	 * @return the wed8to9 of this s a sstudent
	 */
	@AutoEscape
	public String getWed8to9();

	/**
	 * Sets the wed8to9 of this s a sstudent.
	 *
	 * @param wed8to9 the wed8to9 of this s a sstudent
	 */
	public void setWed8to9(String wed8to9);

	/**
	 * Returns the wed9to10 of this s a sstudent.
	 *
	 * @return the wed9to10 of this s a sstudent
	 */
	@AutoEscape
	public String getWed9to10();

	/**
	 * Sets the wed9to10 of this s a sstudent.
	 *
	 * @param wed9to10 the wed9to10 of this s a sstudent
	 */
	public void setWed9to10(String wed9to10);

	/**
	 * Returns the wed10to11 of this s a sstudent.
	 *
	 * @return the wed10to11 of this s a sstudent
	 */
	@AutoEscape
	public String getWed10to11();

	/**
	 * Sets the wed10to11 of this s a sstudent.
	 *
	 * @param wed10to11 the wed10to11 of this s a sstudent
	 */
	public void setWed10to11(String wed10to11);

	/**
	 * Returns the wed11to12 of this s a sstudent.
	 *
	 * @return the wed11to12 of this s a sstudent
	 */
	@AutoEscape
	public String getWed11to12();

	/**
	 * Sets the wed11to12 of this s a sstudent.
	 *
	 * @param wed11to12 the wed11to12 of this s a sstudent
	 */
	public void setWed11to12(String wed11to12);

	/**
	 * Returns the wed12to1 of this s a sstudent.
	 *
	 * @return the wed12to1 of this s a sstudent
	 */
	@AutoEscape
	public String getWed12to1();

	/**
	 * Sets the wed12to1 of this s a sstudent.
	 *
	 * @param wed12to1 the wed12to1 of this s a sstudent
	 */
	public void setWed12to1(String wed12to1);

	/**
	 * Returns the wed1to2 of this s a sstudent.
	 *
	 * @return the wed1to2 of this s a sstudent
	 */
	@AutoEscape
	public String getWed1to2();

	/**
	 * Sets the wed1to2 of this s a sstudent.
	 *
	 * @param wed1to2 the wed1to2 of this s a sstudent
	 */
	public void setWed1to2(String wed1to2);

	/**
	 * Returns the wed2to3 of this s a sstudent.
	 *
	 * @return the wed2to3 of this s a sstudent
	 */
	@AutoEscape
	public String getWed2to3();

	/**
	 * Sets the wed2to3 of this s a sstudent.
	 *
	 * @param wed2to3 the wed2to3 of this s a sstudent
	 */
	public void setWed2to3(String wed2to3);

	/**
	 * Returns the wed3to4 of this s a sstudent.
	 *
	 * @return the wed3to4 of this s a sstudent
	 */
	@AutoEscape
	public String getWed3to4();

	/**
	 * Sets the wed3to4 of this s a sstudent.
	 *
	 * @param wed3to4 the wed3to4 of this s a sstudent
	 */
	public void setWed3to4(String wed3to4);

	/**
	 * Returns the wed4to5 of this s a sstudent.
	 *
	 * @return the wed4to5 of this s a sstudent
	 */
	@AutoEscape
	public String getWed4to5();

	/**
	 * Sets the wed4to5 of this s a sstudent.
	 *
	 * @param wed4to5 the wed4to5 of this s a sstudent
	 */
	public void setWed4to5(String wed4to5);

	/**
	 * Returns the thu8to9 of this s a sstudent.
	 *
	 * @return the thu8to9 of this s a sstudent
	 */
	@AutoEscape
	public String getThu8to9();

	/**
	 * Sets the thu8to9 of this s a sstudent.
	 *
	 * @param thu8to9 the thu8to9 of this s a sstudent
	 */
	public void setThu8to9(String thu8to9);

	/**
	 * Returns the thu9to10 of this s a sstudent.
	 *
	 * @return the thu9to10 of this s a sstudent
	 */
	@AutoEscape
	public String getThu9to10();

	/**
	 * Sets the thu9to10 of this s a sstudent.
	 *
	 * @param thu9to10 the thu9to10 of this s a sstudent
	 */
	public void setThu9to10(String thu9to10);

	/**
	 * Returns the thu10to11 of this s a sstudent.
	 *
	 * @return the thu10to11 of this s a sstudent
	 */
	@AutoEscape
	public String getThu10to11();

	/**
	 * Sets the thu10to11 of this s a sstudent.
	 *
	 * @param thu10to11 the thu10to11 of this s a sstudent
	 */
	public void setThu10to11(String thu10to11);

	/**
	 * Returns the thu11to12 of this s a sstudent.
	 *
	 * @return the thu11to12 of this s a sstudent
	 */
	@AutoEscape
	public String getThu11to12();

	/**
	 * Sets the thu11to12 of this s a sstudent.
	 *
	 * @param thu11to12 the thu11to12 of this s a sstudent
	 */
	public void setThu11to12(String thu11to12);

	/**
	 * Returns the thu12to1 of this s a sstudent.
	 *
	 * @return the thu12to1 of this s a sstudent
	 */
	@AutoEscape
	public String getThu12to1();

	/**
	 * Sets the thu12to1 of this s a sstudent.
	 *
	 * @param thu12to1 the thu12to1 of this s a sstudent
	 */
	public void setThu12to1(String thu12to1);

	/**
	 * Returns the thu1to2 of this s a sstudent.
	 *
	 * @return the thu1to2 of this s a sstudent
	 */
	@AutoEscape
	public String getThu1to2();

	/**
	 * Sets the thu1to2 of this s a sstudent.
	 *
	 * @param thu1to2 the thu1to2 of this s a sstudent
	 */
	public void setThu1to2(String thu1to2);

	/**
	 * Returns the thu2to3 of this s a sstudent.
	 *
	 * @return the thu2to3 of this s a sstudent
	 */
	@AutoEscape
	public String getThu2to3();

	/**
	 * Sets the thu2to3 of this s a sstudent.
	 *
	 * @param thu2to3 the thu2to3 of this s a sstudent
	 */
	public void setThu2to3(String thu2to3);

	/**
	 * Returns the thu3to4 of this s a sstudent.
	 *
	 * @return the thu3to4 of this s a sstudent
	 */
	@AutoEscape
	public String getThu3to4();

	/**
	 * Sets the thu3to4 of this s a sstudent.
	 *
	 * @param thu3to4 the thu3to4 of this s a sstudent
	 */
	public void setThu3to4(String thu3to4);

	/**
	 * Returns the thu4to5 of this s a sstudent.
	 *
	 * @return the thu4to5 of this s a sstudent
	 */
	@AutoEscape
	public String getThu4to5();

	/**
	 * Sets the thu4to5 of this s a sstudent.
	 *
	 * @param thu4to5 the thu4to5 of this s a sstudent
	 */
	public void setThu4to5(String thu4to5);

	/**
	 * Returns the fri8to9 of this s a sstudent.
	 *
	 * @return the fri8to9 of this s a sstudent
	 */
	@AutoEscape
	public String getFri8to9();

	/**
	 * Sets the fri8to9 of this s a sstudent.
	 *
	 * @param fri8to9 the fri8to9 of this s a sstudent
	 */
	public void setFri8to9(String fri8to9);

	/**
	 * Returns the fri9to10 of this s a sstudent.
	 *
	 * @return the fri9to10 of this s a sstudent
	 */
	@AutoEscape
	public String getFri9to10();

	/**
	 * Sets the fri9to10 of this s a sstudent.
	 *
	 * @param fri9to10 the fri9to10 of this s a sstudent
	 */
	public void setFri9to10(String fri9to10);

	/**
	 * Returns the fri10to11 of this s a sstudent.
	 *
	 * @return the fri10to11 of this s a sstudent
	 */
	@AutoEscape
	public String getFri10to11();

	/**
	 * Sets the fri10to11 of this s a sstudent.
	 *
	 * @param fri10to11 the fri10to11 of this s a sstudent
	 */
	public void setFri10to11(String fri10to11);

	/**
	 * Returns the fri11to12 of this s a sstudent.
	 *
	 * @return the fri11to12 of this s a sstudent
	 */
	@AutoEscape
	public String getFri11to12();

	/**
	 * Sets the fri11to12 of this s a sstudent.
	 *
	 * @param fri11to12 the fri11to12 of this s a sstudent
	 */
	public void setFri11to12(String fri11to12);

	/**
	 * Returns the fri12to1 of this s a sstudent.
	 *
	 * @return the fri12to1 of this s a sstudent
	 */
	@AutoEscape
	public String getFri12to1();

	/**
	 * Sets the fri12to1 of this s a sstudent.
	 *
	 * @param fri12to1 the fri12to1 of this s a sstudent
	 */
	public void setFri12to1(String fri12to1);

	/**
	 * Returns the fri1to2 of this s a sstudent.
	 *
	 * @return the fri1to2 of this s a sstudent
	 */
	@AutoEscape
	public String getFri1to2();

	/**
	 * Sets the fri1to2 of this s a sstudent.
	 *
	 * @param fri1to2 the fri1to2 of this s a sstudent
	 */
	public void setFri1to2(String fri1to2);

	/**
	 * Returns the fri2to3 of this s a sstudent.
	 *
	 * @return the fri2to3 of this s a sstudent
	 */
	@AutoEscape
	public String getFri2to3();

	/**
	 * Sets the fri2to3 of this s a sstudent.
	 *
	 * @param fri2to3 the fri2to3 of this s a sstudent
	 */
	public void setFri2to3(String fri2to3);

	/**
	 * Returns the fri3to4 of this s a sstudent.
	 *
	 * @return the fri3to4 of this s a sstudent
	 */
	@AutoEscape
	public String getFri3to4();

	/**
	 * Sets the fri3to4 of this s a sstudent.
	 *
	 * @param fri3to4 the fri3to4 of this s a sstudent
	 */
	public void setFri3to4(String fri3to4);

	/**
	 * Returns the fri4to5 of this s a sstudent.
	 *
	 * @return the fri4to5 of this s a sstudent
	 */
	@AutoEscape
	public String getFri4to5();

	/**
	 * Sets the fri4to5 of this s a sstudent.
	 *
	 * @param fri4to5 the fri4to5 of this s a sstudent
	 */
	public void setFri4to5(String fri4to5);

	/**
	 * Returns the sat8to9 of this s a sstudent.
	 *
	 * @return the sat8to9 of this s a sstudent
	 */
	@AutoEscape
	public String getSat8to9();

	/**
	 * Sets the sat8to9 of this s a sstudent.
	 *
	 * @param sat8to9 the sat8to9 of this s a sstudent
	 */
	public void setSat8to9(String sat8to9);

	/**
	 * Returns the sat9to10 of this s a sstudent.
	 *
	 * @return the sat9to10 of this s a sstudent
	 */
	@AutoEscape
	public String getSat9to10();

	/**
	 * Sets the sat9to10 of this s a sstudent.
	 *
	 * @param sat9to10 the sat9to10 of this s a sstudent
	 */
	public void setSat9to10(String sat9to10);

	/**
	 * Returns the sat10to11 of this s a sstudent.
	 *
	 * @return the sat10to11 of this s a sstudent
	 */
	@AutoEscape
	public String getSat10to11();

	/**
	 * Sets the sat10to11 of this s a sstudent.
	 *
	 * @param sat10to11 the sat10to11 of this s a sstudent
	 */
	public void setSat10to11(String sat10to11);

	/**
	 * Returns the sat11to12 of this s a sstudent.
	 *
	 * @return the sat11to12 of this s a sstudent
	 */
	@AutoEscape
	public String getSat11to12();

	/**
	 * Sets the sat11to12 of this s a sstudent.
	 *
	 * @param sat11to12 the sat11to12 of this s a sstudent
	 */
	public void setSat11to12(String sat11to12);

	/**
	 * Returns the sat12to1 of this s a sstudent.
	 *
	 * @return the sat12to1 of this s a sstudent
	 */
	@AutoEscape
	public String getSat12to1();

	/**
	 * Sets the sat12to1 of this s a sstudent.
	 *
	 * @param sat12to1 the sat12to1 of this s a sstudent
	 */
	public void setSat12to1(String sat12to1);

	/**
	 * Returns the sat1to2 of this s a sstudent.
	 *
	 * @return the sat1to2 of this s a sstudent
	 */
	@AutoEscape
	public String getSat1to2();

	/**
	 * Sets the sat1to2 of this s a sstudent.
	 *
	 * @param sat1to2 the sat1to2 of this s a sstudent
	 */
	public void setSat1to2(String sat1to2);

	/**
	 * Returns the sat2to3 of this s a sstudent.
	 *
	 * @return the sat2to3 of this s a sstudent
	 */
	@AutoEscape
	public String getSat2to3();

	/**
	 * Sets the sat2to3 of this s a sstudent.
	 *
	 * @param sat2to3 the sat2to3 of this s a sstudent
	 */
	public void setSat2to3(String sat2to3);

	/**
	 * Returns the sat3to4 of this s a sstudent.
	 *
	 * @return the sat3to4 of this s a sstudent
	 */
	@AutoEscape
	public String getSat3to4();

	/**
	 * Sets the sat3to4 of this s a sstudent.
	 *
	 * @param sat3to4 the sat3to4 of this s a sstudent
	 */
	public void setSat3to4(String sat3to4);

	/**
	 * Returns the sat4to5 of this s a sstudent.
	 *
	 * @return the sat4to5 of this s a sstudent
	 */
	@AutoEscape
	public String getSat4to5();

	/**
	 * Sets the sat4to5 of this s a sstudent.
	 *
	 * @param sat4to5 the sat4to5 of this s a sstudent
	 */
	public void setSat4to5(String sat4to5);

	/**
	 * Returns the sun8to9 of this s a sstudent.
	 *
	 * @return the sun8to9 of this s a sstudent
	 */
	@AutoEscape
	public String getSun8to9();

	/**
	 * Sets the sun8to9 of this s a sstudent.
	 *
	 * @param sun8to9 the sun8to9 of this s a sstudent
	 */
	public void setSun8to9(String sun8to9);

	/**
	 * Returns the sun9to10 of this s a sstudent.
	 *
	 * @return the sun9to10 of this s a sstudent
	 */
	@AutoEscape
	public String getSun9to10();

	/**
	 * Sets the sun9to10 of this s a sstudent.
	 *
	 * @param sun9to10 the sun9to10 of this s a sstudent
	 */
	public void setSun9to10(String sun9to10);

	/**
	 * Returns the sun10to11 of this s a sstudent.
	 *
	 * @return the sun10to11 of this s a sstudent
	 */
	@AutoEscape
	public String getSun10to11();

	/**
	 * Sets the sun10to11 of this s a sstudent.
	 *
	 * @param sun10to11 the sun10to11 of this s a sstudent
	 */
	public void setSun10to11(String sun10to11);

	/**
	 * Returns the sun11to12 of this s a sstudent.
	 *
	 * @return the sun11to12 of this s a sstudent
	 */
	@AutoEscape
	public String getSun11to12();

	/**
	 * Sets the sun11to12 of this s a sstudent.
	 *
	 * @param sun11to12 the sun11to12 of this s a sstudent
	 */
	public void setSun11to12(String sun11to12);

	/**
	 * Returns the sun12to1 of this s a sstudent.
	 *
	 * @return the sun12to1 of this s a sstudent
	 */
	@AutoEscape
	public String getSun12to1();

	/**
	 * Sets the sun12to1 of this s a sstudent.
	 *
	 * @param sun12to1 the sun12to1 of this s a sstudent
	 */
	public void setSun12to1(String sun12to1);

	/**
	 * Returns the sun1to2 of this s a sstudent.
	 *
	 * @return the sun1to2 of this s a sstudent
	 */
	@AutoEscape
	public String getSun1to2();

	/**
	 * Sets the sun1to2 of this s a sstudent.
	 *
	 * @param sun1to2 the sun1to2 of this s a sstudent
	 */
	public void setSun1to2(String sun1to2);

	/**
	 * Returns the sun2to3 of this s a sstudent.
	 *
	 * @return the sun2to3 of this s a sstudent
	 */
	@AutoEscape
	public String getSun2to3();

	/**
	 * Sets the sun2to3 of this s a sstudent.
	 *
	 * @param sun2to3 the sun2to3 of this s a sstudent
	 */
	public void setSun2to3(String sun2to3);

	/**
	 * Returns the sun3to4 of this s a sstudent.
	 *
	 * @return the sun3to4 of this s a sstudent
	 */
	@AutoEscape
	public String getSun3to4();

	/**
	 * Sets the sun3to4 of this s a sstudent.
	 *
	 * @param sun3to4 the sun3to4 of this s a sstudent
	 */
	public void setSun3to4(String sun3to4);

	/**
	 * Returns the sun4to5 of this s a sstudent.
	 *
	 * @return the sun4to5 of this s a sstudent
	 */
	@AutoEscape
	public String getSun4to5();

	/**
	 * Sets the sun4to5 of this s a sstudent.
	 *
	 * @param sun4to5 the sun4to5 of this s a sstudent
	 */
	public void setSun4to5(String sun4to5);

	/**
	 * Returns the author of this s a sstudent.
	 *
	 * @return the author of this s a sstudent
	 */
	@AutoEscape
	public String getAuthor();

	/**
	 * Sets the author of this s a sstudent.
	 *
	 * @param author the author of this s a sstudent
	 */
	public void setAuthor(String author);

	/**
	 * Returns the date added of this s a sstudent.
	 *
	 * @return the date added of this s a sstudent
	 */
	public Date getDateAdded();

	/**
	 * Sets the date added of this s a sstudent.
	 *
	 * @param dateAdded the date added of this s a sstudent
	 */
	public void setDateAdded(Date dateAdded);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(SASstudent saSstudent);

	public int hashCode();

	public CacheModel<SASstudent> toCacheModel();

	public SASstudent toEscapedModel();

	public String toString();

	public String toXmlString();
}