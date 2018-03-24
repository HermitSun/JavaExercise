package test;

import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int[] numbers=new int[10];
		Random r=new Random();
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=r.nextInt(100);
		}
		System.out.println(test(numbers));
	}
	public static boolean test(int[] numbers) {
		ArrayList<Integer> list=new ArrayList<>();
		boolean flag=true;
		for(int i=0;i<numbers.length;i++) {
			if(list.contains(numbers[i])) {
				flag=false;
				break;
			}
			list.add(numbers[i]);
		}
		return flag;
	}
}
