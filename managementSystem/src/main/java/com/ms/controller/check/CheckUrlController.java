package com.ms.controller.check;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/checkpage", method=RequestMethod.GET)
public class CheckUrlController {
	
	@RequestMapping("/checkbrand")
	public String checkBrand() {
		return "checkANDsubmit/check";
	}
	
}
