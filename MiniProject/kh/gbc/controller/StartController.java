package kh.gbc.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import kh.gbc.view.*;

public class StartController {
	private StartView sv = new StartView(this);
	public void start()
	{
			try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		sv.loadStartView();
	}
	public void btnAction()
	{
		sv.setStartPanelVisible(false);
		new LoginController().startLogin();
//		new LobbyController().startLobby();
	}
}
