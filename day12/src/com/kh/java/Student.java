package com.kh.java;

import java.util.Scanner;

public class Student {
	String name, addr;
	int age;
	public void stdInsert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� �̸� �Է� : ");
		name = sc.next();
		System.out.print("�л� ���� �Է� : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("�л� �ּ� �Է� : ");
		addr = sc.nextLine();
	}

	public void stdPrint() {
		System.out.println();
		System.out.println("----------�������----------");
		System.out.println("�̸�\t����\t�ּ�");
		System.out.print(name + "\t" + age + "\t" + addr);
		System.out.println("-------------------------");
	}
}
