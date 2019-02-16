package com.prac;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		int marks = 6;
		Predicate<Integer> col = new College();
		boolean result = col.test(marks);
		
		if(result) {
			System.out.println("Student pass");
		} else {
			System.out.println("Fail");
		}
	}
}
