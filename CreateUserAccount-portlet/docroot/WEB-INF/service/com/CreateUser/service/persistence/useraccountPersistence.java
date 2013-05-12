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

package com.CreateUser.service.persistence;

import com.CreateUser.model.useraccount;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the useraccount service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see useraccountPersistenceImpl
 * @see useraccountUtil
 * @generated
 */
public interface useraccountPersistence extends BasePersistence<useraccount> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link useraccountUtil} to access the useraccount persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the useraccount in the entity cache if it is enabled.
	*
	* @param useraccount the useraccount
	*/
	public void cacheResult(com.CreateUser.model.useraccount useraccount);

	/**
	* Caches the useraccounts in the entity cache if it is enabled.
	*
	* @param useraccounts the useraccounts
	*/
	public void cacheResult(
		java.util.List<com.CreateUser.model.useraccount> useraccounts);

	/**
	* Creates a new useraccount with the primary key. Does not add the useraccount to the database.
	*
	* @param useraccountId the primary key for the new useraccount
	* @return the new useraccount
	*/
	public com.CreateUser.model.useraccount create(long useraccountId);

	/**
	* Removes the useraccount with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param useraccountId the primary key of the useraccount
	* @return the useraccount that was removed
	* @throws com.CreateUser.NoSuchuseraccountException if a useraccount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.CreateUser.model.useraccount remove(long useraccountId)
		throws com.CreateUser.NoSuchuseraccountException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.CreateUser.model.useraccount updateImpl(
		com.CreateUser.model.useraccount useraccount, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the useraccount with the primary key or throws a {@link com.CreateUser.NoSuchuseraccountException} if it could not be found.
	*
	* @param useraccountId the primary key of the useraccount
	* @return the useraccount
	* @throws com.CreateUser.NoSuchuseraccountException if a useraccount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.CreateUser.model.useraccount findByPrimaryKey(long useraccountId)
		throws com.CreateUser.NoSuchuseraccountException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the useraccount with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param useraccountId the primary key of the useraccount
	* @return the useraccount, or <code>null</code> if a useraccount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.CreateUser.model.useraccount fetchByPrimaryKey(
		long useraccountId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the useraccounts.
	*
	* @return the useraccounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.CreateUser.model.useraccount> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the useraccounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of useraccounts
	* @param end the upper bound of the range of useraccounts (not inclusive)
	* @return the range of useraccounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.CreateUser.model.useraccount> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the useraccounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of useraccounts
	* @param end the upper bound of the range of useraccounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of useraccounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.CreateUser.model.useraccount> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the useraccounts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of useraccounts.
	*
	* @return the number of useraccounts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}