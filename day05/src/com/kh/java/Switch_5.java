package com.kh.java;

import java.util.Scanner;

public class Switch_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고 싶은 달을 입력하시오 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print(month + "월달은 31일까지 있습니다.");
			break;
		case 2: 
			System.out.print(month + "월달은 28일까지 있습니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.print(month + "월달은 30일까지 있습니다.");
			break;
		default :
			System.out.print("1~12까지의 숫자 입력하세요");
		}
	}
}
