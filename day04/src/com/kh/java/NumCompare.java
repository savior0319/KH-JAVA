package com.kh.java;

import java.util.Scanner;

public class NumCompare {

	Scanner sc = new Scanner(System.in);
	private int stNum, ndNum;

	public NumCompare() {
		System.out.println("= = = 두 수를 비교 하는 프로그램 v1.0 = = =\n");

		System.out.print("첫번째 수를 입력하세요 : ");
		stNum = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		ndNum = sc.nextInt();

		if (stNum > ndNum) {
			System.out.println(stNum + " > " + ndNum + "\n첫 번째 수가 더 큽니다.");
		} else if (stNum == ndNum) {
			System.out.println(stNum + " = " + ndNum + "\n두 수가 같은 수 입니다.");
		} else {
			System.out.println(stNum + " < " + ndNum + "\n두 번째 수가 더 큽니다.");
		}

	}

	public static void main(String[] args) {
		new NumCompare();
	}
}
