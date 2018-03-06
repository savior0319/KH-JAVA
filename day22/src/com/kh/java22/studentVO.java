package com.kh.java22;

public class studentVO {
	private String name, address;
	private int age;
	private final String desktopPath = System.getProperty("user.home") + "/Desktop/Student.txt"; 
	public String getDesktopPath() {return desktopPath;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}
