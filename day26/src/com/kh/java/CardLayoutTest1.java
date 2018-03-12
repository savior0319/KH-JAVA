package com.kh.java;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutTest1 extends JFrame implements ActionListener, KeyListener {

	private Container ct = getContentPane();
	private JPanel jpnBtn = new JPanel();
	private JPanel jpnColor = new JPanel();
	private JPanel cardColor[] = new JPanel[7];
	private JButton jbtnLeft = new JButton("<");
	private JButton jbtnFirst = new JButton("<<");
	private JButton jbtnLast = new JButton(">>");
	private JButton jbtnRight = new JButton(">");
	private JButton jbtnExit = new JButton("종료");
	private int colorNumber = 1;

	public CardLayoutTest1() {
		super("카드 레이아웃");
		setLayout(new BorderLayout(15, 15));
		setSize(450, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPanel();
	}

	public void setPanel() {
		this.add(jpnBtn, BorderLayout.NORTH);
		this.add(jpnColor, BorderLayout.CENTER);
		this.cardPanelBtn();
		this.cardColor();
	}

	public void cardColor() {
		jpnColor.setLayout(new CardLayout());
		for (int i = 0; i < cardColor.length; i++) {
			cardColor[i] = new JPanel();
			jpnColor.add(Integer.toString(i + 1), cardColor[i]);
		}
		cardColor[0].setBackground(new Color(255, 0, 0));
		cardColor[1].setBackground(new Color(255, 165, 0));
		cardColor[2].setBackground(new Color(255, 255, 0));
		cardColor[3].setBackground(new Color(0, 128, 0));
		cardColor[4].setBackground(new Color(0, 0, 255));
		cardColor[5].setBackground(new Color(0, 0, 128));
		cardColor[6].setBackground(new Color(101, 45, 93));
	}

	public void cardPanelBtn() {
		jpnBtn.setLayout(new GridLayout(1, 5, 15, 15));
		jpnBtn.setPreferredSize(new Dimension(20, 30));
		jpnBtn.add(jbtnFirst);
		jpnBtn.add(jbtnLeft);
		jpnBtn.add(jbtnRight);
		jpnBtn.add(jbtnLast);
		jpnBtn.add(jbtnExit);
		jbtnLeft.setFocusPainted(true);
		jbtnFirst.addActionListener(this);
		jbtnLeft.addActionListener(this);
		jbtnRight.addActionListener(this);
		jbtnLast.addActionListener(this);
		jbtnExit.addActionListener(this);
		jbtnFirst.addKeyListener(this);
		jbtnLeft.addKeyListener(this);
		jbtnRight.addKeyListener(this);
		jbtnLast.addKeyListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("<")) {
			if (colorNumber > 1) {
				colorNumber--;
			}
		} else if (e.getActionCommand().equals("<<")) {
			colorNumber = 1;
		} else if (e.getActionCommand().equals(">>")) {
			colorNumber = 7;
		} else if (e.getActionCommand().equals(">")) {
			if (colorNumber < 7) {
				colorNumber++;
			}
		} else if (e.getActionCommand().equals("종료")) {
			System.exit(0);
		}
		((CardLayout) jpnColor.getLayout()).show(jpnColor, String.valueOf(colorNumber));
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			jbtnLeft.doClick();
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			jbtnRight.doClick();
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			jbtnFirst.doClick();
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			jbtnLast.doClick();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
