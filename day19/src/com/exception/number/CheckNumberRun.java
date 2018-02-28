package com.exception.number;

import java.util.Scanner;

public class CheckNumberRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberProcess np = new NumberProcess();
		
		System.out.print("ù��° ���� �Է� -> ");
		np.setNum1(sc.nextInt());
		System.out.print("�ι�° ���� �Է� -> ");
		np.setNum2(sc.nextInt());
		
		try {
			if(np.checkDouble(np.getNum1(), np.getNum2()) == true) {
			System.out.println("ù��° �� \"" + np.getNum1() +"\"��(��) " 
								+ "�ι�° �� \"" + np.getNum2() +"\"�� ��� �Դϴ�") ;
			} else System.out.println("ù��° �� \"" + np.getNum1() +"\"��(��) " 
								+ "�ι�° �� \"" + np.getNum2() +"\"�� ����� �ƴմϴ�") ;
		} catch (NumberRangeException e) { System.out.println(e.getMessage()); } 
		  finally { try { System.out.println(np.checkDouble(np.getNum1(), np.getNum2())); } 
		  catch (Exception e1) { e1.getMessage(); }
		}
	}
}
