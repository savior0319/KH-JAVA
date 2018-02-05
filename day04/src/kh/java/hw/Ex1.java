package kh.java.hw;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print((19<=age)?"\"성인입니다. 어서오세요.\"":"\"미성년자는 입장불가입니다.\"");
	}
}
