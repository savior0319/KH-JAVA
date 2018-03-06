package com.kh.java22;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Fwrite {
	public static void main(String[] args) {
		final String PATH = System.getProperty("user.home") + "/Desktop/";
		Scanner sc = new Scanner(System.in);
		String fileName;
		System.out.print("�����̸� �Է� -> ");
		fileName = sc.next();
		sc.nextLine();
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + fileName + ".txt"))) {
			String temp; 
			System.out.print("������ ���� �Է� -> ");
			temp = sc.nextLine();
			bw.write(temp);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
