package com.kh.java;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonAction extends JFrame implements KeyListener {

	private Container ct = getContentPane();
	private int count = 0;
	private JLabel countLb = new JLabel("Counter");
	private JLabel numberLb = new JLabel(count + "");
	private JButton countJbt = new JButton("카운터증가");
	private JButton resetJbt = new JButton("초기화");

	public ButtonAction() {
		setTitle("카운트 증가 프로그램");
		setSize(300, 270);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		numberLb.setFont(new Font("맑은고딕", Font.BOLD, 30));
		countLb.setFont(new Font("맑은고딕", Font.BOLD, 20));

		numberLb.setBounds(45, 60, 80, 80);
		countLb.setBounds(90, 60, 80, 80);
		countJbt.setBounds(180, 70, 100, 60);
		resetJbt.setBounds(100, 150, 100, 30);

		ct.add(numberLb);
		ct.add(countLb);
		ct.add(countJbt);
		ct.add(resetJbt);

		countJbt.addActionListener(e -> {
			numberLb.setText(count++ + "");
		});

		resetJbt.addActionListener(e -> {
			count = 0;
			numberLb.setText(count + "");
		});

		countJbt.addKeyListener(this);
		resetJbt.addKeyListener(this);
		countJbt.requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			countJbt.doClick();
		} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			resetJbt.doClick();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
