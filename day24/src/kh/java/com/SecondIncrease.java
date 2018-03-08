package kh.java.com;

import java.util.Scanner;

public class SecondIncrease implements Runnable {
	@Override
	public void run() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.nextInt() == 1) {
				SecondDecrease.second += 10;
			}
		}
	}
}
