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

package com.asu.poly.teams.randomCreate.slayer.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Skillset service. Represents a row in the &quot;student_skillset&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.asu.poly.teams.randomCreate.slayer.model.impl.SkillsetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.asu.poly.teams.randomCreate.slayer.model.impl.SkillsetImpl}.
 * </p>
 *
 * @author asingh64
 * @see Skillset
 * @see com.asu.poly.teams.randomCreate.slayer.model.impl.SkillsetImpl
 * @see com.asu.poly.teams.randomCreate.slayer.model.impl.SkillsetModelImpl
 * @generated
 */
public interface SkillsetModel extends BaseModel<Skillset> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a skillset model instance should use the {@link Skillset} interface instead.
	 */

	/**
	 * Returns the primary key of this skillset.
	 *
	 * @return the primary key of this skillset
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this skillset.
	 *
	 * @param primaryKey the primary key of this skillset
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the student i d of this skillset.
	 *
	 * @return the student i d of this skillset
	 */
	public long getStudentID();

	/**
	 * Sets the student i d of this skillset.
	 *
	 * @param studentID the student i d of this skillset
	 */
	public void setStudentID(long studentID);

	/**
	 * Returns the asuid of this skillset.
	 *
	 * @return the asuid of this skillset
	 */
	@AutoEscape
	public String getAsuid();

	/**
	 * Sets the asuid of this skillset.
	 *
	 * @param asuid the asuid of this skillset
	 */
	public void setAsuid(String asuid);

	/**
	 * Returns the project_ management of this skillset.
	 *
	 * @return the project_ management of this skillset
	 */
	@AutoEscape
	public String getProject_Management();

	/**
	 * Sets the project_ management of this skillset.
	 *
	 * @param Project_Management the project_ management of this skillset
	 */
	public void setProject_Management(String Project_Management);

	/**
	 * Returns the technical_ writing of this skillset.
	 *
	 * @return the technical_ writing of this skillset
	 */
	@AutoEscape
	public String getTechnical_Writing();

	/**
	 * Sets the technical_ writing of this skillset.
	 *
	 * @param Technical_Writing the technical_ writing of this skillset
	 */
	public void setTechnical_Writing(String Technical_Writing);

	/**
	 * Returns the oral_ presentation of this skillset.
	 *
	 * @return the oral_ presentation of this skillset
	 */
	@AutoEscape
	public String getOral_Presentation();

	/**
	 * Sets the oral_ presentation of this skillset.
	 *
	 * @param Oral_Presentation the oral_ presentation of this skillset
	 */
	public void setOral_Presentation(String Oral_Presentation);

	/**
	 * Returns the thermo_ fluids of this skillset.
	 *
	 * @return the thermo_ fluids of this skillset
	 */
	@AutoEscape
	public String getThermo_Fluids();

	/**
	 * Sets the thermo_ fluids of this skillset.
	 *
	 * @param Thermo_Fluids the thermo_ fluids of this skillset
	 */
	public void setThermo_Fluids(String Thermo_Fluids);

	/**
	 * Returns the data_ analysis of this skillset.
	 *
	 * @return the data_ analysis of this skillset
	 */
	@AutoEscape
	public String getData_Analysis();

	/**
	 * Sets the data_ analysis of this skillset.
	 *
	 * @param Data_Analysis the data_ analysis of this skillset
	 */
	public void setData_Analysis(String Data_Analysis);

	/**
	 * Returns the leadership of this skillset.
	 *
	 * @return the leadership of this skillset
	 */
	@AutoEscape
	public String getLeadership();

	/**
	 * Sets the leadership of this skillset.
	 *
	 * @param Leadership the leadership of this skillset
	 */
	public void setLeadership(String Leadership);

	/**
	 * Returns the automation of this skillset.
	 *
	 * @return the automation of this skillset
	 */
	@AutoEscape
	public String getAutomation();

	/**
	 * Sets the automation of this skillset.
	 *
	 * @param Automation the automation of this skillset
	 */
	public void setAutomation(String Automation);

	/**
	 * Returns the mechanical_ design of this skillset.
	 *
	 * @return the mechanical_ design of this skillset
	 */
	@AutoEscape
	public String getMechanical_Design();

	/**
	 * Sets the mechanical_ design of this skillset.
	 *
	 * @param Mechanical_Design the mechanical_ design of this skillset
	 */
	public void setMechanical_Design(String Mechanical_Design);

	/**
	 * Returns the fabrication_ welding of this skillset.
	 *
	 * @return the fabrication_ welding of this skillset
	 */
	@AutoEscape
	public String getFabrication_Welding();

	/**
	 * Sets the fabrication_ welding of this skillset.
	 *
	 * @param Fabrication_Welding the fabrication_ welding of this skillset
	 */
	public void setFabrication_Welding(String Fabrication_Welding);

	/**
	 * Returns the machining_ c n c of this skillset.
	 *
	 * @return the machining_ c n c of this skillset
	 */
	@AutoEscape
	public String getMachining_CNC();

	/**
	 * Sets the machining_ c n c of this skillset.
	 *
	 * @param Machining_CNC the machining_ c n c of this skillset
	 */
	public void setMachining_CNC(String Machining_CNC);

	/**
	 * Returns the heat_ transfer of this skillset.
	 *
	 * @return the heat_ transfer of this skillset
	 */
	@AutoEscape
	public String getHeat_Transfer();

	/**
	 * Sets the heat_ transfer of this skillset.
	 *
	 * @param Heat_Transfer the heat_ transfer of this skillset
	 */
	public void setHeat_Transfer(String Heat_Transfer);

	/**
	 * Returns the electronics of this skillset.
	 *
	 * @return the electronics of this skillset
	 */
	@AutoEscape
	public String getElectronics();

	/**
	 * Sets the electronics of this skillset.
	 *
	 * @param Electronics the electronics of this skillset
	 */
	public void setElectronics(String Electronics);

	/**
	 * Returns the microcontrollers of this skillset.
	 *
	 * @return the microcontrollers of this skillset
	 */
	@AutoEscape
	public String getMicrocontrollers();

	/**
	 * Sets the microcontrollers of this skillset.
	 *
	 * @param Microcontrollers the microcontrollers of this skillset
	 */
	public void setMicrocontrollers(String Microcontrollers);

	/**
	 * Returns the g u i_and_ programming of this skillset.
	 *
	 * @return the g u i_and_ programming of this skillset
	 */
	@AutoEscape
	public String getGUI_and_Programming();

	/**
	 * Sets the g u i_and_ programming of this skillset.
	 *
	 * @param GUI_and_Programming the g u i_and_ programming of this skillset
	 */
	public void setGUI_and_Programming(String GUI_and_Programming);

	/**
	 * Returns the lab view of this skillset.
	 *
	 * @return the lab view of this skillset
	 */
	@AutoEscape
	public String getLabView();

	/**
	 * Sets the lab view of this skillset.
	 *
	 * @param LabView the lab view of this skillset
	 */
	public void setLabView(String LabView);

	/**
	 * Returns the embedded_ systems of this skillset.
	 *
	 * @return the embedded_ systems of this skillset
	 */
	@AutoEscape
	public String getEmbedded_Systems();

	/**
	 * Sets the embedded_ systems of this skillset.
	 *
	 * @param Embedded_Systems the embedded_ systems of this skillset
	 */
	public void setEmbedded_Systems(String Embedded_Systems);

	/**
	 * Returns the c a d d of this skillset.
	 *
	 * @return the c a d d of this skillset
	 */
	@AutoEscape
	public String getCADD();

	/**
	 * Sets the c a d d of this skillset.
	 *
	 * @param CADD the c a d d of this skillset
	 */
	public void setCADD(String CADD);

	/**
	 * Returns the f e a of this skillset.
	 *
	 * @return the f e a of this skillset
	 */
	@AutoEscape
	public String getFEA();

	/**
	 * Sets the f e a of this skillset.
	 *
	 * @param FEA the f e a of this skillset
	 */
	public void setFEA(String FEA);

	/**
	 * Returns the civil_ engineering of this skillset.
	 *
	 * @return the civil_ engineering of this skillset
	 */
	@AutoEscape
	public String getCivil_Engineering();

	/**
	 * Sets the civil_ engineering of this skillset.
	 *
	 * @param Civil_Engineering the civil_ engineering of this skillset
	 */
	public void setCivil_Engineering(String Civil_Engineering);

	/**
	 * Returns the date added of this skillset.
	 *
	 * @return the date added of this skillset
	 */
	public Date getDateAdded();

	/**
	 * Sets the date added of this skillset.
	 *
	 * @param dateAdded the date added of this skillset
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

	public int compareTo(Skillset skillset);

	public int hashCode();

	public CacheModel<Skillset> toCacheModel();

	public Skillset toEscapedModel();

	public String toString();

	public String toXmlString();
}