package me.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetLotto {
	public static void main(String[] args) {
		int temp, count = 1;

		while (true) {
			HashSet<Integer> hSet = new HashSet<Integer>();
			ArrayList<Integer> aList = new ArrayList<Integer>();
			try {
				while (hSet.size() < 6) {
					temp = (int) (Math.random() * 45) + 1;
					hSet.add(temp);
				}
				aList.addAll(hSet);
				Collections.sort(aList);
				System.out.printf("%d ¹øÂ° -> ", count);
				Iterator<Integer> it = aList.iterator();
				while (it.hasNext()) {
					System.out.print(it.next() + " ");
				}
				count++;
				System.out.println();
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
