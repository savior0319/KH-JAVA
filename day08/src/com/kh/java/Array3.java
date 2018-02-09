package com.kh.java;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + " 번째 학생의 성적 : ");
			num[i] = sc.nextInt();
		}

		System.out.println("\n<< 입력한 학생들의 성적  >>");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println("\n학생들의 총 합계 : " + 
				(num[0] + num[1] + num[2] + num[3] + num[4]) + "점");
		System.out.println("학생들의 총 평균 : " + 
				String.format("%.2f", (num[0] + num[1] + num[2] + num[3] + num[4]) / (double) 5) + "점");
	}
}
