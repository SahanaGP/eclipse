package com.xworkz.state.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.city.dao.DBUtil;
import com.xworkz.state.dto.StateDTO;


public class StateDAO {

	Connection mysql=null;
	
	public boolean save(StateDTO stateDTO)
	{
		
	
		try {
			mysql=DBUtil.createConnection();
			
					String sql="insert into state_details values(?,?,?,?)";
					PreparedStatement stat=mysql.prepareStatement(sql);
					stat.setObject(1, stateDTO.getsId());
					stat.setObject(2, stateDTO.getsName());
					stat.setObject(3, stateDTO.getsCode());
					stat.setObject(4, stateDTO.getsCapital());
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
	
	public boolean deleteById(int sId) {
	
	
	try {
		mysql=DBUtil.createConnection();
		
				String sql="delete from state_details where sid=?";
				
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1, sId);
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
			
			
			String sql="select * from state_details where sid=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, id);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object sid=result.getObject(1);
				System.out.println("State_id- "+sid);
				Object sname=result.getObject(2);
				System.out.println("State_Name - "+sname);
				Object scode=result.getObject(3);
				System.out.println("State_Code - "+scode);
				Object scapital=result.getObject(4);
				System.out.println("State_Capital -"+scapital);
				
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
			
			
			String sql="select * from state_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				Object sid=result.getObject(1);
				Object sname=result.getObject(2);
				Object scode=result.getObject(3);
				Object scapital=result.getObject(4);
				System.out.println("State_id- "+sid+" "+"State_Name- "+sname+" "+"State_Code- "+scode+" "+"State_Capital- "+scapital);
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
			

			String sql="select count(*) from state_details";
			PreparedStatement stat=mysql.prepareStatement(sql);
			ResultSet result=stat.executeQuery();
			result.next();
			int count=result.getInt(1);
			System.out.println("No of rows in state_details table - "+count);
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
			
		
	}

}
