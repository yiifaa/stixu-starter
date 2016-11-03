/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.stixu.commons.persistence.GenericDao;
import com.stixu.commons.security.domain.Account;

/**
 * 
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月1日 下午4:26:37
 */

public interface AccountRepository extends GenericDao<Account, String> {

	//@Query("select acc.username, count(acc.id) from Account acc group by acc.username")
	List<Object[]> statByUsername();
	
	@Query("select acc from Account acc where acc.username like %?1%")
	List<Account> findByUsername(String username);
	
}
