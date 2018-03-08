package kh.java.com;

public class MyThread1_SYNC extends Thread {
	Table t;

	public MyThread1_SYNC(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.dataPrint(5);
	}

}
