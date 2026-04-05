package com.Skillio;

public class StringPrograms {
	public int toDigit(char ch) {
		return ch-48;
	}
	public static void main(String[] args) {
		String s = "H3119 5killi0";
		StringPrograms t = new StringPrograms();
		int result = 0;
		
		for (int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>=48 && ch<='9') {
				result = result+t.toDigit(ch);
				
			}
		}
		System.out.println("Additions: "+result);
	}

}
