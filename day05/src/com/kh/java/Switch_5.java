package com.kh.java;

import java.util.Scanner;

public class Switch_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ� : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print(month + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2: 
			System.out.print(month + "������ 28�ϱ��� �ֽ��ϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.print(month + "������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		default :
			System.out.print("1~12������ ���� �Է��ϼ���");
		}
	}
}
