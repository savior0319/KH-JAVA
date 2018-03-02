package com.kh.java20_1;

public class Member implements Comparable<Member> {
	private String name, address;
	private int age;

	@Override
	public String toString() {
		return "�̸� : " + name + ", �ּ� : " + address + ", ����  :" + age;
	}
	public Member(String name, int age, String address) {
		setAddress(address);
		setAge(age);
		setName(name);
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	@Override
	public int compareTo(Member o) {
		//return this.age - o.getAge(); // ���� ��������
		return (this.name.compareTo(o.getName())); // ���� ��������
	}
}
