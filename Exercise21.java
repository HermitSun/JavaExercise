package test;

import java.util.Scanner;

public class Exercise21 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int binary=input.nextInt();
		int result=0;
		String binaryLength=String.valueOf(binary);
		for(int i=0;i<binaryLength.length();i++) {
			result+=(binary%10)*pow(2,i);
			binary=binary/10;
		}
		System.out.println(result);
	}
	public static int pow(int m, int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result*=m;
		}
		return result;
	}
}
