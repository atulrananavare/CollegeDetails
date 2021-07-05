package com.sinhgad.edu.students.details;

public class Dept {
	int deptCode;
	String deptName;
	@Override
	public String toString() {
		return "Dept [deptCode=" + deptCode + ", deptName=" + deptName + "]";
	}
	public Dept(int deptCode, String deptName) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
	}
	
	
}
