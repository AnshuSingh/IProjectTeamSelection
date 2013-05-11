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

import com.asu.poly.iProjects.student.model.preferences;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the preferences service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see preferencesPersistenceImpl
 * @see preferencesUtil
 * @generated
 */
public interface preferencesPersistence extends BasePersistence<preferences> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link preferencesUtil} to access the preferences persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the preferences in the entity cache if it is enabled.
	*
	* @param preferences the preferences
	*/
	public void cacheResult(
		com.asu.poly.iProjects.student.model.preferences preferences);

	/**
	* Caches the preferenceses in the entity cache if it is enabled.
	*
	* @param preferenceses the preferenceses
	*/
	public void cacheResult(
		java.util.List<com.asu.poly.iProjects.student.model.preferences> preferenceses);

	/**
	* Creates a new preferences with the primary key. Does not add the preferences to the database.
	*
	* @param studentID the primary key for the new preferences
	* @return the new preferences
	*/
	public com.asu.poly.iProjects.student.model.preferences create(
		long studentID);

	/**
	* Removes the preferences with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param studentID the primary key of the preferences
	* @return the preferences that was removed
	* @throws com.asu.poly.iProjects.student.NoSuchpreferencesException if a preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.preferences remove(
		long studentID)
		throws com.asu.poly.iProjects.student.NoSuchpreferencesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.asu.poly.iProjects.student.model.preferences updateImpl(
		com.asu.poly.iProjects.student.model.preferences preferences,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the preferences with the primary key or throws a {@link com.asu.poly.iProjects.student.NoSuchpreferencesException} if it could not be found.
	*
	* @param studentID the primary key of the preferences
	* @return the preferences
	* @throws com.asu.poly.iProjects.student.NoSuchpreferencesException if a preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.preferences findByPrimaryKey(
		long studentID)
		throws com.asu.poly.iProjects.student.NoSuchpreferencesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the preferences with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param studentID the primary key of the preferences
	* @return the preferences, or <code>null</code> if a preferences with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.asu.poly.iProjects.student.model.preferences fetchByPrimaryKey(
		long studentID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the preferenceses.
	*
	* @return the preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.poly.iProjects.student.model.preferences> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.asu.poly.iProjects.student.model.preferences> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the preferenceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of preferenceses
	* @param end the upper bound of the range of preferenceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.asu.poly.iProjects.student.model.preferences> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the preferenceses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of preferenceses.
	*
	* @return the number of preferenceses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}