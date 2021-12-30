package com.xworkz.icecream.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.city.dao.DBUtil;
import com.xworkz.icecream.dto.IceCreamDTO;

public class IceCreamDAO {
	
	Connection mysql=null;
	

	public boolean save(IceCreamDTO iceCreamDTO)
	{
		
		try {
			mysql=DBUtil.createConnection();
			
					String sql="insert into icecream_details values(?,?,?,?)";
					PreparedStatement stat=mysql.prepareStatement(sql);
					stat.setObject(1, iceCreamDTO.getCreamId());
					stat.setObject(2, iceCreamDTO.getcFlavour());
					stat.setObject(3, iceCreamDTO.getcName());
					stat.setObject(4, iceCreamDTO.getcPrice());
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
	

public boolean deleteOperation(int Cid) {
Connection mysql=null;

try {

	mysql=DBUtil.createConnection();
	
			String sql="delete from icecream_details where cream_id=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, Cid);
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
		
		
		String sql="select * from icecream_details where cream_id=?";
		PreparedStatement stat=mysql.prepareStatement(sql);
		stat.setObject(1, id);
		ResultSet result=stat.executeQuery();
		while(result.next())
		{
			Object cream_id=result.getObject(1);
			System.out.println("IceCream_id- "+cream_id);
			Object cflavour=result.getObject(2);
			System.out.println("IceCream_Flavour - "+cflavour);
			Object cname=result.getObject(3);
			System.out.println("IceCream_Name - "+cname);
			Object cprice=result.getObject(4);
			System.out.println("IceCream_Price -"+cprice);
			
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
		
		
		String sql="select * from icecream_details";
		PreparedStatement stat=mysql.prepareStatement(sql);
		ResultSet result=stat.executeQuery();
		while(result.next())
		{
			Object cream_id=result.getObject(1);
			Object cflavour=result.getObject(2);
			Object cname=result.getObject(3);
			Object cprice=result.getObject(4);
			System.out.println("IceCream_id- "+cream_id+" "+"IceCream_flavour- "+cflavour+" "+"IceCream_Name- "+cname+" "+"IceCream_Price- "+cprice);
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
		

		String sql="select count(*) from icecream_details";
		PreparedStatement stat=mysql.prepareStatement(sql);
		ResultSet result=stat.executeQuery();
		result.next();
		int count=result.getInt(1);
		System.out.println("No of rows in icecream_details table - "+count);
		
		
	}  catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		DBUtil.closeConnection(mysql);
	}
		
	
}

	

}
				

