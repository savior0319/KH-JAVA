package com.kh.hw;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까 : ");
		int input = sc.nextInt(); // input 값 입력
		int i = 1; // 변수 i 값 1로 초기화
		System.out.println(input + "단 입니다");
		while (i < 10) { // 9번 반복
			System.out.println(input + " x " + i + " = " + (input * i));
			i++; // 1값 1증가
		}

	}

}
