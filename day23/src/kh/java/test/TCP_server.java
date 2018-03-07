package kh.java.test;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_server {
	public static void main(String[] args) {
		ServerSocket ssk = null;
		Socket csk = null;
		System.out.print("클라이언트 대기중");
		final int PORT = 9999;
		try {
			ssk = new ServerSocket(PORT);
			csk = ssk.accept();
			OutputStream out = csk.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			InputStream in = csk.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			dos.writeUTF("※ 서버입장에 성공하셨습니다!");
			System.out.println(csk.getInetAddress() + "님이 입장했어요");
			String receive = dis.readUTF();
			System.out.print(receive);
			dos.close();
			dis.close();
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
