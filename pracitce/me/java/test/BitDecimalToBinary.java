package me.java.test;

import java.util.Scanner;

public class BitDecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("-128 ~ 127 ������ ���� �Է� : ");
		Byte b = sc.nextByte();
		String str = Integer.toBinaryString(b);

		System.out.print("���������� ��ȯ�� �� -> ");
		if (b >= 0) {
			for (int i = str.length(); i < 8; i++) {
				System.out.print("0");
			}
			System.out.print(str);
		} else {
			System.out.print(str.substring(24, 32));
		}
	}
}