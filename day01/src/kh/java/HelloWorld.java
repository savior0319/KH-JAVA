package kh.java;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;


public class HelloWorld extends JFrame{
	
	private Container container = getContentPane();
	private JButton jButton = new JButton("��ư");
	
	public HelloWorld() {
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setResizable(false);
		
		container.setLayout(new BorderLayout());
		container.add(jButton, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new HelloWorld().setVisible(true);;
	
	}
}
