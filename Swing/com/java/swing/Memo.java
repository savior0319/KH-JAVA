package com.java.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Memo extends JFrame implements ActionListener, Runnable {

	private Container ct = getContentPane();

	private JTabbedPane jTap = new JTabbedPane();

	private JPanel jp1 = new JPanel();
	private JPanel jp[] = new JPanel[5];

	private JButton jbtAddTab = new JButton("탭 추가");
	private JButton jbtRemoveTab = new JButton("탭 제거");

	private JTextArea jta[] = new JTextArea[5];
	private JScrollPane jsp[] = new JScrollPane[5];

	private JMenuBar jMenuBar;
	private JMenu jMenuFile;
	private JMenu jMenuInfo;
	private JMenu jMenuEdit;
	private JMenu jMenuSet;
	private JMenuItem menuItemSave;
	private JMenuItem menuItemLoad;
	private JMenuItem menuItemExit;
	private JMenuItem menuItemInfo;
	private JMenuItem menuItemNew;
	private JMenuItem menuItemAutoNewLine;
	private JMenuItem menuItemInputTime;
	private JMenuItem menuItemChangeFont;

	private boolean isAutoNewLineFlag = false;

	private SimpleDateFormat sdf;

	private String time;
	private int tabCount = 0;
	private int count = 0, space = 0;

	private JLabel jlbCounter = new JLabel("공백포함 글자 수 : " + count);
	private JLabel jlbNoneSpace = new JLabel("공백제외 글자 수 : " + count);

	private Thread thread;

	private JDialog jdlogSetFont = new JDialog();

	public void panel1() {
		JPanel jpCounter = new JPanel();
		JPanel jpTab = new JPanel();

		jpCounter.setLayout(new GridLayout(1, 2));
		jlbCounter.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		jlbNoneSpace.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		jpCounter.add(jlbCounter);
		jpCounter.add(jlbNoneSpace);

		jpTab.setLayout(new GridLayout(1, 2));

		jp1.setBackground(Color.WHITE);
		jp1.setLayout(new BorderLayout());

		jbtAddTab.setFont(new Font("맑은고딕", Font.BOLD, 15));
		jbtRemoveTab.setFont(new Font("맑은고딕", Font.BOLD, 15));
		jpTab.add(jbtAddTab);
		jpTab.add(jbtRemoveTab);

		jta[0] = new JTextArea();
		jta[0].setFont(new Font("맑은고딕", Font.PLAIN, 13));
		jp1.add(jsp[0] = new JScrollPane(jta[0], JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);
		jp1.add(jpTab, BorderLayout.NORTH);
		jp1.add(jpCounter, BorderLayout.SOUTH);

		jbtAddTab.addActionListener(e -> {
			if (e.getSource() == jbtAddTab) {
				try {
					addpanel();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "최대 탭 사이즈는 5개 입니다", "경고", JOptionPane.ERROR_MESSAGE);
					tabCount = 4;
				}
			}
		});
		jbtRemoveTab.addActionListener(e -> {
			if (e.getSource() == jbtRemoveTab) {
				if (tabCount > 0) {
					jTap.remove(tabCount);
					tabCount--;
				} else
					return;

			}
		});
		jTap.addTab("메모1", null, jp1, "Text");
		ct.add(jTap);
	}

	public void addpanel() {
		// JPanel jpCounter = new JPanel();
		// jpCounter.setLayout(new GridLayout(1, 2));
		// jlbCounter.setFont(new Font("굴림", Font.BOLD, 15));
		// jlbNoneSpace.setFont(new Font("굴림", Font.BOLD, 15));
		// jpCounter.add(jlbCounter);
		// jpCounter.add(jlbNoneSpace);

		tabCount++;
		jp[tabCount] = new JPanel();
		jp[tabCount].setBackground(Color.white);
		jp[tabCount].setLayout(new BorderLayout());
		// jp[tabCount].add(jpCounter, BorderLayout.SOUTH);
		jta[tabCount] = new JTextArea();

		try {
			jp[tabCount].add(jsp[tabCount] = new JScrollPane(jta[tabCount], JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
					JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "최대 사이즈 5", "경고", JOptionPane.ERROR_MESSAGE);
		}
		jTap.addTab("메모" + (tabCount + 1), null, jp[tabCount], "Text");

	}

	public Memo() {
		/* 기본 레이아웃 글꼴 변경 */
		Font font1 = new Font("맑은고딕", Font.PLAIN, 13);
		Font font2 = new Font("맑은고딕", Font.PLAIN, 14);
		UIManager.put("Menu.font", font1);
		UIManager.put("MenuItem.font", font1);
		UIManager.put("OptionPane.messageFont", font2);
		UIManager.put("OptionPane.buttonFont", font2);

		/* 기본 프레임 설정 */
		setTitle("메모장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 800);
		setMinimumSize(new Dimension(350, 350));
		setLocationRelativeTo(null);

		/* 메뉴바 */
		jMenuBar = new JMenuBar();
		jMenuFile = new JMenu("파일(F)");
		jMenuFile.setMnemonic(KeyEvent.VK_F);
		jMenuInfo = new JMenu("정보(O)");
		jMenuInfo.setMnemonic(KeyEvent.VK_O);
		jMenuEdit = new JMenu("편집(E)");
		jMenuEdit.setMnemonic(KeyEvent.VK_E);
		jMenuSet = new JMenu("서식(S)");
		jMenuSet.setMnemonic(KeyEvent.VK_S);

		/* 메뉴바 - 파일 */
		menuItemNew = new JMenuItem("새 메모");
		menuItemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		menuItemNew.addActionListener(this);
		jMenuFile.add(menuItemNew);

		jMenuFile.addSeparator();

		menuItemSave = new JMenuItem("저장");
		menuItemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		menuItemSave.addActionListener(this);
		jMenuFile.add(menuItemSave);

		menuItemLoad = new JMenuItem("불러오기");
		menuItemLoad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		menuItemLoad.addActionListener(this);
		jMenuFile.add(menuItemLoad);

		jMenuFile.addSeparator();

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
		menuItemInputTime.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		menuItemInputTime.addActionListener(this);
		jMenuEdit.add(menuItemInputTime);

		menuItemAutoNewLine = new JMenuItem("자동 줄 바꿈");
		menuItemAutoNewLine.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
		menuItemAutoNewLine.addActionListener(this);
		jMenuEdit.add(menuItemAutoNewLine);

		/* 메뉴바 - 서식 */
		menuItemChangeFont = new JMenuItem("글꼴");
		menuItemChangeFont.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		menuItemChangeFont.addActionListener(this);
		jMenuSet.add(menuItemChangeFont);

		/* 메뉴바 프레임 추가 */
		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuEdit);
		jMenuBar.add(jMenuSet);
		jMenuBar.add(jMenuInfo);
		setJMenuBar(jMenuBar);

		/* 글꼴 편집기 - JDialog */
		jdlogSetFont.setTitle("글꼴 편집기");
		jdlogSetFont.setSize(250, 150);
		jdlogSetFont.setModal(true);
		jdlogSetFont.setResizable(false);
		jdlogSetFont.setAlwaysOnTop(true);
		jdlogSetFont.setLocationRelativeTo(null);

		/* 기본 패널 */
		panel1();

		/* 글자 수 체크 & 현재시간 Thread */
		thread = new Thread(this);
		thread.start();

	}

	public static void main(String[] args) {
		new Memo().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int nowTab = jTap.getSelectedIndex();

		if (e.getActionCommand().equals("저장")) {
			JFileChooser jc = new JFileChooser();
			setChooserFont(jc.getComponents());
			jc.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
			jc.removeChoosableFileFilter((jc.getFileFilter()));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("텍스트 파일(.txt)", "txt");
			jc.addChoosableFileFilter(filter);
			int result = jc.showSaveDialog(this);
			String getText = jta[nowTab].getText();

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
			setChooserFont(jc.getComponents());
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
					jta[nowTab].setText(loadText);
				} catch (Exception e1) {
					System.out.print(e1.getMessage());
				}
			}

		} else if (e.getActionCommand().equals("종료")) {
			System.exit(0);
		} else if (e.getActionCommand().equals("메모장 정보")) {
			JOptionPane.showMessageDialog(null, "AHJ");
		} else if (e.getActionCommand().equals("현재 시간 입력")) {
			jta[nowTab].append(time);
		} else if (e.getActionCommand().equals("새 메모")) {
			jta[nowTab].setText("");
		} else if (e.getActionCommand().equals("자동 줄 바꿈")) {
			autoNewLine();
		} else if (e.getActionCommand().equals("글꼴")) {
			jdlogSetFont.setVisible(true);
		}
	}

	public void setChooserFont(Component[] component) {
		Font fontChooser = new Font("맑은고딕", Font.PLAIN, 12);
		for (int x = 0; x < component.length; x++) {
			if (component[x] instanceof Container)
				setChooserFont(((Container) component[x]).getComponents());
			try {
				component[x].setFont(fontChooser);
			} catch (Exception e) {
			}
		}
	}

	public void autoNewLine() {
		int nowTab = jTap.getSelectedIndex();
		if (isAutoNewLineFlag == false) {
			isAutoNewLineFlag = true;
			jta[nowTab].setLineWrap(true);
		} else if (isAutoNewLineFlag == true) {
			isAutoNewLineFlag = false;
			jta[nowTab].setLineWrap(false);
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1);

				sdf = new SimpleDateFormat("a hh:mm:ss YYYY-MM-dd");
				time = sdf.format(new Date());
				int nowTab = jTap.getSelectedIndex();
				String countText = jta[nowTab].getText();
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