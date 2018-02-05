package cast.practice;

import java.util.Scanner;

public class CastingSample {

	Scanner sc = new Scanner(System.in);

	public void printUniCode() {

		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.print(ch + " is unicode : ");
		System.out.printf("%d", (int) ch);
		System.out.println();
		System.out.println();

	}

	public void calculatorScore() {

		double kor, eng, math;
		int sum, avg;

		sc.skip("\r\n");
		System.out.print("국어 : ");
		kor = sc.nextDouble();
		System.out.print("영어 : ");
		eng = sc.nextDouble();
		System.out.print("수학 : ");
		math = sc.nextDouble();
		System.out.println();

		sum = (int) (kor + eng + math);
		avg = (int) sum / 3;

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println();
	}

	public void printBitCount() {
		System.out.print("정수 입력 : ");
		int inputNum = sc.nextInt();
		// String str = Integer.toBinaryString(inputNum);
		int sum = 0;
		/*
		 * for (int i = 0; i < str.length(); i++) { sum +=
		 * Character.getNumericValue(str.charAt(i)); }
		 */

		sum = Integer.bitCount(inputNum);

		System.out.println(inputNum + "의 2진수에 포함된 1의 갯수는 : " + sum);
	}
}
