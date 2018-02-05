package com.kh.java;

import java.util.Scanner;

public class Switch_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("========주메뉴========");
		System.out.println("a. 불고기버거 --- 5000원");
		System.out.println("b. 새우버거 ---  4000원");
		System.out.println("c. 치킨버거 ---  4500원");
		System.out.println("d. 한우버거 --- 10000원");
		System.out.println("e.  디버거 ---  7000원");
		System.out.println("====================");

		int pay = 0;
		char choice;
		String mMenu = null, sMenu = null;
		System.out.print("주 메뉴 선택 : ");
		choice = sc.next().charAt(0);

		switch (choice) {
		case 'a':
			pay += 5000;
			mMenu = "불고기버거";
			break;
		case 'b':
			pay += 4000;
			mMenu = "새우버거";
			break;
		case 'c':
			pay += 4500;
			mMenu = "치킨버거";
			break;
		case 'd':
			pay += 10000;
			mMenu = "한우";
			break;
		case 'e':
			pay += 7000;
			mMenu = "디버거";
			break;

		default:
			System.out.print("번호를 잘못 눌렀습니다. \n영업을 종료합니다");
			System.exit(0);
		}

		System.out.println("\n=======사이드메뉴=======");
		System.out.println("1. 콜라 ------- 1500원");
		System.out.println("2. 사이다 ------ 1500원");
		System.out.println("3. 밀크쉐이크 --- 2500원");
		System.out.println("4. 레드불 ------ 3000원");
		System.out.println("=====================");
		System.out.print("사이드 메뉴 선택 : ");
		choice = sc.next().charAt(0);

		switch (choice) {
		case '1':
			pay += 1500;
			sMenu = "콜라";
			break;
		case '2':
			pay += 1500;
			sMenu = "사이다";
			break;
		case '3':
			pay += 2500;
			sMenu = "밀크쉐이크";
			break;
		case '4':
			pay += 3000;
			sMenu = "레드불";
			break;
		default:
			System.out.print("번호를 잘못 눌렀습니다. \n영업을 종료합니다");
			System.exit(0);
		}
		System.out.print(mMenu + ", " + sMenu + "는 총 " + pay + "입니다.");
	}
}
