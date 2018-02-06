package com.kh.ex;

import java.util.Scanner;

public class TestMain1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----초기 메뉴-----");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		System.out.println("----------------\n");
		
		System.out.print("메뉴 번호 입력 : ");
		
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("\"입력 메뉴 선택\"");
			break;
		case 2:
			System.out.println("\"수정 메뉴 선택\"");
			break;
		case 3:
			System.out.println("\"조회 메뉴 선택\"");
			break;
		case 4:
			System.out.println("\"삭제 메뉴 선택\"");
			break;
		case 0:
			System.out.println("\"프로그램을 종료합니다\"");
			break;
		default:
			System.out.println("\"번호를 잘못 누르셨습니다\"");
			break;
		}
		
	}
}
