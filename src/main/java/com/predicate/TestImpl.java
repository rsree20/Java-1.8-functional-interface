package com.predicate;

import java.util.function.Predicate;

public class TestImpl {

	public static void main(String[] args) {
		Predicate<Integer> p = new PredicateImpl();
		System.out.println(p.test(5));
		System.out.println(p.test(4));
	}
}
