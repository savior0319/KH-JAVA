package com.kh.java20_1;

import java.util.ArrayList;
import java.util.Collections;

public class MemberRun {

	public static void main(String[] args) {
		ArrayList<Member> aList = new ArrayList<Member>();
		aList.add(new Member("zzz", 9, "������"));
		aList.add(new Member("aaa", 8, "������"));
		aList.add(new Member("ddd", 7, "������"));
		aList.add(new Member("qwe", 6, "������"));
		aList.add(new Member("fgh", 5, "������"));
		aList.add(new Member("hkk", 4, "������"));
		aList.add(new Member("hjk", 3, "������"));
		
		Collections.sort(aList);
		for(Member mb : aList) {
			System.out.println(mb);
		}
	}
}
