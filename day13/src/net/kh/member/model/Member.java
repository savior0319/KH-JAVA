package net.kh.member.model;

public class Member {
	private String memberId, memberPwd, memberName, phone, email;
	private int age;
	private char gender;

	public void setMeberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getGender() {
		return gender;
	}
}
