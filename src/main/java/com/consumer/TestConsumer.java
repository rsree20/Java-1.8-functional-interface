package com.consumer;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		Consumer<String> cons1 = name->System.out.println("Name is " + name.length() + " characters");
		
		Consumer<String> cons2 = name->System.out.println("You are : " + name);
		
		Consumer<String> cons3 = name->System.out.println("You are name in upper case : " + name.toUpperCase());
		
//		cons1.accept("Ranga Murugashetty");
//		cons2.accept("Ranga Murugashetty");
		cons1.andThen(cons2).andThen(cons3).accept("Ranga Murugashetty");
	}
}
