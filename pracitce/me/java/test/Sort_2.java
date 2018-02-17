package me.java.test;
/*���� - Collections Framework - ArrayList ���*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Sort_2 {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		for (int i = 0; i < max; i++) {
			aList.add(sc.nextInt());
		}
		Collections.sort(aList);
		Iterator<Integer> it = aList.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
