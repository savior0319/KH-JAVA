package com.exception.number;

public class NumberProcess {
	
	private int num1, num2;
	public int getNum1() { return num1; }
	public void setNum1(int num1) { this.num1 = num1; }
	public int getNum2() { return num2; }
	public void setNum2(int num2) { this.num2 = num2; }

	public NumberProcess() { }

	public boolean checkDouble(int num1, int num2) throws NumberRangeException {
		this.num1 = num1;
		this.num2 = num2;
		boolean isFlag;
		if(!((1 <= num1 && num1 <= 100) && (1 <= num2 && num2 <= 100))) {
			throw new NumberRangeException("\"1~100 사이의 값이 아닙니다\"");
		} else if(num1 % num2 == 0) { isFlag = true; } 
		  else { isFlag = false; }
		return isFlag;
	}
}
