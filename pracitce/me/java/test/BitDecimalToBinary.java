package me.java.test;

import java.util.Scanner;

public class BitDecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("-128 ~ 127 ������ ���� �Է� : ");
			int temp = sc.nextInt();
			if (-128 <= temp && temp < 127) {
				Byte b = (byte) temp;
				String str = Integer.toBinaryString(b);
				System.out.print("��ȯ�ȼ� -> ");
				if (b >= 0) {
					for (int i = str.length(); i < 8; i++) {
						System.out.print("0");
					}
					System.out.print(str);
					break;
				} else {
					System.out.print(str.substring(24, 32));
					break;
				}
			} else {
				System.out.println("\n�� -128 ~ 127 ������ ���ڸ� �Է�!!\n");
				continue;
			}
		}
	}
}
