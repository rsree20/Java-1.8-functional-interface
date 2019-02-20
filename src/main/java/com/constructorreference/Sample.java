package com.constructorreference;

public class Sample {

	public Sample() {
		System.out.println("No arg cons from sample");
	}
	
	public Sample(int a) {
		System.out.println("Helo Sample obj created!!" + a);
	}
	
	public Sample(StringBuffer s) {
		System.out.println("StringBuffer cons " + s);
	}
}
