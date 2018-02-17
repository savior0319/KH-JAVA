package me.java.test;

import java.util.Scanner;

public class CheckInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("\n숫자만 입력!\n");
			System.out.print("숫자입력 : ");
		}
		int value = sc.nextInt();
		
		System.out.print("\n입력한 숫자 : " + value);
	}
}
