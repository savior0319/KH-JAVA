package testServerClient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer implements Runnable {

	Thread thread;
	final int PORT = 5606;
	ServerSocket ssk = null;
	Socket csk = null;
	DataOutputStream dos = null;
	Scanner sc = new Scanner(System.in);
	int count = 1;

	public TcpServer() {
		thread = new Thread(this);
		thread.start();
	}

	public static void main(String[] args) {
		new TcpServer();
	}

	@Override
	public void run() {
		System.out.println("Ŭ���̾�Ʈ ���� �����...");
		try {
			ssk = new ServerSocket(PORT);
			while (true) {
				csk = ssk.accept();
				TcpThread tt = new TcpThread(csk);
				tt.start();
				System.out.print(csk.getInetAddress() + " �� ������ ���� �߽��ϴ�!");
				System.out.println(" <���� �����ڼ�> -> " + count++);
				dos = new DataOutputStream(csk.getOutputStream());
				dos.writeUTF("������ �����߽��ϴ�");
			}

		} catch (IOException e) {
			System.out.print(e.getMessage());
		} finally {
			try {
				csk.close();
				ssk.close();
			} catch (IOException e) {
				System.out.print(e.getMessage());
			}
		}
	}
}
