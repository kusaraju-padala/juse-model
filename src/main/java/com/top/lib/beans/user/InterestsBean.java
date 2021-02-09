package com.top.lib.beans.user;

import java.util.List;

public class InterestsBean {

	private String category;
	private String displayName;
	private boolean isDropdown;
	private String backgroundURL;
	
	private List<InterestsBean> subCategory;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public boolean isDropdown() {
		return isDropdown;
	}
	public void setDropdown(boolean isDropdown) {
		this.isDropdown = isDropdown;
	}
	public List<InterestsBean> getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(List<InterestsBean> subCategory) {
		this.subCategory = subCategory;
	}
	public String getBackgroundURL() {
		return backgroundURL;
	}
	public void setBackgroundURL(String backgroundURL) {
		this.backgroundURL = backgroundURL;
	}
	
	
	
	
}
