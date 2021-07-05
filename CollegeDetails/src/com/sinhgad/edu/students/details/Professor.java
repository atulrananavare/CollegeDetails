package com.sinhgad.edu.students.details;

public class Professor {
	int profId;
	String profName;
	Address profAddress;
	Dept profDept;
	double profSalary;
	int profYearOfExp;
	static String collName1="Sinhgad collge"; // Common college name for all professors hardcoded way
	static College collName2=new College(12, "Sinhgad college", new Address("Pune", "MH", 411051)); 
	/*	1. Can we initialize this way for static property here??
		2. If I want to represent all properties(including profId to CollName1,2) all once in string 
		representation,as CollegeName is common property for all Professor,  how can be this done?
	*/
	
	@Override
	public String toString() {
		return "Professor [profId=" + profId + ", profName=" + profName + ", profAddress=" + profAddress + ", profDept="
				+ profDept + ", profSalary=" + profSalary + ", profYearOfExp=" + profYearOfExp + "]";
	}
	
	public Professor(int profId, String profName, Address profAddress, Dept profDept, double profSalary,
			int profYearOfExp) {
		super();
		this.profId = profId;
		this.profName = profName;
		this.profAddress = profAddress;
		this.profDept = profDept;
		this.profSalary = profSalary;
		this.profYearOfExp = profYearOfExp;
	}
	
	
	
	
}
