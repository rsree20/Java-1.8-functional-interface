package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumerStudent {

	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<>();
		stdList.add(new Student(100, "Dhoni", "Aurora", "Sports"));
		stdList.add(new Student(101, "Sakshi", "Aurora", "MCA"));
		stdList.add(new Student(102, "Kohli", "Aurora", "MBA"));
		stdList.add(new Student(103, "Anushka", "Aurora", "MCA"));
		stdList.add(new Student(104, "Rohit", "Aurora", "MCA"));
		stdList.add(new Student(105, "Ritika", "Aurora", "MBA"));
		
		Consumer<Student> cons  = new ConsumerStudentImpl();
		for (Student student : stdList) {
			cons.accept(student);			
		}
	}
}
