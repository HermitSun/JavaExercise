package test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test9 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		CopyOnWriteArrayList<Integer> list1=new CopyOnWriteArrayList<>();
		ArrayList<Integer> list_copy=new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			list.add(i);
			list1.add(i);
			list_copy.add(i);
		}
		
		/*
		for(int i:list) {
			list.remove(i);
			System.out.println(list);
		}
		*/
		//throw ConcurrentModificationException
		 
		/*
		for(int i=0;i<list.size();i++) {
			list.remove(i);
			System.out.println(list);
		}
		*/
		//unexpected result
		
		/*
		for(int i=0;i<list.size();i++) {
			list.remove(i);
			System.out.println(list);
			i--;
		}
		*/
		//correct
		
		/*
		for(int i=0;i<list_copy.size();i++) {
			list.remove(list_copy.get(i));
			System.out.println(list);
		}
		*/
		//correct
		
		/*
		Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            iterator.remove();
            System.out.println(list);
        }
        */
		//correct
		
		Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            list1.remove(integer);
            System.out.println(list1);
        }

		//correct,也适用于多线程
		//              ^^^

		
	}
}
