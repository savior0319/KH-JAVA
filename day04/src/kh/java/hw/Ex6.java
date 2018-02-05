package kh.java.hw;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, sum;
		double avg;
		
		System.out.print("국어점수 :");
		kor = sc.nextInt();
		System.out.print("영어점수 :");
		eng = sc.nextInt();
		System.out.print("수학점수 :");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3;

		if(kor >= 40 && eng >= 40 && math >= 40) {
			if(avg >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		
	}

}
