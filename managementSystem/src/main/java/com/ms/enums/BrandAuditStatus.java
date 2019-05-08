package com.ms.enums;

public enum BrandAuditStatus {
	
	NO_CHECKED(-1, "未审核"),
	CHECNED(0, "审核中"),
	PASSED(1, "已通过"),
	NO_PASS(2, "未通过");
		
	private int state;
	private String stateInfo;
	
	private BrandAuditStatus(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}
	
	/**
	 * 依据传入的state返回相应的Enum值
	 */
	public static BrandAuditStatus stateBack(int state) {
		for(BrandAuditStatus brandAuditStatus : values()) {
			if(brandAuditStatus.getState() == state) {
				return brandAuditStatus;
			}
		}
		return null;
	}
}
