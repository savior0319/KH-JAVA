package com.kh.hw;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int result = 0; // 변수 result 값 0 으로 초기화

		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt(); // num1 입력

		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt(); // num2 입력

		/* whlie 사용 */
//		int i = num1; // i에 num1 대입
//		while (i < num2 + 1) { // 두번째 수 까지 반복
//			result += i; // result 값에 누적해서 더함
//			i++; // i 값 1증가
//		}
//		System.out.print(num1 + " ~ " + num2 + " 까지의 합 : " + result);

		/* for 사용  */
		for (int i = num1; i < num2 + 1; i++) { // i부터 두번째 값 까지 i 1씩 증가하면서 반복
			result += i; // result 값에 누적해서 더함
		} 
		System.out.print(num1 + " ~ " + num2 + " 까지의 합 : " + result);
	}
}
