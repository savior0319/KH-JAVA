package com.exception.charcheck;

import java.util.*;

public class Run {
	public static void main(String[] args) {
		CharacterProcess cp = new CharacterProcess();
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� -> ");
		cp.setStr(sc.nextLine());
		try {
			System.out.println(cp.countAlpha());
		} catch (CharCheckException e) {
			System.out.println(e.getMessage());
		}
	}
}
