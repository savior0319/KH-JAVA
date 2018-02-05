package kh.java.test;

import java.util.Scanner;

public class testMain1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("= = = 두 수 비교 하는 프로그램 v1.0 = = =\n");

//		while (true) {
			System.out.print("첫 번째 수를 입력하세요 : ");
			int firstN = sc.nextInt();
			System.out.print("두 번쨰 수를 입력하세요 : ");
			int secondN = sc.nextInt();

			if (firstN > secondN) {
				System.out.println(firstN + " > " + secondN);
				System.out.println("첫 번쨰 수가 더 큽니다.\n");

			} else if (firstN < secondN) {
				System.out.println(firstN + " < " + secondN);
				System.out.println("두 번쨰 수가 더 큽니다.\n");

			} else if (firstN == secondN) {
				System.out.println(firstN + " = " + secondN);
				System.out.println("두 수가 같은 수입니다.\n");
			}
//		}
	}
}
