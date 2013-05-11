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
 * This class is a wrapper for {@link availabilityLocalService}.
 * </p>
 *
 * @author    Shruthi
 * @see       availabilityLocalService
 * @generated
 */
public class availabilityLocalServiceWrapper implements availabilityLocalService,
	ServiceWrapper<availabilityLocalService> {
	public availabilityLocalServiceWrapper(
		availabilityLocalService availabilityLocalService) {
		_availabilityLocalService = availabilityLocalService;
	}

	/**
	* Adds the availability to the database. Also notifies the appropriate model listeners.
	*
	* @param availability the availability
	* @return the availability that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.availability addavailability(
		com.asu.poly.iProjects.student.model.availability availability)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.addavailability(availability);
	}

	/**
	* Creates a new availability with the primary key. Does not add the availability to the database.
	*
	* @param studentid the primary key for the new availability
	* @return the new availability
	*/
	public com.asu.poly.iProjects.student.model.availability createavailability(
		long studentid) {
		return _availabilityLocalService.createavailability(studentid);
	}

	/**
	* Deletes the availability with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentid the primary key of the availability
	* @return the availability that was removed
	* @throws PortalException if a availability with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.availability deleteavailability(
		long studentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.deleteavailability(studentid);
	}

	/**
	* Deletes the availability from the database. Also notifies the appropriate model listeners.
	*
	* @param availability the availability
	* @return the availability that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.availability deleteavailability(
		com.asu.poly.iProjects.student.model.availability availability)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.deleteavailability(availability);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _availabilityLocalService.dynamicQuery();
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
		return _availabilityLocalService.dynamicQuery(dynamicQuery);
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
		return _availabilityLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _availabilityLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _availabilityLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.asu.poly.iProjects.student.model.availability fetchavailability(
		long studentid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.fetchavailability(studentid);
	}

	/**
	* Returns the availability with the primary key.
	*
	* @param studentid the primary key of the availability
	* @return the availability
	* @throws PortalException if a availability with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.availability getavailability(
		long studentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.getavailability(studentid);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the availabilities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of availabilities
	* @param end the upper bound of the range of availabilities (not inclusive)
	* @return the range of availabilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.poly.iProjects.student.model.availability> getavailabilities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.getavailabilities(start, end);
	}

	/**
	* Returns the number of availabilities.
	*
	* @return the number of availabilities
	* @throws SystemException if a system exception occurred
	*/
	public int getavailabilitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.getavailabilitiesCount();
	}

	/**
	* Updates the availability in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param availability the availability
	* @return the availability that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.availability updateavailability(
		com.asu.poly.iProjects.student.model.availability availability)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.updateavailability(availability);
	}

	/**
	* Updates the availability in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param availability the availability
	* @param merge whether to merge the availability with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the availability that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.availability updateavailability(
		com.asu.poly.iProjects.student.model.availability availability,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availabilityLocalService.updateavailability(availability, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _availabilityLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_availabilityLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _availabilityLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public availabilityLocalService getWrappedavailabilityLocalService() {
		return _availabilityLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedavailabilityLocalService(
		availabilityLocalService availabilityLocalService) {
		_availabilityLocalService = availabilityLocalService;
	}

	public availabilityLocalService getWrappedService() {
		return _availabilityLocalService;
	}

	public void setWrappedService(
		availabilityLocalService availabilityLocalService) {
		_availabilityLocalService = availabilityLocalService;
	}

	private availabilityLocalService _availabilityLocalService;
}