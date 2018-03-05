package kh.java.member.controller;

import java.util.HashMap;

import kh.java.member.model.vo.Member;

public class MemberController {

	private HashMap<String, Member> hMap = new HashMap<String, Member>();

	public MemberController() {
	}

	public boolean memberJoin(Member m) {
		if (memberCheck(m.getUserId()) == true) {
			hMap.put(m.getUserId(), m);
			return true;
		} else {
			return false;
		}
	}

	public boolean memberCheck(String userId) {
		if (hMap.containsKey(userId) == true) {
			return false;
		} else {
			return true;
		}
	}

	public Member memberSelect(String userId) {
		return hMap.get(userId);
	}

	public boolean memberModify(Member m) {
		hMap.put(m.getUserId(), m);
		return false;
	}

	public boolean memberDelete(String userId) {
		hMap.remove(userId);
		return false;
	}

}
