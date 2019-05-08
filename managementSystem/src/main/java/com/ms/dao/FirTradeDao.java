package com.ms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ms.pojo.FirTrade;

public interface FirTradeDao {

	
	List<FirTrade> selectFirTradeList(); 
	
	List<FirTrade> selectFirTradeList(@Param("firTradeId")Integer firTradeId); 
}
