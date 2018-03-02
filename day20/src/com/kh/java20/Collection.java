package com.kh.java20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Collection {

	public static void main(String[] args) {
		int a;
		final int END = 6;
		HashSet<Integer> hSet = new HashSet<Integer>();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		while(hSet.size() < END) {
			a = (int) (Math.random() * 45) + 1;
			hSet.add(a);
		} 
		
		aList.addAll(hSet);
		Collections.sort(aList);
		
		for(Integer i : aList) {
			System.out.print(i + " ");
		}
	}
}
