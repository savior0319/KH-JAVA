package com.exception.number;

import java.util.Scanner;

public class CheckNumberRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberProcess np = new NumberProcess();
		
		System.out.print("첫번째 정수 입력 -> ");
		np.setNum1(sc.nextInt());
		System.out.print("두번째 정수 입력 -> ");
		np.setNum2(sc.nextInt());
		
		try {
			if(np.checkDouble(np.getNum1(), np.getNum2()) == true) {
			System.out.println("첫번째 수 \"" + np.getNum1() +"\"은(는) " 
								+ "두번째 수 \"" + np.getNum2() +"\"의 배수 입니다") ;
			} else System.out.println("첫번째 수 \"" + np.getNum1() +"\"은(는) " 
								+ "두번째 수 \"" + np.getNum2() +"\"의 배수가 아닙니다") ;
		} catch (NumberRangeException e) { System.out.println(e.getMessage()); } 
		  finally { try { System.out.println(np.checkDouble(np.getNum1(), np.getNum2())); } 
		  catch (Exception e1) { e1.getMessage(); }
		}
	}
}
