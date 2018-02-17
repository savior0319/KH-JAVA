package me.java.test;

import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				String str = sc.nextLine();
				int out = 0;
				String[] arr = str.split("");
				if (arr[0].equals("0")) {
					if (arr[1].equals("1")) {
						out += 64;
					}
					if (arr[2].equals("1")) {
						out += 32;
					}
					if (arr[3].equals("1")) {
						out += 16;
					}
					if (arr[4].equals("1")) {
						out += 8;
					}
					if (arr[5].equals("1")) {
						out += 4;
					}
					if (arr[6].equals("1")) {
						out += 2;
					}
					if (arr[7].equals("1")) {
						out += 1;
					}
				} else if ((arr[0].equals("1"))) {
					out -= 128;
					if (arr[1].equals("1")) {
						out += 64;
					}
					if (arr[2].equals("1")) {
						out += 32;
					}
					if (arr[3].equals("1")) {
						out += 16;
					}
					if (arr[4].equals("1")) {
						out += 8;
					}
					if (arr[5].equals("1")) {
						out += 4;
					}
					if (arr[6].equals("1")) {
						out += 2;
					}
					if (arr[7].equals("1")) {
						out += 1;
					}
				}
				System.out.print(out);
				break;
			} catch (Exception e) {
				System.out.println("8자리 이상 입력");
			}
		}
	}
}
