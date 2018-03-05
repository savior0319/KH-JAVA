package com.kh.java21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SetTest {

	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet<Integer>();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		hSet.add(100);
		hSet.add(200);
		hSet.add(200);
		hSet.add(300);
		hSet.add(400);
		Iterator<Integer> it = hSet.iterator();
		try {
			System.out.println(it.hasNext());
			System.out.println(it.next());
			System.out.println(it.hasNext());
			System.out.println(it.next());
			System.out.println(it.hasNext());
			System.out.println(it.next());
			System.out.println(it.hasNext());
			System.out.println(it.next());
			System.out.println(it.hasNext());
			System.out.println(it.next());
		} catch (NoSuchElementException e) {
			System.out.println("\ngg");
		}
		
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		aList.addAll(hSet);
		Collections.sort(aList);
		for(Integer i : aList) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collections.reverse(aList);
		for(Integer i : aList) {
			System.out.print(i + " ");
		}
		
	}
}
