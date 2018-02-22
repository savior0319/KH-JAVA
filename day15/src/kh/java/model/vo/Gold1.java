package kh.java.model.vo;

public class Gold1 extends Grade {
	public Gold1() {}
	public Gold1(String name, String grade, int point) 
	{super(name, grade, point);}
	@Override
	public double getInterest() {
		return getpoint() * 0.03;
	}
}
