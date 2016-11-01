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
		account.setUsername("guest");
		accountService.persist(account);
	}
	
	//	@Ignore
	@Test
	public void testById() {
		Account account = accountService.findById("17e61b76-32a3-4c7f-8f11-7455e036cb91");
		assertThat(account, IsNull.notNullValue());
	}

}
