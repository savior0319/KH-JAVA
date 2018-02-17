package me.java.test;
/*2진수 8진수 16진수 출력*/
import java.util.Scanner;

public class CodeUpTest06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		String strIn = Integer.toBinaryString(in);
		System.out.println("2 " + strIn);
		System.out.printf("8 %o", in);
		System.out.println();
		System.out.printf("16 %X", in);
	}
}
