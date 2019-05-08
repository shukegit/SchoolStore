package com.ms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.common.ServiceResponse;
import com.ms.dao.SystemManagerDao;
import com.ms.pojo.SystemManager;
import com.ms.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private SystemManagerDao systemManagerDao;
	
	@Override
	public ServiceResponse<String> loginCheck(SystemManager manager) {
		int row = systemManagerDao.loginCheck(manager);
		if(row > 0) {
			return ServiceResponse.createBySuccess();
		}
		return ServiceResponse.createByError();
	}

}
