package com.kh.hw;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		System.out.print("몇 번을 출력하시겠습니까 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i = 0;
		while (i < input) {
			System.out.println("안녕하세요");
			i++;
		}
	}
}
