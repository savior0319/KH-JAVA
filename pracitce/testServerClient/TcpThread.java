package testServerClient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TcpThread extends Thread {

	Socket csk;
	Scanner sc = new Scanner(System.in);
	DataOutputStream dos = null;

	public TcpThread(Socket csk) {
		this.csk = csk;
	}

	@Override
	public void run() {
		try {
			dos = new DataOutputStream(csk.getOutputStream());
			while (true) {
				String temp = sc.next();
				dos.writeUTF(temp);
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} 
	}
}
