package com.ms.pojo;

public class SecTrade {

	private int secTradeId;
	private String secTradeDesc;
	private int firTradeId;
	private int priority;
	
	private FirTrade firTrade;
	
	public int getSecTradeId() {
		return secTradeId;
	}
	public void setSecTradeId(int secTradeId) {
		this.secTradeId = secTradeId;
	}
	public String getSecTradeDesc() {
		return secTradeDesc;
	}
	public void setSecTradeDesc(String secTradeDesc) {
		this.secTradeDesc = secTradeDesc;
	}
	public int getFirTradeId() {
		return firTradeId;
	}
	public void setFirTradeId(int firTradeId) {
		this.firTradeId = firTradeId;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public FirTrade getFirTrade() {
		return firTrade;
	}
	public void setFirTrade(FirTrade firTrade) {
		this.firTrade = firTrade;
	}
	
	

}
