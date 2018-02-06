package com.kh.hw;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0; // 변수 i값 0 으로 초기화
		int result = 0; // 변수 result값 0으로 초기화

		while (i < 5) { // 5번 반복
			System.out.print("정수 값을 입력하시오 : ");
			int num = sc.nextInt(); // 변수 num 값 입력
			result += num; // result 값에 입력한 값 누적해서 더함
			i++; // i 값 1증가
		}

		System.out.print("입력한  5개의 정수의 합 : " + result);
	}
}
