package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class RCP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String rcpUser = null;
		String rcpCom = null;
		int win = 0;
		int lose = 0;
		int draw = 0;
		double rate = 0;

		System.out.println("== 가위 / 바위 / 보 ==");
		while (true) {
			System.out.print("\n선택하세요 <1. 가위 / 2. 바위 / 3.보  / 4. 종료> : ");

			int com = rd.nextInt(3) + 1;
			int user = sc.nextInt();

			if (user == 4) {
				System.out.print("종료합니다");
				delay();
				System.exit(0);
			}

			if (user != 1 && user != 2 && user != 3) {
				System.out.println("*메뉴를 잘못 선택했습니다*");
				System.out.println("다시 선택하세요");
				continue;
			}
			System.out.print("결과를 확인중");
			delay();

			System.out.println("\n");

			if (com == 1) {
				rcpCom = "가위";
			} else if (com == 2) {
				rcpCom = "바위";
			} else if (com == 3) {
				rcpCom = "보";
			}

			if (user == 1) {
				rcpUser = "가위";
			} else if (user == 2) {
				rcpUser = "바위";
			} else if (user == 3) {
				rcpUser = "보";
			}

			System.out.println("사용자는" + rcpUser + "를 냈습니다");
			System.out.println("컴퓨터는" + rcpCom + "를 냈습니다");

			if (com == 1 && user == 1 || com == 2 && user == 2 || com == 3 && user == 3) {
				System.out.println("비겼습니다");
				draw++;
			} else if (com == 1 && user == 2 || com == 2 && user == 3 || com == 3 && user == 1) {
				System.out.println("이겼습니다");
				win++;
			} else if (com == 1 && user == 3 || com == 2 && user == 1 || com == 3 && user == 2) {
				System.out.println("졌습니다");
				lose++;
			}

			rate = (win / (double) (win + lose + draw)) * 100;

			System.out.println("현재 " + (win + lose + draw) + "전 " + win + "승 " + draw + "무 " + lose + "패 입니다\n");
			System.out.print("승률 : " + String.format("%.2f", rate) + "%\n");
		}
	}

	public static void delay() {
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(250);
				System.out.print(".");
			}
		} catch (Exception e) {
			System.err.println("쓰레드 오류");
		}
	}
}