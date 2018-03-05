package com.kh.hashmapStudent;

public class Student {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	@Override
	public String toString() {
		return classNumber + "\t" + name + "\t" + age;
	}

	private String name;
	private int age, classNumber;

	public Student() {
	}

	public Student(int classNumber, String name, int age) {
		this.classNumber = classNumber; this.age = age; this.name = name;
	}

}
