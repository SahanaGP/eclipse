package com.xworkz.busroute.starters;

import com.xworkz.interfaceexamples.dto.BusRouteDTO;
import com.xworkz.interfaceexamples.dao.BusRouteDAO;
import com.xworkz.busroute.implementation.BusRoute;
import com.xworkz.busroute.implementation.BusManager;

public class BusRouteStarter {

	public static void main(String[] args) {

		BusRouteDAO daos=new BusRoute();

		BusRouteDTO dto1=new BusRouteDTO(1,"Mandya","Mysore","Raamu");
		BusRouteDTO dto2=new BusRouteDTO(2,"Bangalore","Kolar","Suresh");
		BusRouteDTO dto3=new BusRouteDTO(3,"K M Doddi","Kollegal","Raaju");
		daos.save(dto1);
		daos.save(dto2);
		daos.save(dto3);

		BusManager manager=new BusManager(daos);

		manager.saveRoute(dto3);
        manager.findRoute("Madikeri");
        manager.displayRoute();


	}

}

