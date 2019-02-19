package com.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestSupplierInnerClass {

	public static void main(String[] args) {
		Supplier<List<String>> sup = new Supplier<List<String>>() {
			@Override
			public List<String> get() {
				List<String> courses = new ArrayList<>();
				courses.add("MCA");
				courses.add("MBA");
				courses.add("Mech");
				courses.add("ECE");
				courses.add("EEE");
				courses.add("CSE");
				courses.add("Civil");
				courses.add("IT");
				return courses;
			}
		};
		
		List<String> courses = sup.get();
		System.out.println("Total available courses");
		for (String course : courses) {
			System.out.println(course);
		}
	}
}
