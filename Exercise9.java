package test;

import java.util.*;

public class Exercise9 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		String s=input.nextLine();
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		if(0==s.length()) {
			return true;
		}
		else {
			char[] string=s.toCharArray();
			boolean flag=true;
			for(int i=0;i<string.length/2;i++) {
				if(string[i]!=string[string.length-i-1]) {
					flag=false;
					break;
				}
			}
			return flag;
		}
	}
}
