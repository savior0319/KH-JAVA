package kh.java.member.model.vo;

public class Member {
	
	@Override
	public String toString() {
		return "\n���̵� : " + userId + "\n" + "��й�ȣ : " + userPwd + "\n" + "�̸� : " 
				+ userName + "\n" + "���� : " + age + "\n����ȣ : " + phoneNumber + "\n";
	}

	private String userId, userPwd, userName, phoneNumber;
	private int age;
	
	
	public Member() {}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
