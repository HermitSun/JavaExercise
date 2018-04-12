package test;

import java.util.*;

public class Exercise28 {
	
	static Map<Integer,Character> map=new HashMap<>();
	
	public static void main(String[] args) {
		char[] data=new char[] {};
		System.out.println(new Exercise28().singleCharacter(data));
	}
	public char singleCharacter(char[] data) {
		for(int i=0;i<data.length;i++) {
			map.put(i,data[i]);
		}
		for(int i=0;i<data.length;i++) {
			if(fromValueGetKey(data[i]).size()==1) {
				return data[i];
			}
		}
		return '\0';
	}
	public static ArrayList<Integer> fromValueGetKey(char value) {
		Set set = map.entrySet();
		Iterator it=set.iterator();
        ArrayList<Integer> arr = new ArrayList<>();  
        while (it.hasNext()) {  
            Map.Entry entry = (Map.Entry) it.next();  
            if (entry.getValue().equals(value)) {  
                int s = (int) entry.getKey();  
                arr.add(s);
            }  
        }  
        return arr;  
    } 
}
