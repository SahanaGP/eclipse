package com.xworkz.iterator.mall;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MallStarter {

	public static void main(String[] args) {
		
		List<String> mall=new ArrayList<String>();
		
		mall.add("Mall of Mysore");
 		mall.add("Habitat");
 		mall.add("Orion");
 		mall.add("Garuda");
 		mall.add("Bangalore Central");

 		
 		for(String element:mall)
 		{
 			System.out.println(element);
 		}
 		
 		System.out.println("-------------------------------------------------------");

	
 		mall.forEach((e)->System.out.println(e));
 		
 		System.out.println("-------------------------------------------------------");

 		ListIterator<String> itr=mall.listIterator();
 		while(itr.hasNext())
 		{
 			String element=itr.next();
 			System.out.println(element);
 		}
 		
 		System.out.println("-------------------------------------------------------");

 		ListIterator<String> itr1=mall.listIterator(mall.size());
 		while(itr1.hasPrevious())
 		{
 			String element1=itr1.previous();
 			System.out.println(element1);
 		}
 		
 		System.out.println(mall.size());
 		
 		System.out.println("-------------------------------------------------------");

 		ListIterator<String> itr2=mall.listIterator(3);
 		while(itr2.hasPrevious())
 		{
 			String element2=itr2.previous();
 			System.out.println(element2);
 		}
 		
 		System.out.println("-------------------------------------------------------");
 		
 		for(int i=0;i<mall.size();i++)
 		{
 			String element=mall.get(i);
 			System.out.println(element);
 	 		
 		}
 		
	}

}
