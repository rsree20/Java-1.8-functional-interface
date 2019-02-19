package com.supplier;

import java.util.List;
import java.util.function.Supplier;

public class TestSupplierListString {

	public static void main(String[] args) {
		Supplier<List<String>> sup = new TestSupplierListStringImpl();
		List<String> courses = sup.get();
		System.out.println("Total available courses");
		for (String course : courses) {
			System.out.println(course);
		}
	}
}
