package com.kh.java.student.toStringEx;

public class Student {
	
	private String name, addr;
	private int age;
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getAddr() {return addr;}
	public void setAddr(String addr) {this.addr = addr;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	public Student() {}
	public Student(String name, int age, String addr) {
		super();
		setAddr(addr); setAge(age); setName(name);
	}
	
	@Override
	public String toString() {
		return name + "\t\t" + age + "\t\t" + addr;
	}
}
