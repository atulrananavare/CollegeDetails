package com.java.demo.college;

import java.util.Arrays;

public class Dept {
	private String deptCode;
	private String deptName;
	private int deptId;
	private Student []student;
	
	@Override
	public String toString() {
		return "\n\n\nDept [deptCode=" + deptCode + ", deptName=" + deptName + ", deptId=" + deptId + ", student="
				+ Arrays.toString(student) + "]";
	}
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}

	public Dept(String deptCode, String deptName, int deptId, Student[] student) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.deptId = deptId;
		this.student = student;
	}
	
	
	
	
	
	
}




/**


 int num[] = new int[5]; --> we are going to allocate --> 5 memory block -- each of--> 4 bytes
 
 
 String []values = new String[5]; ---> we are going to allocate 5 memory blocks and each block is capable to 
 hold --> memory location.



 int num1 = 10;
 int num2 = 10,20,30;
 int n1=10,n2=20,n3=30; ---> int type che 3 variable --> 3 locations
 
 
 int num[] = new int[5];		// 5*4 --> 20bytes
 int []num = new int[5];
 
 
 ekach location vr --> multiple values --
 String s1 = "ABC","PQR" --> error
 
 Wrappers  --> at max single
 Primitives -> at max single
 
 class Employee
     id
     nm
     age
     
 e1 = Employee(101,"AAA",20)
 
 Array --->
 	fixed in size
 	same of type data
 	indexing
 	advanced size shud be known
 	cannot grow/shrink at rutime.
 	primitive + nonprimitives

*/