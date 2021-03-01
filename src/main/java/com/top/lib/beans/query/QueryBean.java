package com.top.lib.beans.query;

import java.util.List;

public class QueryBean {
	
	private List<QueryFieldBean> queryFields;
	
	private String queryTableName;
	
	private List<QueryJoinBean> joinFields;
	
	private Boolean isUpdate;
	
	private Boolean isGet;
	
	private Boolean isDelete;
	
	private Boolean isAdd;
	
	private Boolean isJoin;
	
	private Boolean isGroupBy;
	
	private Boolean isConditioned;
	
	private Boolean isPaginated;
	
	private Boolean isSorted;
	
	private List<QueryFieldBean> groupByFields;

	public List<QueryFieldBean> getQueryFields() {
		return queryFields;
	}

	public void setQueryFields(List<QueryFieldBean> queryFields) {
		this.queryFields = queryFields;
	}

	public String getQueryTableName() {
		return queryTableName;
	}

	public void setQueryTableName(String queryTableName) {
		this.queryTableName = queryTableName;
	}

	public List<QueryJoinBean> getJoinFields() {
		return joinFields;
	}

	public void setJoinFields(List<QueryJoinBean> joinFields) {
		this.joinFields = joinFields;
	}

	public Boolean getIsUpdate() {
		return isUpdate;
	}

	public void setIsUpdate(Boolean isUpdate) {
		this.isUpdate = isUpdate;
	}

	public Boolean getIsGet() {
		return isGet;
	}

	public void setIsGet(Boolean isGet) {
		this.isGet = isGet;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Boolean getIsAdd() {
		return isAdd;
	}

	public void setIsAdd(Boolean isAdd) {
		this.isAdd = isAdd;
	}

	public Boolean getIsJoin() {
		return isJoin;
	}

	public void setIsJoin(Boolean isJoin) {
		this.isJoin = isJoin;
	}

	public Boolean getIsGroupBy() {
		return isGroupBy;
	}

	public void setIsGroupBy(Boolean isGroupBy) {
		this.isGroupBy = isGroupBy;
	}

	public Boolean getIsConditioned() {
		return isConditioned;
	}

	public void setIsConditioned(Boolean isConditioned) {
		this.isConditioned = isConditioned;
	}

	public Boolean getIsPaginated() {
		return isPaginated;
	}

	public void setIsPaginated(Boolean isPaginated) {
		this.isPaginated = isPaginated;
	}

	public Boolean getIsSorted() {
		return isSorted;
	}

	public void setIsSorted(Boolean isSorted) {
		this.isSorted = isSorted;
	}

	public List<QueryFieldBean> getGroupByFields() {
		return groupByFields;
	}

	public void setGroupByFields(List<QueryFieldBean> groupByFields) {
		this.groupByFields = groupByFields;
	}
	
	
	
}
