package com.ms;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * 用SpringJUnit4ClassRunner.class启动单元测试
 * @ContextConfiguration表示启动那个类时加载后面的文件
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件在哪儿
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
