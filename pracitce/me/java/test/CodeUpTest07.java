package me.java.test;
/*최대 값과 두번째로 큰 값 출력*/
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
