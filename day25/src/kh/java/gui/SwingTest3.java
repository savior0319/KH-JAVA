package kh.java.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingTest3 extends JFrame {

	private Container ct = getContentPane();

	private JPanel jpn1 = new JPanel();
	private JPanel jpn2 = new JPanel();
	private JPanel jpn3 = new JPanel();
	private JPanel jpn4 = new JPanel();
	private JPanel jpn5 = new JPanel();
	private JPanel jpn6 = new JPanel();

	public SwingTest3() {
		setTitle("½ºÀ®Å×½ºÆ®");
		setSize(790, 790);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		jpn1.setBackground(Color.RED);
		jpn1.setSize(765, 200);
		jpn1.setLocation(10, 10);

		jpn2.setBackground(Color.YELLOW);
		jpn2.setSize(375, 200);
		jpn2.setLocation(10, 220);

		jpn3.setBackground(Color.BLACK);
		jpn3.setSize(375, 200);
		jpn3.setLocation(400, 220);

		jpn4.setBackground(Color.GREEN);
		jpn4.setSize(258, 325);
		jpn4.setLocation(10, 430);
		
		jpn5.setBackground(Color.GRAY);
		jpn5.setSize(258, 325);
		jpn5.setLocation(258, 430);
		
		jpn6.setBackground(Color.BLUE);
		jpn6.setSize(258, 325);
		jpn6.setLocation(516, 430);

		this.add(jpn1);
		this.add(jpn2);
		this.add(jpn3);
		this.add(jpn4);
		this.add(jpn5);
		this.add(jpn6);
	}

	public static void main(String[] args) {
		new SwingTest3().setVisible(true);
	}
}
