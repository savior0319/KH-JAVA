package com.kh.java;

public class TestMain_03 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (j * i >= 10)
					System.out.print(j + "x" + i + "=" + j * i + " ");
				else
					System.out.print(j + "x" + i + "= " + j * i + " ");
			}
			System.out.println();
		}
	}
}
