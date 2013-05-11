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

package com.asu.poly.iProjects.student.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link preferencesLocalService}.
 * </p>
 *
 * @author    Shruthi
 * @see       preferencesLocalService
 * @generated
 */
public class preferencesLocalServiceWrapper implements preferencesLocalService,
	ServiceWrapper<preferencesLocalService> {
	public preferencesLocalServiceWrapper(
		preferencesLocalService preferencesLocalService) {
		_preferencesLocalService = preferencesLocalService;
	}

	/**
	* Adds the preferences to the database. Also notifies the appropriate model listeners.
	*
	* @param preferences the preferences
	* @return the preferences that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.preferences addpreferences(
		com.asu.poly.iProjects.student.model.preferences preferences)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.addpreferences(preferences);
	}

	/**
	* Creates a new preferences with the primary key. Does not add the preferences to the database.
	*
	* @param studentID the primary key for the new preferences
	* @return the new preferences
	*/
	public com.asu.poly.iProjects.student.model.preferences createpreferences(
		long studentID) {
		return _preferencesLocalService.createpreferences(studentID);
	}

	/**
	* Deletes the preferences with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentID the primary key of the preferences
	* @return the preferences that was removed
	* @throws PortalException if a preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.preferences deletepreferences(
		long studentID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.deletepreferences(studentID);
	}

	/**
	* Deletes the preferences from the database. Also notifies the appropriate model listeners.
	*
	* @param preferences the preferences
	* @return the preferences that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.preferences deletepreferences(
		com.asu.poly.iProjects.student.model.preferences preferences)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.deletepreferences(preferences);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _preferencesLocalService.dynamicQuery();
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
		return _preferencesLocalService.dynamicQuery(dynamicQuery);
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
		return _preferencesLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _preferencesLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _preferencesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.asu.poly.iProjects.student.model.preferences fetchpreferences(
		long studentID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.fetchpreferences(studentID);
	}

	/**
	* Returns the preferences with the primary key.
	*
	* @param studentID the primary key of the preferences
	* @return the preferences
	* @throws PortalException if a preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.preferences getpreferences(
		long studentID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.getpreferences(studentID);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the preferenceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of preferenceses
	* @param end the upper bound of the range of preferenceses (not inclusive)
	* @return the range of preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.poly.iProjects.student.model.preferences> getpreferenceses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.getpreferenceses(start, end);
	}

	/**
	* Returns the number of preferenceses.
	*
	* @return the number of preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public int getpreferencesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.getpreferencesesCount();
	}

	/**
	* Updates the preferences in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param preferences the preferences
	* @return the preferences that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.preferences updatepreferences(
		com.asu.poly.iProjects.student.model.preferences preferences)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.updatepreferences(preferences);
	}

	/**
	* Updates the preferences in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param preferences the preferences
	* @param merge whether to merge the preferences with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the preferences that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.preferences updatepreferences(
		com.asu.poly.iProjects.student.model.preferences preferences,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _preferencesLocalService.updatepreferences(preferences, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _preferencesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_preferencesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _preferencesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public preferencesLocalService getWrappedpreferencesLocalService() {
		return _preferencesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedpreferencesLocalService(
		preferencesLocalService preferencesLocalService) {
		_preferencesLocalService = preferencesLocalService;
	}

	public preferencesLocalService getWrappedService() {
		return _preferencesLocalService;
	}

	public void setWrappedService(
		preferencesLocalService preferencesLocalService) {
		_preferencesLocalService = preferencesLocalService;
	}

	private preferencesLocalService _preferencesLocalService;
}