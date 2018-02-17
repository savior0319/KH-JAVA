package me.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeUpTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX = 7;

		ArrayList<Integer> aList = new ArrayList<Integer>();

		for (int i = 1; i <= MAX; i++) {
			int inVal = sc.nextInt();
			aList.add(inVal);
		}

		Collections.sort(aList);

		System.out.print(aList.get(6) + "\n" + aList.get(5));
	}
}
