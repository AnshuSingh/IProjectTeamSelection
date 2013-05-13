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

package com.NewSubscriber.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the useraccount local service. This utility wraps {@link com.NewSubscriber.service.impl.useraccountLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Shruthi
 * @see useraccountLocalService
 * @see com.NewSubscriber.service.base.useraccountLocalServiceBaseImpl
 * @see com.NewSubscriber.service.impl.useraccountLocalServiceImpl
 * @generated
 */
public class useraccountLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.NewSubscriber.service.impl.useraccountLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the useraccount to the database. Also notifies the appropriate model listeners.
	*
	* @param useraccount the useraccount
	* @return the useraccount that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.NewSubscriber.model.useraccount adduseraccount(
		com.NewSubscriber.model.useraccount useraccount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().adduseraccount(useraccount);
	}

	/**
	* Creates a new useraccount with the primary key. Does not add the useraccount to the database.
	*
	* @param useraccountId the primary key for the new useraccount
	* @return the new useraccount
	*/
	public static com.NewSubscriber.model.useraccount createuseraccount(
		long useraccountId) {
		return getService().createuseraccount(useraccountId);
	}

	/**
	* Deletes the useraccount with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param useraccountId the primary key of the useraccount
	* @return the useraccount that was removed
	* @throws PortalException if a useraccount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.NewSubscriber.model.useraccount deleteuseraccount(
		long useraccountId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteuseraccount(useraccountId);
	}

	/**
	* Deletes the useraccount from the database. Also notifies the appropriate model listeners.
	*
	* @param useraccount the useraccount
	* @return the useraccount that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.NewSubscriber.model.useraccount deleteuseraccount(
		com.NewSubscriber.model.useraccount useraccount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteuseraccount(useraccount);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.NewSubscriber.model.useraccount fetchuseraccount(
		long useraccountId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchuseraccount(useraccountId);
	}

	/**
	* Returns the useraccount with the primary key.
	*
	* @param useraccountId the primary key of the useraccount
	* @return the useraccount
	* @throws PortalException if a useraccount with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.NewSubscriber.model.useraccount getuseraccount(
		long useraccountId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getuseraccount(useraccountId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.NewSubscriber.model.useraccount> getuseraccounts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getuseraccounts(start, end);
	}

	/**
	* Returns the number of useraccounts.
	*
	* @return the number of useraccounts
	* @throws SystemException if a system exception occurred
	*/
	public static int getuseraccountsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getuseraccountsCount();
	}

	/**
	* Updates the useraccount in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param useraccount the useraccount
	* @return the useraccount that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.NewSubscriber.model.useraccount updateuseraccount(
		com.NewSubscriber.model.useraccount useraccount)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateuseraccount(useraccount);
	}

	/**
	* Updates the useraccount in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param useraccount the useraccount
	* @param merge whether to merge the useraccount with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the useraccount that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.NewSubscriber.model.useraccount updateuseraccount(
		com.NewSubscriber.model.useraccount useraccount, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateuseraccount(useraccount, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static useraccountLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					useraccountLocalService.class.getName());

			if (invokableLocalService instanceof useraccountLocalService) {
				_service = (useraccountLocalService)invokableLocalService;
			}
			else {
				_service = new useraccountLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(useraccountLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(useraccountLocalService service) {
	}

	private static useraccountLocalService _service;
}