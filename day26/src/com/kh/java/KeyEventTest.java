package com.kh.java;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyEventTest extends JFrame implements ActionListener, KeyListener {

	private Container ct = getContentPane();
	private ImageIcon imgRyan1 = new ImageIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\ryan\\ryan.png").getImage()
			.getScaledInstance(500, 400, Image.SCALE_SMOOTH));
	private ImageIcon imgRyan2 = new ImageIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\ryan\\image1.png").getImage()
			.getScaledInstance(400, 400, Image.SCALE_SMOOTH));
	private ImageIcon imgRyan3 = new ImageIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\ryan\\image2.png").getImage()
			.getScaledInstance(400, 400, Image.SCALE_SMOOTH));
	private ImageIcon imgRyan4 = new ImageIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\ryan\\image3.png").getImage()
			.getScaledInstance(400, 400, Image.SCALE_SMOOTH));
	private ImageIcon imgRyan5 = new ImageIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\ryan\\image4.png").getImage()
			.getScaledInstance(400, 400, Image.SCALE_SMOOTH));
	private ImageIcon imgUp = new ImageIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\ryan\\north2.png").getImage()
			.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
	private ImageIcon imgDown = new ImageIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\ryan\\south2.png").getImage()
			.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
	private ImageIcon imgLeft = new ImageIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\ryan\\west2.png").getImage()
			.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
	private ImageIcon imgRight = new ImageIcon(new ImageIcon("C:\\Users\\user1\\Desktop\\ryan\\east2.png").getImage()
			.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

	private JLabel jlbImg = new JLabel();
	private JButton up = new JButton();
	private JButton down = new JButton();
	private JButton left = new JButton();
	private JButton right = new JButton();
	private JPanel jpnDown = new JPanel();

	public KeyEventTest() {
		setTitle("라이언 춤추기");
		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		jlbImg.setIcon(imgRyan1);
		
		up.setIcon(imgUp);
		down.setIcon(imgDown);
		left.setIcon(imgLeft);
		right.setIcon(imgRight);
		
		jpnDown.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
		
		jpnDown.add(up);
		jpnDown.add(down);
		jpnDown.add(left);
		jpnDown.add(right);
		
		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		
		up.addKeyListener(this);
		down.addKeyListener(this);
		left.addKeyListener(this);
		right.addKeyListener(this);
		
		
		ct.setLayout(new BorderLayout());
		ct.add(jlbImg, BorderLayout.NORTH);
		ct.add(jpnDown, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == up) {
			jlbImg.setIcon(imgRyan2);
		} else if (e.getSource() == down) {
			jlbImg.setIcon(imgRyan3);
		} else if (e.getSource() == left) {
			jlbImg.setIcon(imgRyan4);
		} else if (e.getSource() == right) {
			jlbImg.setIcon(imgRyan5);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			right.doClick();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			left.doClick();
		}  else if (e.getKeyCode() == KeyEvent.VK_UP) {
			up.doClick();
		}  else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			down.doClick();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
