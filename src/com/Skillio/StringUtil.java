package com.Skillio;

public class StringUtil {
	public int toDigit(char ch) {
		return ch-48;
	}
	
	public int addDigitsFromString(String s) {
		
		Test1 t = new Test1();
		int result = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch)) {
				result = result+toDigit(ch);			
			}
		}
		return result;
	}

}
