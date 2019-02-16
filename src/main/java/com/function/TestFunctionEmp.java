package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunctionEmp {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(100, "Rashmi", 30000));
		list.add(new Employee(101, "Varshini", 20000));
		list.add(new Employee(102, "Anasuya", 50000));
		list.add(new Employee(103, "Vishnu Priya", 40000));
		list.add(new Employee(104, "Sudheer", 35000));
		list.add(new Employee(105, "Sree Mukhi", 25000));
		
		Function<Employee, Double> f = e->{
			if(e.getSal() > 30000)
			 return (e.getSal()*0.08)+e.getSal();
			else
				return (e.getSal()*0.12)+e.getSal();
		};

		for (Employee employee : list) {
			System.out.println(employee.getName() + " updated salary is : " + f.apply(employee));
		}
		
	}
}
