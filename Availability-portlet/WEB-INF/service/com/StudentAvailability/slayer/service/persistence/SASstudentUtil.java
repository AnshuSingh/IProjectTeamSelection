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

package com.StudentAvailability.slayer.service.persistence;

import com.StudentAvailability.slayer.model.SASstudent;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the s a sstudent service. This utility wraps {@link SASstudentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Purva
 * @see SASstudentPersistence
 * @see SASstudentPersistenceImpl
 * @generated
 */
public class SASstudentUtil {
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
	public static void clearCache(SASstudent saSstudent) {
		getPersistence().clearCache(saSstudent);
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
	public static List<SASstudent> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SASstudent> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SASstudent> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static SASstudent update(SASstudent saSstudent, boolean merge)
		throws SystemException {
		return getPersistence().update(saSstudent, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static SASstudent update(SASstudent saSstudent, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(saSstudent, merge, serviceContext);
	}

	/**
	* Caches the s a sstudent in the entity cache if it is enabled.
	*
	* @param saSstudent the s a sstudent
	*/
	public static void cacheResult(
		com.StudentAvailability.slayer.model.SASstudent saSstudent) {
		getPersistence().cacheResult(saSstudent);
	}

	/**
	* Caches the s a sstudents in the entity cache if it is enabled.
	*
	* @param saSstudents the s a sstudents
	*/
	public static void cacheResult(
		java.util.List<com.StudentAvailability.slayer.model.SASstudent> saSstudents) {
		getPersistence().cacheResult(saSstudents);
	}

	/**
	* Creates a new s a sstudent with the primary key. Does not add the s a sstudent to the database.
	*
	* @param studentid the primary key for the new s a sstudent
	* @return the new s a sstudent
	*/
	public static com.StudentAvailability.slayer.model.SASstudent create(
		long studentid) {
		return getPersistence().create(studentid);
	}

	/**
	* Removes the s a sstudent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentid the primary key of the s a sstudent
	* @return the s a sstudent that was removed
	* @throws com.StudentAvailability.slayer.NoSuchstudentException if a s a sstudent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.StudentAvailability.slayer.model.SASstudent remove(
		long studentid)
		throws com.StudentAvailability.slayer.NoSuchstudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(studentid);
	}

	public static com.StudentAvailability.slayer.model.SASstudent updateImpl(
		com.StudentAvailability.slayer.model.SASstudent saSstudent,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(saSstudent, merge);
	}

	/**
	* Returns the s a sstudent with the primary key or throws a {@link com.StudentAvailability.slayer.NoSuchstudentException} if it could not be found.
	*
	* @param studentid the primary key of the s a sstudent
	* @return the s a sstudent
	* @throws com.StudentAvailability.slayer.NoSuchstudentException if a s a sstudent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.StudentAvailability.slayer.model.SASstudent findByPrimaryKey(
		long studentid)
		throws com.StudentAvailability.slayer.NoSuchstudentException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(studentid);
	}

	/**
	* Returns the s a sstudent with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentid the primary key of the s a sstudent
	* @return the s a sstudent, or <code>null</code> if a s a sstudent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.StudentAvailability.slayer.model.SASstudent fetchByPrimaryKey(
		long studentid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(studentid);
	}

	/**
	* Returns all the s a sstudents.
	*
	* @return the s a sstudents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.StudentAvailability.slayer.model.SASstudent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the s a sstudents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a sstudents
	* @param end the upper bound of the range of s a sstudents (not inclusive)
	* @return the range of s a sstudents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.StudentAvailability.slayer.model.SASstudent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the s a sstudents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of s a sstudents
	* @param end the upper bound of the range of s a sstudents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of s a sstudents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.StudentAvailability.slayer.model.SASstudent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the s a sstudents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of s a sstudents.
	*
	* @return the number of s a sstudents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SASstudentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SASstudentPersistence)PortletBeanLocatorUtil.locate(com.StudentAvailability.slayer.service.ClpSerializer.getServletContextName(),
					SASstudentPersistence.class.getName());

			ReferenceRegistry.registerReference(SASstudentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(SASstudentPersistence persistence) {
	}

	private static SASstudentPersistence _persistence;
}