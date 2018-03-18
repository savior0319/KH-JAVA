package kh.gbc.controller;

import java.util.Random;

import kh.gbc.model.vo.ViewModel;
import kh.gbc.view.AdventureView;
import kh.gbc.view.LobbyView;

public class AdventureController {
	private AdventureView adV = new AdventureView(this);
	private ViewModel vm = ViewModel.getInstance();
	private LobbyView lv;

	public void startAdv(LobbyView lv) {
		this.lv = lv;
		adV.answerAdventureQuest();
	}

	public double getSurvivorRate(int eventType) {
		return 95;
	}

	public void backtoLobby() {
		vm.getPanel(vm.getAdventureName()).setVisible(false);
		vm.getPanel(vm.getLobbyName()).setVisible(true);
	}

	public void goAdventure() {
		adV.adventureConfirm();
	}

	public void AdventreGoStop(int answer) {
		// 0 ¿¹,1 ¾Æ´Ï¿ä, 2 Ãë¼Ò, -1 ÆË¾÷Ã¢ ´İ±â.
		switch (answer) {
		case 0:
			lv.setLobbyPanelVisible(false);
			adV.loadAdventureView(selectAdventure()); // ¿©±â °íÄ§
			break;
		case -1:
			System.out.println("ÆË¾÷´İ±â");
			break;
		case 1:
			System.out.println("¾Æ´Ï¿ä");
			break;
		case 2:
			break;
		}
	}

	public int selectAdventure() { // È®·ü·Î ¸ğÇè ÀÌº¥Æ® ½ÇÇà
		Random r = new Random();

		int rate = r.nextInt(100);

		System.out.println(rate);
		if (rate > 60) {
			return 1; // 40%
		} else if (rate > 30) {
			return 2; // 30%
		} else if (rate > 10) {
			return 3; // 20%
		} else
			return 4; // 10%
	}

}
