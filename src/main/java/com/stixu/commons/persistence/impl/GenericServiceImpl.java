/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.persistence.impl;

import java.io.Serializable;

import com.stixu.commons.persistence.GenericDao;
import com.stixu.commons.persistence.GenericService;
import com.stixu.commons.persistence.Identifiable;

/**
 * 
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月2日 下午2:59:15
 */
public abstract class GenericServiceImpl<E extends Identifiable<ID>, ID extends Serializable> implements GenericService<E, ID> {

	 protected abstract GenericDao<E, ID> getDao();
	
}
