package com.kh.java;

import java.util.Scanner;

public class Switch_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");

		int score = sc.nextInt();
		int divScore = score / 10;

		switch (divScore) {
		case 10:
		case 9:
			System.out.println(score + "�� ==> A���");
			break;
		case 8:
			System.out.println(score + "�� ==> B���");
			break;
		case 7:
			System.out.println(score + "�� ==> C���");
			break;
		case 6:
			System.out.println(score + "�� ==> D���");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println(score + "�� ==> F���");
			break;
		default:
			System.out.println("�߸����Է�<0~100���� �Է�>");
			break;
		}
	}

}
