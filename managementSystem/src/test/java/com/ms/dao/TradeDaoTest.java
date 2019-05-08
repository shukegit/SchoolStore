package com.ms.dao;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import com.ms.BaseTest;
import com.ms.pojo.FirTrade;
import com.ms.pojo.SecTrade;
import com.ms.pojo.ThiTrade;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TradeDaoTest extends BaseTest{

	@Autowired
	FirTradeDao firTradeDao;
	@Autowired
	SecTradeDao secTradeDao;
	@Autowired
	ThiTradeDao thiTradeDao;
	
	@Test	
	@Ignore
	public void testASelectFirTradeList() {
		List<FirTrade> firTradeDaoList = firTradeDao.selectFirTradeList(1);
		System.out.println(firTradeDaoList.size());
	}
	@Test
	@Ignore
	public void testBSelectSecTradeList() {
		List<SecTrade> secTradeDaoList = secTradeDao.selectSecTradeList(1);
		System.out.println(secTradeDaoList.size());
	}
	@Test
	
	public void testCSelectThiTradeList() {
		List<ThiTrade> thiTradeDaoList = thiTradeDao.selectThiTradeList(7);
		System.out.println(thiTradeDaoList.size());
	}
}
