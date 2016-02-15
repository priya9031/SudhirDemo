package com.scorer.main;

public class Test {
	
	String name;
	float salary;
	String address;
	String dob;
	
	void display()
	{
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("address: "+address);
		System.out.println("date of birth: "+dob);
	
	}
	
	public static void main(String arg[])
	{
		Test t1=new Test();
		t1.name="sudhir kumar";
		t1.salary=100000;
		t1.address="patel nagar, new delhi";
		t1.dob="21-03-1991";
		t1.display();
		
		
	}

}
