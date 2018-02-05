package kh.java.test;

import java.util.Scanner;

public class testMain8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);

		// String string = "a";
		// String convert = string.toUpperCase();
		// System.out.println(convert);

		int con = (char) ch ^ 32;


		if (97 <= (int) ch && (int) ch <= 122) {
			System.out.print("소문자를 입력하였습니다.\n");
		} else if (65 <= (int) ch && (int) ch <= 90) {
			System.out.print("대문자를 입력하였습니다.\n");
			System.out.print("소문자로 변환 " + (char) con);
		} else {
			System.out.print("잘못 입력하였습니다.\n");
		}
	}
}
