package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class BR {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		final int ENDNUM = 31;
		int input, comRd;
		int total = 0;

		String title = "=========베스킨 라빈스 게임=========\n\n";
		String rule = "**************게임룰**************\n " 
					+ "마지막 31을 먼저 말하는 사람이 지는게임!\n" 
					+ " 한번에 1~3개 까지 말 할 수 있다!\n"
					+ "********************************\n";
		outPut(title + rule);

		while (total < ENDNUM) {
			System.out.print("\n1~3개의 숫자 입력 : ");
			input = sc.nextInt();
			
			if (!(input == 1 || input == 2 || input == 3)) {
				System.out.println("\n*오류*\n1부터 3까지만 입력가능\n");
				continue;
			}
			
			for (int i = total + 1; i <= input + total; i++) {
				System.out.println("User : " + i);
			}
			total += input;

			try {
				System.out.print("\n컴퓨터의 차례");
				for (int i = 0; i <= 5; i++) {
					Thread.sleep(250);
					System.out.print(".");
				}
				System.out.println();
			} catch (Exception e) {
				System.err.println("쓰레드 오류");
			}
			
			comRd = rd.nextInt(3) + 1;
			
			if (total + comRd < ENDNUM) {
				for (int i = total + 1; i <= comRd + total; i++) {
					System.out.println("Com : " + i);
				}
				total += comRd;
			} else if (total > ENDNUM) {
				System.out.print("졌습니다");
				return;
			} else if (total < ENDNUM) {
				for (int i = total + 1; i <= ENDNUM; i++) {
					System.out.println("Com : " + i);
				}
				System.out.print("이겼습니다");
				return;
			}
		}
		System.out.print("졌습니다");
	}

	private static void outPut(String strIn) {
		try {
			for (int i = 0; i < strIn.length(); i++) {
				System.out.print(strIn.charAt(i));
				Thread.sleep(30);
			}
		} catch (Exception e) {
			System.err.println("outPut err");
		}
	}
}
