package kh.java.member.model.vo;

public class Member {
	
	@Override
	public String toString() {
		return "\n아이디 : " + userId + "\n" + "비밀번호 : " + userPwd + "\n" + "이름 : " 
				+ userName + "\n" + "나이 : " + age + "\n폰번호 : " + phoneNumber + "\n";
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
