package com.ms.service;

import java.util.List;
import java.util.Map;

import com.ms.common.ServiceResponse;
import com.ms.pojo.Brand;

public interface BrandSubmitService {
	
	/**
	 * 多条件查询
	 * @param brand
	 * @param days
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	ServiceResponse<Map<String, Object>> getBrandList(Brand brand, int days, int pageIndex, int pageSize);

}
