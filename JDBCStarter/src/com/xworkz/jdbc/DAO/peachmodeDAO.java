package com.xworkz.jdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class peachmodeDAO {

	public boolean save(com.xworkz.jdbc.dto.peachmodeDTO peachmodeDTO)
	{
		Connection mysql=null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			 mysql = DriverManager.getConnection(peachmodeConstants.URL,peachmodeConstants.USERNAME,peachmodeConstants.PASSWORD);
				if(!mysql.isClosed()) {
					System.out.println("mqsql database is open");
					String sql="insert into customer_details values("+peachmodeDTO.getId()+",'"+peachmodeDTO.getName()+"','"+peachmodeDTO.getEmail()+"',"+peachmodeDTO.getPhone()+",'"+peachmodeDTO.getAddress()+"')";
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
	
	public boolean deleteById(int id) {
	Connection mysql=null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		 mysql = DriverManager.getConnection(peachmodeConstants.URL,peachmodeConstants.USERNAME,peachmodeConstants.PASSWORD);
			if(!mysql.isClosed()) {
				System.out.println("mqsql database is open");
				String sql="delete from customer_details where customer_id="+id;
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


