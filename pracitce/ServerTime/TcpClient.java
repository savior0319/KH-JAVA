package ServerTime;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClient implements Runnable {

	private Socket csk = null;

	public TcpClient() {

		Scanner sc = new Scanner(System.in);
		final int PORT = 5606;
		final String HOST = "localhost";
		Thread thread;

		try {
			csk = new Socket(HOST, PORT);
			DataOutputStream dos = new DataOutputStream(csk.getOutputStream());
			thread = new Thread(this);
			thread.start();

			while (true) {
				String send = sc.nextLine();
				if (send.equals("exit")) {
					System.out.println("※ 종료합니다!");
					dos.writeUTF(send);
					dos.close();
					return;
				} else
					dos.writeUTF(send);
			}

		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				csk.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		new TcpClient();
	}

	@Override
	public void run() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(csk.getInputStream());
			while (true) {
				System.out.print("클라이언트 -> ");
				String receive = dis.readUTF();
				if (receive.equals("exit")) {
					System.out.println("※ 종료합니다!");
					dis.close();
					return;
				} else
					System.out.println("서버 : " + receive);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
}
