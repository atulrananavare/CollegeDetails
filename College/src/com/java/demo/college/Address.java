package com.java.demo.college;


//every class cha parent-- Object class -> toString
public class Address {
	private int pincode;
	private String city;
	private String state;
	private String nearestLandMark;
	
	
	
	
	public Address() {
	}

	public Address(int pincode, String city, String state, String nearestLandMark) {
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.nearestLandMark = nearestLandMark;
	}
	
	// to restrict -- access to the instance fields -->  direct value assignement-->as long as-->setter/getter
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNearestLandMark() {
		return nearestLandMark;
	}
	public void setNearestLandMark(String nearestLandMark) {
		this.nearestLandMark = nearestLandMark;
	}
	
	
	@Override
	public String toString() {
		return "\nAddress [pincode=" + pincode + ", city=" + city + ", state=" + state + ", nearestLandMark="
				+ nearestLandMark + "]";
	}
	
	
	
	
	
	
	
}
