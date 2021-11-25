package com.xworkz.interfaceexamples.dao;

import com.xworkz.interfaceexamples.dto.BusRouteDTO;

public interface BusRouteDAO {

	public  BusRouteDTO[] busRouteDTO = new BusRouteDTO[3];
	
	public void save(BusRouteDTO busdto);
	
	public void findByDestination(String name);
	
	public void displayDetails();
}
