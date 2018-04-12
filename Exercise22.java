package test;

import java.util.Scanner;

public class Exercise22 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println(Integer.parseInt(
				new StringBuilder(String.valueOf(input.nextInt())).reverse().toString()));
	}
}
