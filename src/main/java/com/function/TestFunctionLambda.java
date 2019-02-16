package com.function;

import java.util.function.Function;

public class TestFunctionLambda {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = a->a*a;
		
		System.out.println(f.apply(20));
		System.out.println(f.apply(36));
		System.out.println(f.apply(46));
	}
}
