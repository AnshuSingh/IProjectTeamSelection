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

package com.asu.poly.teams.manualSelect.slayer.service.base;

import com.asu.poly.teams.manualSelect.slayer.model.preferences;
import com.asu.poly.teams.manualSelect.slayer.service.FacultyLocalService;
import com.asu.poly.teams.manualSelect.slayer.service.FacultyService;
import com.asu.poly.teams.manualSelect.slayer.service.ProjectdetailLocalService;
import com.asu.poly.teams.manualSelect.slayer.service.ProjectdetailService;
import com.asu.poly.teams.manualSelect.slayer.service.SkillsetLocalService;
import com.asu.poly.teams.manualSelect.slayer.service.SkillsetService;
import com.asu.poly.teams.manualSelect.slayer.service.StudentLocalService;
import com.asu.poly.teams.manualSelect.slayer.service.StudentService;
import com.asu.poly.teams.manualSelect.slayer.service.TeamLocalService;
import com.asu.poly.teams.manualSelect.slayer.service.TeamService;
import com.asu.poly.teams.manualSelect.slayer.service.persistence.FacultyPersistence;
import com.asu.poly.teams.manualSelect.slayer.service.persistence.ProjectdetailPersistence;
import com.asu.poly.teams.manualSelect.slayer.service.persistence.SkillsetPersistence;
import com.asu.poly.teams.manualSelect.slayer.service.persistence.StudentPersistence;
import com.asu.poly.teams.manualSelect.slayer.service.persistence.TeamPersistence;
import com.asu.poly.teams.manualSelect.slayer.service.persistence.preferencesPersistence;
import com.asu.poly.teams.manualSelect.slayer.service.preferencesLocalService;
import com.asu.poly.teams.manualSelect.slayer.service.preferencesService;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the preferences remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.asu.poly.teams.manualSelect.slayer.service.impl.preferencesServiceImpl}.
 * </p>
 *
 * @author Eshwari
 * @see com.asu.poly.teams.manualSelect.slayer.service.impl.preferencesServiceImpl
 * @see com.asu.poly.teams.manualSelect.slayer.service.preferencesServiceUtil
 * @generated
 */
