package kh.gbc.controller;

import kh.gbc.model.vo.ViewModel;
import kh.gbc.view.LobbyView;
import kh.gbc.view.PowerUpLvUpView;
import kh.gbc.view.PowerUpNewAdventureView;
import kh.gbc.view.PowerUpView;

public class PowerUpLvUpController {
	private ViewModel vm = ViewModel.getInstance();
	private PowerUpView pUV;
	private PowerUpLvUpView pLUV = new PowerUpLvUpView(this);

	public void startPowerUpLvUpView(PowerUpView pUV) {
		this.pUV = pUV;
		pLUV.loadPowerUpLvUpView();
	}

	public void backToPowerUpView() {
		vm.getPanel(vm.getPowerLvUpName()).setVisible(false);
		vm.getPanel(vm.getPowerUpName()).setVisible(true);
	}

}
