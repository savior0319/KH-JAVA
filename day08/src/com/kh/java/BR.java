package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class BR {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int input = 0, i = 0, total = 1;

		String rule = "***********게임룰 설명***********" + 
					  "\n마지막 31을 먼저 말하는 사람이 지는게임!" + 
					  "\n한번에 1~3개 까지 말 할 수 있다!" + 
					  "\n*****************************";
		
		System.out.println("     === 베스킨 라빈스 게임 ====\n");
		for (i = 0; i <= rule.length(); i++) {
			try {
				System.out.print(rule.charAt(i));
				Thread.sleep(30);
			} catch (Exception e) {
				while (true) {
					if (total < 31) {
						System.out.print("\n<1~3>개의 숫자 입력 : ");
						input = sc.nextInt();

						if (!(1 <= input && input <= 3)) {
							System.out.println("\n1부터 3까지 숫자만 입력");
							continue;
						}

						for (i = total; i <= total + input - 1; i++) {
							System.out.println("User : " + i);

							if (i >= 31) {
								System.out.print("\n컴퓨터가 이겼습니다");
								return;
							}
						}
						total += input;
					}

					int comRan = rd.nextInt(2) + 1;

					for (i = total; i <= total + comRan; i++) {
						System.out.println("Com : " + i);

						if (i >= 31) {
							System.out.print("\n유저가 이겼습니다");
							return;
						}

					}
					total += comRan + 1;
				}
			}
		}
	}
}
