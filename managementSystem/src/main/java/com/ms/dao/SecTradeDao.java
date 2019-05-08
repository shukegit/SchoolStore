package com.ms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ms.pojo.SecTrade;

public interface SecTradeDao {
	
	List<SecTrade> selectSecTradeList();
	
	List<SecTrade> selectSecTradeList(@Param("firTradeId")Integer firTradeId);

}
