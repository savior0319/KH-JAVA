package com.kh.java21;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(180101, "ȫ�浿");
		hm.put(160101, "�踻��");
		hm.put(170101, "����");
		hm.put(150101, "Ȳ����");
		hm.put(150102, "Ȳ����");
		
		Iterator<Integer> it = hm.keySet().iterator();
		
		while (it.hasNext()) {
			int temp = it.next();
			System.out.println(temp + " " + hm.get(temp));
		} // ��ü ���

		// if(hm.containsKey(150102)) {
		// System.out.println("�й��� �ߺ� �˴ϴ�");
		// } else hm.put(150102, "�ѼҶ�");
		//
		// System.out.println(hm);
		//
		// System.out.println(hm.get(150102));
		// System.out.println(hm.get(150103));
		//
		// System.out.println(hm.remove(150101));

		// Set<Integer> s = hm.keySet(); // Ű ���� ������
		// System.out.println(s);
	}
}
