package com.kh.java;

public class OverLoadingClass02 {

	private String name, addr = "정보가 없습니다", hobby = "없음";
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

		System.out.println("이름  : " + name);
		System.out.println(age == -1 ? "나이  : 정보가 없습니다" : "나이 : " + age);
		System.out.println("주소  : " + addr);
		System.out.println("취미  : " + hobby + "\n");
	}

}
