package kh.java.model.vo;

public class VVIP extends Grade{
	public VVIP() {}
	public VVIP(String name, String grade, int point) 
	{super(name, grade, point);}
	@Override
	public double getInterest() {
		return getpoint() * 0.2
				;
	}
}
