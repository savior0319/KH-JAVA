package com.kh.var.example;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);

	public void example1() {

		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();

		System.out.println();
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ �� : " + (num1 / num2));
		System.out.println("�������� ������ : " + (num1 % num2));
	}

	public void example2() {
		System.out.println();
		System.out.print("���� : ");
		double width = sc.nextInt();
		System.out.print("���� : ");
		double height = sc.nextInt();

		double area = width * height;
		double round = (width * 2) + (height * 2);

		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + round);

	}

	public void example3() {
		System.out.println();
		sc.nextLine();
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();

		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));
	}
}
