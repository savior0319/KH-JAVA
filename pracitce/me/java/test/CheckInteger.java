package me.java.test;

import java.util.Scanner;

public class CheckInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("\n���ڸ� �Է�!\n");
			System.out.print("�����Է� : ");
		}
		int value = sc.nextInt();
		
		System.out.print("\n�Է��� ���� : " + value);
	}
}
