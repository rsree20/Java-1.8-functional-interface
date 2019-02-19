package com.methodreference;

public class TestMethodRef2 {

	public static void main(String[] args) {
		Test te = new Test();
		Runnable r = te::test;
		Thread t = new Thread(r);
		t.start();
		for(int i =0;i<10;i++) {
			System.out.println("parent");
		}
		
	}
}
