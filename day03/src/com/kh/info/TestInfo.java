package com.kh.info;

import java.util.Scanner;

public class TestInfo {
	public void student() {
		Scanner sc = new Scanner(System.in);

		String name;
		int age;
		double kor, eng, math, avg;

		System.out.print("�л��� �̸� �Է� : ");
		name = sc.nextLine();
		System.out.print("�л��� ���� �Է� : ");
		age = sc.nextInt();
		System.out.print("�л��� �������� �Է� : ");
		kor = sc.nextDouble();
		System.out.print("�л��� �������� �Է� : ");
		eng = sc.nextDouble();
		System.out.print("�л��� �������� �Է� : ");
		math = sc.nextDouble();

		avg = (kor + eng + math) / 3;
		String avg2f = String.format("%.2f", avg);

		System.out.println();
		System.out.println(name + "!! ����� " + age + "���̱���");
		System.out.println("���������� " + kor + "��");
		System.out.println("���������� " + eng + "��");
		System.out.println("���������� " + math + "��");
		System.out.println("��������� " + avg2f + "��");

	}
}
