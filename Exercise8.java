package test;

import java.util.*;

public class Exercise8 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(reverseDigit(n));
	}
	
	public static int reverseDigit(int n) {
		if(n<0) {
			n=-1*n;
			String digit=new StringBuffer(String.valueOf(n)).reverse().toString();
			return -1*Integer.parseInt(digit);
		}
		String digit=new StringBuffer(String.valueOf(n)).reverse().toString();
		return Integer.parseInt(digit);
	}
}
