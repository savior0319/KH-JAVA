package kh.java.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingTest6 extends JFrame implements ActionListener {

	private Container ct = getContentPane();
	private JButton jbn1 = new JButton("파일열기");
	private JButton jbn2 = new JButton("파일저장");
	private JTextArea jta = new JTextArea();

	public SwingTest6() {
		setTitle("스윙테스트");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		jbn1.setBounds(100, 100, 200, 100);
		jbn1.addActionListener(this);
		jbn2.setBounds(100, 200, 200, 100);
		jbn2.addActionListener(this);
		jta.setBounds(350, 300, 100, 100);
		ct.add(jbn1);
		ct.add(jbn2);
		ct.add(jta);
	}

	public static void main(String[] args) {
		new SwingTest6().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("파일열기")) {
			JFileChooser jc1 = new JFileChooser();
			int choiceVal1 = jc1.showOpenDialog(this);
			if (choiceVal1 == JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "선택한 파일 -> " + jc1.getSelectedFile().getName());
			}
		} else if (e.getActionCommand().equals("파일저장")) {
			DataOutputStream dos = null;
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			String msg = jta.getText();
			JFileChooser jc2 = new JFileChooser();
			int choiceVal2 = jc2.showSaveDialog(this);
			if (choiceVal2 == JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "저장한 파일 -> " + jc2.getSelectedFile().getName());
			}
		}
	}
}

/*
 * 
 * public class FileWriteTest {

	//private final String LS = System.getProperty("line.separator");
	private Scanner sc = new Scanner(System.in);
	// private DataOutputStream dos = null;
	// private FileWriter fw = null;
	private BufferedWriter bw = null;

	public FileWriteTest() {
		System.out.print("저장할 파일명 >> ");
		String filname = sc.next();
		sc.nextLine();
		String str = new String();
		try {
			//dos = new DataOutputStream(new FileOutputStream("C:\\Users\\user1\\Desktop\\" + filname + ".txt"));
			bw = (new BufferedWriter(new FileWriter("C:\\Users\\user1\\Desktop\\" + filname + ".txt")));
			System.out.println("'" + filname + "' 파일에 저장될 내용 입력 >> ");
			int lineNumber = 1;
			while (true) {
				System.out.print((lineNumber++) + ": ");
				str = (lineNumber - 1) + " : " + sc.nextLine();
				if (str.equals((lineNumber - 1) + " : " + "exit")) {
					System.out.println("※ 종료!");
					break;
				}
				bw.write(str);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
		try { bw.close(); } catch (IOException e) { }
		}
	}
}
 * 
 * 
 * 
 * */



