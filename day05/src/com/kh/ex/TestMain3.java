package com.kh.ex;

import java.util.Scanner;

public class TestMain3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일 수를 알고 싶은 달을 입력하시오 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print(month + "월달은 31일 까지 있습니다");
			break;
		case 2: 
			System.out.print(month + "월달은 28일 까지 있습니다");
			break;
		default:
			System.out.print(month + "월달은 30일 까지 있습니다");
			break;
		}
	}
}
