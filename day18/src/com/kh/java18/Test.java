package com.kh.java18;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame implements ActionListener, KeyListener {
	private int count = 0;
	private Container ct = getContentPane();
	private JLabel jlb = new JLabel("´©¸¥ È½¼ö : " + count);
	private String path = "https://pbs.twimg.com/media/DUTT_lBVoAAp3nm.jpg";
	private ImageIcon imi = new ImageIcon();
	private JButton jbt = new JButton();

	public Test() throws IOException {
		URL url;
		try {
			url = new URL(path);
			BufferedImage image = ImageIO.read(url);
			imi = new ImageIcon(image);
			jbt = new JButton(imi);
		} catch (MalformedURLException e) {
			System.out.println("Exception");
		}

		setTitle("test");
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jbt.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
		jlb.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 15));

		jbt.setBounds(125, 100, 250, 250);
		jlb.setBounds(200, 350, 150, 150);
		ct.add(jbt);
		ct.add(jlb);
		// ct.add(jbt, BorderLayout.CENTER);
		// ct.add(jlb, BorderLayout.SOUTH);
		jbt.addActionListener(this);
		jbt.addKeyListener(this);
	}

	public static void main(String[] args) {
		try {
			new Test().setVisible(true);
		} catch (IOException e) {
			System.out.println("Exception");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt) {
			count++;
			jlb.setText("´©¸¥È½¼ö : " + count);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			count++;
			jlb.setText("´©¸¥È½¼ö : " + count);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}
