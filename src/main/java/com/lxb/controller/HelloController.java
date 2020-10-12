package com.lxb.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		 int a = 2/0;
		
		return "hello from liuxb, Exception";
	}

}
