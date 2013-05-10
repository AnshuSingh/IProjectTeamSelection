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

package com.asu.poly.iProjects.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.asu.poly.iProjects.service.http.iProjectServiceSoap}.
 *
 * @author    Shruthi
 * @see       com.asu.poly.iProjects.service.http.iProjectServiceSoap
 * @generated
 */
public class iProjectSoap implements Serializable {
	public static iProjectSoap toSoapModel(iProject model) {
		iProjectSoap soapModel = new iProjectSoap();

		soapModel.setProjectID(model.getProjectID());
		soapModel.setProjectTitle(model.getProjectTitle());
		soapModel.setProjectdescription(model.getProjectdescription());
		soapModel.setSponsor(model.getSponsor());
		soapModel.setRequiredSkills(model.getRequiredSkills());
		soapModel.setContact(model.getContact());
		soapModel.setStatus(model.getStatus());
		soapModel.setLink(model.getLink());
		soapModel.setDepartments(model.getDepartments());
		soapModel.setDateAdded(model.getDateAdded());
		soapModel.setDateModified(model.getDateModified());

		return soapModel;
	}

	public static iProjectSoap[] toSoapModels(iProject[] models) {
		iProjectSoap[] soapModels = new iProjectSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static iProjectSoap[][] toSoapModels(iProject[][] models) {
		iProjectSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new iProjectSoap[models.length][models[0].length];
		}
		else {
			soapModels = new iProjectSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static iProjectSoap[] toSoapModels(List<iProject> models) {
		List<iProjectSoap> soapModels = new ArrayList<iProjectSoap>(models.size());

		for (iProject model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new iProjectSoap[soapModels.size()]);
	}

	public iProjectSoap() {
	}

	public long getPrimaryKey() {
		return _projectID;
	}

	public void setPrimaryKey(long pk) {
		setProjectID(pk);
	}

	public long getProjectID() {
		return _projectID;
	}

	public void setProjectID(long projectID) {
		_projectID = projectID;
	}

	public String getProjectTitle() {
		return _projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		_projectTitle = projectTitle;
	}

	public String getProjectdescription() {
		return _projectdescription;
	}

	public void setProjectdescription(String projectdescription) {
		_projectdescription = projectdescription;
	}

	public String getSponsor() {
		return _sponsor;
	}

	public void setSponsor(String sponsor) {
		_sponsor = sponsor;
	}

	public String getRequiredSkills() {
		return _requiredSkills;
	}

	public void setRequiredSkills(String requiredSkills) {
		_requiredSkills = requiredSkills;
	}

	public String getContact() {
		return _contact;
	}

	public void setContact(String contact) {
		_contact = contact;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getLink() {
		return _link;
	}

	public void setLink(String link) {
		_link = link;
	}

	public String getDepartments() {
		return _departments;
	}

	public void setDepartments(String departments) {
		_departments = departments;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	public Date getDateModified() {
		return _dateModified;
	}

	public void setDateModified(Date dateModified) {
		_dateModified = dateModified;
	}

	private long _projectID;
	private String _projectTitle;
	private String _projectdescription;
	private String _sponsor;
	private String _requiredSkills;
	private String _contact;
	private String _status;
	private String _link;
	private String _departments;
	private Date _dateAdded;
	private Date _dateModified;
}