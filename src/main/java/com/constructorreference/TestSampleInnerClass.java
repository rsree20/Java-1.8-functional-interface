package com.constructorreference;

public class TestSampleInnerClass {

	public static void main(String[] args) {
		Interf i = new Interf() {
			
			@Override
			public Sample getSampleInstance(StringBuffer s) {
				return new Sample();
			}
		};
		
		Sample s = i.getSampleInstance();
	}
}
