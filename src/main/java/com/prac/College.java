package com.prac;

import java.util.function.Predicate;

public class College implements Predicate<Integer> {

	public boolean test(Integer t) {
		if(t>=35) {
			return true;
		}
		return false;
	}
}
