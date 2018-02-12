/*Motel 관리 프로그램*/
package com.kh.java;

import java.util.Scanner;

public class Motel {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menu, selectRoom, roomSize;
		boolean isFlag = true;
		System.out.println("★★★★★★★★호텔관리프로그램★★★★★★★★");
		System.out.print("방의 개수를 입력하세요 : ");
		roomSize = sc.nextInt();
		int[] room = new int[roomSize];

		for (int i = 0; i < room.length; i++) {
			room[i] = 0;
		}

		while (isFlag) {
			System.out.println("\n1.입실\t2.퇴실\t3.방보기 \t4.종료");
			System.out.print("선택 > ");
			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("<<입실을 선택했습니다>>\n");
				System.out.print("방을 선택하세요 <1~" + roomSize + "번방> : ");
				selectRoom = sc.nextInt();
					if (room[selectRoom - 1] == 0) {
						room[selectRoom - 1] = 1;
						System.out.println(selectRoom + "번방이 예약되었습니다");
					} else {
						System.out.println(selectRoom + "번방은 현재 손님이 있습니다");
					} 
			} else if (menu == 2) {
				System.out.println("<<퇴실을 선택했습니다>>\n");
				System.out.print("퇴실할 방을 선택하세요 <1~10번방> : ");
				selectRoom = sc.nextInt();
				if (room[selectRoom - 1] == 1) {
					room[selectRoom - 1] = 0;
					System.out.println(selectRoom + "번방이 퇴실 되었습니다");
				} else {
					System.out.println("퇴실할 방을 잘못입력했습니다");
				}

			} else if (menu == 3) {
				System.out.println("<<방보기를 선택했습니다>>\n");
				System.out.println("★★★★★★★★★★★★★★★★★");
				for (int i = 0; i < room.length; i++) {
					if (room[i] == 0) {
						System.out.println(i + 1 + "번째 방은 비어있습니다");
					} else if (room[i] == 1) {
						System.out.println(i + 1 + "번째 방은 현재 손님이 있습니다");
					}
				}
				System.out.println("★★★★★★★★★★★★★★★★★");
			} else if (menu == 4) {
				System.out.print("\n\t-----종료합니다-----");
				isFlag = false;
			} else {
				System.out.println("***메뉴를 잘못 선택했습니다***");
			}
		}
	}
}
