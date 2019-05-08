package com.ms.controller.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ms.common.ServiceResponse;
import com.ms.pojo.SystemManager;
import com.ms.service.LoginService;
import com.ms.util.HttpServletRequestUtil;

@RequestMapping("/loginpage")
@ResponseBody
public class LoginResponseController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/getlogininfo", method=RequestMethod.POST)
	private ServiceResponse<String> login(HttpServletRequest request) {
		
		
		String nickname = HttpServletRequestUtil.getString(request, "nickname");
		String password = HttpServletRequestUtil.getString(request, "password");//用户的密码不能是-1
		if(nickname == null || password == null) {
			return ServiceResponse.createByErrorMessage("用户名或密码错误");
		} 
		SystemManager manager = new SystemManager();
		manager.setNickname(nickname);
		manager.setPassword(password);
		
		return loginService.loginCheck(manager);
	}
}
