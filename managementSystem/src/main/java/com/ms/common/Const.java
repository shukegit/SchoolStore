package com.ms.common;

public class Const {
	public enum BrandAuditStatus {
	    UNCHECK(-2, "未审核"),
	    CHECK(-1, "审核中"),
	    PASS(1, "审核通过"),
	    NO_PASS(-10, "审核未通过");//参数错误

	    private final int code;
	    private final String desc;

	    BrandAuditStatus(int code, String desc) {
	        this.code = code;
	        this.desc = desc;
	    }
	    
	    public int getCode() {
	        return code;
	    }

	    public String getDesc() {
	        return desc;
	    }

	}
	 
}

