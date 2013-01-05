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

package com.viewiProject.servicelayer.service.base;

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

import com.viewiProject.servicelayer.model.Projectdetail;
import com.viewiProject.servicelayer.service.ProjectdetailLocalService;
import com.viewiProject.servicelayer.service.ProjectdetailService;
import com.viewiProject.servicelayer.service.persistence.ProjectdetailPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the projectdetail local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.viewiProject.servicelayer.service.impl.ProjectdetailLocalServiceImpl}.
 * </p>
 *
 * @author Shruthi
 * @see com.viewiProject.servicelayer.service.impl.ProjectdetailLocalServiceImpl
 * @see com.viewiProject.servicelayer.service.ProjectdetailLocalServiceUtil
 * @generated
 */
public abstract class ProjectdetailLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements ProjectdetailLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.viewiProject.servicelayer.service.ProjectdetailLocalServiceUtil} to access the projectdetail local service.
	 */

	/**
	 * Adds the projectdetail to the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectdetail the projectdetail
	 * @return the projectdetail that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Projectdetail addProjectdetail(Projectdetail projectdetail)
		throws SystemException {
		projectdetail.setNew(true);

		return projectdetailPersistence.update(projectdetail, false);
	}

	/**
	 * Creates a new projectdetail with the primary key. Does not add the projectdetail to the database.
	 *
	 * @param projectId the primary key for the new projectdetail
	 * @return the new projectdetail
	 */
	public Projectdetail createProjectdetail(long projectId) {
		return projectdetailPersistence.create(projectId);
	}

	/**
	 * Deletes the projectdetail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectId the primary key of the projectdetail
	 * @return the projectdetail that was removed
	 * @throws PortalException if a projectdetail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Projectdetail deleteProjectdetail(long projectId)
		throws PortalException, SystemException {
		return projectdetailPersistence.remove(projectId);
	}

	/**
	 * Deletes the projectdetail from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projectdetail the projectdetail
	 * @return the projectdetail that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Projectdetail deleteProjectdetail(Projectdetail projectdetail)
		throws SystemException {
		return projectdetailPersistence.remove(projectdetail);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Projectdetail.class,
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
		return projectdetailPersistence.findWithDynamicQuery(dynamicQuery);
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
		return projectdetailPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
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
		return projectdetailPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return projectdetailPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public Projectdetail fetchProjectdetail(long projectId)
		throws SystemException {
		return projectdetailPersistence.fetchByPrimaryKey(projectId);
	}

	/**
	 * Returns the projectdetail with the primary key.
	 *
	 * @param projectId the primary key of the projectdetail
	 * @return the projectdetail
	 * @throws PortalException if a projectdetail with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Projectdetail getProjectdetail(long projectId)
		throws PortalException, SystemException {
		return projectdetailPersistence.findByPrimaryKey(projectId);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return projectdetailPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the projectdetails.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of projectdetails
	 * @param end the upper bound of the range of projectdetails (not inclusive)
	 * @return the range of projectdetails
	 * @throws SystemException if a system exception occurred
	 */
	public List<Projectdetail> getProjectdetails(int start, int end)
		throws SystemException {
		return projectdetailPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of projectdetails.
	 *
	 * @return the number of projectdetails
	 * @throws SystemException if a system exception occurred
	 */
	public int getProjectdetailsCount() throws SystemException {
		return projectdetailPersistence.countAll();
	}

	/**
	 * Updates the projectdetail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param projectdetail the projectdetail
	 * @return the projectdetail that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Projectdetail updateProjectdetail(Projectdetail projectdetail)
		throws SystemException {
		return updateProjectdetail(projectdetail, true);
	}

	/**
	 * Updates the projectdetail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param projectdetail the projectdetail
	 * @param merge whether to merge the projectdetail with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the projectdetail that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Projectdetail updateProjectdetail(Projectdetail projectdetail,
		boolean merge) throws SystemException {
		projectdetail.setNew(false);

		return projectdetailPersistence.update(projectdetail, merge);
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
		PersistedModelLocalServiceRegistryUtil.register("com.viewiProject.servicelayer.model.Projectdetail",
			projectdetailLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.viewiProject.servicelayer.model.Projectdetail");
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
		return Projectdetail.class;
	}

	protected String getModelClassName() {
		return Projectdetail.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = projectdetailPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = ProjectdetailLocalService.class)
	protected ProjectdetailLocalService projectdetailLocalService;
	@BeanReference(type = ProjectdetailService.class)
	protected ProjectdetailService projectdetailService;
	@BeanReference(type = ProjectdetailPersistence.class)
	protected ProjectdetailPersistence projectdetailPersistence;
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
	private ProjectdetailLocalServiceClpInvoker _clpInvoker = new ProjectdetailLocalServiceClpInvoker();
}