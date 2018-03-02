package com.kh.collections;

import java.util.*;

public class ArrayListMain {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();

		aList.add("B");
		aList.add("A");
		aList.add("E");
		aList.add("Z");
		aList.add("C");
	
		
		for (String str : aList) {
			System.out.println(str);
		}
	}
}
