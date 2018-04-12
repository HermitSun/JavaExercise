package test;

import java.util.*;

public class Exercise28_2 {
	
	static Map<Character,Integer> map=new HashMap<>();
	
	public static void main(String[] args) {
		char[] data=new char[] {'b','c','a','b','c'};
		System.out.println(singleCharacter(data));
	}
	public static char singleCharacter(char[] data) {
		for(int i=0;i<data.length;i++) {
			if(map.containsKey(data[i])) {
				map.put(data[i], map.get(data[i])+1);
			}
			else {
				map.put(data[i], 1);
			}
		}
		for(char c:map.keySet()) {
			if(map.get(c)==1) {
				return c;
			}
		}
		return '\0';
	}
}
