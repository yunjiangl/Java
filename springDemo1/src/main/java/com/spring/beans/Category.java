package com.spring.beans;

import org.springframework.stereotype.Component;


/**
 * 
 * @since 2017年9月15日17:11:29
 * 
 * @author 芸江
 *
 */
@Component("c")
public class Category {
	
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
