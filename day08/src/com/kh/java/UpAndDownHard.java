package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class UpAndDownHard {
	static int count = 1;

	public static void main(String[] args) {

		int menu, ran, input, com;
		boolean start = true;
		boolean inLoop = true;
		int rangeMin = 1;
		int rangeMax = 100;

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println(" === Up & Down === ");
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
			while (inLoop) {
				System.out.print("숫자를 입력하세요 (" + rangeMin + "부터 " + rangeMax + "까지) > ");
				inLoop = false;
				input = sc.nextInt();
				com = rd.nextInt(100) + 1;

				if (rangeMin <= input && input <= rangeMax) {
					if (menu == 1) {
						System.out.println();

						if (ran > input && ran > com) {
							System.out.println("나 : up --- 내가 선택한 수 : " + input);
							System.out.println("컴퓨터 : up --- 컴퓨터가 선택한 수 : " + com + "\n");
							rangeMin = input > com ? input : com;
							count++;
						} else if (ran > input && ran < com) {
							System.out.println("나 : up --- 내가 선택한 수 : " + input);
							System.out.println("컴퓨터 : down --- 컴퓨터가 선택한 수 : " + com + "\n");
							rangeMin = input;
							rangeMax = com;
							count++;
						} else if (ran < input && ran < com) {
							System.out.println("나 : down --- 내가 선택한 수 : " + input);
							System.out.println("컴퓨터 : down --- 컴퓨터가 선택한 수 : " + com + "\n");
							rangeMax = input > com ? com : input;
							count++;
						} else if (ran < input && ran > com) {
							System.out.println("나 : down --- 내가 선택한 수 : " + input);
							System.out.println("컴퓨터 : up --- 컴퓨터가 선택한수 : " + com + "\n");
							count++;
							rangeMin = com;
							rangeMax = input;
						} else if (ran == input) {
							System.out.println("나 : 정답\n내가 선택한 수 : " + input);
							System.out.println("내가 " + count + "번 만에 정답을 맞췄습니다\n");
							System.out.println("---게임을 다시 시작합니다---\n");
							delay();
							start = true;
							break;
						} else if (ran > input && com == ran) {
							System.out.println("나 : up --- 내가 선택한 수 : " + input);
							System.out.println("컴퓨터 : 정답\n컴퓨터가 선택한 수 : " + com + "\n");
							System.out.println("컴퓨터가 " + count + "번 만에 정답을 맞췄습니다\n");
							System.out.println("---게임을 다시 시작합니다---\n");
							delay();
							start = true;
							break;
						} else if (ran < input && ran == com) {
							System.out.println("나 : down --- 내가 선택한 수 : " + input);
							System.out.println("컴퓨터 : 정답\n컴퓨터가 선택한 수 : " + com + "\n");
							System.out.println("컴퓨터가 " + count + "번 만에 정답을 맞췄습니다\n");
							System.out.println("---게임을 다시 시작합니다---\n");
							delay();

							start = true;
							break;
						}
					}
				} else
					System.out.print(rangeMin + "부터 " + rangeMax + "까지 입력하세요\n\n");
				inLoop = true;
			}
		}
	}

	public static void delay() {
		try {
			count = 1;
			Thread.sleep(1000);
		} catch (Exception e) {
			System.err.print("쓰레드 오류");
		}

	}
}
