package test;

import java.util.*;

public class Exercise4 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		String s=input.nextLine();
		System.out.println(test(s));
	}
	public static int test(String s) {
		if(0==s.length()) {
			return 0;
		}
		else {
			String[] words=s.split(" ");
			return words[words.length-1].length();
		}
	}
}
