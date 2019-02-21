package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestMapMarks {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(35);
		list.add(20);
		list.add(55);
		list.add(21);
		list.add(10);
		list.add(5);
		list.add(46);
		
		List<Integer> oddList = list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(oddList);
		
		List<Integer> updatedList = list.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedList);
		
		long totalOddNumbers = list.stream().filter(i->i%2!=0).count();
		
		System.out.println("Total odd numbers : " + totalOddNumbers);
		
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted list is : " + sortedList);
		
		Comparator<Integer> c = (a,b)->-a.compareTo(b);
		List<Integer> revSortedList = list.stream().sorted(c).collect(Collectors.toList());
		System.out.println("Sort on comparator :  " + revSortedList);
		
		Comparator<Integer> ascendingComp = (a,b)->a.compareTo(b);
		
		int min = list.stream().min(ascendingComp).get();
		int minVal = list.stream().min(c).get();
		System.out.println("min value in descending order : " + minVal);
		
		int max = list.stream().max(ascendingComp).get();
		int maxVal = list.stream().max(c).get();
		System.out.println("max value in descending order : " + maxVal);
	}
}
