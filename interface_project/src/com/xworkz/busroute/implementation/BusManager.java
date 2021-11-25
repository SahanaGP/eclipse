package com.xworkz.busroute.implementation;

import com.xworkz.interfaceexamples.dto.BusRouteDTO;
import com.xworkz.interfaceexamples.dao.BusRouteDAO;

public class BusManager {

	private BusRouteDAO dao;

	public BusManager(BusRouteDAO dao)
	{
		this.dao=dao;
		System.out.println("Invoked BusRouteManager constructor");
	}

	public void saveRoute(BusRouteDTO dto)
	{
		if(this.dao!=null && dto!=null )
		{
			dao.save(dto);
		}
		else
		{
			System.out.println("dto or dao cannot be null");
		}
	}

	public void findRoute(String destination)
	{
		if(this.dao!=null && destination!=null)
		{
			dao.findByDestination(destination);
		}

		else
		{
			System.out.println(" dao or destination cannot be null");
		}
	}

	public void displayRoute()
	{
		if(this.dao!=null)
		{
			dao.displayDetails();
		}
		else
		{
			System.out.println("  dao cannot be null");
		}
	}


}

