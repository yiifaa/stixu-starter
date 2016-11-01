package com.stixu.commons;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
	
	private String message;
	
	@Inject
	public HelloController(@Named("username")String message) {
		super();
		this.message = message;
	}

	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return this.message;
	}
	
	@GetMapping("/home")
	public String home() {
		return "default";
	}
	
}
