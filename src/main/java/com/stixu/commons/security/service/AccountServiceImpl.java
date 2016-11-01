/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.security.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.stixu.commons.security.domain.Account;
import com.stixu.commons.security.repository.AccountRepository;

/**
 * 
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月1日 下午4:30:37
 */
@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountDao;

	@Inject
	public AccountServiceImpl(AccountRepository accountDao) {
		super();
		this.accountDao = accountDao;
	}
	
	@Override
	public void persist(Account account) {
		this.accountDao.save(account);
	}
	
	@Override
	public Account findById(String id) {
		return this.accountDao.findOne(id);
	}
}
