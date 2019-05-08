package com.ms.service;

import com.ms.common.ServiceResponse;
import com.ms.dto.PullDownTarget;

public interface SelectTargetActionService {
	
	ServiceResponse<PullDownTarget> SelectTargetAction(PullDownTarget pullDownTarget) throws Exception;

}
