package kh.gbc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import kh.gbc.controller.RankingController;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class RankingView {

	private RankingController rController;
	private JDialog rankDlog = new JDialog();
	private JPanel rankPanel = new JPanel();
	private JPanel closePanel = new JPanel();
	private JButton closeBtn = new JButton("Close");
	private JLabel xIcon = new JLabel();
	private JScrollPane scroll = null;
	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private ViewModel vm = ViewModel.getInstance();

	public RankingView() {

	}

	public RankingView(RankingController rController) {
		this.rController = rController;
	}
	
	public void rankContents(String ranking, String id, String weight) {
		JPanel rankBox = new JPanel();
		JPanel rank = new JPanel();
		JPanel rankResult = new JPanel();
		JLabel rankText = new JLabel(ranking);
		JLabel rankResultId = new JLabel(id);
		JLabel rankResultWeight = new JLabel(weight);		
		rankBox.setLayout(new BorderLayout());
		rankBox.setPreferredSize(new Dimension(400, 100));
		rank.setLayout(new GridBagLayout());
		rankResult.setLayout(new GridLayout(2, 1));

		rank.add(rankText);
		rankText.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 24));
		rank.setPreferredSize(new Dimension(100, 100));
		rank.setBackground(Color.white);
		rankResultId.setFont(new Font("¸¼Àº°íµñ", Font.PLAIN, 22));
		rankResultWeight.setForeground(new Color(41,109,156)); // »ö±ò ³ªÁß¿¡ º¯°æ
		rankResultWeight.setFont(new Font("¸¼Àº°íµñ", Font.ITALIC, 18));
		rankResult.setBackground(Color.WHITE);
		rankResult.add(rankResultId);
		rankResult.add(rankResultWeight);
		rankResult.setPreferredSize(new Dimension(300, 100));
		rankBox.add(rank, BorderLayout.WEST);
		rankBox.add(rankResult, BorderLayout.CENTER);
		rankPanel.add(rankBox);
	}

	public void loadRankView() {
		rankDlog.setTitle("·©Å·");
		rankDlog.setSize(400, 600);
		rankDlog.setResizable(false);
		rankDlog.setLocationRelativeTo(null);
		rankDlog.setAlwaysOnTop(true);
		rankDlog.setModal(true);
		rankDlog.setLayout(new BorderLayout());
	
		//rankDlog.pack();
		// rankDlog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		rankPanel.setLayout(new GridLayout(0, 1));

		rankContents("1", "Tanerseto90", "922");
		rankContents("2", "Naetmul", "214");
		rankContents("3", "Miyamory", "147");
		rankContents("4", "playeruntitled", "47");
		rankContents("5", "Sinjoinus", "20");
		rankContents("6", "Gujunsu", "7");
		rankContents("1", "Tanerseto90", "922");
		rankContents("2", "Naetmul", "214");
		rankContents("3", "Miyamory", "147");
		rankContents("4", "playeruntitled", "47");
		rankContents("5", "Sinjoinus", "20");
		rankContents("6", "Gujunsu", "7");
		
		// ½ºÅ©·Ñ ÇØ³õÀº °Å
		scroll = new JScrollPane(rankPanel);
		scroll.setBounds(0,0,400,500);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		xIcon.setBounds(377, 0, 25, 25);
		xIcon.setIcon(new ImageIcon(resRoad.getXIconImg()));

		closeBtn.setBounds(374, 0, 25, 25);
		closeBtn.setIcon(new ImageIcon(resRoad.getRedBtn()));
		closeBtn = vm.fitImageBtn(closeBtn);
		closeBtn.addActionListener(e->{rController.closeRanking();});
	
		closePanel.setPreferredSize(new Dimension(0,25));
		closePanel.setBackground(Color.WHITE);
		
		closePanel.setLayout(null);
		closePanel.add(xIcon);
		closePanel.add(closeBtn);
		
		rankDlog.add(closePanel, BorderLayout.NORTH);
		rankDlog.add(scroll, BorderLayout.CENTER);
		
		rankDlog.setUndecorated(true);
		rankDlog.getRootPane().setOpaque(false);
		rankDlog.setOpacity(0.75f);
		rankDlog.setVisible(true);
	}
	
	public void hideRankPopup()
	{
		rankDlog.setVisible(false);
	}

}
