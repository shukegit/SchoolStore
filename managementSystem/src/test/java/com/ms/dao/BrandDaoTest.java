package com.ms.dao;


import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ms.BaseTest;
import com.ms.pojo.Brand;
import com.ms.pojo.BrandMaintain;
import com.ms.pojo.BrandOwner;
import com.ms.pojo.FirTrade;

public class BrandDaoTest extends BaseTest{
	
	@Autowired
	private BrandDao brandDao;
	
	@Test
	@Ignore
	public void insertTest() {
		Brand brand = new Brand();
		BrandOwner brandOwner = new BrandOwner();
		brandOwner.setUserId(1);
		brand.setBrandOwner(brandOwner);
		brand.setBrandChName("测试7");
		brand.setBrandGrade("一线");
		brand.setBrandType(1);
		brand.setBrandRunWay("运营方式");
		brand.setBrandPhone("123123");
		brand.setBrandLogo("这是一个路径");
		brand.setBrandAuditStatus(-1);
		brand.setCreateTime(new Date());
		brand.setBrandFirLetter("A");
		int row = brandDao.insertBrand(brand);
		if(row > 0)
		{
			System.out.println("yes");
		}		
	}
	
	@Test
	@Ignore
	public void updateTest() {
		Brand brand = new Brand();
		brand.setBrandId(1);
		brand.setBrandEnName("update后的产品名称");
		brand.setLastEditTime(new Date());
		int row = brandDao.updateBrand(brand);
		if(row > 0) {
			System.out.println("success in update!");
		}
	}
	
	@Test
	@Ignore
	public void selectBychName() {
		String chname = "测试一";
		Brand brand = brandDao.selectBrandByName(chname);
		System.out.println(brand.getBrandEnName());
	}
	
	@Test
	@Ignore
	public void deleteBychName() {
		String chName = "测试一";
		int row = brandDao.deleteBrand(chName);
		if(row > 0) {
			System.out.println("success to delete!");
		}
	}
	
	@Test
	
	public void testGetBrandList() {
		
		Brand brand = new Brand();
		brand.setBrandChName("测试");

		FirTrade firTrade = new FirTrade();
		BrandMaintain brandMaintain = new BrandMaintain();
		brandMaintain.setAdministrator("静静");
		brand.setBrandMaintain(brandMaintain);
		firTrade.setFirTradeId(3);
		brand.setFirTrade(firTrade);
		brand.setBrandFirLetter("D");
		brand.setBrandGrade("三线");
		brand.setBrandRunWay("运营方式");
		brand.setBrandAuditStatus(2);
		
		List<Brand> brandList = brandDao.selectBrandList(brand, 1, 0, 5);
		System.out.println(brandList.size());
	}
	
	
	
	
	
	
	
	
}
