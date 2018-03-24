package test;

import java.util.*;

public class Exercise6 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(testAbs(n));
	}
	public static int testAbs(int n) {
		if(n>=0)
			return n;
		else
			return -1*n;
	}
}
