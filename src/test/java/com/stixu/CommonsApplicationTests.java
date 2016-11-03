package com.stixu;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.hamcrest.core.IsNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.common.collect.Lists;
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
	
	@Ignore
	@Test
	public void sortByName() {
		Iterable<Account> accounts = accountService.findAll(new Sort(Lists.newArrayList(new Order(Direction.DESC, "username"))));
		System.out.println(accounts);
		Page<Account> accountPage = accountService.findAll(new PageRequest(0, 10));
		System.out.println(accountPage.getTotalPages());
	}
	
	@Test
	public void testStat() {
		List<Object[]> result = accountService.statByUsername();
		for(Object[] objs : result){
			System.out.println(objs[0]);
			System.out.println(objs[1]);
		}
	}
	
	@Test
	public void testLike() {
		List<Account> accounts = accountService.findByUsername("s");
		for(Account acc : accounts) {
			System.out.println(acc);
		}
	}
	
	
}
