package com.kh.java21;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(180101, "È«±æµ¿");
		hm.put(160101, "±è¸»¶Ë");
		hm.put(170101, "°í±æ¶Ë");
		hm.put(150101, "È²Áö¶Ë");
		hm.put(150102, "È²Áö¶Ë");
		
		Iterator<Integer> it = hm.keySet().iterator();
		
		while (it.hasNext()) {
			int temp = it.next();
			System.out.println(temp + " " + hm.get(temp));
		} // ÀüÃ¼ Ãâ·Â

		// if(hm.containsKey(150102)) {
		// System.out.println("ÇĞ¹øÀÌ Áßº¹ µË´Ï´Ù");
		// } else hm.put(150102, "ÇÑ¼Ò¶Ë");
		//
		// System.out.println(hm);
		//
		// System.out.println(hm.get(150102));
		// System.out.println(hm.get(150103));
		//
		// System.out.println(hm.remove(150101));

		// Set<Integer> s = hm.keySet(); // Å° °ª¸¸ °¡Á®¿È
		// System.out.println(s);
	}
}
