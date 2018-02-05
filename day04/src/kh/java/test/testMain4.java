package kh.java.test;

import java.util.Scanner;

public class testMain4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ans;
		int count = 0;
		// while (true) {
		System.out.print("첫번째 퀴즈입니다.\n");
		System.out.print("사과는 영어로 무엇일까요? (1. Apple / 2. 잡스): ");
		ans = sc.nextInt();

		if (ans == 1) {
			System.out.println("정답!!");
			count++;
			System.out.print("두번째 퀴즈입니다.\n바나나는 길어 길으면 기차 기차는? (1. 빨라 / 2. 비싸): ");
			ans = sc.nextInt();
			if (ans == 1) {
				System.out.println("정답!!");
				count++;
			} else {
				System.out.println("땡");
			}
			System.out.println("총 " + count + "문제를 맞추셨습니다\n");

		} else if (ans == 2) {
			System.out.println("땡!!");
			System.out.print("두번째 퀴즈입니다.\n바나나는 길어 길으면 기차 기차는? (1. 빨라 / 2. 비싸): ");
			ans = sc.nextInt();
			if (ans == 1) {
				System.out.println("정답!!");
				count++;
			} else {
				System.out.println("땡");
			}
			System.out.println("총 " + count + "문제를 맞추셨습니다\n");

		}
		// }
	}
}
