package com.sinhgad.edu.students.details;

public class Address {
	String city;
	String state;
	int pincode;
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return " [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
