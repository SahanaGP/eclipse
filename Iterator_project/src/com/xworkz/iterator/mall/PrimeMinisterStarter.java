package com.xworkz.iterator.mall;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrimeMinisterStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<String> pm=new ArrayList<String>();
		
		pm.add("Jawaharlal Nehru");
 	    pm.add("Narendra Modi");
 		pm.add("Lal Bahadur Shastri");
 		pm.add("Indira Gandhi");
 		pm.add("Charan Singh");

 		
 		for(String element:pm)
 		{
 			System.out.println(element);
 		}
 		
 		System.out.println("-------------------------------------------------------");

	
 		pm.forEach((e)->System.out.println(e));
 		
 		System.out.println("-------------------------------------------------------");

 		ListIterator<String> itr=pm.listIterator();
 		while(itr.hasNext())
 		{
 			String element=itr.next();
 			System.out.println(element);
 		}
 		
 		System.out.println("-------------------------------------------------------");

 		ListIterator<String> itr1=pm.listIterator(pm.size());
 		while(itr1.hasPrevious())
 		{
 			String element1=itr1.previous();
 			System.out.println(element1);
 		}
 		
 		System.out.println(pm.size());
 		
 		System.out.println("-------------------------------------------------------");

 		ListIterator<String> itr2=pm.listIterator(3);
 		while(itr2.hasPrevious())
 		{
 			String element2=itr2.previous();
 			System.out.println(element2);
 		}
 		
 		System.out.println("-------------------------------------------------------");
 		
 		for(int i=0;i<pm.size();i++)
 		{
 			String element=pm.get(i);
 			System.out.println(element);
 	 		
 		}
 		
	}

}
