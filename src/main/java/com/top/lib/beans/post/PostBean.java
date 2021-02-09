package com.top.lib.beans.post;

public class PostBean {
	
	private Integer pid;
	private String heading;
	private Integer ownerId;
	private String topics;
	private Integer countryId;
	private Integer stateId;
	private Integer languageId;
	private String postType; //thumbnail, wide, full, poll
	private String body;
	private String expandbody;
	private boolean isExpandable;
	private ImageOutputBean image;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public Integer getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}
	public String getPostType() {
		return postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public ImageOutputBean getImage() {
		return image;
	}
	public void setImage(ImageOutputBean image) {
		this.image = image;
	}
	public String getExpandbody() {
		return expandbody;
	}
	public void setExpandbody(String expandbody) {
		this.expandbody = expandbody;
	}
	public boolean isExpandable() {
		return isExpandable;
	}
	public void setExpandable(boolean isExpandable) {
		this.isExpandable = isExpandable;
	}

	
	

	
}
