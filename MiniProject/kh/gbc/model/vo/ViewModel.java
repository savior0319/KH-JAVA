package kh.gbc.model.vo;

import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;

public class ViewModel {
	private final int frameWidth = 450;
	private final int frameHeight = 800;
	private static JFrame mainFrame;
	private static ViewModel vm; 
	private static HashMap<String,JPanel> panelList = new HashMap<String,JPanel>();
	/*
	 * 0-> LobbyPanel
	 * 1-> AdventurePanel
	 * 2-> PowerUpPanel      
	 * */
	
	public String getLobbyName() {return "lobby";}
	public String getAdventureName() {return "adventure";}
	public String getPowerUpName() {return "powerUp";}
	public String getPowerLvUpName() {return "lvUp";}
	public String getPowerNewAdventureName() {return "adventureNew";}
	public String getPowerNewFeedName() {return "feedNew";}
	public String getOptionName() {return "option";}
	public String getShopName() {return "shop";}
	
	private ArrayList<JButton> btnList = new ArrayList<JButton>();
	
	private static JLabel gbcImg ;
	private static JPanel lobbyView;
	public ViewModel() {this.vm = this;}
	public static ViewModel getInstance() {return vm;}
	
	public void setMainFrame(JFrame mainFrame) {this.mainFrame = mainFrame;}
	public JFrame getMainFrame() {return this.mainFrame;}// 프레임 쓸때.
	
	public int getFrameWidth() {return this.frameWidth;}// 전체 프레임 가로 크기.
	public int getFrameHeight() {return this.frameHeight;}// 전체 프레임 세로 크기.
	
	public void setPanel(String viewName,JPanel p) {panelList.put(viewName,p);}
	public JPanel getPanel(String viewName) {return panelList.get(viewName);}
	
	public void setLobbyPanel(JPanel lobbyView) {this.lobbyView = lobbyView;}
	public JPanel getLobbyPanel() {return this.lobbyView;}
	
	public void setButton(JButton p) {btnList.add(p);}
	public JButton getButton(int bIndex) {return btnList.get(bIndex);}
	
	public void setGBCLabel(JLabel gbcImg) {this.gbcImg = gbcImg;}
	public JLabel getGBCLabel() { return this.gbcImg; }
	
	public JButton fitImageBtn(JButton b)
	{
		b.setBorderPainted(false);
		b.setBorder(null);	
		b.setMargin(new Insets(0, 0, 0, 0));
		b.setContentAreaFilled(false);
//		b.setRolloverIcon(iconA());
		return b;
	}
}
