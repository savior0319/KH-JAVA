package com.kh.hw;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1; // 변수 i 값 1로 초기화
		int sum = 0; // 변수 sum 값 0으로 초기화

		while (i < 101) { // 100번 반복
			if (i % 2 == 0) { // 짝수일떄
				sum += i; // sum 에 누적해서 더함
			}
			i++; // i 값 1증가
		}
		System.out.print("짝수들만의 합은 : " + sum);
	}
}
