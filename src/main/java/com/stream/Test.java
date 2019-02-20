package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(35);
		list.add(20);
		list.add(55);
		list.add(21);
		list.add(10);
		list.add(5);
		list.add(46);
		
		/*List<Integer> evenNumList = new ArrayList<>();
		for (Integer i : list) {
			if(i%2!=0) {
				evenNumList.add(i);
			}
		}*/
		
//		Predicate<Integer> p = i->i%2!=0;
		List<Integer> evenNumList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println("Even numbers from list are : " + evenNumList);
		System.out.println(list);
	}
}
