/*Array Copy*/
package com.kh.java;

import java.util.Scanner;

public class ArrayCopy {

	public ArrayCopy() {
		Scanner sc = new Scanner(System.in);
		char[] num = new char[13];
		String inNum;

		System.out.print("전화번호를 입력하세요 : ");
		inNum = sc.nextLine();

		System.out.print("변환된 값 : ");

		for (int i = 0; i < num.length; i++) {
			num[i] = inNum.charAt(i);
			if (4 <= i && i <= 7) {
				System.out.print("*");
			} else
				System.out.print(num[i]);
		}

		System.out.println("\n처음 입력한 값 : " + inNum);

	}

	public static void main(String[] args) {
		new ArrayCopy();
	}

}
