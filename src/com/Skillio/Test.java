package com.Skillio;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check for palindrome");
		String s = sc.next();//nextLine
	    
		String rev = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println(s+" is a Palindrome ");
		}else {
			System.out.println(s+" is not Palindrome");
		}
		
	}

}

