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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the availability service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see availabilityPersistenceImpl
 * @see availabilityUtil
 * @generated
 */
public interface availabilityPersistence extends BasePersistence<availability> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link availabilityUtil} to access the availability persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the availability in the entity cache if it is enabled.
	*
	* @param availability the availability
	*/
	public void cacheResult(
		com.asu.poly.iProjects.student.model.availability availability);

	/**
	* Caches the availabilities in the entity cache if it is enabled.
	*
	* @param availabilities the availabilities
	*/
	public void cacheResult(
		java.util.List<com.asu.poly.iProjects.student.model.availability> availabilities);

	/**
	* Creates a new availability with the primary key. Does not add the availability to the database.
	*
	* @param studentid the primary key for the new availability
	* @return the new availability
	*/
	public com.asu.poly.iProjects.student.model.availability create(
		long studentid);

	/**
	* Removes the availability with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentid the primary key of the availability
	* @return the availability that was removed
	* @throws com.asu.poly.iProjects.student.NoSuchavailabilityException if a availability with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.availability remove(
		long studentid)
		throws com.asu.poly.iProjects.student.NoSuchavailabilityException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.asu.poly.iProjects.student.model.availability updateImpl(
		com.asu.poly.iProjects.student.model.availability availability,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the availability with the primary key or throws a {@link com.asu.poly.iProjects.student.NoSuchavailabilityException} if it could not be found.
	*
	* @param studentid the primary key of the availability
	* @return the availability
	* @throws com.asu.poly.iProjects.student.NoSuchavailabilityException if a availability with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.availability findByPrimaryKey(
		long studentid)
		throws com.asu.poly.iProjects.student.NoSuchavailabilityException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the availability with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentid the primary key of the availability
	* @return the availability, or <code>null</code> if a availability with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.availability fetchByPrimaryKey(
		long studentid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the availabilities.
	*
	* @return the availabilities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.poly.iProjects.student.model.availability> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.asu.poly.iProjects.student.model.availability> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.asu.poly.iProjects.student.model.availability> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the availabilities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of availabilities.
	*
	* @return the number of availabilities
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}