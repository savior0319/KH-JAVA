package kh.java.test;

import java.util.Scanner;

public class testMain2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double result;

		System.out.println("계산기 프로그램 ver 1.0");

//		while (true) {
			System.out.print("연산자를 입력하세요(+, -, *, /) : ");
			char op = sc.next().charAt(0);
			System.out.print("첫 번째 수 입력 : ");
			int firstN = sc.nextInt();
			System.out.print("두 번쨰 수 입력 : ");
			int secndN = sc.nextInt();

			/*String str1 = "1";
			String str2 = "1";
			
			if(str1.equals(str2)) {
				System.out.print("str1 = str2");
			}*/
			
			if (op == '+') {
				result = firstN + secndN;
				System.out.println(firstN + "+" + secndN + "=" + (int) result);
				System.out.println();
			} else if (op == '-') {
				result = firstN - secndN;
				System.out.println(firstN + "-" + secndN + "=" + (int) result);
				System.out.println();
			} else if (op == '*') {
				result = firstN * secndN;
				System.out.println(firstN + "x" + secndN + "=" + (int) result);
				System.out.println();
			} else if (op == '/') {
				result = (double) firstN / (double) secndN;
				System.out.println(firstN + "/" + secndN + "=" + String.format("%.2f", result));
				System.out.println();
			}
//		}
	}
}
