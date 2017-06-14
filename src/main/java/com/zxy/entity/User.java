package com.zxy.entity;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * Create Date:	2017年6月14日 下午3:45:10
	 * @version:	redis V1.0.0
	 * @author:		Mr zxy
	 */
	private static final long serialVersionUID = 3269183010617962655L;

	private long id;
	private String userName;
	private Integer age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
