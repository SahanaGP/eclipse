package com.xworkz.train.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.train.dto.TrainDTO;



public class TrainDAO {

	Connection mysql=null;
	public boolean save(TrainDTO trainDTO)
	{
		
	
		try {
			mysql=DBUtil.createConnection();
			
			String sql="insert into city_details values(?,?,?,?)";
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
}
