package com.stixu.commons;

import java.util.Date;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stixu.commons.security.domain.Account;
import com.stixu.commons.security.service.AccountService;

@Controller
@RequestMapping("/")
public class HelloController {
	
	private AccountService accountService;
	
	@Inject
	public HelloController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	@RequestMapping("/detail/{id}")
	@ResponseBody
	public Account findById(@PathVariable("id") String id) {
		return this.accountService.findById(id);
	}
	
	@GetMapping("/home")
	@ResponseBody
	public Page<Account> home() {
		return this.accountService.findAll(new PageRequest(0, 10));
	}
	
	@GetMapping("/now")
	@ResponseBody
	public Date now() {
		return new Date();
	}
}
