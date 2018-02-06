package com.kh.ex;

import java.util.Scanner;

public class CallClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3까지 숫자 입력 : ");
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("1을 입력했습니다");
			break;
		case 2:
			System.out.println("2을 입력했습니다");
			break;
		case 3:
			System.out.println("3을 입력했습니다");
			break;
		default:
			System.out.println("잘못된 값을 입력했습니다");
			break;
		}
		
	}
}
