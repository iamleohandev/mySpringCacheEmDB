package com.leo.han.services;

import java.util.List;
import java.util.Map;

import com.leo.han.beans.DropdownItem;

public interface ListItemService {
	Map<String, String> getItems(String locale, List<DropdownItem> list);
	
	Map<String, String> getList1Items(String locale, ListItemService listItemService);
	Map<String, String> getList2Items(String locale, ListItemService listItemService);
	Map<String, String> getList3Items(String locale, ListItemService listItemService);
	Map<String, String> getList4Items(String locale, ListItemService listItemService);
}
