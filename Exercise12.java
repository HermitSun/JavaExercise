package test;

import java.util.*;

public class Exercise12 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=a+b;
		System.out.printf("加数：%d 被加数：%d 和：%d",a,b,c);
	}
}
