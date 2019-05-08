package com.ms.dto;

import java.util.List;

import com.ms.pojo.FirTrade;
import com.ms.pojo.SecTrade;
import com.ms.pojo.ThiTrade;

public class PullDownTarget {

	private int firTradeId;
	private int secTradeId;
	private int thiTradeId;
	
	private List<FirTrade> firTradeList;
	private List<SecTrade> secTradeList;
	private List<ThiTrade> thiTradeList;
	
	public PullDownTarget() {
		
	}
	public PullDownTarget(int firTradeId) {
		this.firTradeId = firTradeId;
		}
	public PullDownTarget(int secTradeId, int thiTradeId) {
		this.secTradeId = secTradeId;
		this.secTradeId = secTradeId;
	}
	public PullDownTarget(int firTradeId, int secTradeId, int thiTradeId) {
		this.firTradeId = firTradeId;
		this.secTradeId = secTradeId;
		this.thiTradeId = thiTradeId;
	}
	public PullDownTarget(List<ThiTrade> thiTradeList) {
		this.thiTradeList = thiTradeList;
	}
	public PullDownTarget(List<SecTrade> secTradeList, List<ThiTrade> thiTradeList) {
		this.secTradeList = secTradeList;
		this.thiTradeList = thiTradeList;	
	}
	public PullDownTarget(List<FirTrade> firTradeList, List<SecTrade> secTradeList, List<ThiTrade> thiTradeList) {
		this.firTradeList = firTradeList;
		this.secTradeList = secTradeList;
		this.thiTradeList = thiTradeList;
	}
	public int getFirTradeId() {
		return firTradeId;
	}
	public int getSecTradeId() {
		return secTradeId;
	}
	public int getThiTradeId() {
		return thiTradeId;
	}
	public List<FirTrade> getFirTradeList() {
		return firTradeList;
	}
	public List<SecTrade> getSecTradeList() {
		return secTradeList;
	}
	public List<ThiTrade> getThiTradeList() {
		return thiTradeList;
	}
}

