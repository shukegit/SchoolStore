package com.ms.service;

import com.ms.common.ServiceResponse;
import com.ms.pojo.SystemManager;

public interface LoginService {
	
	ServiceResponse<String> loginCheck(SystemManager manager);

}
