package kh.java.test;

import java.util.Scanner;

public class testMain5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1부터 100까지의 수 중 선택: ");
		int num1 = sc.nextInt();

		if (0 < num1 && num1 < 101) {
			if (num1 % 2 == 0) {
				System.out.println("입력한 수는 짝수입니다.");
			} else {
				System.out.print("입력한 수는 홀수입니다.");
			}
		} else {
			System.out.print("수를 잘못 입력했습니다.");
		}

	}

}
