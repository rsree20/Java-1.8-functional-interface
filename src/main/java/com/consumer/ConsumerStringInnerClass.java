package com.consumer;

import java.util.function.Consumer;

public class ConsumerStringInnerClass {

	public static void main(String[] args) {
		Consumer<String> cons = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("The name is : " + t);
			}
		};
		
		cons.accept("Ravi");
		cons.accept("Raju");
	}
}
