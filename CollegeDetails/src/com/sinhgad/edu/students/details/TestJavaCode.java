package com.sinhgad.edu.students.details;

public class TestJavaCode {

	public static void main(String[] args) {
/*		//Student class details 
		Student st1= new Student(1, "ABC", new Address("Pune", "MH", 415101), new Dept(1245, "IT"), 12345.52);
		Student st2= new Student(2, "PQR", new Address("Mumbai", "MH", 400100), new Dept(124, "EC"), 456.20);

		System.out.println(st1);		//15db9742  --> hex to integer conversion -->366712642
		System.out.println(st1.hashCode());//hashCode --> hex [memory address for that object] to integer conversion
		System.out.println(st2.deptName);

		*/
		
		
		
		// Professor details
		
		Professor pf1= new Professor(1, "AAA", new Address("Kolhapur", "MH", 416101), new Dept(12, "IT"), 45000, 4);
		Professor pf2= new Professor(2, "BB", new Address("Karad", "MH", 416112), new Dept(12, "Mech"), 90000, 8);
		
		System.out.println(pf2);
		System.out.println(Professor.collName2);
		
	}

}
