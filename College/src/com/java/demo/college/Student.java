package com.java.demo.college;

public class Student {
	
	
	//instance variables
	private int studId;		//small + camelcase
	private String studName;
	private double studFees;
	private Address studAddress;
	private Dept studDept;
	private int phyMarks;
	private int chemMarks;
	private int mathMarks;
	
	@Override
	public String toString() {
		return "\nStudent [studId=" + studId + ", studName=" + studName + ", studFees=" + studFees + ", studAddress="
				+ studAddress + ", studDept=" + studDept.getDeptName() + ", phyMarks=" + phyMarks + ", chemMarks=" + chemMarks
				+ ", mathMarks=" + mathMarks + "]";
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getStudFees() {
		return studFees;
	}
	public void setStudFees(double studFees) {
		this.studFees = studFees;
	}
	public Address getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(Address studAddress) {
		this.studAddress = studAddress;
	}
	public Dept getStudDept() {
		return studDept;
	}
	public void setStudDept(Dept studDept) {
		this.studDept = studDept;
	}
	public int getPhyMarks() {
		return phyMarks;
	}
	public void setPhyMarks(int phyMarks) {
		this.phyMarks = phyMarks;
	}
	public int getChemMarks() {
		return chemMarks;
	}
	public void setChemMarks(int chemMarks) {
		this.chemMarks = chemMarks;
	}
	public int getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int studId, String studName, double studFees, Address studAddress, Dept studDept, int phyMarks,
			int chemMarks, int mathMarks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studFees = studFees;
		this.studAddress = studAddress;
		this.studDept = studDept;
		this.phyMarks = phyMarks;
		this.chemMarks = chemMarks;
		this.mathMarks = mathMarks;
	}
	
	// constructors --> no-arg,param
	// tostring -->
	// getter/setters
	
	
	
	// why 2 constructors
		
}
