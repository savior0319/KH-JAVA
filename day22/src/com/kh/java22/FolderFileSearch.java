package com.kh.java22;

import java.io.File;
import java.util.Scanner;

public class FolderFileSearch {
	private Scanner sc = new Scanner(System.in);
	public FolderFileSearch() {
		System.out.print("�˻��� ��� �Է� >> ");
		File path = new File(sc.next());
		File [] files = path.listFiles();
		for(File i : files) {
			System.out.println(i);
		}
	}
}
