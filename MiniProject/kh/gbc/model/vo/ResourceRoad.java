package kh.gbc.model.vo;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ResourceRoad {
	private String commonPath = "C:\\Users\\savio\\Documents\\Workspace\\KH-JAVA\\MiniProject\\main\\resources\\";
	private Image mainBgImg;
	private Image lobbyBgImg;
	private Image blueBtnImg;
	private Image blueBtnPresImg;
	private Image adventureBgImg;
	private Image popupBgImg;
	private Image gbgLv1_Img;
	private Image gbgLv2_Img;
	private Image gbgLv3_Img;
	private Image gbgLv4_Img;
	private Image eventImg01;
	private Image eventImg02;
	private Image eventImg03;
	private Image eventImg04;
	private Image redBtn;
	private Image adventrueStartImg;
	private Image powerUpBgImg;
	private Image powerUpNewAdImg;
	private Image powerUpNewFeedImg;
	private Image powerUpFeeCountImg;
	private Image xIconImg;
	private Image adventureBtnImg; // 모험 버튼
	private Image powerUpBtnImg; // 파워업 버튼
	private Image rankingBtnImg; // 랭킹 버튼
	private Image menuBtnImg; // 메뉴 버튼
	private Image adventureBtnPresImg; // 모험 버튼 누른 상태
	private Image powerUpBtnPresImg; // 파워업 버튼 누른 상태
	private Image rankingBtnPresImg; // 랭킹 버튼 누른 상태
	private Image menuBtnPresImg; // 메뉴 버튼 누른 상태
	private Image northLobbyImg;
	private Image feedImg;// 먹이 이미지.
	private Image shopBtnImg;// 먹이 이미지.
	private Image shopBgImg;// 먹이 이미지.
	private Image whiteTextboxImg;
	private Image blackBgImg;
	private Image enterShopImg;

	private Image jellyfish;
	private Image ozinger;
	private Image myulChi;
	private Image shrimph;
	private Image lv2;
	private Image lv3;
	private Image lv4;
	private Image lv5;

	private Image ganzil;
	private Image deepblue;
	private Image rock;
	private Image sanho;

	private Image adventureDeepBlueImg;
	private Image adventureLightImg;
	private Image adventureMomGaryupImg;
	private Image adventureRockImg;

	private Image menuBar;
	private Image loginBgImg;

	/* 폰트 */
	private Font font, sizedFont24f, sizedFont21f;

	private static ResourceRoad resRoad;

	public ResourceRoad() {
		setMainBgImg();
		setLobbyBgImg();
		setBlueBtnImg();
		// setBluePresImg();
		setAdventureBgImg();
		setPopupBgImg();
		setGcgLv1_Img();
		setGcgLv2_Img();
		setGcgLv3_Img();
		setGcgLv4_Img();
		setEventImg01();
		setEventImg02();
		setEventImg03();
		setEventImg04();
		setRedBtn();
		setAdventrueStart();
		setPowerUpBgImg();
		setPowerUpNewAdImg();
		setPowerUpNewFeedImg();
		setPowerUpFeeCountImg();
		setXIconImg();

		setNorthLobbyImg(); // 로비 상단뷰
		setFeedImg(); // 먹이 먹기전

		setAdventureBtnImg(); // 모험 버튼
		setPowerUpBtnImg(); // 파워업버튼
		setRankingBtnImg(); // 랭킹 버튼
		setMenuBtnImg(); // 메뉴버튼

		setAdventureBtnPresImg(); // 모험 눌렀을때
		setPowerUpBtnPresImg(); // 파워업 눌렀을 때
		setRankingBtnPresImg(); // 랭킹 눌렀을 때
		setMenuBtnPresImg(); // 메뉴 눌렀을 때

		setJellyfish();
		setOzinger();
		setMyulChi();
		setShrimph();
		setLv2();
		setLv3();
		setLv4();
		setLv5();
		setGanzil();
		setDeepblue();
		setRock();
		setSanho();

		setAdeventureRockImg();
		setAdventureMomGaryupImg();
		setAdventureLightImg();
		getAdventureLightImg();
		setWhiteTextboxImg();
		setAdventureDeepBlueImg();

		setShopBgImg();
		setShopBtnImg();

		setBlackBgImg();

		setEnterShopBtnImg();
		setMenuBgImg();

		setLoginBgImg(); // 로그인 & 회원가입 배경화면

		setFont();

		this.resRoad = this;
	}

	public static ResourceRoad getInstance() {
		return resRoad;
	}

	/* 폰트 */
	public void setFont() {
		File path = new File(commonPath + "Binggrae.ttf");
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, path);
			sizedFont24f = font.deriveFont(24f);
			sizedFont21f = font.deriveFont(21f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Font getFontSize21() {
		return this.sizedFont21f;
	}
	
	public Font getFontSize24() {
		return this.sizedFont24f;
	}
	
	public void setMainBgImg() {
		File path = new File(commonPath + "mainBG.png");
		try {
			mainBgImg = ImageIO.read(path).getScaledInstance(450, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getMainBgImg() {
		return this.mainBgImg;
	}

	public void setLobbyBgImg() {
		File path = new File(commonPath + "lobbyBG.png");
		try {
			lobbyBgImg = ImageIO.read(path).getScaledInstance(450, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getLobbyBgImg() {
		return this.lobbyBgImg;
	}

	public void setBlueBtnImg() {
		File path = new File(commonPath + "blueBtn.png");
		try {
			blueBtnImg = ImageIO.read(path).getScaledInstance(420, 100, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getBlueBtnImg() {
		return this.blueBtnImg;
	}

	// public void setBluePresImg()
	// {
	// File path = new File(commonPath+"blueBtnPress.png");
	// try {
	// blueBtnPresImg = ImageIO.read(path).getScaledInstance(99, 80,
	// Image.SCALE_SMOOTH);
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// public Image getBluePresImg() {return this.blueBtnPresImg;}

	public void setAdventureBgImg() {
		File path = new File(commonPath + "adventureBg.png");
		try {
			adventureBgImg = ImageIO.read(path).getScaledInstance(450, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getAdventureBgImg() {
		return this.adventureBgImg;
	}

	public void setPopupBgImg() {
		File path = new File(commonPath + "popupBg.png");
		try {
			popupBgImg = ImageIO.read(path).getScaledInstance(420, 500, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getPopupBgImg() {
		return this.popupBgImg;
	}

	public void setGcgLv1_Img() {
		File path = new File(commonPath + "gbcLv1.png");
		try {
			gbgLv1_Img = ImageIO.read(path).getScaledInstance(110, 111, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getGcgLv1_Img() {
		return this.gbgLv1_Img;
	}

	public void setGcgLv2_Img() {
		File path = new File(commonPath + "gbcLv2.png");
		try {
			gbgLv2_Img = ImageIO.read(path).getScaledInstance(156, 143, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getGcgLv2_Img() {
		return this.gbgLv2_Img;
	}

	public void setGcgLv3_Img() {
		File path = new File(commonPath + "gbcLv3.png");
		try {
			gbgLv3_Img = ImageIO.read(path).getScaledInstance(220, 236, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getGcgLv3_Img() {
		return this.gbgLv3_Img;
	}

	public void setGcgLv4_Img() {
		File path = new File(commonPath + "gbcLv4.png");
		try {
			gbgLv4_Img = ImageIO.read(path).getScaledInstance(286, 296, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getGcgLv4_Img() {
		return this.gbgLv4_Img;
	}

	public void setEventImg01() {
		File path = new File(commonPath + "adventureType_0.png");
		try {
			eventImg01 = ImageIO.read(path).getScaledInstance(400, 250, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getEventImg01() {
		return eventImg01;
	}

	public void setRedBtn() {
		File path = new File(commonPath + "BtnRed.png");
		try {
			redBtn = ImageIO.read(path).getScaledInstance(110, 50, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getRedBtn() {
		return redBtn;
	}

	public void setAdventrueStart() {
		File path = new File(commonPath + "BgWindow01.png");
		try {
			adventrueStartImg = ImageIO.read(path).getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getAdventrueStart() {
		return this.adventrueStartImg;
	}

	public void setPowerUpBgImg() {
		File path = new File(commonPath + "BGOption.png");
		try {
			powerUpBgImg = ImageIO.read(path).getScaledInstance(450, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getPowerUpBgImg() {
		return this.powerUpBgImg;
	}

	public void setPowerUpNewAdImg()

	{
		File path = new File(commonPath + "NewAdventure.png");
		try {
			powerUpNewAdImg = ImageIO.read(path).getScaledInstance(400, 110, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getPowerUpNewAdImg() {
		return this.powerUpNewAdImg;
	}

	public void setPowerUpNewFeedImg() {
		File path = new File(commonPath + "NewFeed.png");
		try {
			powerUpNewFeedImg = ImageIO.read(path).getScaledInstance(400, 110, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getPowerUpNewFeedImg() {
		return this.powerUpNewFeedImg;
	}

	public void setPowerUpFeeCountImg() {
		File path = new File(commonPath + "FeedCount.png");
		try {
			powerUpFeeCountImg = ImageIO.read(path).getScaledInstance(400, 110, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getPowerUpFeeCountImg() {
		return this.powerUpFeeCountImg;
	}

	public void setXIconImg() {
		File path = new File(commonPath + "xIcon.png");
		try {
			xIconImg = ImageIO.read(path).getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getXIconImg() {
		return this.xIconImg;
	}

	// LobbyView의 상단 뷰
	public void setNorthLobbyImg() {
		File path = new File(commonPath + "northViewPanel.png");
		try {
			northLobbyImg = ImageIO.read(path).getScaledInstance(450, 65, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getNorthLobbyImg() {
		return this.northLobbyImg;
	}

	// 먹이 먹기 전
	public void setFeedImg() {
		File path = new File(commonPath + "feed.png");
		try {
			feedImg = ImageIO.read(path).getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getFeedImg() {
		return this.feedImg;
	}

	public Image getAfterImg() {
		return this.feedImg;
	}

	// 모험 버튼
	public void setAdventureBtnImg() {
		File path = new File(commonPath + "adventureBtn.png");
		try {
			adventureBtnImg = ImageIO.read(path).getScaledInstance(99, 100, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getAdventureBtnImg() {
		return this.adventureBtnImg;
	}

	// 파워업 버튼
	public void setPowerUpBtnImg() {
		File path = new File(commonPath + "powerUpBtn.png");
		try {
			powerUpBtnImg = ImageIO.read(path).getScaledInstance(99, 100, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getPowerUpBtnImg() {
		return this.powerUpBtnImg;
	}

	// 랭킹 버튼
	public void setRankingBtnImg() {
		File path = new File(commonPath + "rankingBtn.png");
		try {
			rankingBtnImg = ImageIO.read(path).getScaledInstance(99, 100, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getRankingBtnImg() {
		return this.rankingBtnImg;
	}

	// 메뉴 버튼
	public void setMenuBtnImg() {
		File path = new File(commonPath + "menuBtn.png");
		try {
			menuBtnImg = ImageIO.read(path).getScaledInstance(99, 100, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getMenuBtnImg() {
		return this.menuBtnImg;
	}

	// 모험 버튼 누른 상태
	public void setAdventureBtnPresImg() {
		File path = new File(commonPath + "adventureBtnPres.png");
		try {
			adventureBtnPresImg = ImageIO.read(path).getScaledInstance(99, 100, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getAdventureBtnPresImg() {
		return this.adventureBtnPresImg;
	}

	// 파워업 버튼 누른 상태
	public void setPowerUpBtnPresImg() {
		File path = new File(commonPath + "powerUpBtnPres.png");
		try {
			powerUpBtnPresImg = ImageIO.read(path).getScaledInstance(99, 100, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getPowerUpBtnPresImg() {
		return this.powerUpBtnPresImg;
	}

	// 랭킹 버튼 누른 상태
	public void setRankingBtnPresImg() {
		File path = new File(commonPath + "rankingBtnPres.png");
		try {
			rankingBtnPresImg = ImageIO.read(path).getScaledInstance(99, 100, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getRankingBtnPresImg() {
		return this.rankingBtnPresImg;
	}

	// 메뉴 버튼 누른 상태
	public void setMenuBtnPresImg() {
		File path = new File(commonPath + "menuBtnPres.png");
		try {
			menuBtnPresImg = ImageIO.read(path).getScaledInstance(99, 100, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getMenuBtnPresImg() {
		return this.menuBtnPresImg;
	}

	public void setOzinger() {
		File path = new File(commonPath + "Ozinger.png");
		try {
			ozinger = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getOzinger() {
		return this.ozinger;
	}

	public void setJellyfish() {
		File path = new File(commonPath + "JellyFish.png");
		try {
			jellyfish = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getJellyfish() {
		return this.jellyfish;
	}

	public void setMyulChi() {
		File path = new File(commonPath + "MyulChi.png");
		try {
			myulChi = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getMyulChi() {
		return this.myulChi;
	}

	public void setShrimph() {
		File path = new File(commonPath + "Shrimph.png");
		try {
			shrimph = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getShrimph() {
		return this.shrimph;
	}

	public void setLv2() {
		File path = new File(commonPath + "lv2.png");
		try {
			lv2 = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getLv2() {
		return this.lv2;
	}

	public void setLv3() {
		File path = new File(commonPath + "lv3.png");
		try {
			lv3 = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getLv3() {
		return this.lv3;
	}

	public void setLv4() {
		File path = new File(commonPath + "lv4.png");
		try {
			lv4 = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getLv4() {
		return this.lv4;
	}

	public void setLv5() {
		File path = new File(commonPath + "lv5.png");
		try {
			lv5 = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getLv5() {
		return this.lv5;
	}

	public void setGanzil() {
		File path = new File(commonPath + "ganzil.png");
		try {
			ganzil = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image gsetGanzil() {
		return this.ganzil;
	}

	public void setDeepblue() {
		File path = new File(commonPath + "deepblue.png");
		try {
			deepblue = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getDeepBlue() {
		return this.deepblue;
	}

	public void setRock() {
		File path = new File(commonPath + "rock.png");
		try {
			rock = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getRock() {
		return this.rock;
	}

	public void setSanho() {
		File path = new File(commonPath + "sanho.png");
		try {
			sanho = ImageIO.read(path).getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getSanho() {
		return this.sanho;
	}

	private void setAdeventureRockImg() {
		File path = new File(commonPath + "adventureRock.png");
		try {
			adventureRockImg = ImageIO.read(path).getScaledInstance(400, 250, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getAdventureRockImg() {
		return this.adventureRockImg;
	}

	private void setAdventureMomGaryupImg() {
		File path = new File(commonPath + "adventureMomGaryup.png");
		try {
			adventureMomGaryupImg = ImageIO.read(path).getScaledInstance(400, 250, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getAdventureMomGaryupImg() {
		return this.adventureMomGaryupImg;
	}

	private void setAdventureLightImg() {
		File path = new File(commonPath + "adventureLight.png");
		try {
			adventureLightImg = ImageIO.read(path).getScaledInstance(400, 250, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getAdventureLightImg() {
		return this.adventureLightImg;
	}

	private void setAdventureDeepBlueImg() {
		File path = new File(commonPath + "adventureDeepBlue.png");
		try {
			adventureDeepBlueImg = ImageIO.read(path).getScaledInstance(400, 250, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getAdventureDeepBlueImg() {
		return this.adventureDeepBlueImg;
	}

	private void setWhiteTextboxImg() {
		File path = new File(commonPath + "whiteTextbox.png");
		try {
			whiteTextboxImg = ImageIO.read(path).getScaledInstance(450, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getWhiteTextboxImg() {
		return this.whiteTextboxImg;
	}

	private void setMenuBgImg() {
		File path = new File(commonPath + "MenuBar.png");
		try {
			menuBar = ImageIO.read(path).getScaledInstance(450, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getMenuBgImg() {
		return this.menuBar;
	}

	public void setShopBtnImg() {
		File path = new File(commonPath + "shopBtn.png");
		try {
			shopBtnImg = ImageIO.read(path).getScaledInstance(400, 110, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getShopBtnImg() {
		return this.shopBtnImg;
	}

	public void setShopBgImg() {
		File path = new File(commonPath + "BGOption2.png");
		try {
			shopBgImg = ImageIO.read(path).getScaledInstance(450, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getShopBgImg() {
		return this.shopBgImg;
	}

	private void setBlackBgImg() {
		File path = new File(commonPath + "BlackBg.png");
		try {
			blackBgImg = ImageIO.read(path).getScaledInstance(450, 600, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getBlackBgImg() {
		return this.blackBgImg;
	}

	private void setEnterShopBtnImg() {
		File path = new File(commonPath + "Entershop.png");
		try {
			enterShopImg = ImageIO.read(path).getScaledInstance(100, 30, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getEnterShopBtnImg() {
		return this.enterShopImg;
	}

	public void setEventImg02() {
		File path = new File(commonPath + "adventureType_2.png");
		try {
			eventImg02 = ImageIO.read(path).getScaledInstance(400, 250, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getEventImg02() {
		return eventImg02;
	}

	public void setEventImg03() {
		File path = new File(commonPath + "adventureType_3.png");
		try {
			eventImg03 = ImageIO.read(path).getScaledInstance(400, 250, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getEventImg03() {
		return eventImg03;
	}

	public void setEventImg04() {
		File path = new File(commonPath + "adventureType_4.png");
		try {
			eventImg04 = ImageIO.read(path).getScaledInstance(400, 250, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getEventImg04() {
		return eventImg04;
	}

	private void setLoginBgImg() {
		File path = new File(commonPath + "loginBG.png");
		try {
			loginBgImg = ImageIO.read(path).getScaledInstance(450, 800, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getLoginBgImg() {
		return this.loginBgImg;
	}
}
