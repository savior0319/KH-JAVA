package kh.gbc.controller;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

import kh.gbc.model.feed.Feed;
import kh.gbc.model.player.DataGroup;
import kh.gbc.model.player.GBCData;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;
import kh.gbc.view.LobbyView;

public class GBCController implements Runnable {
	private DataGroup dataGroup = DataGroup.getInstance();
	private GBCData gbcData = new GBCData();
	private ResourceRoad resRoad  = ResourceRoad.getInstance();
	private ViewModel vm =	ViewModel.getInstance();
	private LobbyView lv = null;
	private Point feedPoint = new Point();
	private static GBCController gbcController;
	private boolean moveChk = true;
	private Timer timer; 
	private Random r = new Random();
	
//	private int gbcLevel = 1;
//	private double totalWeight = 0;// ¼øÀ§¿ë ¸ö¹«°Ô.
//	private double gbcWeight = 0;
	private double currentWeight = 0;// ·¹º§¾÷¿¡ ÇÊ¿äÇÑ ¸ö¹«°Ô »« ÇöÀç ¸ö¹«°Ô°ª.
	private int[] needWeight = new int[] {20,50,300,1000};
	private double[] loseWeight = new double[] {0,10,20,30};
	private int[] growSizeW = new int[] {30,50,80,110};
	private int[] growSizeH = new int[] {30,45,75,105};
	private int[] moveSpeed = new int[] {5, 7, 9,14};
	private float[] growMultiple = new float[] {1.0f,1.09f,0.93f,0.96f}; 
	
	private Feed destFeed;
	private JLabel imageLabel;
	private Point dest = null;
	
	public static GBCController getInstance() {return gbcController;}
	
	public GBCController(LobbyView lv)
	{	
		this.lv = lv;
		this.gbcController = this;
		imageLabel = new JLabel();
		gbcData =  dataGroup.getMyGBCData();
		lv.initProgressValue((int)gbcData.getKg());
		sendCurrentWeight(0);
		applyWeight();
		setGBCState();
		
		lv.getGround().add(imageLabel);
	}
	
	private Image gbcImage = null;
	
	public boolean checkTargetting() {return destFeed==null;}
	public void setGBCState()
	{
		int basicSizeW = growSizeW[gbcData.getLevel()-1] + (int)(currentWeight * growMultiple[gbcData.getLevel()-1]);
		int basicSizeH = growSizeH[gbcData.getLevel()-1] + (int)(currentWeight * growMultiple[gbcData.getLevel()-1]);
		switch(gbcData.getLevel())
		{
			case 1: gbcImage = resRoad.getGcgLv1_Img(); break;
			case 2: gbcImage = resRoad.getGcgLv2_Img(); break;
			case 3: gbcImage = resRoad.getGcgLv3_Img(); break;
			case 4: gbcImage = resRoad.getGcgLv4_Img(); break;
		}
		imageLabel.setIcon(new ImageIcon(gbcImage.getScaledInstance(basicSizeW, basicSizeH, Image.SCALE_SMOOTH)));
		imageLabel.setSize(basicSizeW,basicSizeH);
		imageLabel.repaint();
	}
	
	private double applyWeight()
	{
		int minusWeight =0;
		int tempLevel = 1;
		for(int i = 0; i<needWeight.length;i++)
		{
			if(gbcData.getKg() > needWeight[i]) tempLevel+=1;
		}
		minusWeight += loseWeight[tempLevel-1];
		gbcData.setLevel(tempLevel);
		if(gbcData.getLevel() > 4) gbcData.setLevel( 4);
		return (currentWeight = gbcData.getKg() - minusWeight);
	}
	
	public void growSize()
	{
		gbcData.setKg(gbcData.getKg() + destFeed.getAddWeight());
		
		sendCurrentWeight((int)destFeed.getAddWeight());
		System.out.println("¸ö¹«°Ô " +  applyWeight());
		setGBCState();
		
		destFeed.eatFeed();
		destFeed = null;
		
		dataGroup.setMyGBCData(gbcData);
		dataGroup.saveGBCData();
	}
	
	public void sendCurrentWeight(int addData)
	{
		if(gbcData.getLevel()==1)   lv.updateProgress(0,needWeight[gbcData.getLevel()-1], addData);
		else lv.updateProgress(needWeight[gbcData.getLevel()-2],needWeight[gbcData.getLevel()-1], addData);
	}
	
	private int direcX = 0;
	private int direcY = 0;
	public void setDest(Feed feed)
	{
		destFeed = feed;
	}

	@Override
	public void run() {
		while(true) 
		{
			try {
				if(moveChk)
				{
					if(destFeed!=null) followObj();
					else
					{
						dest = new Point(r.nextInt(380),r.nextInt(300)+130);
						moveObj();
					}
					moveChk = false;
				}
				
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
	
	private Point direc = new Point(0,0);

	public void moveObj()
	{
		Point origin = imageLabel.getLocation();
		direc = new Point(dest.x - origin.x , dest.y - origin.y);
		
		if(direc.x>0) direcX = 1;
		else if(direc.x<0) direcX = -1;
		else direcX = 0;
		
		if(direc.y>0) direcY = 1;
		else if(direc.y < 0) direcY = -1;
		else direcY = 0;

		timer = new Timer(moveSpeed[gbcData.getLevel()-1], new ActionListener()
		{
			int xPos = 0;
			int yPos = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				if( (Math.abs( direc.x - xPos ) >= 1 ) ) xPos += direcX; 
				if( (Math.abs( direc.y - yPos ) >= 1 ) ) yPos += direcY;
				
				imageLabel.setLocation( new Point(origin.x + xPos, origin.y + yPos));

					if((Math.abs(direc.x - xPos) <= 1 ) && (Math.abs(direc.y - yPos) <= 1))
					{
						moveChk = true;
						timer.stop();
					}
				vm.getPanel(vm.getLobbyName()).repaint();
			}
		}); 
		timer.start();
	}
	
	public void followObj()
	{
		Point origin = imageLabel.getLocation();
		direc = new Point(destFeed.getPos().x - origin.x , destFeed.getPos().y - origin.y);
		
		if(direc.x>0) direcX = 1;
		else if(direc.x<0) direcX = -1;
		else direcX = 0;
		
		if(direc.y>0) direcY = 1;
		else if(direc.y < 0) direcY = -1;
		else direcY = 0;

		timer = new Timer(moveSpeed[gbcData.getLevel()-1] , new ActionListener()
		{
			int xPos = 0;
			int yPos = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				if( (Math.abs( direc.x - xPos ) >= 1 ) ) xPos += direcX; 
				if( (Math.abs( direc.y - yPos ) >= 1 ) ) yPos += direcY;
				
				imageLabel.setLocation( new Point(origin.x + xPos, origin.y + yPos));
			
				if(destFeed != null) 
				{
					if((Math.abs(imageLabel.getLocation().x - destFeed.getPos().x) <= 10 ) && (Math.abs(imageLabel.getLocation().y - destFeed.getPos().y) <= 10))//(Math.abs(direc.x - xPos) <= 1 ) && (Math.abs(direc.y - yPos) <= 1))
					{
						if(destFeed!=null) growSize();
						moveChk = true;
						timer.stop();
					}
				}
				vm.getPanel(vm.getLobbyName()).repaint();
			}
		}); 
		timer.start();
	}
}

