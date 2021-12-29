package com.xworkz.icecream.dao;

import com.xworkz.icecream.dto.IceCreamDTO;

public class IceCreamStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IceCreamDTO dto=new IceCreamDTO(1,"Mango","Amul",100);
		IceCreamDTO dto1=new IceCreamDTO(2,"Badam","Kulfi",10);
		IceCreamDTO dto2=new IceCreamDTO(3,"Vanilla","Arun",20);
		IceCreamDTO dto3=new IceCreamDTO(4,"Strawberry","Havmor",200);
		IceCreamDTO dto4=new IceCreamDTO(5,"Chocolate","Cornito",30);
		
		IceCreamDAO dao=new IceCreamDAO();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		
		
		IceCreamDAO dao1=new IceCreamDAO();
        dao1.deleteById(4);
		
	}

}
