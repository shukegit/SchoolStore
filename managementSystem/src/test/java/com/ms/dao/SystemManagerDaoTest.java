package com.ms.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ms.BaseTest;
import com.ms.pojo.SystemManager;

public class SystemManagerDaoTest extends BaseTest{

	@Autowired
	private SystemManagerDao systemManagerDao;
	
	@Test
	public void loginCheckTest() {
		SystemManager manager = new SystemManager();
		manager.setNickname("昵称1");
		manager.setPassword("123");
		int row = systemManagerDao.loginCheck(manager);
		System.out.println(row);
	}
}
