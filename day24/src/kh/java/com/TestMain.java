package kh.java.com;

public class TestMain{
	public static void main(String[] args) {
		
//		Thread t1 = new Thread(new SecondDecrease());
//		Thread t2 = new Thread(new SecondIncrease());
//		t1.start();
//		t1.setPriority(5);
//		t2.start();
//		t1.setPriority(10);
		
		Table t = new Table();
		Thread t1 = new MyThread1_SYNC(t);
		Thread t2 = new MyThread2_SYNC(t);
		t1.start();
		t2.start();
	}
}
