package kh.java.model.vo;

public class Grade {
	private String name, grade;
	private int point;
	private double interest;
	public Grade() {}
	public Grade(String name, String grade, int point, double interest) 
	{this.grade = grade; this.name = name; this.point = point; this.interest = interest; }
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setGrade(String grade) {this.grade = grade;}
	public String getGrade() {return grade;}
	public void setPoint(int point) {this.point = point;}
	public int getpoint() {return point;}
	public double getInterest() {
		return interest;
	}
}
