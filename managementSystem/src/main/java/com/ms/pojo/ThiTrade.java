package com.ms.pojo;

public class ThiTrade {
	
	private int thiTradeId;
	private String thiTradeDesc;
	private int secTradeId;
	private int priority;
	private SecTrade secTrade;
	public int getThiTradeId() {
		return thiTradeId;
	}
	public void setThiTradeId(int thiTradeId) {
		this.thiTradeId = thiTradeId;
	}
	public String getThiTradeDesc() {
		return thiTradeDesc;
	}
	public void setThiTradeDesc(String thiTradeDesc) {
		this.thiTradeDesc = thiTradeDesc;
	}
	public int getSecTradeId() {
		return secTradeId;
	}
	public void setSecTradeId(int secTradeId) {
		this.secTradeId = secTradeId;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public SecTrade getSecTrade() {
		return secTrade;
	}
	public void setSecTrade(SecTrade secTrade) {
		this.secTrade = secTrade;
	}

	

}
