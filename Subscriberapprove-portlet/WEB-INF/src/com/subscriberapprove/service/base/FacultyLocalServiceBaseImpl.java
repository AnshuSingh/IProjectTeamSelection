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

package com.subscriberapprove.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.subscriberapprove.model.Faculty;

import com.subscriberapprove.service.FacultyLocalService;
import com.subscriberapprove.service.FacultyService;
import com.subscriberapprove.service.persistence.FacultyPersistence;
import com.subscriberapprove.service.persistence.studentPersistence;
import com.subscriberapprove.service.studentLocalService;
import com.subscriberapprove.service.studentService;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the faculty local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.subscriberapprove.service.impl.FacultyLocalServiceImpl}.
 * </p>
 *
 * @author Shruthi
 * @see com.subscriberapprove.service.impl.FacultyLocalServiceImpl
 * @see com.subscriberapprove.service.FacultyLocalServiceUtil
 * @generated
 */
public abstract class FacultyLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements FacultyLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.subscriberapprove.service.FacultyLocalServiceUtil} to access the faculty local service.
	 */

	/**
	 * Adds the faculty to the database. Also notifies the appropriate model listeners.
	 *
	 * @param faculty the faculty
	 * @return the faculty that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Faculty addFaculty(Faculty faculty) throws SystemException {
		faculty.setNew(true);

		return facultyPersistence.update(faculty, false);
	}

	/**
	 * Creates a new faculty with the primary key. Does not add the faculty to the database.
	 *
	 * @param facultyID the primary key for the new faculty
	 * @return the new faculty
	 */
	public Faculty createFaculty(long facultyID) {
		return facultyPersistence.create(facultyID);
	}

	/**
	 * Deletes the faculty with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param facultyID the primary key of the faculty
	 * @return the faculty that was removed
	 * @throws PortalException if a faculty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Faculty deleteFaculty(long facultyID)
		throws PortalException, SystemException {
		return facultyPersistence.remove(facultyID);
	}

	/**
	 * Deletes the faculty from the database. Also notifies the appropriate model listeners.
	 *
	 * @param faculty the faculty
	 * @return the faculty that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Faculty deleteFaculty(Faculty faculty) throws SystemException {
		return facultyPersistence.remove(faculty);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Faculty.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return facultyPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return facultyPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return facultyPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return facultyPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public Faculty fetchFaculty(long facultyID) throws SystemException {
		return facultyPersistence.fetchByPrimaryKey(facultyID);
	}

	/**
	 * Returns the faculty with the primary key.
	 *
	 * @param facultyID the primary key of the faculty
	 * @return the faculty
	 * @throws PortalException if a faculty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Faculty getFaculty(long facultyID)
		throws PortalException, SystemException {
		return facultyPersistence.findByPrimaryKey(facultyID);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return facultyPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the faculties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of faculties
	 * @param end the upper bound of the range of faculties (not inclusive)
	 * @return the range of faculties
	 * @throws SystemException if a system exception occurred
	 */
	public List<Faculty> getFaculties(int start, int end)
		throws SystemException {
		return facultyPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of faculties.
	 *
	 * @return the number of faculties
	 * @throws SystemException if a system exception occurred
	 */
	public int getFacultiesCount() throws SystemException {
		return facultyPersistence.countAll();
	}

	/**
	 * Updates the faculty in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param faculty the faculty
	 * @return the faculty that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Faculty updateFaculty(Faculty faculty) throws SystemException {
		return updateFaculty(faculty, true);
	}

	/**
	 * Updates the faculty in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param faculty the faculty
	 * @param merge whether to merge the faculty with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the faculty that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Faculty updateFaculty(Faculty faculty, boolean merge)
		throws SystemException {
		faculty.setNew(false);

		return facultyPersistence.update(faculty, merge);
	}

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
	 * Returns the student local service.
	 *
	 * @return the student local service
	 */
	public studentLocalService getstudentLocalService() {
		return studentLocalService;
	}

	/**
	 * Sets the student local service.
	 *
	 * @param studentLocalService the student local service
	 */
	public void setstudentLocalService(studentLocalService studentLocalService) {
		this.studentLocalService = studentLocalService;
	}

	/**
	 * Returns the student remote service.
	 *
	 * @return the student remote service
	 */
	public studentService getstudentService() {
		return studentService;
	}

	/**
	 * Sets the student remote service.
	 *
	 * @param studentService the student remote service
	 */
	public void setstudentService(studentService studentService) {
		this.studentService = studentService;
	}

	/**
	 * Returns the student persistence.
	 *
	 * @return the student persistence
	 */
	public studentPersistence getstudentPersistence() {
		return studentPersistence;
	}

	/**
	 * Sets the student persistence.
	 *
	 * @param studentPersistence the student persistence
	 */
	public void setstudentPersistence(studentPersistence studentPersistence) {
		this.studentPersistence = studentPersistence;
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
		PersistedModelLocalServiceRegistryUtil.register("com.subscriberapprove.model.Faculty",
			facultyLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.subscriberapprove.model.Faculty");
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
		return Faculty.class;
	}

	protected String getModelClassName() {
		return Faculty.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = facultyPersistence.getDataSource();

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
	@BeanReference(type = studentLocalService.class)
	protected studentLocalService studentLocalService;
	@BeanReference(type = studentService.class)
	protected studentService studentService;
	@BeanReference(type = studentPersistence.class)
	protected studentPersistence studentPersistence;
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
	private FacultyLocalServiceClpInvoker _clpInvoker = new FacultyLocalServiceClpInvoker();
}