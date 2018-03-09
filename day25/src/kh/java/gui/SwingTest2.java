package kh.java.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SwingTest2 extends JFrame {

	private Container ct = getContentPane();
	private JLabel jlb = new JLabel("당신은 흡연자 입니까?", JLabel.CENTER);
	private ButtonGroup bg = new ButtonGroup();
	private JRadioButton btnYes = new JRadioButton("네");
	private JRadioButton btnNO = new JRadioButton("아니오");
	private JPanel jpn1 = new JPanel();
	private JPanel jpn2 = new JPanel();
	private JButton jb1 = new JButton("1");
	private JButton jb2 = new JButton("2");
	private JButton jb3 = new JButton("3");
	private JButton jb4 = new JButton("4");

	public SwingTest2() {
		setTitle("스윙테스트");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		ct.setLayout(new BorderLayout());
		//jpn1.setLayout(new GridLayout(1, 3));
		jpn2.setLayout(new GridLayout(2, 2));
		
		jpn1.setBackground(Color.WHITE);
		bg.add(btnYes);
		bg.add(btnNO);
		
		jlb.setFont(new Font("궁서체", Font.BOLD, 20));
		
		jpn1.add(jlb);
		jpn1.add(btnYes);
		jpn1.add(btnNO);
		
		jpn2.add(jb1);
		jpn2.add(jb2);
		jpn2.add(jb3);
		jpn2.add(jb4);
		
		ct.add(jpn1, BorderLayout.NORTH);
		ct.add(jpn2, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new SwingTest2().setVisible(true);
	}
}
