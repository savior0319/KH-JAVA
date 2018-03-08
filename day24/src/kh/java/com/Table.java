package kh.java.com;

public class Table {
	public void dataPrint(int n) {
		
		System.out.println("1");
		
		synchronized (this) {
			for (int i = 1; i < 9; i++) {
				System.out.println(n + " x " + i + " = " + (n * i));
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
