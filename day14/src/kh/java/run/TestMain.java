package kh.java.run;

import kh.java.controller.StuMgr;
import kh.java.model.vo.Student;

public class TestMain {
	public static void main(String[] args) {
		StuMgr m = new StuMgr();
		m.insertStudent(new Student("ȫ�浿", 20, "��⵵"));
		m.insertStudent(new Student("�踻��", 30, "��û��"));
		m.insertStudent(new Student("��浿", 99, "������"));
		m.insertStudent(new Student("�浿ȫ", 11, "������"));
		m.insertStudent(new Student("����ȫ", 21, "������"));
		m.insertStudent(new Student("���赿", 31, "������"));
		m.insertStudent(new Student("���踻", 41, "������"));
		m.insertStudent(new Student("���", 51, "������"));
		m.insertStudent(new Student("�����", 61, "������"));

		m.viewAllStudent();
		m.deleteStudent("��浿");
		m.deleteStudent("ȫ�浿");
		m.viewAllStudent();
		
	}
}
