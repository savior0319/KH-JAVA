package com.kh.java;

import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------�ʱ�޴�-------");
		System.out.printf("%12s","1. �Է�\n");
		System.out.printf("%12s","2. ����\n");
		System.out.printf("%12s","3. ��ȸ\n");
		System.out.printf("%12s","4. ����\n");
		System.out.printf("%12s","0. ����\n");
		System.out.println("--------------------");
		
		System.out.print("�޴� ��ȣ �Է� : ");
		int select = sc.nextInt(); // �޴� ��ȣ select ������ �Է�
		
		switch (select) {
		case 1: // 1�� �޴� �� ��
			System.out.println("�Է¸޴�����");
			break;
		case 2: // 2�� �޴� �� ��
			System.out.println("�����޴�����");
			break;
		case 3: // 3�� �޴� �� ��
			System.out.println("��ȸ�޴�����");
			break;
		case 4: // 4�� �޴� �� ��
			System.out.println("�����޴�����");
			break;
		case 0: // 0�� �޴� �� ��
			System.out.println("���α׷��� �����մϴ�");
			break;
		default: // �޴��� ���� ��ȣ ������ �� 
			System.out.println("��ȣ�� �߸� �����̽��ϴ�");
			break;
		}
	}

}
