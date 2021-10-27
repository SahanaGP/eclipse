package com.xworkz.helmet;

public class HelmetClass
{

	private String[] name=new String[6];
	private int count=0;
	
	public HelmetClass()
	{
		System.out.println("Invoking no-argument");
	}
	
	public void add(String helmetBrandName)
	{
		System.out.println("Invoking add");
		
		if(helmetBrandName!=null && this.count<this.name.length)
		{
			this.name[count]=helmetBrandName;
			count++;
			System.out.println("Added brand".concat(helmetBrandName));
		}
		else
		{
			System.err.println("Brand Name cannot be null");
		}
	}
	
	public void displayHelmetBrandNames()
	{
		System.out.println("Invoking displayHelmetBrandNames");
		for(int index=0;index<this.name.length;index++)
		{
			String ref=this.name[index];
			System.out.println(ref);
		}
	}

}
