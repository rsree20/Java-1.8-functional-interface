package com.constructorreference;

public class TestInterfSample {

	public static void main(String[] args) {
		Interf i = new TestInterfSampleImpl();
		Sample s = i.getSampleInstance(new StringBuffer());
		System.out.println("Done");
	}
}
