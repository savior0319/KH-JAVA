package com.kh.student;

import java.util.Scanner;

public class Student {
	private StudentData sm = new StudentData();
	private Scanner sc = new Scanner(System.in);

	public void start() {
		while (true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				insertData();
				break;
			case 2:
				printData();
				break;
			}
		}
	}

	public void insertData() {
		System.out.print("이름 입력 : ");
		sm.setName(sc.next());
		System.out.print("나이 입력 : ");
		sm.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("주소 입력 : ");
		sm.setAddr(sc.nextLine());
	}

	public void printData() {
		System.out.println("-------정보출력--------");
		System.out.println("이름 -> " + sm.getName());
		System.out.print("나이 -> " + sm.getAge());
		System.out.println("주소 -> " + sm.getAddr());
		System.out.println();
	}

}
