package com.xworkz.collections.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class BeerDAO {
	
	 private Collection<String> beerdaos=new ArrayList<String>();

	 	public BeerDAO()
	 	{
	 		this.beerdaos.add("KingFisher");
	 		this.beerdaos.add("Beera");
	 		this.beerdaos.add("Budweiser");
	 		this.beerdaos.add("Tuborgue");



	 	}
	  public boolean find(StringMatch search,String value)
	  {
	 	 Iterator<String> itr=beerdaos.iterator();
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






