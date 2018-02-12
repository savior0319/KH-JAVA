package com.kh.java;

import java.util.Scanner;

public class CharCheck {

	public CharCheck() {
		String strIn;
		char charIn;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		strIn = sc.nextLine();
		char[] strToChar = new char[strIn.length()];

		System.out.print("검색 값 입력 : ");
		charIn = sc.next().charAt(0);

		for (int i = 0; i < strToChar.length; i++) {
			strToChar[i] = strIn.charAt(i);
			if (charIn == strToChar[i]) {
				count++;
			}
		}
		System.out.println("--------------출력--------------");
		System.out.println("입력한 문자열 " + strIn + "에서");
		System.out.println("찾으시는 문자 " + "\"" + charIn + "\"는 " + count + "개 입니다");
	}

	public static void main(String[] args) {
			new CharCheck();
	}
}
