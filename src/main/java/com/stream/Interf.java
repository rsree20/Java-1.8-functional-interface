package com.stream;

@FunctionalInterface
public interface Interf {

	public void m1();

	boolean equals(Object obj);
	
	default void m2() {
		
	}
	
	int hashCode();
}
