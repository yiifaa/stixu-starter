/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.persistence;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * 可持久化类的基本类, 建议所有的持久化类都从此类继承
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月2日 上午9:58:43
 */
public abstract class Domain<ID extends Serializable> implements Identifiable<ID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5459758638611617746L;
	
	  /*
     * (non-Javadoc)
     * 
     * @see secfox.soc.melon.persistence.Identifiable#hasId()
     */
    @Override
    public boolean hasId() {
        ID primaryKey = this.getId();
        if(primaryKey instanceof String) {
            return StringUtils.isNotBlank((String) primaryKey);
        }
        return primaryKey != null;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public abstract boolean equals(Object obj);
    
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public abstract int hashCode();
    
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public abstract String toString();

}
