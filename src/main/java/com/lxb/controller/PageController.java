package com.lxb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/index")
	public String index(Model model) {
		List<String> list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		
		model.addAttribute("list", list);
		model.addAttribute("name", "刘小兵");
		
		return "index";
	}
}
