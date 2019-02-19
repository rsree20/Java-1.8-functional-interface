package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestStringLambda {

	public static void main(String[] args) {
		Consumer<String> cons = name->System.out.println("The name is : " + name);
		
		List<String> list = new ArrayList<>();
		list.add("Rakesh");
		list.add("Ravi teja");
		list.add("Naga chaithanya");
		list.add("Dhoni");
		list.add("Kohli");
		
		for (String name : list) {
			cons.accept(name);
		}
		/*list.forEach(cons);*/
	}
}
