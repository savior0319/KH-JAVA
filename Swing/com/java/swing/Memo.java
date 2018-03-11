package com.java.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Memo extends JFrame implements ActionListener {

	private Container ct = getContentPane();
	private JTextArea jta = new JTextArea();
	private JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private JButton jbtnSave = new JButton("����");
	private JButton jbtnLoad = new JButton("�ҷ�����");
	private JButton jbtnExit = new JButton("����");
	private JPanel jpn = new JPanel();

	public Memo() {
		setTitle("�޸���");
		setSize(500, 700);
		setMinimumSize(new Dimension(300, 350));
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ct.setLayout(new BorderLayout());
		jpn.setLayout(new GridLayout(1, 3));

		jbtnSave.setFont(new Font("�������", Font.BOLD, 15));
		jbtnLoad.setFont(new Font("�������", Font.BOLD, 15));
		jbtnExit.setFont(new Font("�������", Font.BOLD, 15));

		jta.setLineWrap(true);
		jpn.add(jbtnSave);
		jpn.add(jbtnLoad);
		jpn.add(jbtnExit);

		jbtnSave.addActionListener(this);
		jbtnLoad.addActionListener(this);
		jbtnExit.addActionListener(this);

		ct.add(jsp, BorderLayout.CENTER);
		ct.add(jpn, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new Memo().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("����")) {
			JFileChooser jc = new JFileChooser();
			jc.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
			jc.removeChoosableFileFilter((jc.getFileFilter()));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("�ؽ�Ʈ ����(.txt)", "txt");
			jc.addChoosableFileFilter(filter);
			int result = jc.showSaveDialog(this);
			String getText = jta.getText();
			if (result == 0) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(jc.getSelectedFile() + ".txt"))) {
					bw.write(getText + System.lineSeparator());
					bw.newLine();
					JOptionPane.showMessageDialog(null, "���� ���忡 �����߽��ϴ�");
				} catch (IOException e1) {
					System.out.print(e1.getMessage());
				}
			} else
				JOptionPane.showMessageDialog(null, "���� ���忡 �����߽��ϴ�");

		} else if (e.getActionCommand().equals("�ҷ�����")) {
			JFileChooser jc = new JFileChooser();
			jc.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
			jc.removeChoosableFileFilter((jc.getFileFilter()));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("�ؽ�Ʈ ����(.txt)", "txt");
			jc.addChoosableFileFilter(filter);
			int result = jc.showOpenDialog(this);
			String loadText = new String();
			String read = "";
			if (result == 0) {
				try (BufferedReader br = new BufferedReader(new FileReader(jc.getSelectedFile()))) {
					while ((read = br.readLine()) != null) {
						loadText += read + System.lineSeparator();
					}
					jta.setText(loadText);
					JOptionPane.showMessageDialog(null, "���� �ҷ����Ⱑ �����߽��ϴ�");
				} catch (Exception e1) {
					System.out.print(e1.getMessage());
				}
			} else
				JOptionPane.showMessageDialog(null, "���� �ҷ����Ⱑ �����߽��ϴ�");

		} else if (e.getActionCommand().equals("����")) {
			System.exit(0);
		}
	}
}
