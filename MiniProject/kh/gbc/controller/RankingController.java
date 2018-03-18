package kh.gbc.controller;

import kh.gbc.view.RankingView;

public class RankingController {
	private RankingView rankingView;
	public void showRanking()
	{
		rankingView = new RankingView(this);
		rankingView.loadRankView();
	}
	public void closeRanking()
	{
		rankingView.hideRankPopup();
	}
}
