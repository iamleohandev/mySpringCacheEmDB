package com.leo.han.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CacheDao {

	private final String GET_ITEMS_EN = "SELECT english_desc FROM ITEM ORDER BY ID";
	private final String GET_ITEMS_FR = "SELECT french_desc FROM ITEM ORDER BY ID";
	
	
	private final String GET_PERSONS_EN = "SELECT english_desc FROM PERSON ORDER BY ID";
	private final String GET_PERSONS_FR = "SELECT french_desc FROM PERSON ORDER BY ID";

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Map<String, String> getItems(String locale) {

		List<String> items_en = jdbcTemplate.queryForList(GET_ITEMS_EN,
				String.class);
		List<String> items_fr = jdbcTemplate.queryForList(GET_ITEMS_FR,
				String.class);

		Map<String, String> map_en = new TreeMap<String, String>();
		Map<String, String> map_fr = new TreeMap<String, String>();

		for (int i = 0; i < items_en.size(); i++) {
			map_en.put(i + "", items_en.get(i));
		}

		for (int i = 0; i < items_fr.size(); i++) {
			map_fr.put(i + "", items_fr.get(i));
		}

		if ("fr".equalsIgnoreCase(locale)) {
			return map_fr;
		} else if ("en".equalsIgnoreCase(locale)) {
			return map_en;
		} else {

			return null;
		}

	}
	
	
	
	
	
	public Map<String, String> getPersons(String locale) {

		List<String> items_en = jdbcTemplate.queryForList(GET_PERSONS_EN,
				String.class);
		List<String> items_fr = jdbcTemplate.queryForList(GET_PERSONS_FR,
				String.class);

		Map<String, String> map_en = new TreeMap<String, String>();
		Map<String, String> map_fr = new TreeMap<String, String>();

		for (int i = 0; i < items_en.size(); i++) {
			map_en.put(i + "", items_en.get(i));
		}

		for (int i = 0; i < items_fr.size(); i++) {
			map_fr.put(i + "", items_fr.get(i));
		}

		if ("fr".equalsIgnoreCase(locale)) {
			return map_fr;
		} else if ("en".equalsIgnoreCase(locale)) {
			return map_en;
		} else {

			return null;
		}

	}

}
