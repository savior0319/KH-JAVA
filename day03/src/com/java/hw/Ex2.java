package com.java.hw;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor, eng, math, sum;

		System.out.print("[����]���� �Է� : ");
		kor = sc.nextInt();
		System.out.print("[����]���� �Է� : ");
		math = sc.nextInt();
		System.out.print("[����]���� �Է� : ");
		eng = sc.nextInt();

		sum = kor + math + eng;

		System.out.println();
		System.out.println("����\t\t����\t\t����\t\t�հ�");
		System.out.println(kor + "\t\t" + math + "\t\t" + eng + "\t\t" + sum);

	}

}
