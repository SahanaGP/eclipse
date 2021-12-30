package com.xworkz.state.dao;

import com.xworkz.state.dto.StateDTO;

public class StateStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StateDTO dto=new StateDTO(1,"Karnataka",29,"Bangalore");
		StateDTO dto1=new StateDTO(2,"Kerala",32,"Thiruvananthapuram");
		StateDTO dto2=new StateDTO(3,"Madhya Pradesh",23,"Bhopal");
		StateDTO dto3=new StateDTO(4,"Assam",18,"Dispur");
		StateDTO dto4=new StateDTO(5,"Goa",30,"Panaji");
		
		
        StateDAO dao=new StateDAO();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		
		
		StateDAO dao1=new StateDAO();
        dao1.deleteById(4);
        
        StateDAO dao2=new StateDAO();
        dao2.readOperationById(2);
        
        StateDAO dao3=new StateDAO();
        dao3.displayAll();
        
        StateDAO dao4=new StateDAO();
        dao4.displayTotalRows();
		
	}

}


