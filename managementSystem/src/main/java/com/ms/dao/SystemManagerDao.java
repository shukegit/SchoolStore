package com.ms.dao;

import org.apache.ibatis.annotations.Param;

import com.ms.pojo.SystemManager;

public interface SystemManagerDao {

	/**
	 * 登录验证
	 * @param manager
	 * @return
	 */
	int loginCheck(@Param("manager")SystemManager manager);
}
