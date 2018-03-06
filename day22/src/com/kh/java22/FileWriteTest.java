package com.kh.java22;

import java.io.*;
import java.util.Scanner;

public class FileWriteTest {

	//private final String LS = System.getProperty("line.separator");
	private Scanner sc = new Scanner(System.in);
	// private DataOutputStream dos = null;
	// private FileWriter fw = null;
	private BufferedWriter bw = null;

	public FileWriteTest() {
		System.out.print("저장할 파일명 >> ");
		String filname = sc.next();
		sc.nextLine();
		String str = new String();
		try {
			//dos = new DataOutputStream(new FileOutputStream("C:\\Users\\user1\\Desktop\\" + filname + ".txt"));
			bw = (new BufferedWriter(new FileWriter("C:\\Users\\user1\\Desktop\\" + filname + ".txt")));
			System.out.println("'" + filname + "' 파일에 저장될 내용 입력 >> ");
			int lineNumber = 1;
			while (true) {
				System.out.print((lineNumber++) + ": ");
				str = (lineNumber - 1) + " : " + sc.nextLine();
				if (str.equals((lineNumber - 1) + " : " + "exit")) {
					System.out.println("※ 종료!");
					break;
				}
				bw.write(str);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
		try { bw.close(); } catch (IOException e) { }
		}
	}
}
