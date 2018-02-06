package kh.java.test.function;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);

	public void opSample1() {

		int kor, eng, math, sum;
		double avg;

		System.out.print("국어 점수입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수입력 : ");
		math = sc.nextInt();

		sum = kor + eng + math;
		avg = sum / 3;

		if ((kor >= 40 && eng >= 40 && math >= 40) && avg >= 60) {
			System.out.print("합격\n\n");
		} else {
			System.out.print("불합격\n\n");
		}
	}

	public void opSample2() {
		sc.nextLine();
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}
}