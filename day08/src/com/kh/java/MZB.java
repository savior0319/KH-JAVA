package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class MZB {

	static int mzbUser, mzbCom;
	static String rcpUser = null;
	static String rcpCom = null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		boolean draw = true;
		boolean rcpLoop = true; boolean rcpLoop1 = true;

		System.out.println("---------------묵 찌 빠 게 임---------------");
		System.out.println("우선 가위바위보를 합시다");
		while (draw) {
			System.out.println("1. 가위 / 2. 바위 / 3. 보");
			System.out.print("선택 : ");
			int user = sc.nextInt();
			int com = rd.nextInt(3) + 1;

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

			System.out.println("\n사용자는 " + rcpUser + "를 냈습니다");
			System.out.println("컴퓨터는 " + rcpCom + "를 냈습니다");

			if (com == 1 && user == 1 || com == 2 && user == 2 || com == 3 && user == 3) {
				System.out.println("비겼습니다. 다시 가위바위보를 합니다\n");
			} else if (com == 1 && user == 2 || com == 2 && user == 3 || com == 3 && user == 1) {
				System.out.println("-----공격권-----\n당신이 공격권을 가져갑니다\n");
				draw = false;

				System.out.println("당신의 공격 입니다 !");
				while (rcpLoop) {
					System.out.println("1.묵 / 2.찌 / 3.빠");
					System.out.print("선택 : ");
					mzbUser = sc.nextInt();
					mzbCom = rd.nextInt(3) + 1;
					tran();
					System.out.println("당신 : " + rcpUser);
					delay();
					System.out.println("컴퓨터 : " + rcpCom);
					System.out.println();
					if (mzbCom == mzbUser) {
						System.out.println("이겼습니다\n\n -----다시시작-----");
						rcpLoop = false;
						draw = true;
					} else if (mzbCom == 1 && mzbUser == 2 || mzbCom == 2 && mzbUser == 3
							|| mzbCom == 3 && mzbUser == 1) {
						System.out.println("컴퓨터가 공격권을 가져갑니다");
					} else
						System.out.println("당신의 공격권 입니다.");
					while (rcpLoop1) {
						System.out.println("1.묵 / 2.찌 / 3.빠");
						System.out.print("선택 : ");
						mzbUser = sc.nextInt();
						mzbCom = rd.nextInt(3) + 1;
						tran();
						System.out.println("당신 : " + rcpUser);
						delay();
						System.out.println("컴퓨터 : " + rcpCom);
						System.out.println();
						if (mzbCom == mzbUser) {
							System.out.println("졌습니다\n\n -----다시시작-----");
							rcpLoop1 = false;
							draw = true;
						} else if (mzbCom == 1 && mzbUser == 2 || mzbCom == 2 && mzbUser == 3
								|| mzbCom == 3 && mzbUser == 1) {
							System.out.println("컴퓨터가 공격권을 가져갑니다");
							rcpLoop1 = false;
						} else
							System.out.println("당신의 공격권 입니다.");
					}
				}
			} else if (com == 1 && user == 3 || com == 2 && user == 1 || com == 3 && user == 2) {
				System.out.println("-----공격권-----\n컴퓨터가 공격권을 가져갑니다\n");
				draw = true;
				while (rcpLoop1) {
					System.out.println("1.묵 / 2.찌 / 3.빠");
					System.out.print("선택 : ");
					mzbUser = sc.nextInt();
					mzbCom = rd.nextInt(3) + 1;
					tran();
					System.out.println("당신 : " + rcpUser);
					delay();
					System.out.println("컴퓨터 : " + rcpCom);
					System.out.println();
					if (mzbCom == mzbUser) {
						System.out.println("졌습니다\n\n -----다시시작-----");
						rcpLoop1 = false;
					} else if (mzbCom == 1 && mzbUser == 2 || mzbCom == 2 && mzbUser == 3
							|| mzbCom == 3 && mzbUser == 1) {
						System.out.println("컴퓨터가 공격권을 가져갑니다");
					} else
						System.out.println("당신의 공격권 입니다.");
				}
			}
		}
	}

	public static void tran() {
		if (mzbCom == 1) {
			rcpCom = "묵";
		} else if (mzbCom == 2) {
			rcpCom = "찌";
		} else if (mzbCom == 3) {
			rcpCom = "빠";
		}

		if (mzbUser == 1) {
			rcpUser = "묵";
		} else if (mzbUser == 2) {
			rcpUser = "찌";
		} else if (mzbUser == 3) {
			rcpUser = "빠";
		}

	}

	public static void delay() {
		try {
				Thread.sleep(500);
		} catch (Exception e) {
			System.err.println("쓰레드 오류");
		}
	}
}
