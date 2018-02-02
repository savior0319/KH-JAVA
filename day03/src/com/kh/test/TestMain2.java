package com.kh.test;

import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double kor, math, eng, sum, avg;

		System.out.print("[국어]점수입력 : ");
		kor = sc.nextDouble();
		System.out.print("[수학]점수입력 : ");
		math = sc.nextDouble();
		System.out.print("[영어]점수입력 : ");
		eng = sc.nextDouble();
		System.out.println();

		sum = kor + math + eng;
		avg = sum / 3;

		System.out.println("----------------출력----------------");
		System.out.printf("%3s\t%s\t%s\t%s\t%s", "국어", "수학", "영어", "합계", "평균");
		System.out.println();
		System.out.printf("%3.0f\t%.0f\t%.0f\t%.0f\t%.1f", kor, math, eng, sum, avg);

	}

}
