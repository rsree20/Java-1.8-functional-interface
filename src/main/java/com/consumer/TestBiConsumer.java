package com.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class TestBiConsumer {

	public static void main(String[] args) {
		Consumer<Integer> cons = i->System.out.println(i);
		BiConsumer<Integer, Double> biCons = (i,j)->System.out.println(i+j);
		
		IntConsumer intCons = i->System.out.println(i);
		
		
		intCons.accept(10);
		cons.accept(10);
		cons.accept(20);
		biCons.accept(10, 20.0);
	}
}
