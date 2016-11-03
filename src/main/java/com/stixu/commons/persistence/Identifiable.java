/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.persistence;

import java.io.Serializable;

/**
 * 
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月2日 上午9:56:12
 */
public interface Identifiable<ID extends Serializable> extends Serializable {
	
	/**
     * 获取实体类的主键
     * 
     * @return 主键
     */
    ID getId();
    
    /**
     * 判断主键是否已设置
     * 
     * @return 主键是否已设置
     */
    boolean hasId();
    
    /**
     * 设置主键
     * 
     * @param id 主键
     */
    void setId(ID id);
    
}
