package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicateName {

	public static void main(String[] args) {
		Predicate<String> p = s->s.length()%2==0;
		
		List<String> names = new ArrayList<>();
		names.add("Rakul Preet Singh");
		names.add("Prabhas");
		names.add("Vijay Devarakonda");
		names.add("Rashmi");
		names.add("Anasuya Barathwaj");
		
		for (String name : names) {
			if(p.test(name)) {
				System.out.println(name + " is even");
			} else {
				System.out.println(name + " is odd");
			}
		}
	}
}
