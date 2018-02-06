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
		int select = sc.nextInt(); // 메뉴 번호 select 변수에 입력
		
		switch (select) {
		case 1: // 1번 메뉴 일 때
			System.out.println("입력메뉴선택");
			break;
		case 2: // 2번 메뉴 일 때
			System.out.println("수정메뉴선택");
			break;
		case 3: // 3번 메뉴 일 때
			System.out.println("조회메뉴선택");
			break;
		case 4: // 4번 메뉴 일 때
			System.out.println("삭제메뉴선택");
			break;
		case 0: // 0번 메뉴 일 때
			System.out.println("프로그램을 종료합니다");
			break;
		default: // 메뉴에 없는 번호 눌렀을 때 
			System.out.println("번호를 잘못 누르셨습니다");
			break;
		}
	}

}
