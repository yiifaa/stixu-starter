/*
 * (c) Copyright 2016 STI eXtrem Using技术小组
 * http://www.stixu.com
 */
package com.stixu.commons.formatter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * 
 * @author <a href="mailto:yiifaa@163.com>甘焕</a> 
 * @since 1.0
 * 2016年11月3日 上午11:39:46
 */
@JsonComponent
public class DateJsonFormatter {

	public static class DateSerializer extends JsonSerializer<Date> {

		/* (non-Javadoc)
		 * @see com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
		 */
		@Override
		public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider)
				throws IOException, JsonProcessingException {
			String resultStr = "";
			if(value != null) {
				resultStr = (new SimpleDateFormat("YYYY-MM-dd")).format(value);  
		    }
	        jgen.writeString(resultStr);  			
		}
		
	}
}
