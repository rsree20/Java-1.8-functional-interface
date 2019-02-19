package com.consumer;

import java.util.function.Consumer;

public class CosumerStringImpl implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println("The name is : " + t);
	}
}
