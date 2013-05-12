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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.subscriberapprove.model.useraccount;

import java.util.List;

/**
 * The persistence utility for the useraccount service. This utility wraps {@link useraccountPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see useraccountPersistence
 * @see useraccountPersistenceImpl
 * @generated
 */
public class useraccountUtil {
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
	public static void clearCache(useraccount useraccount) {
		getPersistence().clearCache(useraccount);
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
	public static List<useraccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<useraccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<useraccount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static useraccount update(useraccount useraccount, boolean merge)
		throws SystemException {
		return getPersistence().update(useraccount, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static useraccount update(useraccount useraccount, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(useraccount, merge, serviceContext);
	}

	/**
	* Caches the useraccount in the entity cache if it is enabled.
	*
	* @param useraccount the useraccount
	*/
	public static void cacheResult(
		com.subscriberapprove.model.useraccount useraccount) {
		getPersistence().cacheResult(useraccount);
	}

	/**
	* Caches the useraccounts in the entity cache if it is enabled.
	*
	* @param useraccounts the useraccounts
	*/
	public static void cacheResult(
		java.util.List<com.subscriberapprove.model.useraccount> useraccounts) {
		getPersistence().cacheResult(useraccounts);
	}

	/**
	* Creates a new useraccount with the primary key. Does not add the useraccount to the database.
	*
	* @param useraccountId the primary key for the new useraccount
	* @return the new useraccount
	*/
	public static com.subscriberapprove.model.useraccount create(
		long useraccountId) {
		return getPersistence().create(useraccountId);
	}

	/**
	* Removes the useraccount with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param useraccountId the primary key of the useraccount
	* @return the useraccount that was removed
	* @throws com.subscriberapprove.NoSuchuseraccountException if a useraccount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.subscriberapprove.model.useraccount remove(
		long useraccountId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.subscriberapprove.NoSuchuseraccountException {
		return getPersistence().remove(useraccountId);
	}

	public static com.subscriberapprove.model.useraccount updateImpl(
		com.subscriberapprove.model.useraccount useraccount, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(useraccount, merge);
	}

	/**
	* Returns the useraccount with the primary key or throws a {@link com.subscriberapprove.NoSuchuseraccountException} if it could not be found.
	*
	* @param useraccountId the primary key of the useraccount
	* @return the useraccount
	* @throws com.subscriberapprove.NoSuchuseraccountException if a useraccount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.subscriberapprove.model.useraccount findByPrimaryKey(
		long useraccountId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.subscriberapprove.NoSuchuseraccountException {
		return getPersistence().findByPrimaryKey(useraccountId);
	}

	/**
	* Returns the useraccount with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param useraccountId the primary key of the useraccount
	* @return the useraccount, or <code>null</code> if a useraccount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.subscriberapprove.model.useraccount fetchByPrimaryKey(
		long useraccountId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(useraccountId);
	}

	/**
	* Returns all the useraccounts.
	*
	* @return the useraccounts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.subscriberapprove.model.useraccount> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.subscriberapprove.model.useraccount> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.subscriberapprove.model.useraccount> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the useraccounts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of useraccounts.
	*
	* @return the number of useraccounts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static useraccountPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (useraccountPersistence)PortletBeanLocatorUtil.locate(com.subscriberapprove.service.ClpSerializer.getServletContextName(),
					useraccountPersistence.class.getName());

			ReferenceRegistry.registerReference(useraccountUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(useraccountPersistence persistence) {
	}

	private static useraccountPersistence _persistence;
}