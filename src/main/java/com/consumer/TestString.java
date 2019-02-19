package com.consumer;

import java.util.function.Consumer;

public class TestString {

	public static void main(String[] args) {
		Consumer<String> cons = new CosumerStringImpl();
		cons.accept("Ravi");
		cons.accept("Raju");
	}
}
