package com.kh.java22;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
	Scanner sc = new Scanner(System.in);
	public FileSearch() {
		System.out.print("�˻��� ���� �Է� >> ");
		String findFile = sc.nextLine();
		File f = new File(findFile);
		if(f.exists()) {  // exist �޼ҵ�� ������ ���� �ϸ� true, ������ false
			System.out.println("\n���ϸ� : " + f.getName());
			System.out.println("���� ������ : " + f.getAbsolutePath());
			System.out.println("���� ����� : " + f.getPath());
			System.out.println("���� ũ�� : " + String.format("%.2f", (f.length() / (double)(1024 * 1024))) + "MB");
		} else { System.out.println(findFile + " ������ �����ϴ�"); return;}
	}
}
