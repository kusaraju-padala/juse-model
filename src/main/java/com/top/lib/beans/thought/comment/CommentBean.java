package com.top.lib.beans.thought.comment;

public class CommentBean {
	
	private String content;
	private Integer userId;
	
	private Integer postId;
	private Integer thoughtId;

	private boolean isParentComment;
	private Integer childCommentCount;
	private boolean isChildComment;
	private Integer parentCommentId;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public Integer getThoughtId() {
		return thoughtId;
	}
	public void setThoughtId(Integer thoughtId) {
		this.thoughtId = thoughtId;
	}
	public boolean isParentComment() {
		return isParentComment;
	}
	public void setParentComment(boolean isParentComment) {
		this.isParentComment = isParentComment;
	}
	public Integer getChildCommentCount() {
		return childCommentCount;
	}
	public void setChildCommentCount(Integer childCommentCount) {
		this.childCommentCount = childCommentCount;
	}
	public boolean isChildComment() {
		return isChildComment;
	}
	public void setChildComment(boolean isChildComment) {
		this.isChildComment = isChildComment;
	}
	public Integer getParentCommentId() {
		return parentCommentId;
	}
	public void setParentCommentId(Integer parentCommentId) {
		this.parentCommentId = parentCommentId;
	}

	
	

}
