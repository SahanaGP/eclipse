package com.xworkz.country.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.country.dto.CountryDTO;
import com.xworkz.festival.dao.FestivalConstants;


public class CountryDAO {

	public boolean save(CountryDTO countryDTO)
	{
		Connection mysql=null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			 mysql = DriverManager.getConnection(FestivalConstants.URL,FestivalConstants.USERNAME,FestivalConstants.PASSWORD);
				if(!mysql.isClosed()) {
					System.out.println("mqsql database is open");
					String sql="insert into country_details values("+countryDTO.getcId()+",'"+countryDTO.getcName()+"',"+countryDTO.getcCode()+",'"+countryDTO.getContinents()+"')";
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
	
	public boolean deleteById(int cId) {
	Connection mysql=null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		 mysql = DriverManager.getConnection(FestivalConstants.URL,FestivalConstants.USERNAME,FestivalConstants.PASSWORD);
			if(!mysql.isClosed()) {
				System.out.println("mqsql database is open");
				String sql="delete from country_details where cid="+cId;
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
