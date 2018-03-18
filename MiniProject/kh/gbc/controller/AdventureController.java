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
		// 0 ��,1 �ƴϿ�, 2 ���, -1 �˾�â �ݱ�.
		switch (answer) {
		case 0:
			lv.setLobbyPanelVisible(false);
			adV.loadAdventureView(selectAdventure()); // ���� ��ħ
			break;
		case -1:
			System.out.println("�˾��ݱ�");
			break;
		case 1:
			System.out.println("�ƴϿ�");
			break;
		case 2:
			break;
		}
	}

	public int selectAdventure() { // Ȯ���� ���� �̺�Ʈ ����
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
