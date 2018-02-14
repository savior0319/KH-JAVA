package com.kh.java.exam;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int selelct = 0;

		while (true) {
			System.out.println("<<<메뉴>>>");
			System.out.println("1. 입력");
			System.out.println("2. 조회");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 종료");
			System.out.print("선택 : ");
			selelct = sc.nextInt();

			if (!(1 <= selelct && selelct <= 5)) {
				System.out.println("메뉴를 잘못선택했습니다\n");
				continue;
			} else
				break;
		}

		switch (selelct) {
		case 1:
			System.out.println("*** 입력이 정상적으로 되었습니다 ***");
			break;
		case 2:
			System.out.println("*** 조회가 정상적으로 되었습니다 ***");
			break;
		case 3:
			System.out.println("*** 수정이 정상적으로 되었습니다 ***");
			break;
		case 4:
			System.out.println("*** 삭제가 정상적으로 되었습니다 ***");
			break;
		case 5:
			System.out.println("***종료 정상적으로 되었습니다 ***");
			break;
		}
	}
}
