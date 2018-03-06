package com.kh.java22;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Fread {
	public static void main(String[] args) {
		final String PATH = System.getProperty("user.home") + "/Desktop/";
		Scanner sc = new Scanner(System.in);
		System.out.print("불러올 파일 이름 입력 -> ");
		String fileName = sc.next();
		try (BufferedReader br = new BufferedReader(new FileReader(PATH + fileName + ".txt"))) {
			String temp = new String();
			while(true) {
				temp = br.readLine();
				if(temp == null) {
					break;
				} else System.out.println(temp);
			}
		}
		catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
