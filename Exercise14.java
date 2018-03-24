package test;

import java.util.*;

public class Exercise14 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		String a=input.nextLine();
		String b=input.nextLine();
		System.out.println(strcat(a,b));
	}
	public static String strcat(String a,String b) {
		return a+b;
	}
}