public abstract class preferencesServiceBaseImpl extends BaseServiceImpl
	implements preferencesService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.asu.poly.teams.manualSelect.slayer.service.preferencesServiceUtil} to access the preferences remote service.
	 */

	/**
	 * Returns the faculty local service.
	 *
	 * @return the faculty local service
	 */
	public FacultyLocalService getFacultyLocalService() {
		return facultyLocalService;
	}

	/**
	 * Sets the faculty local service.
	 *
	 * @param facultyLocalService the faculty local service
	 */
	public void setFacultyLocalService(FacultyLocalService facultyLocalService) {
		this.facultyLocalService = facultyLocalService;
	}

	/**
	 * Returns the faculty remote service.
	 *
	 * @return the faculty remote service
	 */
	public FacultyService getFacultyService() {
		return facultyService;
	}

	/**
	 * Sets the faculty remote service.
	 *
	 * @param facultyService the faculty remote service
	 */
	public void setFacultyService(FacultyService facultyService) {
		this.facultyService = facultyService;
	}

	/**
	 * Returns the faculty persistence.
	 *
	 * @return the faculty persistence
	 */
	public FacultyPersistence getFacultyPersistence() {
		return facultyPersistence;
	}

	/**
	 * Sets the faculty persistence.
	 *
	 * @param facultyPersistence the faculty persistence
	 */
	public void setFacultyPersistence(FacultyPersistence facultyPersistence) {
		this.facultyPersistence = facultyPersistence;
	}

	/**
	 * Returns the preferences local service.
	 *
	 * @return the preferences local service
	 */
	public preferencesLocalService getpreferencesLocalService() {
		return preferencesLocalService;
	}

	/**
	 * Sets the preferences local service.
	 *
	 * @param preferencesLocalService the preferences local service
	 */
	public void setpreferencesLocalService(
		preferencesLocalService preferencesLocalService) {
		this.preferencesLocalService = preferencesLocalService;
	}

	/**
	 * Returns the preferences remote service.
	 *
	 * @return the preferences remote service
	 */
	public preferencesService getpreferencesService() {
		return preferencesService;
	}

	/**
	 * Sets the preferences remote service.
	 *
	 * @param preferencesService the preferences remote service
	 */
	public void setpreferencesService(preferencesService preferencesService) {
		this.preferencesService = preferencesService;
	}

	/**
	 * Returns the preferences persistence.
	 *
	 * @return the preferences persistence
	 */
	public preferencesPersistence getpreferencesPersistence() {
		return preferencesPersistence;
	}

	/**
	 * Sets the preferences persistence.
	 *
	 * @param preferencesPersistence the preferences persistence
	 */
	public void setpreferencesPersistence(
		preferencesPersistence preferencesPersistence) {
		this.preferencesPersistence = preferencesPersistence;
	}

	/**
	 * Returns the projectdetail local service.
	 *
	 * @return the projectdetail local service
	 */
	public ProjectdetailLocalService getProjectdetailLocalService() {
		return projectdetailLocalService;
	}

	/**
	 * Sets the projectdetail local service.
	 *
	 * @param projectdetailLocalService the projectdetail local service
	 */
	public void setProjectdetailLocalService(
		ProjectdetailLocalService projectdetailLocalService) {
		this.projectdetailLocalService = projectdetailLocalService;
	}

	/**
	 * Returns the projectdetail remote service.
	 *
	 * @return the projectdetail remote service
	 */
	public ProjectdetailService getProjectdetailService() {
		return projectdetailService;
	}

	/**
	 * Sets the projectdetail remote service.
	 *
	 * @param projectdetailService the projectdetail remote service
	 */
	public void setProjectdetailService(
		ProjectdetailService projectdetailService) {
		this.projectdetailService = projectdetailService;
	}

	/**
	 * Returns the projectdetail persistence.
	 *
	 * @return the projectdetail persistence
	 */
	public ProjectdetailPersistence getProjectdetailPersistence() {
		return projectdetailPersistence;
	}

	/**
	 * Sets the projectdetail persistence.
	 *
	 * @param projectdetailPersistence the projectdetail persistence
	 */
	public void setProjectdetailPersistence(
		ProjectdetailPersistence projectdetailPersistence) {
		this.projectdetailPersistence = projectdetailPersistence;
	}

	/**
	 * Returns the skillset local service.
	 *
	 * @return the skillset local service
	 */
	public SkillsetLocalService getSkillsetLocalService() {
		return skillsetLocalService;
	}

	/**
	 * Sets the skillset local service.
	 *
	 * @param skillsetLocalService the skillset local service
	 */
	public void setSkillsetLocalService(
		SkillsetLocalService skillsetLocalService) {
		this.skillsetLocalService = skillsetLocalService;
	}

	/**
	 * Returns the skillset remote service.
	 *
	 * @return the skillset remote service
	 */
	public SkillsetService getSkillsetService() {
		return skillsetService;
	}

	/**
	 * Sets the skillset remote service.
	 *
	 * @param skillsetService the skillset remote service
	 */
	public void setSkillsetService(SkillsetService skillsetService) {
		this.skillsetService = skillsetService;
	}

	/**
	 * Returns the skillset persistence.
	 *
	 * @return the skillset persistence
	 */
	public SkillsetPersistence getSkillsetPersistence() {
		return skillsetPersistence;
	}

	/**
	 * Sets the skillset persistence.
	 *
	 * @param skillsetPersistence the skillset persistence
	 */
	public void setSkillsetPersistence(SkillsetPersistence skillsetPersistence) {
		this.skillsetPersistence = skillsetPersistence;
	}

	/**
	 * Returns the student local service.
	 *
	 * @return the student local service
	 */
	public StudentLocalService getStudentLocalService() {
		return studentLocalService;
	}

	/**
	 * Sets the student local service.
	 *
	 * @param studentLocalService the student local service
	 */
	public void setStudentLocalService(StudentLocalService studentLocalService) {
		this.studentLocalService = studentLocalService;
	}

	/**
	 * Returns the student remote service.
	 *
	 * @return the student remote service
	 */
	public StudentService getStudentService() {
		return studentService;
	}

	/**
	 * Sets the student remote service.
	 *
	 * @param studentService the student remote service
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	/**
	 * Returns the student persistence.
	 *
	 * @return the student persistence
	 */
	public StudentPersistence getStudentPersistence() {
		return studentPersistence;
	}

	/**
	 * Sets the student persistence.
	 *
	 * @param studentPersistence the student persistence
	 */
	public void setStudentPersistence(StudentPersistence studentPersistence) {
		this.studentPersistence = studentPersistence;
	}

	/**
	 * Returns the team local service.
	 *
	 * @return the team local service
	 */
	public TeamLocalService getTeamLocalService() {
		return teamLocalService;
	}

	/**
	 * Sets the team local service.
	 *
	 * @param teamLocalService the team local service
	 */
	public void setTeamLocalService(TeamLocalService teamLocalService) {
		this.teamLocalService = teamLocalService;
	}

	/**
	 * Returns the team remote service.
	 *
	 * @return the team remote service
	 */
	public TeamService getTeamService() {
		return teamService;
	}

	/**
	 * Sets the team remote service.
	 *
	 * @param teamService the team remote service
	 */
	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}

	/**
	 * Returns the team persistence.
	 *
	 * @return the team persistence
	 */
	public TeamPersistence getTeamPersistence() {
		return teamPersistence;
	}

	/**
	 * Sets the team persistence.
	 *
	 * @param teamPersistence the team persistence
	 */
	public void setTeamPersistence(TeamPersistence teamPersistence) {
		this.teamPersistence = teamPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return preferences.class;
	}

	protected String getModelClassName() {
		return preferences.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = preferencesPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = FacultyLocalService.class)
	protected FacultyLocalService facultyLocalService;
	@BeanReference(type = FacultyService.class)
	protected FacultyService facultyService;
	@BeanReference(type = FacultyPersistence.class)
	protected FacultyPersistence facultyPersistence;
	@BeanReference(type = preferencesLocalService.class)
	protected preferencesLocalService preferencesLocalService;
	@BeanReference(type = preferencesService.class)
	protected preferencesService preferencesService;
	@BeanReference(type = preferencesPersistence.class)
	protected preferencesPersistence preferencesPersistence;
	@BeanReference(type = ProjectdetailLocalService.class)
	protected ProjectdetailLocalService projectdetailLocalService;
	@BeanReference(type = ProjectdetailService.class)
	protected ProjectdetailService projectdetailService;
	@BeanReference(type = ProjectdetailPersistence.class)
	protected ProjectdetailPersistence projectdetailPersistence;
	@BeanReference(type = SkillsetLocalService.class)
	protected SkillsetLocalService skillsetLocalService;
	@BeanReference(type = SkillsetService.class)
	protected SkillsetService skillsetService;
	@BeanReference(type = SkillsetPersistence.class)
	protected SkillsetPersistence skillsetPersistence;
	@BeanReference(type = StudentLocalService.class)
	protected StudentLocalService studentLocalService;
	@BeanReference(type = StudentService.class)
	protected StudentService studentService;
	@BeanReference(type = StudentPersistence.class)
	protected StudentPersistence studentPersistence;
	@BeanReference(type = TeamLocalService.class)
	protected TeamLocalService teamLocalService;
	@BeanReference(type = TeamService.class)
	protected TeamService teamService;
	@BeanReference(type = TeamPersistence.class)
	protected TeamPersistence teamPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private preferencesServiceClpInvoker _clpInvoker = new preferencesServiceClpInvoker();
}