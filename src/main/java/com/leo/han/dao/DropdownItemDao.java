package com.leo.han.dao;

import java.util.List;

import com.leo.han.beans.DropdownItem;

public interface DropdownItemDao {

	List<DropdownItem> getList1Items();
	
	List<DropdownItem> getList2Items();
	
	List<DropdownItem> getList3Items();
	
	List<DropdownItem> getList4Items();
}
