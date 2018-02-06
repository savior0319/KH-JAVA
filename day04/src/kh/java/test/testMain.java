package kh.java.test;

import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 숫자 구별 프로그램 v1.0 ======\n");

		System.out.print("수 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("당신이 입력한 수 " + num + "는 양수입니다.");
		} else if (num == 0) {
			System.out.println("당신이 입력한 수 " + num + "는 0입니다.");
		} else {
			System.out.println("당신이 입력한 수 " + num + "는 음수입니다.");
		}

	}

}
