package kh.java.controller;

import kh.java.model.vo.Student;

public class StuMgr {
	private Student[] stu = new Student[10];
	private int num = 0;

	public StuMgr() {
	}

	public void insertStudent(Student stu) {
		try {
			this.stu[num] = stu;
			num++;
		} catch (Exception e) {
		}
	}

	public void deleteStudent(String name) {
		int k = 0;
		for (int i = 0; i < num; i++) {
			if (stu[i].getName().equals(name)) {
				k = i;
			} 
		}
		for (int j = k; j < num - 1; j++) {
			stu[j] = stu[j + 1];
		}
		num--;
	}

	public void viewAllStudent() {
		System.out.println("────────학생 정보 출력────────");
		System.out.println("이름\t나이\t주소");
		for (int i = 0; i < num; i++) {
			System.out.println(stu[i].getName() + "\t" + stu[i].getAge() + "\t" + stu[i].getAddr());
		}
		System.out.println("─────────────────────────");
	}
}
