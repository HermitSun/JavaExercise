package test;

import java.util.*;

public class Exercise33 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n=input.nextInt();
		squareBoard(n);
	}
	public static void squareBoard(int n) {
		if(n<=0) {
			return;
		}else {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
	}
}
