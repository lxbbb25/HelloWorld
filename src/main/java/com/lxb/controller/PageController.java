package com.lxb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("name", "刘小兵");
		
		return "index";
	}
}
