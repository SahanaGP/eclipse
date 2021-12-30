
public class Id {

	package com.xworkz.drone.dao;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import com.xworkz.drone.dto.CountryDTO;
	import com.xworkz.stat.utils.DBUtil;

	public class CountryDAO {
		Connection mysql=null;
		public boolean save(CountryDTO dto)
		{
			
			mysql=DBUtil.createConnection();
			
			try {
				//Book_Id,Book_Name,Author_Name,Book_Price,Publish_Year
				String sql="insert into Country_detailss values(?,?,?,?)";
				//java.sql.Statement stat=mysql.createStatement();
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1, dto.getCid());
				stat.setObject(2, dto.getcName());
				stat.setObject(3, dto.getcCode());
				stat.setObject(4, dto.getContinent());
				int rowsAffected=stat.executeUpdate();
				System.out.println(sql);
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

		public boolean deleteOperation(int id)
		{
			mysql=DBUtil.createConnection();
			
			try {
				
		
				String sql="delete from Country_detailss where country_id=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1, id);
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
				
				
				String sql="select * from Country_detailss where country_id=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1, id);
				ResultSet result=stat.executeQuery();
				while(result.next())
				{
					Object country_id=result.getObject(1);
					System.out.println("Country_id- "+country_id);
					Object country_name=result.getObject(2);
					System.out.println("Country_Name - "+country_name);
					Object country_code=result.getObject(3);
					System.out.println("Country_code - "+country_code);
					Object country_Continent=result.getObject(4);
					System.out.println("Country_Continent -"+country_Continent);
					
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
				
				
				String sql="select * from Country_detailss";
				PreparedStatement stat=mysql.prepareStatement(sql);
				ResultSet result=stat.executeQuery();
				while(result.next())
				{
					Object country_id=result.getObject(1);
					Object country_name=result.getObject(2);
					Object country_code=result.getObject(3);
					Object country_Continent=result.getObject(4);
					System.out.println("Country_id- "+country_id+" "+"Country_Name- "+country_name+" "+"Country_code- "+country_code+" "+"country_continent- "+country_Continent);
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
				
		
				String sql="select count(*) from Country_detailss";
				PreparedStatement stat=mysql.prepareStatement(sql);
				ResultSet result=stat.executeQuery();
				result.next();
				int count=result.getInt(1);
				System.out.println("No of rows in Country_detailss table - "+count);
				
				
			}  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
				DBUtil.closeConnection(mysql);
			}
				
			
		}
		
			
		

		
}
