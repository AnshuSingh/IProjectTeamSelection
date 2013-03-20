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

package com.asu.poly.teams.manualSelect.slayer.model.impl;

import com.asu.poly.teams.manualSelect.slayer.model.Foo;
import com.asu.poly.teams.manualSelect.slayer.service.FooLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Foo service. Represents a row in the &quot;manualSelect_Foo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FooImpl}.
 * </p>
 *
 * @author Eshwari
 * @see FooImpl
 * @see com.asu.poly.teams.manualSelect.slayer.model.Foo
 * @generated
 */
public abstract class FooBaseImpl extends FooModelImpl implements Foo {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a foo model instance should use the {@link Foo} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			FooLocalServiceUtil.addFoo(this);
		}
		else {
			FooLocalServiceUtil.updateFoo(this);
		}
	}
}