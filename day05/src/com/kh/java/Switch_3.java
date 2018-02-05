package com.kh.java;

import java.util.Scanner;

public class Switch_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==========메뉴==========");
		System.out.println("1. 떡볶이 ---------1000원 ");
		System.out.println("2. 김   밥 ---------2000원 ");
		System.out.println("3. 오   뎅 ---------1000원 ");
		System.out.println("4. 순   대 ---------2000원 ");
		System.out.println("5. 튀   김 ---------3000원 ");
		System.out.println("6. 떡튀순 ---------8000원 ");
		System.out.println("=======================");

		System.out.print("\n메뉴선택 : ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("1. 떡볶이는 1000원입니다");
			break;
		case 2:
			System.out.println("2. 김밥은 2000원입니다");
			break;
		case 3:
			System.out.println("3. 오뎅 1000원입니다");
			break;
		case 4:
			System.out.println("4. 순대는 2000원입니다");
			break;
		case 5:
			System.out.println("5. 튀김은 3000원입니다");
			break;
		case 6:
			System.out.println("6. 떡튀순은 8000원입니다");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다");
			break;

		}
	}
}
