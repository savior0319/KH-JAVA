package com.kh.java;

import java.util.Scanner;

public class Switch_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");

		int score = sc.nextInt();
		int divScore = score / 10;

		switch (divScore) {
		case 10:
		case 9:
			System.out.println(score + "점 ==> A등급");
			break;
		case 8:
			System.out.println(score + "점 ==> B등급");
			break;
		case 7:
			System.out.println(score + "점 ==> C등급");
			break;
		case 6:
			System.out.println(score + "점 ==> D등급");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println(score + "점 ==> F등급");
			break;
		default:
			System.out.println("잘못된입력<0~100사이 입력>");
			break;
		}
	}

}
