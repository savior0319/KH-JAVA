package com.kh.hw;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int grade, stCl, stNum;
		char gen;
		double result;

		System.out.print("학생이름 : ");
		name = sc.nextLine();
		System.out.print("학년 입력 : ");
		grade = sc.nextInt();
		System.out.print("반 입력 : ");
		stCl = sc.nextInt();
		System.out.print("번호 입력 : ");
		stNum = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 입력 : ");
		gen = sc.nextLine().charAt(0);
		System.out.print("성적 입력 : ");
		result = sc.nextDouble();
		System.out.println();

		if (gen == 'M') {
			System.out.print(grade + "학년 " + stCl + "반 " + stNum + "번 " + name + "은(는) "
					+ "남학생이고 성적은" + grade + "점이다.");
		} else {
			System.out.print(grade + "학년 " + stCl + "반 " + stNum + "번 " + name + "은(는) "
					+ "여학생이고 성적은" + grade + "점이다.");
		}
	}
}
