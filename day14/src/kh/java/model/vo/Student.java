package kh.java.model.vo;

public class Student {
	private int age;
	private String name, addr;
	public Student() {}
	public Student(String name, int age, String addr) 
	{this.setAddr(addr);this.setAge(age);this.setName(name);}
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setAddr(String addr) {this.addr = addr;}
	public String getAddr() {return addr;}
}
