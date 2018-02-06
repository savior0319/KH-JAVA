package com.kh.hw;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		System.out.print("몇 번을 출력하시겠습니까 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i = 0; // 변수 i 값 0으로 초기화
		while (i < input) { // i를 input번 반복
			System.out.println("안녕하세요");
			i++; // i 값 1 증가
		}
	}
}
