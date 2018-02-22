package kh.java.model.vo;

public class Bronze extends Grade{
	public Bronze() {}
	public Bronze(String name, String grade, int point) 
	{super(name, grade, point);}
	@Override
	public double getInterest() {
		return getpoint() * 0.01;
	}
}

