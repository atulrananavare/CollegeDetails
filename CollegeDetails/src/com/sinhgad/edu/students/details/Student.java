package com.sinhgad.edu.students.details;

public class Student {
	int studId;
	String studName;
	//String studAddress;	//"Pune,Swargate" --> String type so user can type anything here if you use string type
	Address studAddress; 	// Pune		Pune,KAtraj  Pune Swargate - Swargate PUne
	//Address studAddresss;	//city,state,pincode --> city state pincode
	
	Dept deptName;
	double studFees;
	
	
	public Student(int studId, String studName, Address studAddress, Dept deptName, double studFees) {

		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
		this.deptName = deptName;
		this.studFees = studFees;
	}


	@Override
	public String toString() {
		return "Student details : [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + ", deptName="
				+ deptName + ", studFees=" + studFees + "]";
	}
	
	
	
	
}
