package kh.gbc.model.feed;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.Timer;

import kh.gbc.controller.LobbyController;
import kh.gbc.controller.FeedController;
import kh.gbc.controller.GBCController;
import kh.gbc.controller.UtilClass;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class Feed implements Runnable {
	private FeedController feedController;
	private ViewModel vm = ViewModel.getInstance();
	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private Point dest = null;
	private Random r = new Random();
	private JButton feedBtn = new JButton();
	private Timer timer;
	private int feedType;
	private double addWeight;
	private Feed feed;

	public Feed(JLabel ground, FeedController feedController) {
		feed = this;
		this.feedController = feedController;
		feedBtn.setVisible(true);
		applyFeedType(feedType);
		feedBtn.addActionListener(e -> {
			if (GBCController.getInstance().checkTargetting()) {
				GBCController.getInstance().setDest(feed);
				targetting = true;
			}
		});
		ground.add(feedBtn);
		dest = new Point(r.nextInt(380), r.nextInt(300) + 130);
		feedBtn.setLocation(dest);
	}

	public void refresh() {
		feedBtn.setVisible(true);
		chk = true;
		targetting = false;
	}

	public void hideFeed() {
		feedBtn.setVisible(false);
		feedController.removeFeed(this);
	}

	public double getAddWeight() {
		return addWeight;
	}

	public void eatFeed() {
		hideFeed();
		// System.out.println("¸ÔÇû´Ù. " + feedBtn.getLocation().x + " " +
		// feedBtn.getLocation().y);
	}

	public Point getPos() {
		return feedBtn.getLocation();
	}

	private void applyFeedType(int feedType) {
		switch (feedType) {
		case 0:
			feedBtn.setIcon(new ImageIcon(resRoad.getFeedImg()));
			feedBtn.setSize(30, 30);
			addWeight = 5;
			break;
		case 1:
			addWeight = 10;
			break;
		case 2:
			addWeight = 20;
			break;
		case 3:
			addWeight = 40;
			break;
		}
		feedBtn = vm.fitImageBtn(feedBtn);
	}

	public void setFeedType(int feedType) {
		this.feedType = feedType;
	}

	private boolean chk = true;
	private boolean targetting = false;

	@Override
	public void run() {
		while (true) {
			try {
				if (chk) {
					moveObj();
					chk = false;
				}
				Thread.sleep(r.nextInt(800) + 100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private int direcX = 0;
	private int direcY = 0;

	public void moveObj() {
		Point origin = feedBtn.getLocation();
		Point direc = new Point(dest.x - origin.x, dest.y - origin.y);

		if (direc.x > 0)
			direcX = 1;
		else if (direc.x < 0)
			direcX = -1;
		else
			direcX = 0;

		if (direc.y > 0)
			direcY = 1;
		else if (direc.y < 0)
			direcY = -1;
		else
			direcY = 0;

		timer = new Timer(10, new ActionListener() {
			int xPos = 0;
			int yPos = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!targetting) {
					if ((Math.abs(direc.x - xPos) >= 1))
						xPos += direcX; // direc.x/40;
					if ((Math.abs(direc.y - yPos) >= 1))
						yPos += direcY; // direc.y/40;

					feedBtn.setLocation(new Point(origin.x + xPos, origin.y + yPos));

					vm.getPanel(vm.getLobbyName()).repaint();

					if ((Math.abs(direc.x - xPos) <= 3) && (Math.abs(direc.y - yPos) <= 3)) {
						dest = new Point(r.nextInt(380), r.nextInt(300) + 130);
						chk = true;
						timer.stop();
					}
				}
			}
		});
		timer.start();
	}

}
