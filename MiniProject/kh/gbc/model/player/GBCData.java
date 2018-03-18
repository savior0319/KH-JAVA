package kh.gbc.model.player;

import java.io.Serializable;

public class GBCData implements Serializable {
	private static final long serialVersionUID = 82702935987L;
	private String id = "";
	private double totalKg = 0.0;
	private int level = 1;
	private int reBirth = 0;

	private double kg = 0.0;
	private int mp = 0;
	private boolean[] eventList = new boolean[] { true, false, false, false };
	private double[] eventRate = new double[] { 50.0, 40.0, 30.0, 20.0 };
	private boolean[] feedType = new boolean[] { true, false, false, false, false };

	private int totalFeedCount = 7;

	public int getReBirth() {
		return reBirth;
	}

	public void setReBirth(int reBirth) {
		this.reBirth = reBirth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getTotalKg() {
		return totalKg;
	}

	public void setTotalKg(double totalKg) {
		this.totalKg = totalKg;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public boolean[] getEventList() {
		return eventList;
	}

	public void setEventList(boolean[] eventList) {
		this.eventList = eventList;
	}

	public double[] getEventRate() {
		return eventRate;
	}

	public void setEventRate(double[] eventRate) {
		this.eventRate = eventRate;
	}

	public boolean[] getFeedType() {
		return feedType;
	}

	public void setFeedType(boolean[] feedType) {
		this.feedType = feedType;
	}

	public int getTotalFeedCount() {
		return totalFeedCount;
	}

	public void setTotalFeedCount(int totalFeedCount) {
		this.totalFeedCount = totalFeedCount;
	}

}
