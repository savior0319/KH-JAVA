package com.kh.java;

import java.util.Scanner;

public class Switch_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------초기메뉴-------");
		System.out.printf("%12s","1. 입력\n");
		System.out.printf("%12s","2. 수정\n");
		System.out.printf("%12s","3. 조회\n");
		System.out.printf("%12s","4. 삭제\n");
		System.out.printf("%12s","0. 종료\n");
		System.out.println("--------------------");
		
		System.out.print("메뉴 번호 입력 : ");
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("입력메뉴선택");
			break;
		case 2:
			System.out.println("수정메뉴선택");
			break;
		case 3:
			System.out.println("조회메뉴선택");
			break;
		case 4:
			System.out.println("삭제메뉴선택");
			break;
		case 0:
			System.out.println("프로그램을 종료합니다");
			break;
		default:
			System.out.println("번호를 잘못 누르셨습니다");
			break;
		}
	}

}
