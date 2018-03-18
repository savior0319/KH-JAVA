package kh.gbc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import kh.gbc.controller.FeedController;
import kh.gbc.controller.GBCController;
import kh.gbc.controller.LobbyController;
import kh.gbc.controller.RankingController;
import kh.gbc.controller.ShopController;
import kh.gbc.controller.UtilClass;
import kh.gbc.model.feed.Feed;
import kh.gbc.model.player.DataGroup;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;
import kh.gbc.model.vo.ui.UIBtnClass;

public class LobbyView{
	private LobbyController lobbyCtl;
	private ViewModel vm =  ViewModel.getInstance();
	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private ShopController shopCtl = new ShopController();
	private RankingController rankingController = new RankingController();
	private GBCController gbcController = GBCController.getInstance();
	private FeedController feedController;
	private JButton adventureBtn;
	private JButton powerUpBtn;
	private JButton dictionaryBtn;
	private JButton recomaandBtn;
	private JLabel northViewBg;
	private JButton enterShopBtn;
	
	private JLabel lobbyBg;
	private JLabel gbcIconLabel;
	
	private JPanel lobbyViewPanel;
	
	private JLabel reLifeCountLabel; // n
	private JLabel reLifeLabel; // 대째
	private JLabel rankingLabel; // 랭킹 :
	private JLabel rankingTitle; // 랭킹명(?)
	private JLabel weightLabel; // 체중 :
	private JLabel weightValueLabel; // 체중 값
	
	private JProgressBar jpb;
	private JButton jbtIncrease = new JButton("TEST");
	private int progressVal = 0;
	private int progressValchange;
	private int progressMAX = 100;
	
	
	public LobbyView() {}
	public LobbyView(LobbyController lobbyCtr)
	{
		this.lobbyCtl = lobbyCtr;
	}
	
	public void loadLobbyView()
	{
		enterShopBtn = new JButton(new ImageIcon(resRoad.getEnterShopBtnImg()));
		enterShopBtn.setBounds(8, 53, 110, 80);
		enterShopBtn = vm.fitImageBtn(enterShopBtn);
		enterShopBtn.addActionListener(e -> {
			shopCtl.startShop();
		});
		
		// 모험 버튼
		adventureBtn = new JButton(new ImageIcon(resRoad.getAdventureBtnImg()));
		adventureBtn.setBounds(15, 605, 99, 105);
		adventureBtn = vm.fitImageBtn(adventureBtn);
		adventureBtn.addActionListener(e ->{lobbyCtl.advBtnAction();});
		adventureBtn.setRolloverIcon(new ImageIcon(resRoad.getAdventureBtnPresImg()));
		
		// 파워업 버튼
		powerUpBtn = new JButton(new ImageIcon(resRoad.getPowerUpBtnImg()));
		powerUpBtn.setBounds(122, 605, 99, 105);
		powerUpBtn = vm.fitImageBtn(powerUpBtn);
		powerUpBtn.addActionListener(e ->{lobbyCtl.pwUpBtnAction();});
		powerUpBtn.setRolloverIcon(new ImageIcon(resRoad.getPowerUpBtnPresImg()));
		
		// 랭킹 버튼
		dictionaryBtn = new JButton(new ImageIcon(resRoad.getRankingBtnImg()));
		dictionaryBtn.setBounds(229, 605, 99, 105);
		dictionaryBtn = vm.fitImageBtn(dictionaryBtn);
		dictionaryBtn.addActionListener(e ->{rankingController.showRanking();});
		dictionaryBtn.setRolloverIcon(new ImageIcon(resRoad.getRankingBtnPresImg()));
		
		// 메뉴 버튼
		recomaandBtn = new JButton(new ImageIcon(resRoad.getMenuBtnImg()));
		recomaandBtn.setBounds(336, 605, 99, 105);
		recomaandBtn = vm.fitImageBtn(recomaandBtn);
		recomaandBtn.addActionListener(e ->{lobbyCtl.optionBtnAction();});
		recomaandBtn.setRolloverIcon(new ImageIcon(resRoad.getMenuBtnPresImg()));
		
		gbcIconLabel = new JLabel();
		gbcIconLabel.setIcon(new ImageIcon(resRoad.getGcgLv1_Img()));
		gbcIconLabel.setBounds(100, 100, 100, 100);		
//		vm.setGBCLabel(gbcIconLabel);
		
		lobbyBg = new JLabel();
		lobbyBg.setIcon(new ImageIcon(resRoad.getLobbyBgImg()));
		lobbyBg.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());
		
//		lobbyBg.add(gbcIconLabel);
		lobbyBg.add(powerUpBtn);
		lobbyBg.add(adventureBtn);
		lobbyBg.add(dictionaryBtn);
		lobbyBg.add(recomaandBtn);
		lobbyBg.add(enterShopBtn);
		
