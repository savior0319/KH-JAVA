package com.kh.java22;

import java.io.Serializable;

public class SerializableVO implements Serializable {
	private static final long serialVersionUID = 8633857264167192782L;
	private String name, addr;
	private int age;
	public SerializableVO(String name, int age, String addr) {
		this.addr = addr; this.age = age; this.name = name;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getAddr() {return addr;}
	public void setAddr(String addr) {this.addr = addr;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}
