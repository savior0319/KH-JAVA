package me.java.test;
/*10진수 -> 2진수 출력*/
import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		String convert = Integer.toBinaryString(value);
		System.out.print(convert);
	}
}
