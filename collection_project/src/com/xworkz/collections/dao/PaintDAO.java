package com.xworkz.collections.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PaintDAO {

	private Collection<String> beerdaos=new ArrayList<String>();

 	public PaintDAO()
 	{
 		this.beerdaos.add("Berger");
 		this.beerdaos.add("Dulux");
 		this.beerdaos.add("Asian");
 		this.beerdaos.add("Nippon");



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
