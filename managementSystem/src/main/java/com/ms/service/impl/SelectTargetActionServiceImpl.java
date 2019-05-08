package com.ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.common.ServiceResponse;
import com.ms.dao.SecTradeDao;
import com.ms.dao.ThiTradeDao;
import com.ms.dto.PullDownTarget;
import com.ms.pojo.FirTrade;
import com.ms.pojo.SecTrade;
import com.ms.pojo.ThiTrade;
import com.ms.service.SelectTargetActionService;

@Service
public class SelectTargetActionServiceImpl implements SelectTargetActionService{
	@Autowired
	private SecTradeDao secTradeDao;
	@Autowired
	private ThiTradeDao thiTradeDao;
	
	
	
	@Override
	@Transactional
	public ServiceResponse<PullDownTarget> SelectTargetAction(PullDownTarget pullDownTarget) throws Exception {
		
		int firTradeId = pullDownTarget.getFirTradeId();
		int secTradeId = pullDownTarget.getSecTradeId();
		int thiTradeId = pullDownTarget.getThiTradeId();
		
		System.out.println("service:" + thiTradeId);
		
		List<FirTrade> firTrades = null;
		List<SecTrade> secTrades = null;
		List<ThiTrade> thiTrades = null;
		try {
			//说明点了第一个下拉选项
			if(secTradeId == -1 && thiTradeId == -1) {
				secTrades = secTradeDao.selectSecTradeList(firTradeId);
				int id = secTrades.get(0).getSecTradeId();
				thiTrades = thiTradeDao.selectThiTradeList(id);
			} else if(firTradeId == -1 && thiTradeId == -1){
				//说明点了第二个下拉框
				thiTrades = thiTradeDao.selectThiTradeList(secTradeId);
			} else {
				return ServiceResponse.createByErrorMessage("未知的错误！");
			}	
		} catch (RuntimeException e) {
			throw new Exception("error" + e.getMessage());
		}
		
		PullDownTarget pTarget = new PullDownTarget(firTrades, secTrades, thiTrades);
	
		return ServiceResponse.createBySuccessData(pTarget);
	}

}
