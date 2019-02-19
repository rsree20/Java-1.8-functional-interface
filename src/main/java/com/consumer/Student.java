package com.consumer;

/**
 * 
 * @author SREE
 *
 */
public class Student {

	private int stdId;
	private String name;
	private String collegeName;
	private String course;
	
	Student(int stdId, String name, String collegeName, String  course) {
		this.stdId = stdId;
		this.name = name;
		this.collegeName = collegeName;
		this.course = course;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
