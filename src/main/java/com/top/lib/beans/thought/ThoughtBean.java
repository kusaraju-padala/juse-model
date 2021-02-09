package com.top.lib.beans.thought;

public class ThoughtBean {

	private Integer id;
	private String previewcontent;
	private Integer userId;
	private String[] objectids;
	private Integer postId;
	private String fullcontent;
	private String previewimage;


	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String[] getObjectids() {
		return objectids;
	}

	public void setObjectids(String[] objectids) {
		this.objectids = objectids;
	}

	public String getPreviewcontent() {
		return previewcontent;
	}

	public void setPreviewcontent(String previewcontent) {
		this.previewcontent = previewcontent;
	}

	public String getFullcontent() {
		return fullcontent;
	}

	public void setFullcontent(String fullcontent) {
		this.fullcontent = fullcontent;
	}

	public String getPreviewimage() {
		return previewimage;
	}

	public void setPreviewimage(String previewimage) {
		this.previewimage = previewimage;
	}

	

	
	
	
	

}
