package com.kh.java19;

public class ExceptionTest {

	public void sum(int a, int b) throws NoZeroException {
		if (a == 0 || b == 0) { throw new NoZeroException("0으로는 나눌수 없습니다"); }
		System.out.println(a + b);
	}

}
