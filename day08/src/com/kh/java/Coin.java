package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int win = 0;
		int lose = 0;
		double ratio = 0;
		int nowMoney = 20000000;
		int money = 0;
		char goStop = 0;
		boolean yn = true;

		System.out.println("=== 동전 앞 뒤 맞추기===");

		while (true) {
			if (nowMoney > 0) {
				System.out.print("\n배팅하세요 <현재 소지금 : " + nowMoney + "원 / 배당금 2배>\n");
				System.out.print(" 배팅금 : ");
				money = sc.nextInt();
				if (money <= nowMoney) {
					int ran = rd.nextInt(2);

					System.out.print("숫자를 입력해주세요 (1. 앞면 / 2. 뒷면  / 3. 종료) : ");
					int choice = sc.nextInt();

					if (choice == 3) {
						nowMoney -= money;
						System.out.print("종료했으므로  금액 모두 잃었습니다");
						System.exit(0);
					}

					if (choice != 1 && choice != 2) {
						System.out.println("1~3까지 입력하세요\n");
						continue;
					}

					try {
						System.out.print("결과는");
						for (int i = 1; i <= 5; i++) {
							Thread.sleep(250);
							System.out.print(".");
						}
					} catch (Exception e) {
						System.err.println("쓰레드 오류");
					}

					System.out.println();

					if (ran == choice) {
						win++;
						money *= 2;
						nowMoney += money;
						System.out.print("맞췄습니다  ---> ");
						System.out.println(money + "원을 얻으셨습니다");
						ratio = win / (double) (win + lose);
						System.out.print(win + "승  / " + lose + "패  / " + "승률 : " + String.format("%.2f", ratio * 100)
								+ "%\n" + "현재금액 : " + nowMoney + "원" + "\n\n");
						while (yn) {
							System.out.print("계속 하시겠습니까 ? (y, n) ");
							goStop = sc.next().charAt(0);
							if (goStop == 'n' || goStop == 'N') {
								yn = false;
								System.out.print("종료했으므로 돈을 모두 잃었습니다");
								System.exit(0);
							} else if (goStop != 'n' && goStop != 'y' && goStop != 'N' && goStop != 'Y') {
								System.out.print("n또는 y를 입력하세요\n");
							} else if (goStop == 'y' || goStop == 'Y') {
								yn = false;
							}

						}
					} else {
						lose++;
						nowMoney -= money;

						System.out.print("틀렸습니다  ---> ");
						ratio = win / (double) (win + lose);
						System.out.print(win + "승  / " + lose + "패  / " + "승률 : " + String.format("%.2f", ratio * 100)
								+ "%\n" + "현재금액 : " + nowMoney + "원" + "\n\n");
						while (yn) {
							System.out.print("계속 하시겠습니까 ? (y, n) ");
							goStop = sc.next().charAt(0);
							if (goStop == 'n' || goStop == 'N') {

								System.out.print("종료했으므로 돈을 모두 잃었습니다");
								System.exit(0);
							} else if (goStop != 'n' && goStop != 'y' && goStop != 'N' && goStop != 'Y') {
								System.out.print("n또는 y를 입력하세요\n");

							} else if (goStop == 'y' || goStop == 'Y') {
								yn = false;
							}
						}
					}
				} else {
					System.out.println("가지고 있는 돈 보다 배팅금이 더 많습니다");
					System.out.println("다시 배팅하세요");
				}

			} else if (nowMoney <= 0) {
				System.out.print("돈을 모두 잃었습니다");
				break;
			}
		}
	}

}
