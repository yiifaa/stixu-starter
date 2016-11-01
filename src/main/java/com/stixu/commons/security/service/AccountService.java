/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.security.service;

import com.stixu.commons.security.domain.Account;

/**
 * 
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月1日 下午4:30:14
 */
public interface AccountService {

	Account findById(String id);

	void persist(Account account);

}
