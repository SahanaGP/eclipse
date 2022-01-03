package com.xworkz.train.dao;


import java.util.Collection;

import com.xworkz.train.dto.TrainDTO;

public class TrainStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrainDTO dto1=new TrainDTO(1,014243,10.00f,05.30f,5,2000.00f,"AC","Mumbai Express");
		TrainDTO dto2=new TrainDTO(2,678890,06.15f,12.30f,2,1000.00f,"FC","Andhra Express");
		TrainDTO dto3=new TrainDTO(3,876857,09.00f,02.00f,45,1500.00f,"SL","Andaman Express");
		TrainDTO dto4=new TrainDTO(4,014256,10.45f,03.30f,50,800.00f,"2S","Chennai Express");
		TrainDTO dto5=new TrainDTO(5,014657,06.00f,11.30f,15,3000.00f,"AC","Amaravathi Express");
		TrainDTO dto6=new TrainDTO(6,014656,03.30f,10.30f,35,2500.00f,"SL","Arunachal Express");
		
		TrainDAO dao1=new TrainDAO();
		dao1.save(dto1);
		dao1.save(dto2);
		dao1.save(dto3);
		dao1.save(dto4);
		dao1.save(dto5);
		dao1.save(dto6);
		
		TrainDAO dao2=new TrainDAO();
		dao2.deleteByTrainNo(014656);
		
		TrainDAO dao3=new TrainDAO();
		dao3.deleteByTrainNoAndId(014657, 5);
		
		TrainDAO dao4=new TrainDAO();
		TrainDTO check=dao4.getByTrainNo(014243);
		System.out.println(check);

		Collection<TrainDTO> output=dao4.getAll();
		System.out.println(output);


		Collection<TrainDTO> res=dao4.getAllByBoardingTime(09.00f);
		System.out.println(res);


		Collection<TrainDTO> find=dao4.getAllByDestinationTime(12.30f);
		System.out.println(find);

        TrainDAO dao5=new TrainDAO();
        dao5.updateDestinationByTrainNo(05.00f,876857);
        dao5.updateDestinationAndBoardingByTrainNo(12.00f,09.00f, 014243);
        
        int total=dao5.getTotal();
		System.out.println(total);

		double max=dao5.getMaxPrice();
		System.out.println(max);

		double min=dao5.getMinPrice();
		System.out.println(min);
}
}	
