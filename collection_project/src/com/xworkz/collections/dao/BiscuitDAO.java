package com.xworkz.collections.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BiscuitDAO {

	private Collection<String> biscuitdaos=new ArrayList<String>();

	public BiscuitDAO()
	{
		this.biscuitdaos.add("Dark Fantasy");
		this.biscuitdaos.add("Oreo");
		this.biscuitdaos.add("Parle-G");
		this.biscuitdaos.add("Krack-jack");
		this.biscuitdaos.add("Bourbon");
		this.biscuitdaos.add("Good-day");
		this.biscuitdaos.add("Hide-and-seek");
		this.biscuitdaos.add("50-50");

	}
 public boolean find(StringMatch search,String value)
 {
	 Iterator<String> itr=biscuitdaos.iterator();
	 while(itr.hasNext())
	 {
	String element=(String)itr.next();
	if(search.evaluate(element,value))
	{
		return true;
	}


	 }
	 return false;
 }
}

