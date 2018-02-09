package com.kh.java;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] score = new int[4];
		System.out.println("입력");
		System.out.println("-----------------------------");
		System.out.print("국어점수 입력 : ");
		score[0] = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		score[1] = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		score[2] = sc.nextInt();
		System.out.println("-----------------------------");
		score[3] = score[0] + score[1] + score[2];

		System.out.println("출력");
		System.out.println("-----------------------------");
		System.out.println("국어 점수 : " + score[0]);
		System.out.println("영어 점수 : " + score[1]);
		System.out.println("수학 점수 : " + score[2]);
		System.out.println("합계 점수 : " + score[3]);
		System.out.println("평균 : " + String.format("%.2f", score[3] / (double) 3));
		System.out.println("-----------------------------");

	}
}
