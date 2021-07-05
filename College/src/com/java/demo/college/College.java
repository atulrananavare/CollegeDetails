package com.java.demo.college;

import java.util.Arrays;

public class College {
		private String collegeRegId;
		private String collegeName;
		private Address collegeAddress;
		private Dept []collegeDept;
		public College(String collegeRegId, String collegeName, Address collegeAddress, Dept[] collegeDept) {
			super();
			this.collegeRegId = collegeRegId;
			this.collegeName = collegeName;
			this.collegeAddress = collegeAddress;
			this.collegeDept = collegeDept;
		}
		@Override
		public String toString() {
			return "College [collegeRegId=" + collegeRegId + ", collegeName=" + collegeName + ", collegeAddress="
					+ collegeAddress + ", collegeDept=" + Arrays.toString(collegeDept) + "]";
		}
		public String getCollegeRegId() {
			return collegeRegId;
		}
		public void setCollegeRegId(String collegeRegId) {
			this.collegeRegId = collegeRegId;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public Address getCollegeAddress() {
			return collegeAddress;
		}
		public void setCollegeAddress(Address collegeAddress) {
			this.collegeAddress = collegeAddress;
		}
		public Dept[] getCollegeDept() {
			return collegeDept;
		}
		public void setCollegeDept(Dept[] collegeDept) {
			this.collegeDept = collegeDept;
		}
		public College() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
