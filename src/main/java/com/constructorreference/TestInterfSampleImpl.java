package com.constructorreference;

public class TestInterfSampleImpl implements Interf {

	@Override
	public Sample getSampleInstance(StringBuffer s) {
		Sample samp = new Sample();
		return samp;
	}
}
