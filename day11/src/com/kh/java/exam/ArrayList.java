package com.kh.java.exam;

import java.util.Collections;

public class ArrayList {
	public static void main(String[] args) {
		java.util.ArrayList<Integer> al = new java.util.ArrayList<Integer>();
		
		al.add(1);
		al.add(5);
		al.add(3);
		
		System.out.println("최대값 : " + Collections.max(al));
		System.out.println("최소값 : " + Collections.min(al));
	}
}
