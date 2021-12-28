package com.xworkz.db;

public class JDBCTester {

	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("After driver class is loaded and registered ");
		}
		catch(ClassNotFoundException e){
          e.printStackTrace();
		}
	}
}
