package kh.gbc.controller;

import kh.gbc.model.vo.ViewModel;
import kh.gbc.view.PowerUpNewFeedView;
import kh.gbc.view.PowerUpView;

public class PowerUpNewFeedController {
	private ViewModel vm = ViewModel.getInstance();
	private PowerUpView pUV;
	private PowerUpNewFeedView pNFV = new PowerUpNewFeedView(this);

	public void startPowerUpNewFeedView(PowerUpView pUV) {
		this.pUV = pUV;
		pNFV.loadPowerUpNewFeedView();
	}

	public void backToPowerUpView() {
		vm.getPanel(vm.getPowerNewFeedName()).setVisible(false);
		vm.getPanel(vm.getPowerUpName()).setVisible(true);
	}
}
