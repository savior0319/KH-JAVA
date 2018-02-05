package kh.java.test;

import java.util.Scanner;

public class testMain3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sumPay;
		System.out.print("놀이 공원 프로그램  v1.0\n");

//		while (true) {
			System.out.print("입장 하실 인원은 총 몇명입니까? ");
			int in = sc.nextInt();
			System.out.print("어른은 몇명입니까? <인원당 1만 5천원> ");
			int adult = sc.nextInt();
			System.out.print("아이는 몇명입니까? <인원당 5천원> ");
			int kid = sc.nextInt();

			if (in == (adult + kid)) {
				sumPay = 15000 * adult + 5000 * kid;
				System.out.print("지불하실 총 금액은 " + sumPay + "원 입니다.\n\n");
			} else {
				System.out.print("인원이 맞지 않습니다.\n\n");
			}
//		}
	}
}
