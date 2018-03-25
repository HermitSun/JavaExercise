package test;

import java.util.*;

public class Exercise17 {
	public static void main(String[] args) {
		int[] numbers=new int[] {1,5,2,4,11,2,6,9,0};
		System.out.println(getMax(numbers));
	}
	public static int getMax(int[] numbers) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int x:numbers) {
			list.add(x);
		}
		Collections.sort(list);
		return list.get(list.size()-1);
	}
}
