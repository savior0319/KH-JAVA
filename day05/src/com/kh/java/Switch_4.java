package com.kh.java;

import java.util.Scanner;

public class Switch_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("========�ָ޴�========");
		System.out.println("a. �Ұ������ --- 5000��");
		System.out.println("b. ������� ---  4000��");
		System.out.println("c. ġŲ���� ---  4500��");
		System.out.println("d. �ѿ���� --- 10000��");
		System.out.println("e.  ����� ---  7000��");
		System.out.println("====================");

		int pay = 0;
		char choice;
		String mMenu = null, sMenu = null;
		System.out.print("�� �޴� ���� : ");
		choice = sc.next().charAt(0);

		switch (choice) {
		case 'a':
			pay += 5000;
			mMenu = "�Ұ������";
			break;
		case 'b':
			pay += 4000;
			mMenu = "�������";
			break;
		case 'c':
			pay += 4500;
			mMenu = "ġŲ����";
			break;
		case 'd':
			pay += 10000;
			mMenu = "�ѿ�";
			break;
		case 'e':
			pay += 7000;
			mMenu = "�����";
			break;

		default:
			System.out.print("��ȣ�� �߸� �������ϴ�. \n������ �����մϴ�");
			System.exit(0);
		}

		System.out.println("\n=======���̵�޴�=======");
		System.out.println("1. �ݶ� ------- 1500��");
		System.out.println("2. ���̴� ------ 1500��");
		System.out.println("3. ��ũ����ũ --- 2500��");
		System.out.println("4. ����� ------ 3000��");
		System.out.println("=====================");
		System.out.print("���̵� �޴� ���� : ");
		choice = sc.next().charAt(0);

		switch (choice) {
		case '1':
			pay += 1500;
			sMenu = "�ݶ�";
			break;
		case '2':
			pay += 1500;
			sMenu = "���̴�";
			break;
		case '3':
			pay += 2500;
			sMenu = "��ũ����ũ";
			break;
		case '4':
			pay += 3000;
			sMenu = "�����";
			break;
		default:
			System.out.print("��ȣ�� �߸� �������ϴ�. \n������ �����մϴ�");
			System.exit(0);
		}
		System.out.print(mMenu + ", " + sMenu + "�� �� " + pay + "�Դϴ�.");
	}
}