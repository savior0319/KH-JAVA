package kh.java.controller;

import java.util.Scanner;
import kh.java.model.Student;

public class StdMgr {
	Student s = new Student();
	Scanner sc = new Scanner(System.in);

	public void start() {
		while (true) {
			System.out.println("======<�޴�>======");
			System.out.println("1. �л� ���� �Է� ");
			System.out.println("2. �л� ���� ��� ");
			System.out.println("3. ���α׷� ����");
			System.out.print("���� >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				insertData();
				break;
			case 2:
				printData();
				break;
			case 3:
				programEnd();
				return;
			}
		}
	}
	
	public void programEnd() {
		System.out.println("\n�����α׷��� �����մϴ�!");
	}

	public void insertData() {
		System.out.print("\n�̸��� �Է��ϼ��� -> ");
		s.setName(sc.next());
		System.out.print("���̸� �Է��ϼ��� -> ");
		s.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("������ �Է��ϼ��� -> ");
		s.setGender(sc.next().charAt(0));
		sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ��� -> ");
		s.setAddr(sc.nextLine());
		System.out.print("�й��� �Է��ϼ��� -> ");
		s.setNumber(sc.nextInt());
		sc.nextLine();
		System.out.print("������ �Է��ϼ��� -> ");
		s.setGrade(sc.nextDouble());
		System.out.println();
	}

	public void printData() {
		System.out.println("\n-------------------------------------"
				+ "----------------------------------------------------------");
		System.out.println("�̸�\t\t����\t\t����\t\t�ּ�\t\t�й�\t\t����\t\t");
		System.out.println(s.getName() + "\t\t" + s.getAge() + "��\t\t" + s.getGender() + "\t\t" + s.getAddr() + "\t\t"
				+ s.getNumber() + "\t\t" + s.getGrade() + "��\t\t");
		System.out.println("-------------------------------------"
				+ "----------------------------------------------------------\n");
	}
}
