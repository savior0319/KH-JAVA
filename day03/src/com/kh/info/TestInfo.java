package com.kh.info;

import java.util.Scanner;

public class TestInfo {
	public void student() {
		Scanner sc = new Scanner(System.in);

		String name;
		int age;
		double kor, eng, math, avg;

		System.out.print("학생의 이름 입력 : ");
		name = sc.nextLine();
		System.out.print("학생의 나이 입력 : ");
		age = sc.nextInt();
		System.out.print("학생의 국어점수 입력 : ");
		kor = sc.nextDouble();
		System.out.print("학생의 영어점수 입력 : ");
		eng = sc.nextDouble();
		System.out.print("학생의 수학점수 입력 : ");
		math = sc.nextDouble();

		avg = (kor + eng + math) / 3;
		String avg2f = String.format("%.2f", avg);

		System.out.println();
		System.out.println(name + "!! 당신은 " + age + "살이군요");
		System.out.println("국어점수는 " + kor + "점");
		System.out.println("영어점수는 " + eng + "점");
		System.out.println("수학점수는 " + math + "점");
		System.out.println("평균점수는 " + avg2f + "점");

	}
}
