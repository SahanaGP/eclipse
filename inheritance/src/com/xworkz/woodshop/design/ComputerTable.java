package com.xworkz.woodshop.design;

public class ComputerTable extends Furniture {

	public String name = "Table";
	float price = 9000.00f;
	
	public ComputerTable()
	{
	super();
	System.out.println("invoking computer table no argument constructor");
	}
	
	public ComputerTable(String name,float price,int quantity)
	{
		super();
		super.name = name;
		super.price = price;
		super.quantity = quantity;
		System.out.println("invoking constructor");
		
		
	}
	}
	
