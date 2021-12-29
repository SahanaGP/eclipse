package com.xworkz.festival.dao;

import com.xworkz.festival.dto.FestivalDTO;

public class FestivalStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     FestivalDTO dto=new FestivalDTO(1,"Durga puja",1,"West Bengal");
     FestivalDTO dto1=new FestivalDTO(2,"Navaratri",22,"Gujarat");
     FestivalDTO dto2=new FestivalDTO(3,"Onam",11,"Kerala");
     FestivalDTO dto3=new FestivalDTO(4,"Pongal",13,"Tamilnadu");
     FestivalDTO dto4=new FestivalDTO(5,"Ugadi",10,"Karnataka");
     FestivalDTO dto5=new FestivalDTO(6,"Lohri",12,"Punjab");
		
     FestivalDAO dao=new FestivalDAO();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
		
		FestivalDAO dao1=new FestivalDAO();
       dao1.deleteById(1);
       
       
		
	}

	}


