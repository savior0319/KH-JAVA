package kh.java.test;

import java.util.Scanner;

public class testMain8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);

		if ('a' <=  ch &&  ch <= 'z') {
			System.out.print("소문자를 입력하였습니다.\n");
			System.out.print("대문자로 변환 " + (char)(ch^32));
		} else if ('A' <=  ch &&  ch <= 'Z') {
			System.out.print("대문자를 입력하였습니다.\n");
			System.out.print("소문자로 변환 " + (char)(ch^32));
		} else {
			System.out.print("잘못 입력하였습니다.\n");
		}
	}
}
