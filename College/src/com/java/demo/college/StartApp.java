package com.java.demo.college;

public class StartApp {
	
	//this will be the starting point of an application
	public static void main(String[] args) {
		
		Product p1 = new Product(-190, -300);
		System.out.println(p1);
		
		p1.setProdPrice(-27);		// can u change the price --> Yes -- +ve
		
		System.out.println(p1);
		
		
		
		System.exit(0);
		Address ad1 = new Address();
		ad1.setPincode(1022);
		ad1.setState("MH");
		ad1.setCity("Mumbai");
		System.out.println(ad1);
		
		Address ad2 = new Address(11111,"Pune","MH",null);	// no-arg/default --> for object creation
		
		Address ob1 = new Address(11111,"Pune","MH","MacD");
		//callback methods --> tostring -->
		//System.out.println(ob1);// hexa decimal --> first of check karel-- Address class madhe -- not present-> object class-->
		//System.out.println(address.hashCode()); // hex to decimal conversion
		
		
		System.out.println(ob1.toString());// 
		
	}
}
//fully qualified name --> pacakgename + classname
// 0-9 A-F



