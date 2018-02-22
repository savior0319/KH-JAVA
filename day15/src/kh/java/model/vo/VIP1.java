package kh.java.model.vo;

public class VIP1 extends Grade{
	public VIP1() {}
	public VIP1(String name, String grade, int point) 
	{super(name, grade, point);}
	@Override
	public double getInterest() {
		return getpoint() * 0.1;
	}
}
