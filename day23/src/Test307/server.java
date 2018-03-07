package Test307;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class server extends JFrame implements ActionListener, KeyListener, Runnable {

	private Container ct = getContentPane();
	private JLabel jl_spo = new JLabel("Server Port", JLabel.CENTER);
	private JLabel jl_null = new JLabel();
	private JLabel jl_con = new JLabel("ä��");
	private JTextArea con = new JTextArea();
	private JScrollPane jsp = new JScrollPane(con, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private JTextField send_con = new JTextField();
	private JTextField jtf_spo = new JTextField();
	private JButton jb_start = new JButton("���� ����");
	private JButton jb_send = new JButton("������");
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private int port;
	private DataInputStream in;
	private DataOutputStream out;
	private Socket socket;
	private ServerSocket serverSocket;
	private String receive;
	private Thread t;

	public server() {
		
		setLocation(750, 300);
		setTitle("TCP ä�� ����");
		setResizable(false);
		setSize(350, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ct.setLayout(new BorderLayout());
		jp1.setLayout(new GridLayout(2, 2));

		jp1.add(jl_spo);
		jp1.add(jl_null);
		jp1.add(jtf_spo);
		jp1.add(jb_start);

		jp2.setLayout(new BorderLayout());
		jp2.add(jl_con, BorderLayout.WEST);
		jp2.add(send_con, BorderLayout.CENTER);
		jp2.add(jb_send, BorderLayout.EAST);

		// con.setLineWrap(true);
		jb_send.setEnabled(false);
		ct.add(jp1, BorderLayout.NORTH);
		ct.add(jsp, BorderLayout.CENTER);
		ct.add(jp2, BorderLayout.SOUTH);

		jb_start.addActionListener(this);
		jb_send.addActionListener(this);
		send_con.addKeyListener(this);
		jb_send.addKeyListener(this);

		try {
			InetAddress ip = InetAddress.getLocalHost();
			String getip = String.valueOf(ip.getHostAddress());
			con.append("���� ������ : " + getip + "\r\n");
		} catch (Exception e) {
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new server().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getActionCommand() == "���� ����") {

			port = Integer.parseInt(jtf_spo.getText());
			jb_start.setEnabled(false);
			jb_send.setEnabled(true);

			try {
				while (true) {
					System.out.print(port + "�� ��Ʈ ���� �����");
					serverSocket = new ServerSocket(port); // ���� ����� ��Ʈ
					socket = serverSocket.accept(); // ���� ���
					con.append("Ŭ���̾�Ʈ ���� �Ϸ�\r\n");
					in = new DataInputStream(socket.getInputStream()); // ����
					out = new DataOutputStream(socket.getOutputStream()); // ����
					con.transferFocus();
				}
			} catch (IOException e) {
				System.out.println("����1");
			}

			t = new Thread(this);
			t.start();

		} else if (arg0.getActionCommand() == "������") {
			try {
				out.writeUTF(send_con.getText());
				out.flush();
				con.append("�� : " + send_con.getText() + "\r\n");
				send_con.setText("");
				jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
			} catch (IOException e) {
				System.out.println("����2");
			}
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				receive = in.readUTF();
				con.append("��� : " + receive + "\r\n");
				jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
			}
		} catch (Exception e) {
			try {
				socket.close();
				out.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("����3");
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
			try {
				out.writeUTF(send_con.getText());
				out.flush();
				con.append("�� : " + send_con.getText() + "\r\n");
				send_con.setText("");
				jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
			} catch (IOException e) {
				System.out.println("����2");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}
}