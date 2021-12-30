package com.xworkz.country.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.city.dao.DBUtil;
import com.xworkz.country.dto.CountryDTO;


public class CountryDAO {
	
	Connection mysql=null;
	
	public boolean save(CountryDTO countryDTO)
	{
	
		try {
			
			mysql=DBUtil.createConnection();
			
			
			// mysql = DriverManager.getConnection(FestivalConstants.URL,FestivalConstants.USERNAME,FestivalConstants.PASSWORD);
				//if(!mysql.isClosed()) {
				//	System.out.println("mqsql database is open");
			
					String sql="insert into country_details values(?,?,?,?)";
					//Statement statement=mysql.createStatement();
					PreparedStatement stat=mysql.prepareStatement(sql);
					stat.setObject(1, countryDTO.getcId());
					stat.setObject(2, countryDTO.getcName());
					stat.setObject(3, countryDTO.getcCode());
					stat.setObject(4, countryDTO.getContinents());
					int rowsAffected=stat.executeUpdate();
					System.out.println(sql);
					System.out.println("Formatted output : "+rowsAffected);
					if(rowsAffected==1) {
						return true;
					}
					
					
				}
				 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					DBUtil.closeConnection(mysql);
				}
				
				return false;
			}
					
	
	public boolean deleteOperation(int cId) {
	
	mysql=DBUtil.createConnection();
	
	try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		
	
				String sql="delete from country_details where cid = ?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1, cId);
				int rowsAffected=stat.executeUpdate();
				System.out.println("Formatted output : "+rowsAffected);
				if(rowsAffected==1) {
					return true;
				}
			}  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
				DBUtil.closeConnection(mysql);
			}
				
			return false;
			
			}
	
	public void readOperationById(int id)
	{
		mysql=DBUtil.createConnection();
		
		try {
			
			
			String sql="select * from country_details where cid=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object cid=result.getObject(1);
				System.out.println("Country_id- "+id);
				Object cname=result.getObject(2);
				System.out.println("Country_Name - "+cname);
				Object ccode=result.getObject(3);
				System.out.println("Country_code - "+ccode);
				Object continents=result.getObject(4);
				System.out.println("Country_Continent -"+continents);
				
			}
			//stat.setObject(1, id);
			//int rowsAffected=stat.executeUpdate();
			//System.out.println("Formatted output : "+rowsAffected);
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
		
		
		
		
	}
	
	public void displayAll()
	{
		mysql=DBUtil.createConnection();
		
		try {
			
			
			String sql="select * from country_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object cid=result.getObject(1);
				Object cname=result.getObject(2);
				Object ccode=result.getObject(3);
				Object continents=result.getObject(4);
				System.out.println("Country_id- "+cid+" "+"Country_Name- "+cname+" "+"Country_code- "+ccode+" "+"country_continent- "+continents);
			}
			//stat.setObject(1, id);
			//int rowsAffected=stat.executeUpdate();
			//System.out.println("Formatted output : "+rowsAffected);
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
		
		
		
		
	}
	
	public void displayTotalRows()
	{
    mysql=DBUtil.createConnection();
		
		try {
			
	
			String sql="select count(*) from country_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			result.next();
			int count=result.getInt(1);
			System.out.println("No of rows in country_details table - "+count);
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
	}
	
		
	

	
}
