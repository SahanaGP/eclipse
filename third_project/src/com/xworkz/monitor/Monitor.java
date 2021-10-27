package com.xworkz.monitor;

public class Monitor
{
	private String[] name=new String[10];
	private int count=0;
	
	public Monitor()
	{
		System.out.println("Invoking no-argument");
	}
	
	public void add(String brandName)
	{
		System.out.println("Invoking add");
		
		if(brandName!=null && this.count<this.name.length)
		{
			this.name[count]=brandName;
			count++;
			System.out.println("Added brand".concat(brandName));
		}
		else
		{
			System.err.println("Brand Name cannot be null");
		}
	}
	
	public void displayBrandNames()
	{
		System.out.println("Invoking displayBrandNames");
		for(int index=0;index<this.name.length;index++)
		{
			String ref=this.name[index];
			System.out.println(ref);
		}
	}

}
