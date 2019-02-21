package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.web.servlet.ModelAndView;

public class TestFor {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(35);
		list.add(20);
		list.add(55);
		list.add(21);
		list.add(10);
		list.add(5);
		list.add(46);
		
//		Consumer<Integer> cons = i->System.out.println(i);
//		Consumer<Integer> cons = System.out::println;
//		list.stream().forEach(System.out::println);

		list.forEach(System.out::println);
	}
	
	public static void print(int i) {
		System.out.println(i);
	}
}
