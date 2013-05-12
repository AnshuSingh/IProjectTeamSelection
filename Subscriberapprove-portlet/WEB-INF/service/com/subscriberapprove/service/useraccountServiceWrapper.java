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

package com.subscriberapprove.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link useraccountService}.
 * </p>
 *
 * @author    Shruthi
 * @see       useraccountService
 * @generated
 */
public class useraccountServiceWrapper implements useraccountService,
	ServiceWrapper<useraccountService> {
	public useraccountServiceWrapper(useraccountService useraccountService) {
		_useraccountService = useraccountService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _useraccountService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_useraccountService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _useraccountService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public useraccountService getWrappeduseraccountService() {
		return _useraccountService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappeduseraccountService(
		useraccountService useraccountService) {
		_useraccountService = useraccountService;
	}

	public useraccountService getWrappedService() {
		return _useraccountService;
	}

	public void setWrappedService(useraccountService useraccountService) {
		_useraccountService = useraccountService;
	}

	private useraccountService _useraccountService;
}