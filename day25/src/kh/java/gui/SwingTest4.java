package kh.java.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingTest4 extends JFrame {

	private Container ct = getContentPane();
	private JTextArea jta = new JTextArea(8,30);
	private JScrollPane jsPane = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	private JPanel jpn1 = new JPanel();

	public SwingTest4() {
		setTitle("½ºÀ®Å×½ºÆ®");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		jta.setLineWrap(true);
		jpn1.setBackground(Color.BLACK);
		jpn1.setSize(473, 400);
		jpn1.setLocation(10, 10);
		jpn1.add(jsPane);
		this.add(jpn1);

	}

	public static void main(String[] args) {
		new SwingTest4().setVisible(true);
	}
}
