/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.security.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
		return this.accountDao.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.stixu.commons.security.service.AccountService#findAll(org.springframework.data.domain.Sort)
	 */
	@Override
	public Iterable<Account> findAll(Sort sort) {
		return accountDao.findAll(sort);
	}

	/* (non-Javadoc)
	 * @see com.stixu.commons.security.service.AccountService#findAll(org.springframework.data.domain.Pageable)
	 */
	@Override
	public Page<Account> findAll(Pageable page) {
		return accountDao.findAll(page);
	}

	/* (non-Javadoc)
	 * @see com.stixu.commons.security.service.AccountService#statByUsername()
	 */
	@Override
	public List<Object[]> statByUsername() {
		return accountDao.statByUsername();
	}

	/* (non-Javadoc)
	 * @see com.stixu.commons.security.service.AccountService#findByUsername(java.lang.String)
	 */
	@Override
	public List<Account> findByUsername(String username) {
		return accountDao.findByUsername(username);
	}
}
