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

import com.asu.poly.iProjects.student.NoSuchavailabilityException;
import com.asu.poly.iProjects.student.model.availability;
import com.asu.poly.iProjects.student.model.impl.availabilityImpl;
import com.asu.poly.iProjects.student.model.impl.availabilityModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the availability service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see availabilityPersistence
 * @see availabilityUtil
 * @generated
 */
public class availabilityPersistenceImpl extends BasePersistenceImpl<availability>
	implements availabilityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link availabilityUtil} to access the availability persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = availabilityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(availabilityModelImpl.ENTITY_CACHE_ENABLED,
			availabilityModelImpl.FINDER_CACHE_ENABLED, availabilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(availabilityModelImpl.ENTITY_CACHE_ENABLED,
			availabilityModelImpl.FINDER_CACHE_ENABLED, availabilityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(availabilityModelImpl.ENTITY_CACHE_ENABLED,
			availabilityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the availability in the entity cache if it is enabled.
	 *
	 * @param availability the availability
	 */
	public void cacheResult(availability availability) {
		EntityCacheUtil.putResult(availabilityModelImpl.ENTITY_CACHE_ENABLED,
			availabilityImpl.class, availability.getPrimaryKey(), availability);

		availability.resetOriginalValues();
	}

	/**
	 * Caches the availabilities in the entity cache if it is enabled.
	 *
	 * @param availabilities the availabilities
	 */
	public void cacheResult(List<availability> availabilities) {
		for (availability availability : availabilities) {
			if (EntityCacheUtil.getResult(
						availabilityModelImpl.ENTITY_CACHE_ENABLED,
						availabilityImpl.class, availability.getPrimaryKey()) == null) {
				cacheResult(availability);
			}
			else {
				availability.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all availabilities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(availabilityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(availabilityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the availability.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(availability availability) {
		EntityCacheUtil.removeResult(availabilityModelImpl.ENTITY_CACHE_ENABLED,
			availabilityImpl.class, availability.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<availability> availabilities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (availability availability : availabilities) {
			EntityCacheUtil.removeResult(availabilityModelImpl.ENTITY_CACHE_ENABLED,
				availabilityImpl.class, availability.getPrimaryKey());
		}
	}

	/**
	 * Creates a new availability with the primary key. Does not add the availability to the database.
	 *
	 * @param studentid the primary key for the new availability
	 * @return the new availability
	 */
	public availability create(long studentid) {
		availability availability = new availabilityImpl();

		availability.setNew(true);
		availability.setPrimaryKey(studentid);

		return availability;
	}

	/**
	 * Removes the availability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentid the primary key of the availability
	 * @return the availability that was removed
	 * @throws com.asu.poly.iProjects.student.NoSuchavailabilityException if a availability with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public availability remove(long studentid)
		throws NoSuchavailabilityException, SystemException {
		return remove(Long.valueOf(studentid));
	}

	/**
	 * Removes the availability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the availability
	 * @return the availability that was removed
	 * @throws com.asu.poly.iProjects.student.NoSuchavailabilityException if a availability with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public availability remove(Serializable primaryKey)
		throws NoSuchavailabilityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			availability availability = (availability)session.get(availabilityImpl.class,
					primaryKey);

			if (availability == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchavailabilityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(availability);
		}
		catch (NoSuchavailabilityException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected availability removeImpl(availability availability)
		throws SystemException {
		availability = toUnwrappedModel(availability);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, availability);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(availability);

		return availability;
	}

	@Override
	public availability updateImpl(
		com.asu.poly.iProjects.student.model.availability availability,
		boolean merge) throws SystemException {
		availability = toUnwrappedModel(availability);

		boolean isNew = availability.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, availability, merge);

			availability.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(availabilityModelImpl.ENTITY_CACHE_ENABLED,
			availabilityImpl.class, availability.getPrimaryKey(), availability);

		return availability;
	}

	protected availability toUnwrappedModel(availability availability) {
		if (availability instanceof availabilityImpl) {
			return availability;
		}

		availabilityImpl availabilityImpl = new availabilityImpl();

		availabilityImpl.setNew(availability.isNew());
		availabilityImpl.setPrimaryKey(availability.getPrimaryKey());

		availabilityImpl.setStudentid(availability.getStudentid());
		availabilityImpl.setAsuriteid(availability.getAsuriteid());
		availabilityImpl.setMon8to9(availability.getMon8to9());
		availabilityImpl.setMon9to10(availability.getMon9to10());
		availabilityImpl.setMon10to11(availability.getMon10to11());
		availabilityImpl.setMon11to12(availability.getMon11to12());
		availabilityImpl.setMon12to1(availability.getMon12to1());
		availabilityImpl.setMon1to2(availability.getMon1to2());
		availabilityImpl.setMon2to3(availability.getMon2to3());
		availabilityImpl.setMon3to4(availability.getMon3to4());
		availabilityImpl.setMon4to5(availability.getMon4to5());
		availabilityImpl.setTue8to9(availability.getTue8to9());
		availabilityImpl.setTue9to10(availability.getTue9to10());
		availabilityImpl.setTue10to11(availability.getTue10to11());
		availabilityImpl.setTue11to12(availability.getTue11to12());
		availabilityImpl.setTue12to1(availability.getTue12to1());
		availabilityImpl.setTue1to2(availability.getTue1to2());
		availabilityImpl.setTue2to3(availability.getTue2to3());
		availabilityImpl.setTue3to4(availability.getTue3to4());
		availabilityImpl.setTue4to5(availability.getTue4to5());
		availabilityImpl.setWed8to9(availability.getWed8to9());
		availabilityImpl.setWed9to10(availability.getWed9to10());
		availabilityImpl.setWed10to11(availability.getWed10to11());
		availabilityImpl.setWed11to12(availability.getWed11to12());
		availabilityImpl.setWed12to1(availability.getWed12to1());
		availabilityImpl.setWed1to2(availability.getWed1to2());
		availabilityImpl.setWed2to3(availability.getWed2to3());
		availabilityImpl.setWed3to4(availability.getWed3to4());
		availabilityImpl.setWed4to5(availability.getWed4to5());
		availabilityImpl.setThu8to9(availability.getThu8to9());
		availabilityImpl.setThu9to10(availability.getThu9to10());
		availabilityImpl.setThu10to11(availability.getThu10to11());
		availabilityImpl.setThu11to12(availability.getThu11to12());
		availabilityImpl.setThu12to1(availability.getThu12to1());
		availabilityImpl.setThu1to2(availability.getThu1to2());
		availabilityImpl.setThu2to3(availability.getThu2to3());
		availabilityImpl.setThu3to4(availability.getThu3to4());
		availabilityImpl.setThu4to5(availability.getThu4to5());
		availabilityImpl.setFri8to9(availability.getFri8to9());
		availabilityImpl.setFri9to10(availability.getFri9to10());
		availabilityImpl.setFri10to11(availability.getFri10to11());
		availabilityImpl.setFri11to12(availability.getFri11to12());
		availabilityImpl.setFri12to1(availability.getFri12to1());
		availabilityImpl.setFri1to2(availability.getFri1to2());
		availabilityImpl.setFri2to3(availability.getFri2to3());
		availabilityImpl.setFri3to4(availability.getFri3to4());
		availabilityImpl.setFri4to5(availability.getFri4to5());
		availabilityImpl.setSat8to9(availability.getSat8to9());
		availabilityImpl.setSat9to10(availability.getSat9to10());
		availabilityImpl.setSat10to11(availability.getSat10to11());
		availabilityImpl.setSat11to12(availability.getSat11to12());
		availabilityImpl.setSat12to1(availability.getSat12to1());
		availabilityImpl.setSat1to2(availability.getSat1to2());
		availabilityImpl.setSat2to3(availability.getSat2to3());
		availabilityImpl.setSat3to4(availability.getSat3to4());
		availabilityImpl.setSat4to5(availability.getSat4to5());
		availabilityImpl.setSun8to9(availability.getSun8to9());
		availabilityImpl.setSun9to10(availability.getSun9to10());
		availabilityImpl.setSun10to11(availability.getSun10to11());
		availabilityImpl.setSun11to12(availability.getSun11to12());
		availabilityImpl.setSun12to1(availability.getSun12to1());
		availabilityImpl.setSun1to2(availability.getSun1to2());
		availabilityImpl.setSun2to3(availability.getSun2to3());
		availabilityImpl.setSun3to4(availability.getSun3to4());
		availabilityImpl.setSun4to5(availability.getSun4to5());
		availabilityImpl.setCreateDate(availability.getCreateDate());
		availabilityImpl.setModifiedDate(availability.getModifiedDate());

		return availabilityImpl;
	}

	/**
	 * Returns the availability with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the availability
	 * @return the availability
	 * @throws com.liferay.portal.NoSuchModelException if a availability with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public availability findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the availability with the primary key or throws a {@link com.asu.poly.iProjects.student.NoSuchavailabilityException} if it could not be found.
	 *
	 * @param studentid the primary key of the availability
	 * @return the availability
	 * @throws com.asu.poly.iProjects.student.NoSuchavailabilityException if a availability with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public availability findByPrimaryKey(long studentid)
		throws NoSuchavailabilityException, SystemException {
		availability availability = fetchByPrimaryKey(studentid);

		if (availability == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + studentid);
			}

			throw new NoSuchavailabilityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				studentid);
		}

		return availability;
	}

	/**
	 * Returns the availability with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the availability
	 * @return the availability, or <code>null</code> if a availability with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public availability fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the availability with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentid the primary key of the availability
	 * @return the availability, or <code>null</code> if a availability with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public availability fetchByPrimaryKey(long studentid)
		throws SystemException {
		availability availability = (availability)EntityCacheUtil.getResult(availabilityModelImpl.ENTITY_CACHE_ENABLED,
				availabilityImpl.class, studentid);

		if (availability == _nullavailability) {
			return null;
		}

		if (availability == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				availability = (availability)session.get(availabilityImpl.class,
						Long.valueOf(studentid));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (availability != null) {
					cacheResult(availability);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(availabilityModelImpl.ENTITY_CACHE_ENABLED,
						availabilityImpl.class, studentid, _nullavailability);
				}

				closeSession(session);
			}
		}

		return availability;
	}

	/**
	 * Returns all the availabilities.
	 *
	 * @return the availabilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<availability> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the availabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of availabilities
	 * @param end the upper bound of the range of availabilities (not inclusive)
	 * @return the range of availabilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<availability> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the availabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of availabilities
	 * @param end the upper bound of the range of availabilities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of availabilities
	 * @throws SystemException if a system exception occurred
	 */
	public List<availability> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<availability> list = (List<availability>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_AVAILABILITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AVAILABILITY;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<availability>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<availability>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the availabilities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (availability availability : findAll()) {
			remove(availability);
		}
	}

	/**
	 * Returns the number of availabilities.
	 *
	 * @return the number of availabilities
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_AVAILABILITY);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the availability persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.asu.poly.iProjects.student.model.availability")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<availability>> listenersList = new ArrayList<ModelListener<availability>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<availability>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(availabilityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = availabilityPersistence.class)
	protected availabilityPersistence availabilityPersistence;
	@BeanReference(type = preferencesPersistence.class)
	protected preferencesPersistence preferencesPersistence;
	@BeanReference(type = studentPersistence.class)
	protected studentPersistence studentPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_AVAILABILITY = "SELECT availability FROM availability availability";
	private static final String _SQL_COUNT_AVAILABILITY = "SELECT COUNT(availability) FROM availability availability";
	private static final String _ORDER_BY_ENTITY_ALIAS = "availability.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No availability exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(availabilityPersistenceImpl.class);
	private static availability _nullavailability = new availabilityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<availability> toCacheModel() {
				return _nullavailabilityCacheModel;
			}
		};

	private static CacheModel<availability> _nullavailabilityCacheModel = new CacheModel<availability>() {
			public availability toEntityModel() {
				return _nullavailability;
			}
		};
}