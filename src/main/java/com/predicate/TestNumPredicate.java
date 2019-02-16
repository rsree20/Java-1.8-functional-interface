package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestNumPredicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(35);
		list.add(56);
		list.add(45);
		list.add(70);
		list.add(77);
		
		Predicate<Integer> p1 = i->i%2==0 && i>50;
		
//		Predicate<Integer> p2 = i->i>50;
		
		for (Integer num : list) {
			if(p1.test(num)) {
				System.out.println(num + " is greterthan 50");
			}
		}
		
	}
}
