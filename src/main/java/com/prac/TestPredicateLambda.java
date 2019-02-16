package com.prac;

import java.util.function.Predicate;

public class TestPredicateLambda {

	public static void main(String[] args) {
		
		Predicate<Integer> p = (i)->{
			if(i>=35) return true;
			return false;
		};
		
		System.out.println(p.test(60));
	}
}
