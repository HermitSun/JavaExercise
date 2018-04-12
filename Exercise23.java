package test;

import java.util.Scanner;

/**
 * @author Wen Sun
 * 判断一个整数是否是2的次幂
 * Using factorial
 */
public class Exercise23 {
	
	private static Scanner input;
	static int count=0;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println(isPowerOfTwo(input.nextInt()));
	}
	public static boolean isPowerOfTwo(double n) {
		if(n==0) {
			return false;
		}
		else if(n==1) {
			if(count!=0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			count++;
			return isPowerOfTwo(n/2);
		}
	}
}
