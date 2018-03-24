package test;

import java.util.*;

public class Exercise3 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double r=input.nextDouble();
		double area=Math.PI*r*r;
		System.out.println(area);
	}
}
