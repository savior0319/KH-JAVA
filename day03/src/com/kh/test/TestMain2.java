package com.kh.test;

import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double kor, math, eng, sum, avg;

		System.out.print("[����]�����Է� : ");
		kor = sc.nextDouble();
		System.out.print("[����]�����Է� : ");
		math = sc.nextDouble();
		System.out.print("[����]�����Է� : ");
		eng = sc.nextDouble();
		System.out.println();

		sum = kor + math + eng;
		avg = sum / 3;

		System.out.println("----------------���----------------");
		System.out.printf("%3s\t%s\t%s\t%s\t%s", "����", "����", "����", "�հ�", "���");
		System.out.println();
		System.out.printf("%3.0f\t%.0f\t%.0f\t%.0f\t%.1f", kor, math, eng, sum, avg);

	}

}
