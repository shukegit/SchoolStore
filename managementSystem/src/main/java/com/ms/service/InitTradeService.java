package com.ms.service;

import java.util.List;

import com.ms.common.ServiceResponse;
import com.ms.pojo.FirTrade;
import com.ms.pojo.SecTrade;
import com.ms.pojo.ThiTrade;

public interface InitTradeService {

	/**
	 * 将业态信息传递到前台
	 */
	ServiceResponse<List<FirTrade>> selectFirTradeList();
	ServiceResponse<List<SecTrade>> selectSecTradeList();
	ServiceResponse<List<ThiTrade>> selectThiTradeList();
}
