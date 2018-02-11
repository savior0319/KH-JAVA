package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class MZB {
	private static String strUserMzb = null, strComMzb = null; // 묵찌빠 문자로 저장 할 변수
	private static int userMzb, comMzb; // 묵찌빠 입력 받을 변수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int userRcp, comRcp; // 가위 바위 보 입력 받을 변수
		String strUserRcp = null, strComRcp = null; // 가위 바위 보 문자로 저장 할 변수
		boolean rcpLoop = true, mzbLoop1 = true, mzbLoop2 = true;
		/* rcpLoop = 가위 바위 보 반복 / mzbLoop1 = 묵찌빠 공격권 1 / mzbLoop2 = 묵찌빠 공격권2 */
		String menu = "-----------묵찌빠 게임-----------\n";
		String mbzMenu = "1. 묵  / 2. 찌  / 3. 빠\n선택 >>> ";
		String rcpMenu = "1. 가위  / 2. 바위  / 3. 보\n선택 >>> ";
		String lose = "졌습니다\n";
		String win = "이겼습니다\n";
		String draw = "비겼습니다\n\n-----가위 바위 보를 다시 합니다-----\n";
		String restart = "다시시작 합니다";
		String myTurn = "당신이 공격권을 가져갑니다!\n";
		String comTurn = "컴퓨터가 공격권을 가져갑니다!\n";

		delay(menu);
		// 가위 바위 보 (이기거나 질 때 까지 반복)
		while (rcpLoop) {
			mzbLoop1 = true;
			mzbLoop2 = true;

			delay(rcpMenu);
			userRcp = sc.nextInt();
			if (!(userRcp == 1 || userRcp == 2 || userRcp == 3)) {
				System.out.println("\n***1~3까지만 입력하세요***\n");
				continue;
			}
			comRcp = rd.nextInt(3) + 1;

			if (userRcp == 1) {
				strUserRcp = "가위";
			} else if (userRcp == 2) {
				strUserRcp = "바위";
			} else if (userRcp == 3) {
				strUserRcp = "보";
			}

			if (comRcp == 1) {
				strComRcp = "가위";
			} else if (comRcp == 2) {
				strComRcp = "바위";
			} else if (comRcp == 3) {
				strComRcp = "보";
			}

			System.out.println("\n당신 : " + strUserRcp);
			inDelay(500);
			System.out.println("컴퓨터 : " + strComRcp + "");
			// 가위 바위 보 비겼을 때 - 다시 가위 바위 보
			if (userRcp == comRcp) {
				delay(draw);
				// 가위 바위 보 이겼을 때 -> 묵찌빠 내 공격권
			} else if (userRcp == 1 && comRcp == 3 || userRcp == 2 && comRcp == 1 || userRcp == 3 && comRcp == 2) {
				delay(win + "\n");
				rcpLoop = false; // 가위 바위 보 종료

				delay(myTurn);
				while (mzbLoop1) {
					delay(mbzMenu);
					userMzb = sc.nextInt();
					if (!(userMzb == 1 || userMzb == 2 || userMzb == 3)) {
						System.out.println("\n***1~3까지만 입력하세요***\n");
						continue;
					}
					comMzb = rd.nextInt(3) + 1;
					mbzToStr();

					System.out.println("\n당신 : " + strUserMzb);
					inDelay(500);
					System.out.println("컴퓨터 : " + strComMzb + "\n");

					if (userMzb == comMzb) {
						delay(win);
						delay(restart);
						dot();
						mzbLoop1 = false; // 이겼을 때 반복 종료
						rcpLoop = true; // 다시시작
						break;
					} else if (userMzb == 1 && comMzb == 2 || userMzb == 2 && comMzb == 3
							|| userMzb == 3 && comMzb == 1) { // 공격권 변경
						delay(myTurn);
					} else {
						delay(comTurn);
						mzbLoop1 = false;
						while (mzbLoop2) {
							delay(mbzMenu);
							userMzb = sc.nextInt();
							if (!(userMzb == 1 || userMzb == 2 || userMzb == 3)) {
								System.out.println("\n***1~3까지만 입력하세요***\n");
								continue;
							}
							comMzb = rd.nextInt(3) + 1;
							mbzToStr();

							System.out.println("\n당신 : " + strUserMzb);
							inDelay(500);
							System.out.println("컴퓨터 : " + strComMzb + "\n");

							if (userMzb == comMzb) { // 묵찌빠 졌을 경우
								delay(lose);
								delay(restart);
								dot();
								mzbLoop2 = false; // 졌을 떄 반복 종료
								rcpLoop = true; // 다시시작
								break;
							} else if (userMzb == 1 && comMzb == 2 || userMzb == 2 && comMzb == 3
									|| userMzb == 3 && comMzb == 1) { // 공격권 변경
								delay(myTurn);
							} else {
								delay(comTurn);
								mzbLoop1 = false;
								mzbLoop2 = true;
							}
						}
					}
				}
				// 가위 바위 보 졌을 경우 -> 묵찌빠 컴퓨터 공격권
			} else {
				delay(lose + "\n");
				rcpLoop = false; // 가위 바위 보 종료
				delay(comTurn);
				while (mzbLoop2) {
					delay(mbzMenu);
					userMzb = sc.nextInt();
					if (!(userMzb == 1 || userMzb == 2 || userMzb == 3)) {
						System.out.println("\n***1~3까지만 입력하세요***\n");
						continue;
					}
					comMzb = rd.nextInt(3) + 1;
					mbzToStr();
					System.out.println("\n당신 : " + strUserMzb);
					inDelay(500);
					System.out.println("컴퓨터 : " + strComMzb + "\n");
					if (userMzb == comMzb) { // 묵찌빠 졌을 때
						delay(lose);
						delay(restart);
						dot();
						mzbLoop2 = false; // 이겼을 때 반복 종료
						rcpLoop = true; // 다시시작
						break;
					} else if (userMzb == 1 && comMzb == 2 || userMzb == 2 && comMzb == 3
							|| userMzb == 3 && comMzb == 1) {
						delay(myTurn);
						mzbLoop1 = true;
						while (mzbLoop1) {
							delay(mbzMenu);
							userMzb = sc.nextInt();
							if (!(userMzb == 1 || userMzb == 2 || userMzb == 3)) {
								System.out.println("\n***1~3까지만 입력하세요***\n");
								continue;
							}
							comMzb = rd.nextInt(3) + 1;
							mbzToStr();
							System.out.println("\n당신 : " + strUserMzb);
							inDelay(500);
							System.out.println("컴퓨터 : " + strComMzb + "\n");
							if (userMzb == comMzb) { // 묵찌빠 이겼을 때
								delay(win);
								delay(restart);
								dot();
								mzbLoop1 = false; // 졌을 때 반복 종료
								rcpLoop = true; // 다시시작
								break;
							} else if (userMzb == 1 && comMzb == 2 || userMzb == 2 && comMzb == 3
									|| userMzb == 3 && comMzb == 1) { // 공격권 변경
								delay(myTurn);
							} else {
								delay(comTurn);
								mzbLoop1 = false;
							}
						}
					} else {
						delay(comTurn);
						mzbLoop2 = true;
					}
				}
			}
		}
	}

	// 입력한 숫자 -> 묵찌빠(문자) 변환 메소드
	private static void mbzToStr() {
		if (userMzb == 1) {
			strUserMzb = "묵";
		} else if (userMzb == 2) {
			strUserMzb = "찌";
		} else if (userMzb == 3) {
			strUserMzb = "빠";
		}

		if (comMzb == 1) {
			strComMzb = "묵";
		} else if (comMzb == 2) {
			strComMzb = "찌";
		} else if (comMzb == 3) {
			strComMzb = "빠";
		}
	}

	// 입력값 딜레이 메소드
	private static void inDelay(int delayValue) {
		try {
			Thread.sleep(delayValue);
		} catch (Exception e) {
			System.err.println("inDelay err");
		}
	}

	// 한 글자씩 출력 메소드 25ms
	private static void delay(String inStr) {
		try {
			for (int i = 0; i < inStr.length(); i++) {
				System.out.print(inStr.charAt(i));
				Thread.sleep(25);
			}
		} catch (Exception e) {
			System.err.println("delay err");
		}
	}

	// 다시시작 시 . 출력 메소드 250ms
	private static void dot() {
		for (int i = 0; i <= 4; i++) {
			try {
				System.out.print(".");
				Thread.sleep(250);
			} catch (InterruptedException e) {
				System.err.println("dot err");
			}
		}
		System.out.println("\n");
	}
}