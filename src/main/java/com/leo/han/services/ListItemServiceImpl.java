package com.leo.han.services;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.leo.han.beans.DropdownItem;
import com.leo.han.dao.DropdownItemDao;

@Service
public class ListItemServiceImpl implements ListItemService {

	@Autowired
	private DropdownItemDao dropdownItemDao;
	
	

	

	/*
	 * value is the cache object
	 * (org.springframework.cache.concurrent.ConcurrentMapCacheFactoryBean) key
	 * is the map-key to locate the map-value (the key could use spEL)
	 */

	@Cacheable(value = "sampleCache", key = "#root.methodName.concat('---').concat(#locale)")
	public Map<String, String> getItems(String locale, List<DropdownItem> list) {

		System.out.println("getItems--" + locale);

		Map<String, String> map = new TreeMap<String, String>();

		if ("en".equalsIgnoreCase(locale)) {

			for (DropdownItem item : list) {
				map.put(String.valueOf(item.getId()), item.getEnglish_desc());
			}

		} else if ("fr".equalsIgnoreCase(locale)) {

			for (DropdownItem item : list) {
				map.put(String.valueOf(item.getId()), item.getFrench_desc());
			}
		}

		return map;

	}

	@Cacheable(value = "sampleCache", key = "#root.methodName.concat('---').concat(#locale)")
	public Map<String, String> getList1Items(String locale, ListItemService listItemService) {
		System.out.println("getList1Items--" + locale);
		return listItemService.getItems(locale, dropdownItemDao.getList1Items());
	}

	@Cacheable(value = "sampleCache", key = "#root.methodName.concat('---').concat(#locale)")
	public Map<String, String> getList2Items(String locale, ListItemService listItemService) {
		System.out.println("getList2Items--" + locale);
		return listItemService.getItems(locale, dropdownItemDao.getList2Items());
	}

	@Cacheable(value = "sampleCache", key = "#root.methodName.concat('---').concat(#locale)")
	public Map<String, String> getList3Items(String locale, ListItemService listItemService) {
		System.out.println("getList3Items--" + locale);
		return listItemService.getItems(locale, dropdownItemDao.getList3Items());
	}

	@Cacheable(value = "sampleCache", key = "#root.methodName.concat('---').concat(#locale)")
	public Map<String, String> getList4Items(String locale, ListItemService listItemService) {
		System.out.println("getList4Items--" + locale);
		return listItemService.getItems(locale, dropdownItemDao.getList4Items());
	}

}
