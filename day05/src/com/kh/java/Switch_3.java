package com.kh.java;

import java.util.Scanner;

public class Switch_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==========�޴�==========");
		System.out.println("1. ������ ---------1000�� ");
		System.out.println("2. ��   �� ---------2000�� ");
		System.out.println("3. ��   �� ---------1000�� ");
		System.out.println("4. ��   �� ---------2000�� ");
		System.out.println("5. Ƣ   �� ---------3000�� ");
		System.out.println("6. ��Ƣ�� ---------8000�� ");
		System.out.println("=======================");

		System.out.print("\n�޴����� : ");
		int menu = sc.nextInt(); // menu ���� �� �Է� 

		switch (menu) {
		case 1: // 1�� ���� ���� ��
			System.out.println("1. �����̴� 1000���Դϴ�");
			break;
		case 2: // 2�� ���� ���� ��
			System.out.println("2. ����� 2000���Դϴ�");
			break;
		case 3: // 3�� ���� ���� ��
			System.out.println("3. ���� 1000���Դϴ�");
			break;
		case 4: // 4�� ���� ���� ��
			System.out.println("4. ����� 2000���Դϴ�");
			break;
		case 5: // 5�� ���� ���� ��
			System.out.println("5. Ƣ���� 3000���Դϴ�");
			break;
		case 6: // 6�� ���� ���� ��
			System.out.println("6. ��Ƣ���� 8000���Դϴ�");
			break;
		default: // �޴��� ���� ��ȣ ������ ��
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�");
			break;

		}
	}
}
