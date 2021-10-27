package com.xworkz.vehicle;

public class VehicleClass {
	private String[] name=new String[6];
	private int count=0;
	
	public VehicleClass()
	{
		System.out.println("Invoking no-argument");
	}
	
	public void add(String vehicleBrandName)
	{
		System.out.println("Invoking add");
		
		if(vehicleBrandName!=null && this.count<this.name.length)
		{
			this.name[count]=vehicleBrandName;
			count++;
			System.out.println("Added brand".concat(vehicleBrandName));
		}
		else
		{
			System.err.println("Brand Name cannot be null");
		}
	}
	
	public void displayVehicleBrandNames()
	{
		System.out.println("Invoking displayVehicleBrandNames");
		for(int index=0;index<this.name.length;index++)
		{
			String ref=this.name[index];
			System.out.println(ref);
		}
	}


}
