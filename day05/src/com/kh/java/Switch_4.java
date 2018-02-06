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

		int pay = 0; // 합산 금액 변수 pay 0으로 초기화
		char choice; // 선택을 입력 받을 변수 
		String mMenu = null, sMenu = null; // 메뉴 이름의 변수 null 값으로 초기화
		System.out.print("주 메뉴 선택 : ");
		choice = sc.next().charAt(0); // 주메뉴 입력

		switch (choice) {
		case 'a': // a 일때
			pay += 5000; // pay 값에 누적 해서 값 더함
			mMenu = "불고기버거"; // mMenu에 선택 한 메뉴 이름 저장
			break;
		case 'b': // b 일때
			pay += 4000;
			mMenu = "새우버거";
			break;
		case 'c': // c 일때
			pay += 4500;
			mMenu = "치킨버거";
			break;
		case 'd': // d 일때
			pay += 10000;
			mMenu = "한우";
			break;
		case 'e': // e 일때
			pay += 7000;
			mMenu = "디버거";
			break;

		default: // 메뉴 번호 잘못눌렀을 때
			System.out.print("번호를 잘못 눌렀습니다. \n영업을 종료합니다");
			System.exit(0); // 종료 
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
		case '1': // 1번 일 때
			pay += 1500;
			sMenu = "콜라"; // sMenu에 선택 한 메뉴 이름 저장
			break;
		case '2': // 2번 일 때
			pay += 1500;
			sMenu = "사이다";
			break;
		case '3': // 3번 일 때
			pay += 2500;
			sMenu = "밀크쉐이크";
			break;
		case '4': // 4번 일 때
			pay += 3000;
			sMenu = "레드불";
			break;
		default:
			System.out.print("번호를 잘못 눌렀습니다. \n영업을 종료합니다");
			System.exit(0);
		}
		System.out.print(mMenu + ", " + sMenu + "는 총 " + pay + "입니다."); // 출력
	}
}
