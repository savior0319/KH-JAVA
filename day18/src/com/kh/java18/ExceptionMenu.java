package com.kh.java18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMenu {

	private Scanner sc = new Scanner(System.in);

	public void menuPrint() {
		System.out.println("--------- �޴� ���� -----------");
		System.out.println("1. �ݰ����ϴ�.");
		System.out.println("2. ����������.");
		System.out.println("3. �� ������ ");
		System.out.print("�Է� : ");
	}

	public void ExceptionDemo1_Print(int choice) {
		switch (choice) {
		case 1:
			System.out.println("�ݰ����ϴ�");
			break;
		case 2:
			System.out.println("����������");
			break;
		case 3:
			System.out.println("�� ������");
			break;
		default:
			System.out.println("1~3 ���� �������ּ���");
		}

	}

	public void start() {
		int choice = 0;
		this.menuPrint();
		// while(!sc.hasNextInt()) {
		// sc.next();
		// System.out.println("���ڸ� �Է��ϼ���!");
		// System.out.print("�Է� : ");
		// }
		// choice = sc.nextInt();
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
		ExceptionDemo1_Print(choice);
	}
}
