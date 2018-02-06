package com.kh.hw;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame implements ActionListener {

	private Container ct = getContentPane();
	private JLabel jl1 = new JLabel("첫번째", JLabel.CENTER);
	private JLabel jl2 = new JLabel("두번째", JLabel.CENTER);
	private JLabel jl3 = new JLabel("세번쨰", JLabel.CENTER);
	private JLabel jl4 = new JLabel("네번쨰", JLabel.CENTER);
	private JLabel jl5 = new JLabel("다섯번째", JLabel.CENTER);
	private JTextField[] jtf = new JTextField[5];
	private JPanel jp1 = new JPanel();
	private JButton jbt = new JButton("계산");
	private JTextArea jta = new JTextArea();

	public Test() {
		setTitle("test");
		setSize(300, 120);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ct.setLayout(new BorderLayout());

		jp1.setLayout(new GridLayout(2, 5));
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jl5);
		jl1.setFont(new Font("고딕", Font.BOLD, 12));
		jl2.setFont(new Font("고딕", Font.BOLD, 12));
		jl3.setFont(new Font("고딕", Font.BOLD, 12));
		jl4.setFont(new Font("고딕", Font.BOLD, 12));
		jl5.setFont(new Font("고딕", Font.BOLD, 12));

		for (int i = 0; i < jtf.length; i++) {
			jtf[i] = new JTextField();
			jp1.add(jtf[i]);
		}

		jbt.addActionListener(this);

		ct.add(jp1, BorderLayout.NORTH);
		ct.add(jbt, BorderLayout.CENTER);
		ct.add(jta, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		new Test().setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		int n1, n2, n3, n4, n5, result;
		n1 = Integer.parseInt(jtf[0].getText());
		n2 = Integer.parseInt(jtf[1].getText());
		n3 = Integer.parseInt(jtf[2].getText());
		n4 = Integer.parseInt(jtf[3].getText());
		n5 = Integer.parseInt(jtf[4].getText());

		result = n1 + n2 + n3 + n4 + n5;
		if (e.getSource() == jbt) {
			jta.setText(String.valueOf(result));
		}
	}
}
