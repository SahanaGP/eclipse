package com.xworkz.jdbc.DAO;

import com.xworkz.jdbc.dto.peachmodeDTO;

public class peachmodeTester {

	public static void main(String[] args) {
		
		peachmodeDTO dto=new peachmodeDTO(25,"Avi","avi123@gmail.com",8456325689l,"Virajpet");
		
		//peachmodeDAO dao=new peachmodeDAO();
		//dao.save(dto);
		
		peachmodeDAO dao1=new peachmodeDAO();
       dao1.deleteById(22);
		
	}

}
