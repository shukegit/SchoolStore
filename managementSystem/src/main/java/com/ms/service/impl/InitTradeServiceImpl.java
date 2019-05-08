package com.ms.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.common.ServiceResponse;
import com.ms.dao.FirTradeDao;
import com.ms.dao.SecTradeDao;
import com.ms.dao.ThiTradeDao;
import com.ms.pojo.FirTrade;
import com.ms.pojo.SecTrade;
import com.ms.pojo.ThiTrade;
import com.ms.service.InitTradeService;

@Service
public class InitTradeServiceImpl implements InitTradeService {

	@Autowired
	FirTradeDao firTradeDao;
	@Autowired
	SecTradeDao secTradeDao;
	@Autowired
	ThiTradeDao thiTradeDao;
	

	public ServiceResponse<List<FirTrade>> selectFirTradeList() {		
		try {
			List<FirTrade> firTradeList = firTradeDao.selectFirTradeList();
			if(firTradeList.size() > 0 && firTradeList != null) {
				return ServiceResponse.createBySuccessData(firTradeList);
			}
			return ServiceResponse.createByErrorMessage("查询失败");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ServiceResponse.createByErrorMessage("查询失败");
		}	
	}

	@Override
	public ServiceResponse<List<SecTrade>> selectSecTradeList() {
		
		try {
			List<SecTrade> secTradeList = secTradeDao.selectSecTradeList();	
			if(secTradeList.size() > 0 && secTradeList != null) {
				return ServiceResponse.createBySuccessData(secTradeList);
			}
			return ServiceResponse.createByErrorMessage("查询失败");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ServiceResponse.createByErrorMessage("查询失败");
		}
	}

	@Override
	public ServiceResponse<List<ThiTrade>> selectThiTradeList() {
		
		try {
			List<ThiTrade> thiTradeList = thiTradeDao.selectThiTradeList();				
			if(thiTradeList.size() > 0 && thiTradeList != null) {
				return ServiceResponse.createBySuccessData(thiTradeList);
			}
			return ServiceResponse.createByErrorMessage("查询失败");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ServiceResponse.createByErrorMessage("查询失败");
		}
	}

}
