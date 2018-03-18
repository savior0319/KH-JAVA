package kh.gbc.model.player;

import java.io.Serializable;

public class Member implements Serializable{
	
	private static final long serialVersionUID = 500L;
	private String id;
	private String pw;
	private double totalKg;
	
	public Member() { }
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return this.id+"/"+this.pw;
	}
	
	public double getTotalKg() {
		return totalKg;
	}
	public void setTotalKg(double totalKg) {
		this.totalKg = totalKg;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
