/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.persistence;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;

/**
 * 通用的服务提供类
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月2日 下午2:57:32
 */
@NoRepositoryBean
public interface GenericService<E, ID extends Serializable> extends GenericDao<E, ID> {

}
