package com.kh.java22;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
	Scanner sc = new Scanner(System.in);
	public FileSearch() {
		System.out.print("검색할 파일 입력 >> ");
		String findFile = sc.nextLine();
		File f = new File(findFile);
		if(f.exists()) {  // exist 메소드는 파일이 존재 하면 true, 없으면 false
			System.out.println("\n파일명 : " + f.getName());
			System.out.println("파일 절대경로 : " + f.getAbsolutePath());
			System.out.println("파일 상대경로 : " + f.getPath());
			System.out.println("파일 크기 : " + String.format("%.2f", (f.length() / (double)(1024 * 1024))) + "MB");
		} else { System.out.println(findFile + " 파일이 없습니다"); return;}
	}
}
