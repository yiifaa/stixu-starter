/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.stixu.commons.web.TimeBasedAccessInterceptor;

/**
 * 
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月3日 下午12:09:18
 */
@Configuration
@ComponentScan(basePackages = "com.stixu",
	includeFilters = {@Filter(Controller.class), @Filter(RestController.class), @Filter(RestController.class)}
)
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {


	/**
	 * 添加请求拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new TimeBasedAccessInterceptor());
		super.addInterceptors(registry);
	}
	
}
