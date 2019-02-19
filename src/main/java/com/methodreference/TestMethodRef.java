package com.methodreference;

public class TestMethodRef {
	
	public static void main(String[] args) {
		Runnable r = Test :: childThreadWork;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread"+Thread.currentThread().getName());
		}
	}
}
