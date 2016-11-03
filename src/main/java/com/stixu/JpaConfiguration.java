/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.stixu.commons.security.domain.Account;

/**
 * 
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月1日 下午4:49:32
 */
@Configuration
@EntityScan(basePackageClasses={Account.class})
@ComponentScan(basePackages = "com.stixu",
includeFilters = {@Filter(Repository.class), @Filter(Service.class)}
)
public class JpaConfiguration {

}
