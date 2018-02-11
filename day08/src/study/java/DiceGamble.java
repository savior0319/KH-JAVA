package study.java;

import java.util.Random;
import java.util.Scanner;

public class DiceGamble {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		final int MAXDICE = 3;
		char choice;
		int diceValue, sumDiceValue = 0, cSumDiceValue, winCount = 0, loseCount = 0, drawCount = 0;

		System.out.println("<<<Game Start>>>");

		while (true) {
			System.out.println("\n★★★★★메뉴★★★★★");
			System.out.println("1. 시작");
			System.out.println("2. 종료");
			System.out.println("★★★★★★★★★★★★");
			System.out.print("메뉴 선택 >> ");
			choice = sc.next().charAt(0);

			if (choice == '1') {
				System.out.print("\n주사위를 3번 던집니다");
				for (int i = 1; i <= MAXDICE;) {
					System.out.print("\n" + i + "번째 (던지려면 q, Q) : ");
					choice = sc.next().charAt(0);
					if (!(choice == 'q' || choice == 'Q')) {
						System.out.println("q만 입력가능합니다");
					} else if (choice == 'q' || choice == 'Q') {
						diceValue = rd.nextInt(6) + 1;
						System.out.println(i + "번째 값 : " + diceValue);
						sumDiceValue += diceValue;
						i++;
					}
				}
				cSumDiceValue = rd.nextInt(15) + 3; // 3번 주사위 최소값 3 ~ 최대값 18
				System.out.println("\n내가" + MAXDICE + "번 던진 주사위의 합 : " + sumDiceValue);
				try {
					System.out.print("컴퓨터가 주사위 던지는 중");
					for (int i = 0; i <= 4; i++) {
						Thread.sleep(250);
						System.out.print(".");
					}
					System.out.println();
				} catch (Exception e) {
					System.err.println("쓰레드 오류");
				}
				System.out.println("컴퓨터가" + MAXDICE + "번 던진 주사위의 합 : " + cSumDiceValue + "\n");

				if (sumDiceValue > cSumDiceValue) {
					winCount++;
					System.out.print("---------------------------------");
					System.out.println("\n나 : " + sumDiceValue + ", 컴퓨터 : " + cSumDiceValue);
					System.out.println("이겼습니다!");
					System.out.println(winCount + "승 " + drawCount + "무 " + loseCount + "패 ");
					System.out.println("---------------------------------");
					sumDiceValue = 0;
				} else if (sumDiceValue == cSumDiceValue) {
					drawCount++;
					System.out.print("---------------------------------");
					System.out.println("\n나 : " + sumDiceValue + ", 컴퓨터 : " + cSumDiceValue);
					System.out.println("비겼습니다!");
					System.out.println(winCount + "승 " + drawCount + "무 " + loseCount + "패 ");
					System.out.println("---------------------------------");
					sumDiceValue = 0;
				} else {
					loseCount++;
					System.out.print("---------------------------------");
					System.out.println("\n나 : " + sumDiceValue + ", 컴퓨터 : " + cSumDiceValue);
					System.out.println("졌습니다!");
					System.out.println(winCount + "승 " + drawCount + "무 " + loseCount + "패 ");
					System.out.println("---------------------------------");
					sumDiceValue = 0;
				}

			} else if (choice == '2') {
				System.out.print("\n게임을 종료합니다");
				try {
					for (int i = 0; i <= 4; i++) {
						Thread.sleep(250);
						System.out.print(".");
					}
					System.exit(0);
				} catch (Exception e) {
					System.err.println("쓰레드 오류");
				}
				System.exit(0);
			} else
				System.out.println("\n***메뉴를 잘못입력했습니다***");

		}
	}
}
