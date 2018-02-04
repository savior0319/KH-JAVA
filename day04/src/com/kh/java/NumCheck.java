package com.kh.java;

import java.util.Scanner;

public class NumCheck {

	Scanner sc = new Scanner(System.in);
	private int inputNum;

	public NumCheck() {

		System.out.println("====== 숫자 구별 프로그램 v1.0 ======\n");

		System.out.print("임의의 수를 입력하세요 : ");
		inputNum = sc.nextInt();

		if (inputNum > 0) {
			System.out.println("당신이 입련한 수 " + inputNum + " 은(는) 양수입니다.");
		} else if (inputNum == 0) {
			System.out.println("당신이 입련한 수 " + inputNum + " 은(는) 0입니다.");
		} else {
			System.out.println("당신이 입련한 수 " + inputNum + " 은(는) 음수입니다.");
		}
	}

	public static void main(String[] args) {
		new NumCheck();
	}
}
