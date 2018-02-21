package kh.java.control;

import kh.java.model.vo.Gold;
import kh.java.model.vo.Silver;
import kh.java.model.vo.Vip;

public class Pntmgr {
	private int countSv = 0, countGd = 0, countVp = 0;
	private Silver[] sv = new Silver[10];
	private Gold[] gd = new Gold[10];
	private Vip[] vp = new Vip[10];

	public Pntmgr() {
	}

	public void insertData(Silver sv) {
		this.sv[countSv++] = sv;
	}

	public void insertData(Gold gd) {
		this.gd[countGd++] = gd;
	}

	public void insertData(Vip vp) {
		this.vp[countVp++] = vp;
	}

	public void printData() {
		System.out.println("\n<──────────────────────Information──────────────────────>");
		System.out.println(" 이름\t\t등급\t\t포인트\t\t이자포인트");
		for (int i = 0; i < countSv; i++) {
			System.out.println(" " + sv[i].getName() + "\t\t" + sv[i].getGrade() + "\t\t" + sv[i].getPoint() + "\t\t"
					+ sv[i].getInterest());
		}
		for (int i = 0; i < countGd; i++) {
			System.out.println(" " + gd[i].getName() + "\t\t" + gd[i].getGrade() + "\t\t" + gd[i].getPoint() + "\t\t"
					+ gd[i].getInterest());
		}
		for (int i = 0; i < countVp; i++) {
			System.out.println(" " + vp[i].getName() + "\t\t" + vp[i].getGrade() + "\t\t" + vp[i].getPoint() + "\t\t"
					+ vp[i].getInterest());
		}
		System.out.println("────────────────────────────────────────────────────────");
	}
}
