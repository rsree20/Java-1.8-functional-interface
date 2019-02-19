package com.function;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = num->num*2;
		Function<Integer, Integer> f2 = num->num*num;
		
		System.out.println(f1.apply(20));
		System.out.println(f2.apply(10));
		System.out.println(f1.andThen(f2).apply(30));
		System.out.println(f2.andThen(f1).apply(30));// or
		System.out.println(f1.compose(f2).apply(30));
	}
}
