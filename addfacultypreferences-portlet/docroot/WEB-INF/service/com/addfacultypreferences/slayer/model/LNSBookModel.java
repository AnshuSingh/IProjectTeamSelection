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

package com.addfacultypreferences.slayer.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LNSBook service. Represents a row in the &quot;LNS_LNSBook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.addfacultypreferences.slayer.model.impl.LNSBookModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.addfacultypreferences.slayer.model.impl.LNSBookImpl}.
 * </p>
 *
 * @author Eshwari
 * @see LNSBook
 * @see com.addfacultypreferences.slayer.model.impl.LNSBookImpl
 * @see com.addfacultypreferences.slayer.model.impl.LNSBookModelImpl
 * @generated
 */
public interface LNSBookModel extends BaseModel<LNSBook> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a l n s book model instance should use the {@link LNSBook} interface instead.
	 */

	/**
	 * Returns the primary key of this l n s book.
	 *
	 * @return the primary key of this l n s book
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this l n s book.
	 *
	 * @param primaryKey the primary key of this l n s book
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the name ID of this l n s book.
	 *
	 * @return the name ID of this l n s book
	 */
	public long getNameId();

	/**
	 * Sets the name ID of this l n s book.
	 *
	 * @param nameId the name ID of this l n s book
	 */
	public void setNameId(long nameId);

	/**
	 * Returns the name of this l n s book.
	 *
	 * @return the name of this l n s book
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this l n s book.
	 *
	 * @param name the name of this l n s book
	 */
	public void setName(String name);

	/**
	 * Returns the email of this l n s book.
	 *
	 * @return the email of this l n s book
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this l n s book.
	 *
	 * @param email the email of this l n s book
	 */
	public void setEmail(String email);

	/**
	 * Returns the number of this l n s book.
	 *
	 * @return the number of this l n s book
	 */
	@AutoEscape
	public String getNumber();

	/**
	 * Sets the number of this l n s book.
	 *
	 * @param number the number of this l n s book
	 */
	public void setNumber(String number);

	/**
	 * Returns the date added of this l n s book.
	 *
	 * @return the date added of this l n s book
	 */
	public Date getDateAdded();

	/**
	 * Sets the date added of this l n s book.
	 *
	 * @param dateAdded the date added of this l n s book
	 */
	public void setDateAdded(Date dateAdded);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(LNSBook lnsBook);

	public int hashCode();

	public CacheModel<LNSBook> toCacheModel();

	public LNSBook toEscapedModel();

	public String toString();

	public String toXmlString();
}