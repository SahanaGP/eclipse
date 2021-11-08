package com.xworkz.woodshops;

import com.xworkz.woodshop.design.ComputerTable;
import com.xworkz.woodshop.sell.DineTable;

public class FurnitureStarter {

	public static void main(String[] args) {
	
		ComputerTable computerTable=new ComputerTable("Hexagon",8000.00f,2);
		System.out.println(computerTable.name);
		System.out.println(computerTable.quantity);
		
		DineTable dine=new DineTable("Standard");
		System.out.println(dine.name);
	}

}


