package com.kh.java;

import java.util.Scanner;

public class Switch_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*********보기*********");
		System.out.println("*    사과 - 1000원          *");
		System.out.println("*    바나나 - 3000원       *");
		System.out.println("*    복숭아 - 2000원       *");
		System.out.println("*    키위 - 5000원          *");
		System.out.println("*********************");
		
		System.out.print("\n과일이름 입력 : ");
		String fName = sc.nextLine();  // 변수 fName에 과일 이름 입력
		System.out.println();
		
		switch (fName) {
		case "사과": // 사과 일 때
			System.out.print("사과의 가격은 1000원입니다");
			break;
		case "바나나": // 바나나 일 때
			System.out.print("바나나의 가격은 3000원입니다");
			break;
		case "복숭아": // 복숭아 일 때
			System.out.print("복숭아의 가격은 2000원입니다");
			break;
		case "키위": // 키위 일 때
			System.out.print("키위의 가격은 5000원입니다");
			break;
		}
	}
}
