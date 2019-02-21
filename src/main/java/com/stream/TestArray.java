package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class TestArray {

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
		
		Integer[] i = list.stream().toArray(Integer[]::new);
	}
}
