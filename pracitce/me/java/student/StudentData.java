package me.java.student;


public class StudentData {
	
	private String name, addr;
	private int age;
	private double kor, math, eng, avg, sum;
	private char gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getKor() {
		return kor;
	}
	public void setKor(double kor) {
		this.kor = kor;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}


/*
 * System.out.println(stdCount + "번째 학생 정보"); System.out.println("이름 : " +
 * i.getName()); System.out.println("나이 : " + i.getAge() + "살");
 * System.out.println("주소 : " + i.getAddr()); System.out.println("성별 : " +
 * i.getGender()); System.out.println("국어 : " + String.format("%.0f",
 * i.getKor()) + "점"); System.out.println("수학 : " + String.format("%.0f",
 * i.getMath()) + "점"); System.out.println("영어 : " + String.format("%.0f",
 * i.getEng()) + "점"); System.out.println("합계 : " + String.format("%.0f",
 * i.getSum()) + "점"); System.out.println("평균 : " + String.format("%.2f",
 * i.getAvg()) + "점");
 */
