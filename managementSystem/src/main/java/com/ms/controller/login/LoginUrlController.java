package com.ms.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/loginpage")
@Controller
public class LoginUrlController {
	
	@RequestMapping("/login")
	private String login() {
		return "login/login";
	}
}