		lobbyViewPanel = new JPanel();
		lobbyViewPanel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());
		lobbyViewPanel.setLayout(null);
		
		northView();
		// 개복치 생성.
		Thread gbcT = new Thread(new GBCController(this));
		gbcT.start();
		
		setLobbyPanelVisible(true);
		vm.setPanel(vm.getLobbyName(),lobbyViewPanel);
		lobbyViewPanel.add(lobbyBg);	

		feedController = new FeedController(lobbyBg);
		
		vm.getMainFrame().add(lobbyViewPanel,BorderLayout.CENTER);	
	}
	
	public JLabel getGround() {return lobbyBg;}
	
	public void northView() {
		
	    reLifeCountLabel = new JLabel("n");
	    reLifeCountLabel.setBounds(20, 25,100,50);
	    reLifeCountLabel.setForeground(Color.white);
	    reLifeCountLabel.setFont(new Font("Serif",Font.BOLD, 20));
	    reLifeCountLabel.setVerticalAlignment(SwingConstants.TOP);
	    
	    reLifeLabel = new JLabel("대째");
	    reLifeLabel.setBounds(40,25,100,50);
	    reLifeLabel.setForeground(Color.white);
	    reLifeLabel.setFont(new Font("Serif",Font.BOLD, 20));
	    reLifeLabel.setVerticalAlignment(SwingConstants.TOP);
	    
	    rankingLabel = new JLabel("랭킹: ");
	    rankingLabel.setBounds(130,25,100,50);
	    rankingLabel.setForeground(Color.white);
	    rankingLabel.setFont(new Font("Serif",Font.BOLD, 20));
	    rankingLabel.setVerticalAlignment(SwingConstants.TOP);
	    
	    rankingTitle = new JLabel("랭킹명(?)");
	    rankingTitle.setBounds(180,25,100,50);
	    rankingTitle.setForeground(Color.white);
	    rankingTitle.setFont(new Font("Serif",Font.BOLD, 20));
	    rankingTitle.setVerticalAlignment(SwingConstants.TOP);
	    
	    weightLabel = new JLabel("체중: ");
	    weightLabel.setBounds(300,25,100,50);
	    weightLabel.setForeground(Color.white);
	    weightLabel.setFont(new Font("Serif",Font.BOLD, 20));
	    weightLabel.setVerticalAlignment(SwingConstants.TOP);
	    
	    weightValueLabel = new JLabel("체중값");
	    weightValueLabel.setBounds(350,25,100,50);
	    weightValueLabel.setForeground(Color.white);
	    weightValueLabel.setFont(new Font("Serif",Font.BOLD, 20));
	    weightValueLabel.setVerticalAlignment(SwingConstants.TOP);

	    //프로세스바
	    jpb = new JProgressBar(0, progressMAX);
	    jpb.setValue(progressVal);
	    jpb.setForeground(Color.orange);
	    jpb.setBorder(null);
	    jpb.setBounds(5, 60, 440, 20);  
	    
	    northViewBg = new JLabel();
	    northViewBg.setBounds(0,-10,450,100);
	    northViewBg.setIcon(new ImageIcon(resRoad.getNorthLobbyImg()));
	 
	    northViewBg.add(reLifeCountLabel);
	    northViewBg.add(reLifeLabel);
	    northViewBg.add(rankingLabel);
	    northViewBg.add(rankingTitle);
	    northViewBg.add(weightLabel);
	    northViewBg.add(weightValueLabel);
	    northViewBg.add(jpb);
	    
	    northViewBg.setBackground(new Color(16, 142, 247));
	    lobbyViewPanel.add(northViewBg);
	}
	
	private int tempMax = 50;
	public void updateProgress(int min,int max,int value)
	{
		jpb.setMinimum(min);
		jpb.setMaximum(max); 
    	progressVal += value;
    	System.out.println("min " + min + " max " + max + " value " + progressVal);
    	if(max==progressVal)
		{
    		jpb.setValue(0);
			tempMax = max;
		}
    	else jpb.setValue(progressVal);
	}
	public void initProgressValue(int progressVal) {this.progressVal  =progressVal;}
	
	public void setLobbyPanelVisible(boolean direc)
	{
		lobbyViewPanel.setVisible(direc);
	}
}
