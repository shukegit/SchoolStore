package com.ms.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.common.ServiceResponse;
import com.ms.dao.BrandDao;
import com.ms.pojo.Brand;
import com.ms.service.BrandSubmitService;
import com.ms.util.PageTransformUtil;

@Service
public class BrandSubmitServiceImpl implements BrandSubmitService{

	@Autowired
	private BrandDao brandDao;
	
	@Override
	public ServiceResponse<Map<String, Object>> getBrandList(Brand brand, int days, int pageIndex, int pageSize) {
		List<Brand> brandList = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		int rowIndex = PageTransformUtil.transformPageIndexToRowIndex(pageIndex, pageSize);
		try {
			brandList = brandDao.selectBrandList(brand, days, rowIndex, pageSize);
			map.put("brandList", brandList);
		} catch(Exception e) {
			return ServiceResponse.createByErrorMessage("dao error");
		}	
		return ServiceResponse.createBySuccessData(map);
	}

}
