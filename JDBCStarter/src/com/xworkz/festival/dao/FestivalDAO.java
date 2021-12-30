package com.xworkz.festival.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.city.dao.DBUtil;
import com.xworkz.festival.dto.FestivalDTO;


public class FestivalDAO {

	Connection mysql=null;
	public boolean save(FestivalDTO festivalDTO)
	{
		
	
		try {
			
			
			mysql=DBUtil.createConnection();
			 
					String sql="insert into festival_details values(?,?,?,?)";
					PreparedStatement stat=mysql.prepareStatement(sql);
					stat.setObject(1, festivalDTO.getFid());
					stat.setObject(2, festivalDTO.getFname());
					stat.setObject(3, festivalDTO.getFdate());
					stat.setObject(4, festivalDTO.getFstate());
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
	
	public boolean deleteById(int fid) {
	Connection mysql=null;
	
	try {

		mysql=DBUtil.createConnection();
		
				String sql="delete from festival_details where fid=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1, fid);
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
			
			
			String sql="select * from festival_details where fid=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object fid=result.getObject(1);
				System.out.println("Festival_id- "+fid);
				Object fname=result.getObject(2);
				System.out.println("Festival_Name - "+fname);
				Object fdate=result.getObject(3);
				System.out.println("Festival_Date - "+fdate);
				Object fstate=result.getObject(4);
				System.out.println("Festival_State -"+fstate);
				
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
			
			
			String sql="select * from festival_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object fid=result.getObject(1);
				Object fname=result.getObject(2);
				Object fdate=result.getObject(3);
				Object fstate=result.getObject(4);
				System.out.println("Festival_id- "+fid+" "+"Festival_Name- "+fname+" "+"Festival_Date- "+fdate+" "+"Festival_State- "+fstate);
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
			
	
			String sql="select count(*) from festival_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			result.next();
			int count=result.getInt(1);
			System.out.println("No of rows in festival_details table - "+count);
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
	}
	
		
	

	
}



