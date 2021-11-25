package com.xworkz.interfaceexamples.dto;

public class BusRouteDTO {

	private int id;
	private String startPoint;
	private String destination;
	private String driverName;
	
	public BusRouteDTO()
	{
		System.out.println("invoking busroute dto");
	}
	
	public BusRouteDTO(int id,String startPoint,String destination,String driverName)
	{
		super();
		
		this.id=id;
		this.startPoint=startPoint;
		this.destination=destination;
		this.driverName=driverName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	
}
