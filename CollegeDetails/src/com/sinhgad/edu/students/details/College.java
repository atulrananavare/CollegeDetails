package com.sinhgad.edu.students.details;

public class College {
	int collRegId;
	String collName;
	Address collegeAddress;
	
	@Override
	public String toString() {
		return "College [collRegId=" + collRegId + ", collName=" + collName + ", collegeAddress=" + collegeAddress
				+ "]";
	}
	public College(int collRegId, String collName, Address collegeAddress) {

		this.collRegId = collRegId;
		this.collName = collName;
		this.collegeAddress = collegeAddress;
	}
	
	
}
