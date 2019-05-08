package com.ms.pojo;

import java.util.Date;

public class BrandMaintain {
	private int brandMaintainId;
	private String founder;
	private String administrator;
	private String contributor;
	private Date createTime;
	private Date lastEditTime;
	public int getBrandMaintainId() {
		return brandMaintainId;
	}
	public void setBrandMaintainId(int brandMaintainId) {
		this.brandMaintainId = brandMaintainId;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	public String getContributor() {
		return contributor;
	}
	public void setContributor(String contributor) {
		this.contributor = contributor;
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
