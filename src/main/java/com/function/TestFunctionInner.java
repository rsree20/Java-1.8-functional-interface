package com.function;

import java.util.function.Function;

public class TestFunctionInner {

	public static void main(String[] args) {
		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		};
		
		System.out.println(f.apply(20));
		System.out.println(f.apply(36));
		System.out.println(f.apply(46));
	}
}
