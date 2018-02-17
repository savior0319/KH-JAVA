package me.java.test;
/*문자 사각형 출력*/
import java.util.Scanner;

public class CharSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intVal = sc.nextInt();
		char[][] arr = new char[intVal][intVal];
		char value = 'A';
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = value++;
					if (value > 'Z') {
						value = 'A';
					}
				}
			} else {
				for (int k = arr.length - 1; k >= 0; k--) {
					arr[i][k] = value++;
					if (value > 'Z') {
						value = 'A';
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
}
