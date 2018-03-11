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
	private JButton jbtnSave = new JButton("저장");
	private JButton jbtnLoad = new JButton("불러오기");
	private JButton jbtnExit = new JButton("종료");
	private JPanel jpn = new JPanel();

	public Memo() {
		setTitle("메모장");
		setSize(500, 700);
		setMinimumSize(new Dimension(300, 350));
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ct.setLayout(new BorderLayout());
		jpn.setLayout(new GridLayout(1, 3));

		jbtnSave.setFont(new Font("맑은고딕", Font.BOLD, 15));
		jbtnLoad.setFont(new Font("맑은고딕", Font.BOLD, 15));
		jbtnExit.setFont(new Font("맑은고딕", Font.BOLD, 15));

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
		if (e.getActionCommand().equals("저장")) {
			JFileChooser jc = new JFileChooser();
			jc.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
			jc.removeChoosableFileFilter((jc.getFileFilter()));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("텍스트 파일(.txt)", "txt");
			jc.addChoosableFileFilter(filter);
			int result = jc.showSaveDialog(this);
			String getText = jta.getText();
			if (result == 0) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(jc.getSelectedFile() + ".txt"))) {
					bw.write(getText + System.lineSeparator());
					bw.newLine();
					JOptionPane.showMessageDialog(null, "파일 저장에 성공했습니다");
				} catch (IOException e1) {
					System.out.print(e1.getMessage());
				}
			} else
				JOptionPane.showMessageDialog(null, "파일 저장에 실패했습니다");

		} else if (e.getActionCommand().equals("불러오기")) {
			JFileChooser jc = new JFileChooser();
			jc.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
			jc.removeChoosableFileFilter((jc.getFileFilter()));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("텍스트 파일(.txt)", "txt");
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
					JOptionPane.showMessageDialog(null, "파일 불러오기가 성공했습니다");
				} catch (Exception e1) {
					System.out.print(e1.getMessage());
				}
			} else
				JOptionPane.showMessageDialog(null, "파일 불러오기가 실패했습니다");

		} else if (e.getActionCommand().equals("종료")) {
			System.exit(0);
		}
	}
}
