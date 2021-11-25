package com.xworkz.busroute.implementation;

import com.xworkz.interfaceexamples.dto.BusRouteDTO;
import com.xworkz.interfaceexamples.dao.BusRouteDAO;

public class BusRoute implements BusRouteDAO{

	private BusRouteDTO[] busRouteDTO=new BusRouteDTO[3];
	private int index=0;
	
	public BusRoute()
	{
		System.out.println("invoking bus route");
	}
	

	public void save(BusRouteDTO busdto)
	{
		if(busdto!=null && this.index<this.busRouteDTO.length)
		{
			this.busRouteDTO[index]=busdto;
			System.out.println("bus route is saved"+index);
			System.out.println("ID - "+busdto.getId());
			System.out.println("Start point- "+busdto.getStartPoint());
			System.out.println("Destination- "+busdto.getDestination());
			System.out.println("Driver name- "+busdto.getDriverName());
			this.index++;
    	}
		else
		{
			System.err.println("bus route is full");
		}
		
	}
	
	public void findByDestination(String name)
	{
		if(name!=null)
		{
			for(int count=0;count<this.busRouteDTO.length;count++)
			{
				BusRouteDTO dto=this.busRouteDTO[count];
				
				if (dto!=null) {
					
				String destination=dto.getDestination();
				
				if(name.equals(destination))
				{
					System.out.println(name+"Destination name is same"+count);
				}
				else
				{
					System.err.println("Destination name is not same");
				}
			}
		else
		{
			System.err.println("bus route dto can't be null");
		}
	}
}
		else
		{
			System.err.println("name that we pass can't be null");
		}
	}
	
	public void displayDetails()
	{
		for(int key=0;key<this.busRouteDTO.length;key++)
		{
			BusRouteDTO contents=busRouteDTO[key];

			if(contents!=null)
			{
				int id=contents.getId();
				String startPoint=contents.getStartPoint();
				String destination=contents.getDestination();
				String driver=contents.getDriverName();

				System.out.println("ID "+id);
				System.out.println("Start Point "+startPoint);
				System.out.println("Destination "+destination);
				System.out.println("driver name  "+driver);
			}
		}

	}



}
		
	
		
	
