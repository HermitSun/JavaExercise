package test;

import java.util.*;

public class Exercise {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n=input.nextInt();
		int[] judge=new int[n];
		ArrayList<Integer> numbers=new ArrayList<>();
		ArrayList<Integer> result=new ArrayList<>();
		for(int i=0;i<n;i++) {
			numbers.add((int)(Math.random()*n)+1);
			judge[i]=i+1;
		}
		for(int x:judge) {
			if(!numbers.contains(x)){
				if(!result.contains(x)) {
					result.add(x);
				}
			}
		}
		Collections.sort(result);
		for(int i=0;i<result.size();i++) {
			if(i!=result.size()-1) {
				System.out.print(result.get(i)+",");
			}
			else {
				System.out.println(result.get(i));
			}
		}
	}
}
