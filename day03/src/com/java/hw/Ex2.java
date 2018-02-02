package com.java.hw;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor, eng, math, sum;

		System.out.print("[국어]점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("[수학]점수 입력 : ");
		math = sc.nextInt();
		System.out.print("[영어]점수 입력 : ");
		eng = sc.nextInt();

		sum = kor + math + eng;

		System.out.println();
		System.out.println("국어\t\t수학\t\t영어\t\t합계");
		System.out.println(kor + "\t\t" + math + "\t\t" + eng + "\t\t" + sum);

	}

}
