package me.java.test;
/*숫자 사각형 2*/
import java.util.Scanner;

public class NumSquareUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int k = 1;
		int[][] arr = new int[first][first];

		switch (second) {
		case 1:
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = k;
				}
				k++;
			}
			break;

		case 2:
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < arr.length; j++) {
						arr[j][i] = k++;
					}
					k = 1;
				} else {
					for (int j = first - 1; j >= 0; j--) {
						arr[j][i] = k++;
					}
					k = 1;
				}
			}

			break;
		case 3:
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = (i + 1) * (j + 1);
				}

			}
			break;

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
}
