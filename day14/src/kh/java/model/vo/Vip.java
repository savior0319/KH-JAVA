package kh.java.model.vo;

public class Vip {
	private String name;
	private String grade;
	private int point;
	public Vip(String name, String grade, int point) {
		this.setGrade(grade);
		this.setName(name);
		this.setPoint(point);
	}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setGrade(String grade) {this.grade = grade;}
	public String getGrade() {return grade;}
	public void setPoint(int point) {this.point = point;}
	public int getPoint() {return point;}
	public double getInterest() {return getPoint() * 0.05;}
}
