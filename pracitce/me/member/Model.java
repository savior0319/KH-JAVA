package me.member;

import java.io.Serializable;

public class Model implements Serializable{
	private static final long serialVersionUID = -4915084336735016787L;
	private String id, pwd;

	public String getId() {
		return id;
	} 

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
