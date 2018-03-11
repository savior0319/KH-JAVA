package com.java.swing;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.filechooser.*;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class Memo extends JFrame implements ActionListener, Runnable {

	private Container ct = getContentPane();
	private int count = 0, space = 0;
	private JLabel jlbCounter = new JLabel("공백포함 글자 수 : " + count);
	private JLabel jlbNoneSpace = new JLabel("공백제외 글자 수 : " + count);
	private JMenuBar jMenuBar;
	private JMenu jMenuFile;
	private JMenu jMenuInfo;
	private JMenu jMenuEdit;
	private JMenuItem menuItemSave;
	private JMenuItem menuItemLoad;
	private JMenuItem menuItemExit;
	private JMenuItem menuItemInfo;
	private JMenuItem menuItemInputTime;
	private JTextArea jta = new JTextArea();
	private JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private JPanel jpn = new JPanel();
	private JPanel jpnLinePanel = new JPanel();
	private Thread thread;
	private SimpleDateFormat sdf;
	private String time;

	public Memo() {
		setTitle("메모장");
		setSize(500, 600);
		setMinimumSize(new Dimension(350, 350));
		setResizable(true);
		setLocationRelativeTo(null);
		// setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\savior\\OneDrive\\바탕
		// 화면\\memo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jMenuBar = new JMenuBar();
		jMenuFile = new JMenu("파일");
		jMenuInfo = new JMenu("정보");
		jMenuEdit = new JMenu("편집");

		/* 메뉴바 - 파일 */
		menuItemSave = new JMenuItem("저장");
		menuItemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		menuItemSave.addActionListener(this);
		jMenuFile.add(menuItemSave);

		menuItemLoad = new JMenuItem("불러오기");
		menuItemLoad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		menuItemLoad.addActionListener(this);
		jMenuFile.add(menuItemLoad);

		menuItemExit = new JMenuItem("종료");
		menuItemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		menuItemExit.addActionListener(this);
		jMenuFile.add(menuItemExit);

		/* 메뉴바 - 정보 */
		menuItemInfo = new JMenuItem("메모장 정보");
		menuItemInfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
		menuItemInfo.addActionListener(this);
		jMenuInfo.add(menuItemInfo);

		/* 메뉴바 - 편집 */
		menuItemInputTime = new JMenuItem("현재 시간 입력");
		menuItemInputTime.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, ActionEvent.CTRL_MASK));
		menuItemInputTime.addActionListener(this);
		jMenuEdit.add(menuItemInputTime);

		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuEdit);
		jMenuBar.add(jMenuInfo);
		setJMenuBar(jMenuBar);

		ct.setLayout(new BorderLayout());
		jpn.setLayout(new GridLayout(1, 3));

		jta.setLineWrap(true);

		jlbCounter.setFont(new Font("굴림", Font.PLAIN, 15));
		jlbNoneSpace.setFont(new Font("굴림", Font.PLAIN, 15));

		jpnLinePanel.setLayout(new GridLayout(1, 2));
		jpnLinePanel.add(jlbCounter);
		jpnLinePanel.add(jlbNoneSpace);

		ct.add(jsp, BorderLayout.CENTER);
		ct.add(jpn, BorderLayout.SOUTH);
		ct.add(jpnLinePanel, BorderLayout.SOUTH);

		thread = new Thread(this);
		thread.start();
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
			FileNameExtensionFilter filterTxt = new FileNameExtensionFilter("텍스트 파일(.txt)", "txt");
			FileNameExtensionFilter filterLog = new FileNameExtensionFilter("로그 파일(.log)", "log");
			jc.addChoosableFileFilter(filterTxt);
			jc.addChoosableFileFilter(filterLog);
			int result = jc.showSaveDialog(this);
			String getText = jta.getText();
			if (result == 0) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(jc.getSelectedFile() + ".txt"))) {
					getText = getText.replace("\n", "\r\n");
					bw.write(getText);
				} catch (IOException e1) {
					System.out.print(e1.getMessage());
				}
			}

		} else if (e.getActionCommand().equals("불러오기")) {
			JFileChooser jc = new JFileChooser();
			jc.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
			jc.removeChoosableFileFilter((jc.getFileFilter()));
			FileNameExtensionFilter filterTxt = new FileNameExtensionFilter("텍스트 파일(.txt)", "txt");
			FileNameExtensionFilter filterLog = new FileNameExtensionFilter("로그 파일(.log)", "log");
			jc.addChoosableFileFilter(filterTxt);
			jc.addChoosableFileFilter(filterLog);
			int result = jc.showOpenDialog(this);
			String loadText = new String();
			String read = "";
			if (result == 0) {
				try (BufferedReader br = new BufferedReader(new FileReader(jc.getSelectedFile()))) {
					while ((read = br.readLine()) != null) {
						loadText += read + System.lineSeparator();
					}
					jta.setText(loadText);
				} catch (Exception e1) {
					System.out.print(e1.getMessage());
				}
			}
		} else if (e.getActionCommand().equals("종료")) {
			System.exit(0);
		} else if (e.getActionCommand().equals("메모장 정보")) {
			JOptionPane.showMessageDialog(null, "AHJ");
		} else if (e.getActionCommand().equals("현재 시간 입력")) {
			jta.append(time);
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1);
				sdf = new SimpleDateFormat("a hh:mm:ss YYYY-MM-dd");
				time = sdf.format(new Date());
				String countText = jta.getText();
				count = countText.length();
				for (int i = 0; i < count; i++) {
					if (countText.charAt(i) == '\u0020') {
						space++;
					}
				}
				int MaxEnter = Integer.MAX_VALUE;
				String nextline[] = countText.split("\n", MaxEnter);
				int nlc = nextline.length;
				jlbCounter.setText("공백포함 글자 수 : " + (count));
				jlbNoneSpace.setText("공백제외 글자수 : " + (count - space - nlc + 1));
				space = 0;
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
