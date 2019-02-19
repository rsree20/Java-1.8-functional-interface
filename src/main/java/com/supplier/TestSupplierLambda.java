package com.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestSupplierLambda {

	public static void main(String[] args) {
		Supplier<List<String>> sup = ()->{
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
		};
		
		List<String> courses = sup.get();
		System.out.println("Total available courses are");
		
//		courses.forEach(System.out::println);
		
		for (String course : courses) {
			System.out.println(course);
		}
	}
}
