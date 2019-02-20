package com.stream;

public class Employee {

	private int empId;
	private String name;
	private double sal;
	private String company;

	public Employee(int empId, String name, double sal, String company) {
		this.empId = empId;
		this.name = name;
		this.sal = sal;
		this.company = company;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return this.name + "--" + this.company + "--" + this.sal;
	}
}
