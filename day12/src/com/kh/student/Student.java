package com.kh.student;

import java.util.Scanner;

public class Student {
	private StudentData sm = new StudentData();
	private Scanner sc = new Scanner(System.in);

	public void start() {
		while (true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ���� ���");
			System.out.print("���� >> ");
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
		System.out.print("�̸� �Է� : ");
		sm.setName(sc.next());
		System.out.print("���� �Է� : ");
		sm.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("�ּ� �Է� : ");
		sm.setAddr(sc.nextLine());
	}

	public void printData() {
		System.out.println("-------�������--------");
		System.out.println("�̸� -> " + sm.getName());
		System.out.print("���� -> " + sm.getAge());
		System.out.println("�ּ� -> " + sm.getAddr());
		System.out.println();
	}

}
