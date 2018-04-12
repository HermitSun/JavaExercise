package test;

import java.util.*;

public class Exercise25 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String s1=input.nextLine();
		String s2=input.nextLine();
		System.out.println(stringAddition(s1,s2));
	}
	public static String stringAddition(String s1,String s2) {
		return String.valueOf(Integer.parseInt(s1)+Integer.parseInt(s2));
	}
}
