package com.xworkz.city.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.city.dto.CityDTO;


public class CityDAO {

	Connection mysql=null;
	public boolean save(CityDTO cityDTO)
	{
		
	
		try {
			mysql=DBUtil.createConnection();
			
			String sql="insert into city_details values(?,?,?,?)";
			//Statement statement=mysql.createStatement();
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, cityDTO.getcId());
			stat.setObject(2, cityDTO.getcName());
			stat.setObject(3, cityDTO.getcPopulation());
			stat.setObject(4, cityDTO.getFamousFor());
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
		
				System.out.println("mqsql database is open");
				String sql="delete from city_details where cid=?";
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
   			
   			
   			String sql="select * from city_details where cid=?";
   			PreparedStatement stat=mysql.prepareStatement(sql);
   			stat.setObject(1, id);
   			ResultSet result=stat.executeQuery();
   			while(result.next())
   			{
   				Object cid=result.getObject(1);
   				System.out.println("City_id- "+id);
   				Object cname=result.getObject(2);
   				System.out.println("City_Name - "+cname);
   				Object cpopulation=result.getObject(3);
   				System.out.println("City_Population - "+cpopulation);
   				Object famousfor=result.getObject(4);
   				System.out.println("Country_Continent -"+famousfor);
   				
   			}
   			
   			
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
   			
   			
   			String sql="select * from city_details";
   			PreparedStatement stat=mysql.prepareStatement(sql);
   			ResultSet result=stat.executeQuery();
   			while(result.next())
   			{
   				Object cid=result.getObject(1);
   				Object cname=result.getObject(2);
   				Object cpopulation=result.getObject(3);
   				Object famousfor=result.getObject(4);
   				System.out.println("City_id- "+cid+" "+"City_Name- "+cname+" "+"City_Population- "+cpopulation+" "+"City_famousfor- "+famousfor);
   			}
   			
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
   			
   	
   			String sql="select count(*) from city_details";
   			PreparedStatement stat=mysql.prepareStatement(sql);
   			ResultSet result=stat.executeQuery();
   			result.next();
   			int count=result.getInt(1);
   			System.out.println("No of rows in city_details table - "+count);
   			
   			
   		}  catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		
   		finally {
   			DBUtil.closeConnection(mysql);
   		}
   			
   		
   	}
   	
   		
   	
}
