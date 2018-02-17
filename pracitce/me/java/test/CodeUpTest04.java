package me.java.test;
/*문자 -> ASCII 코드 출력*/
import java.util.Scanner;

public class CodeUpTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.print((int)ch);
	}
}
