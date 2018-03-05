package com.kh.java21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class LottoSet {

	static int tryCount = 0;

	public static void main(String[] args) {
		final int END = 6;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hsetIn = new HashSet<Integer>();
		ArrayList<Integer> aListIn = new ArrayList<Integer>();
		
		for (int i = hsetIn.size(); i < END; i++) {
			System.out.print((i + 1) + " 번째 숫자를 입력하세요 : ");
			int temp = sc.nextInt();
			if (hsetIn.add(temp) == true) {
				hsetIn.add(temp);
			} else { i--; System.out.println("※ 중복된 숫자 입니다"); }
		}

		aListIn.addAll(hsetIn);
		Collections.sort(aListIn);
		System.out.println("내가 입력한 숫자 : " + aListIn);
		try { Thread.sleep(1500);} 
		catch (InterruptedException e) {}

		while (true) {
			tryCount++;
			HashSet<Integer> hSet = new HashSet<Integer>();
			ArrayList<Integer> aList = new ArrayList<Integer>();

			while (hSet.size() < END) {
				int temp = (int) (Math.random() * 45) + 1;
				hSet.add(temp);
			}

			aList.addAll(hSet);
			Collections.sort(aList);

			for (int i : aList) {
				System.out.print(i + " ");
			} System.out.println();

			try { Thread.sleep(1); } 
			catch (InterruptedException e) {}

			for (int i = 0; i < aListIn.size(); i++) {
				for (int j = 0; j < aList.size(); j++) {
					if (aListIn.get(i) == aList.get(j)) {
						count++;
					}
				}
				switch (count) {
				case 4:outPrint(3); break;
				case 5:outPrint(2); break;
				case 6:outPrint(1); break;
				}
			} count = 0;
		}
	}

	public static void outPrint(int rank) {
		System.out.println("\n ※" + rank + " 등 당첨!!\n");
		System.out.println("지금까지 " + tryCount + "번");
		try { Thread.sleep(500); } 
		catch (InterruptedException e) {}
	}
}
