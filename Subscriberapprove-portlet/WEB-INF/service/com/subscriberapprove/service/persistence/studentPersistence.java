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

package com.subscriberapprove.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.subscriberapprove.model.student;

/**
 * The persistence interface for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see studentPersistenceImpl
 * @see studentUtil
 * @generated
 */
public interface studentPersistence extends BasePersistence<student> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link studentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the student in the entity cache if it is enabled.
	*
	* @param student the student
	*/
	public void cacheResult(com.subscriberapprove.model.student student);

	/**
	* Caches the students in the entity cache if it is enabled.
	*
	* @param students the students
	*/
	public void cacheResult(
		java.util.List<com.subscriberapprove.model.student> students);

	/**
	* Creates a new student with the primary key. Does not add the student to the database.
	*
	* @param studentgeninfoid the primary key for the new student
	* @return the new student
	*/
	public com.subscriberapprove.model.student create(long studentgeninfoid);

	/**
	* Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentgeninfoid the primary key of the student
	* @return the student that was removed
	* @throws com.subscriberapprove.NoSuchstudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.subscriberapprove.model.student remove(long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.subscriberapprove.NoSuchstudentException;

	public com.subscriberapprove.model.student updateImpl(
		com.subscriberapprove.model.student student, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the student with the primary key or throws a {@link com.subscriberapprove.NoSuchstudentException} if it could not be found.
	*
	* @param studentgeninfoid the primary key of the student
	* @return the student
	* @throws com.subscriberapprove.NoSuchstudentException if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.subscriberapprove.model.student findByPrimaryKey(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.subscriberapprove.NoSuchstudentException;

	/**
	* Returns the student with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentgeninfoid the primary key of the student
	* @return the student, or <code>null</code> if a student with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.subscriberapprove.model.student fetchByPrimaryKey(
		long studentgeninfoid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the students.
	*
	* @return the students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.subscriberapprove.model.student> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @return the range of students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.subscriberapprove.model.student> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the students.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of students
	* @param end the upper bound of the range of students (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of students
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.subscriberapprove.model.student> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the students from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of students.
	*
	* @return the number of students
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}