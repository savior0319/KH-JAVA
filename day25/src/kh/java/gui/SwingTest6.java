package kh.java.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingTest6 extends JFrame implements ActionListener {

	private Container ct = getContentPane();
	private JButton jbn1 = new JButton("���Ͽ���");
	private JButton jbn2 = new JButton("��������");

	public SwingTest6() {
		setTitle("�����׽�Ʈ");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		jbn1.setBounds(100, 100, 200, 100);
		jbn1.addActionListener(this);
		jbn2.setBounds(100, 200, 200, 100);
		jbn2.addActionListener(this);
		ct.add(jbn1);
		ct.add(jbn2);
	}

	public static void main(String[] args) {
		new SwingTest6().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("���Ͽ���")) {
			JFileChooser jc1 = new JFileChooser();
			int choiceVal1 = jc1.showOpenDialog(this);
			if (choiceVal1 == JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "������ ���� -> " + jc1.getSelectedFile().getName());
			}
		} else if (e.getActionCommand().equals("��������")) {
			JFileChooser jc2 = new JFileChooser();
			int choiceVal2 = jc2.showSaveDialog(this);
			if (choiceVal2 == JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "������ ���� -> " + jc2.getSelectedFile().getName());
			}
		}
	}
}
