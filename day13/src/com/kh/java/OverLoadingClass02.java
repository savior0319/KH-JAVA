package com.kh.java;

public class OverLoadingClass02 {

	private String name, addr = "������ �����ϴ�", hobby = "����";
	private int age = -1;

	public OverLoadingClass02(String name, int age, String addr, String hobby) {
		this.name = name;
		this.addr = addr;
		this.hobby = hobby;
		this.age = age;
	}

	public OverLoadingClass02(String name, int age, String addr) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	public OverLoadingClass02(String name) {
		this.name = name;

	}

	public void printData() {

		System.out.println("�̸�  : " + name);
		System.out.println(age == -1 ? "����  : ������ �����ϴ�" : "���� : " + age);
		System.out.println("�ּ�  : " + addr);
		System.out.println("���  : " + hobby + "\n");
	}

}
