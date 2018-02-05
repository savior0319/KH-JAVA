package kh.java.test;

import java.util.Scanner;

public class testMain9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int inNum = sc.nextInt();

		if ((inNum % 3 == 0) && (inNum % 4 != 0)) {
			System.out.println("[" + inNum + "]" + "은(는) 3의 배수입니다.");
		} else if ((inNum % 3 == 0) && (inNum % 4 == 0) && inNum != 0) {
			System.out.println("[" + inNum + "]" + "은(는) 3의 배수 이면서, 4의배수 입니다.");
		} else if ((inNum % 3 != 0) && (inNum % 4 == 0)) {
			System.out.println("[" + inNum + "]" + "은(는) 4의 배수입니다.");
		} else if ((inNum % 3 != 0) && (inNum % 4 != 0)) {
			System.out.println("[" + inNum + "]" + "은(는) 3의 배수도 4의 배수도 아닙니다.");
		} else {
			System.out.println("[0]은 3의 배수도 4의 배수도 아닙니다.");
		}

	}
}
