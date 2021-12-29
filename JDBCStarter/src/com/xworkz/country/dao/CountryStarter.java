package com.xworkz.country.dao;

import com.xworkz.country.dto.CountryDTO;

public class CountryStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountryDTO dto=new CountryDTO(1,"India",91,"Asia");
		CountryDTO dto1=new CountryDTO(2,"China",86,"Asia");
		CountryDTO dto2=new CountryDTO(3,"London",020,"Europe");
		CountryDTO dto3=new CountryDTO(4,"Nigeria",234,"Africa");
		CountryDTO dto4=new CountryDTO(5,"Brazil",55,"South America");
		
				
		CountryDAO dao=new CountryDAO();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		
		
		CountryDAO dao1=new CountryDAO();
        dao1.deleteById(4);
		
	}

}


