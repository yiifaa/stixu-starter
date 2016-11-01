/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.stixu.commons.security.domain.Account;

/**
 * 
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月1日 下午4:26:37
 */
public interface AccountRepository extends CrudRepository<Account, String> {

}
