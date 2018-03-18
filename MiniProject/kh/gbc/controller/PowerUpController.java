package kh.gbc.controller;

import kh.gbc.model.vo.ViewModel;
import kh.gbc.view.PowerUpLvUpView;
import kh.gbc.view.PowerUpView;

public class PowerUpController {
	private PowerUpView puV = new PowerUpView(this);
	private PowerUpNewAdventureController pNAC = new PowerUpNewAdventureController();
	private PowerUpNewFeedController pNFC = new PowerUpNewFeedController();
	private PowerUpLvUpController pLUC = new PowerUpLvUpController();
	private ViewModel vm = ViewModel.getInstance();

	public void startPowerUp() {
		puV.loadPowerUpView();
	}

	public void backToLobby() {
		vm.getPanel(vm.getPowerUpName()).setVisible(false);
		vm.getPanel(vm.getLobbyName()).setVisible(true);
	}

	public void startNewAdventure() {
		vm.getPanel(vm.getPowerUpName()).setVisible(false);
		pNAC.startPowerUpNewAdventureView(puV);
	}

	public void startNewFeed() {
		vm.getPanel(vm.getPowerUpName()).setVisible(false);
		pNFC.startPowerUpNewFeedView(puV);
	}

	public void startLvUp() {
		vm.getPanel(vm.getPowerUpName()).setVisible(false);
		pLUC.startPowerUpLvUpView(puV);
	}
}
