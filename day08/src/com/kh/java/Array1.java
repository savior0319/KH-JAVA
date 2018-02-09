package com.kh.java;

public class Array1 {
	public static void main(String[] args) {
		String[] str = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		System.out.println("for문 사용 x");
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		
		System.out.println();
		
		System.out.println("for문 사용 o");
		for(int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
		}

	}
}
