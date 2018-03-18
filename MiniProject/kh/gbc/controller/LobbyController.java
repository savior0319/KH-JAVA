package kh.gbc.controller;

import javax.swing.JButton;
import javax.swing.JLabel;

import kh.gbc.model.player.DataGroup;
import kh.gbc.view.LobbyView;

public class LobbyController {
	private LobbyView lv = new LobbyView(this);
	private AdventureController adC = new AdventureController();
	private PowerUpController puC = new PowerUpController();
	private OptionController optionC = new OptionController();
	private UtilClass uc = new UtilClass();
	private DataGroup dataGroup = DataGroup.getInstance();
//	private GBCController rt = new GBCController();
	private static boolean timerChk = true;
	
	public void setTimerChk(boolean timerChk) {this.timerChk = timerChk;}
	public boolean getTimerChk() {return this.timerChk;}
	
	public void startLobby()
	{
		//파일 정보를  만들어주거나 값을 읽어온다.
		dataGroup.FileCheck();
		lv.loadLobbyView();
	}
	
	public void optionBtnAction()
	{
		lv.setLobbyPanelVisible(false);
		optionC.startOption();
	}
	
	public void advBtnAction()
	{
//		lv.setLobbyPanelVisible(false);
		adC.startAdv(lv);		
	}
	public void pwUpBtnAction()
	{
		lv.setLobbyPanelVisible(false);
		puC.startPowerUp();
	}
}
