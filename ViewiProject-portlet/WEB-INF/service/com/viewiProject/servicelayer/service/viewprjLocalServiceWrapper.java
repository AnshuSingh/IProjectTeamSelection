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

package com.viewiProject.servicelayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link viewprjLocalService}.
 * </p>
 *
 * @author    Shruthi
 * @see       viewprjLocalService
 * @generated
 */
public class viewprjLocalServiceWrapper implements viewprjLocalService,
	ServiceWrapper<viewprjLocalService> {
	public viewprjLocalServiceWrapper(viewprjLocalService viewprjLocalService) {
		_viewprjLocalService = viewprjLocalService;
	}

	/**
	* Adds the viewprj to the database. Also notifies the appropriate model listeners.
	*
	* @param viewprj the viewprj
	* @return the viewprj that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.viewprj addviewprj(
		com.viewiProject.servicelayer.model.viewprj viewprj)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.addviewprj(viewprj);
	}

	/**
	* Creates a new viewprj with the primary key. Does not add the viewprj to the database.
	*
	* @param projectId the primary key for the new viewprj
	* @return the new viewprj
	*/
	public com.viewiProject.servicelayer.model.viewprj createviewprj(
		long projectId) {
		return _viewprjLocalService.createviewprj(projectId);
	}

	/**
	* Deletes the viewprj with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the viewprj
	* @return the viewprj that was removed
	* @throws PortalException if a viewprj with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.viewprj deleteviewprj(
		long projectId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.deleteviewprj(projectId);
	}

	/**
	* Deletes the viewprj from the database. Also notifies the appropriate model listeners.
	*
	* @param viewprj the viewprj
	* @return the viewprj that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.viewprj deleteviewprj(
		com.viewiProject.servicelayer.model.viewprj viewprj)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.deleteviewprj(viewprj);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _viewprjLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.viewiProject.servicelayer.model.viewprj fetchviewprj(
		long projectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.fetchviewprj(projectId);
	}

	/**
	* Returns the viewprj with the primary key.
	*
	* @param projectId the primary key of the viewprj
	* @return the viewprj
	* @throws PortalException if a viewprj with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.viewprj getviewprj(
		long projectId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.getviewprj(projectId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the viewprjs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of viewprjs
	* @param end the upper bound of the range of viewprjs (not inclusive)
	* @return the range of viewprjs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.viewiProject.servicelayer.model.viewprj> getviewprjs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.getviewprjs(start, end);
	}

	/**
	* Returns the number of viewprjs.
	*
	* @return the number of viewprjs
	* @throws SystemException if a system exception occurred
	*/
	public int getviewprjsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.getviewprjsCount();
	}

	/**
	* Updates the viewprj in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param viewprj the viewprj
	* @return the viewprj that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.viewprj updateviewprj(
		com.viewiProject.servicelayer.model.viewprj viewprj)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.updateviewprj(viewprj);
	}

	/**
	* Updates the viewprj in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param viewprj the viewprj
	* @param merge whether to merge the viewprj with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the viewprj that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.viewiProject.servicelayer.model.viewprj updateviewprj(
		com.viewiProject.servicelayer.model.viewprj viewprj, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewprjLocalService.updateviewprj(viewprj, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _viewprjLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_viewprjLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _viewprjLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public viewprjLocalService getWrappedviewprjLocalService() {
		return _viewprjLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedviewprjLocalService(
		viewprjLocalService viewprjLocalService) {
		_viewprjLocalService = viewprjLocalService;
	}

	public viewprjLocalService getWrappedService() {
		return _viewprjLocalService;
	}

	public void setWrappedService(viewprjLocalService viewprjLocalService) {
		_viewprjLocalService = viewprjLocalService;
	}

	private viewprjLocalService _viewprjLocalService;
}