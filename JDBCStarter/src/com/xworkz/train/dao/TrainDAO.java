package com.xworkz.train.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.city.dao.DBUtil;
import com.xworkz.train.dto.TrainDTO;



public class TrainDAO {

	Connection mysql=null;
	public boolean save(TrainDTO trainDTO)
	{
		
	
		try {
			mysql=DBUtil.createConnection();
			
			String sql="insert into train_detailsss values(?,?,?,?,?,?,?,?)";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1, trainDTO.getTrainID());
			stat.setObject(2, trainDTO.getTrainNo());
			stat.setObject(3, trainDTO.getBoardingTime());
			stat.setObject(4, trainDTO.getDestinationTime());
			stat.setObject(5, trainDTO.getSeatNo());
			stat.setObject(6, trainDTO.getPrice());
			stat.setObject(7, trainDTO.getClassName());
			stat.setObject(8, trainDTO.getName());
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
	
	
	public boolean deleteByTrainNo(int trainNo) {
		
		mysql=DBUtil.createConnection();
	
	try {
		
				System.out.println("mqsql database is open");
				String sql="delete from train_detailsss where trainno=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1,trainNo);
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
	
	
public boolean deleteByTrainNoAndId(int trainNo,int trainId) {
		
		mysql=DBUtil.createConnection();
	
	try {
		
				System.out.println("mqsql database is open");
				String sql="delete from train_detailsss where trainno=? && trainid=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1,trainNo);
				stat.setObject(2,trainId);
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

public  TrainDTO getByTrainNo(int trainNo)
	{
		mysql=DBUtil.createConnection();
		TrainDTO dtooo=null;
		try {
			
			
			String sql="select * from train_detailsss where trainno=?";
			PreparedStatement stat=mysql.prepareStatement(sql);
			stat.setObject(1,trainNo);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				int trainid=result.getInt(1);
				System.out.println("Train id-"+trainid);
				int trainno=result.getInt(2);
				System.out.println("Train no-"+trainno);
				float boardingtime=result.getFloat(3);
				System.out.println("Boarding time-"+boardingtime);
				float destinationtime=result.getFloat(4);
				System.out.println("Destination time-"+destinationtime);		
				int seatno=result.getInt(5);
				System.out.println("Seat no-"+seatno);
				double price=result.getDouble(6);
				System.out.println("Price-"+price);
				String classname=result.getString(7);
				System.out.println("Class name-"+classname);
				String trainname=result.getString(8);
				System.out.println("Train name-"+trainname);
				
				dtooo=new TrainDTO(trainid,trainno,boardingtime,destinationtime,seatno,price,classname,trainname);
				return dtooo;
			}
			
			
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBUtil.closeConnection(mysql);
		}
		return null;
			
		}



public Collection<TrainDTO> getAll()
	 {
			mysql=DBUtil.createConnection();
			Collection<TrainDTO> details=new ArrayList<TrainDTO>();
			TrainDTO dtooo=new TrainDTO();
			
				try {
					
					
					String sql="select * from train_detailsss";
					PreparedStatement stat=mysql.prepareStatement(sql);
					ResultSet result=stat.executeQuery();
					while(result.next())
					{
						int trainid=result.getInt(1);
						int trainno=result.getInt(2);
						float boardingtime=result.getFloat(3);
						float destinationtime=result.getFloat(4);		
						int seatno=result.getInt(5);
						double price=result.getDouble(6);
						String classname=result.getString(7);
						String trainname=result.getString(8);
						
						dtooo.setTrainID(trainid);
						dtooo.setTrainNo(trainno);
						dtooo.setBoardingTime(boardingtime);
						dtooo.setDestinationTime(destinationtime);
						dtooo.setSeatNo(seatno);
						dtooo.setPrice(price);
						dtooo.setClassName(classname);
						dtooo.setName(trainname);
						
						details.add(dtooo);
						
						System.out.println("Train id-"+trainid+"Train no-"+trainno+"Boarding time-"+boardingtime+"Destination time-"+destinationtime
								+"Seat no-"+seatno+"Price-"+price+"Class name-"+classname+"Train name-"+trainname);
					}
					
				}  catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				finally {
					DBUtil.closeConnection(mysql);
				}
					
				
			

	return details;
}

public Collection<TrainDTO> getAllByBoardingTime(float boardingTime)
{
		mysql=DBUtil.createConnection();
		Collection<TrainDTO> details=new ArrayList<TrainDTO>();
		TrainDTO dtooo=new TrainDTO();
		
			try {
				
				
				String sql="select * from train_detailsss where boardingtime=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1,boardingTime);
				ResultSet result=stat.executeQuery();
				while(result.next())
				{
					int trainid=result.getInt(1);
					int trainno=result.getInt(2);
					float boardingtime=result.getFloat(3);
					float destinationtime=result.getFloat(4);		
					int seatno=result.getInt(5);
					double price=result.getDouble(6);
					String classname=result.getString(7);
					String trainname=result.getString(8);
					
					dtooo.setTrainID(trainid);
					dtooo.setTrainNo(trainno);
					dtooo.setBoardingTime(boardingtime);
					dtooo.setDestinationTime(destinationtime);
					dtooo.setSeatNo(seatno);
					dtooo.setPrice(price);
					dtooo.setClassName(classname);
					dtooo.setName(trainname);
					
					details.add(dtooo);
					
					System.out.println("Train id-"+trainid+"Train no-"+trainno+"Boarding time-"+boardingtime+"Destination time-"+destinationtime
							+"Seat no-"+seatno+"Price-"+price+"Class name-"+classname+"Train name-"+trainname);
				}
				
			}  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
				DBUtil.closeConnection(mysql);
			}
				
			
		

return details;
}

public Collection<TrainDTO> getAllByDestinationTime(float destinationTime)
{
		mysql=DBUtil.createConnection();
		Collection<TrainDTO> details=new ArrayList<TrainDTO>();
		TrainDTO dtooo=new TrainDTO();
		
			try {
				
				
				String sql="select * from train_detailsss where destinationtime=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1,destinationTime);
				ResultSet result=stat.executeQuery();
				while(result.next())
				{
					int trainid=result.getInt(1);
					int trainno=result.getInt(2);
					float boardingtime=result.getFloat(3);
					float destinationtime=result.getFloat(4);		
					int seatno=result.getInt(5);
					double price=result.getDouble(6);
					String classname=result.getString(7);
					String trainname=result.getString(8);
					
					dtooo.setTrainID(trainid);
					dtooo.setTrainNo(trainno);
					dtooo.setBoardingTime(boardingtime);
					dtooo.setDestinationTime(destinationtime);
					dtooo.setSeatNo(seatno);
					dtooo.setPrice(price);
					dtooo.setClassName(classname);
					dtooo.setName(trainname);
					
					details.add(dtooo);
					
					System.out.println("Train id-"+trainid+"Train no-"+trainno+"Boarding time-"+boardingtime+"Destination time-"+destinationtime
							+"Seat no-"+seatno+"Price-"+price+"Class name-"+classname+"Train name-"+trainname);
				}
				
			}  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
				DBUtil.closeConnection(mysql);
			}
					

return details;
}

 public boolean updateDestinationByTrainNo(float newDestinationTime,int trainNo) {
		
		mysql=DBUtil.createConnection();
	
	try {
		
				System.out.println("mqsql database is open");
				String sql="update train_detailsss set destinationtime=? where trainno=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1,newDestinationTime);
				stat.setObject(2,trainNo);
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

 
 public boolean updateDestinationAndBoardingByTrainNo(float newDestinationTime,float newBoardingTime,int trainNo) {
		
		mysql=DBUtil.createConnection();
	
	try {
		
				System.out.println("mqsql database is open");
				String sql="update train_detailsss set destinationtime=? && boardingtime=? where trainno=?";
				PreparedStatement stat=mysql.prepareStatement(sql);
				stat.setObject(1,newDestinationTime);
				stat.setObject(2,newBoardingTime);
				stat.setObject(3,trainNo);
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
 
 public int getTotal()
 {
 	mysql=DBUtil.createConnection();

 	try {


 		String sql="select count(*) from train_detailsss";
 		PreparedStatement stat=mysql.prepareStatement(sql);
 		ResultSet result=stat.executeQuery();
 		result.next();
 		int count=result.getInt(1);
 		System.out.println("No of rows in train_detailsss table - "+count);
 		return count;


 	}  catch (SQLException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}

 	finally {
 		DBUtil.closeConnection(mysql);
 	}
 	return 0;
 }

 public double getMaxPrice()
 {
 	mysql=DBUtil.createConnection();
 	double maxPrice=0;

 try {


 		String sql="select max(price) from train_detailsss";
 		PreparedStatement stat=mysql.prepareStatement(sql);
 		ResultSet result=stat.executeQuery();
 		while(result.next())
 		{
 			 maxPrice=result.getDouble(1);
 			System.out.println("MaxPrice= "+maxPrice);
 		}



 	}  catch (SQLException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}

 	finally {
 		DBUtil.closeConnection(mysql);
 	}

 	return maxPrice;
 }

 public double getMinPrice()
 {
 	mysql=DBUtil.createConnection();
 	double minPrice=0;

 try {


 		String sql="select min(price) from train_detailsss";
 		PreparedStatement stat=mysql.prepareStatement(sql);
 		ResultSet result=stat.executeQuery();
 		while(result.next())
 		{
 			 minPrice=result.getDouble(1);
 			System.out.println("MinPrice= "+minPrice);
 		}



 	}  catch (SQLException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}

 	finally {
 		DBUtil.closeConnection(mysql);
 	}

 	return minPrice;
 }


}


