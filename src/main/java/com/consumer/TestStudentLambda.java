package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestStudentLambda {

	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<>();
		stdList.add(new Student(100, "Dhoni", "Aurora", "Sports"));
		stdList.add(new Student(101, "Sakshi", "Aurora", "MCA"));
		stdList.add(new Student(102, "Kohli", "Aurora", "MBA"));
		stdList.add(new Student(103, "Anushka", "Aurora", "MCA"));
		stdList.add(new Student(104, "Rohit", "Aurora", "MCA"));
		stdList.add(new Student(105, "Ritika", "Aurora", "MBA"));

		Consumer<Student> cons = std -> {
			System.out.println("Student details for " + std.getName());
			System.out.println(std.getStdId());
			System.out.println(std.getCourse());
			System.out.println(std.getCollegeName());
		};

		/*
		 * List<Student> mcaStdList =
		 * stdList.stream().filter(std->std.getCourse().equals("MCA")).collect(
		 * Collectors.toList()); mcaStdList.forEach(cons);
		 */
		for (Student std : stdList) {
			cons.accept(std);
		}
	}
}
