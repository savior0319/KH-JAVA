package kh.java.model.vo;

public class Silver {
	private String name;
	private String grade;
	private int point;
	public Silver(String name, String grade, int point) {
		this.setName(name);
		this.setGrade(grade);
		this.setPoint(point);
	}
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setGrade(String grade) {this.grade = grade;}
	public String getGrade() {return grade;}
	public void setPoint(int point) {this.point = point;}
	public int getPoint() {return point;}
	public double getInterest() {return getPoint() * 0.02;}
}
