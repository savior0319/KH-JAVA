package com.exception.charcheck;

public class CharacterProcess {
	private String str;
	
	public CharacterProcess() {}
	
	public String countAlpha() throws CharCheckException {
		int count = 0;
		String strTemp = getStr();
		for (int i = 0; i < strTemp.length(); i++) {
			if ('a' <= strTemp.charAt(i) && strTemp.charAt(i) <= 'z' 
			|| 'A' <= strTemp.charAt(i) && strTemp.charAt(i) <= 'Z') {
				count++;
			} else if (strTemp.charAt(i) == '\u0020') {
				throw new CharCheckException("※ 공백을 포함 할 수 없습니다");
			}
		} return "※ 영문자의 개수 -> " + String.valueOf(count) + "개";
	}
	public String getStr() {return str;}
	public void setStr(String str) {this.str = str;}
}
