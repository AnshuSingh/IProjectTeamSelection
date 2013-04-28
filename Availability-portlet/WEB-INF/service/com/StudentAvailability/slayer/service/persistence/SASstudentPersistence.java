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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the s a sstudent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Purva
 * @see SASstudentPersistenceImpl
 * @see SASstudentUtil
 * @generated
 */
public interface SASstudentPersistence extends BasePersistence<SASstudent> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SASstudentUtil} to access the s a sstudent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the s a sstudent in the entity cache if it is enabled.
	*
	* @param saSstudent the s a sstudent
	*/
	public void cacheResult(
		com.StudentAvailability.slayer.model.SASstudent saSstudent);

	/**
	* Caches the s a sstudents in the entity cache if it is enabled.
	*
	* @param saSstudents the s a sstudents
	*/
	public void cacheResult(
		java.util.List<com.StudentAvailability.slayer.model.SASstudent> saSstudents);

	/**
	* Creates a new s a sstudent with the primary key. Does not add the s a sstudent to the database.
	*
	* @param studentid the primary key for the new s a sstudent
	* @return the new s a sstudent
	*/
	public com.StudentAvailability.slayer.model.SASstudent create(
		long studentid);

	/**
	* Removes the s a sstudent with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentid the primary key of the s a sstudent
	* @return the s a sstudent that was removed
	* @throws com.StudentAvailability.slayer.NoSuchstudentException if a s a sstudent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.StudentAvailability.slayer.model.SASstudent remove(
		long studentid)
		throws com.StudentAvailability.slayer.NoSuchstudentException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.StudentAvailability.slayer.model.SASstudent updateImpl(
		com.StudentAvailability.slayer.model.SASstudent saSstudent,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s a sstudent with the primary key or throws a {@link com.StudentAvailability.slayer.NoSuchstudentException} if it could not be found.
	*
	* @param studentid the primary key of the s a sstudent
	* @return the s a sstudent
	* @throws com.StudentAvailability.slayer.NoSuchstudentException if a s a sstudent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.StudentAvailability.slayer.model.SASstudent findByPrimaryKey(
		long studentid)
		throws com.StudentAvailability.slayer.NoSuchstudentException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the s a sstudent with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentid the primary key of the s a sstudent
	* @return the s a sstudent, or <code>null</code> if a s a sstudent with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.StudentAvailability.slayer.model.SASstudent fetchByPrimaryKey(
		long studentid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the s a sstudents.
	*
	* @return the s a sstudents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.StudentAvailability.slayer.model.SASstudent> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.StudentAvailability.slayer.model.SASstudent> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.StudentAvailability.slayer.model.SASstudent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the s a sstudents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of s a sstudents.
	*
	* @return the number of s a sstudents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}