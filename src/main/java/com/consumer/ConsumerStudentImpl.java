package com.consumer;

import java.util.function.Consumer;

public class ConsumerStudentImpl implements Consumer<Student> {

	@Override
	public void accept(Student t) {
		System.out.println("Student details for " + t.getName());
		System.out.println(t.getStdId());
		System.out.println(t.getCourse());
		System.out.println(t.getCollegeName());
	}

}
