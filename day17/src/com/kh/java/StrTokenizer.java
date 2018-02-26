package com.kh.java;

import java.util.StringTokenizer;

public class StrTokenizer {
	public static void main(String[] args) {
		String str = "J a v a P r o g r a m ";
		String strSave = new String();
		StringTokenizer st = new StringTokenizer(str, " ");
		char ch[] = new char[st.countTokens()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = st.nextToken().charAt(0);
			System.out.print(ch[i]);}
		System.out.println();
		for (char i : ch) { 
			if ('a' <= i && i <= 'z') { strSave += (char) (32 ^ i); } 
			else strSave += i; }
		System.out.println("출력의 결과 : "+ strSave);
	}
}
