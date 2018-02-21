package kh.java.run;

import kh.java.control.Pntmgr;
import kh.java.model.vo.Gold;
import kh.java.model.vo.Silver;
import kh.java.model.vo.Vip;

public class Main {
	public static void main(String[] args) {
		Pntmgr mgr = new Pntmgr();
		mgr.insertData(new Silver("ȫ�浿", "�ǹ�", 1000));
		mgr.insertData(new Silver("�踻��", "�ǹ�", 2000));
		mgr.insertData(new Silver("�˶���", "�ǹ�", 3000));
		mgr.insertData(new Gold("�����", "���", 3000));
		mgr.insertData(new Gold("�ں���", "���", 3000));
		mgr.insertData(new Vip("��ȸ��", "VIP", 3000));
		mgr.printData();
	}
}
