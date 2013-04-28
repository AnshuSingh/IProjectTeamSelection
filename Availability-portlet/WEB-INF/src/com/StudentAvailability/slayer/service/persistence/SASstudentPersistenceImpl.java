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

package com.StudentAvailability.slayer.service.persistence;

import com.StudentAvailability.slayer.NoSuchstudentException;
import com.StudentAvailability.slayer.model.SASstudent;
import com.StudentAvailability.slayer.model.impl.SASstudentImpl;
import com.StudentAvailability.slayer.model.impl.SASstudentModelImpl;

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
 * The persistence implementation for the s a sstudent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Purva
 * @see SASstudentPersistence
 * @see SASstudentUtil
 * @generated
 */
public class SASstudentPersistenceImpl extends BasePersistenceImpl<SASstudent>
	implements SASstudentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SASstudentUtil} to access the s a sstudent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SASstudentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SASstudentModelImpl.ENTITY_CACHE_ENABLED,
			SASstudentModelImpl.FINDER_CACHE_ENABLED, SASstudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SASstudentModelImpl.ENTITY_CACHE_ENABLED,
			SASstudentModelImpl.FINDER_CACHE_ENABLED, SASstudentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SASstudentModelImpl.ENTITY_CACHE_ENABLED,
			SASstudentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the s a sstudent in the entity cache if it is enabled.
	 *
	 * @param saSstudent the s a sstudent
	 */
	public void cacheResult(SASstudent saSstudent) {
		EntityCacheUtil.putResult(SASstudentModelImpl.ENTITY_CACHE_ENABLED,
			SASstudentImpl.class, saSstudent.getPrimaryKey(), saSstudent);

		saSstudent.resetOriginalValues();
	}

	/**
	 * Caches the s a sstudents in the entity cache if it is enabled.
	 *
	 * @param saSstudents the s a sstudents
	 */
	public void cacheResult(List<SASstudent> saSstudents) {
		for (SASstudent saSstudent : saSstudents) {
			if (EntityCacheUtil.getResult(
						SASstudentModelImpl.ENTITY_CACHE_ENABLED,
						SASstudentImpl.class, saSstudent.getPrimaryKey()) == null) {
				cacheResult(saSstudent);
			}
			else {
				saSstudent.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all s a sstudents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SASstudentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SASstudentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the s a sstudent.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SASstudent saSstudent) {
		EntityCacheUtil.removeResult(SASstudentModelImpl.ENTITY_CACHE_ENABLED,
			SASstudentImpl.class, saSstudent.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SASstudent> saSstudents) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SASstudent saSstudent : saSstudents) {
			EntityCacheUtil.removeResult(SASstudentModelImpl.ENTITY_CACHE_ENABLED,
				SASstudentImpl.class, saSstudent.getPrimaryKey());
		}
	}

	/**
	 * Creates a new s a sstudent with the primary key. Does not add the s a sstudent to the database.
	 *
	 * @param studentid the primary key for the new s a sstudent
	 * @return the new s a sstudent
	 */
	public SASstudent create(long studentid) {
		SASstudent saSstudent = new SASstudentImpl();

		saSstudent.setNew(true);
		saSstudent.setPrimaryKey(studentid);

		return saSstudent;
	}

	/**
	 * Removes the s a sstudent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentid the primary key of the s a sstudent
	 * @return the s a sstudent that was removed
	 * @throws com.StudentAvailability.slayer.NoSuchstudentException if a s a sstudent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SASstudent remove(long studentid)
		throws NoSuchstudentException, SystemException {
		return remove(Long.valueOf(studentid));
	}

	/**
	 * Removes the s a sstudent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the s a sstudent
	 * @return the s a sstudent that was removed
	 * @throws com.StudentAvailability.slayer.NoSuchstudentException if a s a sstudent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SASstudent remove(Serializable primaryKey)
		throws NoSuchstudentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			SASstudent saSstudent = (SASstudent)session.get(SASstudentImpl.class,
					primaryKey);

			if (saSstudent == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchstudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(saSstudent);
		}
		catch (NoSuchstudentException nsee) {
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
	protected SASstudent removeImpl(SASstudent saSstudent)
		throws SystemException {
		saSstudent = toUnwrappedModel(saSstudent);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, saSstudent);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(saSstudent);

		return saSstudent;
	}

	@Override
	public SASstudent updateImpl(
		com.StudentAvailability.slayer.model.SASstudent saSstudent,
		boolean merge) throws SystemException {
		saSstudent = toUnwrappedModel(saSstudent);

		boolean isNew = saSstudent.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, saSstudent, merge);

			saSstudent.setNew(false);
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

		EntityCacheUtil.putResult(SASstudentModelImpl.ENTITY_CACHE_ENABLED,
			SASstudentImpl.class, saSstudent.getPrimaryKey(), saSstudent);

		return saSstudent;
	}

	protected SASstudent toUnwrappedModel(SASstudent saSstudent) {
		if (saSstudent instanceof SASstudentImpl) {
			return saSstudent;
		}

		SASstudentImpl saSstudentImpl = new SASstudentImpl();

		saSstudentImpl.setNew(saSstudent.isNew());
		saSstudentImpl.setPrimaryKey(saSstudent.getPrimaryKey());

		saSstudentImpl.setStudentid(saSstudent.getStudentid());
		saSstudentImpl.setASUId(saSstudent.getASUId());
		saSstudentImpl.setMon8to9(saSstudent.getMon8to9());
		saSstudentImpl.setMon9to10(saSstudent.getMon9to10());
		saSstudentImpl.setMon10to11(saSstudent.getMon10to11());
		saSstudentImpl.setMon11to12(saSstudent.getMon11to12());
		saSstudentImpl.setMon12to1(saSstudent.getMon12to1());
		saSstudentImpl.setMon1to2(saSstudent.getMon1to2());
		saSstudentImpl.setMon2to3(saSstudent.getMon2to3());
		saSstudentImpl.setMon3to4(saSstudent.getMon3to4());
		saSstudentImpl.setMon4to5(saSstudent.getMon4to5());
		saSstudentImpl.setTue8to9(saSstudent.getTue8to9());
		saSstudentImpl.setTue9to10(saSstudent.getTue9to10());
		saSstudentImpl.setTue10to11(saSstudent.getTue10to11());
		saSstudentImpl.setTue11to12(saSstudent.getTue11to12());
		saSstudentImpl.setTue12to1(saSstudent.getTue12to1());
		saSstudentImpl.setTue1to2(saSstudent.getTue1to2());
		saSstudentImpl.setTue2to3(saSstudent.getTue2to3());
		saSstudentImpl.setTue3to4(saSstudent.getTue3to4());
		saSstudentImpl.setTue4to5(saSstudent.getTue4to5());
		saSstudentImpl.setWed8to9(saSstudent.getWed8to9());
		saSstudentImpl.setWed9to10(saSstudent.getWed9to10());
		saSstudentImpl.setWed10to11(saSstudent.getWed10to11());
		saSstudentImpl.setWed11to12(saSstudent.getWed11to12());
		saSstudentImpl.setWed12to1(saSstudent.getWed12to1());
		saSstudentImpl.setWed1to2(saSstudent.getWed1to2());
		saSstudentImpl.setWed2to3(saSstudent.getWed2to3());
		saSstudentImpl.setWed3to4(saSstudent.getWed3to4());
		saSstudentImpl.setWed4to5(saSstudent.getWed4to5());
		saSstudentImpl.setThu8to9(saSstudent.getThu8to9());
		saSstudentImpl.setThu9to10(saSstudent.getThu9to10());
		saSstudentImpl.setThu10to11(saSstudent.getThu10to11());
		saSstudentImpl.setThu11to12(saSstudent.getThu11to12());
		saSstudentImpl.setThu12to1(saSstudent.getThu12to1());
		saSstudentImpl.setThu1to2(saSstudent.getThu1to2());
		saSstudentImpl.setThu2to3(saSstudent.getThu2to3());
		saSstudentImpl.setThu3to4(saSstudent.getThu3to4());
		saSstudentImpl.setThu4to5(saSstudent.getThu4to5());
		saSstudentImpl.setFri8to9(saSstudent.getFri8to9());
		saSstudentImpl.setFri9to10(saSstudent.getFri9to10());
		saSstudentImpl.setFri10to11(saSstudent.getFri10to11());
		saSstudentImpl.setFri11to12(saSstudent.getFri11to12());
		saSstudentImpl.setFri12to1(saSstudent.getFri12to1());
		saSstudentImpl.setFri1to2(saSstudent.getFri1to2());
		saSstudentImpl.setFri2to3(saSstudent.getFri2to3());
		saSstudentImpl.setFri3to4(saSstudent.getFri3to4());
		saSstudentImpl.setFri4to5(saSstudent.getFri4to5());
		saSstudentImpl.setSat8to9(saSstudent.getSat8to9());
		saSstudentImpl.setSat9to10(saSstudent.getSat9to10());
		saSstudentImpl.setSat10to11(saSstudent.getSat10to11());
		saSstudentImpl.setSat11to12(saSstudent.getSat11to12());
		saSstudentImpl.setSat12to1(saSstudent.getSat12to1());
		saSstudentImpl.setSat1to2(saSstudent.getSat1to2());
		saSstudentImpl.setSat2to3(saSstudent.getSat2to3());
		saSstudentImpl.setSat3to4(saSstudent.getSat3to4());
		saSstudentImpl.setSat4to5(saSstudent.getSat4to5());
		saSstudentImpl.setSun8to9(saSstudent.getSun8to9());
		saSstudentImpl.setSun9to10(saSstudent.getSun9to10());
		saSstudentImpl.setSun10to11(saSstudent.getSun10to11());
		saSstudentImpl.setSun11to12(saSstudent.getSun11to12());
		saSstudentImpl.setSun12to1(saSstudent.getSun12to1());
		saSstudentImpl.setSun1to2(saSstudent.getSun1to2());
		saSstudentImpl.setSun2to3(saSstudent.getSun2to3());
		saSstudentImpl.setSun3to4(saSstudent.getSun3to4());
		saSstudentImpl.setSun4to5(saSstudent.getSun4to5());
		saSstudentImpl.setAuthor(saSstudent.getAuthor());
		saSstudentImpl.setDateAdded(saSstudent.getDateAdded());

		return saSstudentImpl;
	}

	/**
	 * Returns the s a sstudent with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the s a sstudent
	 * @return the s a sstudent
	 * @throws com.liferay.portal.NoSuchModelException if a s a sstudent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SASstudent findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s a sstudent with the primary key or throws a {@link com.StudentAvailability.slayer.NoSuchstudentException} if it could not be found.
	 *
	 * @param studentid the primary key of the s a sstudent
	 * @return the s a sstudent
	 * @throws com.StudentAvailability.slayer.NoSuchstudentException if a s a sstudent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SASstudent findByPrimaryKey(long studentid)
		throws NoSuchstudentException, SystemException {
		SASstudent saSstudent = fetchByPrimaryKey(studentid);

		if (saSstudent == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + studentid);
			}

			throw new NoSuchstudentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				studentid);
		}

		return saSstudent;
	}

	/**
	 * Returns the s a sstudent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the s a sstudent
	 * @return the s a sstudent, or <code>null</code> if a s a sstudent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public SASstudent fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the s a sstudent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param studentid the primary key of the s a sstudent
	 * @return the s a sstudent, or <code>null</code> if a s a sstudent with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public SASstudent fetchByPrimaryKey(long studentid)
		throws SystemException {
		SASstudent saSstudent = (SASstudent)EntityCacheUtil.getResult(SASstudentModelImpl.ENTITY_CACHE_ENABLED,
				SASstudentImpl.class, studentid);

		if (saSstudent == _nullSASstudent) {
			return null;
		}

		if (saSstudent == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				saSstudent = (SASstudent)session.get(SASstudentImpl.class,
						Long.valueOf(studentid));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (saSstudent != null) {
					cacheResult(saSstudent);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(SASstudentModelImpl.ENTITY_CACHE_ENABLED,
						SASstudentImpl.class, studentid, _nullSASstudent);
				}

				closeSession(session);
			}
		}

		return saSstudent;
	}

	/**
	 * Returns all the s a sstudents.
	 *
	 * @return the s a sstudents
	 * @throws SystemException if a system exception occurred
	 */
	public List<SASstudent> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the s a sstudents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s a sstudents
	 * @param end the upper bound of the range of s a sstudents (not inclusive)
	 * @return the range of s a sstudents
	 * @throws SystemException if a system exception occurred
	 */
	public List<SASstudent> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the s a sstudents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of s a sstudents
	 * @param end the upper bound of the range of s a sstudents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of s a sstudents
	 * @throws SystemException if a system exception occurred
	 */
	public List<SASstudent> findAll(int start, int end,
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

		List<SASstudent> list = (List<SASstudent>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SASSTUDENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SASSTUDENT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<SASstudent>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<SASstudent>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the s a sstudents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (SASstudent saSstudent : findAll()) {
			remove(saSstudent);
		}
	}

	/**
	 * Returns the number of s a sstudents.
	 *
	 * @return the number of s a sstudents
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SASSTUDENT);

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
	 * Initializes the s a sstudent persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.StudentAvailability.slayer.model.SASstudent")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<SASstudent>> listenersList = new ArrayList<ModelListener<SASstudent>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<SASstudent>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(SASstudentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = SASstudentPersistence.class)
	protected SASstudentPersistence saSstudentPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_SASSTUDENT = "SELECT saSstudent FROM SASstudent saSstudent";
	private static final String _SQL_COUNT_SASSTUDENT = "SELECT COUNT(saSstudent) FROM SASstudent saSstudent";
	private static final String _ORDER_BY_ENTITY_ALIAS = "saSstudent.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SASstudent exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SASstudentPersistenceImpl.class);
	private static SASstudent _nullSASstudent = new SASstudentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SASstudent> toCacheModel() {
				return _nullSASstudentCacheModel;
			}
		};

	private static CacheModel<SASstudent> _nullSASstudentCacheModel = new CacheModel<SASstudent>() {
			public SASstudent toEntityModel() {
				return _nullSASstudent;
			}
		};
}