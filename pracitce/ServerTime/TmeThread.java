package ServerTime;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TmeThread extends Thread {

	Socket csk;
	Scanner sc = new Scanner(System.in);
	DataOutputStream dos = null;

	public TmeThread(Socket csk) {
		this.csk = csk;
	}

	@Override
	public void run() {
		try {
			dos = new DataOutputStream(csk.getOutputStream());
			DataInputStream dis = new DataInputStream(csk.getInputStream());
			while (true) {
				SimpleDateFormat sdf = new SimpleDateFormat("a hh:mm:ss");
				String time = sdf.format(new Date());
				String receive = dis.readUTF();
				if (receive.equals("time")) {
					dos.writeUTF(time);
				}
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
