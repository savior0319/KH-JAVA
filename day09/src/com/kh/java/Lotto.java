
/*if (1 <= input[i] && input[i] <= 45) {
	break;
} else
	System.out.println("<1~45까지만 입력하세요>");*/

package com.kh.java;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Lotto {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int[] input = new int[6];
		int[] lotto = new int[6];
		int tempInput;
		int count = 0, totalCount = 1;
		System.out.println("<1~45>까지 번호를 중복없이 6개 입력하세요");

		for (int i = 0; i < input.length; i++) {
			System.out.print(i + 1 + "번째 번호 입력 : ");
			tempInput = sc.nextInt();
			boolean isFlag = true;
			for (int j = 0; j < i; j++) {
				if (tempInput == input[j]) {
					i -= 1;
					isFlag = false;
					System.out.println("중복된 값을 넣을수 없습니다");
					break;
				}
			}
			if (isFlag) {
				input[i] = tempInput;
			}
		}

		while (true) {
			totalCount++;
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = rd.nextInt(45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i -= 1;
						break;
					}
				}
			}

			System.out.print("당첨 번호 : ");
			for (int i : lotto) {
				System.out.print(i + " ");
			}
			System.out.println();

			for (int i = 0; i < lotto.length; i++) {
				for (int j = 1; j < lotto.length; j++) {
					if (lotto[i] == input[j]) {
						count++;
						if (count == 4) {
							System.out.println("★★★★★★3등입니다\t-" + totalCount +"번★★★★★★");
							try {
								Thread.sleep(3000);
							} catch (Exception e) {
							}
						} else if (count == 5) {
							System.out.println("★★★★★★2등입니다\t-" + totalCount +"번★★★★★★");
							try {
								Thread.sleep(3000);
							} catch (Exception e) {
							}
						} else if (count == 6) {
							System.out.println("★★★★★★1등입니다\t-" + totalCount +"번★★★★★★");
							try {
								Thread.sleep(3000);
							} catch (Exception e) {
							}
						}
					}
				}

			}
			count = 0;

		}
	}
}
