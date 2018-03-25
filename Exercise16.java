package test;

import java.util.*;

public class Exercise16 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				list.add(i);
			}
		}
		for(int i=0;i<list.size();i++) {
			if(i==list.size()-1) {
				System.out.print(list.get(i));
			}
			else {
				System.out.print(list.get(i)+",");
			}
		}
	}
}
