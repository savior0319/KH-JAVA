package kh.java;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Swing extends JFrame implements ActionListener{
	
	private Container container = getContentPane();
	private JButton jButton = new JButton("��ư");
	
	public Swing() {
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setResizable(false);
		
		container.setLayout(new BorderLayout());
		container.add(jButton, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new Swing().setVisible(true);;
	
	}

	public void actionPerformed(ActionEvent e) {
		
	}	
}
