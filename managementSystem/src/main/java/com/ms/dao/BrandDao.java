package com.ms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ms.pojo.Brand;

public interface BrandDao {

	/**
	 * 添加品牌信息
	 */
	int insertBrand(Brand brand);
	/**
	 * 根据品牌中文名删除品牌信息
	 */
	int deleteBrand(String chName);
	/**
	 * 修改品牌信息
	 */
	int updateBrand(Brand brand);
	/**
	 * 按照品牌名查询某个品牌信息
	 */
	Brand selectBrandByName(String name);
	
	/**
	 * 多条件查询并分页
	 * @param brand
	 * @param days
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	List<Brand> selectBrandList(@Param("brand")Brand brand, @Param("days")int days, @Param("rowIndex")int rowIndex, @Param("pageSize")int pageSize);
}
