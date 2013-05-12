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

import com.CreateUser.NoSuchuseraccountException;

import com.CreateUser.model.impl.useraccountImpl;
import com.CreateUser.model.impl.useraccountModelImpl;
import com.CreateUser.model.useraccount;

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
 * The persistence implementation for the useraccount service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Shruthi
 * @see useraccountPersistence
 * @see useraccountUtil
 * @generated
 */
public class useraccountPersistenceImpl extends BasePersistenceImpl<useraccount>
	implements useraccountPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link useraccountUtil} to access the useraccount persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = useraccountImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(useraccountModelImpl.ENTITY_CACHE_ENABLED,
			useraccountModelImpl.FINDER_CACHE_ENABLED, useraccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(useraccountModelImpl.ENTITY_CACHE_ENABLED,
			useraccountModelImpl.FINDER_CACHE_ENABLED, useraccountImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(useraccountModelImpl.ENTITY_CACHE_ENABLED,
			useraccountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the useraccount in the entity cache if it is enabled.
	 *
	 * @param useraccount the useraccount
	 */
	public void cacheResult(useraccount useraccount) {
		EntityCacheUtil.putResult(useraccountModelImpl.ENTITY_CACHE_ENABLED,
			useraccountImpl.class, useraccount.getPrimaryKey(), useraccount);

		useraccount.resetOriginalValues();
	}

	/**
	 * Caches the useraccounts in the entity cache if it is enabled.
	 *
	 * @param useraccounts the useraccounts
	 */
	public void cacheResult(List<useraccount> useraccounts) {
		for (useraccount useraccount : useraccounts) {
			if (EntityCacheUtil.getResult(
						useraccountModelImpl.ENTITY_CACHE_ENABLED,
						useraccountImpl.class, useraccount.getPrimaryKey()) == null) {
				cacheResult(useraccount);
			}
			else {
				useraccount.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all useraccounts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(useraccountImpl.class.getName());
		}

		EntityCacheUtil.clearCache(useraccountImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the useraccount.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(useraccount useraccount) {
		EntityCacheUtil.removeResult(useraccountModelImpl.ENTITY_CACHE_ENABLED,
			useraccountImpl.class, useraccount.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<useraccount> useraccounts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (useraccount useraccount : useraccounts) {
			EntityCacheUtil.removeResult(useraccountModelImpl.ENTITY_CACHE_ENABLED,
				useraccountImpl.class, useraccount.getPrimaryKey());
		}
	}

	/**
	 * Creates a new useraccount with the primary key. Does not add the useraccount to the database.
	 *
	 * @param useraccountId the primary key for the new useraccount
	 * @return the new useraccount
	 */
	public useraccount create(long useraccountId) {
		useraccount useraccount = new useraccountImpl();

		useraccount.setNew(true);
		useraccount.setPrimaryKey(useraccountId);

		return useraccount;
	}

	/**
	 * Removes the useraccount with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param useraccountId the primary key of the useraccount
	 * @return the useraccount that was removed
	 * @throws com.CreateUser.NoSuchuseraccountException if a useraccount with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public useraccount remove(long useraccountId)
		throws NoSuchuseraccountException, SystemException {
		return remove(Long.valueOf(useraccountId));
	}

	/**
	 * Removes the useraccount with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the useraccount
	 * @return the useraccount that was removed
	 * @throws com.CreateUser.NoSuchuseraccountException if a useraccount with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public useraccount remove(Serializable primaryKey)
		throws NoSuchuseraccountException, SystemException {
		Session session = null;

		try {
			session = openSession();

			useraccount useraccount = (useraccount)session.get(useraccountImpl.class,
					primaryKey);

			if (useraccount == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchuseraccountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(useraccount);
		}
		catch (NoSuchuseraccountException nsee) {
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
	protected useraccount removeImpl(useraccount useraccount)
		throws SystemException {
		useraccount = toUnwrappedModel(useraccount);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, useraccount);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(useraccount);

		return useraccount;
	}

	@Override
	public useraccount updateImpl(
		com.CreateUser.model.useraccount useraccount, boolean merge)
		throws SystemException {
		useraccount = toUnwrappedModel(useraccount);

		boolean isNew = useraccount.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, useraccount, merge);

			useraccount.setNew(false);
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

		EntityCacheUtil.putResult(useraccountModelImpl.ENTITY_CACHE_ENABLED,
			useraccountImpl.class, useraccount.getPrimaryKey(), useraccount);

		return useraccount;
	}

	protected useraccount toUnwrappedModel(useraccount useraccount) {
		if (useraccount instanceof useraccountImpl) {
			return useraccount;
		}

		useraccountImpl useraccountImpl = new useraccountImpl();

		useraccountImpl.setNew(useraccount.isNew());
		useraccountImpl.setPrimaryKey(useraccount.getPrimaryKey());

		useraccountImpl.setUseraccountId(useraccount.getUseraccountId());
		useraccountImpl.setCompanyId(useraccount.getCompanyId());
		useraccountImpl.setFirstName(useraccount.getFirstName());
		useraccountImpl.setLastName(useraccount.getLastName());
		useraccountImpl.setEMail(useraccount.getEMail());
		useraccountImpl.setPhoneNo(useraccount.getPhoneNo());
		useraccountImpl.setMajor(useraccount.getMajor());
		useraccountImpl.setCgpa(useraccount.getCgpa());
		useraccountImpl.setRole(useraccount.getRole());
		useraccountImpl.setPassword(useraccount.getPassword());
		useraccountImpl.setAsuriteId(useraccount.getAsuriteId());
		useraccountImpl.setLevel(useraccount.getLevel());
		useraccountImpl.setSex(useraccount.getSex());
		useraccountImpl.setDateAdded(useraccount.getDateAdded());

		return useraccountImpl;
	}

	/**
	 * Returns the useraccount with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the useraccount
	 * @return the useraccount
	 * @throws com.liferay.portal.NoSuchModelException if a useraccount with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public useraccount findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the useraccount with the primary key or throws a {@link com.CreateUser.NoSuchuseraccountException} if it could not be found.
	 *
	 * @param useraccountId the primary key of the useraccount
	 * @return the useraccount
	 * @throws com.CreateUser.NoSuchuseraccountException if a useraccount with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public useraccount findByPrimaryKey(long useraccountId)
		throws NoSuchuseraccountException, SystemException {
		useraccount useraccount = fetchByPrimaryKey(useraccountId);

		if (useraccount == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + useraccountId);
			}

			throw new NoSuchuseraccountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				useraccountId);
		}

		return useraccount;
	}

	/**
	 * Returns the useraccount with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the useraccount
	 * @return the useraccount, or <code>null</code> if a useraccount with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public useraccount fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the useraccount with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param useraccountId the primary key of the useraccount
	 * @return the useraccount, or <code>null</code> if a useraccount with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public useraccount fetchByPrimaryKey(long useraccountId)
		throws SystemException {
		useraccount useraccount = (useraccount)EntityCacheUtil.getResult(useraccountModelImpl.ENTITY_CACHE_ENABLED,
				useraccountImpl.class, useraccountId);

		if (useraccount == _nulluseraccount) {
			return null;
		}

		if (useraccount == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				useraccount = (useraccount)session.get(useraccountImpl.class,
						Long.valueOf(useraccountId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (useraccount != null) {
					cacheResult(useraccount);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(useraccountModelImpl.ENTITY_CACHE_ENABLED,
						useraccountImpl.class, useraccountId, _nulluseraccount);
				}

				closeSession(session);
			}
		}

		return useraccount;
	}

	/**
	 * Returns all the useraccounts.
	 *
	 * @return the useraccounts
	 * @throws SystemException if a system exception occurred
	 */
	public List<useraccount> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<useraccount> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<useraccount> findAll(int start, int end,
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

		List<useraccount> list = (List<useraccount>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERACCOUNT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERACCOUNT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<useraccount>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<useraccount>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the useraccounts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (useraccount useraccount : findAll()) {
			remove(useraccount);
		}
	}

	/**
	 * Returns the number of useraccounts.
	 *
	 * @return the number of useraccounts
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERACCOUNT);

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
	 * Initializes the useraccount persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.CreateUser.model.useraccount")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<useraccount>> listenersList = new ArrayList<ModelListener<useraccount>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<useraccount>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(useraccountImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = useraccountPersistence.class)
	protected useraccountPersistence useraccountPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_USERACCOUNT = "SELECT useraccount FROM useraccount useraccount";
	private static final String _SQL_COUNT_USERACCOUNT = "SELECT COUNT(useraccount) FROM useraccount useraccount";
	private static final String _ORDER_BY_ENTITY_ALIAS = "useraccount.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No useraccount exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(useraccountPersistenceImpl.class);
	private static useraccount _nulluseraccount = new useraccountImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<useraccount> toCacheModel() {
				return _nulluseraccountCacheModel;
			}
		};

	private static CacheModel<useraccount> _nulluseraccountCacheModel = new CacheModel<useraccount>() {
			public useraccount toEntityModel() {
				return _nulluseraccount;
			}
		};
}