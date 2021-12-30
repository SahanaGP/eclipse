package com.xworkz.city.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.festival.dao.FestivalConstants;

public class DBUtil {

	public static Connection createConnection()
	{
		Connection connection;
		try {
			connection = DriverManager.getConnection(FestivalConstants.URL,FestivalConstants.USERNAME,FestivalConstants.PASSWORD);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection)
	{
		if(connection!=null)
			try {
				
					connection.close();
					System.out.println("Closed the resource");
				
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}
}

