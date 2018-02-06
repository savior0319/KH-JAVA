package com.kh.ex;

import java.util.Scanner;

public class TestMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int price = 0;
		String mainName = null;
		String sideName = null;

		System.out.println("----------주메뉴----------");
		System.out.println("a. 불고기버거 ----- 5000");
		System.out.println("b. 새우버거 -----  4000");
		System.out.println("c. 치킨버거 ----- 4500");
		System.out.println("d. 한우버거 ----- 10000");
		System.out.println("e. 디버거 ----- 7000");
		System.out.println("------------------------");

		System.out.print("메뉴 선택 : ");
		char menu = sc.next().charAt(0);

		switch (menu) {
		case 'a':
			mainName = "불고기버거 ";
			price += 5000;
			break;
		case 'b':
			mainName = "새우버거 ";
			price += 4000;
			break;
		case 'c':
			mainName = "치킨버거 ";
			price += 4500;
			break;
		case 'd':
			mainName = "한우버거";
			price += 10000;
			break;
		case 'e':
			mainName = "디버거 ";
			price += 7000;
			break;
		default:
			System.out.println("\"번호를 잘못누르셨습니다.\n영업을 종료합니다.\"");
			System.exit(0);
		}
		System.out.println();
		System.out.println("--------사이드메뉴--------");
		System.out.println("1. 콜라 ----- 1500");
		System.out.println("2. 사이다 -----  1500");
		System.out.println("3. 밀크쉐이크 ----- 2500");
		System.out.println("4. 레드불 ----- 3000");
		System.out.println("----------------------");
		
		sc.nextLine();
		System.out.print("메뉴 선택 : ");
		menu = sc.next().charAt(0);

		switch (menu) {
		case '1':
			sideName = "콜라";
			price += 1500;
			break;
		case '2':
			sideName = "사이다";
			price += 1500;
			break;
		case '3':
			sideName = "밀크쉐이크";
			price += 2500;
			break;
		case '4':
			sideName = "레드불";
			price += 3000;
			break;
		default:
			System.out.println("\"번호를 잘못누르셨습니다.\n영업을 종료합니다.\"");
			System.exit(0);
		}
		System.out.println();
		System.out.println("\"" + mainName + ", " + sideName + "은(는) 총 " + price + "원입니다" + "\"");

	}
}
