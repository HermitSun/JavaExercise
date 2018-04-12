package test;

import java.util.Scanner;

public class Exercise20 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n=input.nextInt();
		long start=System.currentTimeMillis();
		int result=fibFactorial(n);
		long end=System.currentTimeMillis();
		System.out.println(result+" "+(end-start)+"ms");
		start=System.currentTimeMillis();
		result=fibLoop(n);
		end=System.currentTimeMillis();
		System.out.println(result+" "+(end-start)+"ms");
	}
	public static int fibFactorial(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fibFactorial(n-1)+fibFactorial(n-2);
		}
	}
	public static int fibLoop(int n) {
		int a=0;
		int b=1;
		int c=0;
		if(n==0) {
			return a;
		}else if(n==1) {
			return b;
		}else {
			while((n-2)>=0) {
				c=a+b;
				a=b;
				b=c;
				n--;
			}
			return c;
		}
	}
}
