package com.methodreference;

public class Test {

	public static void childThreadWork() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread" + Thread.currentThread().getName());
		}
	}
	
	public void test() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Testing this method");
		}
	}
}
