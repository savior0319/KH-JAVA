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
		String fName = sc.nextLine(); 
		System.out.println();
		
		switch (fName) {
		case "사과":
			System.out.print("사과의 가격은 1000원입니다");
			break;
		case "바나나":
			System.out.print("바나나의 가격은 3000원입니다");
			break;
		case "복숭아":
			System.out.print("복숭아의 가격은 2000원입니다");
			break;
		case "키위":
			System.out.print("키위의 가격은 5000원입니다");
			break;
		}
	}
}
