package com.kh.java.exam;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inNum = 0;
		while (true) {
			System.out.print("입력 : ");
			inNum = sc.nextInt();
			if (!(1 <= inNum && inNum <= 100)) {
				System.out.println("1부터 100까지 값만 입력하세요!");
				continue;
			} else {
				break;
			}
		}
		if (inNum % 2 == 0) {
			System.out.println("2의 배수입니다");
		} else if (inNum % 2 == 1) {
			System.out.print("2의 배수가 아닙니다");

		}
	}
}
