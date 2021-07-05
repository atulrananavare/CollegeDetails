package com.sinhgad.edu.students.details;

public class Courses {
	int courseId;
	String courseName;
	
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
	public Courses(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	
}
