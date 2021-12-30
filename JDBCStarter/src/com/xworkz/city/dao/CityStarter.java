package com.xworkz.city.dao;

import com.xworkz.city.dto.CityDTO;

public class CityStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CityDTO dto=new CityDTO(1,"Bangalore",12.77f,"IT capital");
		CityDTO dto1=new CityDTO(2,"Mysore",1.23f,"Palace");
		CityDTO dto2=new CityDTO(3,"Mangalore",0.072f,"Beaches");
		CityDTO dto3=new CityDTO(4,"Davanagere",0.043f,"Benne Dosa");
		CityDTO dto4=new CityDTO(5,"Srirangapatna",0.025f,"Doll");
		
		
		CityDAO dao=new CityDAO();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		
		
		CityDAO dao1=new CityDAO();
        dao1.deleteOperation(3);
		
        
        CityDAO dao2=new CityDAO();
        dao2.readOperationById(4);
        
        CityDAO dao3=new CityDAO();
        dao3.displayAll();
        
        CityDAO dao4=new CityDAO();
		dao4.displayTotalRows();
	}

}
