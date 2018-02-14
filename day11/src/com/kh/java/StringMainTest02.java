package com.kh.java;

public class StringMainTest02 {

	public static void main(String[] args) {		
		for (int i = 0; i < Integer.parseInt(args[1]); i++) {
			System.out.println(args[0]);
			try {
				Thread.sleep(1000 * Integer.parseInt(args[2]));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
