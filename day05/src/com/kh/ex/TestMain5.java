package com.kh.ex;

import java.util.Scanner;

class TestMain5{
	public static void main(String[] args) {
		int i = 0;
		
//		while(i < 5) {
//			System.out.println("\"안녕하세요\"");
//			i++;
//		}
		
		System.out.print("몇 번을 출력하시겠습니까 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while(i < input) {
			System.out.println("안녕하세요");
			i++;
		}
		
		
	}
}