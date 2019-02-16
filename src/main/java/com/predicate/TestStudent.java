package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestStudent {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "Ravi", 37));
		list.add(new Student(101, "Rakul preet", 87));
		list.add(new Student(102, "Varshini", 30));
		list.add(new Student(103, "Vishnu priya", 56));
		list.add(new Student(104, "Rashmi", 20));
		list.add(new Student(105, "Anasuya", 56));
		
		Predicate<Student> p = s-> s.getMarks() >= 35;
		
		for (Student student : list) {
			if(p.test(student)) {
				System.out.println(student.getName() + " is pass");
			}
		}
		
	}
}
