package com.xworkz.woodshop.sell;

import com.xworkz.woodshop.design.Furniture;

public class DineTable extends Furniture {

	float price = 3356.587f;
	
	public DineTable(String name)
	{
		super();
		super.name = name;
		System.out.println("invoking dinetable");
		System.out.println(super.oilPainted);
	}
}
