package test;

import java.util.*;

public class Exercise30 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println(numberComplement(input.nextInt()));
	}
	public static int numberComplement(int n) {
		String[] temp=Integer.toBinaryString(n).split("");
		for(int i=0;i<temp.length;i++) {
			if(temp[i].equals("1")) {
				temp[i]="0";
			}else {
				temp[i]="1";
			}
		}
		StringBuilder sb=new StringBuilder();
		for(String s:temp) {
			sb.append(s);
		}
		String[] target=sb.toString().split("");
		int result=0;
		for(int i=sb.length()-1;i>=0;i--) {
			result+=Integer.parseInt(target[i])*pow(2,i);
		}
		return result;
	}
	public static int pow(int m, int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result*=m;
		}
		return result;
	}
}
