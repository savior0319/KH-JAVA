package com.java.hw;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double kor, eng, math, sum, avg;
		char grade;

		System.out.print("�������� �Է� : ");
		kor = sc.nextInt();

		System.out.print("�������� �Է� : ");
		eng = sc.nextInt();

		System.out.print("�������� �Է� : ");
		math = sc.nextInt();

		System.out.print("��� �Է� : ");
		sc.skip("\r\n");
		grade = sc.next().charAt(0);

		sum = kor + eng + math;
		String sumStr = String.format("%.0f", sum);

		avg = sum / 3;
		String avgStr = String.format("%.1f", avg);

		System.out.println("����� ������ ������ " + sumStr + "���̰� ����� " + avgStr + 
				"�� �̱���\n����� ����� " + grade + "��� �Դϴ�.");

	}

}
