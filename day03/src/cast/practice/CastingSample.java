package cast.practice;

import java.util.Scanner;

public class CastingSample {

	Scanner sc = new Scanner(System.in);

	public void printUniCode() {

		System.out.print("���� �Է� : ");
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
		System.out.print("���� : ");
		kor = sc.nextDouble();
		System.out.print("���� : ");
		eng = sc.nextDouble();
		System.out.print("���� : ");
		math = sc.nextDouble();
		System.out.println();

		sum = (int) (kor + eng + math);
		avg = (int) sum / 3;

		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println();
	}

	public void printBitCount() {
		System.out.print("���� �Է� : ");
		int inputNum = sc.nextInt();
		String str = Integer.toBinaryString(inputNum);
		String[] strDiv = str.split("");

		int i, sum = 0;
		int[] strInt = new int[strDiv.length];

		for (i = 0; i < strDiv.length; i++) {
			strInt[i] = Integer.parseInt(strDiv[i]);
		}

		for (i = 0; i < strDiv.length; i++) {
			sum += strInt[i];
		}

		System.out.println(inputNum + "�� 2������ ���Ե� 1�� ������ : " + sum);

	}
}
