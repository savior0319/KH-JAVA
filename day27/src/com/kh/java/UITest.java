package com.kh.java;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class UITest extends JFrame implements ActionListener, Runnable {

	private Container ct = getContentPane();
	private JMenuBar jMenuBar = new JMenuBar();
	private JMenu jMenu1 = new JMenu("메뉴1(A)");
	private JMenu jMenu2 = new JMenu("메뉴2(S)");
	private JMenuItem jmi1 = new JMenuItem("열기");
	private JMenuItem jmi2 = new JMenuItem("저장");
	private JMenuItem jmi3 = new JMenuItem("종료");

	public UITest() {
		
		new Thread(this).start();

		setTitle("메뉴");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		jMenuBar.add(jMenu1);
		jMenu1.setMnemonic(KeyEvent.VK_A);

		jMenu1.add(jmi1);
		jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		jmi1.addActionListener(this);

		jMenu1.add(jmi2);
		jmi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		jmi2.addActionListener(this);

		jMenu1.add(jmi3);
		jmi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		jmi3.addActionListener(this);

		jMenuBar.add(jMenu2);
		jMenu2.setMnemonic(KeyEvent.VK_S);

		setJMenuBar(jMenuBar);
	}

	public static void main(String[] args) {
		new UITest().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("열기")) {

		} else if (e.getActionCommand().equals("저장")) {

		} else if (e.getActionCommand().equals("종료")) {
			System.exit(0);
		}
	}

	@Override
	public void run() {
		while(true) {
		Font font1 = new Font("굴림", Font.PLAIN, 12);
		UIManager.put("Menu.font", font1);
		UIManager.put("MenuItem.font", font1);
		}
	}
}
