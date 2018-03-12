package com.kh.java;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventTest extends JFrame {

	private Container ct = getContentPane();
	private JButton jbn1 = new JButton("눌러보세요");
	private JButton jbn2 = new JButton("누르지마세요");

	public EventTest() {
		setTitle("이벤트");
		setSize(400, 600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		ct.setLayout(new GridLayout(4, 2));
		ct.add(jbn1);
		ct.add(jbn2);

		jbn1.addActionListener(e -> {
			if (e.getActionCommand().equals("눌러보세요")) {
				JOptionPane.showMessageDialog(null, "버튼을 눌렀습니다", "ㅇㅇ", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		jbn2.addActionListener(e -> {
			if (e.getActionCommand().equals("누르지마세요")) {
				JOptionPane.showMessageDialog(null, "누르지 마세요", "ㄴㄴ", JOptionPane.ERROR_MESSAGE);
			}
		});
	}
}
