package kh.java.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestLayout extends JFrame{
	
	private Container ct = getContentPane();
	private JButton jbn1 = new JButton("First");
	private JButton jbn2 = new JButton("Next");
	private JButton jbn3 = new JButton("Last");
	private JButton jbn4 = new JButton("Previous");
	private JButton jbn5 = new JButton("Button 1");
	private JPanel jp1 = new JPanel();
	
	public TestLayout() {
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		ct.setLayout(new BorderLayout());
		jp1.setLayout(new GridLayout(4, 1));
		jp1.add(jbn1);
		jp1.add(jbn2);
		jp1.add(jbn3);
		jp1.add(jbn4);

		ct.add(jp1, BorderLayout.WEST);
		
	}
	
	public static void main(String[] args) {
		new TestLayout().setVisible(true);
	}
}
