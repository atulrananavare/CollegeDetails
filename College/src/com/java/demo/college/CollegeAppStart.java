package com.java.demo.college;


public class CollegeAppStart {
	
	public static void main(String[] args) {
		
		Address ad1 = new Address(11111,"Pune1","MH","Dmart1");
		Address ad2 = new Address(11112,"Pune2","MH","Dmart2");
		Address ad3 = new Address(11113,"Pune3","MH","Dmart3");
		Address ad4 = new Address(11114,"Pune4","MH","Dmart4");
		Address ad5 = new Address(11115,"Pune5","MH","Dmart5");
		Address ad6 = new Address(11116,"Pune6","MH","Dmart6");
		Address ad7 = new Address(99111,"PUNE","MH","XYZ Park");
		
		Dept computer = new Dept("CSE","Computer",101,null);
		Dept it = new Dept("IT","Information Tech",102,null);
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter STudent Name : ");
		String name = sc.next();*/
		Student st1 = new Student(101,"AAA",298333.44, ad1, computer,78,81,82);
		Student st2 = new Student(102,"BBBB",828333.44, ad2, it,78,48,56);
		Student st3 = new Student(103,"CCCC",278333.44, ad3, computer,56,88,34);
		Student st4 = new Student(104,"DDDD",258333.44, ad4, it,55,88,82);
		Student st5 = new Student(105,"EEEE",228333.44, ad5, computer,24,34,62);
		Student st6 = new Student(106,"FFFF",128333.44, ad6, it,78,56,42);

		Student compStudents[] = {st1,st3,st5};
		Student itStudents[] = {st2,st4,st6};
		
		computer.setStudent(compStudents);
		it.setStudent(itStudents);
		
		Dept [] depts = {computer,it};
		
		College college = new College("REG101","PICT", ad7, depts);
		
		System.out.println(college);
		
		//looping-->  for while dowhile swithc -- if return -->
		// find out topper
		// find out - dept wise topper
		// failed/ passed student -- college result --> avag mark --> avag -- math-
		
	
		
		
	}
}
