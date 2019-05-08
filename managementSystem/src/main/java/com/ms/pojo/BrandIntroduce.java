package com.ms.pojo;

import java.util.Date;

public class BrandIntroduce {
	private int brandIntroduceId;
	private String brandChName;
	private String brandIntroduce;
	private String brandOther;
	private Date createTime;
	private Date lastEditTime;
	public int getBrandIntroduceId() {
		return brandIntroduceId;
	}
	public void setBrandIntroduceId(int brandIntroduceId) {
		this.brandIntroduceId = brandIntroduceId;
	}
	public String getBrandChName() {
		return brandChName;
	}
	public void setBrandChName(String brandChName) {
		this.brandChName = brandChName;
	}
	public String getBrandIntroduce() {
		return brandIntroduce;
	}
	public void setBrandIntroduce(String brandIntroduce) {
		this.brandIntroduce = brandIntroduce;
	}
	public String getBrandOther() {
		return brandOther;
	}
	public void setBrandOther(String brandOther) {
		this.brandOther = brandOther;
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
