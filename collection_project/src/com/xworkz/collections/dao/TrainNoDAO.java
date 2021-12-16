package com.xworkz.collections.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TrainNoDAO
	{
		private Collection<String> trainnodao=new ArrayList<String>();

		{
		this.trainnodao.add("KA14553");
		this.trainnodao.add("UP67565");
		this.trainnodao.add("DF47899");
		this.trainnodao.add("FH24355");
		this.trainnodao.add("WE24356");


	}
 public boolean find(StringMatch search,String value)
 {
	 Iterator<String> itr=trainnodao.iterator();
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



