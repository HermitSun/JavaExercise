package test;

import java.util.*;

public class Exercise34 {
	
	private static Scanner input;
	static Map<String,Integer> map=new HashMap<>();
	
	public static void main(String[] args) {
		initMap();
		input = new Scanner(System.in);
		String[] data=input.nextLine().split("");
		for(int i=0;i<data.length;i++) {
			data[i]=data[i].toUpperCase();
		}
		for(int i=0;i<data.length;i++) {
			if(i!=data.length-1) {
				System.out.print(map.get(data[i])+",");
			}else {
				System.out.println(map.get(data[i]));
			}
		}
	}
	public static void initMap() {
		map.put("A",2);
		map.put("B",2);
		map.put("C",2);
		map.put("D",3);
		map.put("E",3);
		map.put("F",3);
		map.put("G",4);
		map.put("H",4);
		map.put("I",4);
		map.put("J",5);
		map.put("K",5);
		map.put("L",5);
		map.put("M",6);
		map.put("N",6);
		map.put("O",6);
		map.put("P",7);
		map.put("Q",7);
		map.put("R",7);
		map.put("S",7);
		map.put("T",8);
		map.put("U",8);
		map.put("V",8);
		map.put("W",9);
		map.put("X",9);
		map.put("Y",9);
		map.put("Z",9);
	}
}
