package com.kh.java;

import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer();
//		sb.append("HELLO");
//		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
//		sb.insert(5, " JAVA");
//		sb.replace(0, 5, "HELL WORLD");
//		System.out.println(sb);
//		sb.replace(5, 10, "HOHO");
//		System.out.println(sb);
//		System.out.println(sb.capacity());
//		System.out.println(sb.length());
//		String[] tempStr = str.split("/");
//		System.out.println("이름 : " + tempStr[0]);
//		System.out.println("나이 : " + tempStr[1]);
//		System.out.println("주소 : " + tempStr[2]);
		
	
		String str = "홍길동/20/경기도 부천";
		int count = 1;
		StringTokenizer st = new StringTokenizer(str, "/");
		while(st.hasMoreTokens()) {
			System.out.println(count + "번째 토큰 : " + st.nextToken());
			count++;
		}
	}
}
