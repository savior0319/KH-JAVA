package kh.java.com;

public class SecondDecrease extends Thread {
	public static int second = 30;

	@Override
	public void run() {
		while (second != 0) {
			System.out.println(second-- + " √ ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
