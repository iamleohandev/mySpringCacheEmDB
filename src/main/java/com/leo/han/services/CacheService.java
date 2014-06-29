package com.leo.han.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.leo.han.dao.CacheDao;

@Service
public class CacheService {

	@Autowired
	private CacheDao cacheDao;

	/*
	 * value is the cache object
	 * (org.springframework.cache.concurrent.ConcurrentMapCacheFactoryBean) key
	 * is the map-key to locate the map-value (the key could use spEL)
	 */

	@Cacheable(value = "sampleCache", key = "#root.methodName.concat('---').concat(#locale)")
	public Map<String, String> getItems(String locale) {

		System.out.println("getItems--" + locale);

		return cacheDao.getItems(locale);

	}

	@Cacheable(value = "sampleCache", key = "#root.methodName.concat('---').concat(#locale)")
	public Map<String, String> getPersons(String locale) {

		System.out.println("getPersons--" + locale);

		return cacheDao.getPersons(locale);

	}

}
