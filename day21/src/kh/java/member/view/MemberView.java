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
			System.out.println("���������������������� ȸ�� ���� ���α׷� ����������������������");
			System.out.println("1. ȸ������");
			System.out.println("2. ȸ�� ���Կ��� Ȯ��");
			System.out.println("3. ȸ�� ���� ����<1��>");
			System.out.println("4. ȸ�� ���� �����ϱ�");
			System.out.println("5. ȸ�� ���� �ϱ�");
			System.out.println("0. ���α׷� ����");
			System.out.println("����������������������������������������������������������������������");
			System.out.print("�޴����� >> ");
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
				System.out.println("\n�� �����մϴ�");
				return;
			default:
				System.out.println("\n�� �޴��� �߸� �Է��߽��ϴ�\n");
				break;
			}
		}
	}

	public void memberDelete() {
		String tempId;
		System.out.print("������ ���̵� �Է��ϼ��� : ");
		tempId = sc.next();
		if (mc.memberCheck(tempId) == false) {
			mc.memberDelete(tempId);
			System.out.println("\n��" + tempId + " ȸ���� ���� �Ϸ� �Ǿ����ϴ�!\n");
		} else
			System.out.println("\n�� ������ ȸ���� �����ϴ�!\n");
	}

	public void memberModify() {
		Member mb = new Member();
		String tempId;
		System.out.print("������ ���̵� �Է��ϼ��� : ");
		tempId = sc.next();
		if (mc.memberCheck(tempId) == false) {
			mb.setUserId(tempId);
			System.out.print("������ ��й�ȣ �Է� : ");
			mb.setUserPwd(sc.next());
			System.out.print("������ �̸� �Է� : ");
			mb.setUserName(sc.next());
			System.out.print("������ ���� �Է� : ");
			mb.setAge(sc.nextInt());
			System.out.print("������ ����ȣ �Է� : ");
			mb.setPhoneNumber(sc.next());
			mc.memberModify(mb);
			System.out.println("\n��" + tempId + " ȸ���� ���� �Ϸ� �Ǿ����ϴ�!\n");
		} else
			System.out.println("\n�� ������ ȸ���� �����ϴ�!\n");
	}

	public void memberSelect() {
		String tempId;
		System.out.print("ȸ�� ���̵� �Է��ϼ��� : ");
		tempId = sc.next();
		if (mc.memberCheck(tempId) == false) {
			System.out.println(mc.memberSelect(tempId));
		} else
			System.out.println("\n�� ��ȸ�� ȸ���� �����ϴ�!\n");
	}

	public void memberCheck() {
		String tempId;
		System.out.print("ȸ�� ���̵� �Է��ϼ��� : ");
		tempId = sc.next();
		if (mc.memberCheck(tempId) == false) {
			System.out.println("\n��  " + tempId + " ���̵�� �̹� �����ϴ� ȸ���Դϴ�");
			System.out.println("�ٸ����̵� ������ּ���!\n");
		} else
			System.out.println("\n��  " + tempId + " ���̵�� ��밡���մϴ�\n");
	}

	public void memberJoin() {
		Member mb = new Member();
		System.out.println("\n�������������� ȸ�� ���� �ϱ� ������������");
		System.out.print("ȸ�� ���̵� �Է� : ");
		mb.setUserId(sc.next());
		System.out.print("ȸ�� ��й�ȣ �Է� : ");
		mb.setUserPwd(sc.next());
		System.out.print("ȸ�� �̸� �Է� : ");
		mb.setUserName(sc.next());
		System.out.print("ȸ�� ���� �Է� : ");
		mb.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("ȸ�� ����ȣ �Է� : ");
		mb.setPhoneNumber(sc.next());

		if (mc.memberCheck(mb.getUserId()) == true) {
			mc.memberJoin(mb);
			System.out.println("\n �� ���Կ� �����߽��ϴ�\n");
		} else
			System.out.println("\n�� ���Կ� �����߽��ϴ�\n");

	}

}
