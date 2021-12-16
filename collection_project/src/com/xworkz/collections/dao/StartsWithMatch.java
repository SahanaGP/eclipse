package com.xworkz.collections.dao;

public class StartsWithMatch implements StringMatch 
{
	public boolean evaluate(String element,String value) {
		return element.toUpperCase().startsWith(value.toUpperCase());
	}


}

