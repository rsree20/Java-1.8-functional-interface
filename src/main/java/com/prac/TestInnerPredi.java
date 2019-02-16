package com.prac;

import java.util.function.Predicate;

public class TestInnerPredi {

	public static void main(String[] args) {
		Predicate<Integer> p = new Predicate<Integer>() {
			public boolean test(Integer t) {
				if(t>=35) {
					return true;
				}
				return false;
			}
		};
		
		int marks = 60;
		System.out.println(p.test(marks));
	}
}
