package com.kh.java;

import java.util.Scanner;

public class Switch_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*********����*********");
		System.out.println("*    ��� - 1000��          *");
		System.out.println("*    �ٳ��� - 3000��       *");
		System.out.println("*    ������ - 2000��       *");
		System.out.println("*    Ű�� - 5000��          *");
		System.out.println("*********************");
		
		System.out.print("\n�����̸� �Է� : ");
		String fName = sc.nextLine(); 
		System.out.println();
		
		switch (fName) {
		case "���":
			System.out.print("����� ������ 1000���Դϴ�");
			break;
		case "�ٳ���":
			System.out.print("�ٳ����� ������ 3000���Դϴ�");
			break;
		case "������":
			System.out.print("�������� ������ 2000���Դϴ�");
			break;
		case "Ű��":
			System.out.print("Ű���� ������ 5000���Դϴ�");
			break;
		}
	}
}
