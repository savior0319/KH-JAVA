package kh.java.controller;

import java.util.Scanner;

import kh.java.model.Student;

public class StdMgr {
	Student[] s = new Student[3];

	Scanner sc = new Scanner(System.in);

	public StdMgr() {
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
		}
	}

	public void start() {
		while (true) {
			System.out.println("----------�޴�----------");
			System.out.println("1. �л����� �Է� (3��)");
			System.out.println("2. �л����� ��ȸ (3��)");
			System.out.println("3. ����");
			System.out.print("���� >> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				insertData();
				break;
			case 2:
				printData();
				break;
			case 3:
				programEnd();
				return;
			default:
				System.out.println("\n�޴��� �߸��Է� �߽��ϴ�!\n");
				break;
			}
		}
	}

	public void programEnd() {
		System.out.println("\n�� ���α׷��� �����մϴ�!");
	}

	public void insertData() {
		for (int i = 0; i < s.length; i++) {
			System.out.println("\n<" + (i + 1) + "��° �л����� �Է� >");
			System.out.print("�̸��� �Է��ϼ��� >> ");
			s[i].setName(sc.next());
			System.out.print("���̸� �Է��ϼ��� >> ");
			s[i].setAge(sc.nextInt());
			sc.nextLine();
			System.out.print("������ �Է��ϼ��� >> ");
			s[i].setGender(sc.next().charAt(0));
			System.out.print("�ּҸ� �Է��ϼ��� >> ");
			sc.nextLine();
			s[i].setAddr(sc.nextLine());
			System.out.print("�й��� �Է��ϼ��� >> ");
			s[i].setNumber(sc.nextInt());
			System.out.print("������ �Է��ϼ��� >> ");
			s[i].setGrade(sc.nextDouble());
			sc.nextLine();
			System.out.println("\n�� " + (i + 1) + "��° �л������� �ԷµǾ����ϴ�");
			
		}
		System.out.println("\n�� " + s.length + "���� �л� ������ �ԷµǾ����ϴ�!\n");

	}

	public void printData() {
		System.out.println("\n-----------------------�л����� ���-----------------------\n");
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
		System.out.println("�̸�\t\t����\t\t����\t\t�ּ�\t\t�й�\t\t����\t\t");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getName() + "\t\t" + s[i].getAge() + "\t\t" + s[i].getGender() + "\t\t"
					+ s[i].getAddr() + "\t\t" + s[i].getNumber() + "\t\t" + s[i].getGrade());
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
	}

}
