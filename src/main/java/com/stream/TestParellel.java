package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestParellel {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<=100000; i++) {
			list.add(i);
		}
		
		long startTime = System.currentTimeMillis();
		List<Integer> updatedList = list.stream().map(i->i+5).collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Processing time for stream : " + (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		updatedList = list.parallelStream().map(i->i+5).collect(Collectors.toList());
		endTime = System.currentTimeMillis();
		System.out.println("Processing time for parellel stream : " + (endTime-startTime));
	}
}
