package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		List<Employee> empList = prepareEmpSuplier().get();
		// 1.7 old logic
		/*
		 * for (Employee employee : empList) { employee.setSal(employee.getSal()+2000);
		 * }
		 */
		// 1.8 new logic for new people
		Function<Employee, Employee> f = (emp) -> {
			emp.setSal(emp.getSal() + 2000);
			return emp;
		};
		empList = empList.stream().map(f).collect(Collectors.toList());

		System.out.println(empList);
	}

	private static Supplier<List<Employee>> prepareEmpSuplier() {
		Supplier<List<Employee>> empSup = () -> {
			Employee e1 = new Employee(100, "Rakul", 40000, "Jda");
			Employee e2 = new Employee(101, "Kajal", 50000, "Cts");
			Employee e3 = new Employee(102, "Samantha", 45000, "Jda");
			Employee e4 = new Employee(103, "Nithyaminon", 47000, "Jda");
			Employee e5 = new Employee(104, "Shanvi", 28000, "Jda");
			Employee e6 = new Employee(105, "Sai pallavi", 67000, "Cts");
			Employee e7 = new Employee(106, "Prabhas", 38000, "Cts");
			Employee e8 = new Employee(107, "Vijay Dhevarakonda", 48000, "Tcs");
			Employee e9 = new Employee(107, "Pavan kalyan", 80000, "Tcs");
			Employee e10 = new Employee(107, "Mahesh Babu", 80000, "Tcs");

			List<Employee> empList = new ArrayList<>();
			empList.add(e1);
			empList.add(e2);
			empList.add(e3);
			empList.add(e4);
			empList.add(e5);
			empList.add(e6);
			empList.add(e7);
			empList.add(e8);
			empList.add(e9);
			empList.add(e10);
			return empList;
		};

		return empSup;
	}
}
