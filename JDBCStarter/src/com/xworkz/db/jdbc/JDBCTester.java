package com.xworkz.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection mysql=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("After driver class is loaded and registered");
			
			//syntax ------- protocol:vendor://domain:portno/database
			
			String url="jdbc:mysql://localhost:3306/peachmode";
			String username="root";
			String password="Sahana@1999";
			
		 mysql = DriverManager.getConnection(url,username,password);
		if(!mysql.isClosed()) {
			System.out.println("mqsql database is open");
			String sql="insert into customer_details values(11,'Sudee','sudee1234@gmail.com','84563289666','mysore')";
			Statement statement=mysql.createStatement();
			int rowsAffected=statement.executeUpdate(sql);
			System.out.println("No of rows affected:"+rowsAffected);
			
		}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		//in order to close the resource
		finally {
			try {
				mysql.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
