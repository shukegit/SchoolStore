package com.ms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ms.pojo.ThiTrade;

public interface ThiTradeDao {

	
	List<ThiTrade> selectThiTradeList();
	
	List<ThiTrade> selectThiTradeList(@Param("secTradeId")Integer secTradeId);
}
