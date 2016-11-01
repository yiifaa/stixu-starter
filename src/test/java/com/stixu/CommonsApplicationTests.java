package com.stixu;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.hamcrest.core.IsNull;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stixu.commons.security.domain.Account;
import com.stixu.commons.security.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonsApplicationTests {

	@Resource
	private AccountService accountService;
	
	@Ignore
	@Test
	public void contextLoads() {
		assertThat(accountService, IsNull.notNullValue());
		Account account = new Account();
		account.setUsername("administrator");
		accountService.persist(account);
	}
	
	@Test
	public void testById() {
		Account account = accountService.findById("8a488566581f0b3201581f0b37f10000");
		assertThat(account, IsNull.notNullValue());
	}

}
