package me.java.test;

import java.util.Scanner;

public class CodeUpTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st1 = 0, st2 = 0, st3 = 0;
		int temp;
		int n = 0, m = 0, o = 0;
		int st1countThree = 0, st2countThree = 0, st3countThree = 0;
		int st1countTwo = 0, st2countTwo = 0, st3countTwo = 0;

		int num = sc.nextInt();

		for (int i = 1; i <= num * 3; i++) {
			temp = sc.nextInt();
			if (i <= num * 3) {
				if (i == 1 + (3 * n)) {
					st1 += temp;
					n++;
					if (temp == 3) {
						st1countThree++;
					} else if (temp == 2) {
						st1countTwo++;
					}
				}
			}
			if (i <= num * 3) {
				if (i == 2 + (3 * m)) {
					st2 += temp;
					m++;
					if (temp == 3) {
						st2countThree++;
					} else if (temp == 2) {
						st2countTwo++;
					}
				}
			}
			if (i <= num * 3) {
				if (i == 3 + (3 * o)) {
					st3 += temp;
					o++;
					if (temp == 3) {
						st3countThree++;
					} else if (temp == 2) {
						st3countTwo++;
					}
				}
			}
		}

		if ((st1 > st2) && (st1 > st3)) { 
			System.out.println("1 " + st1);
		} else if ((st2 > st1) && (st2 > st3)) { 
			System.out.println("2 " + st2);
		} else if ((st3 > st2) && (st3 > st1)) { 
			System.out.println("3 " + st3);
		} else if (st1 == st2 || st2 == st3 || st3 == st1) { 

			if (st1countThree == st2countThree || st2countThree == st3countThree || st3countThree == st1countThree) {
				if ((st1 > st2) || (st1 > st3)) {
					System.out.println("0 " + st1);
				} else if ((st2 > st3) || (st2 > st1)) {
					System.out.println("0 " + st2);
				} else if ((st3 > st1) || (st3 > st2)) {
					System.out.println("0 " + st3);
				} else if (st1countTwo > st2countTwo && st1countTwo > st3countTwo) {
					System.out.println("1 " + st1);
				} else if (st2countTwo > st1countTwo && st2countTwo > st3countTwo) {
					System.out.println("2 " + st2);
				} else if (st3countTwo > st1countTwo && st3countTwo > st2countTwo) {
					System.out.println("3 " + st3);
				} else if (st1countTwo == st2countTwo || st2countTwo == st3countTwo || st3countTwo == st1countTwo) {
					System.out.println("0 " + st1);
				}
			} else if (st1countThree > st2countThree && st1countThree > st3countThree) {
				System.out.println("1 " + st1);
			} else if (st2countThree > st1countThree && st2countThree > st3countThree) {
				System.out.println("2 " + st2);
			} else if (st3countThree > st1countThree && st3countThree > st2countThree) {
				System.out.println("3 " + st3);
			}
		}
	}

}
