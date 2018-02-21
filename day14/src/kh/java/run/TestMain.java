package kh.java.run;

import kh.java.controller.StuMgr;
import kh.java.model.vo.Student;

public class TestMain {
	public static void main(String[] args) {
		StuMgr m = new StuMgr();
		m.insertStudent(new Student("홍길동", 20, "경기도"));
		m.insertStudent(new Student("김말동", 30, "충청도"));
		m.insertStudent(new Student("고길동", 99, "ㄱㄱ시"));
		m.insertStudent(new Student("길동홍", 11, "ㄴㄴ시"));
		m.insertStudent(new Student("동길홍", 21, "ㄷㄷ시"));
		m.insertStudent(new Student("말김동", 31, "ㄹㄹ시"));
		m.insertStudent(new Student("동김말", 41, "ㅂㅂ시"));
		m.insertStudent(new Student("길고동", 51, "ㅁㅁ시"));
		m.insertStudent(new Student("동길고", 61, "ㅅㅅ시"));

		m.viewAllStudent();
		m.deleteStudent("고길동");
		m.deleteStudent("홍길동");
		m.viewAllStudent();
		
	}
}
