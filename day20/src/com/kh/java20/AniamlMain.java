package com.kh.java20;

public class AniamlMain {

	public static void main(String[] args) {
		AnimalMgr<Tiger> a1 = new AnimalMgr<Tiger> (new Tiger(100));
		AnimalMgr<Bear> a2 = new AnimalMgr<Bear>(new Bear(200));
		
		System.out.println(a1.data.hp);
		System.out.println(a2.data.hp);
	}
}
