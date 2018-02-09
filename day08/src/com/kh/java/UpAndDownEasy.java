package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class UpAndDownEasy {
	public static void main(String[] args) {

		int menu, ran, input;
		int count = 1;
		boolean start = true;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println(" === Up & Down (Easy) === ");
		while (start) {
			start = false;
			System.out.println("1. 게임시작");
			System.out.println("2. 게임종료");
			System.out.print("메뉴를 선택하세요 > ");
			menu = sc.nextInt();
			if (menu == 2) {
				System.out.println("\n게임을 종료합니다");
				return;
			}

			if (menu != 1) {
				System.out.println("\n메뉴를 잘못 선택하셨습니다\n");
				start = true;
				continue;
			}
			ran = rd.nextInt(100) + 1;
			System.out.println("\n" + ran + "\n");

			while (true) {
				System.out.print("숫자를 입력하세요 (1부터 100까지) > ");

				input = sc.nextInt();
				if (1 <= input && input <= 100) {
					if (menu == 1) {

						if (ran > input) {
							System.out.println("UP!\n");
							count++;
						} else if (ran < input) {
							System.out.println("Down\n");
							count++;
						} else if (ran == input) {
							System.out.println("정답");
							System.out.println(count + "번 만에 맞추셨습니다\n");
							try {
								System.out.println("---게임을 다시 시작 합니다---");
								count = 1;
								Thread.sleep(1000);
								System.out.println();
							} catch (Exception e) {
								System.err.println("쓰레드 오류");
							}
							start = true;
							break;
						}
					}
				} else
					System.out.println("\n1부터 100까지 입력하세요\n");
			}
		}
	}
}
