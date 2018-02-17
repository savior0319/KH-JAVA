package me.java.test;
/*가변 배열 아파트*/
import java.util.Scanner;

public class VarArrApart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- 아파트 정보 입력 -----");
		System.out.print("건물 총 층수 입력 : ");
		int floor = sc.nextInt();
		String[][] apart = new String[floor][];
		System.out.println(floor + "층이 생성 되었습니다");
		for (int i = 0; i < floor; i++) {
			System.out.print(i + 1 + "층의 총 호실 입력 : ");
			int room = sc.nextInt();
			apart[i] = new String[room];

		}
		System.out.println();
		for (int i = 0; i < floor; i++) {
			System.out.println(i + 1 + "층은 " + apart[i].length + "호실 까지 생성되었습니다");
		}
		sc.nextLine();
		System.out.println("\n※각 호실 마다 입주자 이름을 입력하세요");
		for (int i = 0; i < floor; i++) {
			System.out.println("\n-----" + (i + 1) + "층 정보입력-----");
			for (int j = 0; j < apart[i].length; j++) {
				System.out.print((i + 1) + "층 " + (j + 1) + "호 입주자 : ");
				apart[i][j] = sc.nextLine();
			}
		}

		System.out.println("\n-----각층 입주자 정보 출력-----");
		for (int i = 0; i < floor; i++) {
			System.out.print(i + 1 + "층 : ");
			for (int j = 0; j < apart[i].length; j++) {

				System.out.print(apart[i][j] + " ");
			}
			System.out.println();
		}

	}
}
