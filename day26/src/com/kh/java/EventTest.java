package com.kh.java;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventTest extends JFrame {

	private Container ct = getContentPane();
	private JButton jbn1 = new JButton("����������");
	private JButton jbn2 = new JButton("������������");

	public EventTest() {
		setTitle("�̺�Ʈ");
		setSize(400, 600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		ct.setLayout(new GridLayout(4, 2));
		ct.add(jbn1);
		ct.add(jbn2);

		jbn1.addActionListener(e -> {
			if (e.getActionCommand().equals("����������")) {
				JOptionPane.showMessageDialog(null, "��ư�� �������ϴ�", "����", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		jbn2.addActionListener(e -> {
			if (e.getActionCommand().equals("������������")) {
				JOptionPane.showMessageDialog(null, "������ ������", "����", JOptionPane.ERROR_MESSAGE);
			}
		});
	}
}
