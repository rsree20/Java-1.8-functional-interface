package com.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestSupplierListStringImpl implements Supplier<List<String>> {

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

	
}
