package com.kh.java20;

public class Test {
	
	public static void main(String[] args) {
		GenericEx<Integer, String> g1 = new GenericEx<Integer, String>(5, "JAVA\n");
		GenericEx<Float, Character> g2 = new GenericEx<Float, Character>(5555F, 'H');
		System.out.println(g1.getData1());
		System.out.println(g1.getData2());
		System.out.println(g2.getData1());
		System.out.println(g2.getData2());
	}
}
