package com.kh.hw;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n 의 수를 입력  : ");
		int n = sc.nextInt(); // 변수 n의 값 입력

		int i = 1; // 변수 i 값 1로 초기화
		int sum = 0; // 변수 sum 값 0으로 초기화

		while (i < n + 1) { // 입력한 수 까지 반복
			if (i % 2 == 0) { // 짝수만
				sum += i; // 누적해서 더함
			} 
			i++; // i값 1씩 증가
		}
		System.out.print("짝수들만의 합은 : " + sum);
	}
}
