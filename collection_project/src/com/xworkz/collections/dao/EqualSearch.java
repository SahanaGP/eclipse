package com.xworkz.collections.dao;

public class EqualSearch implements StringMatch{

	public boolean evaluate(String element,String value)
	{
		System.out.println("Invoked evaluate for equals");		
		return element.equals(value);

	}



}


