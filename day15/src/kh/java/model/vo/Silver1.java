package kh.java.model.vo;

public class Silver1 extends Grade {
	public Silver1() {}
	public Silver1(String name, String grade, int point) 
	{super(name, grade, point);}
	@Override
	public double getInterest() {
		return getpoint() * 0.02;
	}
}
