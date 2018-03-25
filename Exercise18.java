package test;

import java.util.*;

public class Exercise18 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n=input.nextInt();
		String s=Integer.toString(n);
		String s2=String.valueOf(n);
		System.out.println(s+" "+s2);
	}
}