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

package com.asu.poly.teams.manualSelect.slayer.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the projectdetail local service. This utility wraps {@link com.asu.poly.teams.manualSelect.slayer.service.impl.ProjectdetailLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Eshwari
 * @see ProjectdetailLocalService
 * @see com.asu.poly.teams.manualSelect.slayer.service.base.ProjectdetailLocalServiceBaseImpl
 * @see com.asu.poly.teams.manualSelect.slayer.service.impl.ProjectdetailLocalServiceImpl
 * @generated
 */
public class ProjectdetailLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.asu.poly.teams.manualSelect.slayer.service.impl.ProjectdetailLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the projectdetail to the database. Also notifies the appropriate model listeners.
	*
	* @param projectdetail the projectdetail
	* @return the projectdetail that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.Projectdetail addProjectdetail(
		com.asu.poly.teams.manualSelect.slayer.model.Projectdetail projectdetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addProjectdetail(projectdetail);
	}

	/**
	* Creates a new projectdetail with the primary key. Does not add the projectdetail to the database.
	*
	* @param projectID the primary key for the new projectdetail
	* @return the new projectdetail
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.Projectdetail createProjectdetail(
		long projectID) {
		return getService().createProjectdetail(projectID);
	}

	/**
	* Deletes the projectdetail with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectID the primary key of the projectdetail
	* @return the projectdetail that was removed
	* @throws PortalException if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.Projectdetail deleteProjectdetail(
		long projectID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProjectdetail(projectID);
	}

	/**
	* Deletes the projectdetail from the database. Also notifies the appropriate model listeners.
	*
	* @param projectdetail the projectdetail
	* @return the projectdetail that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.Projectdetail deleteProjectdetail(
		com.asu.poly.teams.manualSelect.slayer.model.Projectdetail projectdetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteProjectdetail(projectdetail);
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

	public static com.asu.poly.teams.manualSelect.slayer.model.Projectdetail fetchProjectdetail(
		long projectID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchProjectdetail(projectID);
	}

	/**
	* Returns the projectdetail with the primary key.
	*
	* @param projectID the primary key of the projectdetail
	* @return the projectdetail
	* @throws PortalException if a projectdetail with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.Projectdetail getProjectdetail(
		long projectID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getProjectdetail(projectID);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the projectdetails.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of projectdetails
	* @param end the upper bound of the range of projectdetails (not inclusive)
	* @return the range of projectdetails
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.asu.poly.teams.manualSelect.slayer.model.Projectdetail> getProjectdetails(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProjectdetails(start, end);
	}

	/**
	* Returns the number of projectdetails.
	*
	* @return the number of projectdetails
	* @throws SystemException if a system exception occurred
	*/
	public static int getProjectdetailsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getProjectdetailsCount();
	}

	/**
	* Updates the projectdetail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param projectdetail the projectdetail
	* @return the projectdetail that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.Projectdetail updateProjectdetail(
		com.asu.poly.teams.manualSelect.slayer.model.Projectdetail projectdetail)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateProjectdetail(projectdetail);
	}

	/**
	* Updates the projectdetail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param projectdetail the projectdetail
	* @param merge whether to merge the projectdetail with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the projectdetail that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.asu.poly.teams.manualSelect.slayer.model.Projectdetail updateProjectdetail(
		com.asu.poly.teams.manualSelect.slayer.model.Projectdetail projectdetail,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateProjectdetail(projectdetail, merge);
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

	public static ProjectdetailLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ProjectdetailLocalService.class.getName());

			if (invokableLocalService instanceof ProjectdetailLocalService) {
				_service = (ProjectdetailLocalService)invokableLocalService;
			}
			else {
				_service = new ProjectdetailLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ProjectdetailLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(ProjectdetailLocalService service) {
	}

	private static ProjectdetailLocalService _service;
}