package com.ms.controller.check;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.common.ServiceResponse;
import com.ms.dto.PullDownTarget;
import com.ms.pojo.Brand;
import com.ms.pojo.BrandMaintain;
import com.ms.pojo.FirTrade;
import com.ms.pojo.SecTrade;
import com.ms.pojo.ThiTrade;
import com.ms.service.BrandSubmitService;
import com.ms.service.InitTradeService;
import com.ms.service.SelectTargetActionService;
import com.ms.util.HttpServletRequestUtil;

@RequestMapping("/checkpage")
@Controller
public class ChechResponseController {
	@Autowired
	InitTradeService initTradeService;
	@Autowired
	SelectTargetActionService selectTargetActionService;
	@Autowired
	BrandSubmitService brandSubmitService;
	/**
	 * 初始化下拉选择框
	 * @return
	 */
	@RequestMapping(value="/getoptioninfo", method=RequestMethod.GET)
	@ResponseBody
	private ServiceResponse<Map<String, Object>> getOptionInfo() {
		//初始化所需参数
		Map<String, Object> map = new HashMap<>();
		List<FirTrade> firTradeList = new ArrayList<>();
		List<SecTrade> secTradeList = new ArrayList<>();
		List<ThiTrade> thiTradeList = new ArrayList<>();
		
		try {
			//TODO 空与非空的判断
			firTradeList = initTradeService.selectFirTradeList().getData();
			secTradeList = initTradeService.selectSecTradeList().getData();
			thiTradeList = initTradeService.selectThiTradeList().getData();
			map.put("firTradeList", firTradeList);
			map.put("secTradeList", secTradeList);
			map.put("thiTradeList", thiTradeList);
			return ServiceResponse.createBySuccessData(map);
		} catch (Exception e) {
			map.put("errMsg", e.getMessage());
			System.out.println(e.getMessage());
			return ServiceResponse.createByErrorMessage(e.getMessage());
		}			
	}
	
	/**
	 * 选择框动态改变
	 * @return
	 */
	@RequestMapping(value="/changepulldowntarget", method=RequestMethod.POST)
	@ResponseBody
	private ServiceResponse<PullDownTarget> changePullDownTarget(HttpServletRequest request) {
		
		int firTradeId = HttpServletRequestUtil.getInt(request, "firTradeId");
		int secTradeId = HttpServletRequestUtil.getInt(request, "secTradeId");
		int thiTradeId = HttpServletRequestUtil.getInt(request, "thiTradeId");

		
		
		PullDownTarget pullDownTarget = new PullDownTarget(firTradeId, secTradeId, thiTradeId);
		
		ServiceResponse<PullDownTarget> serviceResponse = null;
		try {
			serviceResponse = selectTargetActionService.SelectTargetAction(pullDownTarget);
		} catch (Exception e) {
			return ServiceResponse.createByErrorMessage("系统错误:" + e.getMessage());
		}
		System.out.println(secTradeId);
		System.out.println(thiTradeId);
		System.out.println("test");
		return serviceResponse;
	}
	
	
	@RequestMapping(value="/getformdata", method=RequestMethod.POST)
	@ResponseBody
	private ServiceResponse<Map<String, Object>> getFormData(HttpServletRequest request) {
		
		Brand brand = new Brand();
		//将前台的参数传到brand对象中去
		brand = combine(request);
		
		int days = HttpServletRequestUtil.getInt(request, "days");
		//int pageIndex = HttpServletRequestUtil.getInt(request, "pageIndex");
		int pageIndex = 1;
		int pageSize = HttpServletRequestUtil.getInt(request, "pageSize");
		
		if(days < 0 || pageIndex <= 0 || pageSize <= 0) {
			return ServiceResponse.createByErrorMessage("天数或页码数或显示条数错误");
		}
		System.out.println("yes");
		ServiceResponse<Map<String, Object>> service = brandSubmitService.getBrandList(brand, days, pageIndex, pageSize);
		System.out.println("!!@#!@#!@" + service.getData().get("brandList").toString());
		
		return service;
		

	}
	
	private Brand combine(HttpServletRequest request) {
		//转换实体类失败，因此一个一个转换
//		String brandStr = HttpServletRequestUtil.getString(request, "brand");
//		Brand brand = null;
//		ObjectMapper mapper = new ObjectMapper();
//		try {
//			brand = mapper.readValue(brandStr, Brand.class);
//		} catch (JsonParseException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//		return brand;
		Brand brand = new Brand();
		BrandMaintain brandMaintain = new BrandMaintain();
		FirTrade firTrade = new FirTrade();
		SecTrade secTrade = new SecTrade();
		ThiTrade thiTrade = new ThiTrade();
		//拿不到对象就是-1或者“null”(是字符串的null，也就是x == “null”)
		String brandFirLetter = HttpServletRequestUtil.getString(request, "brandFirLetter");
		int firTradeId = HttpServletRequestUtil.getInt(request, "firTradeId");
		int secTradeId = HttpServletRequestUtil.getInt(request, "secTradeId");
		int thiTradeId = HttpServletRequestUtil.getInt(request, "thiTradeId");	
		String adminName = HttpServletRequestUtil.getString(request, "adminName");
		String brandGrade = HttpServletRequestUtil.getString(request, "brandGrade");
		int brandType = HttpServletRequestUtil.getInt(request, "brandType");
		String brandRunWay = HttpServletRequestUtil.getString(request, "brandRunWay");
		int brandAuditStatus = HttpServletRequestUtil.getInt(request, "brandAuditStatus");
		String brandChName = HttpServletRequestUtil.getString(request, "brandChName");
		if(brandFirLetter != "0") {
			brand.setBrandFirLetter(brandFirLetter);
		}
		if(brandGrade != null) {
			brand.setBrandGrade(brandGrade);
		}
		if(brandType != -1) {
			brand.setBrandType(brandType);
		}
		if(brandRunWay != null) {
			brand.setBrandRunWay(brandRunWay);
		}
		if(brandAuditStatus != -1) {
			brand.setBrandAuditStatus(brandAuditStatus);
		}
		if(brandChName != null) {
			brand.setBrandChName(brandChName);
		}
		if(adminName != null) {
			brandMaintain.setAdministrator(adminName);
			brand.setBrandMaintain(brandMaintain);
		}
		if(firTradeId != -1) {
			firTrade.setFirTradeId(firTradeId);
			brand.setFirTrade(firTrade);
		}
		if(secTradeId != -1) {
			secTrade.setSecTradeId(secTradeId);
			brand.setSecTrade(secTrade);
		}
		if(thiTradeId != -1) {
			thiTrade.setThiTradeId(thiTradeId);
			brand.setThiTrade(thiTrade);
		}
		return brand;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
