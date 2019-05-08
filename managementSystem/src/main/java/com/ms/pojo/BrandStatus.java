package com.ms.pojo;

import java.util.Date;

public class BrandStatus {
	private int brandStatusId;
	private String completionDegree;
	private String currentStatus;
	private Date createTime;
	private Date lastEditTime;

	
	public int getBrandStatusId() {
		return brandStatusId;
	}
	public void setBrandStatusId(int brandStatusId) {
		this.brandStatusId = brandStatusId;
	}
	public String getCompletionDegree() {
		return completionDegree;
	}
	public void setCompletionDegree(String completionDegree) {
		this.completionDegree = completionDegree;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	
	
}
