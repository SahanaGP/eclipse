package com.xworkz.icecream.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.festival.dao.FestivalConstants;
import com.xworkz.icecream.dto.IceCreamDTO;

public class IceCreamDAO {

	public boolean save(IceCreamDTO iceCreamDTO)
	{
		Connection mysql=null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			 mysql = DriverManager.getConnection(FestivalConstants.URL,FestivalConstants.USERNAME,FestivalConstants.PASSWORD);
				if(!mysql.isClosed()) {
					System.out.println("mqsql database is open");
					String sql="insert into icecream_details values("+iceCreamDTO.getCreamId()+",'"+iceCreamDTO.getcFlavour()+"','"+iceCreamDTO.getcName()+"',"+iceCreamDTO.getcPrice()+")";
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
	
	public boolean deleteById(int creamId) {
	Connection mysql=null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		 mysql = DriverManager.getConnection(FestivalConstants.URL,FestivalConstants.USERNAME,FestivalConstants.PASSWORD);
			if(!mysql.isClosed()) {
				System.out.println("mqsql database is open");
				String sql="delete from icecream_details where cream_id="+creamId;
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
