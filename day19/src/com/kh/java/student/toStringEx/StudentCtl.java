package com.kh.java.student.toStringEx;

public class StudentCtl {

	 Student[] st1 = new Student[10];
	 Student[] st2 = st1.clone();

	private int index = 0;

	public StudentCtl() {
		st1[index++] = new Student("d", 20, "a");
		st1[index++] = new Student("q", 30, "a");
		st1[index++] = new Student("g", 40, "a");
	
	}

	// public void print() {
	// System.out.println("─────────────── 정보 출력 ───────────────");
	// System.out.println("이름 \t\t나이\t\t주소");
	// for (int i = 0; i < index; i++) {
	// System.out.println(st[i].toString());
	// }
	// System.out.println("─────────────────────────────────────");
	// }
	
	Student search = new Student("q", 30, "a");
	
	public void search() {
		boolean isFlag = false;
		for(int i = 0; i < index; i++) {
			if(st1[i].equals(search)) {
				isFlag = true;
			} 
		} if (isFlag == false) {
			System.out.println("없음");
		} else {System.out.println("있음");}
	}
}
