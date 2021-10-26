package com.xworkz.demo2;

public class Student {
     
	public static String name="Sahana";
	public static void branch()
	{
	    System.out.println("branch invoked");	
	}
	private int rollNumber=22;
	protected void collegeName()
	{
		System.out.println("NIEIT");
	}
	
	void studying()
	{
		System.out.println("Invoking Studying");
	}
	
	public static void main(String[] args)
	{
		Student stu=new Student();
		stu.collegeName();
		System.out.println(Student.name);
		Student.branch();
		System.out.println(stu.rollNumber);
	}
}
