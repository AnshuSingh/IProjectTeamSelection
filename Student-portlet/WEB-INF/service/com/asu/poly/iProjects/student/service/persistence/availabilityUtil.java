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

package com.asu.poly.iProjects.student.service.persistence;

import com.asu.poly.iProjects.student.model.availability;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the availability service. This utility wraps {@link availabilityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see availabilityPersistence
 * @see availabilityPersistenceImpl
 * @generated
 */
public class availabilityUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(availability availability) {
		getPersistence().clearCache(availability);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<availability> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<availability> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<availability> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static availability update(availability availability, boolean merge)
		throws SystemException {
		return getPersistence().update(availability, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static availability update(availability availability, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(availability, merge, serviceContext);
	}

	/**
	* Caches the availability in the entity cache if it is enabled.
	*
	* @param availability the availability
	*/
	public static void cacheResult(
		com.asu.poly.iProjects.student.model.availability availability) {
		getPersistence().cacheResult(availability);
	}

	/**
	* Caches the availabilities in the entity cache if it is enabled.
	*
	* @param availabilities the availabilities
	*/
	public static void cacheResult(
		java.util.List<com.asu.poly.iProjects.student.model.availability> availabilities) {
		getPersistence().cacheResult(availabilities);
	}

	/**
	* Creates a new availability with the primary key. Does not add the availability to the database.
	*
	* @param studentid the primary key for the new availability
	* @return the new availability
	*/
	public static com.asu.poly.iProjects.student.model.availability create(
		long studentid) {
		return getPersistence().create(studentid);
	}

	/**
	* Removes the availability with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentid the primary key of the availability
	* @return the availability that was removed
	* @throws com.asu.poly.iProjects.student.NoSuchavailabilityException if a availability with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.iProjects.student.model.availability remove(
		long studentid)
		throws com.asu.poly.iProjects.student.NoSuchavailabilityException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(studentid);
	}

	public static com.asu.poly.iProjects.student.model.availability updateImpl(
		com.asu.poly.iProjects.student.model.availability availability,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(availability, merge);
	}

	/**
	* Returns the availability with the primary key or throws a {@link com.asu.poly.iProjects.student.NoSuchavailabilityException} if it could not be found.
	*
	* @param studentid the primary key of the availability
	* @return the availability
	* @throws com.asu.poly.iProjects.student.NoSuchavailabilityException if a availability with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.iProjects.student.model.availability findByPrimaryKey(
		long studentid)
		throws com.asu.poly.iProjects.student.NoSuchavailabilityException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(studentid);
	}

	/**
	* Returns the availability with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentid the primary key of the availability
	* @return the availability, or <code>null</code> if a availability with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.iProjects.student.model.availability fetchByPrimaryKey(
		long studentid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(studentid);
	}

	/**
	* Returns all the availabilities.
	*
	* @return the availabilities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.iProjects.student.model.availability> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.asu.poly.iProjects.student.model.availability> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the availabilities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of availabilities
	* @param end the upper bound of the range of availabilities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of availabilities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.iProjects.student.model.availability> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the availabilities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of availabilities.
	*
	* @return the number of availabilities
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static availabilityPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (availabilityPersistence)PortletBeanLocatorUtil.locate(com.asu.poly.iProjects.student.service.ClpSerializer.getServletContextName(),
					availabilityPersistence.class.getName());

			ReferenceRegistry.registerReference(availabilityUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(availabilityPersistence persistence) {
	}

	private static availabilityPersistence _persistence;
}