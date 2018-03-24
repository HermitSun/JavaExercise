package test;

import java.util.*;

public class Exercise7 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String number=input.nextLine();
		System.out.println(addDigits(number));
	}
	public static int addDigits(String number) {
		String[] numbers=number.split("");
		if(numbers.length==1) {
			return Integer.parseInt(numbers[0]);
		}
		int result=0;
		for(int i=0;i<numbers.length;i++) {
			result+=Integer.parseInt(numbers[i]);
		}
		return addDigits(String.valueOf(result));
	}
}
