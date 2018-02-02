package com.java.hw;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double kor, eng, math, sum, avg;
		char grade;

		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();

		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학점수 입력 : ");
		math = sc.nextInt();

		System.out.print("등급 입력 : ");
		sc.skip("\r\n");
		grade = sc.next().charAt(0);

		sum = kor + eng + math;
		String sumStr = String.format("%.0f", sum);

		avg = sum / 3;
		String avgStr = String.format("%.1f", avg);

		System.out.println("당신의 성적의 총합은 " + sumStr + "점이고 평균은 " + avgStr + 
				"점 이군요\n당신의 등급은 " + grade + "등급 입니다.");

	}

}
