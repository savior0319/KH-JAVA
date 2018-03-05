package kh.java.member.view;

import java.util.Scanner;

import kh.java.member.controller.MemberController;
import kh.java.member.model.vo.Member;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberView() {
	}

	public void mainMenu() {
		while (true) {
			System.out.println("─────────── 회원 관리 프로그램 ───────────");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원 가입여부 확인");
			System.out.println("3. 회원 정보 보기<1명>");
			System.out.println("4. 회원 정보 변경하기");
			System.out.println("5. 회원 삭제 하기");
			System.out.println("0. 프로그램 종료");
			System.out.println("───────────────────────────────────");
			System.out.print("메뉴선택 >> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				memberJoin();
				break;
			case 2:
				memberCheck();
				break;
			case 3:
				memberSelect();
				break;
			case 4:
				memberModify();
				break;
			case 5:
				memberDelete();
				break;
			case 0:
				System.out.println("\n※ 종료합니다");
				return;
			default:
				System.out.println("\n※ 메뉴를 잘못 입력했습니다\n");
				break;
			}
		}
	}

	public void memberDelete() {
		String tempId;
		System.out.print("삭제할 아이디를 입력하세요 : ");
		tempId = sc.next();
		if (mc.memberCheck(tempId) == false) {
			mc.memberDelete(tempId);
			System.out.println("\n※" + tempId + " 회원이 삭제 완료 되었습니다!\n");
		} else
			System.out.println("\n※ 삭제할 회원이 없습니다!\n");
	}

	public void memberModify() {
		Member mb = new Member();
		String tempId;
		System.out.print("수정할 아이디를 입력하세요 : ");
		tempId = sc.next();
		if (mc.memberCheck(tempId) == false) {
			mb.setUserId(tempId);
			System.out.print("수정할 비밀번호 입력 : ");
			mb.setUserPwd(sc.next());
			System.out.print("수정할 이름 입력 : ");
			mb.setUserName(sc.next());
			System.out.print("수정할 나이 입력 : ");
			mb.setAge(sc.nextInt());
			System.out.print("수정할 폰번호 입력 : ");
			mb.setPhoneNumber(sc.next());
			mc.memberModify(mb);
			System.out.println("\n※" + tempId + " 회원이 수정 완료 되었습니다!\n");
		} else
			System.out.println("\n※ 수정할 회원이 없습니다!\n");
	}

	public void memberSelect() {
		String tempId;
		System.out.print("회원 아이디를 입력하세요 : ");
		tempId = sc.next();
		if (mc.memberCheck(tempId) == false) {
			System.out.println(mc.memberSelect(tempId));
		} else
			System.out.println("\n※ 조회한 회원이 없습니다!\n");
	}

	public void memberCheck() {
		String tempId;
		System.out.print("회원 아이디를 입력하세요 : ");
		tempId = sc.next();
		if (mc.memberCheck(tempId) == false) {
			System.out.println("\n※  " + tempId + " 아이디는 이미 존재하는 회원입니다");
			System.out.println("다른아이디를 사용해주세요!\n");
		} else
			System.out.println("\n※  " + tempId + " 아이디는 사용가능합니다\n");
	}

	public void memberJoin() {
		Member mb = new Member();
		System.out.println("\n─────── 회원 가입 하기 ──────");
		System.out.print("회원 아이디 입력 : ");
		mb.setUserId(sc.next());
		System.out.print("회원 비밀번호 입력 : ");
		mb.setUserPwd(sc.next());
		System.out.print("회원 이름 입력 : ");
		mb.setUserName(sc.next());
		System.out.print("회원 나이 입력 : ");
		mb.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("회원 폰번호 입력 : ");
		mb.setPhoneNumber(sc.next());

		if (mc.memberCheck(mb.getUserId()) == true) {
			mc.memberJoin(mb);
			System.out.println("\n ※ 가입에 성공했습니다\n");
		} else
			System.out.println("\n※ 가입에 실패했습니다\n");

	}

}
