package com.leo.han.beans;

public class DropdownItem {

	DropdownItem() {

	}

	private int id;
	private String english_desc;
	private String french_desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnglish_desc() {
		return english_desc;
	}

	public void setEnglish_desc(String english_desc) {
		this.english_desc = english_desc;
	}

	public String getFrench_desc() {
		return french_desc;
	}

	public void setFrench_desc(String french_desc) {
		this.french_desc = french_desc;
	}

}
