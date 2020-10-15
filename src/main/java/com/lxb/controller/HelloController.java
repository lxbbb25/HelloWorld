package com.lxb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxb.service.UserService;

/**
 * 
 * @author liuxb
 *
 * @Controller @RestController
 */

@RestController
//
// One Method to boot springboot.
// @EnableAutoConfiguration
//
public class HelloController {

	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public String Hello() {
		return "Hello from liuxb!";
	}

// When @EnableAutoConfiguration is added, static method main can start SpringMvc
//	public static void main(String[] args) {
//		SpringApplication.run(HelloController.class, args);
//	}

	@RequestMapping("/execp")
	public String execp() {
		int a = 2 / 0;

		return "hello from liuxb, Exception";
	}

	@GetMapping("/getuser")
	public Object getUser(Integer id) {
		return userService.getUserById(id);
	}

	@PostMapping("/add")
	public Object add(String username, String sex) {
		userService.insertUser(username, sex);
		return "SUCCESS";
	}

}
