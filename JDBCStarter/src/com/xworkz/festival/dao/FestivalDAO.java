package com.xworkz.festival.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.festival.dto.FestivalDTO;


public class FestivalDAO {

	public boolean save(FestivalDTO festivalDTO)
	{
		Connection mysql=null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			 mysql = DriverManager.getConnection(FestivalConstants.URL,FestivalConstants.USERNAME,FestivalConstants.PASSWORD);
				if(!mysql.isClosed()) {
					System.out.println("mqsql database is open");
					String sql="insert into festival_details values("+festivalDTO.getFid()+",'"+festivalDTO.getFname()+"',"+festivalDTO.getFdate()+",'"+festivalDTO.getFstate()+"')";
					Statement statement=mysql.createStatement();
					int rowsAffected=statement.executeUpdate(sql);
				System.out.println("No of rows affected:"+rowsAffected);
					if(rowsAffected == 1)
						return true;
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
					if(mysql!=null) {
						try {
							mysql.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
		return false;
	}
	
	public boolean deleteById(int fid) {
	Connection mysql=null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		 mysql = DriverManager.getConnection(FestivalConstants.URL,FestivalConstants.USERNAME,FestivalConstants.PASSWORD);
			if(!mysql.isClosed()) {
				System.out.println("mqsql database is open");
				String sql="delete from festival_details where fid="+fid;
				Statement statement=mysql.createStatement();
				int rowsAffected=statement.executeUpdate(sql);
			System.out.println("No of rows affected:"+rowsAffected);
				if(rowsAffected == 1)
					return true;
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
				if(mysql!=null) {
					try {
						mysql.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
	return false;
}
	
}



