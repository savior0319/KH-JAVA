package kh.java.com;

public class MyThread2_SYNC extends Thread {
	Table t;

	public MyThread2_SYNC(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.dataPrint(100);
	}

}
