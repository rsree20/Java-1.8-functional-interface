package com.constructorreference;

public class TestConsRef {

	public static void main(String[] args) {
		Interf i = Sample :: new;
		Sample s1 = i.getSampleInstance(new StringBuffer("raju"));
		Sample s2 = i.getSampleInstance(new StringBuffer("ravi"));
	}
}
