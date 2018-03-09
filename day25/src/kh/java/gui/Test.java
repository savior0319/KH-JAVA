package kh.java.gui;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame{
	
	private Container ct = getContentPane();
	private JButton jbn1 = new JButton("버튼1");
	private JButton jbn2 = new JButton("버튼2");
	private JButton jbn3 = new JButton("버튼3");
	private JButton jbn4 = new JButton("버튼4");
	private JPanel jp1 = new JPanel();
	private GridBagConstraints c = new GridBagConstraints();
	
	public Test() {
		setTitle("Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		ct.setLayout(new GridLayout(5,1,5,5));
		jp1.setLayout(new GridBagLayout());
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
		c.gridx  = 1;
		c.gridy  = 0;
		jp1.add(jbn1, c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.2;
		c.gridx = 2;
		c.gridy = 1;
		jp1.add(jbn2, c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.3;
		c.gridx = 3;
		c.gridy = 2;
		jp1.add(jbn3,c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.4;
		c.gridx = 4;
		c.gridy = 3;
		jp1.add(jbn4, c);

		ct.add(jp1);
	}
	
	public static void main(String[] args) {
		new Test().setVisible(true);
	}
}
