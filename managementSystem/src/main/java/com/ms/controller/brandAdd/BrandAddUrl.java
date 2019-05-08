package com.ms.controller.brandAdd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/brandAddPage")
@Controller
public class BrandAddUrl {

	@RequestMapping("/brandadd")
	public String brandAdd() {
		return "brandAdd/add1";
	}
}
