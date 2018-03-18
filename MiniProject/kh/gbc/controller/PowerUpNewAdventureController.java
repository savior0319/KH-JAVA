package kh.gbc.controller;

import kh.gbc.model.vo.ViewModel;
import kh.gbc.view.PowerUpLvUpView;
import kh.gbc.view.PowerUpNewAdventureView;
import kh.gbc.view.PowerUpView;

public class PowerUpNewAdventureController {
	private ViewModel vm = ViewModel.getInstance();
	private PowerUpView pUV;
	private PowerUpNewAdventureView  pLUV = new PowerUpNewAdventureView(this);
	public void startPowerUpNewAdventureView(PowerUpView pUV)
	{
		this.pUV = pUV;
		pLUV.loadPowerUpNewAdventureView();
	}
	public void backToPowerUpView()
	{
		vm.getPanel(vm.getPowerNewAdventureName()).setVisible(false);
		vm.getPanel(vm.getPowerUpName()).setVisible(true);
	}
}
